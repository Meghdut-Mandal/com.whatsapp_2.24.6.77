package X;

/* renamed from: X.6CH  reason: invalid class name */
public final class AnonymousClass6CH {
    public boolean A00 = false;
    public boolean A01 = false;
    public boolean A02 = false;
    public boolean A03 = false;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CH) {
                AnonymousClass6CH r5 = (AnonymousClass6CH) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((C36341k9.A01(this.A01 ? 1 : 0) * 31) + C36341k9.A01(this.A00 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IncomingCallNotificationState(dndModeEnabled=");
        A0u.append(this.A01);
        A0u.append(", callNotificationDisabled=");
        A0u.append(this.A00);
        A0u.append(", waAppNotificationDisabled=");
        A0u.append(this.A03);
        A0u.append(", lgcNotificationDisabled=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
