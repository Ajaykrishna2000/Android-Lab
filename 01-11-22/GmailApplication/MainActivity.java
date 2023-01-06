package com.example.gmailapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et1=(EditText) findViewById(R.id.et1);
        EditText pw1=(EditText) findViewById(R.id.pw1);
        Button bt1=(Button) findViewById(R.id.btn1);
        Button bt2=(Button) findViewById(R.id.btn2);

        SharedPreferences pref=getSharedPreferences("Gmail Login", MODE_PRIVATE);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=et1.getText().toString();
                String psw=pw1.getText().toString();
                if(email.equals("ajay@gmail.com") && psw.equals("ajay1")){
                    Toast.makeText(MainActivity.this, "Login Succesfull", Toast.LENGTH_SHORT).show();
                    SharedPreferences.Editor et=pref.edit();
                    et.putString("Email:",email);
                    et.putString("Password:",psw);
                    et.commit();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PasswordChange.class);
                startActivity(i);
            }
        });
    }
}