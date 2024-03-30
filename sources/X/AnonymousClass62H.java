package X;

/* renamed from: X.62H  reason: invalid class name */
public final class AnonymousClass62H {
    public final /* synthetic */ AnonymousClass692 A00;
    public final /* synthetic */ AnonymousClass6DN A01;

    public AnonymousClass62H(AnonymousClass692 r1, AnonymousClass6DN r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(C1511478k r6) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrosspostRequestSessionManager/Crosspost failed for session: ");
        String str = this.A01.A04;
        A0u.append(str);
        AnonymousClass00C.A0D(AnonymousClass000.A0l(r6, " with exception: ", A0u), 0);
        StringBuilder A0t = C36401kF.A0t(str, 1);
        A0t.append("CrosspostRequestSessionManager/[Retry]Error encountered for session: ");
        A0t.append(str);
        AnonymousClass00C.A0D(AnonymousClass000.A0l(r6, " with exception: ", A0t), 0);
    }
}
