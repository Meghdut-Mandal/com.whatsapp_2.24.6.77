package X;

/* renamed from: X.5Kg  reason: invalid class name */
public final class AnonymousClass5Kg extends C1268665y {
    public final int A00;
    public final AnonymousClass68B A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Kg) {
                AnonymousClass5Kg r5 = (AnonymousClass5Kg) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, C36421kH.A04(this.A02)) + this.A00;
    }

    public AnonymousClass5Kg(AnonymousClass68B r1, String str, int i) {
        super(r1);
        this.A02 = str;
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Downloading(packId=");
        A0u.append(this.A02);
        A0u.append(", pack=");
        A0u.append(this.A01);
        A0u.append(", progress=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
