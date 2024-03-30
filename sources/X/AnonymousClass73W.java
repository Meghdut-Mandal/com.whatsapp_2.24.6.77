package X;

/* renamed from: X.73W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73W implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ AnonymousClass6TQ A04;

    public /* synthetic */ AnonymousClass73W(AnonymousClass6TQ r1, double d, int i, long j, long j2) {
        this.A04 = r1;
        this.A01 = i;
        this.A00 = d;
        this.A02 = j;
        this.A03 = j2;
    }

    public final void run() {
        AnonymousClass6TQ r8 = this.A04;
        int i = this.A01;
        double d = this.A00;
        long j = this.A02;
        long j2 = this.A03;
        C1042258t A002 = AnonymousClass6TQ.A00(r8, i);
        A002.A01 = Double.valueOf(d);
        A002.A0G = Long.valueOf(j);
        A002.A0H = Long.valueOf(j2);
        synchronized (r8) {
            C224214g r2 = r8.A04;
            r2.A01 = 0;
            r2.A00 = 0;
            r2.A03();
        }
        AnonymousClass6TQ.A01(A002, r8);
    }
}
