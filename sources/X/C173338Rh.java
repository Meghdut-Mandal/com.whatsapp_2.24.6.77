package X;

/* renamed from: X.8Rh  reason: invalid class name and case insensitive filesystem */
public final class C173338Rh extends C170918Hz implements C22901AyD {
    public static final int CANONICAL_URL_FIELD_NUMBER = 5;
    public static final C173338Rh DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int HQ_THUMBNAIL_FIELD_NUMBER = 8;
    public static final int MATCH_TEXT_FIELD_NUMBER = 6;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PREVIEW_TYPE_FIELD_NUMBER = 7;
    public static final int THUMB_DATA_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 1;
    public int bitField0_;
    public String canonicalUrl_ = "";
    public String description_ = "";
    public AnonymousClass8RZ hqThumbnail_;
    public String matchText_ = "";
    public String previewType_ = "";
    public C21674AUx thumbData_ = C21674AUx.A00;
    public String title_ = "";
    public String url_ = "";

    static {
        C173338Rh r1 = new C173338Rh();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173338Rh.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(9);
                A1Z[1] = "url_";
                A1Z[2] = "title_";
                A1Z[3] = "description_";
                A1Z[4] = "thumbData_";
                A1Z[5] = "canonicalUrl_";
                A1Z[6] = "matchText_";
                A1Z[7] = "previewType_";
                A1Z[8] = "hqThumbnail_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဉ\u0007", A1Z);
            case 3:
                return new C173338Rh();
            case 4:
                return new AnonymousClass8KH();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173338Rh.class) {
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
