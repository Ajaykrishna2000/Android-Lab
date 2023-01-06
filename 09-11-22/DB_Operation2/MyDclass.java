package com.example.db_operations2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDclass extends SQLiteOpenHelper {
    public MyDclass(Context context) {
        super(context, "Userdetails", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE TABLE Userdetails(Name TEXT PRIMARY KEY,Contact TEXT, Course TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("DROP TABLE IF EXISTS Userdetails");
    }

    public boolean Insertuserdetails(String Name, String Contact, String Course){
        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues contentval=new ContentValues();
        contentval.put("Name",Name);
        contentval.put("Contact",Contact);
        contentval.put("Course",Course);
        long result=DB.insert("Userdetails",null,contentval);
        if(result==-1) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean Updateuserdetails(String Name, String Contact, String Course){
        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues contentval=new ContentValues();
        contentval.put("Contact",Contact);
        contentval.put("Course",Course);
        Cursor cr=DB.rawQuery("SELECT * FROM Userdetails WHERE Name=?", new String[]{Name});
        if(cr.getCount()>0) {
            long result = DB.update("Userdetails", contentval,"Name=?", new String[]{Name});
            if (result == -1) {
                return false;
            } else {
                return true;
            }
        }
        else {
            return false;
        }
    }

    public boolean Deleteuserdetails(String Name){
        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues contantval=new ContentValues();
        Cursor cr=DB.rawQuery("SELECT * FROM Userdetails WHERE Name=?", new String[]{Name});
        if(cr.getCount()>0) {
            long result = DB.delete("Userdetails","Name=?", new String[]{Name});
            if (result == -1) {
                return false;
            } else {
                return true;
            }
        }
        else {
            return false;
        }
    }

    public Cursor getdata(){
        SQLiteDatabase DB=this.getWritableDatabase();
        Cursor cr=DB.rawQuery("SELECT * FROM Userdetails", null);
        return cr;
    }
}
