package X;

/* renamed from: X.3JW  reason: invalid class name */
public final class AnonymousClass3JW {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass141 A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JW) {
                AnonymousClass3JW r5 = (AnonymousClass3JW) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || this.A01 != r5.A01 || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, (((C36421kH.A04(this.A03) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A00 ? 1 : 0)) * 31);
    }

    public AnonymousClass3JW(AnonymousClass141 r1, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = z;
        this.A00 = z2;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AdhocParticipantItemRow(name=");
        A0u.append(this.A03);
        A0u.append(", isSelected=");
        A0u.append(this.A01);
        A0u.append(", isEnabled=");
        A0u.append(this.A00);
        A0u.append(", contact=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
