package com.whatsapp.payments.ui;

import X.AE7;
import X.AnonymousClass00C;
import X.AnonymousClass16T;
import X.AnonymousClass1QS;
import X.AnonymousClass1YM;
import X.AnonymousClass3J9;
import X.AnonymousClass3M9;
import X.AnonymousClass6VG;
import X.AnonymousClass97K;
import X.AnonymousClass9I4;
import X.AnonymousClass9Op;
import X.AnonymousClass9SJ;
import X.C007103b;
import X.C012005e;
import X.C1025050g;
import X.C1033154u;
import X.C1033354w;
import X.C1262363c;
import X.C131606Ps;
import X.C147166wm;
import X.C160427kz;
import X.C165597tg;
import X.C166467vu;
import X.C180248lR;
import X.C1901196y;
import X.C19460v5;
import X.C196039Xk;
import X.C200049gU;
import X.C201649k3;
import X.C202239lN;
import X.C202939my;
import X.C207249un;
import X.C21667AUj;
import X.C23038B1j;
import X.C23075B3f;
import X.C23215B9x;
import X.C24601Db;
import X.C24801Dv;
import X.C36361kB;
import X.C36441kJ;
import X.C589131n;
import X.C74813mD;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrazilPaymentSettingsFragment extends Hilt_BrazilPaymentSettingsFragment implements C23038B1j {
    public C19460v5 A00;
    public C24801Dv A01;
    public C1033354w A02;
    public AnonymousClass16T A03;
    public C589131n A04;
    public C147166wm A05;
    public AnonymousClass1YM A06;
    public C202939my A07;
    public AnonymousClass9SJ A08;
    public C1262363c A09;
    public C200049gU A0A;
    public C1033154u A0B;
    public C23075B3f A0C;
    public AnonymousClass9I4 A0D;
    public AnonymousClass6VG A0E;
    public C196039Xk A0F;
    public AE7 A0G;
    public C201649k3 A0H;
    public C180248lR A0I;
    public AnonymousClass9Op A0J;

    public void A1n(int i) {
        String str;
        if (i == 2) {
            C180248lR r0 = this.A0I;
            if (r0 != null) {
                String str2 = r0.A01;
                Integer num = r0.A00;
                String A012 = C201649k3.A01(this.A0H, "generic_context", true);
                Intent A0F2 = C165597tg.A0F(A1D());
                if (A012 == null) {
                    A012 = "brpay_p_add_credential_router";
                }
                A0F2.putExtra("screen_name", A012);
                C1025050g.A01(A0F2, "referral_screen", "push_provisioning");
                C1025050g.A01(A0F2, "credential_push_data", str2);
                switch (num.intValue()) {
                    case 1:
                        str = "VISA";
                        break;
                    case 2:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "MASTERCARD";
                        break;
                }
                C1025050g.A01(A0F2, "credential_card_network", str);
                C1025050g.A01(A0F2, "onboarding_context", "generic_context");
                A1C(A0F2);
                return;
            }
            Log.e("BrazilPaymentSettingsViewModel instance is null and cannot continue to push prov");
            return;
        }
        super.A1n(i);
    }

    public void BQr(boolean z) {
        A1s((String) null, "payment_home.add_payment_method");
    }

    public void BcR(C207249un r1) {
    }

    public boolean BtK() {
        return true;
    }

    public static void A03(BrazilPaymentSettingsFragment brazilPaymentSettingsFragment, String str, String str2) {
        Intent A0F2 = C165597tg.A0F(brazilPaymentSettingsFragment.A1D());
        A0F2.putExtra("screen_name", str2);
        C1025050g.A01(A0F2, "onboarding_context", "generic_context");
        C1025050g.A01(A0F2, "referral_screen", str);
        AnonymousClass3M9.A01(A0F2, "payment_settings");
        brazilPaymentSettingsFragment.startActivityForResult(A0F2, 2);
    }

    public void A1m() {
        if (this.A0d.A02.A0E(1359)) {
            C131606Ps r2 = new C131606Ps((String) null, new C131606Ps[0]);
            r2.A03("hc_entrypoint", "wa_payment_hub_support");
            r2.A03("app_type", "consumer");
            this.A0C.BOp(r2, C36361kB.A0i(), 39, "payment_home", (String) null);
            A1C(C36441kJ.A0H(A0a(), BrazilPaymentCareTransactionSelectorActivity.class));
            return;
        }
        super.A1m();
    }

    public void Bq3(boolean z) {
        View view = this.A0F;
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) C012005e.A02(view, R.id.action_required_container);
            C202239lN r0 = this.A0l;
            int i = 0;
            if (r0 != null) {
                if (r0.A08.A04() != null) {
                    this.A0R.A05(AnonymousClass97K.A00(this.A0O, this.A0l.A08.A04()));
                }
                ArrayList A042 = this.A0R.A04();
                if (!A042.isEmpty()) {
                    frameLayout.removeAllViews();
                    C166467vu r4 = new C166467vu(A0a());
                    r4.A00(new AnonymousClass3J9(new C74813mD(frameLayout, this), (C21667AUj) C007103b.A0X(A042).get(0), A042.size()));
                    frameLayout.addView(r4);
                    int size = A042.size();
                    Set set = this.A04.A00;
                    if (size > 1) {
                        set.add(this);
                    } else {
                        set.remove(this);
                    }
                }
            }
            if (!z) {
                i = 8;
            }
            frameLayout.setVisibility(i);
        }
    }

    public void A1H() {
        super.A1H();
        this.A04.A00.remove(this);
    }

    public void A1L() {
        super.A1L();
        C202239lN r0 = this.A0l;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void A1N(int i, int i2, Intent intent) {
        super.A1N(i, i2, intent);
        if (i == 2 && i2 == -1) {
            A1C(C36441kJ.A0H(A1D(), BrazilFbPayHubActivity.class));
        }
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        super.A1Q(bundle);
        C1033354w r2 = this.A02;
        String str = null;
        if (!r2.A0G() || !r2.A0H()) {
            r2.A0F((C160427kz) null, "payment_settings", true);
        }
        if (this.A02.A0E(698)) {
            this.A0B.A0F();
        }
        Bundle bundle2 = this.A0A;
        String str2 = null;
        if (bundle2 != null) {
            Uri uri = (Uri) bundle2.getParcelable("extra_deep_link_url");
            if (uri != null && C1901196y.A00(uri, this.A0G)) {
                AnonymousClass1QS.A01(this, (Integer) null, Integer.valueOf(R.string.f12nameremoved), (Integer) null, (List) null);
            }
            str2 = bundle2.getString("notification-type", (String) null);
            str = bundle2.getString("step-up-id", (String) null);
        }
        C202239lN r0 = this.A0l;
        if (r0 != null) {
            r0.A07(str2, str);
        }
        this.A16 = new C23215B9x(this, 0);
        if (!this.A0H.A03.A03()) {
            C24601Db r22 = this.A0Z;
            if ((!r22.A03().contains("payment_account_recoverable") || !r22.A03().contains("payment_account_recoverable_time_ms")) && this.A02.A0E(2000)) {
                this.A09.A00(A1D());
            }
        }
        AnonymousClass00C.A0D(this.A02, 0);
    }

    public void Bl3() {
        Intent A0F2 = C165597tg.A0F(A0i());
        A0F2.putExtra("screen_name", "brpay_p_doc_upload_intro");
        startActivityForResult(A0F2, 1);
    }
}
