package X;

/* renamed from: X.57g  reason: invalid class name and case insensitive filesystem */
public class C1038557g extends AnonymousClass1DJ {
    public boolean A00;
    public boolean A01;
    public final C19420v0 A02;
    public final C20810yC A03;
    public final C19770wU A04;

    public void A01() {
        C19770wU r2;
        int i;
        if (!this.A01 && AnonymousClass6HF.A01(this.A03)) {
            r2 = this.A04;
            i = 22;
        } else if (!this.A00 && AnonymousClass6HF.A00(this.A03)) {
            r2 = this.A04;
            i = 23;
        } else {
            return;
        }
        r2.Boy(new C1497372o(this, i));
    }

    public void A02() {
        C20810yC r1 = this.A03;
        this.A01 = AnonymousClass6HF.A01(r1);
        this.A00 = AnonymousClass6HF.A00(r1);
    }

    public C1038557g(C19420v0 r1, C20810yC r2, C19770wU r3) {
        this.A03 = r2;
        this.A04 = r3;
        this.A02 = r1;
    }
}
