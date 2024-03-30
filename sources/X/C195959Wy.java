package X;

/* renamed from: X.9Wy  reason: invalid class name and case insensitive filesystem */
public final class C195959Wy {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195959Wy) {
                C195959Wy r5 = (C195959Wy) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || this.A00 != r5.A00 || this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36381kD.A08(this.A04, C36421kH.A04(this.A03)) + this.A00) * 31) + this.A01) * 31) + C36341k9.A09(this.A02);
    }

    public C195959Wy(String str, String str2, String str3, int i, int i2) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str3;
    }

    public String toString() {
        return this.A04;
    }
}
