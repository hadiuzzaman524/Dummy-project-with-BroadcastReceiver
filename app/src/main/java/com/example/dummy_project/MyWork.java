package com.example.dummy_project;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.util.Log;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MyWork extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {


        if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) {
            int newVolume = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
            int oldVolume = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", 0);
            if (newVolume != oldVolume) {
                Intent intent1 = new Intent();
                intent1.setClass(context, MainActivity.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent1);
                Toast.makeText(context, "VOLUME CHANGE ACTION", Toast.LENGTH_SHORT).show();
            }

            Log.e("volume", "Change");
        }
        if (Intent.ACTION_SCREEN_ON.equals(intent.getAction())) {
            new Test(context);
        }
        if (Intent.ACTION_SCREEN_OFF.equals(intent.getAction())) {
            Log.e("s", "Off");
        }
    }

}
