package X;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2nA  reason: invalid class name and case insensitive filesystem */
public final class C51062nA extends AnonymousClass3HN {
    public static final long A03 = TimeUnit.DAYS.toMillis(90);
    public final C19890wg A00;
    public final AnonymousClass00T A01 = C36431kI.A1I(new C84704Eg(this));
    public final C19970wo A02;

    public C51062nA(C19970wo r2, C19890wg r3) {
        C36321k7.A0x(r2, r3);
        this.A02 = r2;
        this.A00 = r3;
    }

    public final boolean A04() {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass00T r6 = this.A01;
        SharedPreferences A0E = C36411kG.A0E(r6);
        long j = A03;
        int i = ((currentTimeMillis - A0E.getLong("ts", -j)) > j ? 1 : ((currentTimeMillis - A0E.getLong("ts", -j)) == j ? 0 : -1));
        SharedPreferences A0E2 = C36411kG.A0E(r6);
        if (i < 0) {
            if (A0E2.getInt("shown", 3) < 3) {
                return true;
            }
            return false;
        } else if (A0E2.getInt("left", 3) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
