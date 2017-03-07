package com.example.modern.onlineshopping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Lenovo on 23-02-2017.
 */

public class Naviwomen extends AppCompatActivity
{
    String[] wlist={"Dress","Girlsbracelet","GirlsWatches"};
    int[] wimg={R.drawable.girlsdress,R.drawable.girlsbracelet,R.drawable.girlswatches};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.naviwomen);

        ListView  list=(ListView)findViewById(R.id.women);

        Customwomen adapter=new Customwomen (this,wlist,wimg);
        list.setAdapter(adapter);

    }
}
