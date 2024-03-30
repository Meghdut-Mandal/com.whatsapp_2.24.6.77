package X;

/* renamed from: X.4uA  reason: invalid class name and case insensitive filesystem */
public final class C99914uA extends C170918Hz implements C22901AyD {
    public static final C99914uA DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int RANK_FIELD_NUMBER = 2;
    public static final int USER_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public byte memoizedIsInitialized = 2;
    public int rank_;
    public String userJid_ = "";

    static {
        C99914uA r1 = new C99914uA();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C99914uA.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        int i = 1;
        switch (num.intValue()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "userJid_", "rank_", C141846nv.A00});
            case 3:
                return new C99914uA();
            case 4:
                return new C99584td();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C99914uA.class) {
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
