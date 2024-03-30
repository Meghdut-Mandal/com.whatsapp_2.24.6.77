package X;

/* renamed from: X.4uH  reason: invalid class name and case insensitive filesystem */
public final class C99984uH extends C170918Hz implements C22901AyD {
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int BEHAVIOR_GRAPH_FIELD_NUMBER = 2;
    public static final C99984uH DEFAULT_INSTANCE;
    public static final int INTENSITY_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SENTIMENT_FIELD_NUMBER = 1;
    public static final int WORD_COUNT_FIELD_NUMBER = 5;
    public int action_;
    public String behaviorGraph_ = "";
    public int bitField0_;
    public int intensity_;
    public int sentiment_;
    public int wordCount_;

    static {
        C99984uH r1 = new C99984uH();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C99984uH.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(6);
                A1Z[1] = "sentiment_";
                A1Z[2] = "behaviorGraph_";
                A1Z[3] = "action_";
                A1Z[4] = "intensity_";
                A1Z[5] = "wordCount_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", A1Z);
            case 3:
                return new C99984uH();
            case 4:
                return new C99514tW();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C99984uH.class) {
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
