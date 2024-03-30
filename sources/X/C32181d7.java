package X;

/* renamed from: X.1d7  reason: invalid class name and case insensitive filesystem */
public class C32181d7 {
    public C21860zv A00;
    public AnonymousClass1JR A01;

    public void A00(AnonymousClass02E r4, boolean z, boolean z2) {
        AnonymousClass1JR r1;
        int i;
        C21860zv r2 = this.A00;
        if (r2 != null && z != z2) {
            if (z2) {
                r2.A02(r4.getClass().getSimpleName(), "visible");
                r1 = this.A01;
                i = 1;
            } else {
                r1 = this.A01;
                i = 2;
            }
            r1.A00(r4, i);
        }
    }

    public C32181d7(C21860zv r1, AnonymousClass1JR r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
