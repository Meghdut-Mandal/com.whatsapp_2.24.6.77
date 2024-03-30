package X;

/* renamed from: X.5Ii  reason: invalid class name and case insensitive filesystem */
public final class C106095Ii extends C111415cF {
    public final int A00;
    public final AnonymousClass5V6 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106095Ii) {
                C106095Ii r5 = (C106095Ii) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public C106095Ii(AnonymousClass5V6 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IqError(error=");
        A0u.append(this.A01);
        A0u.append(", errorCode=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
