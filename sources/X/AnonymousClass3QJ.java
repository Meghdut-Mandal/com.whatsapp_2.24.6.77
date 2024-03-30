package X;

/* renamed from: X.3QJ  reason: invalid class name */
public final class AnonymousClass3QJ {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QJ) {
                AnonymousClass3QJ r5 = (AnonymousClass3QJ) obj;
                if (!(this.A04 == r5.A04 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((C36341k9.A01(this.A04 ? 1 : 0) * 31) + this.A00) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public AnonymousClass3QJ(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = z;
        this.A00 = i;
        this.A02 = z2;
        this.A01 = z3;
        this.A03 = z4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("State(toolTipVisible=");
        A0u.append(this.A04);
        A0u.append(", toolTipType=");
        A0u.append(this.A00);
        A0u.append(", entryIsBlank=");
        A0u.append(this.A02);
        A0u.append(", canSendPushToVideoMessages=");
        A0u.append(this.A01);
        A0u.append(", isCameraEntryPointEnabled=");
        return C36321k7.A0H(A0u, this.A03);
    }

    public AnonymousClass3QJ() {
        this(0, false, true, false, false);
    }
}
