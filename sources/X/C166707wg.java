package X;

/* renamed from: X.7wg  reason: invalid class name and case insensitive filesystem */
public final class C166707wg extends AnonymousClass9G3 {
    public final float A00;

    public C166707wg(float f) {
        super(false, false);
        this.A00 = f;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C166707wg) && Float.compare(this.A00, ((C166707wg) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RelativeVerticalTo(dy=");
        return C90464aC.A0g(A0u, this.A00);
    }
}