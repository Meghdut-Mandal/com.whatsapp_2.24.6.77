package X;

/* renamed from: X.3K0  reason: invalid class name */
public final class AnonymousClass3K0 {
    public final float A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3K0) {
                AnonymousClass3K0 r5 = (AnonymousClass3K0) obj;
                if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((C36341k9.A01(this.A03 ? 1 : 0) * 31) + this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public AnonymousClass3K0(float f, int i, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A01 = i;
        this.A00 = f;
        this.A02 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CommandData(isBusinessThirdPartyBot=");
        A0u.append(this.A03);
        A0u.append(", botProfileSize=");
        A0u.append(this.A01);
        A0u.append(", botProfileRadius=");
        A0u.append(this.A00);
        A0u.append(", isBusinessAccount=");
        A0u.append(this.A02);
        A0u.append(", isFirstPartyBotAccount=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
