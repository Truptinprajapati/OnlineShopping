package com.example.modern.onlineshopping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Lenovo on 23-02-2017.
 */

public class Navimen extends AppCompatActivity
{
    String[] mname={"Watches","Purse"};
    int[] mimg={R.drawable.boyswatches,R.drawable.boyspurse};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navimen);


        ListView men=(ListView)findViewById(R.id.men);

        Custommen list=new Custommen(this,mname,mimg);
        men.setAdapter(list);

    }
}
