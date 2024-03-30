package X;

/* renamed from: X.73X  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73X implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1BS A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ AnonymousClass73X(AnonymousClass1BS r1, String str, String str2, String str3, int i) {
        this.A01 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass1BS r3 = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        String str3 = this.A04;
        int i = this.A00;
        AnonymousClass1BS.A09(r3);
        synchronized (r3.A0J) {
            if (r3.A0B() != null) {
                AnonymousClass1BS.A00(r3, str, str2, str3, i, false).A00(new C139076jC(r3, 1));
            }
        }
    }
}
