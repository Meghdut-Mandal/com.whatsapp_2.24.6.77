package X;

/* renamed from: X.3GW  reason: invalid class name */
public class AnonymousClass3GW {
    public final int A00;
    public final AnonymousClass3GJ A01;
    public final C600336f A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3GW r5 = (AnonymousClass3GW) obj;
            if (this.A03 != r5.A03 || !this.A02.equals(r5.A02) || !this.A01.equals(r5.A01) || this.A00 != r5.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, (((C36391kE.A0A(this.A02) + (this.A03 ? 1 : 0)) * 31) + this.A00) * 31);
    }

    public AnonymousClass3GW(AnonymousClass3GJ r1, C600336f r2, int i, boolean z) {
        this.A02 = r2;
        this.A03 = z;
        this.A01 = r1;
        this.A00 = i;
    }
}
