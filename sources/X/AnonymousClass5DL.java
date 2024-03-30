package X;

/* renamed from: X.5DL  reason: invalid class name */
public final class AnonymousClass5DL extends C108645Ui {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5DL) && AnonymousClass00C.A0J(this.throwable, ((AnonymousClass5DL) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass5DL(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UnknownError(throwable=");
        return AnonymousClass000.A0m(this.throwable, A0u);
    }
}
