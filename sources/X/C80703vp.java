package X;

/* renamed from: X.3vp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80703vp implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C79593ty A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ C80703vp(C79593ty r1, Integer num, String str, String str2, String str3, int i) {
        this.A01 = r1;
        this.A02 = num;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = i;
    }

    public final void run() {
        C79593ty r3 = this.A01;
        Integer num = this.A02;
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A05;
        int i = this.A00;
        AnonymousClass00C.A0D(r3, 0);
        r3.A0C(new C63353Js(Integer.valueOf(i), str, str2, str3, num.intValue()));
    }
}
