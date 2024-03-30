package X;

/* renamed from: X.3I1  reason: invalid class name */
public final class AnonymousClass3I1 {
    public AnonymousClass00S A00;
    public boolean A01;

    public AnonymousClass3I1(AnonymousClass00S r2, boolean z) {
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = z;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I1) {
                AnonymousClass3I1 r5 = (AnonymousClass3I1) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36341k9.A01(this.A01 ? 1 : 0) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ViewArchivedSubgroupsUiState(expanded=");
        A0u.append(this.A01);
        A0u.append(", onClick=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
