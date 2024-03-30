package X;

/* renamed from: X.8Pr  reason: invalid class name and case insensitive filesystem */
public final class C172918Pr extends C170918Hz implements C22901AyD {
    public static final C172918Pr DEFAULT_INSTANCE;
    public static final int EXPRESS_PATH_URL_FIELD_NUMBER = 1;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 2;
    public static final int FILE_LENGTH_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public String expressPathUrl_ = "";
    public C21674AUx fileEncSha256_ = C21674AUx.A00;
    public long fileLength_;

    static {
        C172918Pr r1 = new C172918Pr();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172918Pr.class);
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
                A0e[1] = "expressPathUrl_";
                A0e[2] = "fileEncSha256_";
                A0e[3] = "fileLength_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဃ\u0002", A0e);
            case 3:
                return new C172918Pr();
            case 4:
                return new AnonymousClass8JB();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172918Pr.class) {
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
