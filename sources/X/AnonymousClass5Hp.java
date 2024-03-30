package X;

/* renamed from: X.5Hp  reason: invalid class name */
public final class AnonymousClass5Hp extends C108675Ul {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5Hp) && AnonymousClass00C.A0J(this.throwable, ((AnonymousClass5Hp) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass5Hp(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(throwable=");
        return AnonymousClass000.A0m(this.throwable, A0u);
    }
}
