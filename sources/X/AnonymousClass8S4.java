package X;

/* renamed from: X.8S4  reason: invalid class name */
public final class AnonymousClass8S4 extends C170918Hz implements C22901AyD {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int CLICK_TO_WHATSAPP_CALL_FIELD_NUMBER = 15;
    public static final int CONTAINS_AUTO_REPLY_FIELD_NUMBER = 10;
    public static final int CTWA_CLID_FIELD_NUMBER = 13;
    public static final AnonymousClass8S4 DEFAULT_INSTANCE;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 3;
    public static final int MEDIA_URL_FIELD_NUMBER = 5;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int REF_FIELD_NUMBER = 14;
    public static final int RENDER_LARGER_THUMBNAIL_FIELD_NUMBER = 11;
    public static final int SHOW_AD_ATTRIBUTION_FIELD_NUMBER = 12;
    public static final int SOURCE_ID_FIELD_NUMBER = 8;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 7;
    public static final int SOURCE_URL_FIELD_NUMBER = 9;
    public static final int THUMBNAIL_FIELD_NUMBER = 6;
    public static final int THUMBNAIL_URL_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    public int bitField0_;
    public String body_ = "";
    public boolean clickToWhatsappCall_;
    public boolean containsAutoReply_;
    public String ctwaClid_ = "";
    public int mediaType_;
    public String mediaUrl_ = "";
    public String ref_ = "";
    public boolean renderLargerThumbnail_;
    public boolean showAdAttribution_;
    public String sourceId_ = "";
    public String sourceType_ = "";
    public String sourceUrl_ = "";
    public String thumbnailUrl_ = "";
    public C21674AUx thumbnail_ = C21674AUx.A00;
    public String title_ = "";

    static {
        AnonymousClass8S4 r1 = new AnonymousClass8S4();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8S4.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(17);
                A1Z[1] = "title_";
                A1Z[2] = "body_";
                A1Z[3] = "mediaType_";
                A1Z[4] = C21038A6b.A00;
                A1Z[5] = "thumbnailUrl_";
                A1Z[6] = "mediaUrl_";
                A1Z[7] = "thumbnail_";
                A1Z[8] = "sourceType_";
                A1Z[9] = "sourceId_";
                A1Z[10] = "sourceUrl_";
                A1Z[11] = "containsAutoReply_";
                A1Z[12] = "renderLargerThumbnail_";
                A1Z[13] = "showAdAttribution_";
                A1Z[14] = "ctwaClid_";
                A1Z[15] = "ref_";
                A1Z[16] = "clickToWhatsappCall_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ည\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဈ\f\u000eဈ\r\u000fဇ\u000e", A1Z);
            case 3:
                return new AnonymousClass8S4();
            case 4:
                return new AnonymousClass8J1();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8S4.class) {
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
