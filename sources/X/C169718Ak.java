package X;

/* renamed from: X.8Ak  reason: invalid class name and case insensitive filesystem */
public final class C169718Ak extends C169768Ap {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C169718Ak) && this.A00 == ((C169718Ak) obj).A00);
    }

    public C169718Ak(long j) {
        super(1, C023109s.A00);
        this.A00 = j;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PartialBattery(batteryPercent=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
