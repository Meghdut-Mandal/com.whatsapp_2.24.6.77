package X;

/* renamed from: X.8Ql  reason: invalid class name and case insensitive filesystem */
public final class C173118Ql extends C170918Hz implements C22901AyD {
    public static final C173118Ql DEFAULT_INSTANCE;
    public static final int ENC_IV_FIELD_NUMBER = 3;
    public static final int ENC_PAYLOAD_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SECRET_ENC_TYPE_FIELD_NUMBER = 4;
    public static final int TARGET_MESSAGE_KEY_FIELD_NUMBER = 1;
    public int bitField0_;
    public C21674AUx encIv_;
    public C21674AUx encPayload_;
    public int secretEncType_;
    public AnonymousClass8SW targetMessageKey_;

    static {
        C173118Ql r1 = new C173118Ql();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173118Ql.class);
    }

    public C173118Ql() {
        C21674AUx aUx = C21674AUx.A00;
        this.encPayload_ = aUx;
        this.encIv_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0g = C170918Hz.A0g();
                C170918Hz.A0a(A0g, "targetMessageKey_");
                A0g[4] = "secretEncType_";
                A0g[5] = A79.A00;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဌ\u0003", A0g);
            case 3:
                return new C173118Ql();
            case 4:
                return new AnonymousClass8KX();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173118Ql.class) {
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
