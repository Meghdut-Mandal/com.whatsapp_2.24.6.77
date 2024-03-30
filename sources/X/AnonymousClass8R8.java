package X;

/* renamed from: X.8R8  reason: invalid class name */
public final class AnonymousClass8R8 extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8R8 DEFAULT_INSTANCE;
    public static final int HISTORY_SYNC_CONFIG_FIELD_NUMBER = 5;
    public static final int OS_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PLATFORM_TYPE_FIELD_NUMBER = 3;
    public static final int REQUIRE_FULL_SYNC_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 2;
    public int bitField0_;
    public C173378Rl historySyncConfig_;
    public String os_ = "";
    public int platformType_;
    public boolean requireFullSync_;
    public AnonymousClass8R7 version_;

    static {
        AnonymousClass8R8 r1 = new AnonymousClass8R8();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8R8.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(7);
                A1Z[1] = "os_";
                A1Z[2] = "version_";
                A1Z[3] = "platformType_";
                A1Z[4] = A6X.A00;
                A1Z[5] = "requireFullSync_";
                A1Z[6] = "historySyncConfig_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဉ\u0004", A1Z);
            case 3:
                return new AnonymousClass8R8();
            case 4:
                return new C171108Is();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8R8.class) {
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
