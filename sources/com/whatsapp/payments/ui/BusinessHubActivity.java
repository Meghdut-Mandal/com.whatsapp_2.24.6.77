package com.whatsapp.payments.ui;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass3UF;
import X.AnonymousClass7TF;
import X.C001600r;
import X.C152867Md;
import X.C163027pX;
import X.C165187t1;
import X.C18800tq;
import X.C18830tt;
import X.C33621ff;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C90464aC;
import X.C90504aG;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;

public final class BusinessHubActivity extends AnonymousClass155 {
    public ViewGroup A00;
    public ViewGroup A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public AnonymousClass1EV A0A;
    public AnonymousClass1EU A0B;
    public C33621ff A0C;
    public boolean A0D;
    public final AnonymousClass00T A0E;

    public void A2F() {
        if (!this.A0D) {
            this.A0D = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C90464aC.A11(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C90464aC.A0y(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0B = (AnonymousClass1EU) A0B2.A6M.get();
            this.A0A = C90504aG.A0R(A0B2);
            this.A0C = (C33621ff) r1.A3B.get();
        }
    }

    public BusinessHubActivity(int i) {
        this.A0D = false;
        C163027pX.A00(this, 43);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B A0Q = C36431kI.A0Q(this, (Toolbar) findViewById(R.id.pay_service_toolbar));
        if (A0Q != null) {
            A0Q.A0Q((CharSequence) null);
            A0Q.A0U(true);
            int A002 = AnonymousClass00F.A00(this, R.color.f6nameremoved);
            Drawable A003 = AnonymousClass00E.A00(this, R.drawable.ic_close);
            if (A003 != null) {
                A0Q.A0L(AnonymousClass3UF.A08(A003, A002));
            }
        }
        View findViewById = findViewById(R.id.payment_partner_container);
        ImageView A0L = C36341k9.A0L(findViewById, R.id.payment_business_icon);
        AnonymousClass00C.A0D(A0L, 0);
        this.A02 = A0L;
        TextView A0M = C36341k9.A0M(findViewById, R.id.business_account_name);
        AnonymousClass00C.A0D(A0M, 0);
        this.A04 = A0M;
        TextView A0M2 = C36341k9.A0M(findViewById, R.id.business_account_status);
        AnonymousClass00C.A0D(A0M2, 0);
        this.A05 = A0M2;
        ViewGroup viewGroup = (ViewGroup) C36361kB.A0G(findViewById, R.id.view_dashboard_row);
        AnonymousClass00C.A0D(viewGroup, 0);
        this.A01 = viewGroup;
        TextView A0M3 = C36341k9.A0M(findViewById, R.id.payment_partner_dashboard);
        AnonymousClass00C.A0D(A0M3, 0);
        this.A06 = A0M3;
        View findViewById2 = findViewById(R.id.payout_method_container);
        ImageView A0L2 = C36341k9.A0L(findViewById2, R.id.payout_bank_icon);
        AnonymousClass00C.A0D(A0L2, 0);
        this.A03 = A0L2;
        TextView A0M4 = C36341k9.A0M(findViewById2, R.id.payout_bank_name);
        AnonymousClass00C.A0D(A0M4, 0);
        this.A07 = A0M4;
        TextView A0M5 = C36341k9.A0M(findViewById2, R.id.payout_bank_status);
        AnonymousClass00C.A0D(A0M5, 0);
        this.A08 = A0M5;
        int i = 8;
        C36361kB.A0G(findViewById2, R.id.warning_container).setVisibility(8);
        View A0G = C36361kB.A0G(findViewById(R.id.partner_support_container), R.id.request_dyi_report_action);
        C36391kE.A0Q(this, R.id.request_payment_account_info_text).setText(R.string.f12nameremoved);
        C36391kE.A1I(A0G, this, 26);
        int A004 = AnonymousClass00F.A00(this, R.color.f6nameremoved);
        AnonymousClass3UF.A0E(C36411kG.A0Q(this, R.id.request_payment_account_info_icon), A004);
        AnonymousClass1EV r0 = this.A0A;
        if (r0 != null) {
            if (!r0.A02.A0E(4781)) {
                i = 0;
            }
            A0G.setVisibility(i);
            View findViewById3 = findViewById(R.id.delete_payments_account_action);
            AnonymousClass00C.A08(findViewById3);
            ViewGroup viewGroup2 = (ViewGroup) findViewById3;
            AnonymousClass00C.A0D(viewGroup2, 0);
            this.A00 = viewGroup2;
            AnonymousClass3UF.A0E(C36391kE.A0N(viewGroup2, R.id.delete_payments_account_icon), A004);
            ViewGroup viewGroup3 = this.A00;
            if (viewGroup3 != null) {
                TextView A0M6 = C36341k9.A0M(viewGroup3, R.id.delete_payments_account_label);
                AnonymousClass00C.A0D(A0M6, 0);
                this.A09 = A0M6;
                C165187t1 r1 = new C165187t1(this, 24);
                AnonymousClass00T r3 = this.A0E;
                ((C001600r) ((PaymentMerchantAccountViewModel) r3.getValue()).A06.getValue()).A08(this, r1);
                C165187t1.A01(this, (C001600r) ((PaymentMerchantAccountViewModel) r3.getValue()).A08.getValue(), new AnonymousClass7TF(this), 25);
                ((PaymentMerchantAccountViewModel) r3.getValue()).A0T(true);
                return;
            }
            throw C36331k8.A0d("removeAccountRow");
        }
        throw C36331k8.A0d("paymentsGatingManager");
    }

    public BusinessHubActivity() {
        this(0);
        this.A0E = C36431kI.A1I(new C152867Md(this));
    }
}
