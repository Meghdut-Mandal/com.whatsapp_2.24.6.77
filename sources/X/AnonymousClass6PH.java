package X;

/* renamed from: X.6PH  reason: invalid class name */
public final class AnonymousClass6PH {
    public static final AnonymousClass6PH A03 = new AnonymousClass6PH((Integer) null, "NOT_CATCHABLE_ERROR", (String) null);
    public final Integer A00;
    public final String A01;
    public final String A02;

    public AnonymousClass6PH(Integer num, String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A00 = num;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PH) {
                AnonymousClass6PH r5 = (AnonymousClass6PH) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36421kH.A04(this.A02) + AnonymousClass000.A0H(this.A00)) * 31) + C36421kH.A05(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A02);
        A0u.append(" (");
        A0u.append(this.A00);
        A0u.append("): ");
        return AnonymousClass000.A0q(this.A01, A0u);
    }
}
