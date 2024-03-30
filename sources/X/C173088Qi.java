package X;

/* renamed from: X.8Qi  reason: invalid class name and case insensitive filesystem */
public final class C173088Qi extends C170918Hz implements C22901AyD {
    public static final C173088Qi DEFAULT_INSTANCE;
    public static final int LINK_PREVIEW_RESPONSE_FIELD_NUMBER = 3;
    public static final int MEDIA_UPLOAD_RESULT_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PLACEHOLDER_MESSAGE_RESEND_RESPONSE_FIELD_NUMBER = 4;
    public static final int STICKER_MESSAGE_FIELD_NUMBER = 2;
    public int bitField0_;
    public C173338Rh linkPreviewResponse_;
    public int mediaUploadResult_;
    public C172418Nt placeholderMessageResendResponse_;
    public AnonymousClass8SA stickerMessage_;

    static {
        C173088Qi r1 = new C173088Qi();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173088Qi.class);
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
                A0g[1] = "mediaUploadResult_";
                A0g[2] = A7D.A00;
                A0g[3] = "stickerMessage_";
                A0g[4] = "linkPreviewResponse_";
                A0g[5] = "placeholderMessageResendResponse_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", A0g);
            case 3:
                return new C173088Qi();
            case 4:
                return new C172158Mt();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173088Qi.class) {
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
