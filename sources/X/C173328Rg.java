package X;

/* renamed from: X.8Rg  reason: invalid class name and case insensitive filesystem */
public final class C173328Rg extends C170918Hz implements C22901AyD {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 9;
    public static final C173328Rg DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 7;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 6;
    public static final int FILE_SHA256_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 5;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 8;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public int bitField0_;
    public AnonymousClass8SG contextInfo_;
    public String directPath_;
    public C21674AUx fileEncSha256_;
    public C21674AUx fileSha256_;
    public long mediaKeyTimestamp_;
    public C21674AUx mediaKey_;
    public String mimetype_ = "";
    public String url_ = "";

    static {
        C173328Rg r1 = new C173328Rg();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173328Rg.class);
    }

    public C173328Rg() {
        C21674AUx aUx = C21674AUx.A00;
        this.fileSha256_ = aUx;
        this.mediaKey_ = aUx;
        this.fileEncSha256_ = aUx;
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
                Object[] A1Z = C90474aD.A1Z(9);
                A1Z[1] = "url_";
                A1Z[2] = "mimetype_";
                A1Z[3] = "fileSha256_";
                A1Z[4] = "mediaKey_";
                A1Z[5] = "fileEncSha256_";
                A1Z[6] = "directPath_";
                A1Z[7] = "mediaKeyTimestamp_";
                A1Z[8] = "contextInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0005ည\u0003\u0006ည\u0004\u0007ဈ\u0005\bဂ\u0006\tဉ\u0007", A1Z);
            case 3:
                return new C173328Rg();
            case 4:
                return new AnonymousClass8K8();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173328Rg.class) {
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
