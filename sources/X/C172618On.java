package X;

/* renamed from: X.8On  reason: invalid class name and case insensitive filesystem */
public final class C172618On extends C170918Hz implements C22901AyD {
    public static final int APPID_FIELD_NUMBER = 1;
    public static final C172618On DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int POLICY_FIELD_NUMBER = 2;
    public int appID_;
    public AnonymousClass8NT policy_;

    static {
        C172618On r1 = new C172618On();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172618On.class);
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
                A0M[0] = "appID_";
                A0M[1] = "policy_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", A0M);
            case 3:
                return new C172618On();
            case 4:
                return new C170968Ie();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172618On.class) {
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
