package X;

/* renamed from: X.6FJ  reason: invalid class name */
public final class AnonymousClass6FJ {
    public final long A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass6PD A03;
    public final C109085Wf A04;
    public final C129796Im A05;
    public final AnonymousClass68R A06;
    public final AnonymousClass68S A07;
    public final AnonymousClass72W A08;
    public final AnonymousClass75Q A09;
    public final AnonymousClass68U A0A;
    public final C131366Ot A0B;
    public final C161277mU A0C;
    public final AnonymousClass6TV A0D;
    public final String A0E;

    public final boolean A02(AnonymousClass6FJ r9) {
        if (this != r9) {
            long j = this.A01;
            long j2 = r9.A01;
            AnonymousClass68V[] r0 = AnonymousClass6WI.A02;
            if (AnonymousClass000.A1Q((j > j2 ? 1 : (j == j2 ? 0 : -1))) && AnonymousClass00C.A0J(this.A08, r9.A08) && AnonymousClass00C.A0J(this.A06, r9.A06) && AnonymousClass00C.A0J(this.A07, r9.A07) && AnonymousClass00C.A0J(this.A05, r9.A05) && AnonymousClass00C.A0J(this.A0E, r9.A0E) && this.A02 == r9.A02 && AnonymousClass00C.A0J(this.A0A, r9.A0A) && AnonymousClass00C.A0J(this.A0D, r9.A0D) && AnonymousClass00C.A0J(this.A09, r9.A09)) {
                long j3 = this.A00;
                long j4 = r9.A00;
                long j5 = C133336Xx.A01;
                if (j3 == j4) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass6FJ)) {
            return false;
        }
        AnonymousClass6FJ r4 = (AnonymousClass6FJ) obj;
        return A02(r4) && A03(r4);
    }

    public static void A00(AnonymousClass6FJ r2, C161277mU r3, StringBuilder sb) {
        sb.append(", brush=");
        sb.append(r3.B8w());
        sb.append(", alpha=");
        sb.append(r3.B8b());
        sb.append(", fontSize=");
        sb.append(AnonymousClass6WI.A02(r2.A01));
        sb.append(", fontWeight=");
        sb.append(r2.A08);
        sb.append(", fontStyle=");
        sb.append(r2.A06);
        sb.append(", fontSynthesis=");
        sb.append(r2.A07);
        sb.append(", fontFamily=");
        sb.append(r2.A05);
        sb.append(", fontFeatureSettings=");
        sb.append(r2.A0E);
        sb.append(", letterSpacing=");
        sb.append(AnonymousClass6WI.A02(r2.A02));
        sb.append(", baselineShift=");
        sb.append(r2.A0A);
        sb.append(", textGeometricTransform=");
        sb.append(r2.A0D);
        sb.append(", localeList=");
        sb.append(r2.A09);
        sb.append(", background=");
    }

    public final AnonymousClass6FJ A01(AnonymousClass6FJ r39) {
        AnonymousClass6FJ r6 = r39;
        if (r39 == null) {
            return this;
        }
        C161277mU r0 = r6.A0C;
        long B9t = r0.B9t();
        C125185zS B8w = r0.B8w();
        float B8b = r0.B8b();
        long j = r6.A01;
        AnonymousClass72W r17 = r6.A08;
        AnonymousClass68R r15 = r6.A06;
        AnonymousClass68S r14 = r6.A07;
        C129796Im r13 = r6.A05;
        String str = r6.A0E;
        long j2 = r6.A02;
        AnonymousClass68U r11 = r6.A0A;
        AnonymousClass6TV r10 = r6.A0D;
        AnonymousClass75Q r9 = r6.A09;
        long j3 = r6.A00;
        C131366Ot r8 = r6.A0B;
        AnonymousClass68U r25 = r11;
        C131366Ot r26 = r8;
        AnonymousClass6TV r27 = r10;
        String str2 = str;
        AnonymousClass68R r21 = r15;
        AnonymousClass68S r22 = r14;
        AnonymousClass72W r23 = r17;
        AnonymousClass75Q r24 = r9;
        return AnonymousClass6J2.A00(B8w, r6.A03, r6.A04, this, r13, r21, r22, r23, r24, r25, r26, r27, str2, B8b, B9t, j, j2, j3);
    }

    public final boolean A03(AnonymousClass6FJ r4) {
        if (!AnonymousClass00C.A0J(this.A0C, r4.A0C) || !AnonymousClass00C.A0J(this.A0B, r4.A0B) || !AnonymousClass00C.A0J(this.A03, r4.A03) || !AnonymousClass00C.A0J(this.A04, r4.A04)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        C161277mU r5 = this.A0C;
        long B9t = r5.B9t();
        long j = C133336Xx.A01;
        int i5 = 0;
        int A022 = C90474aD.A02((C90464aC.A08(B9t) + AnonymousClass000.A0J(r5.B8w())) * 31, r5.B8b());
        long j2 = this.A01;
        AnonymousClass68V[] r0 = AnonymousClass6WI.A02;
        int A002 = (C36321k7.A00(j2, A022) + AnonymousClass000.A0J(this.A08)) * 31;
        AnonymousClass68R r02 = this.A06;
        if (r02 != null) {
            i = r02.A00;
        } else {
            i = 0;
        }
        int i6 = (A002 + i) * 31;
        AnonymousClass68S r03 = this.A07;
        if (r03 != null) {
            i2 = r03.A00;
        } else {
            i2 = 0;
        }
        int A0J = (((i6 + i2) * 31) + AnonymousClass000.A0J(this.A05)) * 31;
        String str = this.A0E;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int A003 = C36321k7.A00(this.A02, (A0J + i3) * 31);
        AnonymousClass68U r04 = this.A0A;
        if (r04 != null) {
            i4 = Float.floatToIntBits(r04.A00);
        } else {
            i4 = 0;
        }
        int A004 = (((C36321k7.A00(this.A00, (((((A003 + i4) * 31) + AnonymousClass000.A0J(this.A0D)) * 31) + AnonymousClass000.A0J(this.A09)) * 31) + AnonymousClass000.A0J(this.A0B)) * 31) + AnonymousClass000.A0J(this.A03)) * 31 * 31;
        C109085Wf r05 = this.A04;
        if (r05 != null) {
            i5 = r05.hashCode();
        }
        return A004 + i5;
    }

    public AnonymousClass6FJ(AnonymousClass6PD r3, C109085Wf r4, C129796Im r5, AnonymousClass68R r6, AnonymousClass68S r7, AnonymousClass72W r8, AnonymousClass75Q r9, AnonymousClass68U r10, C131366Ot r11, C161277mU r12, AnonymousClass6TV r13, String str, long j, long j2, long j3) {
        this.A0C = r12;
        this.A01 = j;
        this.A08 = r8;
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = r5;
        this.A0E = str;
        this.A02 = j2;
        this.A0A = r10;
        this.A0D = r13;
        this.A09 = r9;
        this.A00 = j3;
        this.A0B = r11;
        this.A03 = r3;
        this.A04 = r4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SpanStyle(color=");
        C161277mU r2 = this.A0C;
        C90484aE.A1J(A0u, r2.B9t());
        A00(this, r2, A0u);
        C90484aE.A1J(A0u, this.A00);
        A0u.append(", textDecoration=");
        A0u.append(this.A0B);
        A0u.append(", shadow=");
        A0u.append(this.A03);
        C90474aD.A1M(A0u, ", platformStyle=");
        A0u.append(", drawStyle=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }
}
