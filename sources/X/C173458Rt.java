package X;

/* renamed from: X.8Rt  reason: invalid class name and case insensitive filesystem */
public final class C173458Rt extends C170918Hz implements C22901AyD {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 5;
    public static final C173458Rt DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int FIRST_IMAGE_ID_FIELD_NUMBER = 11;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PRICE_AMOUNT_1000_FIELD_NUMBER = 6;
    public static final int PRODUCT_ID_FIELD_NUMBER = 2;
    public static final int PRODUCT_IMAGE_COUNT_FIELD_NUMBER = 9;
    public static final int PRODUCT_IMAGE_FIELD_NUMBER = 1;
    public static final int RETAILER_ID_FIELD_NUMBER = 7;
    public static final int SALE_PRICE_AMOUNT_1000_FIELD_NUMBER = 12;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 8;
    public int bitField0_;
    public String currencyCode_ = "";
    public String description_ = "";
    public String firstImageId_ = "";
    public long priceAmount1000_;
    public String productId_ = "";
    public int productImageCount_;
    public AnonymousClass8SF productImage_;
    public String retailerId_ = "";
    public long salePriceAmount1000_;
    public String title_ = "";
    public String url_ = "";

    static {
        C173458Rt r1 = new C173458Rt();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173458Rt.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(12);
                A1Z[1] = "productImage_";
                A1Z[2] = "productId_";
                A1Z[3] = "title_";
                A1Z[4] = "description_";
                A1Z[5] = "currencyCode_";
                A1Z[6] = "priceAmount1000_";
                A1Z[7] = "retailerId_";
                A1Z[8] = "url_";
                A1Z[9] = "productImageCount_";
                A1Z[10] = "firstImageId_";
                A1Z[11] = "salePriceAmount1000_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဈ\u0007\tဋ\b\u000bဈ\t\fဂ\n", A1Z);
            case 3:
                return new C173458Rt();
            case 4:
                return new AnonymousClass8KS();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173458Rt.class) {
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
