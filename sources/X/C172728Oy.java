package X;

/* renamed from: X.8Oy  reason: invalid class name and case insensitive filesystem */
public final class C172728Oy extends C170918Hz implements C22901AyD {
    public static final C172728Oy DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static final int ID_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public String displayName_ = "";
    public String id_ = "";

    static {
        C172728Oy r1 = new C172728Oy();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172728Oy.class);
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
                A0d[1] = "displayName_";
                A0d[2] = "id_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", A0d);
            case 3:
                return new C172728Oy();
            case 4:
                return new AnonymousClass8JR();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172728Oy.class) {
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
