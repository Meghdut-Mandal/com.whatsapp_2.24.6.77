package X;

/* renamed from: X.8RZ  reason: invalid class name */
public final class AnonymousClass8RZ extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8RZ DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 1;
    public static final int ENC_THUMB_HASH_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 4;
    public static final int MEDIA_KEY_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int THUMB_HASH_FIELD_NUMBER = 2;
    public static final int THUMB_HEIGHT_FIELD_NUMBER = 7;
    public static final int THUMB_WIDTH_FIELD_NUMBER = 6;
    public int bitField0_;
    public String directPath_ = "";
    public String encThumbHash_ = "";
    public long mediaKeyTimestampMs_;
    public C21674AUx mediaKey_ = C21674AUx.A00;
    public String thumbHash_ = "";
    public int thumbHeight_;
    public int thumbWidth_;

    static {
        AnonymousClass8RZ r1 = new AnonymousClass8RZ();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RZ.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(8);
                A1Z[1] = "directPath_";
                A1Z[2] = "thumbHash_";
                A1Z[3] = "encThumbHash_";
                A1Z[4] = "mediaKey_";
                A1Z[5] = "mediaKeyTimestampMs_";
                A1Z[6] = "thumbWidth_";
                A1Z[7] = "thumbHeight_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဂ\u0004\u0006င\u0005\u0007င\u0006", A1Z);
            case 3:
                return new AnonymousClass8RZ();
            case 4:
                return new AnonymousClass8KI();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RZ.class) {
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
