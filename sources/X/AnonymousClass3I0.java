package X;

/* renamed from: X.3I0  reason: invalid class name */
public final class AnonymousClass3I0 {
    public int A00;
    public AnonymousClass00S A01;

    public AnonymousClass3I0(AnonymousClass00S r2, int i) {
        AnonymousClass00C.A0D(r2, 2);
        this.A00 = i;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I0) {
                AnonymousClass3I0 r5 = (AnonymousClass3I0) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, this.A00 * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ViewAllSubgroupsUiState(extraGroupsCount=");
        A0u.append(this.A00);
        A0u.append(", onClick=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
