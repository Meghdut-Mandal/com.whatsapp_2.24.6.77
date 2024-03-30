package X;

/* renamed from: X.71d  reason: invalid class name and case insensitive filesystem */
public final class C1494171d implements C160227kf {
    public final /* synthetic */ C158077fl A00;
    public final /* synthetic */ C158077fl A01;
    public final /* synthetic */ AnonymousClass5PE A02;
    public final /* synthetic */ C121955tz A03;
    public final /* synthetic */ Object A04;

    public C1494171d(C158077fl r1, C158077fl r2, AnonymousClass5PE r3, C121955tz r4, Object obj) {
        this.A02 = r3;
        this.A04 = obj;
        this.A01 = r1;
        this.A03 = r4;
        this.A00 = r2;
    }

    public void BVK() {
        AnonymousClass3TI.A00("UnlinkActionIqHelper/Iq delivery fail");
        C1498172w.A00(this.A02.A00, this.A04, this.A00, 35);
    }

    public void BWl(Exception exc, Integer num) {
        StringBuilder A0i = C36341k9.A0i(exc);
        A0i.append("UnlinkActionIqHelper/Iq sent error with code ");
        A0i.append(num);
        AnonymousClass3TI.A02(AnonymousClass000.A0t(A0i, ' '), exc);
        C1498172w.A00(this.A02.A00, this.A04, this.A00, 35);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (AnonymousClass000.A1X(obj)) {
            AnonymousClass5PE r5 = this.A02;
            r5.A00.Bp3(new AnonymousClass73N(this.A04, this.A01, this.A03, r5, 18));
        }
    }
}
