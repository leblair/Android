package com.example.api_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RequestQueue requestQueue;
    String url = "https://api-anime-m06.herokuapp.com/animes/";
    List<String> data;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestQueue = Volley.newRequestQueue(this);
        getApiData();
        lista = (ListView) findViewById(R.id.lst);

    }

    private void getApiData() {

        data = new ArrayList<>();
        JsonObjectRequest requestJson = new JsonObjectRequest(Request.Method.GET, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                ObjectApi objectApi = new ObjectApi();
                try {
                    //objectApi = (ObjectApi) response.get("result");
                    objectApi.setList(response.getJSONArray("result"));

                    for(int i=0;i<4;i++ ){ //6 y8
                        String str = objectApi.getList().get(i).toString();
                        String [] split = str.split(",");
                        str = split[1] + "\t" + split[2];
                        data.add(str);
                    }

                    ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, data);
                    lista.setAdapter(adapter);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                int x = 0;
            }
        });

        requestQueue.add(requestJson);
    }
}