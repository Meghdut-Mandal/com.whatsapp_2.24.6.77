package X;

/* renamed from: X.7qT  reason: invalid class name and case insensitive filesystem */
public class C163607qT implements AnonymousClass7h8 {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C163607qT(C95384kj r1, int i, boolean z) {
        this.A02 = i;
        this.A00 = r1;
        this.A01 = z;
    }

    public final void BZO(Object obj) {
        AnonymousClass6OF r1;
        int i;
        int i2 = this.A02;
        C95384kj r2 = (C95384kj) this.A00;
        boolean z = this.A01;
        C144416s9 r4 = (C144416s9) obj;
        if (i2 == 0) {
            if (z) {
                r1 = r2.A0F;
                i = 8;
            }
            r2.A02 = r4;
            C36341k9.A17(r2.A0I, 6);
        } else if (z) {
            r1 = r2.A0F;
            i = 10;
        } else {
            return;
        }
        r1.A01(i);
        r2.A02 = r4;
        C36341k9.A17(r2.A0I, 6);
    }
}
