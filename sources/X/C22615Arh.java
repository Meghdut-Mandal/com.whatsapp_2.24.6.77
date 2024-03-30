package X;

/* renamed from: X.Arh  reason: case insensitive filesystem */
public class C22615Arh extends AnonymousClass120 {
    public C22659AsP A00;
    public C22659AsP A01;
    public C22654AsK A02;
    public C22632Ary A03;

    public C22615Arh(C22654AsK asK, C22659AsP asP, C22659AsP asP2, C22632Ary ary) {
        this.A03 = ary;
        this.A01 = asP;
        this.A00 = asP2;
        this.A02 = asK;
    }

    public AnonymousClass121 Bve() {
        C202169lB r1 = new C202169lB(4);
        r1.A06(this.A03);
        r1.A06(this.A01);
        r1.A06(this.A00);
        return C202169lB.A01(this.A02, r1);
    }

    public C22615Arh(C22656AsM asM) {
        this.A03 = C22632Ary.A00(C22656AsM.A02(asM));
        this.A01 = (C22659AsP) C22656AsM.A03(asM);
        this.A00 = (C22659AsP) asM.A0J(2);
        this.A02 = (C22654AsK) asM.A0J(3);
    }
}
