package X;

/* renamed from: X.9X5  reason: invalid class name */
public class AnonymousClass9X5 {
    public boolean A00 = false;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public float A03;
    public float A04;
    public final /* synthetic */ AnonymousClass9p5 A05;

    public AnonymousClass9X5(AnonymousClass9p5 r6, float f, float f2, float f3, float f4) {
        this.A05 = r6;
        this.A03 = f;
        this.A04 = f2;
        double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
        if (sqrt != 0.0d) {
            this.A01 = (float) (((double) f3) / sqrt);
            this.A02 = (float) (((double) f4) / sqrt);
        }
    }

    public void A00(float f, float f2) {
        float f3 = f - this.A03;
        float f4 = f2 - this.A04;
        double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
        if (sqrt != 0.0d) {
            f3 = (float) (((double) f3) / sqrt);
            f4 = (float) (((double) f4) / sqrt);
        }
        float f5 = this.A01;
        if (f3 == (-f5) && f4 == (-this.A02)) {
            this.A00 = true;
            this.A01 = -f4;
        } else {
            this.A01 = f5 + f3;
            f3 = this.A02 + f4;
        }
        this.A02 = f3;
    }

    public void A01(AnonymousClass9X5 r5) {
        float f = r5.A01;
        float f2 = this.A01;
        if (f == (-f2)) {
            float f3 = r5.A02;
            if (f3 == (-this.A02)) {
                this.A00 = true;
                this.A01 = -f3;
                this.A02 = r5.A01;
                return;
            }
        }
        this.A01 = f2 + f;
        this.A02 += r5.A02;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("(");
        A0u.append(this.A03);
        A0u.append(",");
        A0u.append(this.A04);
        C36421kH.A1N(A0u);
        A0u.append(this.A01);
        A0u.append(",");
        A0u.append(this.A02);
        return C90474aD.A0f(A0u);
    }
}
