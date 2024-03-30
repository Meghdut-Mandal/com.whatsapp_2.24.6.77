package X;

/* renamed from: X.8P2  reason: invalid class name */
public final class AnonymousClass8P2 extends C170918Hz implements C22901AyD {
    public static final int AMOUNT_1000_FIELD_NUMBER = 2;
    public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
    public static final AnonymousClass8P2 DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER;
    public long amount1000_;
    public int bitField0_;
    public String currencyCode_ = "";

    static {
        AnonymousClass8P2 r1 = new AnonymousClass8P2();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8P2.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0d = C170918Hz.A0d();
                A0d[1] = "currencyCode_";
                A0d[2] = "amount1000_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", A0d);
            case 3:
                return new AnonymousClass8P2();
            case 4:
                return new C171248Jg();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8P2.class) {
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
