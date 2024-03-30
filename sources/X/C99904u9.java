package X;

/* renamed from: X.4u9  reason: invalid class name and case insensitive filesystem */
public final class C99904u9 extends C170918Hz implements C22901AyD {
    public static final int AES_K_FIELD_NUMBER = 1;
    public static final C99904u9 DEFAULT_INSTANCE;
    public static final int K_NONCE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER;
    public C21674AUx aesK_;
    public int bitField0_;
    public C21674AUx kNonce_;

    static {
        C99904u9 r1 = new C99904u9();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C99904u9.class);
    }

    public C99904u9() {
        C21674AUx aUx = C21674AUx.A00;
        this.aesK_ = aUx;
        this.kNonce_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(3);
                A1Z[1] = "aesK_";
                A1Z[2] = "kNonce_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", A1Z);
            case 3:
                return new C99904u9();
            case 4:
                return new C99724tr();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C99904u9.class) {
                    r0 = PARSER;
                    if (r0 == null) {
                        C201979ko r03 = C21072A7j.A01;
                        r0 = C90524aI.A0G(DEFAULT_INSTANCE);
                        PARSER = r0;
                    }
                }
                return r0;
            default:
                throw AnonymousClass001.A0D();
        }
    }
}
