package X;

public final class ABG implements C22938Ayo, C22942Ays, C17740rx {
    public void B24(C196159Xy r4, AnonymousClass3T1 r5) {
        C36321k7.A0w(r5, r4);
        if (r5 instanceof AnonymousClass2bD) {
            AnonymousClass8NL r2 = r4.A00;
            AnonymousClass8NE A0J = C170918Hz.A0J(r2);
            A0J.A0U(AnonymousClass91G.REQUEST_WELCOME_MESSAGE);
            r2.A0c(A0J);
            return;
        }
        throw AnonymousClass001.A08("FMessageRequestWelcomeProtobuf/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r5) {
        AnonymousClass8SX A00 = AnonymousClass9YL.A00(r5);
        if (!A00.A0y()) {
            return null;
        }
        AnonymousClass8SQ r1 = A00.protocolMessage_;
        if (r1 == null) {
            r1 = AnonymousClass8SQ.DEFAULT_INSTANCE;
        }
        if ((r1.bitField0_ & 2) == 0 || C170918Hz.A0K(r1) != AnonymousClass91G.REQUEST_WELCOME_MESSAGE) {
            return null;
        }
        return new AnonymousClass2bD(r5.A0C, r5.A04);
    }
}
