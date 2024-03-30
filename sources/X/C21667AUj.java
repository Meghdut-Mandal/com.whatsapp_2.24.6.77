package X;

/* renamed from: X.AUj  reason: case insensitive filesystem */
public final class C21667AUj implements Comparable {
    public boolean A00 = true;
    public final int A01;
    public final C199659fi A02;
    public final C206359tF A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public C21667AUj(C199659fi r2, C206359tF r3, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        AnonymousClass00C.A0D(str, 1);
        C36321k7.A19(str2, str3, str4, str5);
        this.A06 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A07 = str5;
        this.A01 = i;
        this.A09 = z;
        this.A02 = r2;
        this.A03 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21667AUj) {
                C21667AUj aUj = (C21667AUj) obj;
                if (!AnonymousClass00C.A0J(this.A06, aUj.A06) || !AnonymousClass00C.A0J(this.A08, aUj.A08) || !AnonymousClass00C.A0J(this.A05, aUj.A05) || !AnonymousClass00C.A0J(this.A04, aUj.A04) || !AnonymousClass00C.A0J(this.A07, aUj.A07) || this.A01 != aUj.A01 || this.A09 != aUj.A09 || !AnonymousClass00C.A0J(this.A02, aUj.A02) || !AnonymousClass00C.A0J(this.A03, aUj.A03) || this.A00 != aUj.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C21667AUj aUj = (C21667AUj) obj;
        AnonymousClass00C.A0D(aUj, 0);
        return this.A01 - aUj.A01;
    }

    public int hashCode() {
        return ((((((((C36381kD.A08(this.A07, C36381kD.A08(this.A04, C36381kD.A08(this.A05, C36381kD.A08(this.A08, C36421kH.A04(this.A06))))) + this.A01) * 31) + C36341k9.A01(this.A09 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A03)) * 31) + C36341k9.A01(this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AlertInfo(id=");
        A0u.append(this.A06);
        A0u.append(", title=");
        A0u.append(this.A08);
        A0u.append(", description=");
        A0u.append(this.A05);
        A0u.append(", ctaText=");
        A0u.append(this.A04);
        A0u.append(", scope=");
        A0u.append(this.A07);
        A0u.append(", type=");
        A0u.append(this.A01);
        A0u.append(", isCancelable=");
        A0u.append(this.A09);
        A0u.append(", phoenix=");
        A0u.append(this.A02);
        A0u.append(", legacyPaymentStepUpInfo=");
        A0u.append(this.A03);
        A0u.append(", shouldShowNotification=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
