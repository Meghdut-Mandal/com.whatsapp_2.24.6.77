package X;

/* renamed from: X.6BK  reason: invalid class name */
public final class AnonymousClass6BK {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BK) {
                AnonymousClass6BK r5 = (AnonymousClass6BK) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C53202qw.A00(C36341k9.A01(this.A02 ? 1 : 0) * 31, this.A01) + C36341k9.A01(this.A00 ? 1 : 0);
    }

    public AnonymousClass6BK(boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = z3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallLogData(isVoiceChat=");
        A0u.append(this.A02);
        A0u.append(", isLonelyState=");
        A0u.append(this.A01);
        A0u.append(", isGroupCall=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
