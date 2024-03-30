package X;

/* renamed from: X.6BS  reason: invalid class name */
public final class AnonymousClass6BS {
    public final Object A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BS) {
                AnonymousClass6BS r5 = (AnonymousClass6BS) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36381kD.A08(this.A02, C36421kH.A04(this.A01)));
    }

    public AnonymousClass6BS(Object obj, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsInputDialogParams(inputName=");
        A0u.append(this.A01);
        A0u.append(", inputType=");
        A0u.append(this.A02);
        A0u.append(", value=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
