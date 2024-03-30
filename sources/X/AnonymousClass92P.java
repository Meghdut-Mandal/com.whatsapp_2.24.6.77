package X;

/* renamed from: X.92P  reason: invalid class name */
public class AnonymousClass92P extends IllegalStateException {
    public Throwable cause;

    public AnonymousClass92P(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
