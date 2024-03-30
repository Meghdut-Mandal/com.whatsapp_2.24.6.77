package X;

/* renamed from: X.69r  reason: invalid class name and case insensitive filesystem */
public final class C1277969r {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1277969r) {
                C1277969r r5 = (C1277969r) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A01) + this.A00;
    }

    public C1277969r(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ARCapabilityMinVersionModel(capabilityName=");
        A0u.append(this.A01);
        A0u.append(", minVersion=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
