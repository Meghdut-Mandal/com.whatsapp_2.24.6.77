package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.0jo  reason: invalid class name and case insensitive filesystem */
public final class C13400jo extends CancellationException {
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public C13400jo() {
        super("Child of the scoped flow was cancelled");
    }
}
