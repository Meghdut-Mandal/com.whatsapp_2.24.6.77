package X;

/* renamed from: X.9W4  reason: invalid class name */
public final class AnonymousClass9W4 {
    public final int A00;
    public final String A01;
    public final AUN A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9W4)) {
            return false;
        }
        AnonymousClass9W4 r4 = (AnonymousClass9W4) obj;
        return this.A01.equals(r4.A01) && this.A00 == r4.A00 && this.A02.equals(r4.A02);
    }

    public AnonymousClass9W4(AUN aun, String str, int i) {
        if (i < 0) {
            throw AnonymousClass001.A08("Start index must be >= 0.");
        } else if (str != null) {
            this.A00 = i;
            this.A01 = str;
            this.A02 = aun;
        } else {
            throw null;
        }
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, this.A00);
        A1Q[1] = this.A01;
        return C90484aE.A0D(this.A02, A1Q);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PhoneNumberMatch [");
        int i = this.A00;
        A0u.append(i);
        A0u.append(",");
        String str = this.A01;
        A0u.append(i + str.length());
        return AnonymousClass000.A0p(") ", str, A0u);
    }
}
