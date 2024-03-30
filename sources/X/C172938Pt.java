package X;

/* renamed from: X.8Pt  reason: invalid class name and case insensitive filesystem */
public final class C172938Pt extends C170918Hz implements C22901AyD {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C172938Pt DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int VCARD_FIELD_NUMBER = 16;
    public int bitField0_;
    public AnonymousClass8SG contextInfo_;
    public String displayName_ = "";
    public String vcard_ = "";

    static {
        C172938Pt r1 = new C172938Pt();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172938Pt.class);
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
                A0e[1] = "displayName_";
                A0e[2] = "vcard_";
                A0e[3] = "contextInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0011\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0010ဈ\u0001\u0011ဉ\u0002", A0e);
            case 3:
                return new C172938Pt();
            case 4:
                return new AnonymousClass8JT();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172938Pt.class) {
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
