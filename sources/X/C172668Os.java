package X;

/* renamed from: X.8Os  reason: invalid class name and case insensitive filesystem */
public final class C172668Os extends C170918Hz implements C22901AyD {
    public static final C172668Os DEFAULT_INSTANCE;
    public static final int GROUP_JID_FIELD_NUMBER = 1;
    public static final int GROUP_SUBJECT_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public String groupJid_ = "";
    public String groupSubject_ = "";

    static {
        C172668Os r1 = new C172668Os();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172668Os.class);
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
                A0d[1] = "groupJid_";
                A0d[2] = "groupSubject_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", A0d);
            case 3:
                return new C172668Os();
            case 4:
                return new AnonymousClass8J4();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172668Os.class) {
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
