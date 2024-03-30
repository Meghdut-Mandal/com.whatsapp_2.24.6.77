package X;

/* renamed from: X.8Qk  reason: invalid class name and case insensitive filesystem */
public final class C173108Qk extends C170918Hz implements C22901AyD {
    public static final C173108Qk DEFAULT_INSTANCE;
    public static final int GROUPING_KEY_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SENDER_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 2;
    public int bitField0_;
    public String groupingKey_ = "";
    public AnonymousClass8SW key_;
    public long senderTimestampMs_;
    public String text_ = "";

    static {
        C173108Qk r1 = new C173108Qk();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173108Qk.class);
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
                A0f[1] = "key_";
                A0f[2] = "text_";
                A0f[3] = "groupingKey_";
                A0f[4] = "senderTimestampMs_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", A0f);
            case 3:
                return new C173108Qk();
            case 4:
                return new AnonymousClass8KT();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173108Qk.class) {
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
