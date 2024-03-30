package X;

/* renamed from: X.7wl  reason: invalid class name and case insensitive filesystem */
public final class C166757wl extends AnonymousClass9G3 {
    public final float A00;
    public final float A01;

    public C166757wl(float f, float f2) {
        super(false, false);
        this.A00 = f;
        this.A01 = f2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166757wl) {
                C166757wl r5 = (C166757wl) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90514aH.A05(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RelativeLineTo(dx=");
        A0u.append(this.A00);
        A0u.append(", dy=");
        return C90464aC.A0g(A0u, this.A01);
    }
}
