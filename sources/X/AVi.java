package X;

public final /* synthetic */ class AVi implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass17S A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AVi(AnonymousClass17S r1, String str, int i, long j) {
        this.A02 = r1;
        this.A03 = str;
        this.A01 = j;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass17S r0 = this.A02;
        String str = this.A03;
        long j = this.A01;
        int i = this.A00;
        AnonymousClass183 r2 = r0.A09;
        AnonymousClass00C.A0D(str, 0);
        r2.A00.put(str, new C199699fo(j, i));
    }
}
