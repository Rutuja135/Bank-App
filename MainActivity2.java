package com.example.bankapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    ListView listView;
    String[] name={"John","Bob","jenilia","Devid"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast.makeText(this, "WELCOME ", Toast.LENGTH_SHORT).show();

        listView=findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_dropdown_item_1line, name);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {

            Toast.makeText(MainActivity2.this, "Welcome to "+name[position]+" 's details", Toast.LENGTH_SHORT).show();

            if(position==0)
            {
                startActivity(new Intent(MainActivity2.this,John.class));
            }else if(position==1){
                startActivity(new Intent(MainActivity2.this,Bob.class));
            }
            else if(position==2){
                startActivity(new Intent(MainActivity2.this,Jenilia.class));
            }else if(position==3){
                startActivity(new Intent(MainActivity2.this,Devid.class));
            }
        });


    }
}