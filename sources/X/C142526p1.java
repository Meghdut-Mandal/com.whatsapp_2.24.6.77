package X;

/* renamed from: X.6p1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C142526p1 implements AnonymousClass7fP {
    public final /* synthetic */ AnonymousClass01L A00;
    public final /* synthetic */ AnonymousClass7fP A01;
    public final /* synthetic */ C132666Ut A02;

    public /* synthetic */ C142526p1(AnonymousClass01L r1, AnonymousClass7fP r2, C132666Ut r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void B5t(boolean z) {
        C132666Ut r4 = this.A02;
        AnonymousClass01L r3 = this.A00;
        AnonymousClass7fP r2 = this.A01;
        AnonymousClass3TI.A01(C36371kC.A0z("WfalLauncherProxy/launchInternal/callback: isLaunched:", AnonymousClass000.A0u(), z));
        r4.A00 = true;
        r4.A01.A02();
        AnonymousClass00C.A0D("WfalLauncherProxy/onLoadingAttemptComplete", 0);
        if (!z) {
            C132666Ut.A00(r3, r4);
        }
        r2.B5t(z);
    }
}
