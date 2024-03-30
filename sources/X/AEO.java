package X;

public class AEO implements B1I {
    public final C22974AzQ A00;
    public final C194449Pt A01;
    public final /* synthetic */ C200959iX A02;

    public AEO(C22974AzQ azQ, C200959iX r2, C194449Pt r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = azQ;
    }

    public void BWg(C202059ky r2) {
        this.A00.Bf8(r2);
    }

    public void BiL(String[] strArr) {
        C200959iX r1 = this.A02;
        C194449Pt r5 = this.A01;
        String A0a = C165617ti.A0a(strArr);
        String str = strArr[1];
        C22974AzQ azQ = this.A00;
        C198799eD r6 = r1.A00;
        AnonymousClass8h6 r4 = new AnonymousClass8h6(azQ, r1, r5);
        byte[] A002 = C198799eD.A00(true, A0a, "CHANGE", str, (byte[]) null, new Object[0], C36371kC.A09(r6.A01));
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[1];
        C36341k9.A1L("action", "change-payment-pin", r2, 0);
        C194449Pt.A00(r5, r6, r4, A002, r2);
    }
}
