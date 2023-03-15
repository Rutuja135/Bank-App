package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

public class Bob extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bob);

        Button button2=findViewById(R.id.b4);

        button2.setOnClickListener(v -> {
            Intent intent=new Intent(Bob.this,transcation.class);
            startActivity(intent);
        });

    }
}