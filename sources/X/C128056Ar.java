package X;

/* renamed from: X.6Ar  reason: invalid class name and case insensitive filesystem */
public final class C128056Ar {
    public final int A00;
    public final int A01;
    public final C159897k6 A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128056Ar) {
                C128056Ar r5 = (C128056Ar) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A02) + this.A01) * 31) + this.A00;
    }

    public C128056Ar(C159897k6 r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParagraphIntrinsicInfo(intrinsics=");
        A0u.append(this.A02);
        A0u.append(", startIndex=");
        A0u.append(this.A01);
        A0u.append(", endIndex=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
