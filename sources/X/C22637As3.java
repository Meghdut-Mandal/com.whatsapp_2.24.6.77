package X;

/* renamed from: X.As3  reason: case insensitive filesystem */
public class C22637As3 extends AnonymousClass120 implements C16580pk {
    public int A00;
    public C219411z A01;

    public C22637As3() {
        this.A00 = 0;
        this.A01 = C22590ArI.A00;
    }

    public AnonymousClass121 Bve() {
        return new C22681Asl(this.A01, this.A00, false);
    }

    public C22637As3(C22658AsO asO) {
        C219411z r1;
        int i = asO.A00;
        this.A00 = i;
        if (i != 0) {
            if (i == 1) {
                C22656AsM A05 = C22656AsM.A05(asO, false);
                if (A05 != null) {
                    r1 = new C22595ArN(C22656AsM.A04(A05));
                } else {
                    r1 = null;
                }
                this.A01 = r1;
            } else if (i != 2) {
                throw AnonymousClass000.A0d("Unknown tag encountered: ", AnonymousClass000.A0u(), i);
            }
        }
        r1 = C22590ArI.A00;
        this.A01 = r1;
    }
}
