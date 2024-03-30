package X;

/* renamed from: X.8Q9  reason: invalid class name */
public final class AnonymousClass8Q9 extends C170918Hz implements C22901AyD {
    public static final int CATALOG_IMAGE_FIELD_NUMBER = 1;
    public static final AnonymousClass8Q9 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public int bitField0_;
    public AnonymousClass8SF catalogImage_;
    public String description_ = "";
    public String title_ = "";

    static {
        AnonymousClass8Q9 r1 = new AnonymousClass8Q9();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8Q9.class);
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
                A0e[1] = "catalogImage_";
                A0e[2] = "title_";
                A0e[3] = "description_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", A0e);
            case 3:
                return new AnonymousClass8Q9();
            case 4:
                return new AnonymousClass8KR();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8Q9.class) {
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
