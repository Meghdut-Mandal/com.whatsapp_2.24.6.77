package X;

/* renamed from: X.9Vn  reason: invalid class name and case insensitive filesystem */
public final class C195679Vn {
    public boolean A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195679Vn) {
                C195679Vn r5 = (C195679Vn) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A01) + C36341k9.A01(this.A00 ? 1 : 0);
    }

    public C195679Vn(String str, boolean z) {
        this.A01 = str;
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StateCacheInfo(stateName=");
        A0u.append(this.A01);
        A0u.append(", isUIInitialized=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
