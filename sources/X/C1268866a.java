package X;

/* renamed from: X.66a  reason: invalid class name and case insensitive filesystem */
public class C1268866a {
    public final String A00;
    public final C128046Aq A01;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1268866a)) {
            return false;
        }
        C1268866a r4 = (C1268866a) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }

    public C1268866a(String str, C128046Aq r2) {
        this.A00 = str;
        this.A01 = r2;
    }
}
