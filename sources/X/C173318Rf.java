package X;

/* renamed from: X.8Rf  reason: invalid class name and case insensitive filesystem */
public final class C173318Rf extends C170918Hz implements C22901AyD {
    public static final int CAPTION_FIELD_NUMBER = 6;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 7;
    public static final C173318Rf DEFAULT_INSTANCE;
    public static final int GROUP_JID_FIELD_NUMBER = 1;
    public static final int GROUP_NAME_FIELD_NUMBER = 4;
    public static final int GROUP_TYPE_FIELD_NUMBER = 8;
    public static final int INVITE_CODE_FIELD_NUMBER = 2;
    public static final int INVITE_EXPIRATION_FIELD_NUMBER = 3;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 5;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public String caption_ = "";
    public AnonymousClass8SG contextInfo_;
    public String groupJid_ = "";
    public String groupName_ = "";
    public int groupType_;
    public String inviteCode_ = "";
    public long inviteExpiration_;
    public C21674AUx jpegThumbnail_ = C21674AUx.A00;

    static {
        C173318Rf r1 = new C173318Rf();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173318Rf.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(10);
                A1Z[1] = "groupJid_";
                A1Z[2] = "inviteCode_";
                A1Z[3] = "inviteExpiration_";
                A1Z[4] = "groupName_";
                A1Z[5] = "jpegThumbnail_";
                A1Z[6] = "caption_";
                A1Z[7] = "contextInfo_";
                A1Z[8] = "groupType_";
                A1Z[9] = C21055A6s.A00;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ည\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bဌ\u0007", A1Z);
            case 3:
                return new C173318Rf();
            case 4:
                return new C171218Jd();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173318Rf.class) {
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
