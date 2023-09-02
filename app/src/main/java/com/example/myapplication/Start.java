package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

    }

    public void firstb1(View view) {
        Intent i1 = new Intent(this,MainActivity.class);
        startActivity(i1);
    }

    public void secondb2(View view) {
        Intent i2 = new Intent(this,second.class);
        startActivity(i2);
    }

    public void firstb4(View view) {
        Intent i4 = new Intent(this,fourth.class);
        startActivity(i4);
    }

    public void firstb3(View view) {
    Intent i3 = new Intent(this,third.class);
    startActivity(i3);
    }


    public void help(View view) {
        Intent i = new Intent(this, help.class);
        startActivity(i);

    }
}