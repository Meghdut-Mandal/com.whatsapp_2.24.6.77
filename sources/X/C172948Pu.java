package X;

/* renamed from: X.8Pu  reason: invalid class name and case insensitive filesystem */
public final class C172948Pu extends C170918Hz implements C22901AyD {
    public static final int CONTACTS_FIELD_NUMBER = 2;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C172948Pu DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public C23122B6c contacts_ = AnonymousClass8I2.A02;
    public AnonymousClass8SG contextInfo_;
    public String displayName_ = "";

    static {
        C172948Pu r1 = new C172948Pu();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172948Pu.class);
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
                A0f[1] = "displayName_";
                A0f[2] = "contacts_";
                A0f[3] = C172938Pt.class;
                A0f[4] = "contextInfo_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0011\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0011ဉ\u0001", A0f);
            case 3:
                return new C172948Pu();
            case 4:
                return new AnonymousClass8JU();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172948Pu.class) {
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
