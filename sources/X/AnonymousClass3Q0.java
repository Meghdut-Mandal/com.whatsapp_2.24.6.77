package X;

/* renamed from: X.3Q0  reason: invalid class name */
public final class AnonymousClass3Q0 {
    public int A00;
    public int A01;
    public AnonymousClass3QN A02;

    public AnonymousClass3Q0() {
        this((AnonymousClass3QN) null, (C05250Oz) null, 0, 0, 7);
    }

    public /* synthetic */ AnonymousClass3Q0(AnonymousClass3QN r9, C05250Oz r10, int i, int i2, int i3) {
        AnonymousClass3QN r0 = new AnonymousClass3QN("", 0, 0, 0, false, false);
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = r0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3Q0) {
                AnonymousClass3Q0 r5 = (AnonymousClass3Q0) obj;
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

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupTrustSignalData(commonGroupSize=");
        A0u.append(this.A00);
        A0u.append(", highlightGroupType=");
        A0u.append(this.A01);
        A0u.append(", info=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
