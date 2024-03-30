package X;

/* renamed from: X.8Qd  reason: invalid class name and case insensitive filesystem */
public final class C173038Qd extends C170918Hz implements C22901AyD {
    public static final int ADVERTISER_NAME_FIELD_NUMBER = 1;
    public static final int CAPTION_FIELD_NUMBER = 17;
    public static final C173038Qd DEFAULT_INSTANCE;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER;
    public String advertiserName_ = "";
    public int bitField0_;
    public String caption_ = "";
    public C21674AUx jpegThumbnail_ = C21674AUx.A00;
    public int mediaType_;

    static {
        C173038Qd r1 = new C173038Qd();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173038Qd.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0g = C170918Hz.A0g();
                A0g[1] = "advertiserName_";
                A0g[2] = "mediaType_";
                A0g[3] = C21037A6a.A00;
                A0g[4] = "jpegThumbnail_";
                A0g[5] = "caption_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0010ည\u0002\u0011ဈ\u0003", A0g);
            case 3:
                return new C173038Qd();
            case 4:
                return new C171168Iy();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173038Qd.class) {
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
