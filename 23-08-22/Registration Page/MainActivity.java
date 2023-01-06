package com.example.registrationpage;

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

        EditText edt1= (EditText) findViewById(R.id.et1);
        EditText edt2= (EditText) findViewById(R.id.et2);
        EditText edt3= (EditText) findViewById(R.id.et3);
        EditText edt4= (EditText) findViewById(R.id.et4);
        EditText edt5= (EditText) findViewById(R.id.et5);
        EditText edt6= (EditText) findViewById(R.id.et6);
        Button bt1= (Button) findViewById(R.id.b1);
        Button bt2= (Button) findViewById(R.id.b2);

        bt1.setOnClickListener(V -> {
            String fname= edt1.getText().toString();
            String lname= edt2.getText().toString();
            String age= edt3.getText().toString();
            String email= edt4.getText().toString();
            String uname= edt5.getText().toString();
            String psw= edt6.getText().toString();
            if(fname.equals("") || lname.equals("") || age.equals("") || email.equals("") || uname.equals("") ||
                    psw.equals(""))
            {
                Toast.makeText(this,"Registration Failed", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this,"Registration Successful", Toast.LENGTH_SHORT).show();
            }
        });

        bt2.setOnClickListener(V->{
            edt1.getText().clear();
            edt2.getText().clear();
            edt3.getText().clear();
            edt4.getText().clear();
            edt5.getText().clear();
            edt6.getText().clear();
        });
    }
}