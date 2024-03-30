package X;

/* renamed from: X.8Oo  reason: invalid class name and case insensitive filesystem */
public final class C172628Oo extends C170918Hz implements C22901AyD {
    public static final C172628Oo DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SIGNATURE_FIELD_NUMBER = 2;
    public int bitField0_;
    public C21674AUx details_;
    public C21674AUx signature_;

    static {
        C172628Oo r1 = new C172628Oo();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172628Oo.class);
    }

    public C172628Oo() {
        C21674AUx aUx = C21674AUx.A00;
        this.details_ = aUx;
        this.signature_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0d = C170918Hz.A0d();
                A0d[1] = "details_";
                A0d[2] = "signature_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", A0d);
            case 3:
                return new C172628Oo();
            case 4:
                return new C171078Ip();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172628Oo.class) {
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
