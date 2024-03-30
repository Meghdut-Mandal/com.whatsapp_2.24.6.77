package X;

import android.text.TextUtils;

/* renamed from: X.3uT  reason: invalid class name and case insensitive filesystem */
public final class C79903uT implements B0B {
    public final C19970wo A00;
    public final C19420v0 A01;

    public boolean B1C(C193229Kn r13, C16540pP r14, C87374On r15) {
        AnonymousClass00C.A0D(r13, 1);
        AnonymousClass005 r10 = this.A01.A00;
        if (C36391kE.A0H(r10).getLong("inorganic_notification_last_timestamp", 0) != 0) {
            String A1A = C36431kI.A1A("param", r13.A01);
            if (!(A1A == null || A1A.length() == 0 || !TextUtils.isDigitsOnly(A1A))) {
                if (C19970wo.A00(this.A00) - C36391kE.A0H(r10).getLong("inorganic_notification_last_timestamp", 0) > Long.parseLong(A1A) * ((long) 60000)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public C79903uT(C19970wo r1, C19420v0 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
