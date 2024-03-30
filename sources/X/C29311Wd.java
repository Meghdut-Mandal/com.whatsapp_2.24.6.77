package X;

/* renamed from: X.1Wd  reason: invalid class name and case insensitive filesystem */
public class C29311Wd {
    public C1031354c A00;
    public final C19700wN A01;
    public final C19630wG A02;
    public final AnonymousClass11g A03;
    public final AnonymousClass12S A04;

    public synchronized C1031354c A00() {
        C1031354c r4;
        r4 = this.A00;
        if (r4 == null) {
            C19630wG r3 = this.A02;
            r4 = new C1031354c(this.A01, r3, this.A03, this.A04);
            this.A00 = r4;
        }
        return r4;
    }

    public synchronized void A01() {
        C1031354c r0 = this.A00;
        if (r0 != null) {
            r0.A06();
            this.A00.close();
            this.A00 = null;
        }
    }

    public C29311Wd(C19700wN r1, C19630wG r2, AnonymousClass11g r3, AnonymousClass12S r4) {
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
    }
}
