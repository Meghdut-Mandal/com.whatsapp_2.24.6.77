package X;

/* renamed from: X.3IE  reason: invalid class name */
public final class AnonymousClass3IE {
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IE) {
                AnonymousClass3IE r5 = (AnonymousClass3IE) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.A01 ? 1 : 0) * 31) + this.A00;
    }

    public AnonymousClass3IE(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PushToVideoCameraEntryPointToolTipUiState(toolTipVisible=");
        A0u.append(this.A01);
        A0u.append(", toolTipType=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
