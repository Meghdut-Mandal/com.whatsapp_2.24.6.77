package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.79M  reason: invalid class name */
public final class AnonymousClass79M extends CancellationException {
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public AnonymousClass79M() {
        super("Pointer input was reset");
    }
}
