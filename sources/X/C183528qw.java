package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.8qw  reason: invalid class name and case insensitive filesystem */
public class C183528qw extends C132446Tt {
    public final AnonymousClass6C8 A00;
    public final AnonymousClass1EU A01;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0o = C165577te.A0o(this.A01);
        if (A0o.size() <= 0) {
            return null;
        }
        Collections.sort(A0o, new C23176B8k(this, 8));
        C207249un r5 = (C207249un) C36441kJ.A12(A0o);
        C175898bF r0 = r5.A08;
        if (r0 == null || ((C175858bB) r0).A06 < 0) {
            return null;
        }
        return new AnonymousClass00I(Integer.valueOf(A0o.size()), r5);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str;
        AnonymousClass00I r6 = (AnonymousClass00I) obj;
        if (r6 != null) {
            Object obj2 = r6.A01;
            C18740tg.A06(obj2);
            C207249un r4 = (C207249un) obj2;
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("credential_id", r4.A0A);
            A0J.put("last4", C207249un.A06(r4));
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("");
            A0J.put("remaining_cards", AnonymousClass000.A0o(r6.A00, A0u));
            C175858bB r0 = (C175858bB) r4.A08;
            if (r0 != null) {
                str = C36381kD.A10(AnonymousClass000.A0v(""), r0.A04);
            } else {
                str = "-1";
            }
            A0J.put("remaining_retries", str);
            this.A00.A01("on_success", A0J);
            return;
        }
        this.A00.A00("on_failure");
    }

    public C183528qw(AnonymousClass6C8 r1, AnonymousClass1EU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
