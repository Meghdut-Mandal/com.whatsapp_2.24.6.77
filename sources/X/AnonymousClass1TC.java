package X;

import android.content.SharedPreferences;

/* renamed from: X.1TC  reason: invalid class name */
public class AnonymousClass1TC {
    public static final String A02;
    public SharedPreferences A00;
    public final C19890wg A01;

    public static synchronized SharedPreferences A00(AnonymousClass1TC r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A00(A02);
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C19430v1.A0A);
        sb.append("_daily_events");
        A02 = sb.toString();
    }

    public long A01(String str) {
        SharedPreferences A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("KeepInChatNotif");
        sb.append("::");
        sb.append(str);
        return A002.getLong(sb.toString(), 0);
    }

    public AnonymousClass1TC(C19890wg r1) {
        this.A01 = r1;
    }
}
