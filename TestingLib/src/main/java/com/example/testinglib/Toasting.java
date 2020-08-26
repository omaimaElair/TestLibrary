package com.example.testinglib;

import android.content.Context;
import android.widget.Toast;

class Toasting {
    public void show(Context context){
        Toast.makeText(context, "TEST 1", Toast.LENGTH_SHORT).show();
    }
}
