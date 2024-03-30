package X;

/* renamed from: X.3JC  reason: invalid class name */
public final class AnonymousClass3JC {
    public final AnonymousClass3HW A00;
    public final AnonymousClass3HW A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JC) {
                AnonymousClass3JC r5 = (AnonymousClass3JC) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A00) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36421kH.A05(this.A02);
    }

    public AnonymousClass3JC(AnonymousClass3HW r1, AnonymousClass3HW r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkedAccountMediaResponse(fbLinkedAccountMedia=");
        A0u.append(this.A00);
        A0u.append(", igLinkedAccountMedia=");
        A0u.append(this.A01);
        A0u.append(", igAccountName=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
