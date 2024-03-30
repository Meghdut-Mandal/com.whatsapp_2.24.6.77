package X;

/* renamed from: X.2qI  reason: invalid class name and case insensitive filesystem */
public final class C52862qI extends Exception {
    public final Throwable cause = null;
    public final int errorCode;
    public final String iqId;
    public final String message = null;

    public C52862qI(String str, int i) {
        super((String) null, (Throwable) null);
        this.iqId = str;
        this.errorCode = i;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }
}
