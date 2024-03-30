package X;

import android.content.SharedPreferences;

/* renamed from: X.636  reason: invalid class name */
public class AnonymousClass636 {
    public final C21010yW A00;
    public final C19890wg A01;
    public final C21570zS A02;

    public void A00(String str) {
        SharedPreferences A002 = this.A01.A00("ntp-scheduler");
        synchronized (this) {
            C36341k9.A0v(A002.edit(), str, A002.getInt(str, 0) + 1);
        }
    }

    public AnonymousClass636(C21010yW r1, C19890wg r2, C21570zS r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
