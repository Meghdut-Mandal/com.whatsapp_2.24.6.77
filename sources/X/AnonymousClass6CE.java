package X;

/* renamed from: X.6CE  reason: invalid class name */
public final class AnonymousClass6CE {
    public final C61243Bc A00;
    public final C61243Bc A01;
    public final C61243Bc A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CE) {
                AnonymousClass6CE r5 = (AnonymousClass6CE) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass000.A0H(this.A02) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A00)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public AnonymousClass6CE(C61243Bc r1, C61243Bc r2, C61243Bc r3, boolean z) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallHeaderViewState(title=");
        A0u.append(this.A02);
        A0u.append(", status=");
        A0u.append(this.A01);
        A0u.append(", groupsInCommon=");
        A0u.append(this.A00);
        A0u.append(", showIfCallFailed=");
        return C36321k7.A0H(A0u, this.A03);
    }
}
