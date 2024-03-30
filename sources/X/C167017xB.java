package X;

/* renamed from: X.7xB  reason: invalid class name and case insensitive filesystem */
public abstract class C167017xB extends C1889591l {
    public final String type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167017xB(String str, CharSequence charSequence) {
        super(str, charSequence);
        AnonymousClass00C.A0D(str, 1);
        this.type = str;
        if (str.length() <= 0) {
            throw AnonymousClass001.A08("type must not be empty");
        }
    }
}
