package X;

/* renamed from: X.8Q1  reason: invalid class name */
public final class AnonymousClass8Q1 extends C170918Hz implements C22901AyD {
    public static final int BUTTONS_FIELD_NUMBER = 1;
    public static final AnonymousClass8Q1 DEFAULT_INSTANCE;
    public static final int MESSAGE_PARAMS_JSON_FIELD_NUMBER = 2;
    public static final int MESSAGE_VERSION_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public C23122B6c buttons_ = AnonymousClass8I2.A02;
    public String messageParamsJson_ = "";
    public int messageVersion_ = 1;

    static {
        AnonymousClass8Q1 r1 = new AnonymousClass8Q1();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8Q1.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0f = C170918Hz.A0f();
                A0f[1] = "buttons_";
                A0f[2] = AnonymousClass8P5.class;
                A0f[3] = "messageParamsJson_";
                A0f[4] = "messageVersion_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003င\u0001", A0f);
            case 3:
                return new AnonymousClass8Q1();
            case 4:
                return new C171348Jq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8Q1.class) {
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
