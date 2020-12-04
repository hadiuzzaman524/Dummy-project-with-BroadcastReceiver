package com.example.dummy_project;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import android.widget.Toast;

public class Test {
    Test(Context context){
        Toast.makeText(context, "VOLUME CHANGE ACTION", Toast.LENGTH_SHORT).show();
        Log.e("s", "Screen on");

        Intent intent1 = new Intent();
        intent1.setClass(context, MainActivity.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);

    }
}
