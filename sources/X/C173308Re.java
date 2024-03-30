package X;

/* renamed from: X.8Re  reason: invalid class name and case insensitive filesystem */
public final class C173308Re extends C170918Hz implements C22901AyD {
    public static final int BUTTONS_FIELD_NUMBER = 9;
    public static final int CONTENT_TEXT_FIELD_NUMBER = 6;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 8;
    public static final C173308Re DEFAULT_INSTANCE;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 2;
    public static final int FOOTER_TEXT_FIELD_NUMBER = 7;
    public static final int HEADER_TYPE_FIELD_NUMBER = 10;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 3;
    public static final int LOCATION_MESSAGE_FIELD_NUMBER = 5;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 4;
    public int bitField0_;
    public C23122B6c buttons_ = AnonymousClass8I2.A02;
    public String contentText_ = "";
    public AnonymousClass8SG contextInfo_;
    public String footerText_ = "";
    public int headerCase_ = 0;
    public int headerType_;
    public Object header_;

    static {
        C173308Re r1 = new C173308Re();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173308Re.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[14];
                objArr[0] = "header_";
                C170918Hz.A0Z(objArr, "headerCase_");
                objArr[3] = AnonymousClass8SC.class;
                objArr[4] = AnonymousClass8SF.class;
                objArr[5] = AnonymousClass8SE.class;
                objArr[6] = C173508Ry.class;
                objArr[7] = "contentText_";
                objArr[8] = "footerText_";
                objArr[9] = "contextInfo_";
                objArr[10] = "buttons_";
                objArr[11] = C173078Qh.class;
                objArr[12] = "headerType_";
                objArr[13] = C21047A6k.A00;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0001\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဈ\u0005\u0007ဈ\u0006\bဉ\u0007\t\u001b\nဌ\b", objArr);
            case 3:
                return new C173308Re();
            case 4:
                return new AnonymousClass8N3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173308Re.class) {
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
