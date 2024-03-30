package X;

/* renamed from: X.6Eq  reason: invalid class name and case insensitive filesystem */
public final class C129026Eq {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final C131236Og A05;
    public final AnonymousClass6P5 A06;
    public final AnonymousClass6P7 A07;

    public final C129026Eq A02(C129026Eq r11) {
        if (r11 == null) {
            return this;
        }
        int i = r11.A02;
        int i2 = r11.A03;
        long j = r11.A04;
        AnonymousClass6P5 r2 = r11.A06;
        return C129636Hw.A00(this, r11.A05, r2, r11.A07, i, i2, r11.A01, r11.A00, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C129026Eq) {
                C129026Eq r8 = (C129026Eq) obj;
                if (this.A02 == r8.A02 && this.A03 == r8.A03) {
                    long j = this.A04;
                    long j2 = r8.A04;
                    AnonymousClass68V[] r0 = AnonymousClass6WI.A02;
                    if (j != j2 || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A05, r8.A05) || this.A01 != r8.A01 || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A07, r8.A07)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C129026Eq r1, StringBuilder sb) {
        String str;
        sb.append(", lineBreak=");
        sb.append(C131256Oi.A00(r1.A01));
        sb.append(", hyphens=");
        int i = r1.A00;
        if (i == 1) {
            str = "Hyphens.None";
        } else if (i == 2) {
            str = "Hyphens.Auto";
        } else if (i == Integer.MIN_VALUE) {
            str = "Hyphens.Unspecified";
        } else {
            str = "Invalid";
        }
        sb.append(str);
        sb.append(", textMotion=");
    }

    public static void A01(C129026Eq r2, StringBuilder sb) {
        sb.append(C131266Oj.A00(r2.A02));
        sb.append(", textDirection=");
        sb.append(C131276Ok.A00(r2.A03));
        sb.append(", lineHeight=");
        sb.append(AnonymousClass6WI.A02(r2.A04));
        sb.append(", textIndent=");
        sb.append(r2.A06);
        sb.append(", platformStyle=");
    }

    public int hashCode() {
        int i = ((this.A02 * 31) + this.A03) * 31;
        long j = this.A04;
        AnonymousClass68V[] r0 = AnonymousClass6WI.A02;
        int i2 = 0;
        int A002 = (((((((C36321k7.A00(j, i) + AnonymousClass000.A0J(this.A06)) * 31) + AnonymousClass000.A0J(this.A05)) * 31 * 31) + this.A01) * 31) + this.A00) * 31;
        AnonymousClass6P7 r02 = this.A07;
        if (r02 != null) {
            i2 = r02.hashCode();
        }
        return A002 + i2;
    }

    public C129026Eq(C131236Og r4, AnonymousClass6P5 r5, AnonymousClass6P7 r6, int i, int i2, int i3, int i4, long j) {
        this.A02 = i;
        this.A03 = i2;
        this.A04 = j;
        this.A06 = r5;
        this.A05 = r4;
        this.A01 = i3;
        this.A00 = i4;
        this.A07 = r6;
        if (j != AnonymousClass6WI.A01) {
            float A002 = C90464aC.A00(j);
            if (A002 < 0.0f) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("lineHeight can't be negative (");
                throw AnonymousClass001.A09(C90464aC.A0g(A0u, A002));
            }
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParagraphStyle(textAlign=");
        A01(this, A0u);
        A0u.append(this.A05);
        C90474aD.A1M(A0u, ", lineHeightStyle=");
        A00(this, A0u);
        return AnonymousClass000.A0m(this.A07, A0u);
    }
}
