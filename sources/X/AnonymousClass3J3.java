package X;

/* renamed from: X.3J3  reason: invalid class name */
public final class AnonymousClass3J3 {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3J3) {
                AnonymousClass3J3 r5 = (AnonymousClass3J3) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass3J3(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PushToVideoSendingEnabledDefaultInfo(sendsThreshold=");
        A0u.append(this.A01);
        A0u.append(", durationThresholdSeconds=");
        A0u.append(this.A00);
        A0u.append(", sendingEnabled=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
