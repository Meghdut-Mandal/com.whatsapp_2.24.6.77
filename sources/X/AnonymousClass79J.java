package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.79J  reason: invalid class name */
public final class AnonymousClass79J extends CancellationException {
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public AnonymousClass79J() {
        super("Mutation interrupted");
    }
}
