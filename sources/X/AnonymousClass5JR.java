package X;

/* renamed from: X.5JR  reason: invalid class name */
public final class AnonymousClass5JR extends AnonymousClass62A {
    public final C127886Aa A00;
    public final C127886Aa A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5JR) {
                AnonymousClass5JR r5 = (AnonymousClass5JR) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public AnonymousClass5JR(C127886Aa r1, C127886Aa r2) {
        super(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NestedChipVariant(leftIcon=");
        A0u.append(this.A00);
        A0u.append(", rightIcon=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
