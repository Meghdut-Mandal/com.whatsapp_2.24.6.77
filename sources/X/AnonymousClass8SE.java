package X;

/* renamed from: X.8SE  reason: invalid class name */
public final class AnonymousClass8SE extends C170918Hz implements C22901AyD {
    public static final int ANNOTATIONS_FIELD_NUMBER = 25;
    public static final int CAPTION_FIELD_NUMBER = 7;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass8SE DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 13;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 11;
    public static final int FILE_LENGTH_FIELD_NUMBER = 4;
    public static final int FILE_SHA256_FIELD_NUMBER = 3;
    public static final int GIF_ATTRIBUTION_FIELD_NUMBER = 19;
    public static final int GIF_PLAYBACK_FIELD_NUMBER = 8;
    public static final int HEIGHT_FIELD_NUMBER = 9;
    public static final int INTERACTIVE_ANNOTATIONS_FIELD_NUMBER = 12;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_KEY_FIELD_NUMBER = 6;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 5;
    public static final int STATIC_URL_FIELD_NUMBER = 24;
    public static final int STREAMING_SIDECAR_FIELD_NUMBER = 18;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 21;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 23;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 22;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int VIEW_ONCE_FIELD_NUMBER = 20;
    public static final int WIDTH_FIELD_NUMBER = 10;
    public C23122B6c annotations_;
    public int bitField0_;
    public String caption_;
    public AnonymousClass8SG contextInfo_;
    public String directPath_;
    public C21674AUx fileEncSha256_;
    public long fileLength_;
    public C21674AUx fileSha256_;
    public int gifAttribution_;
    public boolean gifPlayback_;
    public int height_;
    public C23122B6c interactiveAnnotations_;
    public C21674AUx jpegThumbnail_;
    public long mediaKeyTimestamp_;
    public C21674AUx mediaKey_;
    public String mimetype_ = "";
    public int seconds_;
    public String staticUrl_;
    public C21674AUx streamingSidecar_;
    public String thumbnailDirectPath_;
    public C21674AUx thumbnailEncSha256_;
    public C21674AUx thumbnailSha256_;
    public String url_ = "";
    public boolean viewOnce_;
    public int width_;

    static {
        AnonymousClass8SE r1 = new AnonymousClass8SE();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SE.class);
    }

    public AnonymousClass8SE() {
        C21674AUx aUx = C21674AUx.A00;
        this.fileSha256_ = aUx;
        this.mediaKey_ = aUx;
        this.caption_ = "";
        this.fileEncSha256_ = aUx;
        AnonymousClass8I2 r0 = AnonymousClass8I2.A02;
        this.interactiveAnnotations_ = r0;
        this.directPath_ = "";
        this.jpegThumbnail_ = aUx;
        this.streamingSidecar_ = aUx;
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = aUx;
        this.thumbnailEncSha256_ = aUx;
        this.staticUrl_ = "";
        this.annotations_ = r0;
    }
}
