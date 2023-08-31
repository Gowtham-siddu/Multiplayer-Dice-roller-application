package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class fourth extends AppCompatActivity {

    EditText e1,e2,e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        e1=(EditText) findViewById(R.id.edit41);
        e2=(EditText) findViewById(R.id.edit42);
        e3=(EditText) findViewById(R.id.edit43);
        e4=(EditText) findViewById(R.id.edit44);
    }


    public void does(View view) {
      Intent i = new Intent(this,d4.class);
        i.putExtra("user1",e1.getText().toString());
        i.putExtra("user2",e2.getText().toString());
        i.putExtra("user3",e3.getText().toString());
        i.putExtra("user4",e4.getText().toString());
        startActivity(i);
    }
}