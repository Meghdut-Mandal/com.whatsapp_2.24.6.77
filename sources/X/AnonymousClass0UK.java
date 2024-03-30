package X;

import android.util.SparseIntArray;

/* renamed from: X.0UK  reason: invalid class name */
public abstract class AnonymousClass0UK {
    public final SparseIntArray A00 = new SparseIntArray();
    public final SparseIntArray A01 = new SparseIntArray();

    public abstract int A00(int i);

    public int A01(int i, int i2) {
        int A002 = A00(i);
        if (A002 != i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int A003 = A00(i4);
                i3 += A003;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = A003;
                }
            }
            if (A002 + i3 <= i2) {
                return i3;
            }
        }
        return 0;
    }
}
