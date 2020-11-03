package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    String n;
    String e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        n=intent.getStringExtra("name");
        e=intent.getStringExtra("email");
        ((EditText)findViewById(R.id.name)).setText(n);
        ((EditText)findViewById(R.id.email)).setText(e);
    }
}
