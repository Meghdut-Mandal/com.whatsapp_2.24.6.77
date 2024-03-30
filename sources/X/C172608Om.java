package X;

/* renamed from: X.8Om  reason: invalid class name and case insensitive filesystem */
public final class C172608Om extends C170918Hz implements C22901AyD {
    public static final C172608Om DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 2;
    public int state_;
    public C21674AUx uuid_ = C21674AUx.A00;

    static {
        C172608Om r1 = new C172608Om();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172608Om.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0M = AnonymousClass001.A0M();
                A0M[0] = "state_";
                A0M[1] = "uuid_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", A0M);
            case 3:
                return new C172608Om();
            case 4:
                return new C170948Ic();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172608Om.class) {
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
