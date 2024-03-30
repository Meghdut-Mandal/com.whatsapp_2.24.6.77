package X;

/* renamed from: X.6E8  reason: invalid class name */
public final class AnonymousClass6E8 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final int A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6E8) {
                AnonymousClass6E8 r5 = (AnonymousClass6E8) obj;
                if (!AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A07, r5.A07) || this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A0A, r5.A0A) || !AnonymousClass00C.A0J(this.A0B, r5.A0B) || !AnonymousClass00C.A0J(this.A0D, r5.A0D) || !AnonymousClass00C.A0J(this.A0C, r5.A0C) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A08, C36381kD.A08(this.A06, C36421kH.A04(this.A09)));
        String str = this.A0A;
        return C36381kD.A08(this.A01, C36381kD.A08(this.A02, C36381kD.A08(this.A00, C36381kD.A08(this.A03, (((((C36381kD.A08(str, (C36381kD.A08(this.A07, A082) + this.A05) * 31) + C36341k9.A09(this.A0B)) * 31) + C36341k9.A09(this.A0D)) * 31) + C36341k9.A09(this.A0C)) * 31)))) + C36421kH.A05(this.A04);
    }

    public AnonymousClass6E8(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i) {
        C36321k7.A15(str10, str11, str12);
        this.A09 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A07 = str4;
        this.A05 = i;
        this.A0A = str5;
        this.A0B = str6;
        this.A0D = str7;
        this.A0C = str8;
        this.A03 = str9;
        this.A00 = str10;
        this.A02 = str11;
        this.A01 = str12;
        this.A04 = str13;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoQueuedContext(previousState=");
        A0u.append(this.A09);
        A0u.append(", previousAction=");
        A0u.append(this.A06);
        A0u.append(", previousSentiment=");
        A0u.append(this.A08);
        A0u.append(", previousIntensity=");
        A0u.append(this.A07);
        A0u.append(", trigger=");
        A0u.append(this.A05);
        A0u.append(", targetState=");
        A0u.append(this.A0A);
        A0u.append(", triggeringAction=");
        A0u.append(this.A0B);
        A0u.append(", triggeringSentiment=");
        A0u.append(this.A0D);
        A0u.append(", triggeringIntensity=");
        A0u.append(this.A0C);
        A0u.append(", currentState=");
        A0u.append(this.A03);
        A0u.append(", currentAction=");
        A0u.append(this.A00);
        A0u.append(", currentSentiment=");
        A0u.append(this.A02);
        A0u.append(", currentIntensity=");
        A0u.append(this.A01);
        A0u.append(", fallbackReason=");
        return C36321k7.A0E(this.A04, A0u);
    }
}
