package X;

/* renamed from: X.8QY  reason: invalid class name */
public final class AnonymousClass8QY extends C170918Hz implements C22901AyD {
    public static final int CURRENT_INDEX_FIELD_NUMBER = 2;
    public static final AnonymousClass8QY DEFAULT_INSTANCE;
    public static final int DEVICE_INDEXES_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int RAW_ID_FIELD_NUMBER = 1;
    public int bitField0_;
    public int currentIndex_;
    public int deviceIndexesMemoizedSerializedSize = -1;
    public B62 deviceIndexes_ = AnonymousClass8I0.A02;
    public int rawId_;

    static {
        AnonymousClass8QY r1 = new AnonymousClass8QY();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8QY.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0e = C170918Hz.A0e();
                A0e[1] = "rawId_";
                A0e[2] = "currentIndex_";
                A0e[3] = "deviceIndexes_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003+", A0e);
            case 3:
                return new AnonymousClass8QY();
            case 4:
                return new AnonymousClass8JF();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8QY.class) {
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
