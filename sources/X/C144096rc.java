package X;

/* renamed from: X.6rc  reason: invalid class name and case insensitive filesystem */
public final class C144096rc implements C16260os {
    public final C16250or A00;
    public final C61243Bc A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C144096rc) {
                C144096rc r5 = (C144096rc) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public C144096rc(C16250or r1, C61243Bc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Visible(textProvider=");
        A0u.append(this.A01);
        A0u.append(", buttonState=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
