package X;

/* renamed from: X.6Bb  reason: invalid class name and case insensitive filesystem */
public final class C128146Bb {
    public final int A00;
    public final int A01;
    public final C134856bi A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128146Bb) {
                C128146Bb r5 = (C128146Bb) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && AnonymousClass00C.A0J(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }

    public C128146Bb(C134856bi r1, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Args(disclosureId=");
        A0u.append(this.A00);
        A0u.append(", promptIndex=");
        A0u.append(this.A01);
        A0u.append(", prompt=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
