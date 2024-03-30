package X;

/* renamed from: X.8RX  reason: invalid class name */
public final class AnonymousClass8RX extends C170918Hz implements C22901AyD {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 1;
    public static final AnonymousClass8RX DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int IS_CANCELED_FIELD_NUMBER = 2;
    public static final int JOIN_LINK_FIELD_NUMBER = 6;
    public static final int LOCATION_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 7;
    public int bitField0_;
    public AnonymousClass8SG contextInfo_;
    public String description_ = "";
    public boolean isCanceled_;
    public String joinLink_ = "";
    public C173508Ry location_;
    public String name_ = "";
    public long startTime_;

    static {
        AnonymousClass8RX r1 = new AnonymousClass8RX();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RX.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(8);
                A1Z[1] = "contextInfo_";
                A1Z[2] = "isCanceled_";
                A1Z[3] = "name_";
                A1Z[4] = "description_";
                A1Z[5] = "location_";
                A1Z[6] = "joinLink_";
                A1Z[7] = "startTime_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဂ\u0006", A1Z);
            case 3:
                return new AnonymousClass8RX();
            case 4:
                return new C171188Ja();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RX.class) {
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
