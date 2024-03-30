package X;

/* renamed from: X.8Ry  reason: invalid class name and case insensitive filesystem */
public final class C173508Ry extends C170918Hz implements C22901AyD {
    public static final int ACCURACY_IN_METERS_FIELD_NUMBER = 7;
    public static final int ADDRESS_FIELD_NUMBER = 4;
    public static final int COMMENT_FIELD_NUMBER = 11;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C173508Ry DEFAULT_INSTANCE;
    public static final int DEGREES_CLOCKWISE_FROM_MAGNETIC_NORTH_FIELD_NUMBER = 9;
    public static final int DEGREES_LATITUDE_FIELD_NUMBER = 1;
    public static final int DEGREES_LONGITUDE_FIELD_NUMBER = 2;
    public static final int IS_LIVE_FIELD_NUMBER = 6;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int NAME_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SPEED_IN_MPS_FIELD_NUMBER = 8;
    public static final int URL_FIELD_NUMBER = 5;
    public int accuracyInMeters_;
    public String address_ = "";
    public int bitField0_;
    public String comment_ = "";
    public AnonymousClass8SG contextInfo_;
    public int degreesClockwiseFromMagneticNorth_;
    public double degreesLatitude_;
    public double degreesLongitude_;
    public boolean isLive_;
    public C21674AUx jpegThumbnail_ = C21674AUx.A00;
    public String name_ = "";
    public float speedInMps_;
    public String url_ = "";

    static {
        C173508Ry r1 = new C173508Ry();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173508Ry.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(13);
                A1Z[1] = "degreesLatitude_";
                A1Z[2] = "degreesLongitude_";
                A1Z[3] = "name_";
                A1Z[4] = "address_";
                A1Z[5] = "url_";
                A1Z[6] = "isLive_";
                A1Z[7] = "accuracyInMeters_";
                A1Z[8] = "speedInMps_";
                A1Z[9] = "degreesClockwiseFromMagneticNorth_";
                A1Z[10] = "comment_";
                A1Z[11] = "jpegThumbnail_";
                A1Z[12] = "contextInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\u0011\f\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဋ\u0006\bခ\u0007\tဋ\b\u000bဈ\t\u0010ည\n\u0011ဉ\u000b", A1Z);
            case 3:
                return new C173508Ry();
            case 4:
                return new AnonymousClass8K7();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173508Ry.class) {
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
