package X;

/* renamed from: X.6Au  reason: invalid class name and case insensitive filesystem */
public final class C128086Au {
    public final int A00;
    public final int A01;
    public final String A02;

    public C128086Au(String str, int i, int i2) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128086Au) {
                C128086Au r5 = (C128086Au) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36421kH.A04(this.A02) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SystemIdInfo(workSpecId=");
        A0u.append(this.A02);
        A0u.append(", generation=");
        A0u.append(this.A00);
        A0u.append(", systemId=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
