package X;

/* renamed from: X.4u4  reason: invalid class name and case insensitive filesystem */
public final class C99854u4 extends C170918Hz implements C22901AyD {
    public static final C99854u4 DEFAULT_INSTANCE;
    public static final int LID_JID_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PN_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public String lidJid_ = "";
    public String pnJid_ = "";

    static {
        C99854u4 r1 = new C99854u4();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C99854u4.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(3);
                A1Z[1] = "pnJid_";
                A1Z[2] = "lidJid_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", A1Z);
            case 3:
                return new C99854u4();
            case 4:
                return new C99604tf();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C99854u4.class) {
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
