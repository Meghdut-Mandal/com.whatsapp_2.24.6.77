package X;

import android.util.SparseArray;

/* renamed from: X.0Ci  reason: invalid class name and case insensitive filesystem */
public class C02900Ci {
    public int A00 = 0;
    public SparseArray A01 = new SparseArray();

    public void A01() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A01;
            if (i < sparseArray.size()) {
                ((AnonymousClass0D1) sparseArray.valueAt(i)).A03.clear();
                i++;
            } else {
                return;
            }
        }
    }

    public static AnonymousClass0D1 A00(C02900Ci r1, int i) {
        SparseArray sparseArray = r1.A01;
        AnonymousClass0D1 r0 = (AnonymousClass0D1) sparseArray.get(i);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0D1 r02 = new AnonymousClass0D1();
        sparseArray.put(i, r02);
        return r02;
    }
}
