package com.example.modern.onlineshopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Kitchen_dining extends AppCompatActivity {

    String[] kdiningname={"Table"};
    int[] kdiningimg={R.drawable.kitchendianingproduct};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navikitchen_dining);

        ListView kitchendin=(ListView)findViewById(R.id.kitchen_dining);

        CustomKitechendining adaptr=new CustomKitechendining(this,kdiningname,kdiningimg);
        kitchendin.setAdapter(adaptr);

    }
}
