package com.example.recycleview_character;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splasher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splasher);
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(Splasher.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 4000);
    }

}