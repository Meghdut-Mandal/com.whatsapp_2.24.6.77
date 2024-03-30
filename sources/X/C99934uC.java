package X;

/* renamed from: X.4uC  reason: invalid class name and case insensitive filesystem */
public final class C99934uC extends C170918Hz implements C22901AyD {
    public static final int BACKUP_METADATA_FIELD_NUMBER = 4;
    public static final C99934uC DEFAULT_INSTANCE;
    public static final int HSM_CONTROLLED_KEY_DATA_FIELD_NUMBER = 3;
    public static final int KEY_TYPE_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int WA_PROVIDED_KEY_DATA_FIELD_NUMBER = 2;
    public C100094uS backupMetadata_;
    public int bitField0_;
    public C99794ty hsmControlledKeyData_;
    public int keyType_;
    public C99974uG waProvidedKeyData_;

    static {
        C99934uC r1 = new C99934uC();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C99934uC.class);
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
                A1Z[1] = "keyType_";
                A1Z[2] = C141806nr.A00;
                A1Z[3] = "waProvidedKeyData_";
                A1Z[4] = "hsmControlledKeyData_";
                A1Z[5] = "backupMetadata_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", A1Z);
            case 3:
                return new C99934uC();
            case 4:
                return new C99484tT();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C99934uC.class) {
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
