package X;

/* renamed from: X.52r  reason: invalid class name and case insensitive filesystem */
public final class C1029552r extends C125355zm {
    public final C16240oq A00;
    public final C16260os A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1029552r) {
                C1029552r r5 = (C1029552r) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public C1029552r(C16240oq r1, C16260os r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallUpgradeRequestedUiState(acceptDeclineButtonGroup=");
        A0u.append(this.A00);
        A0u.append(", headerState=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
