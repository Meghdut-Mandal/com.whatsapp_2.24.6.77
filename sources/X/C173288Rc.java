package X;

/* renamed from: X.8Rc  reason: invalid class name and case insensitive filesystem */
public final class C173288Rc extends C170918Hz implements C22901AyD {
    public static final C173288Rc DEFAULT_INSTANCE;
    public static final int LOCALBASEKEYPRIVATE_FIELD_NUMBER = 3;
    public static final int LOCALBASEKEY_FIELD_NUMBER = 2;
    public static final int LOCALIDENTITYKEYPRIVATE_FIELD_NUMBER = 8;
    public static final int LOCALIDENTITYKEY_FIELD_NUMBER = 7;
    public static final int LOCALRATCHETKEYPRIVATE_FIELD_NUMBER = 5;
    public static final int LOCALRATCHETKEY_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SEQUENCE_FIELD_NUMBER = 1;
    public int bitField0_;
    public C21674AUx localBaseKeyPrivate_;
    public C21674AUx localBaseKey_;
    public C21674AUx localIdentityKeyPrivate_;
    public C21674AUx localIdentityKey_;
    public C21674AUx localRatchetKeyPrivate_;
    public C21674AUx localRatchetKey_;
    public int sequence_;

    static {
        C173288Rc r1 = new C173288Rc();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173288Rc.class);
    }

    public C173288Rc() {
        C21674AUx aUx = C21674AUx.A00;
        this.localBaseKey_ = aUx;
        this.localBaseKeyPrivate_ = aUx;
        this.localRatchetKey_ = aUx;
        this.localRatchetKeyPrivate_ = aUx;
        this.localIdentityKey_ = aUx;
        this.localIdentityKeyPrivate_ = aUx;
    }
}
