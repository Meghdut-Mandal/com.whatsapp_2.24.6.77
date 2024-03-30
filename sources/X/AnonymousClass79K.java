package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.79K  reason: invalid class name */
public final class AnonymousClass79K extends CancellationException {
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public AnonymousClass79K() {
        super("The coroutine scope left the composition");
    }
}
