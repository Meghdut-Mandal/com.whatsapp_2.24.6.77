package X;

/* renamed from: X.8Qb  reason: invalid class name and case insensitive filesystem */
public final class C173018Qb extends C170918Hz implements C22901AyD {
    public static final int CHALLENGE_FIELD_NUMBER = 2;
    public static final C173018Qb DEFAULT_INSTANCE;
    public static final int ELLIPTICCURVE_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    public static final int SUPPORTEDPARAMETERS_FIELD_NUMBER = 4;
    public C21674AUx challenge_;
    public int keyTypeCase_ = 0;
    public Object keyType_;
    public C21674AUx publicKey_;
    public int supportedParameters_;

    static {
        C173018Qb r1 = new C173018Qb();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173018Qb.class);
    }

    public C173018Qb() {
        C21674AUx aUx = C21674AUx.A00;
        this.publicKey_ = aUx;
        this.challenge_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003?\u0000\u0004\u000b", new Object[]{"keyType_", "keyTypeCase_", "publicKey_", "challenge_", "supportedParameters_"});
            case 3:
                return new C173018Qb();
            case 4:
                return new C170958Id();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173018Qb.class) {
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
