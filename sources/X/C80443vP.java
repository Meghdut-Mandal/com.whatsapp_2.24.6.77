package X;

/* renamed from: X.3vP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80443vP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C30521aL A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C80443vP(C30521aL r1, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void run() {
        C30521aL r5 = this.A01;
        int i = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        if (i == 0 && z) {
            r5.A0M.A00();
        }
        r5.A09.A01(new C35231iM(10, (Object) r5, z2), 14);
        if (!z2) {
            r5.A01.A0I(new C35731jA((Object) r5, 23), 2000);
        }
    }
}
