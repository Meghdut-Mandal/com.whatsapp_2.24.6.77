package X;

/* renamed from: X.8Po  reason: invalid class name and case insensitive filesystem */
public final class C172888Po extends C170918Hz implements C22901AyD {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 3;
    public static final C172888Po DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    public static final int HMAC_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER;
    public int accountType_;
    public int bitField0_;
    public C21674AUx details_;
    public C21674AUx hmac_;

    static {
        C172888Po r1 = new C172888Po();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172888Po.class);
    }

    public C172888Po() {
        C21674AUx aUx = C21674AUx.A00;
        this.details_ = aUx;
        this.hmac_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0f = C170918Hz.A0f();
                A0f[1] = "details_";
                A0f[2] = "hmac_";
                A0f[3] = "accountType_";
                A0f[4] = A6W.A00;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဌ\u0002", A0f);
            case 3:
                return new C172888Po();
            case 4:
                return new C171048Im();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172888Po.class) {
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