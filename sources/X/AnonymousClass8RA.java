package X;

/* renamed from: X.8RA  reason: invalid class name */
public final class AnonymousClass8RA extends C170918Hz implements C22901AyD {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
    public static final AnonymousClass8RA DEFAULT_INSTANCE;
    public static final int NEWSLETTER_JID_FIELD_NUMBER = 1;
    public static final int NEWSLETTER_NAME_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SERVER_MESSAGE_ID_FIELD_NUMBER = 2;
    public String accessibilityText_ = "";
    public int bitField0_;
    public int contentType_ = 1;
    public String newsletterJid_ = "";
    public String newsletterName_ = "";
    public int serverMessageId_;

    static {
        AnonymousClass8RA r1 = new AnonymousClass8RA();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RA.class);
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
                A1Z[1] = "newsletterJid_";
                A1Z[2] = "serverMessageId_";
                A1Z[3] = "newsletterName_";
                A1Z[4] = "contentType_";
                A1Z[5] = C21039A6c.A00;
                A1Z[6] = "accessibilityText_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဈ\u0004", A1Z);
            case 3:
                return new AnonymousClass8RA();
            case 4:
                return new AnonymousClass8J2();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RA.class) {
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
