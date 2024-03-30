package com.whatsapp.payments.ui.mapper.register;

import X.AE0;
import X.AEA;
import X.AF7;
import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass098;
import X.AnonymousClass155;
import X.AnonymousClass8gN;
import X.B7U;
import X.B7X;
import X.BAD;
import X.C146356vT;
import X.C165567td;
import X.C165587tf;
import X.C165607th;
import X.C165617ti;
import X.C179328jw;
import X.C18800tq;
import X.C18830tt;
import X.C23140B7a;
import X.C23141B7b;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36421kH;
import X.C36441kJ;
import X.C54932tn;
import X.C90494aF;
import X.C91774cb;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;

public final class IndiaUpiCreateCustomNumberActivity extends AnonymousClass155 {
    public LinearLayout A00;
    public TextInputLayout A01;
    public CircularProgressBar A02;
    public WaEditText A03;
    public AEA A04;
    public AF7 A05;
    public WDSButton A06;
    public IndiaUpiMapperLinkViewModel A07;
    public boolean A08;

    public static final void A01(IndiaUpiCreateCustomNumberActivity indiaUpiCreateCustomNumberActivity) {
        WaEditText waEditText = indiaUpiCreateCustomNumberActivity.A03;
        if (waEditText == null) {
            throw C36331k8.A0d("customNumberEditText");
        }
        String A0Z = C36421kH.A0Z(waEditText);
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = indiaUpiCreateCustomNumberActivity.A07;
        if (indiaUpiMapperLinkViewModel == null) {
            throw C36331k8.A0d("indiaUpiNumberMapperLinkViewModel");
        }
        AnonymousClass00C.A0D(A0Z, 0);
        String str = null;
        if (AnonymousClass098.A07(A0Z, "0", false)) {
            str = indiaUpiMapperLinkViewModel.A08;
        } else {
            int length = A0Z.length();
            if (length < 8 || length > 9) {
                str = indiaUpiMapperLinkViewModel.A07;
            } else {
                int i = length - 2;
                if (A0Z.charAt(length - 1) == A0Z.charAt(i) && A0Z.charAt(i) == A0Z.charAt(length - 3)) {
                    str = indiaUpiMapperLinkViewModel.A06;
                }
            }
        }
        if (str == null) {
            TextInputLayout textInputLayout = indiaUpiCreateCustomNumberActivity.A01;
            if (textInputLayout == null) {
                throw C36331k8.A0d("enterCustomNumberTextInputLayout");
            }
            textInputLayout.setErrorEnabled(false);
            LinearLayout linearLayout = indiaUpiCreateCustomNumberActivity.A00;
            if (linearLayout == null) {
                throw C36331k8.A0d("customNumberBulletRulesContainer");
            }
            linearLayout.setVisibility(0);
            IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel2 = indiaUpiCreateCustomNumberActivity.A07;
            if (indiaUpiMapperLinkViewModel2 == null) {
                throw C36331k8.A0d("indiaUpiNumberMapperLinkViewModel");
            }
            indiaUpiMapperLinkViewModel2.A05.A0C(C179328jw.A00);
            AnonymousClass8gN r5 = indiaUpiMapperLinkViewModel2.A03;
            AE0 ae0 = indiaUpiMapperLinkViewModel2.A00;
            String A0E = ae0.A0E();
            if (A0E == null) {
                A0E = "";
            }
            r5.A01(ae0.A08(), C165617ti.A0P(C146356vT.A00(), String.class, A0Z, "upiAlias"), new B7X(indiaUpiMapperLinkViewModel2, 0), A0E, "numeric_id", "add");
            return;
        }
        LinearLayout linearLayout2 = indiaUpiCreateCustomNumberActivity.A00;
        if (linearLayout2 == null) {
            throw C36331k8.A0d("customNumberBulletRulesContainer");
        }
        linearLayout2.setVisibility(8);
        TextInputLayout textInputLayout2 = indiaUpiCreateCustomNumberActivity.A01;
        if (textInputLayout2 == null) {
            throw C36331k8.A0d("enterCustomNumberTextInputLayout");
        }
        textInputLayout2.setError(str);
        WaEditText waEditText2 = indiaUpiCreateCustomNumberActivity.A03;
        if (waEditText2 == null) {
            throw C36331k8.A0d("customNumberEditText");
        }
        waEditText2.requestFocus();
    }

