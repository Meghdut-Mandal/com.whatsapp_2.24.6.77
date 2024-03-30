package X;

public class ABQ implements C22938Ayo, C22942Ays, C17740rx {
    public void B24(C196159Xy r4, AnonymousClass3T1 r5) {
        if (r5 instanceof AnonymousClass2bE) {
            AnonymousClass8NL r2 = r4.A00;
            AnonymousClass8NE A0J = C170918Hz.A0J(r2);
            A0J.A0U(AnonymousClass91G.SHARE_PHONE_NUMBER);
            r2.A0d((AnonymousClass8SQ) A0J.A0R());
            return;
        }
        throw AnonymousClass001.A08("FMessageSharePhoneNumberProtobuf/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r5) {
        AnonymousClass8SX r1 = r5.A0A;
        if (!r1.A0y()) {
            return null;
        }
        AnonymousClass8SQ r12 = r1.protocolMessage_;
        if (r12 == null) {
            r12 = AnonymousClass8SQ.DEFAULT_INSTANCE;
        }
        if ((r12.bitField0_ & 2) == 0 || C170918Hz.A0K(r12) != AnonymousClass91G.SHARE_PHONE_NUMBER) {
            return null;
        }
        return new AnonymousClass2bE(r5.A0C, r5.A04);
    }
}
