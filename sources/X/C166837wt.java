package X;

/* renamed from: X.7wt  reason: invalid class name and case insensitive filesystem */
public final class C166837wt extends AnonymousClass9G3 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    public C166837wt(float f, float f2, float f3, float f4, float f5, float f6) {
        super(true, false);
        this.A00 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A04 = f4;
        this.A02 = f5;
        this.A05 = f6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166837wt) {
                C166837wt r5 = (C166837wt) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A04, r5.A04) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A05, r5.A05) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A00), this.A03), this.A01), this.A04), this.A02), this.A05);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RelativeCurveTo(dx1=");
        A0u.append(this.A00);
        A0u.append(", dy1=");
        A0u.append(this.A03);
        A0u.append(", dx2=");
        A0u.append(this.A01);
        A0u.append(", dy2=");
        A0u.append(this.A04);
        A0u.append(", dx3=");
        A0u.append(this.A02);
        A0u.append(", dy3=");
        return C90464aC.A0g(A0u, this.A05);
    }
}
