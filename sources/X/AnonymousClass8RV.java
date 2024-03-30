package X;

/* renamed from: X.8RV  reason: invalid class name */
public final class AnonymousClass8RV extends C170918Hz implements C22901AyD {
    public static final int BITRATE_FIELD_NUMBER = 4;
    public static final AnonymousClass8RV DEFAULT_INSTANCE;
    public static final int EISMODE_FIELD_NUMBER = 7;
    public static final int FRAMERATE_FIELD_NUMBER = 5;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int IFRAMEINTERVAL_FIELD_NUMBER = 6;
    public static final int MIME_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 2;
    public int bitrate_;
    public int eisMode_;
    public int frameRate_;
    public int height_;
    public int iFrameInterval_;
    public String mime_ = "";
    public int width_;

    static {
        AnonymousClass8RV r1 = new AnonymousClass8RV();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RV.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007\f", new Object[]{"mime_", "width_", "height_", "bitrate_", "frameRate_", "iFrameInterval_", "eisMode_"});
            case 3:
                return new AnonymousClass8RV();
            case 4:
                return new AnonymousClass8IS();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RV.class) {
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
