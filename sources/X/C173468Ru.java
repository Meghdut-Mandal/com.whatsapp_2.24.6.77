package X;

/* renamed from: X.8Ru  reason: invalid class name and case insensitive filesystem */
public final class C173468Ru extends C170918Hz implements C22901AyD {
    public static final C173468Ru DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 8;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 3;
    public static final int FILE_LENGTH_FIELD_NUMBER = 9;
    public static final int FILE_SHA256_FIELD_NUMBER = 2;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int LAST_STICKER_SENT_TS_FIELD_NUMBER = 11;
    public static final int MEDIA_KEY_FIELD_NUMBER = 4;
    public static final int MIMETYPE_FIELD_NUMBER = 5;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int WEIGHT_FIELD_NUMBER = 10;
    public static final int WIDTH_FIELD_NUMBER = 7;
    public int bitField0_;
    public String directPath_;
    public C21674AUx fileEncSha256_;
    public long fileLength_;
    public C21674AUx fileSha256_;
    public int height_;
    public long lastStickerSentTs_;
    public C21674AUx mediaKey_;
    public String mimetype_;
    public String url_ = "";
    public float weight_;
    public int width_;

    static {
        C173468Ru r1 = new C173468Ru();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173468Ru.class);
    }

    public C173468Ru() {
        C21674AUx aUx = C21674AUx.A00;
        this.fileSha256_ = aUx;
        this.fileEncSha256_ = aUx;
        this.mediaKey_ = aUx;
        this.mimetype_ = "";
        this.directPath_ = "";
    }
}
