package X;

/* renamed from: X.9XL  reason: invalid class name */
public final class AnonymousClass9XL {
    public int A00;
    public final long A01;
    public final AnonymousClass8RS A02;
    public final C64933Qa A03;
    public final String A04;
    public final AnonymousClass11F A05;
    public final Long A06;
    public final String A07;
    public final String A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9XL) {
                AnonymousClass9XL r8 = (AnonymousClass9XL) obj;
                if (!AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A05, r8.A05) || this.A01 != r8.A01 || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A07, r8.A07) || !AnonymousClass00C.A0J(this.A08, r8.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0A = C36391kE.A0A(this.A02);
        return ((((((((C36321k7.A00(this.A01, (C36351kA.A05(this.A03, A0A) + AnonymousClass000.A0H(this.A05)) * 31) + this.A00) * 31) + AnonymousClass000.A0H(this.A06)) * 31) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A07)) * 31) + C36421kH.A05(this.A08);
    }

    public AnonymousClass9XL(AnonymousClass11F r1, AnonymousClass8RS r2, C64933Qa r3, Long l, String str, String str2, String str3, int i, long j) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r1;
        this.A01 = j;
        this.A00 = i;
        this.A06 = l;
        this.A04 = str;
        this.A07 = str2;
        this.A08 = str3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParseInteropMessageParams(interopMessage=");
        A0u.append(this.A02);
        A0u.append(", messageKey=");
        A0u.append(this.A03);
        A0u.append(", chatJid=");
        A0u.append(this.A05);
        A0u.append(", timestamp=");
        A0u.append(this.A01);
        A0u.append(", durationSeconds=");
        A0u.append(this.A00);
        A0u.append(", csatTriggerExpiryMillis=");
        A0u.append(this.A06);
        A0u.append(", messageTypeAttribute=");
        A0u.append(this.A04);
        A0u.append(", counterAbuseToken=");
        A0u.append(this.A07);
        A0u.append(", nativeFlowName=");
        return C36321k7.A0E(this.A08, A0u);
    }
}
