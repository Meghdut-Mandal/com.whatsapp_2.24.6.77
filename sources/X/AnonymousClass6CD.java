package X;

/* renamed from: X.6CD  reason: invalid class name */
public final class AnonymousClass6CD {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CD) {
                AnonymousClass6CD r5 = (AnonymousClass6CD) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A00 * 31) + this.A01) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass6CD(int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PipState(deviceRotation=");
        A0u.append(this.A00);
        A0u.append(", participantCount=");
        A0u.append(this.A01);
        A0u.append(", shouldShowSSPipIndicator=");
        A0u.append(this.A03);
        A0u.append(", shouldShowParticipantCount=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
