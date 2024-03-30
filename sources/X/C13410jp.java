package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.0jp  reason: invalid class name and case insensitive filesystem */
public final class C13410jp extends CancellationException {
    public final transient AnonymousClass05G A00;

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public C13410jp(AnonymousClass05G r2) {
        super("Flow was aborted, no more elements needed");
        this.A00 = r2;
    }
}
