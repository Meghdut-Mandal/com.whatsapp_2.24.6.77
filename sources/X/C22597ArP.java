package X;

/* renamed from: X.ArP  reason: case insensitive filesystem */
public class C22597ArP extends AnonymousClass120 {
    public C22655AsL A00;
    public C22615Arh A01;
    public C22637As3 A02;
    public C22655AsL A03;
    public C22608Ara A04;

    public AnonymousClass121 Bve() {
        C202169lB r3 = new C202169lB(5);
        r3.A06(this.A01);
        r3.A06(this.A02);
        r3.A06(this.A03);
        C22655AsL asL = this.A00;
        if (asL != null) {
            C202169lB.A02(asL, r3, 0, true);
        }
        C22608Ara ara = this.A04;
        if (ara != null) {
            C202169lB.A03(ara, r3, true);
        }
        return new C22675Asf(r3);
    }

    public C22597ArP(C22656AsM asM) {
        C22615Arh arh;
        C22637As3 as3;
        C22658AsO asO;
        C219411z A022 = C22656AsM.A02(asM);
        if (A022 instanceof C22615Arh) {
            arh = (C22615Arh) A022;
        } else if (A022 != null) {
            arh = new C22615Arh(C22656AsM.A04(A022));
        } else {
            arh = null;
        }
        this.A01 = arh;
        C219411z A0J = asM.A0J(1);
        if (A0J == null || (A0J instanceof C22637As3)) {
            as3 = (C22637As3) A0J;
        } else if (A0J instanceof C22658AsO) {
            as3 = new C22637As3((C22658AsO) A0J);
        } else {
            throw C165567td.A0N(A0J, "unknown object in factory: ", AnonymousClass000.A0u());
        }
        this.A02 = as3;
        this.A03 = C22655AsL.A05(asM.A0J(2));
        if (asM.A0H() > 4) {
            this.A00 = C22655AsL.A05(C22658AsO.A01((C22658AsO) asM.A0J(3)));
            asO = (C22658AsO) asM.A0J(4);
        } else if (asM.A0H() > 3) {
            asO = (C22658AsO) asM.A0J(3);
            if (asO.A00 == 0) {
                this.A00 = C22655AsL.A05(C22658AsO.A01(asO));
                return;
            }
        } else {
            return;
        }
        this.A04 = C22608Ara.A01(C22656AsM.A05(asO, true));
    }
}
