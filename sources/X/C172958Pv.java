package X;

/* renamed from: X.8Pv  reason: invalid class name and case insensitive filesystem */
public final class C172958Pv extends C170918Hz implements C22901AyD {
    public static final C172958Pv DEFAULT_INSTANCE;
    public static final int DESTINATION_JID_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PHASH_FIELD_NUMBER = 3;
    public int bitField0_;
    public String destinationJid_ = "";
    public AnonymousClass8SX message_;
    public String phash_ = "";

    static {
        C172958Pv r1 = new C172958Pv();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172958Pv.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0e = C170918Hz.A0e();
                A0e[1] = "destinationJid_";
                A0e[2] = "message_";
                A0e[3] = "phash_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", A0e);
            case 3:
                return new C172958Pv();
            case 4:
                return new AnonymousClass8JW();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172958Pv.class) {
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
