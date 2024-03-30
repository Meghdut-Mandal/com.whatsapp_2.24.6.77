package X;

/* renamed from: X.8Qe  reason: invalid class name and case insensitive filesystem */
public final class C173048Qe extends C170918Hz implements C22901AyD {
    public static final int CONSENTED_USERS_URL_FIELD_NUMBER = 3;
    public static final C173048Qe DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    public static final int WEBVIEW_PRESENTATION_FIELD_NUMBER = 4;
    public int bitField0_;
    public String consentedUsersUrl_ = "";
    public String displayText_ = "";
    public String url_ = "";
    public int webviewPresentation_ = 1;

    static {
        C173048Qe r1 = new C173048Qe();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173048Qe.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0g = C170918Hz.A0g();
                A0g[1] = "displayText_";
                A0g[2] = "url_";
                A0g[3] = "consentedUsersUrl_";
                A0g[4] = "webviewPresentation_";
                A0g[5] = C21042A6f.A00;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", A0g);
            case 3:
                return new C173048Qe();
            case 4:
                return new AnonymousClass8J8();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173048Qe.class) {
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
