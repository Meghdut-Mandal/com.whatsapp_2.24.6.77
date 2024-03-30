package X;

public abstract class ABS implements C22938Ayo, C22942Ays, C17740rx {
    public void A00(AnonymousClass8NG r3, AnonymousClass2bO r4) {
        C64933Qa r1 = r4.A1J;
        AnonymousClass8NG.A01(r1.A00, r3, r1);
        String str = r4.A01;
        if (str == null) {
            str = r1.A01;
        }
        r3.A0V(str);
    }

    public void B24(C196159Xy r4, AnonymousClass3T1 r5) {
        if (r5 instanceof AnonymousClass2bO) {
            AnonymousClass2bO r52 = (AnonymousClass2bO) r5;
            AnonymousClass8NL r2 = r4.A00;
            AnonymousClass8NE A0J = C170918Hz.A0J(r2);
            AnonymousClass8SW r0 = ((AnonymousClass8SQ) A0J.A00).key_;
            if (r0 == null) {
                r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            AnonymousClass8NG A0Q = C170918Hz.A0Q(r0);
            A00(A0Q, r52);
            A0J.A0V(A0Q);
            A0J.A0U(AnonymousClass91G.REVOKE);
            r2.A0c(A0J);
            return;
        }
        throw AnonymousClass001.A08("FMessageRevokedProtobuf/not supported message");
    }
}
