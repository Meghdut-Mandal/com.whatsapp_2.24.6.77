package X;

/* renamed from: X.8Aa  reason: invalid class name and case insensitive filesystem */
public final class C169618Aa extends C169758Ao {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C169618Aa) && this.A00 == ((C169618Aa) obj).A00);
    }

    public C169618Aa(long j) {
        super(1, C023109s.A01);
        this.A00 = j;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LowBattery(batteryPercent=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
