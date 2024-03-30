package X;

/* renamed from: X.888  reason: invalid class name */
public final class AnonymousClass888 extends C53062qe {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass888) {
                AnonymousClass888 r5 = (AnonymousClass888) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((C36341k9.A01(this.A02 ? 1 : 0) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + 1237) * 31) + 65851;
    }

    public AnonymousClass888(Integer num, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkedAppConfig(useBle=");
        A0u.append(this.A02);
        A0u.append(", enableFBPermissionService=");
        A0u.append(this.A01);
        C90474aD.A1N(A0u, ", elevateLogLevel=");
        A0u.append(", transportType=");
        return C36321k7.A0E("BLE", A0u);
    }
}
