package X;

/* renamed from: X.8SR  reason: invalid class name */
public final class AnonymousClass8SR extends C170918Hz implements C22901AyD {
    public static final int CONNECT_ATTEMPT_COUNT_FIELD_NUMBER = 16;
    public static final int CONNECT_REASON_FIELD_NUMBER = 13;
    public static final int CONNECT_TYPE_FIELD_NUMBER = 12;
    public static final AnonymousClass8SR DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 18;
    public static final int DEVICE_PAIRING_DATA_FIELD_NUMBER = 19;
    public static final int DNS_SOURCE_FIELD_NUMBER = 15;
    public static final int FB_APP_ID_FIELD_NUMBER = 31;
    public static final int FB_CAT_FIELD_NUMBER = 21;
    public static final int FB_DEVICE_ID_FIELD_NUMBER = 32;
    public static final int FB_USER_AGENT_FIELD_NUMBER = 22;
    public static final int INTEROP_DATA_FIELD_NUMBER = 38;
    public static final int IOS_APP_EXTENSION_FIELD_NUMBER = 30;
    public static final int LC_FIELD_NUMBER = 24;
    public static final int MEM_CLASS_FIELD_NUMBER = 37;
    public static final int OC_FIELD_NUMBER = 23;
    public static final int PADDING_BYTES_FIELD_NUMBER = 34;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PASSIVE_FIELD_NUMBER = 3;
    public static final int PRODUCT_FIELD_NUMBER = 20;
    public static final int PULL_FIELD_NUMBER = 33;
    public static final int PUSH_NAME_FIELD_NUMBER = 7;
    public static final int SESSION_ID_FIELD_NUMBER = 9;
    public static final int SHARDS_FIELD_NUMBER = 14;
    public static final int SHORT_CONNECT_FIELD_NUMBER = 10;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_AGENT_FIELD_NUMBER = 5;
    public static final int WEB_INFO_FIELD_NUMBER = 6;
    public static final int YEAR_CLASS_FIELD_NUMBER = 36;
    public int bitField0_;
    public int connectAttemptCount_;
    public int connectReason_;
    public int connectType_;
    public C173358Rj devicePairingData_;
    public int device_;
    public AnonymousClass8PV dnsSource_;
    public long fbAppId_;
    public C21674AUx fbCat_;
    public C21674AUx fbDeviceId_;
    public C21674AUx fbUserAgent_;
    public AnonymousClass8QL interopData_;
    public int iosAppExtension_;
    public int lc_;
    public int memClass_;
    public boolean oc_;
    public C21674AUx paddingBytes_;
    public boolean passive_;
    public int product_;
    public boolean pull_;
    public String pushName_ = "";
    public int sessionId_;
    public B62 shards_ = AnonymousClass8I0.A02;
    public boolean shortConnect_;
    public AnonymousClass8S6 userAgent_;
    public long username_;
    public AnonymousClass8ST webInfo_;
    public int yearClass_;

    static {
        AnonymousClass8SR r1 = new AnonymousClass8SR();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SR.class);
    }

    public AnonymousClass8ST A0u() {
        AnonymousClass8ST r0 = this.webInfo_;
        if (r0 == null) {
            return AnonymousClass8ST.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public AnonymousClass8SR() {
        C21674AUx aUx = C21674AUx.A00;
        this.fbCat_ = aUx;
        this.fbUserAgent_ = aUx;
        this.fbDeviceId_ = aUx;
        this.paddingBytes_ = aUx;
    }
}
