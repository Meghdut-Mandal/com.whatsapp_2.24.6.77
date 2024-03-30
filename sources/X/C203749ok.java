package X;

import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.Map;

/* renamed from: X.9ok  reason: invalid class name and case insensitive filesystem */
public class C203749ok implements C159657ji {
    public Object A00;
    public Object A01;
    public final int A02;

    public C203749ok(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BiH(Map map) {
        C79593ty r0;
        if (this.A02 == 0) {
            AnonymousClass9jA r6 = (AnonymousClass9jA) this.A00;
            r6.A07.A00.A0H.remove("BRMerchantData");
            Boolean A0j = C36381kD.A0j();
            if (map == null) {
                C165577te.A1M("BrazilPaymentMerchantHelper", "triggerMerchantOnboarding :: terminalParams is null");
                r0 = (C79593ty) this.A01;
            } else {
                Object obj = map.get(C52122ov.A02.key);
                if (obj instanceof C128176Bf) {
                    if (489 == ((C128176Bf) obj).A00) {
                        r6.A03.A09(new C23168B8c(this, 0));
                    } else {
                        ((C79593ty) this.A01).A0C(A0j);
                    }
                }
                r0 = (C79593ty) this.A01;
                A0j = C36371kC.A0m();
            }
            r0.A0C(A0j);
        } else if (map != null) {
            String A1A = C36431kI.A1A("credential_id", map);
            Object obj2 = map.get("action");
            if (A1A != null) {
                ((C224914p) this.A00).A04.Bp1(new C1502374m(this, this.A01, A1A, 8));
                return;
            }
            C178848hw r2 = (C178848hw) this.A00;
            if ("create_new_account".equals(obj2)) {
                r2.A4e((String) null);
            } else if ("check_balance".equals(obj2)) {
                r2.startActivityForResult(C165577te.A0I(r2, r2.A0B, IndiaUpiCheckBalanceActivity.class), 1015);
            }
        } else {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this.A00;
            if (indiaUpiCheckOrderDetailsActivity.BMo()) {
                indiaUpiCheckOrderDetailsActivity.finish();
            }
        }
    }

    public void BXS(AnonymousClass6PH r1, Map map) {
    }
}
