package X;

/* renamed from: X.3KH  reason: invalid class name */
public final class AnonymousClass3KH {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KH) {
                AnonymousClass3KH r5 = (AnonymousClass3KH) obj;
                if (!(this.A00 == r5.A00 && this.A04 == r5.A04 && this.A02 == r5.A02 && this.A06 == r5.A06 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((this.A00 * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A06 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A05 ? 1 : 0);
    }

    public AnonymousClass3KH(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = i;
        this.A04 = z;
        this.A02 = z2;
        this.A06 = z3;
        this.A03 = z4;
        this.A01 = z5;
        this.A05 = z6;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaDownloadLogData(mediaType=");
        A0u.append(this.A00);
        A0u.append(", isMidScan=");
        A0u.append(this.A04);
        A0u.append(", isFullImage=");
        A0u.append(this.A02);
        A0u.append(", isViewOnce=");
        A0u.append(this.A06);
        A0u.append(", isMediaAsDoc=");
        A0u.append(this.A03);
        A0u.append(", isCommunity=");
        A0u.append(this.A01);
        A0u.append(", isVideoHD=");
        return C36321k7.A0H(A0u, this.A05);
    }
}
