package X;

import android.app.Activity;

public final /* synthetic */ class A8R implements C87404Or {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C196129Xv A01;
    public final /* synthetic */ C22952Az4 A02;
    public final /* synthetic */ C29121Vk A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ A8R(Activity activity, C196129Xv r2, C22952Az4 az4, C29121Vk r4, String str, boolean z) {
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = str;
        this.A05 = z;
        this.A00 = activity;
        this.A02 = az4;
    }

    public final void B1u() {
        String str;
        C196129Xv r14 = this.A01;
        C29121Vk r3 = this.A03;
        String str2 = this.A04;
        boolean z = this.A05;
        Activity activity = this.A00;
        C22952Az4 az4 = this.A02;
        AnonymousClass8gB r10 = new AnonymousClass8gB(r14.A03.A00, r14.A01, r14.A04, r14, r14.A05, r14.A07, r3);
        AnonymousClass9RS r32 = new AnonymousClass9RS(activity, r14, az4);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: blockNonWaVpa called vpa: ");
        A0u.append(C200449hQ.A02(str2));
        C36321k7.A1X(" block: ", A0u, z);
        if (z) {
            str = "upi-block-vpa";
        } else {
            str = "upi-unblock-vpa";
        }
        AnonymousClass9YX A042 = AnonymousClass9I1.A04(r10, str);
        AnonymousClass19A r102 = r10.A02;
        String A09 = r102.A09();
        int i = 5;
        if (z) {
            i = 0;
        }
        r102.A0E(new AnonymousClass8gZ(r10.A00, r10.A01, r32, r10.A04, A042, r10, str, str2, z), new C186008vG(A09, str2, i).A00, A09, 204, 0);
    }
}
