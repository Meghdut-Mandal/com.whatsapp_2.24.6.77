package X;

import android.util.SparseArray;

/* renamed from: X.6Qn  reason: invalid class name */
public abstract class AnonymousClass6Qn {
    public static final float A00(C140456lc r4, int i) {
        String str = (String) C140456lc.A0I(r4, i);
        if (str != null) {
            try {
                return AnonymousClass6Y7.A01(str);
            } catch (AnonymousClass5R5 unused) {
                AnonymousClass6RS.A01("BloksModelUtils", AnonymousClass000.A0p("Error parsing pixel value ", str, AnonymousClass000.A0u()));
            }
        }
        return 0.0f;
    }

    public static final boolean A01(C140456lc r1) {
        AnonymousClass00C.A0D(r1, 0);
        SparseArray sparseArray = r1.A05;
        if (sparseArray.get(135) == null && sparseArray.get(153) == null) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C140456lc r2) {
        AnonymousClass00C.A0D(r2, 0);
        AnonymousClass6NR.A00();
        int i = r2.A04;
        if (i == 13326 || i == 13336) {
            return true;
        }
        return false;
    }
}
