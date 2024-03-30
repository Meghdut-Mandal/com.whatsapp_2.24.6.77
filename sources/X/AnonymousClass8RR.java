package X;

/* renamed from: X.8RR  reason: invalid class name */
public final class AnonymousClass8RR extends C170918Hz implements C22901AyD {
    public static final int BODY_FIELD_NUMBER = 5;
    public static final int BUSINESS_OWNER_JID_FIELD_NUMBER = 2;
    public static final int CATALOG_FIELD_NUMBER = 4;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass8RR DEFAULT_INSTANCE;
    public static final int FOOTER_FIELD_NUMBER = 6;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PRODUCT_FIELD_NUMBER = 1;
    public int bitField0_;
    public String body_ = "";
    public String businessOwnerJid_ = "";
    public AnonymousClass8Q9 catalog_;
    public AnonymousClass8SG contextInfo_;
    public String footer_ = "";
    public C173458Rt product_;

    static {
        AnonymousClass8RR r1 = new AnonymousClass8RR();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RR.class);
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
                A1Z[1] = "product_";
                A1Z[2] = "businessOwnerJid_";
                A1Z[3] = "catalog_";
                A1Z[4] = "body_";
                A1Z[5] = "footer_";
                A1Z[6] = "contextInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0011ဉ\u0005", A1Z);
            case 3:
                return new AnonymousClass8RR();
            case 4:
                return new AnonymousClass8KQ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RR.class) {
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
