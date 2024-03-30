package X;

/* renamed from: X.2MT  reason: invalid class name */
public final class AnonymousClass2MT extends C588831k {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2MT) {
                AnonymousClass2MT r5 = (AnonymousClass2MT) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass2MT(String str, int i) {
        super(C51862oV.HEADER);
        this.A01 = str;
        this.A00 = i;
    }

    public int hashCode() {
        return C36421kH.A04(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("HeaderItem(title=");
        A0u.append(this.A01);
        A0u.append(", count=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
