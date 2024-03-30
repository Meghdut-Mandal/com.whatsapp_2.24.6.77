package X;

/* renamed from: X.9Vu  reason: invalid class name and case insensitive filesystem */
public final class C195749Vu {
    public final C188208zD A00;
    public final C188198zC A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195749Vu) {
                C195749Vu r5 = (C195749Vu) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
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

    public C195749Vu(C188208zD r1, C188198zC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PasskeyCreateError(kind=");
        A0u.append(this.A01);
        A0u.append(", remedy=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
