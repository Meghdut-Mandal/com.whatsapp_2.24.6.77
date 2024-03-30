package X;

/* renamed from: X.8RP  reason: invalid class name */
public final class AnonymousClass8RP extends C170918Hz implements C22901AyD {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 5;
    public static final int CURRENT_INDEX_FIELD_NUMBER = 3;
    public static final AnonymousClass8RP DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int RAW_ID_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public static final int VALID_INDEXES_FIELD_NUMBER = 4;
    public int accountType_;
    public int bitField0_;
    public int currentIndex_;
    public int rawId_;
    public long timestamp_;
    public int validIndexesMemoizedSerializedSize = -1;
    public B62 validIndexes_ = AnonymousClass8I0.A02;

    static {
        AnonymousClass8RP r1 = new AnonymousClass8RP();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RP.class);
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
                A1Z[1] = "rawId_";
                A1Z[2] = "timestamp_";
                A1Z[3] = "currentIndex_";
                A1Z[4] = "validIndexes_";
                A1Z[5] = "accountType_";
                A1Z[6] = A6W.A00;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004+\u0005ဌ\u0003", A1Z);
            case 3:
                return new AnonymousClass8RP();
            case 4:
                return new C171028Ik();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RP.class) {
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
