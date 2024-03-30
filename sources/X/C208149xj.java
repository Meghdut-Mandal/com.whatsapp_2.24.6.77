package X;

/* renamed from: X.9xj  reason: invalid class name and case insensitive filesystem */
public final class C208149xj implements B5N {
    public final AnonymousClass1R6 A00;
    public final C198599dq A01;
    public final C198609dr A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
                C208149xj r5 = (C208149xj) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A02, C36391kE.A0A(this.A00)));
    }

    public C208149xj(AnonymousClass1R6 r4, C198599dq r5, C198609dr r6) {
        C36321k7.A0z(r6, r5);
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
        int i = r4.A02;
        int i2 = r4.A01;
        if (i - i2 == 0 && r4.A00 - r4.A03 == 0) {
            throw AnonymousClass001.A08("Bounds must be non zero");
        } else if (i2 != 0 && r4.A03 != 0) {
            throw AnonymousClass001.A08("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("HardwareFoldingFeature");
        A0u.append(" { ");
        A0u.append(this.A00);
        A0u.append(", type=");
        A0u.append(this.A02);
        A0u.append(", state=");
        A0u.append(this.A01);
        return AnonymousClass000.A0q(" }", A0u);
    }
}
