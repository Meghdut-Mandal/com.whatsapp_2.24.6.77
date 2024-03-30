package X;

/* renamed from: X.3Io  reason: invalid class name and case insensitive filesystem */
public class C63053Io {
    public final int A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C63053Io)) {
            return false;
        }
        C63053Io r7 = (C63053Io) obj;
        if (this.A02.equals(r7.A02) && this.A00 == r7.A00 && this.A01 == r7.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int A04 = C36421kH.A04(this.A02);
        int i = this.A00;
        return C36341k9.A02(this.A01, (A04 + (i ^ (i >>> 32))) * 31);
    }

    public C63053Io(String str, int i, long j) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A02);
        A0u.append(":");
        A0u.append(this.A00);
        A0u.append(":");
        A0u.append(this.A01);
        return AnonymousClass000.A0q(";", A0u);
    }
}