    public static final void A07(IndiaUpiCreateCustomNumberActivity indiaUpiCreateCustomNumberActivity) {
        CircularProgressBar circularProgressBar = indiaUpiCreateCustomNumberActivity.A02;
        if (circularProgressBar == null) {
            throw C36331k8.A0d("progressBar");
        }
        circularProgressBar.setVisibility(8);
        WDSButton wDSButton = indiaUpiCreateCustomNumberActivity.A06;
        if (wDSButton == null) {
            throw C36331k8.A0d("continueButton");
        }
        wDSButton.setText(R.string.f12nameremoved);
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C165567td.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C165567td.A0v(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A05 = C165587tf.A0V(A0B);
            this.A04 = C165607th.A0W(r1);
        }
    }

    public void onBackPressed() {
        AF7 af7 = this.A05;
        if (af7 != null) {
            Integer A0i = C36361kB.A0i();
            af7.BOm(A0i, A0i, "create_numeric_upi_alias", C36331k8.A0e(this));
            super.onBackPressed();
            return;
        }
        throw C36331k8.A0d("fieldStatsLogger");
    }

    public IndiaUpiCreateCustomNumberActivity(int i) {
        this.A08 = false;
        C23140B7a.A00(this, 10);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        AF7 af7 = this.A05;
        if (af7 != null) {
            Integer A0m = C36381kD.A0m();
            Intent intent = getIntent();
            if (intent != null) {
                str = intent.getStringExtra("extra_referral_screen");
            } else {
                str = null;
            }
            af7.BOm(A0m, (Integer) null, "create_numeric_upi_alias", str);
            C165567td.A0j(this);
            setContentView((int) R.layout.f9nameremoved);
            C54932tn.A00(this, R.drawable.onboarding_actionbar_home_back);
            Parcelable parcelableExtra = getIntent().getParcelableExtra("extra_payment_name");
            this.A06 = (WDSButton) C36361kB.A0H(this, R.id.custom_number_continue);
            this.A02 = (CircularProgressBar) C36361kB.A0H(this, R.id.progress_bar);
            this.A03 = (WaEditText) C36361kB.A0H(this, R.id.enter_custom_upi_number);
            this.A01 = (TextInputLayout) C36361kB.A0H(this, R.id.custom_upi_number_input_layout);
            this.A00 = (LinearLayout) C36361kB.A0H(this, R.id.custom_number_bullet_list_container);
            A07(this);
            SpannableString spannableString = new SpannableString(getString(R.string.f12nameremoved));
            SpannableString spannableString2 = new SpannableString(getString(R.string.f12nameremoved));
            SpannableString spannableString3 = new SpannableString(getString(R.string.f12nameremoved));
            SpannableString[] spannableStringArr = new SpannableString[3];
            C90494aF.A1H(spannableString, spannableString2, spannableStringArr);
            for (SpannableString spannableString4 : C36341k9.A0m(spannableString3, spannableStringArr, 2)) {
                spannableString4.setSpan(new C91774cb(C36441kJ.A05(getResources(), R.dimen.f7nameremoved)), 0, spannableString4.length(), 0);
                TextView textView = new TextView(this);
                textView.setText(spannableString4);
                C36351kA.A15(textView.getResources(), textView, R.color.f6nameremoved);
                textView.setTextSize(0, (float) textView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                textView.setPadding(textView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, C36371kC.A03(textView, R.dimen.f7nameremoved), 0);
                LinearLayout linearLayout = this.A00;
                if (linearLayout == null) {
                    throw C36331k8.A0d("customNumberBulletRulesContainer");
                }
                linearLayout.addView(textView);
            }
            B7U b7u = new B7U(this, 5);
            WaEditText waEditText = this.A03;
            if (waEditText == null) {
                throw C36331k8.A0d("customNumberEditText");
            }
            waEditText.addTextChangedListener(b7u);
            WaEditText waEditText2 = this.A03;
            if (waEditText2 == null) {
                throw C36331k8.A0d("customNumberEditText");
            }
            waEditText2.setOnEditorActionListener(new C23141B7b(this, 1));
            IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = (IndiaUpiMapperLinkViewModel) C36441kJ.A0b(this).A00(IndiaUpiMapperLinkViewModel.class);
            this.A07 = indiaUpiMapperLinkViewModel;
            if (indiaUpiMapperLinkViewModel == null) {
                throw C36331k8.A0d("indiaUpiNumberMapperLinkViewModel");
            }
            indiaUpiMapperLinkViewModel.A05.A08(this, new BAD(parcelableExtra, this, 7));
            WDSButton wDSButton = this.A06;
            if (wDSButton == null) {
                throw C36331k8.A0d("continueButton");
            }
            C36421kH.A12(wDSButton, this, 11);
            onConfigurationChanged(AnonymousClass000.A0U(this));
            return;
        }
        throw C36331k8.A0d("fieldStatsLogger");
    }

    public IndiaUpiCreateCustomNumberActivity() {
        this(0);
    }
}
