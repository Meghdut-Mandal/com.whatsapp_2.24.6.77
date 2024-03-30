package X;

/* renamed from: X.8Ov  reason: invalid class name and case insensitive filesystem */
public final class C172698Ov extends C170918Hz implements C22901AyD {
    public static final int COLLECTION_NAMES_FIELD_NUMBER = 1;
    public static final C172698Ov DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public int bitField0_;
    public C23122B6c collectionNames_ = AnonymousClass8I2.A02;
    public long timestamp_;

    static {
        C172698Ov r1 = new C172698Ov();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172698Ov.class);
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
                A0d[1] = "collectionNames_";
                A0d[2] = "timestamp_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000", A0d);
            case 3:
                return new C172698Ov();
            case 4:
                return new AnonymousClass8JC();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172698Ov.class) {
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
