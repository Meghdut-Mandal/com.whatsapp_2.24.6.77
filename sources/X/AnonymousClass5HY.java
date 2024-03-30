package X;

/* renamed from: X.5HY  reason: invalid class name */
public final class AnonymousClass5HY extends C111345c8 {
    public final Throwable A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5HY) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5HY) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5HY(Throwable th) {
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UnknownError(throwable=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
