package X;

/* renamed from: X.4u6  reason: invalid class name and case insensitive filesystem */
public final class C99874u6 extends C170918Hz implements C22901AyD {
    public static final C99874u6 DEFAULT_INSTANCE;
    public static final int FILENAME_FIELD_NUMBER = 1;
    public static final int OPACITY_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public String filename_ = "";
    public int opacity_;

    static {
        C99874u6 r1 = new C99874u6();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C99874u6.class);
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
                A1Z[1] = "filename_";
                A1Z[2] = "opacity_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001", A1Z);
            case 3:
                return new C99874u6();
            case 4:
                return new C99624th();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C99874u6.class) {
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
