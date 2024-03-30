package X;

/* renamed from: X.6DG  reason: invalid class name */
public final class AnonymousClass6DG {
    public final C160427kz A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DG) {
                AnonymousClass6DG r5 = (AnonymousClass6DG) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C36381kD.A08(this.A02, C36421kH.A04(this.A01)) + C36341k9.A09(this.A03)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36411kG.A09(this.A00)) * 31) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public AnonymousClass6DG(C160427kz r1, String str, String str2, String str3, boolean z, boolean z2) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = z;
        this.A00 = r1;
        this.A04 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PslDownloadData(flowId=");
        A0u.append(this.A01);
        A0u.append(", pslCdnUrl=");
        A0u.append(this.A02);
        A0u.append(", pslSignature=");
        A0u.append(this.A03);
        A0u.append(", isDraft=");
        A0u.append(this.A05);
        A0u.append(", fetchAssetCallback=");
        A0u.append(this.A00);
        A0u.append(", endMarkerWhenDownloadComplete=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
