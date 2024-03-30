package X;

/* renamed from: X.5IJ  reason: invalid class name */
public final class AnonymousClass5IJ extends AnonymousClass61F {
    public final C111375cB A00;
    public final Throwable A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5IJ(C111375cB r2, Throwable th) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = th;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IJ) {
                AnonymousClass5IJ r5 = (AnonymousClass5IJ) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(searchType=");
        A0u.append(this.A00);
        A0u.append(", error=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
