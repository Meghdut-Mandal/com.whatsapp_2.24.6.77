package X;

/* renamed from: X.6Dg  reason: invalid class name and case insensitive filesystem */
public final class C128696Dg {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128696Dg) {
                C128696Dg r5 = (C128696Dg) obj;
                if (!AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A04, r5.A04) || this.A00 != r5.A00 || this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A08 = C36381kD.A08(this.A05, C36381kD.A08(this.A06, C36421kH.A04(this.A07)));
        return C90504aG.A0B(this.A02, C36381kD.A08(this.A03, (((C36381kD.A08(this.A04, A08) + this.A00) * 31) + this.A01) * 31));
    }

    public C128696Dg(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        this.A07 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str5;
        this.A02 = str6;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Mask3DAsset(identifier=");
        A0u.append(this.A07);
        A0u.append(", fileName=");
        A0u.append(this.A06);
        A0u.append(", uri=");
        A0u.append(this.A05);
        A0u.append(", md5Hash=");
        A0u.append(this.A04);
        A0u.append(", fileSizeBytes=");
        A0u.append(this.A00);
        A0u.append(", uncompressedFileSizeBytes=");
        A0u.append(this.A01);
        A0u.append(", compressionType=");
        A0u.append(this.A03);
        A0u.append(", cacheKey=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
