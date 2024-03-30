package X;

/* renamed from: X.8Ri  reason: invalid class name and case insensitive filesystem */
public final class C173348Ri extends C170918Hz implements C22901AyD {
    public static final int BOT_MESSAGE_SECRET_FIELD_NUMBER = 6;
    public static final int BOT_METADATA_FIELD_NUMBER = 7;
    public static final C173348Ri DEFAULT_INSTANCE;
    public static final int DEVICE_LIST_METADATA_FIELD_NUMBER = 1;
    public static final int DEVICE_LIST_METADATA_VERSION_FIELD_NUMBER = 2;
    public static final int MESSAGE_ADD_ON_DURATION_IN_SECS_FIELD_NUMBER = 5;
    public static final int MESSAGE_SECRET_FIELD_NUMBER = 3;
    public static final int PADDING_BYTES_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int REPORTING_TOKEN_VERSION_FIELD_NUMBER = 8;
    public int bitField0_;
    public C21674AUx botMessageSecret_;
    public AnonymousClass8R9 botMetadata_;
    public int deviceListMetadataVersion_;
    public C173428Rq deviceListMetadata_;
    public int messageAddOnDurationInSecs_;
    public C21674AUx messageSecret_;
    public C21674AUx paddingBytes_;
    public int reportingTokenVersion_;

    static {
        C173348Ri r1 = new C173348Ri();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173348Ri.class);
    }

    public C173348Ri() {
        C21674AUx aUx = C21674AUx.A00;
        this.messageSecret_ = aUx;
        this.paddingBytes_ = aUx;
        this.botMessageSecret_ = aUx;
    }
}
