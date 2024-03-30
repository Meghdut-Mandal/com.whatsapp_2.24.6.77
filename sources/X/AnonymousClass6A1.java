package X;

/* renamed from: X.6A1  reason: invalid class name */
public final class AnonymousClass6A1 {
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6A1) {
                AnonymousClass6A1 r5 = (AnonymousClass6A1) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass6A1(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudioRouteState(audioRoute=");
        A0u.append(this.A00);
        A0u.append(", isBluetoothAvailable=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
