package X;

public final class AD1 implements B14 {
    public static final Integer A00(AnonymousClass8SU r5) {
        int i;
        AnonymousClass91B A00 = AnonymousClass91B.A00(r5.status_);
        if (A00 == null) {
            A00 = AnonymousClass91B.PENDING;
        }
        AnonymousClass8SW r0 = r5.key_;
        if (r0 == null) {
            r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
        }
        if (r0.fromMe_) {
            int ordinal = A00.ordinal();
            if (ordinal != 5) {
                i = 7;
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        return 4;
                    }
                    i = 5;
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            return 0;
                        }
                        i = 13;
                    }
                }
            } else {
                i = 8;
            }
            return Integer.valueOf(i);
        } else if (A00.ordinal() == 5) {
            return C36401kF.A0i();
        } else {
            return null;
        }
    }

    public void Bd3(AnonymousClass6CO r3, AnonymousClass8NK r4, AnonymousClass3T1 r5) {
        AnonymousClass91B r0;
        C36321k7.A0w(r5, r4);
        if (!C1899696h.A00(r4, r5)) {
            int i = r5.A0D;
            if (!r5.A1J.A02) {
                if (!(i == 9 || i == 10)) {
                    return;
                }
                r0 = AnonymousClass91B.PLAYED;
            } else {
                if (i != 0) {
                    if (i == 13) {
                        r0 = AnonymousClass91B.READ;
                    } else if (i != 21) {
                        if (i == 4) {
                            r0 = AnonymousClass91B.SERVER_ACK;
                        } else if (i == 5) {
                            r0 = AnonymousClass91B.DELIVERY_ACK;
                        } else if (i != 7) {
                            if (i != 8) {
                                r0 = AnonymousClass91B.PENDING;
                            }
                            r0 = AnonymousClass91B.PLAYED;
                        }
                    }
                }
                r0 = AnonymousClass91B.ERROR;
            }
            AnonymousClass8SU A0J = AnonymousClass8NN.A0J(r4);
            A0J.status_ = r0.value;
            A0J.bitField0_ |= 8;
        }
    }

    public void Bd4(C1275768v r2, AnonymousClass8SU r3, AnonymousClass3T1 r4) {
        Integer A00;
        C36321k7.A0w(r3, r4);
        if (r4.A0D == 0 && (A00 = A00(r3)) != null) {
            r4.A0n(A00.intValue());
        }
    }
}
