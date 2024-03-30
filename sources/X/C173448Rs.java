package X;

/* renamed from: X.8Rs  reason: invalid class name and case insensitive filesystem */
public final class C173448Rs extends C170918Hz implements C22901AyD {
    public static final int ACCURACY_IN_METERS_FIELD_NUMBER = 3;
    public static final int CAPTION_FIELD_NUMBER = 6;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C173448Rs DEFAULT_INSTANCE;
    public static final int DEGREES_CLOCKWISE_FROM_MAGNETIC_NORTH_FIELD_NUMBER = 5;
    public static final int DEGREES_LATITUDE_FIELD_NUMBER = 1;
    public static final int DEGREES_LONGITUDE_FIELD_NUMBER = 2;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 7;
    public static final int SPEED_IN_MPS_FIELD_NUMBER = 4;
    public static final int TIME_OFFSET_FIELD_NUMBER = 8;
    public int accuracyInMeters_;
    public int bitField0_;
    public String caption_ = "";
    public AnonymousClass8SG contextInfo_;
    public int degreesClockwiseFromMagneticNorth_;
    public double degreesLatitude_;
    public double degreesLongitude_;
    public C21674AUx jpegThumbnail_ = C21674AUx.A00;
    public long sequenceNumber_;
    public float speedInMps_;
    public int timeOffset_;

    static {
        C173448Rs r1 = new C173448Rs();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173448Rs.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(11);
                A1Z[1] = "degreesLatitude_";
                A1Z[2] = "degreesLongitude_";
                A1Z[3] = "accuracyInMeters_";
                A1Z[4] = "speedInMps_";
                A1Z[5] = "degreesClockwiseFromMagneticNorth_";
                A1Z[6] = "caption_";
                A1Z[7] = "sequenceNumber_";
                A1Z[8] = "timeOffset_";
                A1Z[9] = "jpegThumbnail_";
                A1Z[10] = "contextInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ဋ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဋ\u0007\u0010ည\b\u0011ဉ\t", A1Z);
            case 3:
                return new C173448Rs();
            case 4:
                return new AnonymousClass8K6();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173448Rs.class) {
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
