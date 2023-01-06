package com.example.sharedpreferences02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txt1=(TextView) findViewById(R.id.txt1);
        SharedPreferences pref=getSharedPreferences("User Information", Context.MODE_PRIVATE);
        String name=pref.getString("FullName"," ");
        txt1.setText(name);
    }
}