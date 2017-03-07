package com.example.modern.onlineshopping;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.modern.onlineshopping.AsyncTasks.AsyncResponse;
import com.example.modern.onlineshopping.AsyncTasks.WebserviceCall;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by modern on 1/27/2017.
 */
public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

     final    EditText email=(EditText)findViewById(R.id.logemail);
      final   EditText pwd=(EditText)findViewById(R.id.logpwd);
        TextView lsignup=(TextView)findViewById(R.id.signup);
        TextView lforgotpwd=(TextView)findViewById(R.id.forgotpwd);
        Button login =(Button)findViewById(R.id.login);
       final View dialogView;
        final Context c;



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stremail=email.getText().toString();
                String strpwd=pwd.getText().toString();

                if (stremail.isEmpty())

                {
                    Toast.makeText(Login.this, "Email cannot be empty!", Toast.LENGTH_SHORT).show();

                } else if (strpwd.isEmpty())

                {
                    Toast.makeText(Login.this, "Password cannot be empty", Toast.LENGTH_SHORT).show();

                } else

                {JSONObject object = new JSONObject();
                    try {
                        object.put("email", stremail);
                        object.put("password", strpwd);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    String jsonRequest = String.valueOf(object);

                    String URL = "http://www.vnurture.in/pro/login.php";
                    new WebserviceCall(Login.this, URL, jsonRequest, "Loading...", true, new AsyncResponse() {
                        @Override
                        public void onSuccess(final String message, JSONArray jsonData) {
                            Toast.makeText(Login.this, message, Toast.LENGTH_SHORT).show();
                            try {
                                getSharedPreferences("testpref",MODE_PRIVATE).edit().putString("id",jsonData.getJSONObject(0).getString("id")).apply();
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            Intent intent = new Intent(Login.this,Navigation.class);
                            startActivity(intent);
                        }

                        @Override
                        public void onFailure(String message) {
                            Toast.makeText(Login.this, message, Toast.LENGTH_SHORT).show();
                        }
                    }).execute();
                }


            }
        });


        lsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Login.this,Registration.class);
                startActivity(i);
            }
        });




        lforgotpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,Forgotpassword.class);
                startActivity(i);
            }
        });







//        lforgotpwd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                showForgotPasswordDialog();
//
//            }
//
//            private void showForgotPasswordDialog() {
//
//
//                dialogView= LayoutInflater.from(this).inflate(R.layout.dailog_forgot_pwd,null);
//
//
//                AlertDialog alertDialog=new AlertDialog.Builder(this)
//                        .setTitle("Email")
//                        .setView(dialogView)
//                        .setPositiveButton("Verify", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                handleDialog(dialogView);
//                                dialog.dismiss();
//                            }
//                        })
//                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.dismiss();
//                            }
//                        })
//                        .create();
//                alertDialog.show();
//
//
//            }
//
//            private void handleDialog(View dialogView) {
//                EditText verifyEmailET = (EditText) dialogView.findViewById(R.id.forgot_et_email);
//                String stremail = verifyEmailET.getText().toString();
//                JSONObject object = new JSONObject();
//                try {
//                    object.put("mode","forgotPassword");
//                    object.put("emailId", stremail);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//
//                String jsonRequest = String.valueOf(object);
////        String URL = "http://development.ifuturz.com/core/FLAT_TEST/stone_galary/admin/webservice.php";
//                String URL = "http://www.vnurture.in/pro/mailtest.php";
//                new WebserviceCall(Login.this, URL, jsonRequest, "Loading...", true, new AsyncResponse() {
//                    @Override
//                    public void onSuccess(final String message, JSONArray jsonData) {
//                        Toast.makeText(Login.this, message, Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(Login.this, Navigation.class);
//                        startActivity(intent);
//                    }
//
//                    @Override
//                    public void onFailure(String message) {
//                        Toast.makeText(Login.this, message, Toast.LENGTH_SHORT).show();
//                    }
//                }).execute();
//
//            }
//        });
//

    }
}
