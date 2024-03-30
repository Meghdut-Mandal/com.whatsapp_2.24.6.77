package X;

/* renamed from: X.53P  reason: invalid class name */
public final class AnonymousClass53P extends C1266765a {
    public boolean A00;
    public boolean A01;
    public final C27631Pa A02;
    public final C108205Sp A03 = C108205Sp.BOTTOM_CENTER;
    public final C107865Re A04 = C107865Re.A02;
    public final C19970wo A05;
    public final C20810yC A06;
    public final boolean A07;

    public boolean A00(AnonymousClass6PK r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (super.A00(r4) || !r4.A03 || r4.A00 != 0.0f) {
            return true;
        }
        return false;
    }

    public boolean A01(AnonymousClass6PK r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (!super.A01(r4) || !r4.A03 || r4.A00 != 0.0f) {
            return false;
        }
        if ((C36371kC.A01(C27631Pa.A00(this.A02), "ss_tooltip_show_count") == 0 || (this.A07 && !this.A01)) && this.A06.A0E(5341)) {
            return true;
        }
        return false;
    }

    public AnonymousClass53P(C27631Pa r2, C19970wo r3, C20810yC r4, boolean z) {
        this.A05 = r3;
        this.A06 = r4;
        this.A02 = r2;
        this.A07 = z;
    }
}
