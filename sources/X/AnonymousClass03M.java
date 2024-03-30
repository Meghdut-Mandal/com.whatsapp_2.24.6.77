package X;

/* renamed from: X.03M  reason: invalid class name */
public abstract class AnonymousClass03M {
    public static final boolean A00;

    static {
        Object obj;
        try {
            obj = Class.forName("android.os.Build");
        } catch (Throwable th) {
            obj = new AnonymousClass03N(th);
        }
        A00 = !(obj instanceof AnonymousClass03N);
    }
}
