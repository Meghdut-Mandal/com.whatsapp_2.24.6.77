package X;

/* renamed from: X.8SV  reason: invalid class name */
public final class AnonymousClass8SV extends C170918Hz implements C22901AyD {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int CAROUSEL_MESSAGE_FIELD_NUMBER = 7;
    public static final int COLLECTION_MESSAGE_FIELD_NUMBER = 5;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 15;
    public static final AnonymousClass8SV DEFAULT_INSTANCE;
    public static final int FOOTER_FIELD_NUMBER = 3;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int NATIVE_FLOW_MESSAGE_FIELD_NUMBER = 6;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SHOP_STOREFRONT_MESSAGE_FIELD_NUMBER = 4;
    public int bitField0_;
    public C172358Nn body_;
    public AnonymousClass8SG contextInfo_;
    public C172368No footer_;
    public AnonymousClass8SN header_;
    public int interactiveMessageCase_ = 0;
    public Object interactiveMessage_;

    static {
        AnonymousClass8SV r1 = new AnonymousClass8SV();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SV.class);
    }

    public AnonymousClass8Q1 A0u() {
        if (this.interactiveMessageCase_ == 6) {
            return (AnonymousClass8Q1) this.interactiveMessage_;
        }
        return AnonymousClass8Q1.DEFAULT_INSTANCE;
    }

    public Integer A0v() {
        int i = this.interactiveMessageCase_;
        if (i == 0) {
            return C023109s.A0R;
        }
        if (i == 4) {
            return C023109s.A00;
        }
        if (i == 5) {
            return C023109s.A01;
        }
        if (i == 6) {
            return C023109s.A0C;
        }
        if (i != 7) {
            return null;
        }
        return C023109s.A0G;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[11];
                objArr[0] = "interactiveMessage_";
                C170918Hz.A0Z(objArr, "interactiveMessageCase_");
                objArr[3] = "header_";
                objArr[4] = "body_";
                objArr[5] = "footer_";
                objArr[6] = AnonymousClass8Q2.class;
                objArr[7] = AnonymousClass8Q0.class;
                objArr[8] = AnonymousClass8Q1.class;
                objArr[9] = AnonymousClass8P4.class;
                objArr[10] = "contextInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\u000f\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\u000fဉ\u0007", objArr);
            case 3:
                return new AnonymousClass8SV();
            case 4:
                return new AnonymousClass8NF();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SV.class) {
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
