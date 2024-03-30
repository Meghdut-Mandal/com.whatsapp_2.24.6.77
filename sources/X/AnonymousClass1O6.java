package X;

import android.content.SharedPreferences;

/* renamed from: X.1O6  reason: invalid class name */
public class AnonymousClass1O6 {
    public SharedPreferences A00;
    public final C19890wg A01;

    public static synchronized SharedPreferences A00(AnonymousClass1O6 r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A00("contact_sync_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public void A01() {
        A00(this).edit().putLong("contact_sync_backoff", -1).apply();
        A03(-1);
        A00(this).edit().putLong("status_sync_backoff", -1).apply();
        A00(this).edit().putLong("picture_sync_backoff", -1).apply();
        A00(this).edit().putLong("business_sync_backoff", -1).apply();
        A00(this).edit().putLong("devices_sync_backoff", -1).apply();
        A00(this).edit().putLong("payment_sync_backoff", -1).apply();
        A00(this).edit().putLong("delta_sync_backoff", -1).apply();
        A00(this).edit().putLong("disappearing_mode_sync_backoff", -1).apply();
        A00(this).edit().putLong("lid_sync_backoff", -1).apply();
        A00(this).edit().putLong("bot_sync_backoff", -1).apply();
        A02(-1);
    }

    public AnonymousClass1O6(C19890wg r1) {
        this.A01 = r1;
    }

    public void A02(long j) {
        A00(this).edit().putLong("global_backoff_time", j).apply();
    }

    public void A03(long j) {
        A00(this).edit().putLong("sidelist_sync_backoff", j).apply();
    }
}
