package X;

/* renamed from: X.8SP  reason: invalid class name */
public final class AnonymousClass8SP extends C170918Hz implements C22901AyD {
    public static final int BUTTON_TEXT_FIELD_NUMBER = 3;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 8;
    public static final AnonymousClass8SP DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int FOOTER_TEXT_FIELD_NUMBER = 7;
    public static final int LIST_TYPE_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PRODUCT_LIST_INFO_FIELD_NUMBER = 6;
    public static final int SECTIONS_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    public int bitField0_;
    public String buttonText_ = "";
    public AnonymousClass8SG contextInfo_;
    public String description_ = "";
    public String footerText_ = "";
    public int listType_;
    public AnonymousClass8Q5 productListInfo_;
    public C23122B6c sections_ = AnonymousClass8I2.A02;
    public String title_ = "";

    static {
        AnonymousClass8SP r1 = new AnonymousClass8SP();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SP.class);
    }

    public AnonymousClass90a A0u() {
        int i = this.listType_;
        if (i != 0) {
            if (i == 1) {
                return AnonymousClass90a.SINGLE_SELECT;
            }
            if (i == 2) {
                return AnonymousClass90a.PRODUCT_LIST;
            }
        }
        return AnonymousClass90a.UNKNOWN;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(11);
                A1Z[1] = "title_";
                A1Z[2] = "description_";
                A1Z[3] = "buttonText_";
                A1Z[4] = "listType_";
                A1Z[5] = C21061A6y.A00;
                A1Z[6] = "sections_";
                A1Z[7] = AnonymousClass8P9.class;
                A1Z[8] = "productListInfo_";
                A1Z[9] = "footerText_";
                A1Z[10] = "contextInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005\u001b\u0006ဉ\u0004\u0007ဈ\u0005\bဉ\u0006", A1Z);
            case 3:
                return new AnonymousClass8SP();
            case 4:
                return new C171418Jx();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SP.class) {
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
