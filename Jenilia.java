package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

public class Jenilia extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenilia);

        Button button=findViewById(R.id.button3);
        button.setOnClickListener(v -> {
            Intent intent=new Intent(Jenilia.this,transcation.class);
            startActivity(intent);
        });
    }
}