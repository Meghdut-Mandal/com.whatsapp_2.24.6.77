package X;

/* renamed from: X.8Rz  reason: invalid class name and case insensitive filesystem */
public final class C173518Rz extends C170918Hz implements C22901AyD {
    public static final int BACKGROUND_ARGB_FIELD_NUMBER = 20;
    public static final C173518Rz DEFAULT_INSTANCE;
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
    public static final int WAVEFORM_FIELD_NUMBER = 19;
    public int backgroundArgb_;
    public int bitField0_;
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
    public C21674AUx waveform_;

    static {
        C173518Rz r1 = new C173518Rz();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173518Rz.class);
    }

    public C173518Rz() {
        C21674AUx aUx = C21674AUx.A00;
        this.fileSha256_ = aUx;
        this.mediaKey_ = aUx;
        this.fileEncSha256_ = aUx;
        this.directPath_ = "";
        this.streamingSidecar_ = aUx;
        this.waveform_ = aUx;
    }
}
