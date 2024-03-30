package X;

/* renamed from: X.8Pe  reason: invalid class name and case insensitive filesystem */
public final class C172788Pe extends C170918Hz implements C22901AyD {
    public static final int CONFIG_FIELD_NUMBER = 3;
    public static final C172788Pe DEFAULT_INSTANCE;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public C21674AUx config_ = C21674AUx.A00;
    public int nonce_;
    public int type_;

    static {
        C172788Pe r1 = new C172788Pe();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172788Pe.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0h = C170918Hz.A0h(3);
                A0h[1] = "type_";
                A0h[2] = "config_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n", A0h);
            case 3:
                return new C172788Pe();
            case 4:
                return new AnonymousClass8ID();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172788Pe.class) {
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
