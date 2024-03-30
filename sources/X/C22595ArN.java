package X;

/* renamed from: X.ArN  reason: case insensitive filesystem */
public class C22595ArN extends AnonymousClass120 {
    public C22655AsL A00;
    public C22628Aru A01;

    public C22595ArN(C22656AsM asM) {
        this.A00 = C22655AsL.A05(C22656AsM.A02(asM));
        if (asM.A0H() > 1) {
            this.A01 = C22628Aru.A00(C22652AsI.A01(C22658AsO.A01((C22658AsO) asM.A0J(1))));
        }
    }

    public AnonymousClass121 Bve() {
        C202169lB A002 = C202169lB.A00();
        A002.A06(this.A00);
        C22628Aru aru = this.A01;
        if (aru != null) {
            C202169lB.A02(aru, A002, 0, true);
        }
        return new C22675Asf(A002);
    }
}
