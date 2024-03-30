package X;

/* renamed from: X.6hY  reason: invalid class name and case insensitive filesystem */
public final class C138246hY implements C158897iQ {
    public final float A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C138246hY) && Float.compare(this.A00, ((C138246hY) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public float B3e(float f) {
        return f / this.A00;
    }

    public float B3f(float f) {
        return f * this.A00;
    }

    public C138246hY(float f) {
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinearFontScaleConverter(fontScale=");
        return C90464aC.A0g(A0u, this.A00);
    }
}
