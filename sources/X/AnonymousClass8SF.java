package X;

/* renamed from: X.8SF  reason: invalid class name */
public final class AnonymousClass8SF extends C170918Hz implements C22901AyD {
    public static final int ANNOTATIONS_FIELD_NUMBER = 30;
    public static final int CAPTION_FIELD_NUMBER = 3;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass8SF DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 11;
    public static final int EXPERIMENT_GROUP_ID_FIELD_NUMBER = 20;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 9;
    public static final int FILE_LENGTH_FIELD_NUMBER = 5;
    public static final int FILE_SHA256_FIELD_NUMBER = 4;
    public static final int FIRST_SCAN_LENGTH_FIELD_NUMBER = 19;
    public static final int FIRST_SCAN_SIDECAR_FIELD_NUMBER = 18;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int IMAGE_SOURCE_TYPE_FIELD_NUMBER = 31;
    public static final int INTERACTIVE_ANNOTATIONS_FIELD_NUMBER = 10;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_KEY_FIELD_NUMBER = 8;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int MID_QUALITY_FILE_ENC_SHA256_FIELD_NUMBER = 24;
    public static final int MID_QUALITY_FILE_SHA256_FIELD_NUMBER = 23;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SCANS_SIDECAR_FIELD_NUMBER = 21;
    public static final int SCAN_LENGTHS_FIELD_NUMBER = 22;
    public static final int STATIC_URL_FIELD_NUMBER = 29;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 26;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 28;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 27;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int VIEW_ONCE_FIELD_NUMBER = 25;
    public static final int WIDTH_FIELD_NUMBER = 7;
    public C23122B6c annotations_;
    public int bitField0_;
    public String caption_ = "";
    public AnonymousClass8SG contextInfo_;
    public String directPath_;
    public int experimentGroupId_;
    public C21674AUx fileEncSha256_;
    public long fileLength_;
    public C21674AUx fileSha256_;
    public int firstScanLength_;
    public C21674AUx firstScanSidecar_;
    public int height_;
    public int imageSourceType_;
    public C23122B6c interactiveAnnotations_;
    public C21674AUx jpegThumbnail_;
    public long mediaKeyTimestamp_;
    public C21674AUx mediaKey_;
    public C21674AUx midQualityFileEncSha256_;
    public C21674AUx midQualityFileSha256_;
    public String mimetype_ = "";
    public B62 scanLengths_;
    public C21674AUx scansSidecar_;
    public String staticUrl_;
    public String thumbnailDirectPath_;
    public C21674AUx thumbnailEncSha256_;
    public C21674AUx thumbnailSha256_;
    public String url_ = "";
    public boolean viewOnce_;
    public int width_;

    static {
        AnonymousClass8SF r1 = new AnonymousClass8SF();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SF.class);
    }

    public AnonymousClass8SF() {
        C21674AUx aUx = C21674AUx.A00;
        this.fileSha256_ = aUx;
        this.mediaKey_ = aUx;
        this.fileEncSha256_ = aUx;
        AnonymousClass8I2 r1 = AnonymousClass8I2.A02;
        this.interactiveAnnotations_ = r1;
        this.directPath_ = "";
        this.jpegThumbnail_ = aUx;
        this.firstScanSidecar_ = aUx;
        this.scansSidecar_ = aUx;
        this.scanLengths_ = AnonymousClass8I0.A02;
        this.midQualityFileSha256_ = aUx;
        this.midQualityFileEncSha256_ = aUx;
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = aUx;
        this.thumbnailEncSha256_ = aUx;
        this.staticUrl_ = "";
        this.annotations_ = r1;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(32);
                A1Z[1] = "url_";
                A1Z[2] = "mimetype_";
                A1Z[3] = "caption_";
                A1Z[4] = "fileSha256_";
                A1Z[5] = "fileLength_";
                A1Z[6] = "height_";
                A1Z[7] = "width_";
                A1Z[8] = "mediaKey_";
                A1Z[9] = "fileEncSha256_";
                A1Z[10] = "interactiveAnnotations_";
                Class<C173058Qf> cls = C173058Qf.class;
                A1Z[11] = cls;
                A1Z[12] = "directPath_";
                A1Z[13] = "mediaKeyTimestamp_";
                A1Z[14] = "jpegThumbnail_";
                A1Z[15] = "contextInfo_";
                A1Z[16] = "firstScanSidecar_";
                A1Z[17] = "firstScanLength_";
                A1Z[18] = "experimentGroupId_";
                A1Z[19] = "scansSidecar_";
                A1Z[20] = "scanLengths_";
                A1Z[21] = "midQualityFileSha256_";
                A1Z[22] = "midQualityFileEncSha256_";
                A1Z[23] = "viewOnce_";
                A1Z[24] = "thumbnailDirectPath_";
                A1Z[25] = "thumbnailSha256_";
                A1Z[26] = "thumbnailEncSha256_";
                A1Z[27] = "staticUrl_";
                A1Z[28] = "annotations_";
                A1Z[29] = cls;
                A1Z[30] = "imageSourceType_";
                A1Z[31] = C21058A6v.A00;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u001c\u0000\u0001\u0001\u001f\u001c\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဃ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bည\u0007\tည\b\n\u001b\u000bဈ\t\fဂ\n\u0010ည\u000b\u0011ဉ\f\u0012ည\r\u0013ဋ\u000e\u0014ဋ\u000f\u0015ည\u0010\u0016\u001d\u0017ည\u0011\u0018ည\u0012\u0019ဇ\u0013\u001aဈ\u0014\u001bည\u0015\u001cည\u0016\u001dဈ\u0017\u001e\u001b\u001fဌ\u0018", A1Z);
            case 3:
                return new AnonymousClass8SF();
            case 4:
                return new AnonymousClass8NJ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SF.class) {
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
