package X;

/* renamed from: X.68z  reason: invalid class name and case insensitive filesystem */
public class C1276168z {
    public final long A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((C1276168z) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return Long.valueOf(this.A00).hashCode();
    }

    public C1276168z(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Timestamp{timeInMillis=");
        A0u.append(this.A00);
        return AnonymousClass000.A0s(A0u);
    }
}
