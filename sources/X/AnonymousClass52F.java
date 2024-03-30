package X;

/* renamed from: X.52F  reason: invalid class name */
public final class AnonymousClass52F extends AnonymousClass5UX {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass52F) && this.code == ((AnonymousClass52F) obj).code);
    }

    public int hashCode() {
        return this.code;
    }

    public AnonymousClass52F(int i) {
        this.code = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UnknownGraphqlErrorCode(code=");
        return C36321k7.A0G(A0u, this.code);
    }
}
