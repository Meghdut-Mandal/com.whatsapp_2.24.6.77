package X;

/* renamed from: X.6EZ  reason: invalid class name */
public class AnonymousClass6EZ {
    public final int A00;
    public final int A01;
    public final String A02;

    public String[] A00() {
        return new String[]{this.A02, String.valueOf(this.A01), String.valueOf(this.A00)};
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass6EZ)) {
            return false;
        }
        AnonymousClass6EZ r4 = (AnonymousClass6EZ) obj;
        return this.A02.equals(r4.A02) && this.A01 == r4.A01 && this.A00 == r4.A00;
    }

    public int hashCode() {
        return ((C36421kH.A04(this.A02) + this.A00) * 31) + this.A01;
    }

    public AnonymousClass6EZ(String str, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(AnonymousClass14B.A0B(this.A02, 4));
        A0u.append(":");
        A0u.append(this.A00);
        A0u.append(":");
        return C36381kD.A10(A0u, this.A01);
    }
}
