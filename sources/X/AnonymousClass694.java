package X;

/* renamed from: X.694  reason: invalid class name */
public final class AnonymousClass694 {
    public final C134876bk A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass694) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass694) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass694(C134876bk r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NativeAuthTokenExchangeResult(limitedScopedAccessToken=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
