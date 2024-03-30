package X;

/* renamed from: X.8Qz  reason: invalid class name and case insensitive filesystem */
public final class C173258Qz extends C170918Hz implements C22901AyD {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 3;
    public static final C173258Qz DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SELECTED_BUTTON_ID_FIELD_NUMBER = 1;
    public static final int SELECTED_DISPLAY_TEXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 4;
    public int bitField0_;
    public AnonymousClass8SG contextInfo_;
    public int responseCase_ = 0;
    public Object response_;
    public String selectedButtonId_ = "";
    public int type_;

    static {
        C173258Qz r1 = new C173258Qz();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173258Qz.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[7];
                objArr[0] = "response_";
                C170918Hz.A0Z(objArr, "responseCase_");
                objArr[3] = "selectedButtonId_";
                objArr[4] = "contextInfo_";
                objArr[5] = "type_";
                objArr[6] = C21048A6l.A00;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ဉ\u0002\u0004ဌ\u0003", objArr);
            case 3:
                return new C173258Qz();
            case 4:
                return new AnonymousClass8JO();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173258Qz.class) {
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
