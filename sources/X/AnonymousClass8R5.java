package X;

/* renamed from: X.8R5  reason: invalid class name */
public final class AnonymousClass8R5 extends C170918Hz implements C22901AyD {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 4;
    public static final AnonymousClass8R5 DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 5;
    public static final int KEY_INDEX_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int RAW_ID_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public int accountType_;
    public int bitField0_;
    public int deviceType_;
    public int keyIndex_;
    public int rawId_;
    public long timestamp_;

    static {
        AnonymousClass8R5 r1 = new AnonymousClass8R5();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8R5.class);
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
                A1Z[1] = "rawId_";
                A1Z[2] = "timestamp_";
                A1Z[3] = "keyIndex_";
                A1Z[4] = "accountType_";
                C22900AyC ayC = A6W.A00;
                A1Z[5] = ayC;
                A1Z[6] = "deviceType_";
                A1Z[7] = ayC;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", A1Z);
            case 3:
                return new AnonymousClass8R5();
            case 4:
                return new C171018Ij();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8R5.class) {
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
