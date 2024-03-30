package X;

/* renamed from: X.8PB  reason: invalid class name */
public final class AnonymousClass8PB extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8PB DEFAULT_INSTANCE;
    public static final int INCLUDE_HQ_THUMBNAIL_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public int bitField0_;
    public boolean includeHqThumbnail_;
    public String url_ = "";

    static {
        AnonymousClass8PB r1 = new AnonymousClass8PB();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8PB.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0d = C170918Hz.A0d();
                A0d[1] = "url_";
                A0d[2] = "includeHqThumbnail_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", A0d);
            case 3:
                return new AnonymousClass8PB();
            case 4:
                return new AnonymousClass8KG();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8PB.class) {
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
