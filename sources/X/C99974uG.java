package X;

/* renamed from: X.4uG  reason: invalid class name and case insensitive filesystem */
public final class C99974uG extends C170918Hz implements C22901AyD {
    public static final int BACKUP_CIPHER_HEADER_FIELD_NUMBER = 1;
    public static final C99974uG DEFAULT_INSTANCE;
    public static final int ENCRYPTION_IV_FIELD_NUMBER = 5;
    public static final int GOOGLE_ID_SALT_FIELD_NUMBER = 4;
    public static final int KEY_VERSION_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SERVER_SALT_FIELD_NUMBER = 3;
    public C21674AUx backupCipherHeader_;
    public int bitField0_;
    public C21674AUx encryptionIv_;
    public C21674AUx googleIdSalt_;
    public String keyVersion_ = "";
    public C21674AUx serverSalt_;

    static {
        C99974uG r1 = new C99974uG();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C99974uG.class);
    }

    public C99974uG() {
        C21674AUx aUx = C21674AUx.A00;
        this.backupCipherHeader_ = aUx;
        this.serverSalt_ = aUx;
        this.googleIdSalt_ = aUx;
        this.encryptionIv_ = aUx;
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
                A1Z[1] = "backupCipherHeader_";
                A1Z[2] = "keyVersion_";
                A1Z[3] = "serverSalt_";
                A1Z[4] = "googleIdSalt_";
                A1Z[5] = "encryptionIv_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004", A1Z);
            case 3:
                return new C99974uG();
            case 4:
                return new C99504tV();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C99974uG.class) {
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
