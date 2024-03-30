package X;

/* renamed from: X.8RE  reason: invalid class name */
public final class AnonymousClass8RE extends C170918Hz implements C22901AyD {
    public static final int CHAT_JID_FIELD_NUMBER = 1;
    public static final AnonymousClass8RE DEFAULT_INSTANCE;
    public static final int OLDEST_MSG_FROM_ME_FIELD_NUMBER = 3;
    public static final int OLDEST_MSG_ID_FIELD_NUMBER = 2;
    public static final int OLDEST_MSG_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static final int ON_DEMAND_MSG_COUNT_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public String chatJid_ = "";
    public boolean oldestMsgFromMe_;
    public String oldestMsgId_ = "";
    public long oldestMsgTimestampMs_;
    public int onDemandMsgCount_;

    static {
        AnonymousClass8RE r1 = new AnonymousClass8RE();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RE.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0g = C170918Hz.A0g();
                A0g[1] = "chatJid_";
                A0g[2] = "oldestMsgId_";
                A0g[3] = "oldestMsgFromMe_";
                A0g[4] = "onDemandMsgCount_";
                A0g[5] = "oldestMsgTimestampMs_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဂ\u0004", A0g);
            case 3:
                return new AnonymousClass8RE();
            case 4:
                return new AnonymousClass8KD();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RE.class) {
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
