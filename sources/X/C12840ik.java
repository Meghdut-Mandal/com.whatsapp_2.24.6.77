package X;

import java.util.Iterator;

/* renamed from: X.0ik  reason: invalid class name and case insensitive filesystem */
public final class C12840ik implements C16970qV, C17970sN {
    public final int A00;
    public final C16970qV A01;

    public C16970qV BvT(int i) {
        if (i >= this.A00) {
            return this;
        }
        return new C12840ik(this.A01, i);
    }

    public Iterator iterator() {
        return new C18570tN(this);
    }

    public C12840ik(C16970qV r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
