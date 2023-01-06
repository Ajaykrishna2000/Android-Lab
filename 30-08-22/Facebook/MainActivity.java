package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et1 = (EditText)findViewById(R.id.et1);
        EditText et2 = (EditText)findViewById(R.id.psw1);
        Button bt1 = (Button)findViewById(R.id.b1);
        bt1.setOnClickListener(V -> {
            String uname= et1.getText().toString();
            String psw= et2.getText().toString();
            if(uname.equals("AJCE") && psw.equals("123"))
            {
                Toast.makeText(this,"Login Successful", Toast.LENGTH_SHORT).show();
            }
            else
            {
                if(!uname.equals("AJCE"))
                {
                    Toast.makeText(this,"Invalid Username", Toast.LENGTH_SHORT).show();
                }
                if(!psw.equals("123"))
                {
                    Toast.makeText(this,"Invalid Password", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(this,"Login Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}