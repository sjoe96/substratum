package projekt.substratum.services;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import projekt.substratum.util.ProjectWideClasses;

/**
 * @author Nicholas Chum (nicholaschum)
 */

public class NotificationButtonReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManager manager = (NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.cancel(ProjectWideClasses.notification_id);
    }
}