package com.example.modern.onlineshopping.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.modern.onlineshopping.AsyncTasks.AsyncResponse;
import com.example.modern.onlineshopping.AsyncTasks.WebserviceCall;
import com.example.modern.onlineshopping.R;
import com.example.modern.onlineshopping.pojo.Pojoforgot;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

public class Searchcategory extends AppCompatActivity {
    String URL ="http://development.ifuturz.com/core/FLAT_TEST/ecart_new/admin/webservice.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);



        //String searchproduct[]={"Mobile","Laptop","Tablet","Kitechen","pendrive","Girlsdress","Girlsbracelet","GirlsWatches",
        //"Boyspurse","Boyswatches","Mobile Redmi3s prime","Mobile Lenovo K5 note","Laptop Asus","Laptop Lenovo",};

        //ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,searchproduct);

        final AutoCompleteTextView searcate=(AutoCompleteTextView)findViewById(R.id.searchcategory);
        //searcate.setAdapter(ad);


        //final String catesearch = searcate.getText().toString();


        ImageView sbutton=(ImageView)findViewById(R.id.searchbutton);
        sbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String catesearch = searcate.getText().toString();

                {JSONObject object = new JSONObject();
            try {
                object.put("mode","categorySearch");
                object.put("cat_search",catesearch);

            } catch (JSONException e) {
                e.printStackTrace();
            }
            String jsonRequest = String.valueOf(object);


                    new WebserviceCall(Searchcategory.this, URL, jsonRequest, "LOadding...", true, new AsyncResponse() {

                        @Override
                        public void onCallback(String response) {

                            Log.d("myapp",response);
                            Pojoforgot pf=new Gson().fromJson(response,Pojoforgot.class);
                            if (pf.getStatus()==1)
                            {
                                Log.d("myapp",pf.getMessage());


                                Intent i = new Intent(Searchcategory.this,Login.class);
                                startActivity(i);

                                Toast.makeText(getApplicationContext(),"suceess",Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(),"Try agin",Toast.LENGTH_SHORT).show();
                            }
                        }



                    }).execute();

                }




            }
        });

        }
    }










