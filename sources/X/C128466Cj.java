package X;

/* renamed from: X.6Cj  reason: invalid class name and case insensitive filesystem */
public final class C128466Cj {
    public final float A00;
    public final float A01;
    public final int A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128466Cj) {
                C128466Cj r5 = (C128466Cj) obj;
                if (!(AnonymousClass00C.A0J(this.A04, r5.A04) && AnonymousClass00C.A0J(this.A03, r5.A03) && Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C((C90474aD.A02((C36381kD.A08(this.A03, C36421kH.A04(this.A04)) + 400) * 31, this.A00) + this.A02) * 31, this.A01);
    }

    public C128466Cj(String str, String str2, float f, float f2, int i) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = f;
        this.A02 = i;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CdsTypographyData(accessibilityRole=");
        A0u.append(this.A04);
        A0u.append(", fontFamily=");
        A0u.append(this.A03);
        A0u.append(", fontWeight=");
        A0u.append(400);
        A0u.append(", letterSpacing=");
        A0u.append(this.A00);
        A0u.append(", fontSize=");
        A0u.append(this.A02);
        A0u.append(", lineHeightMultiplier=");
        return C90464aC.A0g(A0u, this.A01);
    }
}
