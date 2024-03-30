package X;

import android.content.SharedPreferences;

/* renamed from: X.1Uv  reason: invalid class name and case insensitive filesystem */
public abstract class C28971Uv {
    public static final boolean A00(C19970wo r6, C19420v0 r7) {
        String string;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass00C.A0D(r7, 1);
        long A00 = C19970wo.A00(r6);
        AnonymousClass005 r4 = r7.A00;
        if (A00 >= ((SharedPreferences) r4.get()).getLong("device_switching_code_expiry", 0) || (string = ((SharedPreferences) r4.get()).getString("device_switching_code", (String) null)) == null || string.length() == 0) {
            return false;
        }
        return true;
    }
}
