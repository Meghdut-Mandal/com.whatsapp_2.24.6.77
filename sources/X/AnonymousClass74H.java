package X;

/* renamed from: X.74H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass74H implements Runnable {
    public final /* synthetic */ C128786Dp A00;
    public final /* synthetic */ AnonymousClass5GE A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public /* synthetic */ AnonymousClass74H(C128786Dp r1, AnonymousClass5GE r2, Boolean bool, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5) {
        this.A01 = r2;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = r1;
        this.A08 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A05 = l;
        this.A04 = num;
        this.A02 = bool;
        this.A03 = num2;
    }

    public final void run() {
        AnonymousClass5GE r4 = this.A01;
        String str = this.A06;
        String str2 = this.A07;
        C128786Dp r3 = this.A00;
        String str3 = this.A08;
        String str4 = this.A09;
        String str5 = this.A0A;
        Long l = this.A05;
        Integer num = this.A04;
        Boolean bool = this.A02;
        Integer num2 = this.A03;
        C36321k7.A0x(str, str2);
        AnonymousClass1EU r0 = r4.A04;
        AnonymousClass1EU.A00(r0);
        C207249un A012 = AnonymousClass16S.A01(str, r0.A06.A0A());
        if (A012 != null) {
            r4.A02.A0H(new AnonymousClass74G(A012, r3, r4, bool, num, num2, l, str2, str3, str4, str5));
        }
    }
}
