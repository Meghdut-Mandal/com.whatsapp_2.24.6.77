package com.whatsapp.payments.ui.compliance;

import X.AF7;
import X.AVY;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass0BN;
import X.AnonymousClass1N2;
import X.AnonymousClass1N3;
import X.B7U;
import X.C195389Uc;
import X.C19770wU;
import X.C207419vB;
import X.C20810yC;
import X.C21060yb;
import X.C23033B1e;
import X.C32681e1;
import X.C34011gJ;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C90474aD;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.base.WaFragment;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class ConfirmLegalNameBottomSheetFragment extends WaFragment {
    public View A00;
    public LinearLayout A01;
    public ProgressBar A02;
    public ScrollView A03;
    public TextEmojiLabel A04;
    public WaEditText A05;
    public AnonymousClass1N3 A06;
    public C21060yb A07;
    public C20810yC A08;
    public C195389Uc A09;
    public C23033B1e A0A;
    public AnonymousClass1N2 A0B;
    public C32681e1 A0C;
    public C19770wU A0D;
    public WDSButton A0E;
    public final ViewTreeObserver.OnGlobalLayoutListener A0F = new C207419vB(this);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        boolean z = false;
        this.A00 = C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
        TextEmojiLabel A0O = C36351kA.A0O(A1a(), R.id.confirm_legal_name_desc_view);
        AnonymousClass00C.A0D(A0O, 0);
        this.A04 = A0O;
        WaEditText waEditText = (WaEditText) C36361kB.A0G(A1a(), R.id.full_name_edit_view);
        AnonymousClass00C.A0D(waEditText, 0);
        this.A05 = waEditText;
        ProgressBar progressBar = (ProgressBar) C36361kB.A0G(A1a(), R.id.loading_progress);
        AnonymousClass00C.A0D(progressBar, 0);
        this.A02 = progressBar;
        LinearLayout linearLayout = (LinearLayout) C36361kB.A0G(A1a(), R.id.confirm_legal_name_input_container);
        AnonymousClass00C.A0D(linearLayout, 0);
        this.A01 = linearLayout;
        TextEmojiLabel textEmojiLabel = this.A04;
        if (textEmojiLabel != null) {
            Rect rect = AnonymousClass0BN.A0A;
            C21060yb r1 = this.A07;
            if (r1 != null) {
                textEmojiLabel.setAccessibilityHelper(new C34011gJ(textEmojiLabel, r1));
                TextEmojiLabel textEmojiLabel2 = this.A04;
                if (textEmojiLabel2 != null) {
                    C20810yC r0 = this.A08;
                    if (r0 != null) {
                        C36331k8.A1A(r0, textEmojiLabel2);
                        TextEmojiLabel textEmojiLabel3 = this.A04;
                        if (textEmojiLabel3 != null) {
                            textEmojiLabel3.setText(A1Z());
                            WDSButton wDSButton = (WDSButton) C36361kB.A0G(A1a(), R.id.continue_btn);
                            AnonymousClass00C.A0D(wDSButton, 0);
                            this.A0E = wDSButton;
                            ScrollView scrollView = (ScrollView) C36361kB.A0G(A1a(), R.id.compliance_name_scroll_view);
                            AnonymousClass00C.A0D(scrollView, 0);
                            this.A03 = scrollView;
                            ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.addOnGlobalLayoutListener(this.A0F);
                            }
                            AnonymousClass02E r3 = this.A0I;
                            AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type com.whatsapp.payments.ui.PaymentBottomSheet");
                            WaEditText waEditText2 = this.A05;
                            if (waEditText2 != null) {
                                waEditText2.addTextChangedListener(new B7U(this, 4));
                                WaEditText waEditText3 = this.A05;
                                if (waEditText3 != null) {
                                    if (C90474aD.A05(waEditText3.getText()) > 0) {
                                        z = true;
                                    }
                                    A1c(z);
                                    WDSButton wDSButton2 = this.A0E;
                                    if (wDSButton2 != null) {
                                        C36371kC.A1F(wDSButton2, this, r3, 40);
                                        C36371kC.A1F(C36361kB.A0G(A1a(), R.id.close_btn), this, r3, 41);
                                        return A1a();
                                    }
                                    throw C36331k8.A0d("continueButton");
                                }
                                throw C36331k8.A0d("nameEditText");
                            }
                            throw C36331k8.A0d("nameEditText");
                        }
                        throw C36331k8.A0d("descText");
                    }
                    throw C36321k7.A07();
                }
                throw C36331k8.A0d("descText");
            }
            throw C36331k8.A0d("systemServices");
        }
        throw C36331k8.A0d("descText");
    }

    public void A1b(Integer num, String str, String str2, int i) {
        IndiaConfirmLegalNameBottomSheetFragment indiaConfirmLegalNameBottomSheetFragment = (IndiaConfirmLegalNameBottomSheetFragment) this;
        AF7 af7 = indiaConfirmLegalNameBottomSheetFragment.A00;
        if (af7 != null) {
            af7.A09(Integer.valueOf(i), num, str, indiaConfirmLegalNameBottomSheetFragment.A03, indiaConfirmLegalNameBottomSheetFragment.A02, indiaConfirmLegalNameBottomSheetFragment.A01, true);
            return;
        }
        throw C36331k8.A0d("indiaUpiFieldStatsLogger");
    }

    public void A1J() {
        ScrollView scrollView = this.A03;
        if (scrollView != null) {
            ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.A0F);
            }
            super.A1J();
            return;
        }
        throw C36331k8.A0d("scrollView");
    }

    public SpannableString A1Z() {
        C32681e1 r2 = this.A0C;
        if (r2 != null) {
            return r2.A01(A1D(), A0n(R.string.f12nameremoved), new Runnable[]{new AVY(this, 38)}, new String[]{"p2m-compliance-learn-more"}, new String[]{""});
        }
        throw C36331k8.A0b();
    }

    public final View A1a() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        throw C36331k8.A0d("rootView");
    }

    public final void A1c(boolean z) {
        WDSButton wDSButton = this.A0E;
        if (wDSButton != null) {
            wDSButton.setEnabled(z);
            return;
        }
        throw C36331k8.A0d("continueButton");
    }
}
