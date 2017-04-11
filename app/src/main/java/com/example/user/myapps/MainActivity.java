package com.example.user.myapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_1(View view) {
        Toast.makeText(MainActivity.this, "This is SPOTIFY STREAMER.", Toast.LENGTH_SHORT).show();
    }

    public void button_2(View view) {
        Toast.makeText(MainActivity.this, "This is SCORES APP.", Toast.LENGTH_SHORT).show();
    }

    public void button_3(View view) {
        Toast.makeText(MainActivity.this, "This is LIBRARY APP.", Toast.LENGTH_SHORT).show();
    }

    public void button_4(View view) {
        Toast.makeText(MainActivity.this, "This is BUILD IT BIGGER.", Toast.LENGTH_SHORT).show();
    }

    public void button_5(View view) {
        Toast.makeText(MainActivity.this, "This is XYZ READER.", Toast.LENGTH_SHORT).show();
    }

    public void button_6(View view) {
        Toast.makeText(MainActivity.this, "This is CAPSTONE:MY OWN APP.", Toast.LENGTH_SHORT).show();
    }
}
