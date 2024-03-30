package X;

public class ACL implements C22942Ays, C17740rx {
    public C196049Xl A00;
    public AnonymousClass1AW A01;

    public void B24(C196159Xy r7, AnonymousClass3T1 r8) {
        C170918Hz r0;
        C18740tg.A0E(r8 instanceof C181778o1, C165567td.A0W(r8, "Message type is not supported ", AnonymousClass000.A0u()));
        C181778o1 r82 = (C181778o1) r8;
        C207219uk r1 = r82.A00;
        if (r1 != null) {
            this.A01.A00(r1).A0F(r7, r82);
            AnonymousClass8NL r5 = r7.A00;
            AnonymousClass8NF r4 = (AnonymousClass8NF) C170918Hz.A02(r5);
            AnonymousClass8ND r3 = (AnonymousClass8ND) C170918Hz.A0G(r4).A0q();
            r3.A0U();
            AnonymousClass8SN r2 = (AnonymousClass8SN) r3.A00;
            if (r2.mediaCase_ == 7) {
                r0 = (C170918Hz) r2.media_;
            } else {
                r0 = AnonymousClass8SE.DEFAULT_INSTANCE;
            }
            AnonymousClass8NH r12 = (AnonymousClass8NH) r0.A0q();
            this.A00.A02(r7, r12, r82);
            C170918Hz.A0V(r3, r5, r4, C170918Hz.A0H(r3, r12), 7);
        }
    }

    public ACL(C196049Xl r1, AnonymousClass1AW r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
