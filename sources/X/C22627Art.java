package X;

/* renamed from: X.Art  reason: case insensitive filesystem */
public class C22627Art extends AnonymousClass120 {
    public static final C22654AsK A06 = new C22654AsK(0);
    public C22656AsM A00;
    public C22636As2 A01;
    public C22608Ara A02;
    public C22655AsL A03;
    public C22654AsK A04;
    public boolean A05;

    public AnonymousClass121 Bve() {
        C202169lB r3 = new C202169lB(5);
        if (this.A05 || !this.A04.A0G(A06)) {
            C202169lB.A02(this.A04, r3, 0, true);
        }
        r3.A06(this.A01);
        r3.A06(this.A03);
        r3.A06(this.A00);
        C22608Ara ara = this.A02;
        if (ara != null) {
            C202169lB.A03(ara, r3, true);
        }
        return new C22675Asf(r3);
    }

    public C22627Art(C22656AsM asM) {
        C22641As7 A012;
        C22636As2 as2;
        C22659AsP A022;
        C22636As2 as22;
        int i = 0;
        if (!(asM.A0J(0) instanceof C22658AsO) || ((C22658AsO) asM.A0J(0)).A00 != 0) {
            this.A04 = A06;
        } else {
            this.A05 = true;
            this.A04 = C22654AsK.A01(C22658AsO.A01((C22658AsO) asM.A0J(0)));
            i = 1;
        }
        int i2 = i + 1;
        C219411z A0J = asM.A0J(i);
        if (A0J instanceof C22636As2) {
            as22 = (C22636As2) A0J;
        } else {
            if (A0J instanceof C22644AsA) {
                A022 = (C22659AsP) A0J;
            } else {
                if (A0J instanceof C22658AsO) {
                    C22658AsO asO = (C22658AsO) A0J;
                    if (asO.A00 == 1) {
                        C200109gd r0 = C22641As7.A05;
                        A012 = C22641As7.A01(C22656AsM.A05(asO, true));
                    } else {
                        A022 = C22659AsP.A02(asO, true);
                    }
                } else {
                    A012 = C22641As7.A01(A0J);
                }
                as2 = new C22636As2(A012);
                as22 = as2;
            }
            as2 = new C22636As2(A022);
            as22 = as2;
        }
        this.A01 = as22;
        int i3 = i2 + 1;
        this.A03 = C22655AsL.A05(asM.A0J(i2));
        int i4 = i3 + 1;
        this.A00 = (C22656AsM) asM.A0J(i3);
        if (asM.A0H() > i4) {
            this.A02 = C22608Ara.A01(C22656AsM.A05((C22658AsO) asM.A0J(i4), true));
        }
    }
}
