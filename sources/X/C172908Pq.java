package X;

/* renamed from: X.8Pq  reason: invalid class name and case insensitive filesystem */
public final class C172908Pq extends C170918Hz implements C22901AyD {
    public static final C172908Pq DEFAULT_INSTANCE;
    public static final int DEGREES_LATITUDE_FIELD_NUMBER = 1;
    public static final int DEGREES_LONGITUDE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public double degreesLatitude_;
    public double degreesLongitude_;
    public String name_ = "";

    static {
        C172908Pq r1 = new C172908Pq();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172908Pq.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0e = C170918Hz.A0e();
                A0e[1] = "degreesLatitude_";
                A0e[2] = "degreesLongitude_";
                A0e[3] = "name_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002", A0e);
            case 3:
                return new C172908Pq();
            case 4:
                return new AnonymousClass8JA();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172908Pq.class) {
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
