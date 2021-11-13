package com.app.covidscape_tracker;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class launchscreen extends AppCompatActivity {
    private static int splash_time = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent HomeIntent = new Intent(launchscreen.this,MainActivity.class);
                startActivity(HomeIntent);
                finish();
            }

        },splash_time);
    }
}
