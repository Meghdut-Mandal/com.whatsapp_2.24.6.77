package X;

/* renamed from: X.8Qv  reason: invalid class name and case insensitive filesystem */
public final class C173218Qv extends C170918Hz implements C22901AyD {
    public static final int CIPHERKEY_FIELD_NUMBER = 2;
    public static final C173218Qv DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int IV_FIELD_NUMBER = 4;
    public static final int MACKEY_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public C21674AUx cipherKey_;
    public int index_;
    public C21674AUx iv_;
    public C21674AUx macKey_;

    static {
        C173218Qv r1 = new C173218Qv();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173218Qv.class);
    }

    public C173218Qv() {
        C21674AUx aUx = C21674AUx.A00;
        this.cipherKey_ = aUx;
        this.macKey_ = aUx;
        this.iv_ = aUx;
    }
}
