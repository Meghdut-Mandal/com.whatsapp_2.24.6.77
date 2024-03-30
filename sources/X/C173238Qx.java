package X;

/* renamed from: X.8Qx  reason: invalid class name and case insensitive filesystem */
public final class C173238Qx extends C170918Hz implements C22901AyD {
    public static final int ABRSETTINGS_FIELD_NUMBER = 2;
    public static final int APPLICATIONTYPE_FIELD_NUMBER = 4;
    public static final int CONNECTIVITYSETTINGS_FIELD_NUMBER = 1;
    public static final C173238Qx DEFAULT_INSTANCE;
    public static final int OVERRIDESETTINGS_FIELD_NUMBER = 5;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int TIMERSETTINGS_FIELD_NUMBER = 3;
    public C173298Rd abrSettings_;
    public int applicationType_;
    public C172508Oc connectivitySettings_;
    public AnonymousClass8NQ overrideSettings_;
    public C172568Oi timerSettings_;

    static {
        C173238Qx r1 = new C173238Qx();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173238Qx.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\f\u0005\t", new Object[]{"connectivitySettings_", "abrSettings_", "timerSettings_", "applicationType_", "overrideSettings_"});
            case 3:
                return new C173238Qx();
            case 4:
                return new AnonymousClass8IM();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173238Qx.class) {
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
