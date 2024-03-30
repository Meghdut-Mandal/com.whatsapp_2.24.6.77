package X;

/* renamed from: X.8S7  reason: invalid class name */
public final class AnonymousClass8S7 extends C170918Hz implements C22901AyD {
    public static final int CAPTION_FIELD_NUMBER = 20;
    public static final int CONTACT_VCARD_FIELD_NUMBER = 12;
    public static final AnonymousClass8S7 DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 10;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 9;
    public static final int FILE_LENGTH_FIELD_NUMBER = 5;
    public static final int FILE_NAME_FIELD_NUMBER = 8;
    public static final int FILE_SHA256_FIELD_NUMBER = 4;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_KEY_FIELD_NUMBER = 7;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 11;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static final int PAGE_COUNT_FIELD_NUMBER = 6;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 13;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 15;
    public static final int THUMBNAIL_HEIGHT_FIELD_NUMBER = 18;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 14;
    public static final int THUMBNAIL_WIDTH_FIELD_NUMBER = 19;
    public static final int TITLE_FIELD_NUMBER = 3;
    public int bitField0_;
    public String caption_;
    public boolean contactVcard_;
    public String directPath_;
    public C21674AUx fileEncSha256_;
    public long fileLength_;
    public String fileName_;
    public C21674AUx fileSha256_;
    public C21674AUx jpegThumbnail_;
    public long mediaKeyTimestamp_;
    public C21674AUx mediaKey_;
    public String mimetype_ = "";
    public int pageCount_;
    public String thumbnailDirectPath_;
    public C21674AUx thumbnailEncSha256_;
    public int thumbnailHeight_;
    public C21674AUx thumbnailSha256_;
    public int thumbnailWidth_;
    public String title_ = "";

    static {
        AnonymousClass8S7 r1 = new AnonymousClass8S7();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8S7.class);
    }

    public AnonymousClass8S7() {
        C21674AUx aUx = C21674AUx.A00;
        this.fileSha256_ = aUx;
        this.mediaKey_ = aUx;
        this.fileName_ = "";
        this.fileEncSha256_ = aUx;
        this.directPath_ = "";
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = aUx;
        this.thumbnailEncSha256_ = aUx;
        this.jpegThumbnail_ = aUx;
        this.caption_ = "";
    }
}
