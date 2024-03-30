package X;

import android.os.Build;

/* renamed from: X.80c  reason: invalid class name and case insensitive filesystem */
public final class C1683080c extends C208199xq {
    public /* bridge */ /* synthetic */ boolean A02(Object obj) {
        AnonymousClass9WR r5 = (AnonymousClass9WR) obj;
        AnonymousClass00C.A0D(r5, 0);
        int i = Build.VERSION.SDK_INT;
        boolean z = r5.A00;
        if (i >= 26) {
            if (!z) {
                return true;
            }
            z = r5.A03;
        }
        if (z) {
            return false;
        }
        return true;
    }

    public C1683080c(AnonymousClass9YC r1) {
        super(r1);
    }
}
