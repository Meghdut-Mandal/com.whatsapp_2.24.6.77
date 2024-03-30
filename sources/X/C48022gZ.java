package X;

/* renamed from: X.2gZ  reason: invalid class name and case insensitive filesystem */
public final class C48022gZ extends C48032ga {
    public AnonymousClass141 A00;
    public final C65663Sz A01;
    public final AnonymousClass3T1 A02;
    public final CharSequence A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48022gZ) {
                C48022gZ r5 = (C48022gZ) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A04 != r5.A04 || this.A05 != r5.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36351kA.A05(this.A02, C36351kA.A05(this.A00, C36391kE.A0A(this.A01))) + AnonymousClass000.A0H(this.A03)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A05 ? 1 : 0);
    }

    public C48022gZ(C65663Sz r1, AnonymousClass141 r2, AnonymousClass3T1 r3, CharSequence charSequence, boolean z, boolean z2) {
        super(r1, r2, r3, charSequence);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = charSequence;
        this.A04 = z;
        this.A05 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ContactStatusDataItem(statusInfo=");
        C36401kF.A1S(this.A01, A0u);
        A0u.append(this.A00);
        A0u.append(", latestMessage=");
        A0u.append(this.A02);
        A0u.append(", elapsedTimeString=");
        A0u.append(this.A03);
        A0u.append(", isItemVisible=");
        A0u.append(this.A04);
        A0u.append(", isMuted=");
        return C36321k7.A0H(A0u, this.A05);
    }
}
