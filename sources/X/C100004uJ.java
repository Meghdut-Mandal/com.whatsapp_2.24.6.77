package X;

/* renamed from: X.4uJ  reason: invalid class name and case insensitive filesystem */
public final class C100004uJ extends C170918Hz implements C22901AyD {
    public static final C100004uJ DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PRIVATEKEY_FIELD_NUMBER = 3;
    public static final int PUBLICKEY_FIELD_NUMBER = 2;
    public static final int SIGNATURE_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    public int bitField0_;
    public int id_;
    public C21674AUx privateKey_;
    public C21674AUx publicKey_;
    public C21674AUx signature_;
    public long timestamp_;

    static {
        C100004uJ r1 = new C100004uJ();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C100004uJ.class);
    }

    public C100004uJ() {
        C21674AUx aUx = C21674AUx.A00;
        this.publicKey_ = aUx;
        this.privateKey_ = aUx;
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
                Object[] A1Z = C90474aD.A1Z(6);
                A1Z[1] = "id_";
                A1Z[2] = "publicKey_";
                A1Z[3] = "privateKey_";
                A1Z[4] = "signature_";
                A1Z[5] = "timestamp_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005စ\u0004", A1Z);
            case 3:
                return new C100004uJ();
            case 4:
                return new C99774tw();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C100004uJ.class) {
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
