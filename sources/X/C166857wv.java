package X;

/* renamed from: X.7wv  reason: invalid class name and case insensitive filesystem */
public final class C166857wv extends AnonymousClass9G3 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final boolean A05;
    public final boolean A06;

    public C166857wv(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        super(false, false);
        this.A02 = f;
        this.A04 = f2;
        this.A03 = f3;
        this.A05 = z;
        this.A06 = z2;
        this.A00 = f4;
        this.A01 = f5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166857wv) {
                C166857wv r5 = (C166857wv) obj;
                if (!(Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A04, r5.A04) == 0 && Float.compare(this.A03, r5.A03) == 0 && this.A05 == r5.A05 && this.A06 == r5.A06 && Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02((((C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A02), this.A04), this.A03) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A06 ? 1 : 0)) * 31, this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RelativeArcTo(horizontalEllipseRadius=");
        A0u.append(this.A02);
        A0u.append(", verticalEllipseRadius=");
        A0u.append(this.A04);
        A0u.append(", theta=");
        A0u.append(this.A03);
        A0u.append(", isMoreThanHalf=");
        A0u.append(this.A05);
        A0u.append(", isPositiveArc=");
        A0u.append(this.A06);
        A0u.append(", arcStartDx=");
        A0u.append(this.A00);
        A0u.append(", arcStartDy=");
        return C90464aC.A0g(A0u, this.A01);
    }
}
