package com.example.gmailapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordChange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_change);

        SharedPreferences pref=getSharedPreferences("Gmail Login", MODE_PRIVATE);
        EditText pw1=(EditText) findViewById(R.id.pw1);
        EditText pw2=(EditText) findViewById(R.id.pw2);
        Button btn1=(Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String psw=pw1.getText().toString();
                String cpsw=pw2.getText().toString();
                if(psw.equals(cpsw)){
                    Toast.makeText(PasswordChange.this,"Password Changed",Toast.LENGTH_SHORT).show();
                    SharedPreferences.Editor et=pref.edit();
                    et.putString("Password:",psw);
                }
                else
                {
                    Toast.makeText(PasswordChange.this, "Password Not Same", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}