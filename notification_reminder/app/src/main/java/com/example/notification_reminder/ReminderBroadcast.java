package com.example.notification_reminder;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class ReminderBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        long when = System.currentTimeMillis();

//        NotificationManager notificationManager = (NotificationManager) context
//                .getSystemService(Context.NOTIFICATION_SERVICE);
//
//        Intent notificationIntent = new Intent(context, EventsPerform.class);
//        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//
//        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0,
//                notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);




        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "My Notification")
            .setContentTitle("Check In")
            .setContentText("Take some time to reflect on the day and how you are feeling.")
            .setSmallIcon(R.drawable.ic_baseline_notifications_24)
            .setAutoCancel(true);

        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(context);

        managerCompat.notify(1, builder.build());
    }

}
