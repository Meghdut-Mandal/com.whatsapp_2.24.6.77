package X;

/* renamed from: X.9WR  reason: invalid class name */
public final class AnonymousClass9WR {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9WR) {
                AnonymousClass9WR r5 = (AnonymousClass9WR) obj;
                if (!(this.A00 == r5.A00 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.A00;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.A03;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A01;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        if (!this.A02) {
            i = 0;
        }
        return i4 + i;
    }

    public AnonymousClass9WR(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NetworkState(isConnected=");
        A0u.append(this.A00);
        A0u.append(", isValidated=");
        A0u.append(this.A03);
        A0u.append(", isMetered=");
        A0u.append(this.A01);
        A0u.append(", isNotRoaming=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
