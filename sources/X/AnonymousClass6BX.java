package X;

/* renamed from: X.6BX  reason: invalid class name */
public final class AnonymousClass6BX {
    public final Boolean A00;
    public final Integer A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BX) {
                AnonymousClass6BX r5 = (AnonymousClass6BX) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A02) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36411kG.A09(this.A01);
    }

    public AnonymousClass6BX(Boolean bool, Integer num, Long l) {
        this.A02 = l;
        this.A00 = bool;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PickerData(hdToggleChange=");
        A0u.append(this.A02);
        A0u.append(", hdToggleEligible=");
        A0u.append(this.A00);
        A0u.append(", hdToggleState=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
