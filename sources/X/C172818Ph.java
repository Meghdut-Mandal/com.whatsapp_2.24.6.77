package X;

/* renamed from: X.8Ph  reason: invalid class name and case insensitive filesystem */
public final class C172818Ph extends C170918Hz implements C22901AyD {
    public static final int ADDRESS_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 3;
    public static final C172818Ph DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PREFIX_LENGTH_FIELD_NUMBER = 2;
    public int addressType_;
    public C21674AUx data_ = C21674AUx.A00;
    public int prefixLength_;

    static {
        C172818Ph r1 = new C172818Ph();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172818Ph.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Q = C36441kJ.A1Q();
                A1Q[0] = "addressType_";
                A1Q[1] = "prefixLength_";
                A1Q[2] = "data_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\n", A1Q);
            case 3:
                return new C172818Ph();
            case 4:
                return new AnonymousClass8IU();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172818Ph.class) {
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
