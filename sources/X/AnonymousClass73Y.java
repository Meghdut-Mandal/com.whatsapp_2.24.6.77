package X;

/* renamed from: X.73Y  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73Y implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C145346tk A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass73Y(C145346tk r1, String str, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = str;
        this.A03 = z;
        this.A04 = z2;
        this.A00 = i;
    }

    public final void run() {
        String str;
        C145346tk r6 = this.A01;
        String str2 = this.A02;
        boolean z = this.A03;
        boolean z2 = this.A04;
        int i = this.A00;
        String str3 = r6.A04;
        String str4 = r6.A03;
        if (z) {
            AnonymousClass1KT r1 = r6.A01;
            if (z2) {
                str = "forward_network_1_start";
            } else {
                str = "forward_network_start";
            }
            C90494aF.A0x(r1, str, i);
        }
        r6.A00.A01(str3, str4, str2).Blp(r6.A02);
    }
}
