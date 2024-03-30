package X;

/* renamed from: X.4xB  reason: invalid class name and case insensitive filesystem */
public final class C101214xB extends AnonymousClass5UQ {
    public final C132286Sy error;

    public C101214xB(C132286Sy r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.error = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C101214xB) && AnonymousClass00C.A0J(this.error, ((C101214xB) obj).error));
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SingleError(error=");
        return AnonymousClass000.A0m(this.error, A0u);
    }
}
