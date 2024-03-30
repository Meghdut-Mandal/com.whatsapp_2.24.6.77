package X;

/* renamed from: X.6Aq  reason: invalid class name and case insensitive filesystem */
public class C128046Aq {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C128046Aq)) {
            return false;
        }
        C128046Aq r4 = (C128046Aq) obj;
        return this.A01.equals(r4.A01) && this.A00 == r4.A00;
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00;
    }

    public C128046Aq(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01);
        A0u.append(":");
        return C36381kD.A10(A0u, this.A00);
    }
}
