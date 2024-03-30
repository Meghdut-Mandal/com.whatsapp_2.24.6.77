package X;

/* renamed from: X.8Ps  reason: invalid class name and case insensitive filesystem */
public final class C172928Ps extends C170918Hz implements C22901AyD {
    public static final C172928Ps DEFAULT_INSTANCE;
    public static final int FINGERPRINT_FIELD_NUMBER = 2;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    public int bitField0_;
    public AnonymousClass8QY fingerprint_;
    public C21674AUx keyData_ = C21674AUx.A00;
    public long timestamp_;

    static {
        C172928Ps r1 = new C172928Ps();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172928Ps.class);
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
                A0e[1] = "keyData_";
                A0e[2] = "fingerprint_";
                A0e[3] = "timestamp_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ဂ\u0002", A0e);
            case 3:
                return new C172928Ps();
            case 4:
                return new AnonymousClass8JE();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172928Ps.class) {
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
