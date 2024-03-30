package X;

/* renamed from: X.8SC  reason: invalid class name */
public final class AnonymousClass8SC extends C170918Hz implements C22901AyD {
    public static final int CAPTION_FIELD_NUMBER = 20;
    public static final int CONTACT_VCARD_FIELD_NUMBER = 12;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass8SC DEFAULT_INSTANCE;
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
    public static final int URL_FIELD_NUMBER = 1;
    public int bitField0_;
    public String caption_;
    public boolean contactVcard_;
    public AnonymousClass8SG contextInfo_;
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
    public String url_ = "";

    static {
        AnonymousClass8SC r1 = new AnonymousClass8SC();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SC.class);
    }

    public AnonymousClass8SC() {
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

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(21);
                A1Z[1] = "url_";
                A1Z[2] = "mimetype_";
                A1Z[3] = "title_";
                A1Z[4] = "fileSha256_";
                A1Z[5] = "fileLength_";
                A1Z[6] = "pageCount_";
                A1Z[7] = "mediaKey_";
                A1Z[8] = "fileName_";
                A1Z[9] = "fileEncSha256_";
                A1Z[10] = "directPath_";
                A1Z[11] = "mediaKeyTimestamp_";
                A1Z[12] = "contactVcard_";
                A1Z[13] = "thumbnailDirectPath_";
                A1Z[14] = "thumbnailSha256_";
                A1Z[15] = "thumbnailEncSha256_";
                A1Z[16] = "jpegThumbnail_";
                A1Z[17] = "contextInfo_";
                A1Z[18] = "thumbnailHeight_";
                A1Z[19] = "thumbnailWidth_";
                A1Z[20] = "caption_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဃ\u0004\u0006ဋ\u0005\u0007ည\u0006\bဈ\u0007\tည\b\nဈ\t\u000bဂ\n\fဇ\u000b\rဈ\f\u000eည\r\u000fည\u000e\u0010ည\u000f\u0011ဉ\u0010\u0012ဋ\u0011\u0013ဋ\u0012\u0014ဈ\u0013", A1Z);
            case 3:
                return new AnonymousClass8SC();
            case 4:
                return new AnonymousClass8NI();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SC.class) {
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
