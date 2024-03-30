package X;

/* renamed from: X.8Ro  reason: invalid class name and case insensitive filesystem */
public final class C173408Ro extends C170918Hz implements C22901AyD {
    public static final int CLIENT_DEBUG_DATA_FIELD_NUMBER = 9;
    public static final C173408Ro DEFAULT_INSTANCE;
    public static final int DEVICE_INDEX_FIELD_NUMBER = 8;
    public static final int EXIT_CODE_FIELD_NUMBER = 7;
    public static final int EXTERNAL_MUTATIONS_FIELD_NUMBER = 3;
    public static final int KEY_ID_FIELD_NUMBER = 6;
    public static final int MUTATIONS_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PATCH_MAC_FIELD_NUMBER = 5;
    public static final int SNAPSHOT_MAC_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 1;
    public int bitField0_;
    public C21674AUx clientDebugData_;
    public int deviceIndex_;
    public AnonymousClass8PK exitCode_;
    public C100024uL externalMutations_;
    public AnonymousClass8O0 keyId_;
    public C23122B6c mutations_ = AnonymousClass8I2.A02;
    public C21674AUx patchMac_;
    public C21674AUx snapshotMac_;
    public AnonymousClass8O3 version_;

    static {
        C173408Ro r1 = new C173408Ro();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173408Ro.class);
    }

    public C173408Ro() {
        C21674AUx aUx = C21674AUx.A00;
        this.snapshotMac_ = aUx;
        this.patchMac_ = aUx;
        this.clientDebugData_ = aUx;
    }
}
