package X;

/* renamed from: X.2jA  reason: invalid class name and case insensitive filesystem */
public final class C49462jA extends C132446Tt {
    public final AnonymousClass2EI A00;
    public final AnonymousClass16D A01;
    public final C20810yC A02;
    public final AnonymousClass11F A03;
    public final C25031Es A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass141 A08;
        boolean z = false;
        if (this.A02.A0E(4873) && AnonymousClass00C.A0J(this.A04.A01(), "yes") && (A08 = this.A01.A08(this.A03)) != null) {
            z = A08.A0D();
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        boolean z;
        Boolean bool = (Boolean) obj;
        AnonymousClass2EI r0 = this.A00;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        C36341k9.A18(r0.A0U, z);
    }

    public C49462jA(AnonymousClass2EI r1, AnonymousClass16D r2, C20810yC r3, AnonymousClass11F r4, C25031Es r5) {
        C36321k7.A11(r3, r5, r2);
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
    }
}
