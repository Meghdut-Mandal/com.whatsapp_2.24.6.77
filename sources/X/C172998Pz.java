package X;

/* renamed from: X.8Pz  reason: invalid class name and case insensitive filesystem */
public final class C172998Pz extends C170918Hz implements C22901AyD {
    public static final int CURRENCY_FIELD_NUMBER = 2;
    public static final int DATE_TIME_FIELD_NUMBER = 3;
    public static final int DEFAULT_FIELD_NUMBER = 1;
    public static final C172998Pz DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public String default_ = "";
    public int paramOneofCase_ = 0;
    public Object paramOneof_;

    static {
        C172998Pz r1 = new C172998Pz();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172998Pz.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[6];
                objArr[0] = "paramOneof_";
                C170918Hz.A0Z(objArr, "paramOneofCase_");
                objArr[3] = "default_";
                objArr[4] = AnonymousClass8P2.class;
                objArr[5] = AnonymousClass8P3.class;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003ြ\u0000", objArr);
            case 3:
                return new C172998Pz();
            case 4:
                return new C171238Jf();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172998Pz.class) {
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
