package X;

/* renamed from: X.8SN  reason: invalid class name */
public final class AnonymousClass8SN extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8SN DEFAULT_INSTANCE;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 3;
    public static final int HAS_MEDIA_ATTACHMENT_FIELD_NUMBER = 5;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 4;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 6;
    public static final int LOCATION_MESSAGE_FIELD_NUMBER = 8;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PRODUCT_MESSAGE_FIELD_NUMBER = 9;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 7;
    public int bitField0_;
    public boolean hasMediaAttachment_;
    public int mediaCase_ = 0;
    public Object media_;
    public String subtitle_ = "";
    public String title_ = "";

    static {
        AnonymousClass8SN r1 = new AnonymousClass8SN();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SN.class);
    }

    public boolean A0u() {
        return AnonymousClass000.A1P(this.bitField0_ & 256);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[11];
                objArr[0] = "media_";
                C170918Hz.A0Z(objArr, "mediaCase_");
                objArr[3] = "title_";
                objArr[4] = "subtitle_";
                objArr[5] = AnonymousClass8SC.class;
                objArr[6] = AnonymousClass8SF.class;
                objArr[7] = "hasMediaAttachment_";
                objArr[8] = AnonymousClass8SE.class;
                objArr[9] = C173508Ry.class;
                objArr[10] = AnonymousClass8RR.class;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ဇ\b\u0006ွ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", objArr);
            case 3:
                return new AnonymousClass8SN();
            case 4:
                return new AnonymousClass8ND();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SN.class) {
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
