package X;

/* renamed from: X.8RY  reason: invalid class name */
public final class AnonymousClass8RY extends C170918Hz implements C22901AyD {
    public static final int CALENDAR_FIELD_NUMBER = 7;
    public static final int DAY_OF_MONTH_FIELD_NUMBER = 4;
    public static final int DAY_OF_WEEK_FIELD_NUMBER = 1;
    public static final AnonymousClass8RY DEFAULT_INSTANCE;
    public static final int HOUR_FIELD_NUMBER = 5;
    public static final int MINUTE_FIELD_NUMBER = 6;
    public static final int MONTH_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 2;
    public int bitField0_;
    public int calendar_ = 1;
    public int dayOfMonth_;
    public int dayOfWeek_ = 1;
    public int hour_;
    public int minute_;
    public int month_;
    public int year_;

    static {
        AnonymousClass8RY r1 = new AnonymousClass8RY();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RY.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(10);
                A1Z[1] = "dayOfWeek_";
                A1Z[2] = C21057A6u.A00;
                A1Z[3] = "year_";
                A1Z[4] = "month_";
                A1Z[5] = "dayOfMonth_";
                A1Z[6] = "hour_";
                A1Z[7] = "minute_";
                A1Z[8] = "calendar_";
                A1Z[9] = C21056A6t.A00;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဌ\u0006", A1Z);
            case 3:
                return new AnonymousClass8RY();
            case 4:
                return new C171268Ji();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RY.class) {
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
