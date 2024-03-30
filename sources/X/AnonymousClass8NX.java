package X;

/* renamed from: X.8NX  reason: invalid class name */
public final class AnonymousClass8NX extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8NX DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SELECTED_OPTIONS_FIELD_NUMBER = 1;
    public C23122B6c selectedOptions_ = AnonymousClass8I2.A02;

    static {
        AnonymousClass8NX r1 = new AnonymousClass8NX();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8NX.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"selectedOptions_"});
            case 3:
                return new AnonymousClass8NX();
            case 4:
                return new C172178Mv();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8NX.class) {
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
