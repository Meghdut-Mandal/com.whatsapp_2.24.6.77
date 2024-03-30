package X;

/* renamed from: X.8Qt  reason: invalid class name and case insensitive filesystem */
public final class C173198Qt extends C170918Hz implements C22901AyD {
    public static final int CIPHERTEXT_FIELD_NUMBER = 4;
    public static final int COUNTER_FIELD_NUMBER = 2;
    public static final C173198Qt DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PREVIOUSCOUNTER_FIELD_NUMBER = 3;
    public static final int RATCHETKEY_FIELD_NUMBER = 1;
    public int bitField0_;
    public C21674AUx ciphertext_;
    public int counter_;
    public int previousCounter_;
    public C21674AUx ratchetKey_;

    static {
        C173198Qt r1 = new C173198Qt();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173198Qt.class);
    }

    public C173198Qt() {
        C21674AUx aUx = C21674AUx.A00;
        this.ratchetKey_ = aUx;
        this.ciphertext_ = aUx;
    }
}
