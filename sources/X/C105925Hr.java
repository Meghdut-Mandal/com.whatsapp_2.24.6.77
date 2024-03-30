package X;

/* renamed from: X.5Hr  reason: invalid class name and case insensitive filesystem */
public final class C105925Hr extends C108675Ul {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C105925Hr) && this.code == ((C105925Hr) obj).code);
    }

    public int hashCode() {
        return this.code;
    }

    public C105925Hr(int i) {
        this.code = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UnknownErrorCode(code=");
        return C36321k7.A0G(A0u, this.code);
    }
}
