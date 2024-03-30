package X;

import android.util.LongSparseArray;

/* renamed from: X.0k8  reason: invalid class name and case insensitive filesystem */
public final class C13600k8 extends C12270hm {
    public int A00;
    public final /* synthetic */ LongSparseArray A01;

    public C13600k8(LongSparseArray longSparseArray) {
        this.A01 = longSparseArray;
    }

    public long A00() {
        LongSparseArray longSparseArray = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return longSparseArray.keyAt(i);
    }

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01.size());
    }
}
