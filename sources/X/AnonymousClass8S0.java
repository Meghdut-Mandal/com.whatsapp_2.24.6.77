package X;

/* renamed from: X.8S0  reason: invalid class name */
public final class AnonymousClass8S0 extends C170918Hz implements C22901AyD {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass8S0 DEFAULT_INSTANCE;
    public static final int ITEM_COUNT_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 6;
    public static final int MESSAGE_VERSION_FIELD_NUMBER = 12;
    public static final int ORDER_ID_FIELD_NUMBER = 1;
    public static final int ORDER_TITLE_FIELD_NUMBER = 7;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SELLER_JID_FIELD_NUMBER = 8;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int SURFACE_FIELD_NUMBER = 5;
    public static final int THUMBNAIL_FIELD_NUMBER = 2;
    public static final int TOKEN_FIELD_NUMBER = 9;
    public static final int TOTAL_AMOUNT_1000_FIELD_NUMBER = 10;
    public static final int TOTAL_CURRENCY_CODE_FIELD_NUMBER = 11;
    public int bitField0_;
    public AnonymousClass8SG contextInfo_;
    public int itemCount_;
    public int messageVersion_ = 1;
    public String message_ = "";
    public String orderId_ = "";
    public String orderTitle_ = "";
    public String sellerJid_ = "";
    public int status_ = 1;
    public int surface_ = 1;
    public C21674AUx thumbnail_ = C21674AUx.A00;
    public String token_ = "";
    public long totalAmount1000_;
    public String totalCurrencyCode_ = "";

    static {
        AnonymousClass8S0 r1 = new AnonymousClass8S0();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8S0.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(16);
                A1Z[1] = "orderId_";
                A1Z[2] = "thumbnail_";
                A1Z[3] = "itemCount_";
                A1Z[4] = "status_";
                A1Z[5] = A70.A00;
                A1Z[6] = "surface_";
                A1Z[7] = A71.A00;
                A1Z[8] = "message_";
                A1Z[9] = "orderTitle_";
                A1Z[10] = "sellerJid_";
                A1Z[11] = "token_";
                A1Z[12] = "totalAmount1000_";
                A1Z[13] = "totalCurrencyCode_";
                A1Z[14] = "messageVersion_";
                A1Z[15] = "contextInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဂ\t\u000bဈ\n\fင\f\u0011ဉ\u000b", A1Z);
            case 3:
                return new AnonymousClass8S0();
            case 4:
                return new AnonymousClass8KA();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8S0.class) {
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
