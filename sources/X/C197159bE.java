package X;

import android.util.SparseArray;

/* renamed from: X.9bE  reason: invalid class name and case insensitive filesystem */
public class C197159bE {
    public final SparseArray A00 = new SparseArray();

    public static void A00(C201589jv r4, C197159bE r5, C20979A1t a1t) {
        SparseArray sparseArray = r5.A00;
        Object obj = sparseArray.get(0);
        if (obj instanceof C23064B2n) {
            r4.A04((C23064B2n) obj);
        }
        if (a1t instanceof C23064B2n) {
            r4.A03(a1t);
        }
        if (a1t == null) {
            sparseArray.remove(0);
        } else {
            sparseArray.put(0, a1t);
        }
    }
}
