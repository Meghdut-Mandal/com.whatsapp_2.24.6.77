package X;

/* renamed from: X.3Fv  reason: invalid class name and case insensitive filesystem */
public class C62353Fv {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C62353Fv r4 = (C62353Fv) obj;
            if (this.A00.equals(r4.A00)) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return C36421kH.A04(this.A00) + this.A01.hashCode();
    }

    public C62353Fv(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
