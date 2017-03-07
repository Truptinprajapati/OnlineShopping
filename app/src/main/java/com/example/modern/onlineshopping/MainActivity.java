package com.example.modern.onlineshopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final int time=2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread timerThread =new Thread()
        {
            public void run(){
                try{
                    sleep(2500);
                }
                catch (InterruptedException e){
                    e.printStackTrace();

                }
                finally {
                    Intent i=new Intent(MainActivity.this,Navigation.class);
                    startActivity(i);
                    finish();
                }
            }
        };

        timerThread.start();



    }
}
