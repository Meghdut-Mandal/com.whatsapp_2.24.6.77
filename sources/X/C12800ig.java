package X;

import java.util.Iterator;

/* renamed from: X.0ig  reason: invalid class name and case insensitive filesystem */
public final class C12800ig implements C16970qV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C16970qV A02;

    public C12800ig(C16970qV r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public Iterator iterator() {
        return C05570Qf.A00(this.A02.iterator(), this.A00, this.A01);
    }
}
