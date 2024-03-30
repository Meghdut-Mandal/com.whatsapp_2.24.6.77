package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass1EU;
import X.C1271267b;
import X.C131606Ps;
import X.C165567td;
import X.C176658cT;
import X.C202159l8;
import X.C20810yC;
import X.C21010yW;
import X.C33061ee;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C90464aC;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public final class PaymentMerchantUpsellEducationBottomSheet extends Hilt_PaymentMerchantUpsellEducationBottomSheet {
    public int A00 = -1;
    public C33061ee A01;
    public C20810yC A02;
    public C21010yW A03;
    public AnonymousClass1EU A04;
    public C1271267b A05;
    public WaImageView A06;
    public WaTextView A07;
    public WaTextView A08;
    public WDSButton A09;
    public WDSButton A0A;
    public String A0B;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Context A0a = A0a();
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("payment_account_type", -1);
            this.A0B = bundle2.getString("referral_screen");
        }
        A03(this, (Integer) null, 0, this.A00);
        this.A06 = C36431kI.A0X(view, R.id.seller_payment_upsell_logo);
        this.A07 = C36401kF.A0Q(view, R.id.seller_education_title);
        this.A08 = C36401kF.A0Q(view, R.id.seller_education_description);
        this.A09 = C36431kI.A0y(view, R.id.link_a_payment_partner_button);
        this.A0A = C36431kI.A0y(view, R.id.not_now_button);
        int ceil = (int) Math.ceil((double) (C36341k9.A0G(this).getDisplayMetrics().density * 10.0f));
        int i = this.A00;
        if (i == 0) {
            WaImageView waImageView = this.A06;
            if (waImageView != null) {
                waImageView.setImageResource(R.drawable.card_white);
            }
            WaTextView waTextView = this.A07;
            if (waTextView != null) {
                waTextView.setText(R.string.f12nameremoved);
            }
            WaTextView waTextView2 = this.A08;
            if (waTextView2 != null) {
                waTextView2.setText(R.string.f12nameremoved);
            }
            WDSButton wDSButton = this.A09;
            if (wDSButton != null) {
                wDSButton.setText(R.string.f12nameremoved);
            }
            WaImageView waImageView2 = this.A06;
            if (waImageView2 != null) {
                waImageView2.setPadding(ceil, ceil, ceil, ceil);
            }
        } else if (i != 6) {
            Log.e("Unsupported action");
        } else {
            WaImageView waImageView3 = this.A06;
            if (waImageView3 != null) {
                waImageView3.setImageResource(R.drawable.pix_logo);
            }
            WaImageView waImageView4 = this.A06;
            if (waImageView4 != null) {
                waImageView4.setPadding(ceil, ceil, ceil, ceil);
            }
            WaTextView waTextView3 = this.A07;
            if (waTextView3 != null) {
                waTextView3.setText(R.string.f12nameremoved);
            }
            WaTextView waTextView4 = this.A08;
            if (waTextView4 != null) {
                waTextView4.setText(R.string.f12nameremoved);
            }
            WDSButton wDSButton2 = this.A09;
            if (wDSButton2 != null) {
                wDSButton2.setText(R.string.f12nameremoved);
            }
        }
        C33061ee r0 = this.A01;
        if (r0 != null) {
            int i2 = this.A00;
            AnonymousClass005 r5 = r0.A00.A00;
            C36341k9.A0v(C36391kE.A0H(r5).edit(), C90464aC.A0h(i2, "smb_merchant_payment_account_nag_count_").toString(), C36391kE.A0H(r5).getInt(AnonymousClass000.A0r("smb_merchant_payment_account_nag_count_", AnonymousClass000.A0u(), i2), 0) + 1);
            WDSButton wDSButton3 = this.A09;
            if (wDSButton3 != null) {
                C36371kC.A1F(wDSButton3, this, A0a, 36);
            }
            WDSButton wDSButton4 = this.A0A;
            if (wDSButton4 != null) {
                C36421kH.A13(wDSButton4, this, 28);
                return;
            }
            return;
        }
        throw C36331k8.A0d("merchantEducationManager");
    }

    public static final void A03(PaymentMerchantUpsellEducationBottomSheet paymentMerchantUpsellEducationBottomSheet, Integer num, int i, int i2) {
        String str;
        C20810yC r1 = paymentMerchantUpsellEducationBottomSheet.A02;
        if (r1 == null) {
            throw C36321k7.A07();
        } else if (r1.A0E(7163)) {
            C131606Ps A0F = C165567td.A0F();
            if (i2 == 0) {
                str = "psp";
                A0F.A03("payment_account", str);
            } else if (i2 != 6) {
                Log.e("Unsupported action");
            } else {
                str = "pix";
                A0F.A03("payment_account", str);
            }
            C176658cT r12 = new C176658cT();
            C1271267b r0 = paymentMerchantUpsellEducationBottomSheet.A05;
            if (r0 != null) {
                r12.A0V = r0.A00();
                C202159l8 r02 = C202159l8.A0E;
                r12.A0R = "BR";
                r12.A0Z = A0F.toString();
                C176658cT.A04(r12, num, "merchant_payment_upsell_prompt", i);
                String str2 = paymentMerchantUpsellEducationBottomSheet.A0B;
                if (str2 != null) {
                    r12.A0a = str2;
                }
                C21010yW r03 = paymentMerchantUpsellEducationBottomSheet.A03;
                if (r03 != null) {
                    r03.Bly(r12);
                    return;
                }
                throw C36331k8.A0d("wamRuntime");
            }
            throw C36331k8.A0d("paymentFieldStats");
        }
    }

    public void A1J() {
        super.A1J();
        this.A06 = null;
        this.A0A = null;
        this.A08 = null;
        this.A09 = null;
        this.A07 = null;
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
