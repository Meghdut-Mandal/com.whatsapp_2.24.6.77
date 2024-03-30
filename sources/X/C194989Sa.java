package X;

/* renamed from: X.9Sa  reason: invalid class name and case insensitive filesystem */
public final class C194989Sa {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public final int A05;
    public final C202309lW A06;
    public final C202309lW A07;
    public final boolean A08;

    public boolean A00() {
        long A09;
        int i;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == this.A05) {
            return false;
        }
        boolean z = this.A08;
        C202309lW r0 = this.A06;
        if (z) {
            A09 = r0.A0A();
        } else {
            A09 = r0.A09();
        }
        this.A04 = A09;
        if (i2 == this.A01) {
            C202309lW r1 = this.A07;
            this.A02 = r1.A05();
            r1.A0J(4);
            int i3 = this.A03 - 1;
            this.A03 = i3;
            if (i3 > 0) {
                i = r1.A05() - 1;
            } else {
                i = -1;
            }
            this.A01 = i;
        }
        return true;
    }

    public C194989Sa(C202309lW r3, C202309lW r4, boolean z) {
        this.A07 = r3;
        this.A06 = r4;
        this.A08 = z;
        r4.A0I(12);
        this.A05 = r4.A05();
        r3.A0I(12);
        this.A03 = r3.A05();
        C1893393h.A00(AnonymousClass000.A1O(r3.A03()), "first_chunk must be 1");
    }
}
