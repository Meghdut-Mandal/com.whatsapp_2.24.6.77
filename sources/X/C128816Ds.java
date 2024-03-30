package X;

/* renamed from: X.6Ds  reason: invalid class name and case insensitive filesystem */
public final class C128816Ds {
    public final int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C128816Ds(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, long j, long j2) {
        AnonymousClass00C.A0D(str3, 3);
        this.A03 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A02 = j;
        this.A04 = str4;
        this.A00 = i;
        this.A06 = str5;
        this.A05 = str6;
        this.A01 = j2;
        this.A09 = str7;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128816Ds) {
                C128816Ds r8 = (C128816Ds) obj;
                if (!AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A07, r8.A07) || !AnonymousClass00C.A0J(this.A08, r8.A08) || this.A02 != r8.A02 || !AnonymousClass00C.A0J(this.A04, r8.A04) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A05, r8.A05) || this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A09, r8.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A08, C36381kD.A08(this.A07, C36421kH.A04(this.A03)));
        return C36321k7.A00(this.A01, (((((((C36321k7.A00(this.A02, A082) + C36341k9.A09(this.A04)) * 31) + this.A00) * 31) + C36341k9.A09(this.A06)) * 31) + C36341k9.A09(this.A05)) * 31) + C36421kH.A05(this.A09);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InactiveNotificationData(accountLid=");
        A0u.append(this.A03);
        A0u.append(", notificationType=");
        A0u.append(this.A07);
        A0u.append(", senderJid=");
        A0u.append(this.A08);
        A0u.append(", timestampMs=");
        A0u.append(this.A02);
        A0u.append(", callId=");
        A0u.append(this.A04);
        A0u.append(", callStatus=");
        A0u.append(this.A00);
        A0u.append(", groupJid=");
        A0u.append(this.A06);
        A0u.append(", displayName=");
        A0u.append(this.A05);
        A0u.append(", count=");
        A0u.append(this.A01);
        A0u.append(", senderPnJid=");
        return C36321k7.A0E(this.A09, A0u);
    }
}
