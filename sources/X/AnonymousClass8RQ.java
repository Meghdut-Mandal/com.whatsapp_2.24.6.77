package X;

/* renamed from: X.8RQ  reason: invalid class name */
public final class AnonymousClass8RQ extends C170918Hz implements C22901AyD {
    public static final int CAPTION_FIELD_NUMBER = 4;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 6;
    public static final AnonymousClass8RQ DEFAULT_INSTANCE;
    public static final int INVITE_EXPIRATION_FIELD_NUMBER = 5;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 3;
    public static final int NEWSLETTER_JID_FIELD_NUMBER = 1;
    public static final int NEWSLETTER_NAME_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public String caption_ = "";
    public AnonymousClass8SG contextInfo_;
    public long inviteExpiration_;
    public C21674AUx jpegThumbnail_ = C21674AUx.A00;
    public String newsletterJid_ = "";
    public String newsletterName_ = "";

    static {
        AnonymousClass8RQ r1 = new AnonymousClass8RQ();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RQ.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(7);
                A1Z[1] = "newsletterJid_";
                A1Z[2] = "newsletterName_";
                A1Z[3] = "jpegThumbnail_";
                A1Z[4] = "caption_";
                A1Z[5] = "inviteExpiration_";
                A1Z[6] = "contextInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဉ\u0005", A1Z);
            case 3:
                return new AnonymousClass8RQ();
            case 4:
                return new AnonymousClass8K9();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RQ.class) {
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
