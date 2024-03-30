package X;

/* renamed from: X.66A  reason: invalid class name */
public final class AnonymousClass66A {
    public final C131536Pl A00;
    public final C140456lc A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass66A)) {
            return false;
        }
        AnonymousClass66A r4 = (AnonymousClass66A) obj;
        if (this.A01 != r4.A01 || !this.A00.equals(r4.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }

    public AnonymousClass66A(C131536Pl r1, C140456lc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
