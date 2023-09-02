package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class d3 extends AppCompatActivity {
    TextView t1,t2,t3;
    ImageView imageview1,imageview2,imageview3;
    Button button;
    Random ran = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d3);
        t1 = (TextView) findViewById(R.id.result31);
        t2 = (TextView) findViewById(R.id.result32);
        t3 = (TextView) findViewById(R.id.result33);

        Bundle b1 = getIntent().getExtras();
        Bundle b2 = getIntent().getExtras();
        Bundle b3 = getIntent().getExtras();

        String s1=b1.getString("user1");
        String s2=b2.getString("user2");
        String s3=b3.getString("user3");

        t1.setText(s1);
        t2.setText(s2);
        t3.setText(s3);

        imageview1 = findViewById(R.id.dice31);
        imageview2 = findViewById(R.id.dice32);
        imageview3 = findViewById(R.id.dice33);
        button = findViewById(R.id.button31);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r1 = ran.nextInt(6)+1;
                int r2 = ran.nextInt(6)+1;
                int r3 = ran.nextInt(6)+1;
                if(r1 == 1)
                {
                    imageview1.setImageResource(R.drawable.one);
                }
                if(r1 == 2)
                {
                    imageview1.setImageResource(R.drawable.two);
                }
                if(r1 == 3)
                {
                    imageview1.setImageResource(R.drawable.three);
                }
                if(r1 == 4)
                {
                    imageview1.setImageResource(R.drawable.four);
                }
                if(r1 == 5)
                {
                    imageview1.setImageResource(R.drawable.five);
                }
                if(r1 == 6)
                {
                    imageview1.setImageResource(R.drawable.six);
                }
                if(r2 == 1)
                {
                    imageview2.setImageResource(R.drawable.one);
                }
                if(r2 == 2)
                {
                    imageview2.setImageResource(R.drawable.two);
                }
                if(r2 == 3)
                {
                    imageview2.setImageResource(R.drawable.three);
                }
                if(r2 == 4)
                {
                    imageview2.setImageResource(R.drawable.four);
                }
                if(r2 == 5)
                {
                    imageview2.setImageResource(R.drawable.five);
                }
                if(r2 == 6)
                {
                    imageview2.setImageResource(R.drawable.six);
                }
                if(r3 == 1)
                {
                    imageview3.setImageResource(R.drawable.one);
                }
                if(r3 == 2)
                {
                    imageview3.setImageResource(R.drawable.two);
                }
                if(r3 == 3)
                {
                    imageview3.setImageResource(R.drawable.three);
                }
                if(r3 == 4)
                {
                    imageview3.setImageResource(R.drawable.four);
                }
                if(r3 == 5)
                {
                    imageview3.setImageResource(R.drawable.five);
                }
                if(r3 == 6)
                {
                    imageview3.setImageResource(R.drawable.six);
                }
            }
        });
    }
}