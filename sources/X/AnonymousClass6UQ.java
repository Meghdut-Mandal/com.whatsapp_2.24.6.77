package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6UQ  reason: invalid class name */
public abstract class AnonymousClass6UQ {
    public static final AtomicInteger A00 = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static PendingIntent A00(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, A00.incrementAndGet(), C36441kJ.A0I("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    public static String A01(Context context, Bundle bundle, String str) {
        String str2;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(str)) {
                        if (notificationManager.getNotificationChannel(str) == null) {
                            StringBuilder A0h = C90524aI.A0h(C90474aD.A05(str) + 122);
                            A0h.append("Notification Channel requested (");
                            A0h.append(str);
                            A0h.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                            AnonymousClass000.A1A(A0h, "FirebaseMessaging");
                        }
                        return str;
                    }
                    str = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(str)) {
                        if (notificationManager.getNotificationChannel(str) == null) {
                            str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
                        }
                        return str;
                    }
                    str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
                    Log.w("FirebaseMessaging", str2);
                    str = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel(str) == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str, context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
                    }
                    return str;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean A02(Resources resources, int i) {
        if (Build.VERSION.SDK_INT == 26) {
            try {
                if (resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable) {
                    Log.e("FirebaseMessaging", AnonymousClass000.A0r("Adaptive icons cannot be used in notifications. Ignoring icon id: ", C90524aI.A0h(77), i));
                    return false;
                }
            } catch (Resources.NotFoundException unused) {
                StringBuilder A0h = C90524aI.A0h(66);
                A0h.append("Couldn't find resource ");
                A0h.append(i);
                Log.e("FirebaseMessaging", AnonymousClass000.A0q(", treating it as an invalid icon", A0h));
                return false;
            }
        }
        return true;
    }
}
