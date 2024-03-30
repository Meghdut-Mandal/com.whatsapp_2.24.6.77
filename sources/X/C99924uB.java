package X;

/* renamed from: X.4uB  reason: invalid class name and case insensitive filesystem */
public final class C99924uB extends C170918Hz implements C22901AyD {
    public static final C99924uB DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SERVER_SIGNATURE_FIELD_NUMBER = 3;
    public static final int SIGNATURE_FIELD_NUMBER = 2;
    public int bitField0_;
    public C21674AUx details_;
    public C21674AUx serverSignature_;
    public C21674AUx signature_;

    static {
        C99924uB r1 = new C99924uB();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C99924uB.class);
    }

    public C99924uB() {
        C21674AUx aUx = C21674AUx.A00;
        this.details_ = aUx;
        this.signature_ = aUx;
        this.serverSignature_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(4);
                A1Z[1] = "details_";
                A1Z[2] = "signature_";
                A1Z[3] = "serverSignature_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", A1Z);
            case 3:
                return new C99924uB();
            case 4:
                return new AnonymousClass8M7();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C99924uB.class) {
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
