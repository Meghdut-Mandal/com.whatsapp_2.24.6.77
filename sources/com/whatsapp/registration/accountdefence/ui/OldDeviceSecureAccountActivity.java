package com.whatsapp.registration.accountdefence.ui;

import X.AnonymousClass001;
import X.AnonymousClass14B;
import X.AnonymousClass155;
import X.AnonymousClass3LN;
import X.C03570Gk;
import X.C16160oi;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C65983Uf;
import X.C67133Yq;
import X.C81143wX;
import X.C89364Wg;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class OldDeviceSecureAccountActivity extends AnonymousClass155 implements C16160oi {
    public C33751fs A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36361kB.A0X(r1);
        }
    }

    public OldDeviceSecureAccountActivity(int i) {
        this.A01 = false;
        C89364Wg.A00(this, 1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C67133Yq.A00(C03570Gk.A0B(this, R.id.close_button), this, 0);
        C67133Yq.A00(C03570Gk.A0B(this, R.id.add_security_btn), this, 1);
        C36361kB.A1P(C36391kE.A0v(this, AnonymousClass14B.A03(this, R.color.f6nameremoved), new Object[1], 0, R.string.f12nameremoved), C36401kF.A0H(this, R.id.description_sms_code));
        TextEmojiLabel A0e = C36441kJ.A0e(this, R.id.description_move_alert);
        C36321k7.A0m(this, A0e);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = AnonymousClass14B.A03(this, R.color.f6nameremoved);
        Me A0M2 = C36401kF.A0M(this);
        C18740tg.A06(A0M2);
        String str = A0M2.jabber_id;
        C18740tg.A06(str);
        C18820ts r2 = this.A00;
        String str2 = A0M2.cc;
        A0e.setText(spannableStringBuilder.append(Html.fromHtml(C36391kE.A0v(this, C65983Uf.A0D(r2, str2, C36431kI.A1B(str2, str)), A0M, 1, R.string.f12nameremoved))).append(" ").append(AnonymousClass3LN.A01(C81143wX.A00(this, 39), getString(R.string.f12nameremoved), "learn-more")));
    }

    public OldDeviceSecureAccountActivity() {
        this(0);
    }
}
