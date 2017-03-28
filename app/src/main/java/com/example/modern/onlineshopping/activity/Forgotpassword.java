package com.example.modern.onlineshopping.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.modern.onlineshopping.R;

/**
 * Created by modern on 1/28/2017.
 */
public class Forgotpassword extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword);

        Button ok=(Button)findViewById(R.id.ok);
        Button cancle=(Button)findViewById(R.id.cancle);
        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Forgotpassword.this,Login.class);
                startActivity(i);
            }
        });
    }
}
