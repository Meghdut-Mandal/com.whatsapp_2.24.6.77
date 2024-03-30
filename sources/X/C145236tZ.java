package X;

/* renamed from: X.6tZ  reason: invalid class name and case insensitive filesystem */
public final class C145236tZ implements C160427kz {
    public final /* synthetic */ C128716Di A00;
    public final /* synthetic */ C133316Xv A01;
    public final /* synthetic */ AnonymousClass6E7 A02;
    public final /* synthetic */ C159657ji A03;

    public C145236tZ(C133316Xv r1, AnonymousClass6E7 r2, C128716Di r3, C159657ji r4) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = r4;
    }

    public void BQX() {
        C133316Xv r4 = this.A01;
        C26551Kp r3 = r4.A0K;
        String str = this.A02.A05;
        r3.A05(str.hashCode(), 105);
        C133316Xv.A05(r4, this.A03, "Download aborted", str);
    }

    public /* bridge */ /* synthetic */ void BWm(Integer num) {
        C133316Xv r4 = this.A01;
        C26551Kp r3 = r4.A0K;
        String str = this.A02.A05;
        r3.A05(str.hashCode(), 3);
        C133316Xv.A05(r4, this.A03, "Download failed", str);
    }

    public /* bridge */ /* synthetic */ void BjA(Integer num) {
        C133316Xv r4 = this.A01;
        C26551Kp r3 = r4.A0K;
        String str = this.A02.A05;
        r3.A05(str.hashCode(), 3);
        C133316Xv.A05(r4, this.A03, "Download timed out", str);
    }

    public void onSuccess() {
        C133316Xv r3 = this.A01;
        C26501Kk r2 = r3.A0G;
        AnonymousClass6E7 r6 = this.A02;
        String str = r6.A05;
        r2.A00(str, str.hashCode()).A0A(new C165007sj(r3, this.A03, this.A00, r6, 2));
    }
}
