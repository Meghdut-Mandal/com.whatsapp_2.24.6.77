package X;

public final /* synthetic */ class AVj implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass88P A03;
    public final /* synthetic */ Object A04;

    public /* synthetic */ AVj(AnonymousClass88P r1, Object obj, int i, int i2, int i3) {
        this.A03 = r1;
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void run() {
        AnonymousClass88P r5 = this.A03;
        Object obj = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        r5.A06((C23012B0d) obj, i);
        boolean z = r5.A0A;
        int i4 = r5.A00;
        r5.A03 = i2;
        r5.A02 = i3;
        r5.A04 = 0;
        r5.A05 = 0;
        r5.A01 = 0;
        r5.A0B = false;
        r5.A0A = z;
        r5.A00 = i4;
        AnonymousClass88P.A00(r5);
    }
}
