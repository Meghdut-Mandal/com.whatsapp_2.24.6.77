package X;

/* renamed from: X.5Hj  reason: invalid class name and case insensitive filesystem */
public final class C105875Hj extends C108665Uk {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C105875Hj) && this.code == ((C105875Hj) obj).code);
    }

    public int hashCode() {
        return this.code;
    }

    public C105875Hj(int i) {
        this.code = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UnknownErrorCode(code=");
        return C36321k7.A0G(A0u, this.code);
    }
}
