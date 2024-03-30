package X;

/* renamed from: X.8Qg  reason: invalid class name and case insensitive filesystem */
public final class C173068Qg extends C170918Hz implements C22901AyD {
    public static final int CAPTION_FIELD_NUMBER = 4;
    public static final C173068Qg DEFAULT_INSTANCE;
    public static final int MASTER_KEY_FIELD_NUMBER = 3;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public int bitField0_;
    public String caption_ = "";
    public C21674AUx masterKey_ = C21674AUx.A00;
    public int mediaType_;
    public String sessionId_ = "";

    static {
        C173068Qg r1 = new C173068Qg();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173068Qg.class);
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
                A0g[1] = "sessionId_";
                A0g[2] = "mediaType_";
                A0g[3] = C21044A6h.A00;
                A0g[4] = "masterKey_";
                A0g[5] = "caption_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ည\u0002\u0004ဈ\u0003", A0g);
            case 3:
                return new C173068Qg();
            case 4:
                return new AnonymousClass8JJ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173068Qg.class) {
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
