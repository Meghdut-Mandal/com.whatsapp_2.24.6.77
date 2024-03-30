package X;

/* renamed from: X.Aro  reason: case insensitive filesystem */
public class C22622Aro extends AnonymousClass120 {
    public int A00;
    public byte[] A01;

    public C22622Aro(byte[] bArr, int i) {
        this.A01 = AnonymousClass124.A02(bArr);
        this.A00 = i;
    }

    public C22622Aro(C22656AsM asM) {
        int i;
        this.A01 = C22659AsP.A03(C22656AsM.A02(asM));
        if (asM.A0H() == 2) {
            i = C22654AsK.A01(C22656AsM.A03(asM)).A0H();
        } else {
            i = 12;
        }
        this.A00 = i;
    }

    public AnonymousClass121 Bve() {
        C202169lB A002 = C202169lB.A00();
        A002.A06(new C22644AsA(this.A01));
        int i = this.A00;
        if (i != 12) {
            A002.A06(new C22654AsK((long) i));
        }
        return new C22675Asf(A002);
    }
}
