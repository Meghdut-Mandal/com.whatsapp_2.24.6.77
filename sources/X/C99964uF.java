package X;

/* renamed from: X.4uF  reason: invalid class name and case insensitive filesystem */
public final class C99964uF extends C170918Hz implements C22901AyD {
    public static final int BACKUP_KEY_DATA_FIELD_NUMBER = 1;
    public static final C99964uF DEFAULT_INSTANCE;
    public static final int OPAQUE_CHALLENGE_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int R3_FIELD_NUMBER = 2;
    public static final int TRANSCRIPT_FIELD_NUMBER = 4;
    public C21674AUx backupKeyData_;
    public int bitField0_;
    public C21674AUx opaqueChallenge_;
    public C21674AUx r3_;
    public C21674AUx transcript_;

    static {
        C99964uF r1 = new C99964uF();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C99964uF.class);
    }

    public C99964uF() {
        C21674AUx aUx = C21674AUx.A00;
        this.backupKeyData_ = aUx;
        this.r3_ = aUx;
        this.opaqueChallenge_ = aUx;
        this.transcript_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(5);
                A1Z[1] = "backupKeyData_";
                A1Z[2] = "r3_";
                A1Z[3] = "opaqueChallenge_";
                A1Z[4] = "transcript_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", A1Z);
            case 3:
                return new C99964uF();
            case 4:
                return new C99714tq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C99964uF.class) {
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
