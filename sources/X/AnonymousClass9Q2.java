package X;

/* renamed from: X.9Q2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9Q2 {
    public final /* synthetic */ C167557yG A00;

    public /* synthetic */ AnonymousClass9Q2(C167557yG r1) {
        this.A00 = r1;
    }

    public final void A00(AnonymousClass16X r6, AnonymousClass16X r7, C202059ky r8) {
        C167557yG r4 = this.A00;
        C001700s r1 = r4.A01;
        AnonymousClass9IK r0 = new AnonymousClass9IK();
        r0.A01 = true;
        r1.A0D(r0);
        if (r8 != null || r6 == null || r7 == null) {
            C24611Dc r2 = r4.A06;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("error: ");
            r2.A04(AnonymousClass000.A0q(r8.A07, A0u));
            C193549Lx r12 = new C193549Lx(1);
            r12.A00 = r8;
            r4.A07.A0D(r12);
            return;
        }
        C193549Lx r3 = new C193549Lx(0);
        AnonymousClass16U r22 = AnonymousClass16W.A05;
        C18820ts r13 = r4.A03;
        r3.A01 = r22.B7d(r13, r6);
        r3.A02 = r22.B7d(r13, r7);
        r4.A07.A0D(r3);
    }
}
