package com.example.spinner1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] cars={"ROLLS ROYCE", "BMW", "BENZ", "AUDI", "TOYOTA", "TATA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp1=(Spinner)findViewById(R.id.sp1);
        sp1.setOnItemSelectedListener(this);
        ArrayAdapter Aa=new ArrayAdapter(this, android.R.layout.simple_spinner_item,cars);
        Aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(Aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), cars[i], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}