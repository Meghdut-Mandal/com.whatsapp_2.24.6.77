package X;

/* renamed from: X.1PI  reason: invalid class name */
public final class AnonymousClass1PI extends Exception {
    public final int errorCode;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1PI) && this.errorCode == ((AnonymousClass1PI) obj).errorCode);
    }

    public int hashCode() {
        return this.errorCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ErrorCodeException(errorCode=");
        sb.append(this.errorCode);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass1PI(int i) {
        this.errorCode = i;
    }
}
