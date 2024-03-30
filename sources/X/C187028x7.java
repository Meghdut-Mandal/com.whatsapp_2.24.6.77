package X;

/* renamed from: X.8x7  reason: invalid class name and case insensitive filesystem */
public final class C187028x7 extends C187038x8 {
    public final Throwable A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C187028x7) {
                C187028x7 r5 = (C187028x7) obj;
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

    public C187028x7(Object obj, Throwable th) {
        this.A01 = obj;
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Exception(request=");
        A0u.append(this.A01);
        A0u.append(", error=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
