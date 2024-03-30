package X;

/* renamed from: X.4u7  reason: invalid class name and case insensitive filesystem */
public final class C99884u7 extends C170918Hz implements C22901AyD {
    public static final int CALL_RESULT_FIELD_NUMBER = 2;
    public static final C99884u7 DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int USER_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public int callResult_;
    public String userJid_ = "";

    static {
        C99884u7 r1 = new C99884u7();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C99884u7.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(4);
                A1Z[1] = "userJid_";
                A1Z[2] = "callResult_";
                A1Z[3] = C141886nz.A00;
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", A1Z);
            case 3:
                return new C99884u7();
            case 4:
                return new C99654tk();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C99884u7.class) {
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
