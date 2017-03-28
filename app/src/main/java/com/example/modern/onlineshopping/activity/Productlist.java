package com.example.modern.onlineshopping.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.example.modern.onlineshopping.AsyncTasks.AsyncResponse;
import com.example.modern.onlineshopping.AsyncTasks.WebserviceCall;
import com.example.modern.onlineshopping.R;
import com.example.modern.onlineshopping.customclass.Productlistadapter;
import com.example.modern.onlineshopping.pojo.Pojoproductlist;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class Productlist extends AppCompatActivity {
    String URL ="http://development.ifuturz.com/core/FLAT_TEST/ecart_new/admin/webservice.php";
    ListView productlista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productlist);


        Intent intent = getIntent();
        int pos=intent.getIntExtra("position",0);
Log.d("dj", String.valueOf(pos));
        {
            JSONObject object = new JSONObject();
            try {


                object.put("mode", "productList");
                object.put("cat_id",String.valueOf(pos));





            } catch (JSONException e) {
                e.printStackTrace();
            }
            String jsonRequest = String.valueOf(object);
            Log.d("myapp","Request: "+jsonRequest);

            new WebserviceCall(Productlist.this, URL, jsonRequest, "LOadding...", true, new AsyncResponse() {

                @Override
                public void onCallback(String response) {
                   List<Pojoproductlist.ProductListBean> productListBeen;
                    Log.d("tag", response);

                    Pojoproductlist li6st = new Gson().fromJson(response, Pojoproductlist.class);


                    if (li6st.getStatus() == 1) {

                        productListBeen = li6st.getProductList();

                         productlista = (ListView) findViewById(R.id.pdlist);
                        Productlistadapter adapter = new  Productlistadapter(Productlist.this, productListBeen);
                        productlista.setAdapter(adapter);


//
//                        Intent i = new Intent(Navigation.this,Login.class);
//                        startActivity(i);


                    }

                    Toast.makeText(getApplicationContext(), li6st.getMessage(), Toast.LENGTH_SHORT).show();
                }


            }).execute();


        }
    }}
