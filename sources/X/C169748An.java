package X;

/* renamed from: X.8An  reason: invalid class name and case insensitive filesystem */
public final class C169748An extends C169768Ap {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C169748An) && this.A00 == ((C169748An) obj).A00);
    }

    public C169748An(long j) {
        super(1, C023109s.A00);
        this.A00 = j;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FullBattery(batteryPercent=");
        return C36331k8.A0j(A0u, this.A00);
    }

    public C169748An() {
        this(100);
    }
}
