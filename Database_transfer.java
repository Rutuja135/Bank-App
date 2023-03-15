package com.example.bankapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database_transfer extends SQLiteOpenHelper {
    private static final String rutuja ="user_info.db";
    public Database_transfer(@Nullable Context context){

        super(context,rutuja,null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String q="create table transaction_done(id integer primary key autoincrement ,amount text,name text)";
        sqLiteDatabase.execSQL(q);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("drop table if exists transaction_done");
        onCreate(sqLiteDatabase);



    }
    public boolean insert_Data(String amount,String name){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put("amount",amount);
        c.put("name",name);
        long r=db.insert("transaction_done","null",c);

        return r != -1;
    }
    public Cursor getinfo(){
        SQLiteDatabase db=this.getWritableDatabase();
        return db.rawQuery("select * from transaction_done",null);

    }
}
