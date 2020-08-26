package com.example.testlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.testinglib.Toasting;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Toasting().show(this);
    }
}