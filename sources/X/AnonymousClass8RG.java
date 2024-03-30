package X;

/* renamed from: X.8RG  reason: invalid class name */
public final class AnonymousClass8RG extends C170918Hz implements C22901AyD {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 5;
    public static final AnonymousClass8RG DEFAULT_INSTANCE;
    public static final int ENC_KEY_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SELECTABLE_OPTIONS_COUNT_FIELD_NUMBER = 4;
    public int bitField0_;
    public AnonymousClass8SG contextInfo_;
    public C21674AUx encKey_ = C21674AUx.A00;
    public String name_ = "";
    public C23122B6c options_ = AnonymousClass8I2.A02;
    public int selectableOptionsCount_;

    static {
        AnonymousClass8RG r1 = new AnonymousClass8RG();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RG.class);
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
                A1Z[1] = "encKey_";
                A1Z[2] = "name_";
                A1Z[3] = "options_";
                A1Z[4] = C172438Nv.class;
                A1Z[5] = "selectableOptionsCount_";
                A1Z[6] = "contextInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဋ\u0002\u0005ဉ\u0003", A1Z);
            case 3:
                return new AnonymousClass8RG();
            case 4:
                return new AnonymousClass8KM();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RG.class) {
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
