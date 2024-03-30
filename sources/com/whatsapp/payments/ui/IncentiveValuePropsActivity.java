package com.whatsapp.payments.ui;

import X.AnonymousClass00F;
import X.AnonymousClass04H;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass3UF;
import X.C138506iD;
import X.C163027pX;
import X.C165187t1;
import X.C18800tq;
import X.C18830tt;
import X.C194199Om;
import X.C203049nB;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C90464aC;
import X.C90484aE;
import X.C90504aG;
import X.C95484lG;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;

public class IncentiveValuePropsActivity extends AnonymousClass155 {
    public View A00;
    public View A01;
    public Button A02;
    public TextEmojiLabel A03;
    public WaImageView A04;
    public WaTextView A05;
    public C95484lG A06;
    public C194199Om A07;
    public C32681e1 A08;
    public boolean A09;

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C90464aC.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C90464aC.A0y(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A08 = C90484aE.A0Z(r1);
            this.A07 = (C194199Om) r1.AAh.get();
        }
    }

    public IncentiveValuePropsActivity(int i) {
        this.A09 = false;
        C163027pX.A00(this, 44);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toolbar A0O = C36361kB.A0O(this, R.layout.f9nameremoved);
        TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.f9nameremoved, A0O, false);
        C36321k7.A0M(this, textView, R.attr.f4nameremoved, R.color.f6nameremoved);
        textView.setText(R.string.f12nameremoved);
        A0O.addView(textView);
        AnonymousClass07B A0Q = C36431kI.A0Q(this, A0O);
        if (A0Q != null) {
            A0Q.A0I(R.string.f12nameremoved);
            A0Q.A0U(true);
            C36341k9.A0q(this, A0O, C36411kG.A01(this));
            A0Q.A0L(AnonymousClass3UF.A08(getResources().getDrawable(R.drawable.ic_close), AnonymousClass00F.A00(this, R.color.f6nameremoved)));
            A0Q.A0X(false);
        }
        this.A05 = (WaTextView) findViewById(R.id.incentives_value_props_title);
        this.A03 = (TextEmojiLabel) findViewById(R.id.incentives_value_props_desc);
        this.A00 = findViewById(R.id.incentive_security_blurb_view);
        this.A01 = findViewById(R.id.payment_processor_logo);
        this.A02 = (Button) findViewById(R.id.incentives_value_props_continue);
        WaImageView waImageView = (WaImageView) findViewById(R.id.incentive_security_icon_view);
        this.A04 = waImageView;
        C90504aG.A11(this, waImageView, R.color.f6nameremoved);
        PaymentIncentiveViewModel paymentIncentiveViewModel = (PaymentIncentiveViewModel) C36441kJ.A0b(this).A00(PaymentIncentiveViewModel.class);
        paymentIncentiveViewModel.A0S();
        C165187t1.A00(this, paymentIncentiveViewModel.A01, 27);
        C95484lG r0 = (C95484lG) new AnonymousClass04H(new C138506iD(this.A07), this).A00(C95484lG.class);
        this.A06 = r0;
        C165187t1.A00(this, r0.A00, 26);
        C95484lG r4 = this.A06;
        C203049nB.A04(C95484lG.A01(r4), r4.A02.A05().BBn(), "incentive_value_prop", getIntent().getStringExtra("referral_screen"));
    }

    public IncentiveValuePropsActivity() {
        this(0);
    }
}
