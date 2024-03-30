package X;

/* renamed from: X.6DI  reason: invalid class name */
public final class AnonymousClass6DI {
    public final int A00;
    public final Long A01;
    public final Long A02;
    public final Long A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DI) {
                AnonymousClass6DI r5 = (AnonymousClass6DI) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C36381kD.A08(this.A05, C36421kH.A04(this.A04)) + AnonymousClass000.A0H(this.A01)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A03)) * 31) + this.A00;
    }

    public AnonymousClass6DI(Long l, Long l2, Long l3, String str, String str2, int i) {
        this.A04 = str;
        this.A05 = str2;
        this.A01 = l;
        this.A02 = l2;
        this.A03 = l3;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsDatePickerInputParams(inputName=");
        A0u.append(this.A04);
        A0u.append(", inputType=");
        A0u.append(this.A05);
        A0u.append(", initialTsInMillis=");
        A0u.append(this.A01);
        A0u.append(", maxTsInMillis=");
        A0u.append(this.A02);
        A0u.append(", minTsInMillis=");
        A0u.append(this.A03);
        A0u.append(", flowsDatePickerMode=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
