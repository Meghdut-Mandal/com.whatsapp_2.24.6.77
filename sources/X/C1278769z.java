package X;

/* renamed from: X.69z  reason: invalid class name and case insensitive filesystem */
public final class C1278769z {
    public final C61243Bc A00;
    public final C61243Bc A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1278769z) {
                C1278769z r5 = (C1278769z) obj;
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

    public C1278769z(C61243Bc r1, C61243Bc r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccessibilityProvider(contentDescription=");
        A0u.append(this.A01);
        A0u.append(", clickDescription=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
