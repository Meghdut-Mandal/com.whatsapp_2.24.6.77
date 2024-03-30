package X;

/* renamed from: X.3JD  reason: invalid class name */
public final class AnonymousClass3JD {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JD) {
                AnonymousClass3JD r5 = (AnonymousClass3JD) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C36341k9.A01(this.A02 ? 1 : 0) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + this.A00;
    }

    public AnonymousClass3JD(int i, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaReceiveLogData(isLargeDoc=");
        A0u.append(this.A02);
        A0u.append(", isCommunity=");
        A0u.append(this.A01);
        A0u.append(", origin=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
