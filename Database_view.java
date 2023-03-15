package com.example.bankapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database_view extends SQLiteOpenHelper {
    public Database_view(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory,int version){
        super(context,name,factory,version);

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String q="select * from transaction_done";
        sqLiteDatabase.execSQL(q);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
