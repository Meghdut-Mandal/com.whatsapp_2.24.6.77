package X;

import java.util.RandomAccess;

/* renamed from: X.0jy  reason: invalid class name and case insensitive filesystem */
public final class C13500jy<E> extends C001100m<E> implements RandomAccess {
    public int A00;
    public final int A01;
    public final C001100m A02;

    public Object get(int i) {
        AnonymousClass0YP.A01(i, this.A00);
        return this.A02.get(this.A01 + i);
    }

    public C13500jy(C001100m r2, int i, int i2) {
        this.A02 = r2;
        this.A01 = i;
        AnonymousClass0YP.A03(i, i2, r2.size());
        this.A00 = i2 - i;
    }

    public int A08() {
        return this.A00;
    }
}
