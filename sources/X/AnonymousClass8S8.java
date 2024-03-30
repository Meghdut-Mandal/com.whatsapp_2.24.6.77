package X;

/* renamed from: X.8S8  reason: invalid class name */
public final class AnonymousClass8S8 extends C170918Hz implements C22901AyD {
    public static final int CAPTION_FIELD_NUMBER = 7;
    public static final AnonymousClass8S8 DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 13;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 11;
    public static final int FILE_LENGTH_FIELD_NUMBER = 4;
    public static final int FILE_SHA256_FIELD_NUMBER = 3;
    public static final int GIF_ATTRIBUTION_FIELD_NUMBER = 19;
    public static final int GIF_PLAYBACK_FIELD_NUMBER = 8;
    public static final int HEIGHT_FIELD_NUMBER = 9;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_KEY_FIELD_NUMBER = 6;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 5;
    public static final int STREAMING_SIDECAR_FIELD_NUMBER = 18;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 21;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 23;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 22;
    public static final int WIDTH_FIELD_NUMBER = 10;
    public int bitField0_;
    public String caption_;
    public String directPath_;
    public C21674AUx fileEncSha256_;
    public long fileLength_;
    public C21674AUx fileSha256_;
    public int gifAttribution_;
    public boolean gifPlayback_;
    public int height_;
    public C21674AUx jpegThumbnail_;
    public long mediaKeyTimestamp_;
    public C21674AUx mediaKey_;
    public String mimetype_ = "";
    public int seconds_;
    public C21674AUx streamingSidecar_;
    public String thumbnailDirectPath_;
    public C21674AUx thumbnailEncSha256_;
    public C21674AUx thumbnailSha256_;
    public int width_;

    static {
        AnonymousClass8S8 r1 = new AnonymousClass8S8();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8S8.class);
    }

    public AnonymousClass8S8() {
        C21674AUx aUx = C21674AUx.A00;
        this.fileSha256_ = aUx;
        this.mediaKey_ = aUx;
        this.caption_ = "";
        this.fileEncSha256_ = aUx;
        this.directPath_ = "";
        this.jpegThumbnail_ = aUx;
        this.streamingSidecar_ = aUx;
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = aUx;
        this.thumbnailEncSha256_ = aUx;
    }
}
