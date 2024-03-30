package X;

/* renamed from: X.4uN  reason: invalid class name and case insensitive filesystem */
public final class C100044uN extends C170918Hz implements C22901AyD {
    public static final C100044uN DEFAULT_INSTANCE;
    public static final int FILE_LENGTH_FIELD_NUMBER = 2;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MEDIA_DATA_FIELD_NUMBER = 9;
    public static final int MIMETYPE_FIELD_NUMBER = 5;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PLACEHOLDER_ARGB_FIELD_NUMBER = 6;
    public static final int SUBTEXT_ARGB_FIELD_NUMBER = 8;
    public static final int TEXT_ARGB_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 10;
    public static final int WIDTH_FIELD_NUMBER = 3;
    public int bitField0_;
    public long fileLength_;
    public int height_;
    public String id_ = "";
    public C99994uI mediaData_;
    public String mimetype_ = "";
    public int placeholderArgb_;
    public int subtextArgb_;
    public int textArgb_;
    public int type_;
    public int width_;

    static {
        C100044uN r1 = new C100044uN();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C100044uN.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(12);
                A1Z[1] = "id_";
                A1Z[2] = "fileLength_";
                A1Z[3] = "width_";
                A1Z[4] = "height_";
                A1Z[5] = "mimetype_";
                A1Z[6] = "placeholderArgb_";
                A1Z[7] = "textArgb_";
                A1Z[8] = "subtextArgb_";
                A1Z[9] = "mediaData_";
                A1Z[10] = "type_";
                A1Z[11] = C141826nt.A00;
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဈ\u0004\u0006ဆ\u0005\u0007ဆ\u0006\bဆ\u0007\tဉ\b\nဌ\t", A1Z);
            case 3:
                return new C100044uN();
            case 4:
                return new C99544tZ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C100044uN.class) {
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
