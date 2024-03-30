package X;

/* renamed from: X.3J2  reason: invalid class name */
public final class AnonymousClass3J2 {
    public final Integer A00;
    public final Integer A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3J2) {
                AnonymousClass3J2 r5 = (AnonymousClass3J2) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A01) * 31) + C36411kG.A09(this.A00)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass3J2(Integer num, Integer num2, boolean z) {
        this.A01 = num;
        this.A00 = num2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ErrorState(messageResId=");
        A0u.append(this.A01);
        A0u.append(", dialogCode=");
        A0u.append(this.A00);
        A0u.append(", shouldDismiss=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
