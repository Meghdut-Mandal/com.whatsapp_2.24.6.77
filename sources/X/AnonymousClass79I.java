package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.79I  reason: invalid class name */
public final class AnonymousClass79I extends CancellationException {
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public AnonymousClass79I() {
        super("Mutation interrupted");
    }
}
