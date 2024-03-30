package X;

/* renamed from: X.5Jk  reason: invalid class name and case insensitive filesystem */
public class C106365Jk extends C132056Ry {
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C132056Ry r5 = (C132056Ry) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[type: ");
        A0u.append(this.A00);
        A0u.append(", data: ");
        A0u.append(this.A01);
        return C90474aD.A0g(A0u);
    }

    public C106365Jk(Object obj, int i) {
        super(obj, i);
    }
}
