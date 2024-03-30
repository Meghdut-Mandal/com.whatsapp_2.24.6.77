package X;

/* renamed from: X.9RP  reason: invalid class name */
public class AnonymousClass9RP {
    public final long A00;
    public final long A01;
    public final long A02;

    public AnonymousClass9RP(long j, long j2, long j3) {
        this.A02 = j;
        this.A00 = j2;
        this.A01 = j3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StageStats{duration=");
        A0u.append(this.A02);
        A0u.append(", dbReadsCount=");
        A0u.append(this.A00);
        A0u.append(", dbWritesCount=");
        A0u.append(this.A01);
        return AnonymousClass000.A0s(A0u);
    }
}
