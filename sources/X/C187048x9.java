package X;

/* renamed from: X.8x9  reason: invalid class name and case insensitive filesystem */
public final class C187048x9 extends C1902597m {
    public final Object A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C187048x9) {
                C187048x9 r5 = (C187048x9) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + C36411kG.A09(this.A00);
    }

    public C187048x9(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(request=");
        A0u.append(this.A01);
        A0u.append(", response=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
