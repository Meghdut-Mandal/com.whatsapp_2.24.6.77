package X;

/* renamed from: X.8Pw  reason: invalid class name and case insensitive filesystem */
public final class C172968Pw extends C170918Hz implements C22901AyD {
    public static final C172968Pw DEFAULT_INSTANCE;
    public static final int ENC_IV_FIELD_NUMBER = 3;
    public static final int ENC_PAYLOAD_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int TARGET_MESSAGE_KEY_FIELD_NUMBER = 1;
    public int bitField0_;
    public C21674AUx encIv_;
    public C21674AUx encPayload_;
    public AnonymousClass8SW targetMessageKey_;

    static {
        C172968Pw r1 = new C172968Pw();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172968Pw.class);
    }

    public C172968Pw() {
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
                Object[] A0e = C170918Hz.A0e();
                C170918Hz.A0a(A0e, "targetMessageKey_");
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", A0e);
            case 3:
                return new C172968Pw();
            case 4:
                return new AnonymousClass8JX();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172968Pw.class) {
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
