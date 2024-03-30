package X;

/* renamed from: X.4uO  reason: invalid class name and case insensitive filesystem */
public final class C100054uO extends C170918Hz implements C22901AyD {
    public static final C100054uO DEFAULT_INSTANCE;
    public static final int DEVICE_ID_HINT_FIELD_NUMBER = 10;
    public static final int DIRECT_PATH_FIELD_NUMBER = 7;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 2;
    public static final int FILE_LENGTH_FIELD_NUMBER = 8;
    public static final int HEIGHT_FIELD_NUMBER = 5;
    public static final int IS_FAVORITE_FIELD_NUMBER = 9;
    public static final int MEDIA_KEY_FIELD_NUMBER = 3;
    public static final int MIMETYPE_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 6;
    public int bitField0_;
    public int deviceIdHint_;
    public String directPath_;
    public C21674AUx fileEncSha256_;
    public long fileLength_;
    public int height_;
    public boolean isFavorite_;
    public C21674AUx mediaKey_;
    public String mimetype_;
    public String url_ = "";
    public int width_;

    static {
        C100054uO r1 = new C100054uO();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C100054uO.class);
    }

    public C100054uO() {
        C21674AUx aUx = C21674AUx.A00;
        this.fileEncSha256_ = aUx;
        this.mediaKey_ = aUx;
        this.mimetype_ = "";
        this.directPath_ = "";
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
                A1Z[1] = "url_";
                A1Z[2] = "fileEncSha256_";
                A1Z[3] = "mediaKey_";
                A1Z[4] = "mimetype_";
                A1Z[5] = "height_";
                A1Z[6] = "width_";
                A1Z[7] = "directPath_";
                A1Z[8] = "fileLength_";
                A1Z[9] = "isFavorite_";
                A1Z[10] = "deviceIdHint_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဈ\u0006\bဃ\u0007\tဇ\b\nဋ\t", A1Z);
            case 3:
                return new C100054uO();
            case 4:
                return new C99694to();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C100054uO.class) {
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
