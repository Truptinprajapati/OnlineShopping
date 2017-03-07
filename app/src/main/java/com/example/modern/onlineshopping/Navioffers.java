package com.example.modern.onlineshopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Navioffers extends AppCompatActivity {


    String[] offerpname={"Laptop","Mobile","Camera"};
    int[] offerspimg={R.drawable.lap,R.drawable.mobile,R.drawable.cemara};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navioffers);


        ListView offer=(ListView)findViewById(R.id.offers);
        Customoffer adapter=new Customoffer(this,offerpname,offerspimg);
        offer.setAdapter(adapter);
    }
}
