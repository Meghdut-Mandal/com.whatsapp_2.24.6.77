package X;

/* renamed from: X.8Rv  reason: invalid class name and case insensitive filesystem */
public final class C173478Rv extends C170918Hz implements C22901AyD {
    public static final int COLLECTION_NAME_FIELD_NUMBER = 4;
    public static final int CURRENT_LTHASH_FIELD_NUMBER = 1;
    public static final C173478Rv DEFAULT_INSTANCE;
    public static final int FIRST_FOUR_BYTES_FROM_A_HASH_OF_SNAPSHOT_MAC_KEY_FIELD_NUMBER = 5;
    public static final int IS_SENDER_PRIMARY_FIELD_NUMBER = 11;
    public static final int NEW_LTHASH_FIELD_NUMBER = 2;
    public static final int NEW_LTHASH_SUBTRACT_FIELD_NUMBER = 6;
    public static final int NUMBER_ADD_FIELD_NUMBER = 7;
    public static final int NUMBER_OVERRIDE_FIELD_NUMBER = 9;
    public static final int NUMBER_REMOVE_FIELD_NUMBER = 8;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PATCH_VERSION_FIELD_NUMBER = 3;
    public static final int SENDER_PLATFORM_FIELD_NUMBER = 10;
    public int bitField0_;
    public C21674AUx collectionName_;
    public C21674AUx currentLthash_;
    public C21674AUx firstFourBytesFromAHashOfSnapshotMacKey_;
    public boolean isSenderPrimary_;
    public C21674AUx newLthashSubtract_;
    public C21674AUx newLthash_;
    public int numberAdd_;
    public int numberOverride_;
    public int numberRemove_;
    public C21674AUx patchVersion_;
    public int senderPlatform_;

    static {
        C173478Rv r1 = new C173478Rv();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173478Rv.class);
    }

    public C173478Rv() {
        C21674AUx aUx = C21674AUx.A00;
        this.currentLthash_ = aUx;
        this.newLthash_ = aUx;
        this.patchVersion_ = aUx;
        this.collectionName_ = aUx;
        this.firstFourBytesFromAHashOfSnapshotMacKey_ = aUx;
        this.newLthashSubtract_ = aUx;
    }
}
