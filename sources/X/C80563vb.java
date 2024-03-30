package X;

/* renamed from: X.3vb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80563vb implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C25261Fp A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C80563vb(C25261Fp r1, Integer num, String str, String str2, int i) {
        this.A01 = r1;
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
        this.A02 = num;
    }

    public final void run() {
        C25261Fp r6 = this.A01;
        String str = this.A03;
        int i = this.A00;
        String str2 = this.A04;
        Integer num = this.A02;
        C45432Ri r2 = new C45432Ri();
        r2.A05 = C18750th.A05(str);
        r2.A04 = Long.valueOf(C19970wo.A00(r6.A00));
        r2.A00 = C36361kB.A0i();
        r2.A01 = Integer.valueOf(i);
        r2.A02 = C36361kB.A0j();
        if (str2 != null) {
            r2.A06 = r6.A02.A03(str2);
        }
        r2.A03 = num;
        r6.A01.Bly(r2);
    }
}
