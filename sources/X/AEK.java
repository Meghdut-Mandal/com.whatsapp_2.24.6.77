package X;

public class AEK implements B1H {
    public final C22974AzQ A00;
    public final C194449Pt A01;
    public final /* synthetic */ C200959iX A02;

    public AEK(C22974AzQ azQ, C200959iX r2, C194449Pt r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = azQ;
    }

    public void BWg(C202059ky r2) {
        this.A00.Bf8(r2);
    }

    public void BiD(String str) {
        C200959iX r3 = this.A02;
        C194449Pt r6 = this.A01;
        C22974AzQ azQ = this.A00;
        r3.A08.A07("[Set PIN] called");
        C198799eD r5 = r3.A00;
        AnonymousClass8h7 r15 = new AnonymousClass8h7(azQ, r3, r6);
        String str2 = str;
        byte[] A002 = C198799eD.A00((Boolean) null, (Object) null, "CREATE", str2, (byte[]) null, new Object[0], C36371kC.A09(r5.A01));
        AnonymousClass1AL[] A0k = C165617ti.A0k();
        C36341k9.A1L("action", "create-payment-pin", A0k, 0);
        r5.A02.A0H(r15, new C203399nx(r6.A01(A002), "account", A0k), "set", AnonymousClass6X5.A0L);
    }
}
