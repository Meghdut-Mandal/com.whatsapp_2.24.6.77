package X;

public class BAB implements AnonymousClass04S {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public BAB(C001600r r1, AnonymousClass08S r2, C22996Azm azm, int i, boolean z) {
        this.A04 = i;
        this.A00 = r1;
        this.A03 = z;
        this.A01 = r2;
        this.A02 = azm;
    }

    public final void BTH(Object obj) {
        Object B16;
        int i = this.A04;
        boolean z = this.A03;
        C001600r r2 = (C001600r) this.A01;
        C22996Azm azm = (C22996Azm) this.A02;
        Object A042 = ((C001600r) this.A00).A04();
        if (i != 0) {
            if (z || !(A042 == null || obj == null)) {
                B16 = azm.B16(A042, obj);
            } else {
                return;
            }
        } else if (z || !(obj == null || A042 == null)) {
            B16 = azm.B16(obj, A042);
        } else {
            return;
        }
        r2.A0D(B16);
    }
}
