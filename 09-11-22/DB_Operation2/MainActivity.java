package com.example.db_operations2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ed1=(EditText) findViewById(R.id.et1);
        EditText ed2=(EditText) findViewById(R.id.et2);
        EditText ed3=(EditText) findViewById(R.id.et3);
        Button btn1=(Button) findViewById(R.id.btn1);
        Button btn2=(Button) findViewById(R.id.btn2);
        Button btn3=(Button) findViewById(R.id.btn3);
        Button btn4=(Button) findViewById(R.id.btn4);
        MyDclass DB=new MyDclass(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name=ed1.getText().toString();
                String Contact=ed2.getText().toString();
                if(Contact.length()>10){
                    Toast.makeText(MainActivity.this, "More than 10 numbers", Toast.LENGTH_SHORT).show();
                }
                String Course=ed3.getText().toString();
                Boolean checkinsertdata=DB.Insertuserdetails(Name,Contact,Course);
                if(checkinsertdata==true){
                    Toast.makeText(MainActivity.this, "Value Inserted", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Value Can't be Inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name=ed1.getText().toString();
                String Contact=ed2.getText().toString();
                String Course=ed3.getText().toString();
                Boolean checkupdatetdata=DB.Updateuserdetails(Name,Contact,Course);
                if(checkupdatetdata==true){
                    Toast.makeText(MainActivity.this, "Value Updated", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Value Can't be Updated", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name=ed1.getText().toString();
                Boolean checkdeletedata=DB.Deleteuserdetails(Name);
                if(checkdeletedata==true){
                    Toast.makeText(MainActivity.this, "Value Deleted", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Value Can't be Deleted", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res=DB.getdata();
                if(res.getCount()==0){
                    Toast.makeText(MainActivity.this, "No Value Exist", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Name"+res.getString(0)+"\n");
                    buffer.append("Contact"+res.getString(1)+"\n");
                    buffer.append("Courser"+res.getString(2)+"\n");
                }
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("View Entries");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
    }
}