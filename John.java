package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

public class John extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_john);
        Button button4=findViewById(R.id.button4);
        button4.setOnClickListener(v -> {
            Intent intent=new Intent(John.this,transcation.class);
            startActivity(intent);
        });
    }
}