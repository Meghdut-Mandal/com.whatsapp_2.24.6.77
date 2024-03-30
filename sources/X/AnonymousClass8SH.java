package X;

/* renamed from: X.8SH  reason: invalid class name */
public final class AnonymousClass8SH extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8SH DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int USER_EVENT_ACTION_FIELD_NUMBER = 2;
    public static final int USER_EVENT_FIELD_NUMBER = 1;
    public int userEventAction_;
    public int userEvent_;

    static {
        AnonymousClass8SH r1 = new AnonymousClass8SH();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SH.class);
    }

    public C1888490y A0u() {
        switch (this.userEvent_) {
            case 0:
                return C1888490y.UnknownUserEvent;
            case 1:
                return C1888490y.Don;
            case 2:
                return C1888490y.Doff;
            case 3:
                return C1888490y.CloseArms;
            case 4:
                return C1888490y.OpenArms;
            case 5:
                return C1888490y.DoubleCapturePress;
            case 6:
                return C1888490y.LongCapturePress;
            case 7:
                return C1888490y.ShortCapturePress;
            default:
                return C1888490y.UNRECOGNIZED;
        }
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0M = AnonymousClass001.A0M();
                A0M[0] = "userEvent_";
                A0M[1] = "userEventAction_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", A0M);
            case 3:
                return new AnonymousClass8SH();
            case 4:
                return new AnonymousClass8IR();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SH.class) {
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
