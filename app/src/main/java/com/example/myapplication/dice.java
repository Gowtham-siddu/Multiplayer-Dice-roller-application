package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class dice extends AppCompatActivity {
    TextView t1;
    ImageView imageview;
    Button button;
    Random ran = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        t1=(TextView) findViewById(R.id.result);
        Bundle b1=getIntent().getExtras();
        String s1=b1.getString("user");
        t1.setText(s1);

        imageview = findViewById(R.id.dice);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int ra = ran.nextInt(6)+1;
                if(ra==1){
                    imageview.setImageResource(R.drawable.one);
                }
                if(ra==2){
                    imageview.setImageResource(R.drawable.two);
                }
                if(ra==3){
                    imageview.setImageResource(R.drawable.three);
                }
                if(ra==4){
                    imageview.setImageResource(R.drawable.four);
                }
                if(ra==5){
                    imageview.setImageResource(R.drawable.five);
                }
                if(ra==6){
                    imageview.setImageResource(R.drawable.six);
                }


            }
        });
    }
}