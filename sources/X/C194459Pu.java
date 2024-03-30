package X;

import java.util.HashMap;

/* renamed from: X.9Pu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C194459Pu {
    public final /* synthetic */ AnonymousClass6C8 A00;

    public /* synthetic */ C194459Pu(AnonymousClass6C8 r1) {
        this.A00 = r1;
    }

    public final void A00(C175768b1 r7, C202059ky r8) {
        String str;
        String str2;
        AnonymousClass6C8 r5 = this.A00;
        HashMap A0J = AnonymousClass001.A0J();
        if (r8 == null) {
            C175888bE r0 = (C175888bE) r7.A08;
            if (r0 != null) {
                int i = r0.A01;
                boolean z = true;
                if ((i & 1) <= 0) {
                    z = false;
                }
                if (!z) {
                    str2 = "sell_pending";
                } else if ((i & 2) <= 0) {
                    str2 = "payout_pending";
                }
                A0J.put(str2, "1");
            }
            str = "on_success";
        } else {
            C165597tg.A1M(A0J, r8.A00);
            str = "on_failure";
        }
        r5.A01(str, A0J);
    }
}
