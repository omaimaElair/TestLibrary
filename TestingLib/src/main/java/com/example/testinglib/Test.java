package com.example.testinglib;

import android.content.Context;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

class Test {
    void show2(Context context){
        int x=2+3;
        String s="how you doing"+x;
        if (s.equals("test"))
        Toast.makeText(context, "TEST 1", Toast.LENGTH_SHORT).show();
        Toasty.error(context,"how you doing!",2000,true).show();
    }
}
