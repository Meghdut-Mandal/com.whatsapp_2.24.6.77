package X;

/* renamed from: X.8S2  reason: invalid class name */
public final class AnonymousClass8S2 extends C170918Hz implements C22901AyD {
    public static final int ALICEBASEKEY_FIELD_NUMBER = 13;
    public static final AnonymousClass8S2 DEFAULT_INSTANCE;
    public static final int LOCALIDENTITYPUBLIC_FIELD_NUMBER = 2;
    public static final int LOCALREGISTRATIONID_FIELD_NUMBER = 11;
    public static final int NEEDSREFRESH_FIELD_NUMBER = 12;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PENDINGKEYEXCHANGE_FIELD_NUMBER = 8;
    public static final int PENDINGPREKEY_FIELD_NUMBER = 9;
    public static final int PREVIOUSCOUNTER_FIELD_NUMBER = 5;
    public static final int RECEIVERCHAINS_FIELD_NUMBER = 7;
    public static final int REMOTEIDENTITYPUBLIC_FIELD_NUMBER = 3;
    public static final int REMOTEREGISTRATIONID_FIELD_NUMBER = 10;
    public static final int ROOTKEY_FIELD_NUMBER = 4;
    public static final int SENDERCHAIN_FIELD_NUMBER = 6;
    public static final int SESSIONVERSION_FIELD_NUMBER = 1;
    public C21674AUx aliceBaseKey_;
    public int bitField0_;
    public C21674AUx localIdentityPublic_;
    public int localRegistrationId_;
    public boolean needsRefresh_;
    public C173288Rc pendingKeyExchange_;
    public AnonymousClass8QU pendingPreKey_;
    public int previousCounter_;
    public C23122B6c receiverChains_ = AnonymousClass8I2.A02;
    public C21674AUx remoteIdentityPublic_;
    public int remoteRegistrationId_;
    public C21674AUx rootKey_;
    public C173228Qw senderChain_;
    public int sessionVersion_;

    static {
        AnonymousClass8S2 r1 = new AnonymousClass8S2();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8S2.class);
    }

    public AnonymousClass8S2() {
        C21674AUx aUx = C21674AUx.A00;
        this.localIdentityPublic_ = aUx;
        this.remoteIdentityPublic_ = aUx;
        this.rootKey_ = aUx;
        this.aliceBaseKey_ = aUx;
    }
}
