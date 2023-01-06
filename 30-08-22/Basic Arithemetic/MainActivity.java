package com.example.basicarithemetic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edt1= (EditText) findViewById(R.id.et1);
        EditText edt2= (EditText) findViewById(R.id.et2);
        Button bt1= (Button) findViewById(R.id.btn1);
        Button bt2= (Button) findViewById(R.id.btn2);
        Button bt3= (Button) findViewById(R.id.btn3);
        Button bt4= (Button) findViewById(R.id.btn4);
        TextView tv1= (TextView) findViewById(R.id.tv1);

        bt1.setOnClickListener(V->{
            String fnum= edt1.getText().toString();
            String snum= edt2.getText().toString();
            int et1= Integer.parseInt(fnum);
            int et2= Integer.parseInt(snum);
            int result=et1+et2;
            tv1.setText(Integer.toString(result));
        });

        bt2.setOnClickListener(V->{
            String fnum= edt1.getText().toString();
            String snum= edt2.getText().toString();
            int et1= Integer.parseInt(fnum);
            int et2= Integer.parseInt(snum);
            int result=et1-et2;
            tv1.setText(Integer.toString(result));
        });

        bt3.setOnClickListener(V->{
            String fnum= edt1.getText().toString();
            String snum= edt2.getText().toString();
            int et1= Integer.parseInt(fnum);
            int et2= Integer.parseInt(snum);
            int result=et1*et2;
            tv1.setText(Integer.toString(result));
        });

        bt4.setOnClickListener(V->{
            String fnum= edt1.getText().toString();
            String snum= edt2.getText().toString();
            int et1= Integer.parseInt(fnum);
            int et2= Integer.parseInt(snum);
            int result=et1/et2;
            tv1.setText(Integer.toString(result));
        });
    }
}