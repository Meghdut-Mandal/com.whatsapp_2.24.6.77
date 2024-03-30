package X;

/* renamed from: X.91t  reason: invalid class name and case insensitive filesystem */
public class C1890291t extends Exception {
    public Throwable cause;

    public C1890291t(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
