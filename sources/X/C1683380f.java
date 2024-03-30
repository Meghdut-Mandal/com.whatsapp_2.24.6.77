package X;

import android.os.Build;

/* renamed from: X.80f  reason: invalid class name and case insensitive filesystem */
public final class C1683380f extends C208199xq {
    public static final String A00;

    static {
        String A01 = AnonymousClass6VD.A01("NetworkMeteredCtrlr");
        AnonymousClass00C.A08(A01);
        A00 = A01;
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj) {
        boolean z;
        AnonymousClass9WR r5 = (AnonymousClass9WR) obj;
        AnonymousClass00C.A0D(r5, 0);
        if (Build.VERSION.SDK_INT < 26) {
            AnonymousClass6VD.A00().A04(A00, "Metered network constraint is not supported before API 26, only checking for connected state.");
            z = r5.A00;
        } else {
            if (r5.A00) {
                z = r5.A01;
            }
            return true;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public C1683380f(AnonymousClass9YC r1) {
        super(r1);
    }
}
