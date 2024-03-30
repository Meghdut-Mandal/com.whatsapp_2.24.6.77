package X;

/* renamed from: X.2DW  reason: invalid class name */
public final class AnonymousClass2DW extends C53432rJ {
    public final AnonymousClass141 A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2DW) {
                AnonymousClass2DW r5 = (AnonymousClass2DW) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || this.A04 != r5.A04 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, (((C36421kH.A04(this.A02) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public AnonymousClass2DW(AnonymousClass141 r1, Integer num, String str, boolean z, boolean z2) {
        this.A02 = str;
        this.A04 = z;
        this.A01 = num;
        this.A00 = r1;
        this.A03 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Participant(name=");
        A0u.append(this.A02);
        A0u.append(", joined=");
        A0u.append(this.A04);
        A0u.append(", initiatorStringRes=");
        C36401kF.A1S(this.A01, A0u);
        A0u.append(this.A00);
        A0u.append(", isMe=");
        return C36321k7.A0H(A0u, this.A03);
    }
}
