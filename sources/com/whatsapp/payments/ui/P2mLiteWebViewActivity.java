package com.whatsapp.payments.ui;

import X.AF6;
import X.AnonymousClass011;
import X.AnonymousClass1DW;
import X.AnonymousClass61B;
import X.AnonymousClass9ZG;
import X.C000400e;
import X.C162097o1;
import X.C163027pX;
import X.C18800tq;
import X.C18830tt;
import X.C203619oP;
import X.C203639oR;
import X.C24051Aw;
import X.C32691e2;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C90464aC;
import android.content.Intent;
import android.os.Bundle;
import java.util.LinkedHashMap;

public final class P2mLiteWebViewActivity extends PaymentWebViewActivity {
    public AF6 A00;
    public AnonymousClass61B A01;
    public boolean A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    public void A3j(int i, Intent intent) {
        C203619oP r1;
        AnonymousClass61B r12 = this.A01;
        if (r12 != null) {
            String str = this.A04;
            C162097o1 r4 = null;
            if (str == null) {
                throw C36331k8.A0d("fdsManagerId");
            }
            C203639oR A002 = r12.A00(str);
            if (!(A002 == null || (r1 = A002.A00) == null)) {
                r4 = (C162097o1) r1.A0A("native_p2m_lite_hpp_checkout");
            }
            AnonymousClass011[] r3 = new AnonymousClass011[3];
            C36341k9.A1J("result_code", Integer.valueOf(i), r3, 0);
            C36341k9.A1J("result_data", intent, r3, 1);
            C36341k9.A1J("last_screen", "in_app_browser_checkout", r3, 2);
            LinkedHashMap A072 = C000400e.A07(r3);
            if (r4 != null) {
                r4.B7N(A072);
            }
            finish();
            return;
        }
        throw C36331k8.A0d("phoenixManagerRegistry");
    }

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C90464aC.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C90464aC.A0y(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = (C32691e2) A0B.A4R.get();
            this.A04 = C18830tt.ACx(r1);
            this.A03 = (AnonymousClass1DW) A0B.A2f.get();
            this.A05 = (C24051Aw) A0B.A3E.get();
            this.A01 = (AnonymousClass61B) A0B.ANg.get();
            this.A00 = (AF6) r1.AAT.get();
        }
    }

    public boolean A3o() {
        return !this.A0D.A0E(2718);
    }

    public P2mLiteWebViewActivity(int i) {
        this.A07 = false;
        C163027pX.A00(this, 47);
    }

    public void onBackPressed() {
        super.onBackPressed();
        int i = 1;
        if (this.A02) {
            i = 3;
        }
        AF6 af6 = this.A00;
        if (af6 != null) {
            af6.A01(AnonymousClass9ZG.A00(), Integer.valueOf(i), "in_app_browser_checkout", this.A06, this.A05, this.A03, 1, true);
            return;
        }
        throw C36331k8.A0d("p2mLiteEventLogger");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A06 = getIntent().getStringExtra("referral_screen");
        String stringExtra = getIntent().getStringExtra("extra_fds_manager_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.A04 = stringExtra;
        this.A05 = getIntent().getStringExtra("order_type");
        this.A03 = getIntent().getStringExtra("config_id");
    }

    public P2mLiteWebViewActivity() {
        this(0);
    }
}
