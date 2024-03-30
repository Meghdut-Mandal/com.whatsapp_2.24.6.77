package X;

/* renamed from: X.4uE  reason: invalid class name and case insensitive filesystem */
public final class C99954uE extends C170918Hz implements C22901AyD {
    public static final C99954uE DEFAULT_INSTANCE;
    public static final int DOWNLOAD_AUDIO_FIELD_NUMBER = 2;
    public static final int DOWNLOAD_DOCUMENTS_FIELD_NUMBER = 4;
    public static final int DOWNLOAD_IMAGES_FIELD_NUMBER = 1;
    public static final int DOWNLOAD_VIDEO_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public boolean downloadAudio_;
    public boolean downloadDocuments_;
    public boolean downloadImages_;
    public boolean downloadVideo_;

    static {
        C99954uE r1 = new C99954uE();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C99954uE.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(5);
                A1Z[1] = "downloadImages_";
                A1Z[2] = "downloadAudio_";
                A1Z[3] = "downloadVideo_";
                A1Z[4] = "downloadDocuments_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", A1Z);
            case 3:
                return new C99954uE();
            case 4:
                return new C99564tb();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C99954uE.class) {
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
