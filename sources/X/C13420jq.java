package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.0jq  reason: invalid class name and case insensitive filesystem */
public final class C13420jq extends CancellationException {
    public final transient C007403e A00;

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13420jq)) {
            return false;
        }
        C13420jq r3 = (C13420jq) obj;
        if (!AnonymousClass00C.A0J(r3.getMessage(), getMessage()) || !AnonymousClass00C.A0J(r3.A00, this.A00) || !AnonymousClass00C.A0J(r3.getCause(), getCause())) {
            return false;
        }
        return true;
    }

    public C13420jq(String str, Throwable th, C007403e r3) {
        super(str);
        this.A00 = r3;
        if (th != null) {
            initCause(th);
        }
    }

    public int hashCode() {
        String message = getMessage();
        AnonymousClass00C.A0B(message);
        return (((message.hashCode() * 31) + this.A00.hashCode()) * 31) + AnonymousClass000.A0J(getCause());
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(super.toString());
        A0u.append("; job=");
        return AnonymousClass000.A0o(this.A00, A0u);
    }
}
