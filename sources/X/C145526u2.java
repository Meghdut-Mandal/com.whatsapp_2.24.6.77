package X;

import java.util.List;

/* renamed from: X.6u2  reason: invalid class name and case insensitive filesystem */
public final class C145526u2 implements C160057kO {
    public final /* synthetic */ AnonymousClass33N A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ AnonymousClass01L A04;
    public final /* synthetic */ AnonymousClass7fP A05;
    public final /* synthetic */ C132666Ut A06;

    public C145526u2(AnonymousClass01L r1, AnonymousClass7fP r2, AnonymousClass33N r3, C132666Ut r4, String str, String str2, List list) {
        this.A06 = r4;
        this.A04 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r3;
        this.A03 = list;
        this.A05 = r2;
    }

    public void BVK() {
        A00(this, "WfalLauncherProxy/pingIfNeeded - onDeliveryFailure");
    }

    public void BWk(Exception exc) {
        A00(this, "WfalLauncherProxy/pingIfNeeded - onError");
    }

    public void Bi5(AnonymousClass6OQ r8) {
        C132666Ut r3 = this.A06;
        AnonymousClass01L r0 = this.A04;
        String str = this.A01;
        String str2 = this.A02;
        C132666Ut.A01(r0, this.A05, this.A00, r3, str, str2, this.A03);
    }

    public static void A00(C145526u2 r3, String str) {
        AnonymousClass3TI.A01(str);
        C132666Ut r2 = r3.A06;
        r2.A00 = true;
        r2.A01.A02();
        AnonymousClass00C.A0D("WfalLauncherProxy/onLoadingAttemptComplete", 0);
        C132666Ut.A00(r3.A04, r2);
        r3.A05.B5t(false);
    }
}
