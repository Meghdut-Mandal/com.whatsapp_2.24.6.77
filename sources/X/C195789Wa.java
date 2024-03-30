package X;

/* renamed from: X.9Wa  reason: invalid class name and case insensitive filesystem */
public final class C195789Wa {
    public int A00;
    public String A01;
    public String A02;
    public boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195789Wa) {
                C195789Wa r5 = (C195789Wa) obj;
                if (this.A00 != r5.A00 || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C53202qw.A00(this.A00 * 31, this.A03) + C36341k9.A09(this.A02)) * 31) + C36421kH.A05(this.A01);
    }

    public C195789Wa(String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CollectionStatus(reviewStatus=");
        A0u.append(this.A00);
        A0u.append(", appealable=");
        A0u.append(this.A03);
        A0u.append(", rejectReason=");
        A0u.append(this.A02);
        A0u.append(", policyUrl=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
