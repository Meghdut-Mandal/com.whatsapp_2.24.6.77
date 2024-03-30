package X;

/* renamed from: X.66R  reason: invalid class name */
public abstract class AnonymousClass66R {
    public float A00 = 1.0f;
    public boolean A01;

    public void A01() {
        this.A01 = false;
        this.A00 = 1.0f;
    }

    public final float A00() {
        if (this.A01) {
            return (Math.abs(this.A00) / ((float) 4)) + 0.75f;
        }
        return 1.0f;
    }
}
