package X;

/* renamed from: X.6yl  reason: invalid class name and case insensitive filesystem */
public class C148376yl implements C160507l7 {
    public int A00 = 0;
    public boolean A01;
    public final long A02;
    public final C1265864p A03;
    public final C148396yn A04;

    public long B8k() {
        if (this.A01) {
            return this.A04.B8k();
        }
        return this.A02;
    }

    public C1265864p BAg() {
        if (!this.A01) {
            return this.A03;
        }
        return this.A04.A00;
    }

    public void BWu(boolean z, int i) {
        if (this.A01) {
            this.A04.BWu(z, i);
        }
        if (!z || this.A00 > 1) {
            this.A01 = true;
        }
        this.A00++;
    }

    public C148376yl(C148396yn r10, String str, long j) {
        this.A03 = new C1265864p(str, str, "", (String) null, (String) null, "fallback", 0, false);
        this.A04 = r10;
        this.A02 = j;
    }
}
