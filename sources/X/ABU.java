package X;

public class ABU implements C22938Ayo, C22942Ays, C17740rx {
    public final C20810yC A00;

    public void B24(C196159Xy r7, AnonymousClass3T1 r8) {
        if (r8 instanceof AnonymousClass2bH) {
            AnonymousClass2bH r82 = (AnonymousClass2bH) r8;
            C64933Qa r5 = r82.A1J;
            int i = r82.A00;
            AnonymousClass8NL r3 = r7.A00;
            AnonymousClass8NE A0J = C170918Hz.A0J(r3);
            AnonymousClass8SW r0 = ((AnonymousClass8SQ) A0J.A00).key_;
            if (r0 == null) {
                r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            AnonymousClass8NG A0Q = C170918Hz.A0Q(r0);
            AnonymousClass8NG.A01(r5.A00, A0Q, r5);
            A0J.A0V(A0Q);
            AnonymousClass8SQ A0A = AnonymousClass8NN.A0A(A0J);
            A0A.bitField0_ |= 4;
            A0A.ephemeralExpiration_ = i;
            A0J.A0U(AnonymousClass91G.EPHEMERAL_SETTING);
            if (this.A00.A0E(5309)) {
                AnonymousClass8NB r1 = (AnonymousClass8NB) AnonymousClass8SK.DEFAULT_INSTANCE.A0p();
                r1.A0V(AnonymousClass9Zc.A01(r82.A04));
                Boolean bool = r82.A0d;
                if (bool != null) {
                    r1.A0W(bool.booleanValue());
                }
                AnonymousClass8SK r02 = (AnonymousClass8SK) r1.A0R();
                AnonymousClass8SQ A0A2 = AnonymousClass8NN.A0A(A0J);
                r02.getClass();
                A0A2.disappearingMode_ = r02;
                A0A2.bitField0_ |= 512;
            }
            r3.A0c(A0J);
            return;
        }
        throw AnonymousClass001.A08("FMessageEphemeralSettingChangeProtobuf not supported message");
    }

    public ABU(C20810yC r1) {
        this.A00 = r1;
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r9) {
        boolean z;
        if (AnonymousClass97T.A00(r9) != AnonymousClass91G.EPHEMERAL_SETTING) {
            return null;
        }
        AnonymousClass8SQ A0L = C170918Hz.A0L(r9);
        AnonymousClass2bH r3 = new AnonymousClass2bH(r9.A0C, r9.A04);
        int i = A0L.ephemeralExpiration_;
        r3.A1X(Integer.valueOf(i));
        AnonymousClass8SK r0 = A0L.disappearingMode_;
        if (r0 == null) {
            r0 = AnonymousClass8SK.DEFAULT_INSTANCE;
        }
        AnonymousClass919 A002 = AnonymousClass919.A00(r0.trigger_);
        if (A002 == null) {
            A002 = AnonymousClass919.UNKNOWN;
        }
        int A003 = AnonymousClass9Zc.A00(A002);
        C20810yC r2 = this.A00;
        if (r2.A0E(5309)) {
            if (i > 0) {
                r3.A04 = A003;
                AnonymousClass8SK r02 = A0L.disappearingMode_;
                AnonymousClass8SK r4 = r02;
                if (r02 == null) {
                    r02 = AnonymousClass8SK.DEFAULT_INSTANCE;
                }
                boolean z2 = r02.initiatedByMe_;
                if (Boolean.valueOf(z2) != null) {
                    boolean z3 = r3.A1J.A02;
                    r3.A0d = Boolean.valueOf(AnonymousClass000.A1S(z3 ? 1 : 0, z2 ? 1 : 0));
                }
                if (r4 == null) {
                    r4 = AnonymousClass8SK.DEFAULT_INSTANCE;
                }
                int i2 = r4.A0u().value;
                if (A003 == 0) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            r3.A04 = 2;
                            z = true;
                        } else if (i2 == 2) {
                            r3.A04 = 2;
                            z = false;
                        }
                        r3.A0d = z;
                    } else {
                        r3.A04 = 1;
                        r3.A0d = null;
                        return r3;
                    }
                }
                return r3;
            }
            r3.A04 = 0;
            r3.A0d = null;
        }
        if (i == 0 && A003 == 4 && r2.A0E(5968)) {
            r3.A04 = 4;
            return r3;
        }
        return r3;
    }
}
