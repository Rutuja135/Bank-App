package com.example.bankapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Database_transfer DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.btn);
        Button button1=findViewById(R.id.btn2);
        DB=new Database_transfer(this);
        button.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        });
        button1.setOnClickListener(v -> {
            Cursor res=DB.getinfo();
            if(res.getCount()==0){
                Toast.makeText(MainActivity.this, "no data found", Toast.LENGTH_SHORT).show();
            }
            StringBuilder buffer=new StringBuilder();
            while(res.moveToNext()){
                buffer.append("\n").append(res.getString(1)).append("\t\t\t\t\t\t\t\t\t\t");
                buffer.append(res.getString(2)).append("\n");
            }
            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setCancelable(true);
            builder.setTitle("USER ");
            builder.setTitle("user Data");
            builder.setTitle("amount       name");
            builder.setMessage(buffer.toString());
            builder.show();
        });
    }
}