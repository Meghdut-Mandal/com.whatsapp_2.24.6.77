package X;

/* renamed from: X.8SB  reason: invalid class name */
public final class AnonymousClass8SB extends C170918Hz implements C22901AyD {
    public static final int CAPTION_FIELD_NUMBER = 3;
    public static final AnonymousClass8SB DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 11;
    public static final int EXPERIMENT_GROUP_ID_FIELD_NUMBER = 20;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 9;
    public static final int FILE_LENGTH_FIELD_NUMBER = 5;
    public static final int FILE_SHA256_FIELD_NUMBER = 4;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_KEY_FIELD_NUMBER = 8;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int MID_QUALITY_FILE_ENC_SHA256_FIELD_NUMBER = 24;
    public static final int MID_QUALITY_FILE_SHA256_FIELD_NUMBER = 23;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SCANS_SIDECAR_FIELD_NUMBER = 21;
    public static final int SCAN_LENGTHS_FIELD_NUMBER = 22;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 26;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 28;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 27;
    public static final int WIDTH_FIELD_NUMBER = 7;
    public int bitField0_;
    public String caption_ = "";
    public String directPath_;
    public int experimentGroupId_;
    public C21674AUx fileEncSha256_;
    public long fileLength_;
    public C21674AUx fileSha256_;
    public int height_;
    public C21674AUx jpegThumbnail_;
    public long mediaKeyTimestamp_;
    public C21674AUx mediaKey_;
    public C21674AUx midQualityFileEncSha256_;
    public C21674AUx midQualityFileSha256_;
    public String mimetype_ = "";
    public B62 scanLengths_;
    public C21674AUx scansSidecar_;
    public String thumbnailDirectPath_;
    public C21674AUx thumbnailEncSha256_;
    public C21674AUx thumbnailSha256_;
    public int width_;

    static {
        AnonymousClass8SB r1 = new AnonymousClass8SB();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SB.class);
    }

    public AnonymousClass8SB() {
        C21674AUx aUx = C21674AUx.A00;
        this.fileSha256_ = aUx;
        this.mediaKey_ = aUx;
        this.fileEncSha256_ = aUx;
        this.directPath_ = "";
        this.jpegThumbnail_ = aUx;
        this.scansSidecar_ = aUx;
        this.scanLengths_ = AnonymousClass8I0.A02;
        this.midQualityFileSha256_ = aUx;
        this.midQualityFileEncSha256_ = aUx;
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = aUx;
        this.thumbnailEncSha256_ = aUx;
    }
}
