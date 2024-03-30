package X;

/* renamed from: X.8RB  reason: invalid class name */
public final class AnonymousClass8RB extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8RB DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 2;
    public static final int KIND_NEGATIVE_FIELD_NUMBER = 4;
    public static final int KIND_POSITIVE_FIELD_NUMBER = 5;
    public static final int MESSAGE_KEY_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 3;
    public int bitField0_;
    public long kindNegative_;
    public long kindPositive_;
    public int kind_;
    public AnonymousClass8SW messageKey_;
    public String text_ = "";

    static {
        AnonymousClass8RB r1 = new AnonymousClass8RB();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RB.class);
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
                A1Z[1] = "messageKey_";
                A1Z[2] = "kind_";
                A1Z[3] = C21045A6i.A00;
                A1Z[4] = "text_";
                A1Z[5] = "kindNegative_";
                A1Z[6] = "kindPositive_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", A1Z);
            case 3:
                return new AnonymousClass8RB();
            case 4:
                return new AnonymousClass8JK();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RB.class) {
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
