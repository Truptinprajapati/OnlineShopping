package com.example.modern.onlineshopping;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Lenovo on 23-02-2017.
 */

public class Navimoblist extends AppCompatActivity {

    String[] mname={"Redmi3sPrime","Lenovok5note"};
    int[] ming={R.drawable.mobile,R.drawable.lenovok5note};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navimoblist);

        ListView lv=(ListView)findViewById(R.id.moblist);

        CustomAdaptermob adapter=new CustomAdaptermob(this,mname,ming);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = parent.getItemAtPosition(position).toString();

                switch (position) {
                    case 0:
                        Intent i = new Intent(Navimoblist.this, Mobiledetails.class);
                        startActivity(i);
                        break;

                }
            }
        });




    }
}
