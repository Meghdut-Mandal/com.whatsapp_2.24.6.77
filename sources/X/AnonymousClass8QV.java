package X;

/* renamed from: X.8QV  reason: invalid class name */
public final class AnonymousClass8QV extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8QV DEFAULT_INSTANCE;
    public static final int DEVICEPUBLICKEY_FIELD_NUMBER = 4;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 3;
    public C21674AUx devicePublicKey_;
    public int error_;
    public int nonce_;
    public C21674AUx serviceUUID_;

    static {
        AnonymousClass8QV r1 = new AnonymousClass8QV();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8QV.class);
    }

    public AnonymousClass8QV() {
        C21674AUx aUx = C21674AUx.A00;
        this.serviceUUID_ = aUx;
        this.devicePublicKey_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0h = C170918Hz.A0h(4);
                A0h[1] = "error_";
                A0h[2] = "serviceUUID_";
                A0h[3] = "devicePublicKey_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n\u0004\n", A0h);
            case 3:
                return new AnonymousClass8QV();
            case 4:
                return new AnonymousClass8IW();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8QV.class) {
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
