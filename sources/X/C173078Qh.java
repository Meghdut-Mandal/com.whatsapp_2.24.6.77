package X;

/* renamed from: X.8Qh  reason: invalid class name and case insensitive filesystem */
public final class C173078Qh extends C170918Hz implements C22901AyD {
    public static final int BUTTON_ID_FIELD_NUMBER = 1;
    public static final int BUTTON_TEXT_FIELD_NUMBER = 2;
    public static final C173078Qh DEFAULT_INSTANCE;
    public static final int NATIVE_FLOW_INFO_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public int bitField0_;
    public String buttonId_ = "";
    public C172298Nh buttonText_;
    public C172718Ox nativeFlowInfo_;
    public int type_;

    static {
        C173078Qh r1 = new C173078Qh();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173078Qh.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0g = C170918Hz.A0g();
                A0g[1] = "buttonId_";
                A0g[2] = "buttonText_";
                A0g[3] = "type_";
                A0g[4] = C21046A6j.A00;
                A0g[5] = "nativeFlowInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003", A0g);
            case 3:
                return new C173078Qh();
            case 4:
                return new AnonymousClass8JL();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173078Qh.class) {
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
