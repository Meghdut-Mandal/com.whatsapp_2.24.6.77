package X;

/* renamed from: X.8P4  reason: invalid class name */
public final class AnonymousClass8P4 extends C170918Hz implements C22901AyD {
    public static final int CARDS_FIELD_NUMBER = 1;
    public static final AnonymousClass8P4 DEFAULT_INSTANCE;
    public static final int MESSAGE_VERSION_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public C23122B6c cards_ = AnonymousClass8I2.A02;
    public int messageVersion_ = 1;

    static {
        AnonymousClass8P4 r1 = new AnonymousClass8P4();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8P4.class);
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
                A0e[1] = "cards_";
                A0e[2] = AnonymousClass8SV.class;
                A0e[3] = "messageVersion_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", A0e);
            case 3:
                return new AnonymousClass8P4();
            case 4:
                return new C171318Jn();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8P4.class) {
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
