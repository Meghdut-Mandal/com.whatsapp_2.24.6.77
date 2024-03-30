package X;

/* renamed from: X.9Wc  reason: invalid class name and case insensitive filesystem */
public final class C195809Wc {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195809Wc) {
                C195809Wc r5 = (C195809Wc) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass000.A0H(this.A00) * 31) + C36341k9.A09(this.A01)) * 31) + C36421kH.A05(this.A02)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public C195809Wc(Long l, String str, String str2, boolean z) {
        this.A00 = l;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TrustSignalData(joinedDate=");
        A0u.append(this.A00);
        A0u.append(", fbFollowerCount=");
        A0u.append(this.A01);
        A0u.append(", igFollowerCount=");
        A0u.append(this.A02);
        A0u.append(", showCatalog=");
        return C36321k7.A0H(A0u, this.A03);
    }
}
