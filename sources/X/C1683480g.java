package X;

import android.os.Build;

/* renamed from: X.80g  reason: invalid class name and case insensitive filesystem */
public final class C1683480g extends C208199xq {
    public static final String A00;

    static {
        String A01 = AnonymousClass6VD.A01("NetworkNotRoamingCtrlr");
        AnonymousClass00C.A08(A01);
        A00 = A01;
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj) {
        boolean z;
        AnonymousClass9WR r5 = (AnonymousClass9WR) obj;
        AnonymousClass00C.A0D(r5, 0);
        if (Build.VERSION.SDK_INT < 24) {
            AnonymousClass6VD.A00().A04(A00, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            z = r5.A00;
        } else {
            if (r5.A00) {
                z = r5.A02;
            }
            return true;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public C1683480g(AnonymousClass9YC r1) {
        super(r1);
    }
}
