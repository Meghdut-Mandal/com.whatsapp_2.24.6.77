package X;

/* renamed from: X.Ars  reason: case insensitive filesystem */
public class C22626Ars extends AnonymousClass120 {
    public static final C22654AsK A04 = new C22654AsK(20);
    public static final C22654AsK A05 = new C22654AsK(1);
    public static final C22632Ary A06;
    public static final C22632Ary A07;
    public C22632Ary A00 = A06;
    public C22654AsK A01 = A04;
    public C22654AsK A02 = A05;
    public C22632Ary A03 = A07;

    static {
        C22632Ary ary = new C22632Ary(C22590ArI.A00, AnonymousClass128.A07);
        A06 = ary;
        A07 = new C22632Ary(ary, C219311y.A1J);
    }

    public C22626Ars() {
    }

    public AnonymousClass121 Bve() {
        C202169lB r3 = new C202169lB(4);
        C22632Ary ary = this.A00;
        if (!ary.equals(A06)) {
            C202169lB.A02(ary, r3, 0, true);
        }
        C22632Ary ary2 = this.A03;
        if (!ary2.equals(A07)) {
            C202169lB.A03(ary2, r3, true);
        }
        C22654AsK asK = this.A01;
        if (!asK.A0G(A04)) {
            C202169lB.A02(asK, r3, 2, true);
        }
        C22654AsK asK2 = this.A02;
        if (!asK2.A0G(A05)) {
            C202169lB.A02(asK2, r3, 3, true);
        }
        return new C22675Asf(r3);
    }

    public C22626Ars(C22656AsM asM) {
        for (int i = 0; i != asM.A0H(); i++) {
            C22658AsO asO = (C22658AsO) asM.A0J(i);
            int i2 = asO.A00;
            if (i2 == 0) {
                this.A00 = C22632Ary.A00(C22656AsM.A05(asO, true));
            } else if (i2 == 1) {
                this.A03 = C22632Ary.A00(C22656AsM.A05(asO, true));
            } else if (i2 == 2) {
                this.A01 = C22654AsK.A01(C22658AsO.A01(asO));
            } else if (i2 == 3) {
                this.A02 = C22654AsK.A01(C22658AsO.A01(asO));
            } else {
                throw AnonymousClass001.A08("unknown tag");
            }
        }
    }
}
