package X;

/* renamed from: X.8Qy  reason: invalid class name and case insensitive filesystem */
public final class C173248Qy extends C170918Hz implements C22901AyD {
    public static final int BASE_FIELD_NUMBER = 4;
    public static final C173248Qy DEFAULT_INSTANCE;
    public static final int IV_FIELD_NUMBER = 3;
    public static final int PARAMETERS_FIELD_NUMBER = 5;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    public static final int SEED_FIELD_NUMBER = 2;
    public int base_;
    public C21674AUx iv_;
    public int parameters_;
    public C21674AUx publicKey_;
    public C21674AUx seed_;

    static {
        C173248Qy r1 = new C173248Qy();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173248Qy.class);
    }

    public C173248Qy() {
        C21674AUx aUx = C21674AUx.A00;
        this.publicKey_ = aUx;
        this.seed_ = aUx;
        this.iv_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\u000b\u0005\u000b", new Object[]{"publicKey_", "seed_", "iv_", "base_", "parameters_"});
            case 3:
                return new C173248Qy();
            case 4:
                return new C170938Ib();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173248Qy.class) {
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
