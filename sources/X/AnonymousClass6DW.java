package X;

/* renamed from: X.6DW  reason: invalid class name */
public final class AnonymousClass6DW {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DW) {
                AnonymousClass6DW r5 = (AnonymousClass6DW) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((this.A01 * 31) + this.A00) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A06 ? 1 : 0)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass6DW(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A05 = z4;
        this.A02 = z5;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NetworkHealthEvent(previousState=");
        A0u.append(this.A01);
        A0u.append(", currentState=");
        A0u.append(this.A00);
        A0u.append(", shouldPlaySoundAlert=");
        A0u.append(this.A03);
        A0u.append(", shouldShowBannerSubtitle=");
        A0u.append(this.A04);
        A0u.append(", shouldShowPoorNetworkBanner=");
        A0u.append(this.A06);
        A0u.append(", shouldShowNoNetworkBanner=");
        A0u.append(this.A05);
        A0u.append(", isVersion2=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
