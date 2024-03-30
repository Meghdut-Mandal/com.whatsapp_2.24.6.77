package X;

/* renamed from: X.6AC  reason: invalid class name */
public final class AnonymousClass6AC {
    public final C161307mX A00;
    public final C129196Ft A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AC) {
                AnonymousClass6AC r5 = (AnonymousClass6AC) obj;
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

    public AnonymousClass6AC(C161307mX r1, C129196Ft r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ExpressionsTrayShapeData(shape=");
        A0u.append(this.A01);
        A0u.append(", shapeCreator=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
