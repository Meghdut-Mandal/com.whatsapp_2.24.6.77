package X;

/* renamed from: X.1Ot  reason: invalid class name and case insensitive filesystem */
public final class C27571Ot extends Exception {
    public final int errorCode;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27571Ot) && this.errorCode == ((C27571Ot) obj).errorCode);
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

    public C27571Ot(int i) {
        this.errorCode = i;
    }
}
