package X;

/* renamed from: X.4uM  reason: invalid class name and case insensitive filesystem */
public final class C100034uM extends C170918Hz implements C22901AyD {
    public static final C100034uM DEFAULT_INSTANCE;
    public static final int DELIVERED_DEVICE_JID_FIELD_NUMBER = 6;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PENDING_DEVICE_JID_FIELD_NUMBER = 5;
    public static final int PLAYED_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int READ_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int RECEIPT_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int USER_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public C23122B6c deliveredDeviceJid_;
    public byte memoizedIsInitialized = 2;
    public C23122B6c pendingDeviceJid_;
    public long playedTimestamp_;
    public long readTimestamp_;
    public long receiptTimestamp_;
    public String userJid_ = "";

    static {
        C100034uM r1 = new C100034uM();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C100034uM.class);
    }

    public C100034uM() {
        AnonymousClass8I2 r0 = AnonymousClass8I2.A02;
        this.pendingDeviceJid_ = r0;
        this.deliveredDeviceJid_ = r0;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        int i = 1;
        switch (num.intValue()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0001\u0001ᔈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a", new Object[]{"bitField0_", "userJid_", "receiptTimestamp_", "readTimestamp_", "playedTimestamp_", "pendingDeviceJid_", "deliveredDeviceJid_"});
            case 3:
                return new C100034uM();
            case 4:
                return new C99734ts();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C100034uM.class) {
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
