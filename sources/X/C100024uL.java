package X;

/* renamed from: X.4uL  reason: invalid class name and case insensitive filesystem */
public final class C100024uL extends C170918Hz implements C22901AyD {
    public static final C100024uL DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 2;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 6;
    public static final int FILE_SHA256_FIELD_NUMBER = 5;
    public static final int FILE_SIZE_BYTES_FIELD_NUMBER = 4;
    public static final int HANDLE_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public String directPath_ = "";
    public C21674AUx fileEncSha256_;
    public C21674AUx fileSha256_;
    public long fileSizeBytes_;
    public String handle_ = "";
    public C21674AUx mediaKey_;

    static {
        C100024uL r1 = new C100024uL();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C100024uL.class);
    }

    public C100024uL() {
        C21674AUx aUx = C21674AUx.A00;
        this.mediaKey_ = aUx;
        this.fileSha256_ = aUx;
        this.fileEncSha256_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(7);
                A1Z[1] = "mediaKey_";
                A1Z[2] = "directPath_";
                A1Z[3] = "handle_";
                A1Z[4] = "fileSizeBytes_";
                A1Z[5] = "fileSha256_";
                A1Z[6] = "fileEncSha256_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဃ\u0003\u0005ည\u0004\u0006ည\u0005", A1Z);
            case 3:
                return new C100024uL();
            case 4:
                return new C99634ti();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C100024uL.class) {
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
