package X;

/* renamed from: X.8PA  reason: invalid class name */
public final class AnonymousClass8PA extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8PA DEFAULT_INSTANCE;
    public static final int EXPIRY_TIMESTAMP_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SERVICE_TYPE_FIELD_NUMBER = 1;
    public int bitField0_;
    public long expiryTimestamp_;
    public int serviceType_;

    static {
        AnonymousClass8PA r1 = new AnonymousClass8PA();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8PA.class);
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
                A0e[1] = "serviceType_";
                A0e[2] = A72.A00;
                A0e[3] = "expiryTimestamp_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", A0e);
            case 3:
                return new AnonymousClass8PA();
            case 4:
                return new AnonymousClass8KB();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8PA.class) {
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
