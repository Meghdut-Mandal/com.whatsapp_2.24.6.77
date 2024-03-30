package X;

/* renamed from: X.8Pp  reason: invalid class name and case insensitive filesystem */
public final class C172898Pp extends C170918Hz implements C22901AyD {
    public static final int ACCOUNT_SIGNATURE_FIELD_NUMBER = 2;
    public static final int ACCOUNT_SIGNATURE_KEY_FIELD_NUMBER = 3;
    public static final C172898Pp DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER;
    public C21674AUx accountSignatureKey_;
    public C21674AUx accountSignature_;
    public int bitField0_;
    public C21674AUx details_;

    static {
        C172898Pp r1 = new C172898Pp();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172898Pp.class);
    }

    public C172898Pp() {
        C21674AUx aUx = C21674AUx.A00;
        this.details_ = aUx;
        this.accountSignature_ = aUx;
        this.accountSignatureKey_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0e = C170918Hz.A0e();
                A0e[1] = "details_";
                A0e[2] = "accountSignature_";
                A0e[3] = "accountSignatureKey_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", A0e);
            case 3:
                return new C172898Pp();
            case 4:
                return new C171058In();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172898Pp.class) {
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
