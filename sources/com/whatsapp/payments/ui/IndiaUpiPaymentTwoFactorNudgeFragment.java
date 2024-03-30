package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass000;
import X.C012005e;
import X.C19970wo;
import X.C207359uy;
import X.C22826Awb;
import X.C24601Db;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C90494aF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class IndiaUpiPaymentTwoFactorNudgeFragment extends Hilt_IndiaUpiPaymentTwoFactorNudgeFragment {
    public C24601Db A00;
    public AF7 A01;
    public C22826Awb A02;

    public void A19() {
        super.A19();
        this.A02 = null;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        C207359uy.A00(C012005e.A02(view, R.id.continue_button), this, 43);
        C207359uy.A00(C012005e.A02(view, R.id.close), this, 44);
        C207359uy.A00(C012005e.A02(view, R.id.later_button), this, 45);
        C24601Db r2 = this.A00;
        long A002 = C19970wo.A00(r2.A01);
        C36341k9.A0w(C90494aF.A0E(r2), "payments_last_two_factor_nudge_time", A002);
        r2.A02.A06(C36381kD.A0z("updateLastTwoFactorNudgeTimeMilli to: ", AnonymousClass000.A0u(), A002));
        C24601Db r22 = this.A00;
        int A012 = C36371kC.A01(r22.A03(), "payments_two_factor_nudge_count") + 1;
        C36341k9.A0v(C90494aF.A0E(r22), "payments_two_factor_nudge_count", A012);
        r22.A02.A06(AnonymousClass000.A0r("updateTwoFactorNudgeCount to: ", AnonymousClass000.A0u(), A012));
        this.A01.BOm(C36381kD.A0m(), (Integer) null, "two_factor_nudge_prompt", (String) null);
    }
}
