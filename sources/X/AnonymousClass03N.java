package X;

import java.io.Serializable;

/* renamed from: X.03N  reason: invalid class name */
public final class AnonymousClass03N implements Serializable {
    public final Throwable exception;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass03N) || !AnonymousClass00C.A0J(this.exception, ((AnonymousClass03N) obj).exception)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.exception.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Failure(");
        sb.append(this.exception);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass03N(Throwable th) {
        this.exception = th;
    }
}
