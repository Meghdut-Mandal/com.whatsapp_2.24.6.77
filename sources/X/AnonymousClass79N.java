package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.79N  reason: invalid class name */
public final class AnonymousClass79N extends CancellationException {
    public final CancellationException original;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass79N) && AnonymousClass00C.A0J(this.original, ((AnonymousClass79N) obj).original));
    }

    public int hashCode() {
        return this.original.hashCode();
    }

    public AnonymousClass79N(CancellationException cancellationException) {
        this.original = cancellationException;
        initCause(cancellationException);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InitializationCancellationFailedException(original=");
        return AnonymousClass000.A0m(this.original, A0u);
    }
}
