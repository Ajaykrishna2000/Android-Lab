package com.example.myfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=(Button) findViewById(R.id.btn1);
        Button btn2=(Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
               loadFragment(new FirstFragment());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new SecondFragment());
            }
        });
    }

    private void loadFragment(Fragment f) {
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.fr1, f);
        ft.commit();
    }

//    public void loadFragment(Fragment_f){
//        android.app.FragmentManager f=getFragmentManager();
//        FragmentTransaction ft= FragmentManager;
//        ft.replace(R.id.fr1,);
//        ft.commit;
//    }
}