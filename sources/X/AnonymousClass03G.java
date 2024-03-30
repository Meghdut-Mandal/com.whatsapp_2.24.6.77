package X;

/* renamed from: X.03G  reason: invalid class name */
public abstract class AnonymousClass03G extends C005502l {
    public long A00;
    public C005002g A01;
    public boolean A02;

    public abstract long A05();

    public abstract void A06();

    public final void A07(AnonymousClass0AC r2) {
        C005002g r0 = this.A01;
        if (r0 == null) {
            r0 = new C005002g();
            this.A01 = r0;
        }
        r0.A0O(r2);
    }

    public final void A08(boolean z) {
        long j;
        long j2 = this.A00;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.A00 = j3;
        if (j3 <= 0 && this.A02) {
            A06();
        }
    }

    public final boolean A09() {
        Object A0N;
        C005002g r2 = this.A01;
        if (r2 != null) {
            if (r2.isEmpty()) {
                A0N = null;
            } else {
                A0N = r2.A0N();
            }
            AnonymousClass0AC r0 = (AnonymousClass0AC) A0N;
            if (r0 != null) {
                r0.run();
                return true;
            }
        }
        return false;
    }

    public final C005502l A01(int i) {
        AnonymousClass03D.A00(i);
        return this;
    }
}
