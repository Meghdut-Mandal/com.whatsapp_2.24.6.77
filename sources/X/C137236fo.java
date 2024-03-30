package X;

/* renamed from: X.6fo  reason: invalid class name and case insensitive filesystem */
public final class C137236fo implements C157627dq {
    public final float A00;

    public int B0t(AnonymousClass5RW r4, int i, int i2) {
        float f;
        float f2 = ((float) (i2 - i)) / 2.0f;
        if (r4 == AnonymousClass5RW.Ltr) {
            f = this.A00;
        } else {
            f = ((float) -1) * this.A00;
        }
        return C14960mT.A01(f2 * (((float) 1) + f));
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C137236fo) && Float.compare(this.A00, ((C137236fo) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public C137236fo(float f) {
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Horizontal(bias=");
        return C90464aC.A0g(A0u, this.A00);
    }
}
