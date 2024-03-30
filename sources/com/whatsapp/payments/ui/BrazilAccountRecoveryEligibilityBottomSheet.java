package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass17Y;
import X.AnonymousClass6YV;
import X.C012005e;
import X.C18740tg;
import X.C193559Ly;
import X.C20810yC;
import X.C21060yb;
import X.C23075B3f;
import X.C24801Dv;
import X.C36391kE;
import X.C36401kF;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class BrazilAccountRecoveryEligibilityBottomSheet extends Hilt_BrazilAccountRecoveryEligibilityBottomSheet {
    public String A00;
    public C24801Dv A01;
    public AnonymousClass17Y A02;
    public C21060yb A03;
    public C20810yC A04;
    public C23075B3f A05;
    public C193559Ly A06;

    public static void A03(BrazilAccountRecoveryEligibilityBottomSheet brazilAccountRecoveryEligibilityBottomSheet, Integer num) {
        String str = brazilAccountRecoveryEligibilityBottomSheet.A00;
        C23075B3f b3f = brazilAccountRecoveryEligibilityBottomSheet.A05;
        C18740tg.A06(b3f);
        b3f.BOm(1, num, "prompt_recover_payments", str);
    }

    public void A19() {
        super.A19();
        this.A06 = null;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A00 = A0b().getString("referral_screen");
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        Context context = inflate.getContext();
        C20810yC r10 = this.A04;
        AnonymousClass17Y r7 = this.A02;
        C24801Dv r6 = this.A01;
        C21060yb r9 = this.A03;
        AnonymousClass6YV.A0E(context, Uri.parse("https://faq.whatsapp.com/1085240205511877"), r6, r7, C36401kF.A0O(inflate, R.id.desc), r9, r10, C36401kF.A0q(this, "learn-more", AnonymousClass001.A0L(), 0, R.string.f12nameremoved), "learn-more");
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        C36391kE.A1I(C012005e.A02(view, R.id.use_existing_payments_button), this, 8);
        C36391kE.A1I(C012005e.A02(view, R.id.close), this, 9);
        C36391kE.A1I(C012005e.A02(view, R.id.setup_payments_button), this, 10);
        String str = this.A00;
        C23075B3f b3f = this.A05;
        C18740tg.A06(b3f);
        b3f.BOm(0, (Integer) null, "prompt_recover_payments", str);
    }
}
