package X;

/* renamed from: X.3Sp  reason: invalid class name and case insensitive filesystem */
public final class C65573Sp {
    public final C20810yC A00;
    public final C21010yW A01;

    public final void A02(String str) {
        AnonymousClass00C.A0D(str, 0);
        if (this.A00.A0E(4725)) {
            C45092Qa r0 = new C45092Qa();
            Integer A0j = C36401kF.A0j();
            r0.A02 = A0j;
            r0.A04 = null;
            r0.A03 = str;
            C21010yW r1 = this.A01;
            r1.Bly(r0);
            AnonymousClass2RB r02 = new AnonymousClass2RB();
            r02.A02 = A0j;
            r02.A04 = null;
            r02.A05 = str;
            r1.Bly(r02);
        }
    }

    public static final int A00(C63493Kg r2) {
        if (r2.A01.ordinal() == 0) {
            return 1;
        }
        throw C36441kJ.A18();
    }

    public static final void A01(AnonymousClass2RB r1, C63363Jt r2) {
        r1.A01 = Integer.valueOf(A00(r2.A01));
        r1.A04 = r2.A03;
        r1.A03 = C36431kI.A15(r2.A02.user);
    }

    public C65573Sp(C20810yC r1, C21010yW r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
