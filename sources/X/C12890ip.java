package X;

/* renamed from: X.0ip  reason: invalid class name and case insensitive filesystem */
public final class C12890ip implements AnonymousClass03l {
    public long A00;
    public final Object A01;
    public final C023509x A02;
    public final C15350nC A03;

    public void dispose() {
        C15350nC r6 = this.A03;
        synchronized (r6) {
            long j = this.A00;
            if (j >= Math.min(r6.A02, r6.A03)) {
                Object[] objArr = r6.A04;
                AnonymousClass00C.A0B(objArr);
                int length = (objArr.length - 1) & ((int) j);
                if (objArr[length] == this) {
                    objArr[length] = AnonymousClass0RX.A00;
                    C15350nC.A06(r6);
                }
            }
        }
    }

    public C12890ip(Object obj, C023509x r2, C15350nC r3, long j) {
        this.A03 = r3;
        this.A00 = j;
        this.A01 = obj;
        this.A02 = r2;
    }
}
