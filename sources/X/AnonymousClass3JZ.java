package X;

/* renamed from: X.3JZ  reason: invalid class name */
public final class AnonymousClass3JZ {
    public final int A00;
    public final C51182nP A01;
    public final AnonymousClass147 A02;
    public final C006302t A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JZ) {
                AnonymousClass3JZ r5 = (AnonymousClass3JZ) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A03, (C36391kE.A0A(this.A02) + this.A00) * 31));
    }

    public AnonymousClass3JZ(C51182nP r1, AnonymousClass147 r2, C006302t r3, int i) {
        C36321k7.A0y(r2, r3);
        this.A02 = r2;
        this.A00 = i;
        this.A03 = r3;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MemberSuggestedGroupsUiState(parentJid=");
        A0u.append(this.A02);
        A0u.append(", suggestedGroupsCount=");
        A0u.append(this.A00);
        A0u.append(", onClick=");
        A0u.append(this.A03);
        A0u.append(", viewMode=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
