package X;

/* renamed from: X.2gY  reason: invalid class name and case insensitive filesystem */
public final class C48012gY extends C48032ga {
    public AnonymousClass141 A00;
    public final AnonymousClass3T1 A01;
    public final AnonymousClass3EL A02;
    public final CharSequence A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48012gY) {
                C48012gY r5 = (C48012gY) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C48012gY(AnonymousClass141 r2, AnonymousClass3T1 r3, AnonymousClass3EL r4, CharSequence charSequence, boolean z) {
        super(r4.A00, r2, r3, charSequence);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = charSequence;
        this.A04 = z;
    }

    public int hashCode() {
        return ((((C36351kA.A05(this.A00, C36391kE.A0A(this.A02)) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A03)) * 31) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MyStatusDataItem(myStatusState=");
        C36401kF.A1S(this.A02, A0u);
        A0u.append(this.A00);
        A0u.append(", latestMessage=");
        A0u.append(this.A01);
        A0u.append(", elapsedTimeString=");
        A0u.append(this.A03);
        A0u.append(", isItemVisible=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
