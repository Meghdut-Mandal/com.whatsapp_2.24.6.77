package X;

/* renamed from: X.ArR  reason: case insensitive filesystem */
public class C22599ArR extends AnonymousClass120 {
    public C22654AsK A00;
    public C22656AsM A01;
    public C22641As7 A02;
    public C22632Ary A03;
    public C22608Ara A04;
    public C22639As5 A05;
    public C22639As5 A06;

    public AnonymousClass121 Bve() {
        C202169lB r2 = new C202169lB(7);
        C22654AsK asK = this.A00;
        if (asK != null) {
            r2.A06(asK);
        }
        r2.A06(this.A03);
        r2.A06(this.A02);
        r2.A06(this.A06);
        C22639As5 as5 = this.A05;
        if (as5 != null) {
            r2.A06(as5);
        }
        C22656AsM asM = this.A01;
        if (asM != null) {
            r2.A06(asM);
        }
        C22608Ara ara = this.A04;
        if (ara != null) {
            r2.A06(new C22681Asl(ara));
        }
        return new C22675Asf(r2);
    }

    public C22599ArR(C22656AsM asM) {
        if (asM.A0H() < 3 || asM.A0H() > 7) {
            throw C22656AsM.A01(asM);
        }
        int i = 0;
        if (asM.A0J(0) instanceof C22654AsK) {
            this.A00 = C22654AsK.A01(asM.A0J(0));
            i = 1;
        }
        int i2 = i + 1;
        this.A03 = C22632Ary.A00(asM.A0J(i));
        int i3 = i2 + 1;
        this.A02 = C22641As7.A01(asM.A0J(i2));
        int i4 = i3 + 1;
        this.A06 = C22639As5.A00(asM.A0J(i3));
        if (i4 < asM.A0H() && ((asM.A0J(i4) instanceof C22650AsG) || (asM.A0J(i4) instanceof C22655AsL) || (asM.A0J(i4) instanceof C22639As5))) {
            this.A05 = C22639As5.A00(asM.A0J(i4));
            i4++;
        }
        if (i4 < asM.A0H() && !(asM.A0J(i4) instanceof C22658AsO)) {
            this.A01 = C22656AsM.A04(asM.A0J(i4));
            i4++;
        }
        if (i4 < asM.A0H() && (asM.A0J(i4) instanceof C22658AsO)) {
            this.A04 = C22608Ara.A01(C22656AsM.A05((C22658AsO) asM.A0J(i4), true));
        }
    }
}
