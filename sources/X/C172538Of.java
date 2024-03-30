package X;

/* renamed from: X.8Of  reason: invalid class name and case insensitive filesystem */
public final class C172538Of extends C170918Hz implements C22901AyD {
    public static final C172538Of DEFAULT_INSTANCE;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public int nonce_;
    public int reason_;

    static {
        C172538Of r1 = new C172538Of();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172538Of.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0h = C170918Hz.A0h(2);
                A0h[1] = "reason_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\f", A0h);
            case 3:
                return new C172538Of();
            case 4:
                return new AnonymousClass8IJ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172538Of.class) {
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
