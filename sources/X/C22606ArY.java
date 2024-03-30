package X;

/* renamed from: X.ArY  reason: case insensitive filesystem */
public class C22606ArY extends AnonymousClass120 {
    public int A00;
    public boolean A01 = false;
    public C22586ArE A02;
    public C22632Ary A03;
    public C22599ArR A04;

    public AnonymousClass121 Bve() {
        C202169lB r1 = new C202169lB(3);
        r1.A06(this.A04);
        r1.A06(this.A03);
        return C202169lB.A01(this.A02, r1);
    }

    public int hashCode() {
        if (!this.A01) {
            this.A00 = super.hashCode();
            this.A01 = true;
        }
        return this.A00;
    }

    public C22606ArY(C22656AsM asM) {
        C22599ArR arR;
        if (asM.A0H() == 3) {
            C219411z A0J = asM.A0J(0);
            if (A0J instanceof C22599ArR) {
                arR = (C22599ArR) A0J;
            } else if (A0J != null) {
                arR = new C22599ArR(C22656AsM.A04(A0J));
            } else {
                arR = null;
            }
            this.A04 = arR;
            this.A03 = C22632Ary.A00(C22656AsM.A03(asM));
            this.A02 = C22586ArE.A01(asM.A0J(2));
            return;
        }
        throw AnonymousClass001.A08("sequence wrong size for CertificateList");
    }
}
