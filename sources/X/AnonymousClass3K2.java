package X;

/* renamed from: X.3K2  reason: invalid class name */
public final class AnonymousClass3K2 {
    public int A00;
    public final C51182nP A01;
    public final AnonymousClass3KN A02;
    public final AnonymousClass141 A03;
    public final AnonymousClass141 A04;
    public final C009003v A05;

    public AnonymousClass3K2(C51182nP r2, AnonymousClass3KN r3, AnonymousClass141 r4, AnonymousClass141 r5, C009003v r6, int i) {
        AnonymousClass00C.A0D(r2, 4);
        this.A02 = r3;
        this.A00 = i;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = r4;
        this.A03 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3K2) {
                AnonymousClass3K2 r5 = (AnonymousClass3K2) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A05, r5.A05) || this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A03, C36351kA.A05(this.A04, C36351kA.A05(this.A01, C36351kA.A05(this.A05, (C36391kE.A0A(this.A02) + this.A00) * 31))));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UiState(suggestion=");
        A0u.append(this.A02);
        A0u.append(", subgroupApprovalState=");
        A0u.append(this.A00);
        A0u.append(", onAction=");
        A0u.append(this.A05);
        A0u.append(", userView=");
        A0u.append(this.A01);
        A0u.append(", groupContact=");
        A0u.append(this.A04);
        A0u.append(", creatorContact=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
