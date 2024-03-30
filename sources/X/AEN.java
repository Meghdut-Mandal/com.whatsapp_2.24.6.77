package X;

public class AEN implements B1I {
    public final /* synthetic */ C198279dC A00;
    public final /* synthetic */ C194449Pt A01;
    public final /* synthetic */ C194739Ra A02;

    public AEN(C198279dC r1, C194449Pt r2, C194739Ra r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BWg(C202059ky r2) {
        this.A02.A00(r2);
    }

    public void BiL(String[] strArr) {
        C198279dC r7 = this.A00;
        C29121Vk r0 = r7.A03;
        AnonymousClass1AL[] r4 = new AnonymousClass1AL[4];
        r4[1] = new AnonymousClass1AL("token", strArr[C36371kC.A1Y("action", "reset-payment-pin", r4)]);
        C36351kA.A1N("credential-id", r7.A0A, r4);
        C36361kB.A1Q("device-id", r7.A09.A01(), r4);
        C198799eD r1 = r7.A08;
        C194449Pt r8 = this.A01;
        C203399nx r12 = new C203399nx(r8.A01(C198799eD.A00((Boolean) null, (Object) null, "RESET", strArr[1], (byte[]) null, C90524aI.A0w(), C36371kC.A09(r1.A01))), "account", r4);
        C194739Ra r6 = this.A02;
        r0.A0H(new B7K(r7.A00, r7.A02, r7.A01, r6, r7, r8, 5), r12, "set", AnonymousClass6X5.A0L);
    }
}
