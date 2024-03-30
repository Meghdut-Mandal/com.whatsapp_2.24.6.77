package X;

import android.content.SharedPreferences;

/* renamed from: X.1b4  reason: invalid class name and case insensitive filesystem */
public final class C30971b4 {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new C30981b5(this));

    public C30971b4(C19890wg r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
    }

    public final boolean A00(AnonymousClass11F r4) {
        return ((SharedPreferences) this.A01.getValue()).getBoolean(r4.getRawString(), false);
    }
}
