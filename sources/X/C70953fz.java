package X;

/* renamed from: X.3fz  reason: invalid class name and case insensitive filesystem */
public final class C70953fz implements AnonymousClass4Q7 {
    public final AnonymousClass1A5 A00;
    public final boolean A01;

    public C70953fz(AnonymousClass1A5 r2, boolean z) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = z;
    }

    public boolean B7L(AnonymousClass11F r4) {
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass141 r2 = (AnonymousClass141) this.A00.A04().get(r4);
        if (r2 == null) {
            return false;
        }
        if (!this.A01 || !r2.A0s || r2.A07 == 2) {
            return r2.A0B();
        }
        return true;
    }
}
