package X;

/* renamed from: X.9Xb  reason: invalid class name */
public final class AnonymousClass9Xb {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final float A0G;
    public final float A0H;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9Xb) {
                AnonymousClass9Xb r5 = (AnonymousClass9Xb) obj;
                if (!(Float.compare(this.A0H, r5.A0H) == 0 && Float.compare(this.A06, r5.A06) == 0 && Float.compare(this.A05, r5.A05) == 0 && Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A04, r5.A04) == 0 && Float.compare(this.A0G, r5.A0G) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A09, r5.A09) == 0 && Float.compare(this.A0A, r5.A0A) == 0 && Float.compare(this.A0C, r5.A0C) == 0 && Float.compare(this.A0D, r5.A0D) == 0 && Float.compare(this.A0E, r5.A0E) == 0 && Float.compare(this.A0F, r5.A0F) == 0 && Float.compare(this.A07, r5.A07) == 0 && Float.compare(this.A08, r5.A08) == 0 && Float.compare(this.A0B, r5.A0B) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A0H), this.A06), this.A05), this.A03), this.A04), this.A0G), this.A02), this.A00), this.A01), this.A09), this.A0A), this.A0C), this.A0D), this.A0E), this.A0F), this.A07), this.A08), this.A0B);
    }

    public AnonymousClass9Xb(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.A0H = f;
        this.A06 = f2;
        this.A05 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A0G = f6;
        this.A02 = f7;
        this.A00 = f8;
        this.A01 = f9;
        this.A09 = f10;
        this.A0A = f11;
        this.A0C = f12;
        this.A0D = f13;
        this.A0E = f14;
        this.A0F = f15;
        this.A07 = f16;
        this.A08 = f17;
        this.A0B = f18;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BubbleSpec(top=");
        A0u.append(this.A0H);
        A0u.append(", left=");
        A0u.append(this.A06);
        A0u.append(", handleWidth=");
        A0u.append(this.A05);
        A0u.append(", handleHeight=");
        A0u.append(this.A03);
        A0u.append(", handleTopRoundedCornerRadius=");
        A0u.append(this.A04);
        A0u.append(", shadowSize=");
        A0u.append(this.A0G);
        A0u.append(", bubbleWidth=");
        A0u.append(this.A02);
        A0u.append(", bubbleHeight=");
        A0u.append(this.A00);
        A0u.append(", bubbleRoundedCornerRadius=");
        A0u.append(this.A01);
        A0u.append(", ninePatchLeftY1=");
        A0u.append(this.A09);
        A0u.append(", ninePatchLeftY2=");
        A0u.append(this.A0A);
        A0u.append(", ninePatchRightY1=");
        A0u.append(this.A0C);
        A0u.append(", ninePatchRightY2=");
        A0u.append(this.A0D);
        A0u.append(", ninePatchTopX1=");
        A0u.append(this.A0E);
        A0u.append(", ninePatchTopX2=");
        A0u.append(this.A0F);
        A0u.append(", ninePatchBottomX1=");
        A0u.append(this.A07);
        A0u.append(", ninePatchBottomX2=");
        A0u.append(this.A08);
        A0u.append(", ninePatchPadding=");
        return C90464aC.A0g(A0u, this.A0B);
    }
}
