package com.whatsapp.payments.ui.mapper.register;

import X.AF7;
import X.AVY;
import X.AnonymousClass000;
import X.AnonymousClass155;
import X.C18800tq;
import X.C18830tt;
import X.C200169gl;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import X.C54932tn;
import X.C89354Wf;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

public final class IndiaUpiMapperValuePropsActivity extends AnonymousClass155 {
    public TextView A00;
    public TextView A01;
    public AF7 A02;
    public C200169gl A03;
    public C32681e1 A04;
    public WDSButton A05;
    public WDSButton A06;
    public boolean A07;

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A04 = C36351kA.A0p(r1);
            this.A02 = C36371kC.A0i(A0B);
            this.A03 = (C200169gl) r1.A98.get();
        }
    }

    public final AF7 A3i() {
        AF7 af7 = this.A02;
        if (af7 != null) {
            return af7;
        }
        throw C36331k8.A0d("fieldStatsLogger");
    }

    public final C200169gl A3j() {
        C200169gl r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("indiaUpiMapperAliasManager");
    }

    public IndiaUpiMapperValuePropsActivity(int i) {
        this.A07 = false;
        C89354Wf.A00(this, 9);
    }

    public void onBackPressed() {
        super.onBackPressed();
        AF7 A3i = A3i();
        Integer A0i = C36361kB.A0i();
        A3i.BOm(A0i, A0i, "alias_intro", C36331k8.A0e(this));
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
        setContentView((int) R.layout.f9nameremoved);
        this.A06 = (WDSButton) C36361kB.A0H(this, R.id.mapper_value_props_continue);
        this.A05 = (WDSButton) C36361kB.A0H(this, R.id.mapper_add_mobile_number);
        this.A00 = (TextView) C36361kB.A0H(this, R.id.mapper_create_custom_number);
        this.A01 = (TextView) C36361kB.A0H(this, R.id.recover_custom_number);
        TextEmojiLabel A0I = C36421kH.A0I(this, R.id.mapper_value_props_sub_title);
        C32681e1 r7 = this.A04;
        if (r7 != null) {
            Context context = A0I.getContext();
            boolean A052 = A3j().A05();
            int i = R.string.f12nameremoved;
            if (A052) {
                i = R.string.f12nameremoved;
            }
            Object[] objArr = new Object[1];
            Me A0M = C36401kF.A0M(this);
            if (A0M == null || (str = A0M.number) == null) {
                str = "";
            }
            SpannableString A012 = r7.A01(context, C36391kE.A0v(this, str, objArr, 0, i), new Runnable[]{new AVY(this, 40)}, new String[]{"learn-more"}, new String[]{"https://faq.whatsapp.com/general/payments/about-using-your-mobile-number-as-your-UPI-number"});
            C36331k8.A16(A0I, this.A08);
            C36331k8.A1A(this.A0D, A0I);
            A0I.setText(A012);
            C54932tn.A00(this, R.drawable.onboarding_actionbar_home_close);
            Intent A0H = C36441kJ.A0H(this, IndiaUpiMapperLinkActivity.class);
            A0H.putExtra("extra_payment_name", getIntent().getParcelableExtra("extra_payment_name"));
            A0H.addFlags(33554432);
            WDSButton wDSButton = this.A06;
            if (wDSButton == null) {
                throw C36331k8.A0d("continueButton");
            }
            C36371kC.A1F(wDSButton, this, A0H, 44);
            WDSButton wDSButton2 = this.A05;
            if (wDSButton2 == null) {
                throw C36331k8.A0d("addMobileNumberButton");
            }
            C36371kC.A1F(wDSButton2, this, A0H, 45);
            onConfigurationChanged(AnonymousClass000.A0U(this));
            AF7 A3i = A3i();
            Intent intent = getIntent();
            if (intent != null) {
                str2 = intent.getStringExtra("extra_referral_screen");
            } else {
                str2 = null;
            }
            A3i.BOm(0, (Integer) null, "alias_intro", str2);
            TextView textView = this.A00;
            if (textView == null) {
                throw C36331k8.A0d("createCustomNumberTextView");
            }
            C36421kH.A12(textView, this, 16);
            TextView textView2 = this.A01;
            if (textView2 == null) {
                throw C36331k8.A0d("recoverCustomNumberTextView");
            }
            C36421kH.A12(textView2, this, 15);
            boolean A053 = A3j().A05();
            WDSButton wDSButton3 = this.A06;
            if (wDSButton3 == null) {
                throw C36331k8.A0d("continueButton");
            }
            wDSButton3.setVisibility(C36351kA.A00(A053 ^ true ? 1 : 0));
            WDSButton wDSButton4 = this.A05;
            if (wDSButton4 == null) {
                throw C36331k8.A0d("addMobileNumberButton");
            }
            wDSButton4.setVisibility(C36351kA.A00(A053 ? 1 : 0));
            TextView textView3 = this.A01;
            if (textView3 == null) {
                throw C36331k8.A0d("recoverCustomNumberTextView");
            }
            textView3.setVisibility(8);
            TextView textView4 = this.A00;
            if (textView4 == null) {
                throw C36331k8.A0d("createCustomNumberTextView");
            }
            textView4.setVisibility(8);
            if (!A053) {
                return;
            }
            if (A3j().A01() != null) {
                TextView textView5 = this.A01;
                if (textView5 == null) {
                    throw C36331k8.A0d("recoverCustomNumberTextView");
                }
                textView5.setVisibility(0);
                TextView textView6 = this.A00;
                if (textView6 == null) {
                    throw C36331k8.A0d("createCustomNumberTextView");
                }
                textView6.setVisibility(4);
            } else if (A3j().A06()) {
                TextView textView7 = this.A00;
                if (textView7 == null) {
                    throw C36331k8.A0d("createCustomNumberTextView");
                }
                textView7.setVisibility(0);
            }
        } else {
            throw C36331k8.A0b();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) == 16908332) {
            A3i().BOm(C36361kB.A0i(), C36371kC.A0n(), "alias_intro", C36331k8.A0e(this));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiMapperValuePropsActivity() {
        this(0);
    }
}
