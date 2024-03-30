package X;

/* renamed from: X.8SI  reason: invalid class name */
public final class AnonymousClass8SI extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8SI DEFAULT_INSTANCE;
    public static final int ERRORCODE_FIELD_NUMBER = 1;
    public static final int HIGHPRIORITYAPP_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public int errorCode_;
    public int errorDataCase_ = 0;
    public Object errorData_;
    public C23122B6c status_ = AnonymousClass8I2.A02;

    static {
        AnonymousClass8SI r1 = new AnonymousClass8SI();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SI.class);
    }

    public AnonymousClass911 A0u() {
        switch (this.errorCode_) {
            case 0:
                return AnonymousClass911.SNAPP_UNKNOWN_ERROR;
            case 1:
                return AnonymousClass911.SNAPP_SUCCESS;
            case 2:
                return AnonymousClass911.SNAPP_UNKNOWN_MESSAGE;
            case 3:
                return AnonymousClass911.SNAPP_UNHANDLED_MESSAGE;
            case 4:
                return AnonymousClass911.SNAPP_PAYLOAD_CORRUPTED;
            case 5:
                return AnonymousClass911.SNAPP_UNSUPPORTED_APP;
            case 6:
                return AnonymousClass911.SNAPP_NOT_ENOUGH_BATTERY;
            case 7:
                return AnonymousClass911.SNAPP_THERMAL_THROTTLING;
            case 8:
                return AnonymousClass911.SNAPP_NOT_ENOUGH_STORAGE;
            case 9:
                return AnonymousClass911.SNAPP_START_APP_FAILED;
            case 10:
                return AnonymousClass911.SNAPP_STOP_APP_FAILED;
            case 11:
                return AnonymousClass911.SNAPP_APP_NOT_RUNNING;
            case 12:
                return AnonymousClass911.SNAPP_APP_ALREADY_STARTED;
            case 13:
                return AnonymousClass911.SNAPP_NOT_ENOUGH_PRIORITY;
            case 14:
                return AnonymousClass911.SNAPP_CHARGING_NOT_CONNECTED;
            case 15:
                return AnonymousClass911.SNAPP_DENIED_BY_PEAK_POWER;
            default:
                return AnonymousClass911.UNRECOGNIZED;
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
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001c\u0003?\u0000", new Object[]{"errorData_", "errorDataCase_", "errorCode_", "status_"});
            case 3:
                return new AnonymousClass8SI();
            case 4:
                return new C170998Ih();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SI.class) {
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
