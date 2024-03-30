package X;

import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import java.util.Map;

/* renamed from: X.6xW  reason: invalid class name and case insensitive filesystem */
public final class C147626xW implements C159657ji {
    public final /* synthetic */ P2mLiteOrderDetailsActivity A00;

    public void BXS(AnonymousClass6PH r1, Map map) {
    }

    public C147626xW(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity) {
        this.A00 = p2mLiteOrderDetailsActivity;
    }

    public void BiH(Map map) {
        Object obj;
        Object obj2;
        String str;
        Object obj3;
        C128176Bf r3;
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A00;
        p2mLiteOrderDetailsActivity.Bnv();
        AnonymousClass6EW r0 = p2mLiteOrderDetailsActivity.A0R;
        if (r0 != null) {
            r0.A04(p2mLiteOrderDetailsActivity);
        }
        p2mLiteOrderDetailsActivity.A0R = null;
        AnonymousClass1VZ r1 = p2mLiteOrderDetailsActivity.A07;
        if (r1 != null) {
            AnonymousClass2bZ r6 = (AnonymousClass2bZ) r1.A02(p2mLiteOrderDetailsActivity.A3j().A07);
            String str2 = null;
            if (map != null) {
                obj = map.get(C52122ov.A02.key);
            } else {
                obj = null;
            }
            if (!(obj instanceof C128176Bf) || (r3 = (C128176Bf) obj) == null) {
                if (map != null) {
                    obj2 = map.get("result");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                if (map != null) {
                    obj3 = map.get("payment_transaction_id");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                }
                if (("COMPLETED".equals(str) || "DISMISSED".equals(str) || "SUCCESS".equals(str)) && str2 != null) {
                    p2mLiteOrderDetailsActivity.A04.Bp1(new C80503vV(r6, p2mLiteOrderDetailsActivity, str2, str, 5));
                }
                if ("BLOCKED".equals(str)) {
                    P2mLiteOrderDetailsActivity.A0G(p2mLiteOrderDetailsActivity, r6, "enter_dob");
                    return;
                }
                return;
            }
            C131606Ps A002 = AnonymousClass9ZG.A00();
            A002.A04("success_redirect", false);
            A002.A04("unsuccessful_redirect", true);
            P2mLiteOrderDetailsActivity.A07(A002, p2mLiteOrderDetailsActivity, r6, (Integer) null, "api_event", "in_app_browser_checkout", 3);
            p2mLiteOrderDetailsActivity.A0Z.A00(r3.A00);
            return;
        }
        throw C36331k8.A0d("paymentMessageStore");
    }
}
