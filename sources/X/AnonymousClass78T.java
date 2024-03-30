package X;

/* renamed from: X.78T  reason: invalid class name */
public class AnonymousClass78T extends RuntimeException {
    public AnonymousClass78T(String str) {
        super(str);
    }

    public AnonymousClass78T(String str, Throwable th) {
        super(str);
        setStackTrace(th.getStackTrace());
    }
}
