package X;

/* renamed from: X.8SA  reason: invalid class name */
public final class AnonymousClass8SA extends C170918Hz implements C22901AyD {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass8SA DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 8;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 3;
    public static final int FILE_LENGTH_FIELD_NUMBER = 9;
    public static final int FILE_SHA256_FIELD_NUMBER = 2;
    public static final int FIRST_FRAME_LENGTH_FIELD_NUMBER = 11;
    public static final int FIRST_FRAME_SIDECAR_FIELD_NUMBER = 12;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int IS_AI_STICKER_FIELD_NUMBER = 20;
    public static final int IS_ANIMATED_FIELD_NUMBER = 13;
    public static final int IS_AVATAR_FIELD_NUMBER = 19;
    public static final int IS_LOTTIE_FIELD_NUMBER = 21;
    public static final int MEDIA_KEY_FIELD_NUMBER = 4;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int MIMETYPE_FIELD_NUMBER = 5;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PNG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int STICKER_SENT_TS_FIELD_NUMBER = 18;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 7;
    public int bitField0_;
    public AnonymousClass8SG contextInfo_;
    public String directPath_;
    public C21674AUx fileEncSha256_;
    public long fileLength_;
    public C21674AUx fileSha256_;
    public int firstFrameLength_;
    public C21674AUx firstFrameSidecar_;
    public int height_;
    public boolean isAiSticker_;
    public boolean isAnimated_;
    public boolean isAvatar_;
    public boolean isLottie_;
    public long mediaKeyTimestamp_;
    public C21674AUx mediaKey_;
    public String mimetype_;
    public C21674AUx pngThumbnail_;
    public long stickerSentTs_;
    public String url_ = "";
    public int width_;

    static {
        AnonymousClass8SA r1 = new AnonymousClass8SA();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SA.class);
    }

    public AnonymousClass8SA() {
        C21674AUx aUx = C21674AUx.A00;
        this.fileSha256_ = aUx;
        this.fileEncSha256_ = aUx;
        this.mediaKey_ = aUx;
        this.mimetype_ = "";
        this.directPath_ = "";
        this.firstFrameSidecar_ = aUx;
        this.pngThumbnail_ = aUx;
    }
}
