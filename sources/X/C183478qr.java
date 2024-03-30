package X;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.8qr  reason: invalid class name and case insensitive filesystem */
public class C183478qr extends C132446Tt {
    public final C191919Ez A00;
    public final AnonymousClass1EU A01;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0o = C165577te.A0o(this.A01);
        if (A0o.size() <= 0) {
            return null;
        }
        Collections.sort(A0o, new C23176B8k(this, 7));
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
            C207249un r2 = (C207249un) obj2;
            AnonymousClass155 r4 = this.A00.A00;
            if (r2 == null) {
                AnonymousClass3SJ.A01(r4, 102);
                return;
            }
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("credential_id", r2.A0A);
            A0J.put("last4", C207249un.A06(r2));
            C175858bB r22 = (C175858bB) r2.A08;
            if (r22 != null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("");
                str = C36381kD.A10(A0u, r22.A04);
            } else {
                str = "-1";
            }
            A0J.put("remaining_retries", str);
            Intent A0F = C165597tg.A0F(r4);
            A0F.putExtra("screen_name", "brpay_p_reset_pin_from_card");
            A0F.putExtra("screen_params", A0J);
            r4.startActivity(A0F);
            return;
        }
        AnonymousClass3SJ.A01(this.A00.A00, 102);
    }

    public C183478qr(C191919Ez r1, AnonymousClass1EU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
