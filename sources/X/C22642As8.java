package X;

import java.util.Enumeration;

/* renamed from: X.As8  reason: case insensitive filesystem */
public class C22642As8 extends AnonymousClass120 implements C219311y {
    public C219411z A00;
    public AnonymousClass122 A01;
    public boolean A02 = true;

    public C22642As8(C219411z r2, AnonymousClass122 r3) {
        this.A01 = r3;
        this.A00 = r2;
    }

    public C22642As8(C22656AsM asM) {
        Enumeration A0I = asM.A0I();
        this.A01 = (AnonymousClass122) A0I.nextElement();
        if (A0I.hasMoreElements()) {
            this.A00 = C22658AsO.A01((C22658AsO) A0I.nextElement());
        }
        this.A02 = asM instanceof C22673Asd;
    }

    public AnonymousClass121 Bve() {
        C202169lB A002 = C202169lB.A00();
        A002.A06(this.A01);
        C219411z r3 = this.A00;
        if (r3 != null) {
            A002.A06(new C22679Asj(r3, 0, true));
        }
        if (this.A02) {
            return new C22673Asd(A002);
        }
        return new C22674Ase(A002);
    }
}
