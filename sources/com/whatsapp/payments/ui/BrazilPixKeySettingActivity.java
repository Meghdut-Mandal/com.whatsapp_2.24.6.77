package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass00E;
import X.AnonymousClass00F;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass3UF;
import X.B7Y;
import X.BA9;
import X.BAX;
import X.C009504a;
import X.C009904e;
import X.C131606Ps;
import X.C165567td;
import X.C176658cT;
import X.C18800tq;
import X.C18830tt;
import X.C22433AmY;
import X.C23075B3f;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

public final class BrazilPixKeySettingActivity extends AnonymousClass155 {
    public int A00;
    public C009904e A01;
    public C23075B3f A02;
    public BrazilPixKeySettingViewModel A03;
    public PaymentMethodRow A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;

    public static final void A01(BrazilPixKeySettingActivity brazilPixKeySettingActivity, Integer num, String str, String str2, int i) {
        C23075B3f b3f = brazilPixKeySettingActivity.A02;
        if (b3f != null) {
            C176658cT B4W = b3f.B4W();
            C176658cT.A02(B4W, i);
            B4W.A07 = num;
            B4W.A0b = str;
            B4W.A0Y = str2;
            B4W.A0a = brazilPixKeySettingActivity.A08;
            C131606Ps A0F = C165567td.A0F();
            A0F.A03("payment_method", "pix");
            B4W.A0Z = A0F.toString();
            C23075B3f b3f2 = brazilPixKeySettingActivity.A02;
            if (b3f2 != null) {
                b3f2.BOl(B4W);
                return;
            }
            throw C36331k8.A0d("paymentFieldStatsLogger");
        }
        throw C36331k8.A0d("paymentFieldStatsLogger");
    }

    public static final boolean A07(BrazilPixKeySettingActivity brazilPixKeySettingActivity) {
        String str;
        String str2;
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = brazilPixKeySettingActivity.A03;
        if (brazilPixKeySettingViewModel == null) {
            throw C36331k8.A0d("brazilPixKeySettingViewModel");
        } else if (!brazilPixKeySettingViewModel.A03.A07.A02.A0E(5861) || 1 != brazilPixKeySettingActivity.A00 || (str = brazilPixKeySettingActivity.A07) == null || str.length() == 0 || (str2 = brazilPixKeySettingActivity.A06) == null || str2.length() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C165567td.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C165567td.A0v(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = (C23075B3f) r1.A0R.get();
        }
    }

    public BrazilPixKeySettingActivity(int i) {
        this.A09 = false;
        B7Y.A00(this, 42);
    }

    public void onCreate(Bundle bundle) {
        String string;
        String str;
        int i;
        String str2;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B A0Q = C36431kI.A0Q(this, (Toolbar) findViewById(R.id.pay_service_toolbar));
        if (A0Q != null) {
            A0Q.A0U(true);
            A0Q.A0I(R.string.f12nameremoved);
            int A002 = AnonymousClass00F.A00(this, R.color.f6nameremoved);
            Drawable A003 = AnonymousClass00E.A00(this, R.drawable.ic_close);
            if (A003 != null) {
                A0Q.A0L(AnonymousClass3UF.A08(A003, A002));
            }
        }
        PaymentMethodRow paymentMethodRow = (PaymentMethodRow) C36361kB.A0H(this, R.id.payment_method_row);
        this.A04 = paymentMethodRow;
        String str3 = null;
        if (paymentMethodRow == null) {
            throw C36331k8.A0d("paymentMethodRow");
        }
        paymentMethodRow.A00.setImageResource(R.drawable.pix_logo_blue_background);
        PaymentMethodRow paymentMethodRow2 = this.A04;
        if (paymentMethodRow2 == null) {
            throw C36331k8.A0d("paymentMethodRow");
        }
        paymentMethodRow2.A02.setText((CharSequence) null);
        PaymentMethodRow paymentMethodRow3 = this.A04;
        if (paymentMethodRow3 == null) {
            throw C36331k8.A0d("paymentMethodRow");
        }
        paymentMethodRow3.A03.A02();
        Bundle A0H = C36371kC.A0H(this);
        if (A0H == null || (string = A0H.getString("credential_id")) == null) {
            throw AnonymousClass001.A08("Missing credential_id on intent extra param!");
        }
        this.A05 = string;
        Bundle A0H2 = C36371kC.A0H(this);
        if (A0H2 != null) {
            str = A0H2.getString("extra_provider");
        } else {
            str = null;
        }
        this.A06 = str;
        Bundle A0H3 = C36371kC.A0H(this);
        if (A0H3 != null) {
            str3 = A0H3.getString("extra_provider_type");
        }
        this.A07 = str3;
        Bundle A0H4 = C36371kC.A0H(this);
        if (A0H4 != null) {
            i = A0H4.getInt("extra_onboarding_provider");
        } else {
            i = 0;
        }
        this.A00 = i;
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = (BrazilPixKeySettingViewModel) C36441kJ.A0b(this).A00(BrazilPixKeySettingViewModel.class);
        this.A03 = brazilPixKeySettingViewModel;
        if (brazilPixKeySettingViewModel == null) {
            throw C36331k8.A0d("brazilPixKeySettingViewModel");
        }
        BA9.A01(this, brazilPixKeySettingViewModel.A00, new C22433AmY(this), 13);
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel2 = this.A03;
        if (brazilPixKeySettingViewModel2 == null) {
            throw C36331k8.A0d("brazilPixKeySettingViewModel");
        }
        String str4 = this.A05;
        if (str4 == null) {
            throw C36331k8.A0d("credentialId");
        }
        C36421kH.A1H(brazilPixKeySettingViewModel2.A07, brazilPixKeySettingViewModel2, str4, 13);
        this.A01 = BnD(new BAX(this, 0), new C009504a());
        Bundle A0H5 = C36371kC.A0H(this);
        if (A0H5 != null) {
            str2 = A0H5.getString("referral_screen");
        } else {
            str2 = null;
        }
        this.A08 = str2;
        A01(this, (Integer) null, "custom_payment_method_settings", "orders_home", 0);
    }

    public BrazilPixKeySettingActivity() {
        this(0);
    }
}
