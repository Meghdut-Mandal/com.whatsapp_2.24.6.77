package X;

/* renamed from: X.8NW  reason: invalid class name */
public final class AnonymousClass8NW extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8NW DEFAULT_INSTANCE;
    public static final int KEYS_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER;
    public C23122B6c keys_ = AnonymousClass8I2.A02;

    static {
        AnonymousClass8NW r1 = new AnonymousClass8NW();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8NW.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0M = AnonymousClass001.A0M();
                A0M[0] = "keys_";
                A0M[1] = C172708Ow.class;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", A0M);
            case 3:
                return new AnonymousClass8NW();
            case 4:
                return new AnonymousClass8JI();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8NW.class) {
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