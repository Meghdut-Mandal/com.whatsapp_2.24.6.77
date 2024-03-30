package X;

import android.content.Context;

/* renamed from: X.0eP  reason: invalid class name and case insensitive filesystem */
public final class C10530eP implements C16880qF {
    public final C06270Sy Bpd(Context context, C17100qi r7, String str) {
        C06270Sy r4 = new C06270Sy();
        r4.A00 = r7.ByA(context, str);
        int ByP = r7.ByP(context, str, true);
        r4.A01 = ByP;
        int i = r4.A00;
        int i2 = 0;
        if (i == 0) {
            if (ByP != 0) {
                i = 0;
            }
            r4.A02 = i2;
            return r4;
        }
        if (ByP >= i) {
            r4.A02 = 1;
            return r4;
        }
        i2 = -1;
        r4.A02 = i2;
        return r4;
    }
}
