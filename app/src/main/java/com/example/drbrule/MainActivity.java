package com.example.drbrule;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mysound1;
    MediaPlayer mysound2;
    MediaPlayer mysound3;
    MediaPlayer mysound4;
    Button buttonCool;
    Button buttonHi;
    Button buttonIDidntAsk;
    Button buttonImSorry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mysound1 = MediaPlayer.create(this, R.raw.cool);
        mysound2 = MediaPlayer.create(this, R.raw.hi);
        mysound3 = MediaPlayer.create(this, R.raw.ididntaskforthis);
        mysound4 = MediaPlayer.create(this, R.raw.imsorry);

        buttonCool = (Button) findViewById(R.id.buttonCool);
        buttonHi = (Button) findViewById(R.id.buttonHi);
        buttonIDidntAsk = (Button) findViewById(R.id.buttonIDidntAsk);
        buttonImSorry = (Button) findViewById(R.id.buttonImSorry);

        sound1();
        sound2();
        sound3();
        sound4();

    }

    public void sound1(){
        buttonCool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mysound1.start();
            }
        });
    }

    public void sound2(){
        buttonHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mysound2.start();
            }
        });
    }

    public void sound3(){
        buttonIDidntAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mysound3.start();
            }
        });
    }

    public void sound4(){
        buttonImSorry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mysound4.start();
            }
        });
    }
}
