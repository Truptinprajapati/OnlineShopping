    package com.example.modern.onlineshopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.modern.onlineshopping.AsyncTasks.AsyncResponse;
import com.example.modern.onlineshopping.AsyncTasks.WebserviceCall;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by modern on 1/28/2017.
 */
public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        final EditText fnname=(EditText)findViewById(R.id.r_fname);
        final EditText lname=(EditText)findViewById(R.id.r_lname);
        final EditText email=(EditText)findViewById(R.id.r_email);
        final EditText pwd=(EditText)findViewById(R.id.r_pwd);
        final EditText conpwd=(EditText)findViewById(R.id.r_confirmpwd);
        final EditText mobno=(EditText)findViewById(R.id.r_mobno);
        final TextView gender=(TextView)findViewById(R.id.gender_textview);
        final RadioButton male=(RadioButton)findViewById(R.id.male_radiobutton);
        final RadioButton female=(RadioButton)findViewById(R.id.female_radiobutton);
        Button submit=(Button)findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String strfname = fnname.getText().toString();
                String strlname = lname.getText().toString();
                String stremail = email.getText().toString();
                String strpwd = pwd.getText().toString();
                String strconpwd = conpwd.getText().toString();
                String strgender = gender.getText().toString();
                String strmob = mobno.getText().toString();
                {
                    if (male.isChecked()) {
                        male.getText().toString();
                    } else {
                        female.getText().toString();
                    }

                }


                if (strfname.isEmpty()) {
                    Toast.makeText(Registration.this, "Name cannot be empty!", Toast.LENGTH_SHORT).show();

                } else if (strlname.isEmpty()) {
                    Toast.makeText(Registration.this, "lastname cannot be empty", Toast.LENGTH_SHORT).show();

                } else if (stremail.isEmpty()) {
                    Toast.makeText(Registration.this, "Enter email", Toast.LENGTH_SHORT).show();
                } else if (!isValidEmail(stremail)) {
                    Toast.makeText(Registration.this, "Enter valid email", Toast.LENGTH_SHORT).show();
                } else if (strpwd.isEmpty()) {
                    Toast.makeText(Registration.this, "please enter password", Toast.LENGTH_SHORT).show();
                } else if (strconpwd.isEmpty()) {
                    Toast.makeText(Registration.this, "please enter confirm password", Toast.LENGTH_SHORT).show();
                } else if (strmob.isEmpty()) {
                    Toast.makeText(Registration.this, "please enter contact number", Toast.LENGTH_SHORT).show();
                } else if (strgender.isEmpty()) {
                    Toast.makeText(Registration.this, "enter your gender", Toast.LENGTH_SHORT).show();
                } else if (!strpwd.equals(strconpwd)) {
                    Toast.makeText(Registration.this, "passwords don't match", Toast.LENGTH_SHORT).show();

                } else {
                    JSONObject object = new JSONObject();
                    try {
                        object.put("firstname", strfname);
                        object.put("lastname", strlname);
                        object.put("email", stremail);
                        object.put("password", strpwd);
                        object.put("confirmpassword", strconpwd);
                        object.put("gender", gender);
                        object.put("mobilenumber", strmob);


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    String jsonRequest = String.valueOf(object);
                    String URL = "http://www.vnurture.in/pro/registration.php";

                    new WebserviceCall(Registration.this, URL, jsonRequest, "LOadding...", true, new AsyncResponse() {
                        @Override
                        public void onSuccess(String message, JSONArray jsonData) {

                            Toast.makeText(Registration.this, message, Toast.LENGTH_SHORT).show();
                            try {
                                getSharedPreferences("testpref", MODE_PRIVATE).edit().putString("id", jsonData.getJSONObject(0).getString("id")).apply();

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            Intent i = new Intent(Registration.this,Navigation.class);
                            startActivity(i);
                        }

                        @Override
                        public void onFailure(String message) {
                            Toast.makeText(Registration.this, message, Toast.LENGTH_SHORT).show();
                        }

                    }).execute();


                }
            }
                });


    }

    private boolean isValidEmail(String stremail) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(stremail);
        return matcher.matches();
    }
}






