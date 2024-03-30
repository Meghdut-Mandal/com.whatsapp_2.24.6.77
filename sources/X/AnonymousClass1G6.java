package X;

/* renamed from: X.1G6  reason: invalid class name */
public final class AnonymousClass1G6 {
    public final C88834Uf A00;
    public final boolean A01;
    public final AnonymousClass1G4 A02;

    public C88834Uf A00() {
        C88834Uf r0;
        if (this.A01 && (r0 = this.A00) != null) {
            return r0;
        }
        throw new AssertionError("no active session");
    }

    public boolean A01(AnonymousClass11F r3) {
        C88834Uf r0;
        if (!this.A01 || (r0 = this.A00) == null || !C1901797e.A00(r0.getChatJid(), r3) || this.A02.A01()) {
            return false;
        }
        return true;
    }

    public AnonymousClass1G6(C88834Uf r1, AnonymousClass1G4 r2, boolean z) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = r2;
    }
}
