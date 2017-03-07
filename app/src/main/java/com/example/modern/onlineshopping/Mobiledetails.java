package com.example.modern.onlineshopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Mobiledetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobiledetails);
        TextView tv=(TextView)findViewById(R.id.mobdetails);
        tv.setText("Name: Redmi 3s Prime"+"\n"+"\n"
                +"Model: Xiaomi Redmi 3s(Redmi 3s)"+"\n"+"\n"
        +"Price: 8,999"+"\n"+"\n"
         +"Color: Black"+"\n"+"\n"
          +"RAM: 3gb"+"\n"+"\n"
           +"Battery: 4000mh"
        );
    }
}
