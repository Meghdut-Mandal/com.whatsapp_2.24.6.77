package X;

/* renamed from: X.3KT  reason: invalid class name */
public final class AnonymousClass3KT {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KT) {
                AnonymousClass3KT r5 = (AnonymousClass3KT) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A08 == r5.A08 && this.A05 == r5.A05 && this.A03 == r5.A03 && this.A07 == r5.A07 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((this.A00 * 31) + this.A01) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A08 ? 1 : 0)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + C36341k9.A01(this.A06 ? 1 : 0);
    }

    public AnonymousClass3KT(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = z;
        this.A04 = z2;
        this.A08 = z3;
        this.A05 = z4;
        this.A03 = z5;
        this.A07 = z6;
        this.A06 = z7;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaSentLogData(mediaType=");
        A0u.append(this.A00);
        A0u.append(", origin=");
        A0u.append(this.A01);
        A0u.append(", isChat=");
        A0u.append(this.A02);
        A0u.append(", isGroup=");
        A0u.append(this.A04);
        A0u.append(", isStatus=");
        A0u.append(this.A08);
        A0u.append(", isLargeDoc=");
        A0u.append(this.A05);
        A0u.append(", isCommunity=");
        A0u.append(this.A03);
        A0u.append(", isOriginalQuality=");
        A0u.append(this.A07);
        A0u.append(", isMediaAsDoc=");
        return C36321k7.A0H(A0u, this.A06);
    }
}
