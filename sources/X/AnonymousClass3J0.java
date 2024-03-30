package X;

/* renamed from: X.3J0  reason: invalid class name */
public final class AnonymousClass3J0 {
    public final C595934n A00;
    public final AnonymousClass147 A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3J0) {
                AnonymousClass3J0 r5 = (AnonymousClass3J0) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, C36391kE.A0A(this.A01)) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass3J0(C595934n r1, AnonymousClass147 r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ExitGroupFlowUiState(groupJid=");
        A0u.append(this.A01);
        A0u.append(", results=");
        A0u.append(this.A00);
        A0u.append(", isGroupCag=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
