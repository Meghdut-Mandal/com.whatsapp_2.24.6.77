package X;

import android.util.LongSparseArray;

/* renamed from: X.5s8  reason: invalid class name and case insensitive filesystem */
public final class C120825s8 {
    public final LongSparseArray A00;
    public final LongSparseArray A01;
    public final C123035vp A02;

    public C120825s8(C123035vp r6, C140456lc r7) {
        Object A05;
        this.A02 = r6;
        int i = r7.A03;
        LongSparseArray longSparseArray = new LongSparseArray(r7.A0b().size());
        AnonymousClass00T r1 = r6.A04;
        long j = (long) i;
        ((C129986Jg) r1.getValue()).A01.A00.A0A(j, longSparseArray);
        this.A01 = longSparseArray;
        AnonymousClass5oS r0 = ((C129986Jg) r1.getValue()).A00;
        Object obj = null;
        if (!(r0 == null || (A05 = r0.A00.A05(j)) == null)) {
            obj = A05;
        }
        this.A00 = (LongSparseArray) obj;
    }
}
