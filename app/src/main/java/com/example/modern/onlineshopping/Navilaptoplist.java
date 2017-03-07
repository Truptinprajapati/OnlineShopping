package com.example.modern.onlineshopping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Lenovo on 23-02-2017.
 */

public class Navilaptoplist extends AppCompatActivity {

    String[] laptoplist={"Asus","Pendrive","Lenovo"};
    int[] laptopimg={R.drawable.lap,R.drawable.pendrive,R.drawable.lenovo};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navilaptoplist);

        ListView lap=(ListView)findViewById(R.id.laplist);

        CustomAdapterlap adapter=new CustomAdapterlap(this,laptoplist,laptopimg);
        lap.setAdapter(adapter);


    }
}
