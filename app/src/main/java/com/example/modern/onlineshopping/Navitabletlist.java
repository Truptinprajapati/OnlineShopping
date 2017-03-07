package com.example.modern.onlineshopping;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Lenovo on 23-02-2017.
 */

public class Navitabletlist extends AppCompatActivity
{
    String[] tname={"Tablet"};

    int[] timg={R.drawable.ntablet};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navitablet);

        ListView tlist=(ListView)findViewById(R.id.tablet);

        Customtablet tab=new Customtablet(this,tname,timg);
        tlist.setAdapter(tab);



    }
}
