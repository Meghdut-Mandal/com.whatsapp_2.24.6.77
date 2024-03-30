package X;

public class ACJ implements C22942Ays, C17740rx {
    public AnonymousClass1AW A00;
    public C195739Vt A01;

    public void B24(C196159Xy r8, AnonymousClass3T1 r9) {
        C170918Hz r0;
        C18740tg.A0E(r9 instanceof C46872bo, AnonymousClass000.A0l(r9, "FMessageInteractiveProtocolSerializer: message type is not supported ", AnonymousClass000.A0u()));
        C46872bo r92 = (C46872bo) r9;
        C207219uk r1 = r92.A00;
        if (r1 != null) {
            this.A00.A00(r1).A0F(r8, r92);
            AnonymousClass8NL r6 = r8.A00;
            AnonymousClass8NF r5 = (AnonymousClass8NF) C170918Hz.A02(r6);
            AnonymousClass8ND r4 = (AnonymousClass8ND) C170918Hz.A0G(r5).A0q();
            r4.A0U();
            C195739Vt r3 = this.A01;
            AnonymousClass8SN r2 = (AnonymousClass8SN) r4.A00;
            if (r2.mediaCase_ == 4) {
                r0 = (C170918Hz) r2.media_;
            } else {
                r0 = AnonymousClass8SF.DEFAULT_INSTANCE;
            }
            C170918Hz.A0V(r4, r6, r5, C170918Hz.A0H(r4, r3.A00(r8, (AnonymousClass8NJ) r0.A0q(), r92)), 4);
        }
    }

    public ACJ(C195739Vt r1, AnonymousClass1AW r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
