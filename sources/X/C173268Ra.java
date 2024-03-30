package X;

/* renamed from: X.8Ra  reason: invalid class name and case insensitive filesystem */
public final class C173268Ra extends C170918Hz implements C22901AyD {
    public static final int AMOUNT_1000_FIELD_NUMBER = 2;
    public static final int AMOUNT_FIELD_NUMBER = 6;
    public static final int BACKGROUND_FIELD_NUMBER = 7;
    public static final int CURRENCY_CODE_ISO4217_FIELD_NUMBER = 1;
    public static final C173268Ra DEFAULT_INSTANCE;
    public static final int EXPIRY_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int NOTE_MESSAGE_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int REQUEST_FROM_FIELD_NUMBER = 3;
    public long amount1000_;
    public AnonymousClass8QC amount_;
    public C100044uN background_;
    public int bitField0_;
    public String currencyCodeIso4217_ = "";
    public long expiryTimestamp_;
    public AnonymousClass8SX noteMessage_;
    public String requestFrom_ = "";

    static {
        C173268Ra r1 = new C173268Ra();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173268Ra.class);
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
                A1Z[1] = "currencyCodeIso4217_";
                A1Z[2] = "amount1000_";
                A1Z[3] = "requestFrom_";
                A1Z[4] = "noteMessage_";
                A1Z[5] = "expiryTimestamp_";
                A1Z[6] = "amount_";
                A1Z[7] = "background_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဃ\u0002\u0003ဈ\u0003\u0004ဉ\u0000\u0005ဂ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", A1Z);
            case 3:
                return new C173268Ra();
            case 4:
                return new AnonymousClass8KU();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173268Ra.class) {
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
