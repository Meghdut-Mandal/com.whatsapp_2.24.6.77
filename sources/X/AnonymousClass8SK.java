package X;

/* renamed from: X.8SK  reason: invalid class name */
public final class AnonymousClass8SK extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8SK DEFAULT_INSTANCE;
    public static final int INITIATED_BY_ME_FIELD_NUMBER = 4;
    public static final int INITIATOR_DEVICE_JID_FIELD_NUMBER = 3;
    public static final int INITIATOR_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int TRIGGER_FIELD_NUMBER = 2;
    public int bitField0_;
    public boolean initiatedByMe_;
    public String initiatorDeviceJid_ = "";
    public int initiator_;
    public int trigger_;

    static {
        AnonymousClass8SK r1 = new AnonymousClass8SK();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SK.class);
    }

    @Deprecated
    public C1887490o A0u() {
        int i = this.initiator_;
        if (i != 0) {
            if (i == 1) {
                return C1887490o.INITIATED_BY_ME;
            }
            if (i == 2) {
                return C1887490o.INITIATED_BY_OTHER;
            }
            if (i == 3) {
                return C1887490o.BIZ_UPGRADE_FB_HOSTING;
            }
        }
        return C1887490o.CHANGED_IN_CHAT;
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
                A1Z[1] = "initiator_";
                A1Z[2] = C21040A6d.A00;
                A1Z[3] = "trigger_";
                A1Z[4] = C21041A6e.A00;
                A1Z[5] = "initiatorDeviceJid_";
                A1Z[6] = "initiatedByMe_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", A1Z);
            case 3:
                return new AnonymousClass8SK();
            case 4:
                return new AnonymousClass8NB();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SK.class) {
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
