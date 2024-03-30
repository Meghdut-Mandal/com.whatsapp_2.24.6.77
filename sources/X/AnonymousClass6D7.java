package X;

/* renamed from: X.6D7  reason: invalid class name */
public class AnonymousClass6D7 {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public String A04 = "";
    public String A05 = "";

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6D7 r7 = (AnonymousClass6D7) obj;
            if (!(this.A03 == r7.A03 && this.A00 == r7.A00 && this.A02 == r7.A02 && this.A01 == r7.A01 && this.A05.equals(r7.A05) && this.A04.equals(r7.A04))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        C90474aD.A1S(objArr, this.A03);
        C36421kH.A1P(objArr, this.A00);
        C36361kB.A1W(objArr, this.A02);
        objArr[3] = Long.valueOf(this.A01);
        objArr[4] = this.A05;
        return AnonymousClass000.A0M(this.A04, objArr, 5);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("startReadTimeUs:");
        A0u.append(this.A03);
        A0u.append("\nendReadTimeUs:");
        A0u.append(this.A00);
        A0u.append("\nframeBeforeStartReadTimeUs:");
        A0u.append(this.A02);
        A0u.append("\nframeAfterEndReadTimeUs:");
        A0u.append(this.A01);
        A0u.append("\ntrackInfoMap:");
        A0u.append(this.A05);
        A0u.append("\nexceptions:");
        return AnonymousClass000.A0q(this.A04, A0u);
    }
}
