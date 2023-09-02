package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class third extends AppCompatActivity {
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
      e1 =(EditText) findViewById(R.id.edit31);
      e2 =(EditText) findViewById(R.id.edit32);
      e3=(EditText) findViewById(R.id.edit33);
    }


    public void do3(View view) {
        Intent i = new Intent(this,d3.class);
        i.putExtra("user1",e1.getText().toString());
        i.putExtra("user2",e2.getText().toString());
        i.putExtra("user3",e3.getText().toString());
        startActivity(i);

    }
}