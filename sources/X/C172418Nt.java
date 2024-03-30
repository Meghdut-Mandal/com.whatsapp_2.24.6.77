package X;

/* renamed from: X.8Nt  reason: invalid class name and case insensitive filesystem */
public final class C172418Nt extends C170918Hz implements C22901AyD {
    public static final C172418Nt DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int WEB_MESSAGE_INFO_BYTES_FIELD_NUMBER = 1;
    public int bitField0_;
    public C21674AUx webMessageInfoBytes_ = C21674AUx.A00;

    static {
        C172418Nt r1 = new C172418Nt();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172418Nt.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0c = C170918Hz.A0c();
                A0c[1] = "webMessageInfoBytes_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", A0c);
            case 3:
                return new C172418Nt();
            case 4:
                return new AnonymousClass8KJ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172418Nt.class) {
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
