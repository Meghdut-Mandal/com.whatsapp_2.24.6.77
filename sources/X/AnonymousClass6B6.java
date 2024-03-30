package X;

/* renamed from: X.6B6  reason: invalid class name */
public final class AnonymousClass6B6 {
    public final C51092nG A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6B6) {
                AnonymousClass6B6 r5 = (AnonymousClass6B6) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36381kD.A08(this.A02, C36421kH.A04(this.A01)) + AnonymousClass000.A0H(this.A00);
    }

    public AnonymousClass6B6(C51092nG r1, String str, String str2) {
        C36321k7.A0x(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BlockReason(code=");
        A0u.append(this.A01);
        A0u.append(", reason=");
        A0u.append(this.A02);
        A0u.append(", messageType=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
