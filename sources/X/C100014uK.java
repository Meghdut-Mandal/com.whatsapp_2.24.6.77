package X;

/* renamed from: X.4uK  reason: invalid class name and case insensitive filesystem */
public final class C100014uK extends C170918Hz implements C22901AyD {
    public static final int CALL_VIBRATE_FIELD_NUMBER = 6;
    public static final C100014uK DEFAULT_INSTANCE;
    public static final int LOW_PRIORITY_NOTIFICATIONS_FIELD_NUMBER = 4;
    public static final int MESSAGE_LIGHT_FIELD_NUMBER = 3;
    public static final int MESSAGE_POPUP_FIELD_NUMBER = 2;
    public static final int MESSAGE_VIBRATE_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int REACTIONS_MUTED_FIELD_NUMBER = 5;
    public int bitField0_;
    public String callVibrate_ = "";
    public boolean lowPriorityNotifications_;
    public String messageLight_ = "";
    public String messagePopup_ = "";
    public String messageVibrate_ = "";
    public boolean reactionsMuted_;

    static {
        C100014uK r1 = new C100014uK();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C100014uK.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(7);
                A1Z[1] = "messageVibrate_";
                A1Z[2] = "messagePopup_";
                A1Z[3] = "messageLight_";
                A1Z[4] = "lowPriorityNotifications_";
                A1Z[5] = "reactionsMuted_";
                A1Z[6] = "callVibrate_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဈ\u0005", A1Z);
            case 3:
                return new C100014uK();
            case 4:
                return new C99594te();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C100014uK.class) {
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
