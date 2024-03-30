package X;

/* renamed from: X.8QA  reason: invalid class name */
public final class AnonymousClass8QA extends C170918Hz implements C22901AyD {
    public static final int CALL_TYPE_FIELD_NUMBER = 2;
    public static final AnonymousClass8QA DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SCHEDULED_TIMESTAMP_MS_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 3;
    public int bitField0_;
    public int callType_;
    public long scheduledTimestampMs_;
    public String title_ = "";

    static {
        AnonymousClass8QA r1 = new AnonymousClass8QA();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8QA.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0f = C170918Hz.A0f();
                A0f[1] = "scheduledTimestampMs_";
                A0f[2] = "callType_";
                A0f[3] = A77.A00;
                A0f[4] = "title_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", A0f);
            case 3:
                return new AnonymousClass8QA();
            case 4:
                return new AnonymousClass8KW();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8QA.class) {
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
