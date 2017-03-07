package com.example.modern.onlineshopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Navilighting extends AppCompatActivity {

    String[] lname={"Starlight"};
    int[] limg={R.drawable.lighthome};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navilighting);

        ListView light=(ListView)findViewById(R.id.lighting);

        Customhomelight adapter=new Customhomelight(this,lname,limg);
        light.setAdapter(adapter);

    }
}
