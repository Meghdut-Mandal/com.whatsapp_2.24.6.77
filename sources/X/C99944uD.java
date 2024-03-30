package X;

/* renamed from: X.4uD  reason: invalid class name and case insensitive filesystem */
public final class C99944uD extends C170918Hz implements C22901AyD {
    public static final int CALL_KEY_FIELD_NUMBER = 1;
    public static final int CONVERSION_DATA_FIELD_NUMBER = 3;
    public static final int CONVERSION_DELAY_SECONDS_FIELD_NUMBER = 4;
    public static final int CONVERSION_SOURCE_FIELD_NUMBER = 2;
    public static final C99944uD DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public C21674AUx callKey_;
    public C21674AUx conversionData_;
    public int conversionDelaySeconds_;
    public String conversionSource_ = "";

    static {
        C99944uD r1 = new C99944uD();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C99944uD.class);
    }

    public C99944uD() {
        C21674AUx aUx = C21674AUx.A00;
        this.callKey_ = aUx;
        this.conversionData_ = aUx;
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
                A1Z[1] = "callKey_";
                A1Z[2] = "conversionSource_";
                A1Z[3] = "conversionData_";
                A1Z[4] = "conversionDelaySeconds_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဋ\u0003", A1Z);
            case 3:
                return new C99944uD();
            case 4:
                return new C99534tY();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C99944uD.class) {
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
