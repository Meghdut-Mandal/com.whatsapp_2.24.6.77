package X;

/* renamed from: X.8u9  reason: invalid class name and case insensitive filesystem */
public class C185388u9 extends C118095nK implements B03, B04, B08 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C185388u9(C203399nx r2, C203399nx r3, int i) {
        int i2;
        this.A02 = i;
        if (i != 0) {
            C203399nx.A0A(r2, "iq");
            this.A00 = C203539oF.A01(r2, AQD.A00);
            i2 = 42;
        } else {
            C203399nx.A0A(r2, "iq");
            this.A00 = C203539oF.A01(r2, AQB.A00);
            i2 = 40;
        }
        this.A01 = C203539oF.A00(r2, C23213B9v.A00(r3, i2));
        this.A00 = r2;
    }

    public void Azx(C191839Er r5) {
        C52282pB r0;
        int i = this.A02;
        AnonymousClass9UD r02 = r5.A00;
        C30131Zi r2 = r02.A01;
        C28981Uw r1 = r02.A00;
        if (i != 0) {
            r0 = C52282pB.GEOSUSPENDED;
        } else {
            r0 = C52282pB.SUSPENDED;
        }
        r2.A04(r0, r1);
    }

    public void Azy(C191849Es r5) {
        C52282pB r0;
        int i = this.A02;
        AnonymousClass9UD r02 = r5.A00;
        C30131Zi r2 = r02.A01;
        C28981Uw r1 = r02.A00;
        if (i != 0) {
            r0 = C52282pB.GEOSUSPENDED;
        } else {
            r0 = C52282pB.SUSPENDED;
        }
        r2.A04(r0, r1);
    }

    public void B00(C191899Ex r5) {
        C52282pB r0;
        int i = this.A02;
        AnonymousClass9UD r02 = r5.A00;
        C30131Zi r2 = r02.A01;
        C28981Uw r1 = r02.A00;
        if (i != 0) {
            r0 = C52282pB.GEOSUSPENDED;
        } else {
            r0 = C52282pB.SUSPENDED;
        }
        r2.A04(r0, r1);
    }
}
