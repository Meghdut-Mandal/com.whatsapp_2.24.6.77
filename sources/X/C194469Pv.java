package X;

import java.util.HashMap;

/* renamed from: X.9Pv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C194469Pv {
    public final /* synthetic */ AnonymousClass6C8 A00;

    public /* synthetic */ C194469Pv(AnonymousClass6C8 r1) {
        this.A00 = r1;
    }

    public final void A00(C202059ky r5, AnonymousClass9NH r6) {
        String str;
        AnonymousClass6C8 r3 = this.A00;
        HashMap A0J = AnonymousClass001.A0J();
        if (r5 == null) {
            A0J.put("business_name", r6.A02);
            A0J.put("owner_full_name", r6.A04);
            A0J.put("verify_type", r6.A05);
            A0J.put("bank_name", r6.A01);
            A0J.put("credential_id", r6.A03);
            str = "on_success";
        } else {
            C165597tg.A1M(A0J, r5.A00);
            str = "on_failure";
        }
        r3.A01(str, A0J);
    }
}
