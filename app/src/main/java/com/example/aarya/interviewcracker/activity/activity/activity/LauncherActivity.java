package com.example.aarya.interviewcracker.activity.activity.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aarya.interviewcracker.R;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(LauncherActivity.this, MainActivity.class);
                LauncherActivity.this.startActivity(mainIntent);
                LauncherActivity.this.finish();
            }
        }, 5000);
    }
}
