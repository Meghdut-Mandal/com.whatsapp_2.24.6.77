package X;

/* renamed from: X.3hB  reason: invalid class name and case insensitive filesystem */
public final class C71693hB implements AnonymousClass7gT {
    public final AnonymousClass1DG A00;
    public final C26141Ja A01;
    public final C20810yC A02;

    public void Bcw(AnonymousClass591 r6) {
        AnonymousClass00C.A0D(r6, 0);
        if (this.A02.A0E(7590)) {
            long j = 0;
            for (C44072La A0J : this.A01.A04()) {
                j += AnonymousClass1DG.A00(this.A00, A0J.A0J()).A0I;
            }
            r6.A0r = Long.valueOf(j);
        }
    }

    public C71693hB(AnonymousClass1DG r1, C26141Ja r2, C20810yC r3) {
        C36321k7.A11(r3, r2, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
