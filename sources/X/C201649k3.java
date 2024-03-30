package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9k3  reason: invalid class name and case insensitive filesystem */
public class C201649k3 {
    public final C20810yC A00;
    public final C24601Db A01;
    public final AnonymousClass1EU A02;
    public final C196039Xk A03;
    public final C19630wG A04;
    public final AnonymousClass1EV A05;

    public static String A00(C201649k3 r3) {
        C24851Ea A032;
        if (r3.A05.A01() && (A032 = r3.A02.A02("merchant_account_linking_context").A03()) != null) {
            String str = A032.A03;
            if (str.equals("tos_merchant")) {
                return "brpay_m_tos";
            }
            if (str.equals("add_business")) {
                return "brpay_m_enter_taxid";
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(X.C201649k3 r6, java.lang.String r7, boolean r8) {
        /*
            X.1Db r3 = r6.A01
            android.content.SharedPreferences r0 = r3.A03()
            java.lang.String r2 = "pref_br_onboarding_add_kyc_step_migration"
            boolean r0 = X.C36371kC.A1U(r0, r2)
            if (r0 != 0) goto L_0x0054
            X.0yC r1 = r6.A00
            r0 = 2000(0x7d0, float:2.803E-42)
            boolean r0 = r1.A0E(r0)
            java.lang.String r4 = "p2p_context"
            if (r0 == 0) goto L_0x0026
            android.content.SharedPreferences r1 = r3.A03()
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 != 0) goto L_0x003c
        L_0x0026:
            boolean r0 = r6.A07(r4)
            if (r0 == 0) goto L_0x004c
            X.9Xk r0 = r6.A03
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "generic_context"
            boolean r0 = r6.A06(r0)
            if (r0 == 0) goto L_0x004c
        L_0x003c:
            X.1EU r0 = r6.A02
            X.1EY r1 = r0.A02(r4)
            java.lang.String r0 = "kyc"
            r1.A0B(r0)
            java.lang.String r0 = "pending"
            r3.A0N(r0)
        L_0x004c:
            r1 = 1
            android.content.SharedPreferences$Editor r0 = X.C90494aF.A0E(r3)
            X.C36331k8.A0w(r0, r2, r1)
        L_0x0054:
            java.lang.String r4 = "p2m_context"
            boolean r5 = r4.equals(r7)
            if (r5 == 0) goto L_0x00a7
            X.0yC r1 = r6.A00
            r0 = 2928(0xb70, float:4.103E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00a7
            java.lang.String r3 = "p2p_context"
            boolean r0 = r6.A07(r3)
            if (r0 == 0) goto L_0x007f
            boolean r0 = r6.A07(r4)
            if (r0 != 0) goto L_0x007f
            java.lang.String r1 = "tos_no_wallet"
            X.1EU r0 = r6.A02
            X.1EY r0 = r0.A02(r4)
            r0.A0B(r1)
        L_0x007f:
            X.1EU r2 = r6.A02
            X.1EY r0 = r2.A02(r3)
            java.lang.String r1 = "kyc"
            boolean r0 = r0.A0G(r1)
            if (r0 == 0) goto L_0x0094
            X.1EY r0 = r2.A02(r4)
            r0.A0B(r1)
        L_0x0094:
            X.1EY r0 = r2.A02(r3)
            java.lang.String r1 = "add_card"
            boolean r0 = r0.A0G(r1)
            if (r0 == 0) goto L_0x00a7
            X.1EY r0 = r2.A02(r4)
            r0.A0B(r1)
        L_0x00a7:
            java.lang.String r2 = "generic_context"
            boolean r0 = r2.equals(r7)
            r3 = 0
            if (r0 == 0) goto L_0x00d4
            java.lang.String r1 = "p2p_context"
            boolean r0 = r6.A07(r1)
            if (r0 != 0) goto L_0x00be
            boolean r0 = r6.A07(r4)
            if (r0 == 0) goto L_0x00cd
        L_0x00be:
            X.9Xk r0 = r6.A03
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x00cd
            boolean r0 = r6.A06(r2)
            if (r0 == 0) goto L_0x00cd
        L_0x00cc:
            return r3
        L_0x00cd:
            X.1EU r0 = r6.A02
            X.1EY r0 = r0.A02(r1)
            goto L_0x00da
        L_0x00d4:
            X.1EU r0 = r6.A02
            X.1EY r0 = r0.A02(r7)
        L_0x00da:
            X.1Ea r1 = r0.A03()
            if (r1 == 0) goto L_0x00cc
            java.lang.String r0 = "tos_no_wallet"
            java.lang.String r1 = r1.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = "brpay_p_account_recovery_eligibility_screen"
            return r0
        L_0x00f3:
            X.9Xk r0 = r6.A03
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = "brpay_p_pin_nux_create"
            return r0
        L_0x00fe:
            java.lang.String r0 = "kyc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0111
            if (r5 == 0) goto L_0x010e
            boolean r0 = r6.A06(r2)
            if (r0 != 0) goto L_0x00cc
        L_0x010e:
            java.lang.String r0 = "brpay_p_compliance_kyc_next_screen_router"
            return r0
        L_0x0111:
            java.lang.String r0 = "add_card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00cc
            if (r8 != 0) goto L_0x00cc
            java.lang.String r0 = "brpay_p_add_card"
            return r0
        L_0x011e:
            boolean r0 = r6.A08(r7)
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = "brpay_p_consent_flow"
            return r0
        L_0x0127:
            java.lang.String r0 = "brpay_p_tos"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201649k3.A01(X.9k3, java.lang.String, boolean):java.lang.String");
    }

    public boolean A05() {
        C24601Db r6 = this.A01;
        if (C36371kC.A1U(r6.A03(), "payment_account_recoverable")) {
            C20810yC r3 = this.A00;
            if (C19970wo.A00(r6.A01) - C36341k9.A0B(r6.A03(), "payment_account_recoverable_time_ms") > TimeUnit.DAYS.toMillis((long) r3.A07(2267)) || C36371kC.A1U(r6.A03(), "payment_account_recovered") || !r3.A0E(2000)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A06(String str) {
        if (!"generic_context".equals(str)) {
            return this.A02.A02(str).A0G("add_card");
        }
        AnonymousClass1EU r1 = this.A02;
        if (r1.A02("p2p_context").A0G("add_card") || r1.A02("p2m_context").A0G("add_card")) {
            return true;
        }
        return false;
    }

    public boolean A07(String str) {
        return this.A02.A02(str).A0G("tos_no_wallet");
    }

    public boolean A08(String str) {
        if (!this.A00.A0E(2928) || !str.equals("p2p_context") || !A06("p2m_context") || A07("p2p_context")) {
            return false;
        }
        return true;
    }

    public C201649k3(C19630wG r1, C20810yC r2, C24601Db r3, AnonymousClass1EV r4, AnonymousClass1EU r5, C196039Xk r6) {
        this.A00 = r2;
        this.A04 = r1;
        this.A02 = r5;
        this.A01 = r3;
        this.A05 = r4;
        this.A03 = r6;
    }

    public Intent A02(Context context, C175798b4 r5) {
        Intent A0F = C165597tg.A0F(context);
        A0F.putExtra("screen_params", A04(r5, (C21669AUm) null, (String) null, -1));
        A0F.putExtra("screen_name", "brpay_p_card_verified");
        return A0F;
    }

    public Intent A03(Context context, C175798b4 r5, C21669AUm aUm, String str, int i) {
        Intent A0F = C165597tg.A0F(context);
        A0F.putExtra("screen_params", A04(r5, aUm, str, i));
        A0F.putExtra("screen_name", "brpay_p_card_verify_options");
        A0F.putExtra("payment_method_credential_id", r5.A0A);
        return A0F;
    }

    public HashMap A04(C175798b4 r4, C21669AUm aUm, String str, int i) {
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put("credential_id", r4.A0A);
        if (str != null) {
            A0J.put("verify_methods", str);
            if (!(!this.A00.A0E(2443) || i == -1 || aUm == null)) {
                A0J.put("default_selected_position", String.valueOf(i));
                BrazilPayBloksActivity.A0L(aUm, A0J);
            }
        }
        A0J.put("source", "pay_flow");
        A0J.put("network_name", C175798b4.A02(r4.A01));
        C175858bB r1 = (C175858bB) r4.A08;
        if (r1 != null && !TextUtils.isEmpty(r1.A0E)) {
            A0J.put("card_image_url", r1.A0E);
        }
        A0J.put("readable_name", C203449o2.A02(this.A04.A00, r4));
        A0J.put("verified_state", C165617ti.A0Y(((C175858bB) r4.A08).A0a ? 1 : 0));
        return A0J;
    }
}
