package X;

/* renamed from: X.8S5  reason: invalid class name */
public final class AnonymousClass8S5 extends C170918Hz implements C22901AyD {
    public static final int BACKGROUND_ARGB_FIELD_NUMBER = 20;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass8S5 DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 9;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 8;
    public static final int FILE_LENGTH_FIELD_NUMBER = 4;
    public static final int FILE_SHA256_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 7;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PTT_FIELD_NUMBER = 6;
    public static final int SECONDS_FIELD_NUMBER = 5;
    public static final int STREAMING_SIDECAR_FIELD_NUMBER = 18;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int VIEW_ONCE_FIELD_NUMBER = 21;
    public static final int WAVEFORM_FIELD_NUMBER = 19;
    public int backgroundArgb_;
    public int bitField0_;
    public AnonymousClass8SG contextInfo_;
    public String directPath_;
    public C21674AUx fileEncSha256_;
    public long fileLength_;
    public C21674AUx fileSha256_;
    public long mediaKeyTimestamp_;
    public C21674AUx mediaKey_;
    public String mimetype_ = "";
    public boolean ptt_;
    public int seconds_;
    public C21674AUx streamingSidecar_;
    public String url_ = "";
    public boolean viewOnce_;
    public C21674AUx waveform_;

    public static void A0i(Object[] objArr, Object obj) {
        objArr[2] = obj;
        objArr[3] = "fileSha256_";
        objArr[4] = "fileLength_";
    }

    public static void A0j(Object[] objArr, Object obj) {
        objArr[7] = obj;
        objArr[8] = "fileEncSha256_";
        objArr[9] = "directPath_";
        objArr[10] = "mediaKeyTimestamp_";
    }

    static {
        AnonymousClass8S5 r1 = new AnonymousClass8S5();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8S5.class);
    }

    public AnonymousClass8S5() {
        C21674AUx aUx = C21674AUx.A00;
        this.fileSha256_ = aUx;
        this.mediaKey_ = aUx;
        this.fileEncSha256_ = aUx;
        this.directPath_ = "";
        this.streamingSidecar_ = aUx;
        this.waveform_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(16);
                A1Z[1] = "url_";
                A0i(A1Z, "mimetype_");
                A1Z[5] = "seconds_";
                A1Z[6] = "ptt_";
                A0j(A1Z, "mediaKey_");
                A1Z[11] = "contextInfo_";
                A1Z[12] = "streamingSidecar_";
                A1Z[13] = "waveform_";
                A1Z[14] = "backgroundArgb_";
                A1Z[15] = "viewOnce_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u0015\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဃ\u0003\u0005ဋ\u0004\u0006ဇ\u0005\u0007ည\u0006\bည\u0007\tဈ\b\nဂ\t\u0011ဉ\n\u0012ည\u000b\u0013ည\f\u0014ဆ\r\u0015ဇ\u000e", A1Z);
            case 3:
                return new AnonymousClass8S5();
            case 4:
                return new AnonymousClass8N2();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8S5.class) {
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
