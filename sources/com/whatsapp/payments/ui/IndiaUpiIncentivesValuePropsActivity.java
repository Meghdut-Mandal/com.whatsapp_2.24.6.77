package com.whatsapp.payments.ui;

import X.AVY;
import X.AnonymousClass97C;
import X.AnonymousClass9v5;
import X.B7Z;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C173858Tk;
import X.C176658cT;
import X.C178818he;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C196199Yc;
import X.C198299dE;
import X.C207359uy;
import X.C27111My;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C90504aG;
import X.C90514aH;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class IndiaUpiIncentivesValuePropsActivity extends C178818he {
    public C32681e1 A00;
    public boolean A01;

    public void A48() {
        this.A03 = 1;
        super.A48();
    }

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A01 = C173858Tk.A0G(r1);
            this.A00 = C19460v5.A01(new AnonymousClass97C());
            this.A00 = C36351kA.A0p(r1);
        }
    }

    public IndiaUpiIncentivesValuePropsActivity(int i) {
        this.A01 = false;
        B7Z.A00(this, 14);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        int i;
        View.OnClickListener r1;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        A3z(R.string.f12nameremoved, R.id.payments_value_props_title_and_description_section);
        C198299dE A02 = this.A0T.A02();
        if (A02 == null || (str = A02.A0F) == null || (str2 = A02.A0B) == null) {
            Log.e("PAY: IndiaUpiIncentivesValuePropsActivity/PaymentIncentiveOfferInfo is null or has null items in it");
            finish();
            return;
        }
        TextView A0Q = C36391kE.A0Q(this, R.id.incentives_value_props_title);
        TextEmojiLabel A0I = C36421kH.A0I(this, R.id.incentives_value_props_desc);
        A0Q.setText(str);
        String str3 = A02.A0C;
        if (!TextUtils.isEmpty(str3)) {
            String[] strArr = new String[1];
            C90514aH.A1Q(this.A04.A00(str3), strArr, 0);
            SpannableString A012 = this.A00.A01(A0I.getContext(), C36351kA.A0w(this, str2, 1, R.string.f12nameremoved), new Runnable[]{new AVY(this, 3)}, new String[]{"incentive-blurb-cashback-terms"}, strArr);
            C36331k8.A16(A0I, this.A08);
            C36331k8.A1A(this.A0D, A0I);
            A0I.setText(A012);
        } else {
            A0I.setText(str2);
        }
        View findViewById = findViewById(R.id.incentive_security_blurb_view);
        View findViewById2 = findViewById(R.id.payment_processor_logo);
        TextView A0Q2 = C36391kE.A0Q(this, R.id.incentives_value_props_continue);
        C196199Yc BFZ = C165587tf.A0W(this.A0P).BFZ();
        if (BFZ == null || !BFZ.A07.A0E(979)) {
            if (C173858Tk.A0x(this)) {
                C36421kH.A0x(findViewById, findViewById2);
                A0Q2.setText(R.string.f12nameremoved);
                i = 20;
            } else {
                findViewById.setVisibility(0);
                C90504aG.A11(this, C36411kG.A0Q(this, R.id.incentive_security_icon_view), R.color.f6nameremoved);
                findViewById2.setVisibility(0);
                A0Q2.setText(R.string.f12nameremoved);
                i = 21;
            }
            r1 = new C207359uy(this, i);
        } else {
            r1 = new AnonymousClass9v5((Object) this, (Object) BFZ, 28);
        }
        A0Q2.setOnClickListener(r1);
        C176658cT A04 = this.A0S.A04(0, (Integer) null, "incentive_value_prop", this.A02);
        A04.A01 = Boolean.valueOf(C173858Tk.A0x(this));
        C173858Tk.A0r(A04, this);
        this.A0P.A09();
    }

    public IndiaUpiIncentivesValuePropsActivity() {
        this(0);
    }
}
