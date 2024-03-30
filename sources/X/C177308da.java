package X;

/* renamed from: X.8da  reason: invalid class name and case insensitive filesystem */
public final class C177308da extends AnonymousClass92H {
    public final Throwable cause;
    public final String message;

    public C177308da(String str, Throwable th) {
        super(str, "CLIENT", th, 417);
        this.message = str;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }

    public C177308da() {
        this("Unknown error", (Throwable) null);
    }
}
