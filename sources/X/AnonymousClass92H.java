package X;

/* renamed from: X.92H  reason: invalid class name */
public abstract class AnonymousClass92H extends Exception implements B2T {
    public final String category;
    public final Throwable cause;
    public final int code;
    public final String message;

    public int B9n() {
        if (this instanceof C177318db) {
            return ((C177318db) this).code;
        }
        return this.code;
    }

    public AnonymousClass92H(String str, String str2, Throwable th, int i) {
        super(str, th);
        this.message = str;
        this.cause = th;
        this.code = i;
        this.category = str2;
    }

    public String B9T() {
        return this.category;
    }

    public String BB3() {
        String message2 = getMessage();
        if (message2 == null) {
            return "Unknown Failure";
        }
        return message2;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }
}
