package X;

/* renamed from: X.8PC  reason: invalid class name */
public final class AnonymousClass8PC extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8PC DEFAULT_INSTANCE;
    public static final int ENC_IV_FIELD_NUMBER = 2;
    public static final int ENC_PAYLOAD_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public C21674AUx encIv_;
    public C21674AUx encPayload_;

    static {
        AnonymousClass8PC r1 = new AnonymousClass8PC();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8PC.class);
    }

    public AnonymousClass8PC() {
        C21674AUx aUx = C21674AUx.A00;
        this.encPayload_ = aUx;
        this.encIv_ = aUx;
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
                A0d[1] = "encPayload_";
                A0d[2] = "encIv_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", A0d);
            case 3:
                return new AnonymousClass8PC();
            case 4:
                return new C172168Mu();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8PC.class) {
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
