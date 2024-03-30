package X;

/* renamed from: X.8Qj  reason: invalid class name and case insensitive filesystem */
public final class C173098Qj extends C170918Hz implements C22901AyD {
    public static final C173098Qj DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int POLL_CREATION_MESSAGE_KEY_FIELD_NUMBER = 1;
    public static final int SENDER_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int VOTE_FIELD_NUMBER = 2;
    public int bitField0_;
    public AnonymousClass8NO metadata_;
    public AnonymousClass8SW pollCreationMessageKey_;
    public long senderTimestampMs_;
    public AnonymousClass8PC vote_;

    static {
        C173098Qj r1 = new C173098Qj();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173098Qj.class);
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
                A0f[1] = "pollCreationMessageKey_";
                A0f[2] = "vote_";
                A0f[3] = "metadata_";
                A0f[4] = "senderTimestampMs_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003", A0f);
            case 3:
                return new C173098Qj();
            case 4:
                return new AnonymousClass8KO();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173098Qj.class) {
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
