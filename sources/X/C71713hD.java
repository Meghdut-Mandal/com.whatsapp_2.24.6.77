package X;

/* renamed from: X.3hD  reason: invalid class name and case insensitive filesystem */
public final class C71713hD implements AnonymousClass7gT {
    public final C19420v0 A00;
    public final C21100yf A01;
    public final C19630wG A02;
    public final AnonymousClass15x A03;

    public void Bcw(AnonymousClass591 r12) {
        AnonymousClass00C.A0D(r12, 0);
        r12.A0s = this.A03.A00();
        C19420v0 r6 = this.A00;
        r12.A0Z = Boolean.valueOf(r6.A2L());
        AnonymousClass005 r10 = r6.A00;
        long j = C36391kE.A0H(r10).getLong("xmpp:lifecycle_worker_runtime_seconds", 0) + C36391kE.A0H(r10).getLong("xmpp:logout_worker_runtime_seconds", 0) + C36391kE.A0H(r10).getLong("xmpp:combined_worker_runtime_seconds", 0);
        C36341k9.A0w(C19420v0.A00(r6), "xmpp:lifecycle_worker_runtime_seconds", 0);
        C36341k9.A0w(C19420v0.A00(r6), "xmpp:logout_worker_runtime_seconds", 0);
        C36341k9.A0w(C19420v0.A00(r6), "xmpp:combined_worker_runtime_seconds", 0);
        r12.A0o = Long.valueOf(j);
        try {
            if (this.A01.A09(C21100yf.A0s)) {
                C1257461c A002 = AnonymousClass6OC.A00(this.A02.A00);
                if (!A002.A01) {
                    r12.A1T = A002.A00;
                }
            }
        } catch (Throwable th) {
            new AnonymousClass03N(th);
        }
    }

    public C71713hD(C21100yf r1, C19630wG r2, C19420v0 r3, AnonymousClass15x r4) {
        C36321k7.A18(r2, r1, r3, r4);
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
        this.A03 = r4;
    }
}
