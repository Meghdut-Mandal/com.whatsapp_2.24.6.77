package X;

import android.content.SharedPreferences;

/* renamed from: X.1J7  reason: invalid class name */
public final class AnonymousClass1J7 {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new AnonymousClass1J8(this));

    public AnonymousClass1J7(C19890wg r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
    }

    public static final synchronized SharedPreferences.Editor A00(AnonymousClass1J7 r1) {
        SharedPreferences.Editor edit;
        synchronized (r1) {
            edit = ((SharedPreferences) r1.A01.getValue()).edit();
            AnonymousClass00C.A08(edit);
        }
        return edit;
    }

    public final synchronized long A01() {
        return ((SharedPreferences) this.A01.getValue()).getLong("timespent_saved_start_time", 0);
    }
}
