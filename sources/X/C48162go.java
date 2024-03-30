package X;

/* renamed from: X.2go  reason: invalid class name and case insensitive filesystem */
public final class C48162go extends C55652uy {
    public AnonymousClass141 A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C44072La A04;
    public final AnonymousClass3T1 A05;
    public final CharSequence A06;
    public final boolean A07;
    public final boolean A08;

    public C48162go(C44072La r2, AnonymousClass141 r3, AnonymousClass3T1 r4, CharSequence charSequence, int i, long j, long j2, boolean z, boolean z2) {
        AnonymousClass00C.A0D(charSequence, 5);
        this.A04 = r2;
        this.A00 = r3;
        this.A05 = r4;
        this.A02 = j;
        this.A06 = charSequence;
        this.A07 = z;
        this.A08 = z2;
        this.A03 = j2;
        this.A01 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48162go) {
                C48162go r8 = (C48162go) obj;
                if (!(AnonymousClass00C.A0J(this.A04, r8.A04) && AnonymousClass00C.A0J(this.A00, r8.A00) && AnonymousClass00C.A0J(this.A05, r8.A05) && this.A02 == r8.A02 && AnonymousClass00C.A0J(this.A06, r8.A06) && this.A07 == r8.A07 && this.A08 == r8.A08 && this.A03 == r8.A03 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0A = C36391kE.A0A(this.A04);
        int A002 = C36321k7.A00(this.A02, (C36351kA.A05(this.A00, A0A) + AnonymousClass000.A0H(this.A05)) * 31);
        return C36321k7.A00(this.A03, (((C36351kA.A05(this.A06, A002) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + C36341k9.A01(this.A08 ? 1 : 0)) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterDataItem(newsletterInfo=");
        C36401kF.A1S(this.A04, A0u);
        A0u.append(this.A00);
        A0u.append(", latestMessage=");
        A0u.append(this.A05);
        A0u.append(", displayTimestamp=");
        A0u.append(this.A02);
        A0u.append(", elapsedTimeString=");
        A0u.append(this.A06);
        A0u.append(", isLatestMessageTransferred=");
        A0u.append(this.A07);
        A0u.append(", isPrefetching=");
        A0u.append(this.A08);
        A0u.append(", unseenMessageCount=");
        A0u.append(this.A03);
        A0u.append(", lastMessageStatus=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
