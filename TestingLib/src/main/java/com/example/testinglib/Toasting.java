package com.example.testinglib;

import android.content.Context;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class Toasting {
    public void show(Context context){
        Toast.makeText(context, "TEST 1", Toast.LENGTH_SHORT).show();
        Toasty.error(context,"how you doing!",2000,true);
    }
}
