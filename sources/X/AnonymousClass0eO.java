package X;

import android.content.Context;

/* renamed from: X.0eO  reason: invalid class name */
public final class AnonymousClass0eO implements C16880qF {
    public final C06270Sy Bpd(Context context, C17100qi r5, String str) {
        C06270Sy r2 = new C06270Sy();
        int ByP = r5.ByP(context, str, true);
        r2.A01 = ByP;
        if (ByP != 0) {
            r2.A02 = 1;
        } else {
            int ByA = r5.ByA(context, str);
            r2.A00 = ByA;
            if (ByA != 0) {
                r2.A02 = -1;
                return r2;
            }
        }
        return r2;
    }
}
