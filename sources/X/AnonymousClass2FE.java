package X;

/* renamed from: X.2FE  reason: invalid class name */
public final class AnonymousClass2FE extends C53642re {
    public final int A00;
    public final int A01;
    public final C51452nq A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2FE) {
                AnonymousClass2FE r5 = (AnonymousClass2FE) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public AnonymousClass2FE(C51452nq r1, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CommunityAlmostFull(requestedCount=");
        A0u.append(this.A01);
        A0u.append(", actualCount=");
        A0u.append(this.A00);
        A0u.append(", attemptedAction=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
