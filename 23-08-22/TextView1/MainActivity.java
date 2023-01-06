package com.example.textview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et1 = (EditText) findViewById(R.id.et1);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        Button bt1 = (Button) findViewById(R.id.b1);
        bt1.setOnClickListener(V -> {
            String value1 = et1.getText().toString();
            tv1.setText(value1);
        });
    }
}