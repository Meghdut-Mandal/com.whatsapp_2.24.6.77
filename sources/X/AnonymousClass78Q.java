package X;

/* renamed from: X.78Q  reason: invalid class name */
public final class AnonymousClass78Q extends RuntimeException {
    public final AnonymousClass5SX callbackName;
    public final Throwable cause;

    public AnonymousClass78Q(AnonymousClass5SX r1, Throwable th) {
        super(th);
        this.callbackName = r1;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
