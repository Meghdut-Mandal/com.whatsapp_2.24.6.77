package X;

/* renamed from: X.0jU  reason: invalid class name and case insensitive filesystem */
public final class C13200jU extends RuntimeException {
    public final transient C005102h A00;

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.A00.toString();
    }

    public C13200jU(C005102h r1) {
        this.A00 = r1;
    }
}
