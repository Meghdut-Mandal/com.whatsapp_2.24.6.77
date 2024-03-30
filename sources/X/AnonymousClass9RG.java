package X;

/* renamed from: X.9RG  reason: invalid class name */
public class AnonymousClass9RG {
    public final double A00;
    public final double A01;
    public final long A02;

    public AnonymousClass9RG(double d, double d2, long j) {
        this.A01 = d;
        this.A00 = d2;
        this.A02 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FrameRateData{small=");
        A0u.append(this.A01);
        A0u.append(", large=");
        A0u.append(this.A00);
        A0u.append(", timeSpent=");
        A0u.append(this.A02);
        return AnonymousClass000.A0s(A0u);
    }
}
