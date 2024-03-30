package X;

/* renamed from: X.8R6  reason: invalid class name */
public final class AnonymousClass8R6 extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8R6 DEFAULT_INSTANCE;
    public static final int ISSUER_SERIAL_FIELD_NUMBER = 2;
    public static final int KEY_FIELD_NUMBER = 3;
    public static final int NOT_AFTER_FIELD_NUMBER = 5;
    public static final int NOT_BEFORE_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SERIAL_FIELD_NUMBER = 1;
    public int bitField0_;
    public int issuerSerial_;
    public C21674AUx key_ = C21674AUx.A00;
    public long notAfter_;
    public long notBefore_;
    public int serial_;

    static {
        AnonymousClass8R6 r1 = new AnonymousClass8R6();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8R6.class);
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
                A0g[1] = "serial_";
                A0g[2] = "issuerSerial_";
                A0g[3] = "key_";
                A0g[4] = "notBefore_";
                A0g[5] = "notAfter_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ဃ\u0003\u0005ဃ\u0004", A0g);
            case 3:
                return new AnonymousClass8R6();
            case 4:
                return new C171088Iq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8R6.class) {
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
