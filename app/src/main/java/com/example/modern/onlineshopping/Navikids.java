package com.example.modern.onlineshopping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Lenovo on 23-02-2017.
 */

public class Navikids extends AppCompatActivity {
    String[] kidspname={"Kitchen","Color"};
    int[] kidspimag={R.drawable.kitchen,R.drawable.kidss};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navikids);

        ListView list=(ListView)findViewById(R.id.kids);

        Customkids adapter=new Customkids(this,kidspname,kidspimag);
        list.setAdapter(adapter);

    }
}
