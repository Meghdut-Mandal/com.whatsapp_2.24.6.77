package X;

/* renamed from: X.8Sq  reason: invalid class name and case insensitive filesystem */
public final class C173688Sq extends C199679fm {
    public final float A00;

    public boolean A00(float f, float f2, float f3) {
        if (C90494aF.A01(f2, this.A01) <= f && C90494aF.A01(f3, this.A00) <= f) {
            float f4 = this.A00;
            float A01 = C90494aF.A01(f, f4);
            if (A01 <= 1.0f || A01 <= f4) {
                return true;
            }
        }
        return false;
    }

    public C173688Sq(float f, float f2, float f3) {
        super(f, f2);
        this.A00 = f3;
    }
}
