package X;

import android.text.SpannableString;

public final class A9O implements C16180ok {
    public final long A00;
    public final long A01;
    public final SpannableString A02;
    public final C207269up A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public A9O(SpannableString spannableString, C207269up r3, String str, String str2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass00C.A0D(str, 1);
        this.A05 = str;
        this.A0A = z;
        this.A02 = spannableString;
        this.A08 = z2;
        this.A04 = str2;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = r3;
        this.A07 = z3;
        this.A09 = z4;
        this.A06 = z5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A9O) {
                A9O a9o = (A9O) obj;
                if (!(AnonymousClass00C.A0J(this.A05, a9o.A05) && this.A0A == a9o.A0A && AnonymousClass00C.A0J(this.A02, a9o.A02) && this.A08 == a9o.A08 && AnonymousClass00C.A0J(this.A04, a9o.A04) && this.A01 == a9o.A01 && this.A00 == a9o.A00 && AnonymousClass00C.A0J(this.A03, a9o.A03) && this.A07 == a9o.A07 && this.A09 == a9o.A09 && this.A06 == a9o.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        SpannableString spannableString = this.A02;
        return ((((((C36321k7.A00(this.A00, C36321k7.A00(this.A01, C36381kD.A08(this.A04, (C36351kA.A05(spannableString, (C36421kH.A04(this.A05) + C36341k9.A01(this.A0A ? 1 : 0)) * 31) + C36341k9.A01(this.A08 ? 1 : 0)) * 31))) + AnonymousClass000.A0H(this.A03)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + C36341k9.A01(this.A09 ? 1 : 0)) * 31) + C36341k9.A01(this.A06 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductBottomSheetUiStateProductLoaded(title=");
        A0u.append(this.A05);
        A0u.append(", useOrderRequestVariant=");
        A0u.append(this.A0A);
        A0u.append(", price=");
        A0u.append(this.A02);
        A0u.append(", showCartControls=");
        A0u.append(this.A08);
        A0u.append(", cartitemQuantityString=");
        A0u.append(this.A04);
        A0u.append(", maxAvailable=");
        A0u.append(this.A01);
        A0u.append(", cartItemCount=");
        A0u.append(this.A00);
        A0u.append(", product=");
        A0u.append(this.A03);
        A0u.append(", inStock=");
        A0u.append(this.A07);
        A0u.append(", updateCarousel=");
        A0u.append(this.A09);
        A0u.append(", hasFullProductInfo=");
        return C36321k7.A0H(A0u, this.A06);
    }
}
