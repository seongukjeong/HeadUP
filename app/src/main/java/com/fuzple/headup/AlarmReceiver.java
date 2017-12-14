package com.fuzple.headup;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;

/**
 * Created by user on 2017-12-14.
 */

public class AlarmReceiver extends BroadcastReceiver{

    Vibrator vb;
    @Override
    public void onReceive(Context context, Intent intent) {

        vb = (Vibrator)context.getSystemService(context.VIBRATOR_SERVICE);
        vb.vibrate(1000);


    }
}
