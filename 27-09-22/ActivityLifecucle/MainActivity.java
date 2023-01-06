package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life Cycle","OnCreate Invoked");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Life Cycle","onStart Invoked");
        Toast.makeText(this, "onStart Invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Life Cycle","onResume Invoked");
        Toast.makeText(this, "onResume Invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Life Cycle","onPause Invoked");
        Toast.makeText(this, "onPause Invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Life Cycle","onDestroy Invoked");
        Toast.makeText(this, "onDestroy Invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Life Cycle","onStop Invoked");
        Toast.makeText(this, "onStop Invoked", Toast.LENGTH_SHORT).show();
    }
}