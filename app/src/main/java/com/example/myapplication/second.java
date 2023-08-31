package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class second extends AppCompatActivity {
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        e1=(EditText) findViewById(R.id.edit21);
        e2=(EditText) findViewById(R.id.edit22);
    }

    public void doit(View view) {
        Intent i1 = new Intent(this,dice2.class);
        i1.putExtra("user1",e1.getText().toString());
        i1.putExtra("user2",e2.getText().toString());
        startActivity(i1);
    }
}