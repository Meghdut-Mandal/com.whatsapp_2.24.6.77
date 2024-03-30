package X;

/* renamed from: X.8Q5  reason: invalid class name */
public final class AnonymousClass8Q5 extends C170918Hz implements C22901AyD {
    public static final int BUSINESS_OWNER_JID_FIELD_NUMBER = 3;
    public static final AnonymousClass8Q5 DEFAULT_INSTANCE;
    public static final int HEADER_IMAGE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PRODUCT_SECTIONS_FIELD_NUMBER = 1;
    public int bitField0_;
    public String businessOwnerJid_ = "";
    public AnonymousClass8P7 headerImage_;
    public C23122B6c productSections_ = AnonymousClass8I2.A02;

    static {
        AnonymousClass8Q5 r1 = new AnonymousClass8Q5();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8Q5.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0f = C170918Hz.A0f();
                A0f[1] = "productSections_";
                A0f[2] = AnonymousClass8P8.class;
                A0f[3] = "headerImage_";
                A0f[4] = "businessOwnerJid_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0001", A0f);
            case 3:
                return new AnonymousClass8Q5();
            case 4:
                return new AnonymousClass8K0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8Q5.class) {
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
