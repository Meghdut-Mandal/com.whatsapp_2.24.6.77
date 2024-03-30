package X;

/* renamed from: X.92R  reason: invalid class name */
public class AnonymousClass92R extends IllegalStateException {
    public Throwable cause;

    public AnonymousClass92R(String str) {
        super(str);
    }

    public AnonymousClass92R(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
