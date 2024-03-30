package X;

/* renamed from: X.7xJ  reason: invalid class name and case insensitive filesystem */
public abstract class C167097xJ extends C1889691m {
    public final String type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167097xJ(String str, CharSequence charSequence) {
        super(str, charSequence);
        AnonymousClass00C.A0D(str, 1);
        this.type = str;
        if (str.length() <= 0) {
            throw AnonymousClass001.A08("type must not be empty");
        }
    }
}
