package X;

/* renamed from: X.62N  reason: invalid class name */
public final class AnonymousClass62N {
    public long A00 = C133206Xf.A03;
    public final long A01;
    public final long A02;

    public AnonymousClass62N(long j, long j2, long j3) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("HistoricalChange(uptimeMillis=");
        A0u.append(this.A02);
        A0u.append(", position=");
        return AnonymousClass000.A0m(C133206Xf.A04(this.A01), A0u);
    }
}
