package X;

/* renamed from: X.3KU  reason: invalid class name */
public final class AnonymousClass3KU {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KU) {
                AnonymousClass3KU r8 = (AnonymousClass3KU) obj;
                if (!(AnonymousClass00C.A0J(this.A08, r8.A08) && AnonymousClass00C.A0J(this.A07, r8.A07) && AnonymousClass00C.A0J(this.A09, r8.A09) && this.A00 == r8.A00 && this.A03 == r8.A03 && this.A02 == r8.A02 && this.A01 == r8.A01 && this.A05 == r8.A05 && this.A06 == r8.A06 && this.A04 == r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A07, C36421kH.A04(this.A08));
        return C36341k9.A02(this.A04, C36321k7.A00(this.A06, C36321k7.A00(this.A05, (C53202qw.A00(C53202qw.A00((C36381kD.A08(this.A09, A082) + this.A00) * 31, this.A03), this.A02) + this.A01) * 31)));
    }

    public AnonymousClass3KU(String str, String str2, String str3, int i, int i2, long j, long j2, long j3, boolean z, boolean z2) {
        this.A08 = str;
        this.A07 = str2;
        this.A09 = str3;
        this.A00 = i;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = i2;
        this.A05 = j;
        this.A06 = j2;
        this.A04 = j3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccountSwitchingModel(lid=");
        A0u.append(this.A08);
        A0u.append(", jid=");
        A0u.append(this.A07);
        A0u.append(", name=");
        A0u.append(this.A09);
        A0u.append(", badgeCount=");
        A0u.append(this.A00);
        A0u.append(", isLoggedIn=");
        A0u.append(this.A03);
        A0u.append(", isCompanion=");
        A0u.append(this.A02);
        A0u.append(", unreadMessageCount=");
        A0u.append(this.A01);
        A0u.append(", lastActiveTimestampMs=");
        A0u.append(this.A05);
        A0u.append(", lastBuzzedTimestampMs=");
        A0u.append(this.A06);
        A0u.append(", accountAddedTimestampMs=");
        return C36331k8.A0j(A0u, this.A04);
    }
}
