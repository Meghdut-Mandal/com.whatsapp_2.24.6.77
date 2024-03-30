package X;

/* renamed from: X.92O  reason: invalid class name */
public class AnonymousClass92O extends IllegalStateException {
    public Throwable cause;

    public AnonymousClass92O(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
