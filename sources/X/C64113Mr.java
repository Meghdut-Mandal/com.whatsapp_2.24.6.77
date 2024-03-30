package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Mr  reason: invalid class name and case insensitive filesystem */
public class C64113Mr {
    public static long A00 = -1;
    public static boolean A01;

    public static synchronized void A00(C21360z5 r4, C19420v0 r5) {
        synchronized (C64113Mr.class) {
            A01 = true;
            if (r4.A03()) {
                Log.w("profilephotoreminder/savelastremindertimestamp/clock is wrong, not saving last profile photo reminder time");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                A00 = currentTimeMillis;
                r5.A1h("wa_last_reminder_timestamp", currentTimeMillis);
            }
        }
    }
}
