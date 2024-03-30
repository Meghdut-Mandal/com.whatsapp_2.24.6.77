package X;

/* renamed from: X.8RC  reason: invalid class name */
public final class AnonymousClass8RC extends C170918Hz implements C22901AyD {
    public static final int CALL_OUTCOME_FIELD_NUMBER = 2;
    public static final int CALL_TYPE_FIELD_NUMBER = 4;
    public static final AnonymousClass8RC DEFAULT_INSTANCE;
    public static final int DURATION_SECS_FIELD_NUMBER = 3;
    public static final int IS_VIDEO_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PARTICIPANTS_FIELD_NUMBER = 5;
    public int bitField0_;
    public int callOutcome_;
    public int callType_;
    public long durationSecs_;
    public boolean isVideo_;
    public C23122B6c participants_ = AnonymousClass8I2.A02;

    static {
        AnonymousClass8RC r1 = new AnonymousClass8RC();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RC.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(9);
                A1Z[1] = "isVideo_";
                A1Z[2] = "callOutcome_";
                A1Z[3] = C21049A6m.A00;
                A1Z[4] = "durationSecs_";
                A1Z[5] = "callType_";
                A1Z[6] = C21050A6n.A00;
                A1Z[7] = "participants_";
                A1Z[8] = AnonymousClass8SY.class;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005\u001b", A1Z);
            case 3:
                return new AnonymousClass8RC();
            case 4:
                return new AnonymousClass8JP();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RC.class) {
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
