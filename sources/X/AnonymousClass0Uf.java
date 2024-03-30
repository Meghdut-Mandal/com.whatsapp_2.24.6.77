package X;

/* renamed from: X.0Uf  reason: invalid class name */
public final class AnonymousClass0Uf {
    public final C04520Ky A00;
    public final AnonymousClass0US A01;

    public /* synthetic */ AnonymousClass0Uf(C04520Ky r1, AnonymousClass0US r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof AnonymousClass0Uf)) {
            AnonymousClass0Uf r4 = (AnonymousClass0Uf) obj;
            return AnonymousClass0QM.A00(this.A01, r4.A01) && AnonymousClass0QM.A00(this.A00, r4.A00);
        }
    }

    public final String toString() {
        AnonymousClass0UM r2 = new AnonymousClass0UM(this);
        r2.A00(this.A01, "key");
        r2.A00(this.A00, "feature");
        return r2.toString();
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        return AnonymousClass000.A0L(this.A00, A0M);
    }
}
