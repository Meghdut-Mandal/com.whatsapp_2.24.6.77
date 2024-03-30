package X;

/* renamed from: X.8Qc  reason: invalid class name and case insensitive filesystem */
public final class C173028Qc extends C170918Hz implements C22901AyD {
    public static final int ACCOUNT_SIGNATURE_FIELD_NUMBER = 3;
    public static final int ACCOUNT_SIGNATURE_KEY_FIELD_NUMBER = 2;
    public static final C173028Qc DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    public static final int DEVICE_SIGNATURE_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER;
    public C21674AUx accountSignatureKey_;
    public C21674AUx accountSignature_;
    public int bitField0_;
    public C21674AUx details_;
    public C21674AUx deviceSignature_;

    static {
        C173028Qc r1 = new C173028Qc();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173028Qc.class);
    }

    public C173028Qc() {
        C21674AUx aUx = C21674AUx.A00;
        this.details_ = aUx;
        this.accountSignatureKey_ = aUx;
        this.accountSignature_ = aUx;
        this.deviceSignature_ = aUx;
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
                A0f[1] = "details_";
                A0f[2] = "accountSignatureKey_";
                A0f[3] = "accountSignature_";
                A0f[4] = "deviceSignature_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", A0f);
            case 3:
                return new C173028Qc();
            case 4:
                return new C171038Il();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173028Qc.class) {
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
