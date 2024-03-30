package X;

/* renamed from: X.Arg  reason: case insensitive filesystem */
public class C22614Arg extends AnonymousClass120 {
    public C22656AsM A00;
    public C22586ArE A01;
    public C22627Art A02;
    public C22632Ary A03;

    public AnonymousClass121 Bve() {
        C202169lB r3 = new C202169lB(4);
        r3.A06(this.A02);
        r3.A06(this.A03);
        r3.A06(this.A01);
        C22656AsM asM = this.A00;
        if (asM != null) {
            C202169lB.A02(asM, r3, 0, true);
        }
        return new C22675Asf(r3);
    }

    public C22614Arg(C22656AsM asM) {
        C22627Art art;
        C219411z A022 = C22656AsM.A02(asM);
        C22654AsK asK = C22627Art.A06;
        if (A022 instanceof C22627Art) {
            art = (C22627Art) A022;
        } else if (A022 != null) {
            art = new C22627Art(C22656AsM.A04(A022));
        } else {
            art = null;
        }
        this.A02 = art;
        this.A03 = C22632Ary.A00(asM.A0J(1));
        this.A01 = (C22586ArE) asM.A0J(2);
        if (asM.A0H() > 3) {
            this.A00 = C22656AsM.A05((C22658AsO) asM.A0J(3), true);
        }
    }
}
