package com.example.listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView studlist;
    String[] studname={"Ajay",
            "Anu",
            "Vijay",
            "Surya"
    };
    int[] studImg={
            R.drawable.profile,
            R.drawable.profile2,
            R.drawable.profile2,
            R.drawable.profile,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studlist= findViewById(R.id.studlist);

        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
        for (int i = 0; i < studname.length; i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("studName", studname[i]);
            map.put("studIcon", studImg[i]);
            arrayList.add(map);
        }

        String[] from = {"studName", "studIcon"};
        int to[] = {R.id.list_title, R.id.list_icon};

        SimpleAdapter adapter = new SimpleAdapter(this, arrayList, R.layout.listsvalues, from, to);
        studlist.setAdapter(adapter);

    }
}