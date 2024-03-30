package X;

/* renamed from: X.8NQ  reason: invalid class name */
public final class AnonymousClass8NQ extends C170918Hz implements C22901AyD {
    public static final int BYPASSDONCHECK_FIELD_NUMBER = 1;
    public static final AnonymousClass8NQ DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER;
    public boolean bypassDonCheck_;

    static {
        AnonymousClass8NQ r1 = new AnonymousClass8NQ();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8NQ.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"bypassDonCheck_"});
            case 3:
                return new AnonymousClass8NQ();
            case 4:
                return new AnonymousClass8IL();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8NQ.class) {
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
