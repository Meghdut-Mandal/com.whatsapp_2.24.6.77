package X;

/* renamed from: X.3K4  reason: invalid class name */
public final class AnonymousClass3K4 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3K4) {
                AnonymousClass3K4 r5 = (AnonymousClass3K4) obj;
                if (!(this.A05 == r5.A05 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((C36341k9.A01(this.A05 ? 1 : 0) * 31) + this.A00) * 31) + this.A01) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public AnonymousClass3K4(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = z2;
        this.A04 = z3;
        this.A03 = z4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ToolTipUiState(toolTipVisible=");
        A0u.append(this.A05);
        A0u.append(", recorderMode=");
        A0u.append(this.A00);
        A0u.append(", toolTipType=");
        A0u.append(this.A01);
        A0u.append(", canToggleRecorderMode=");
        A0u.append(this.A02);
        A0u.append(", isToolTipAnimationEnabled=");
        A0u.append(this.A04);
        A0u.append(", isSimplifiedRecorderModeAnimationEnabled=");
        return C36321k7.A0H(A0u, this.A03);
    }
}
