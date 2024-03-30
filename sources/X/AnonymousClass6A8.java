package X;

/* renamed from: X.6A8  reason: invalid class name */
public final class AnonymousClass6A8 {
    public Integer A00 = null;
    public Integer A01 = null;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6A8) {
                AnonymousClass6A8 r5 = (AnonymousClass6A8) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A00) * 31) + C36411kG.A09(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MultiDestinationStateInfo(fbState=");
        A0u.append(this.A00);
        A0u.append(", igState=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
