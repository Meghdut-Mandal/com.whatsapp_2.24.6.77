package X;

import java.util.List;

/* renamed from: X.4ia  reason: invalid class name and case insensitive filesystem */
public final class C94664ia extends C109105Wh {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C125185zS A0A;
    public final C125185zS A0B;
    public final String A0C;
    public final List A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C94664ia r5 = (C94664ia) obj;
                if (!(AnonymousClass00C.A0J(this.A0C, r5.A0C) && AnonymousClass00C.A0J(this.A0A, r5.A0A) && this.A00 == r5.A00 && AnonymousClass00C.A0J(this.A0B, r5.A0B) && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A08 == r5.A08 && this.A09 == r5.A09 && this.A02 == r5.A02 && this.A06 == r5.A06 && this.A04 == r5.A04 && this.A05 == r5.A05 && this.A07 == r5.A07 && AnonymousClass00C.A0J(this.A0D, r5.A0D))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A022 = C90474aD.A02((C36351kA.A05(this.A0D, C36421kH.A04(this.A0C)) + AnonymousClass000.A0J(this.A0A)) * 31, this.A00);
        C125185zS r0 = this.A0B;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02((((C90474aD.A02(C90474aD.A02((A022 + i) * 31, this.A01), this.A03) + this.A08) * 31) + this.A09) * 31, this.A02), this.A06), this.A04), this.A05) + this.A07;
    }

    public C94664ia(C125185zS r1, C125185zS r2, String str, List list, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3) {
        this.A0C = str;
        this.A0D = list;
        this.A07 = i;
        this.A0A = r1;
        this.A00 = f;
        this.A0B = r2;
        this.A01 = f2;
        this.A03 = f3;
        this.A08 = i2;
        this.A09 = i3;
        this.A02 = f4;
        this.A06 = f5;
        this.A04 = f6;
        this.A05 = f7;
    }
}
