package X;

/* renamed from: X.69E  reason: invalid class name */
public final class AnonymousClass69E {
    public float A00;
    public long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69E) {
                AnonymousClass69E r8 = (AnonymousClass69E) obj;
                if (!(this.A01 == r8.A01 && Float.compare(this.A00, r8.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90464aC.A08(this.A01), this.A00);
    }

    public AnonymousClass69E(float f, long j) {
        this.A01 = j;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DataPointAtTime(time=");
        A0u.append(this.A01);
        A0u.append(", dataPoint=");
        return C90464aC.A0g(A0u, this.A00);
    }
}
