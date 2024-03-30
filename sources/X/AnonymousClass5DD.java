package X;

import java.io.IOException;

/* renamed from: X.5DD  reason: invalid class name */
public final class AnonymousClass5DD extends C108625Ug {
    public final IOException throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5DD) && AnonymousClass00C.A0J(this.throwable, ((AnonymousClass5DD) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass5DD(IOException iOException) {
        this.throwable = iOException;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ModelIOError(throwable=");
        return AnonymousClass000.A0m(this.throwable, A0u);
    }
}
