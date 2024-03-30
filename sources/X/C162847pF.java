package X;

/* renamed from: X.7pF  reason: invalid class name and case insensitive filesystem */
public class C162847pF extends C1259561z {
    public Object A00;
    public final int A01 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162847pF(AnonymousClass11F r2, C142466ov r3) {
        super(r2, true);
        this.A00 = r3;
    }

    public void A00(int i) {
        if (this.A01 != 0) {
            super.A00(i);
            if (i > 0) {
                ((C142466ov) this.A00).A03 = (long) i;
            }
            C142466ov.A06((C142466ov) this.A00);
            return;
        }
        super.A00(i);
        if (i != 0) {
            ((C142466ov) ((C1503074t) this.A00).A00).A03 = (long) i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162847pF(C1503074t r2, AnonymousClass11F r3) {
        super(r3, false);
        this.A00 = r2;
    }
}
