package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.79L  reason: invalid class name */
public final class AnonymousClass79L extends CancellationException {
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public AnonymousClass79L() {
        super("The Modifier.Node was detached");
    }
}
