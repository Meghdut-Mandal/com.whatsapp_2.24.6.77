package X;

import android.content.Context;

/* renamed from: X.0JF  reason: invalid class name */
public class AnonymousClass0JF extends C07590Yl {
    public static int A00 = 1;

    public static final synchronized int A00(AnonymousClass0JF r7) {
        int i;
        synchronized (r7) {
            i = A00;
            if (i == 1) {
                Context context = r7.A01;
                C02610Bd r2 = C02610Bd.A00;
                int A02 = r2.A02(context, 12451000);
                if (A02 == 0) {
                    A00 = 4;
                    i = 4;
                } else if (r2.A03(context, (String) null, A02) != null || AnonymousClass0Z3.A00(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    A00 = 2;
                    i = 2;
                } else {
                    A00 = 3;
                    i = 3;
                }
            }
        }
        return i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0JF(android.content.Context r4, com.google.android.gms.auth.api.signin.GoogleSignInOptions r5) {
        /*
            r3 = this;
            X.0Sq r2 = X.AnonymousClass0S8.A04
            X.0Ts r1 = new X.0Ts
            r1.<init>()
            X.0dy r0 = new X.0dy
            r0.<init>()
            r1.A01 = r0
            X.0WU r0 = r1.A00()
            r3.<init>((android.content.Context) r4, (X.C17370rB) r5, (X.C06190Sq) r2, (X.AnonymousClass0WU) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JF.<init>(android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }
}
