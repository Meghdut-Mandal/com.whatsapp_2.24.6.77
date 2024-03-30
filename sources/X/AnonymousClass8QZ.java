package X;

/* renamed from: X.8QZ  reason: invalid class name */
public final class AnonymousClass8QZ extends C170918Hz implements C22901AyD {
    public static final int BODY_FIELD_NUMBER = 1;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 15;
    public static final AnonymousClass8QZ DEFAULT_INSTANCE;
    public static final int NATIVE_FLOW_RESPONSE_MESSAGE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public AnonymousClass8P6 body_;
    public AnonymousClass8SG contextInfo_;
    public int interactiveResponseMessageCase_ = 0;
    public Object interactiveResponseMessage_;

    static {
        AnonymousClass8QZ r1 = new AnonymousClass8QZ();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8QZ.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[6];
                objArr[0] = "interactiveResponseMessage_";
                C170918Hz.A0Z(objArr, "interactiveResponseMessageCase_");
                objArr[3] = "body_";
                objArr[4] = AnonymousClass8Q3.class;
                objArr[5] = "contextInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u000f\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u000fဉ\u0002", objArr);
            case 3:
                return new AnonymousClass8QZ();
            case 4:
                return new C171388Ju();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8QZ.class) {
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
