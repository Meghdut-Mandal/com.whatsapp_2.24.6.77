package com.whatsapp.companionmode.registration;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass3LD;
import X.AnonymousClass3UF;
import X.AnonymousClass4VU;
import X.AnonymousClass4W1;
import X.C07690Yx;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19630wG;
import X.C25951Ih;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C37351mE;
import X.C65983Uf;
import X.C89324Wc;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

public final class RegisterAsCompanionLinkCodeActivity extends AnonymousClass155 {
    public LinearLayout A00;
    public ProgressBar A01;
    public C25951Ih A02;
    public C19630wG A03;
    public AnonymousClass005 A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final ArrayList A09;
    public final AnonymousClass3LD A0A;

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putString("link_code", this.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r3 < 4) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r6, java.lang.String r7) {
        /*
            r6.A06 = r7
            android.widget.ProgressBar r0 = r6.A01
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "loadingSpinner"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x000d:
            r5 = 4
            r0.setVisibility(r5)
            android.widget.LinearLayout r0 = r6.A00
            java.lang.String r4 = "codeInputBoxesLinearLayout"
            if (r0 != 0) goto L_0x001c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x001c:
            r3 = 0
            r0.setVisibility(r3)
            int r1 = r7.length()
            r0 = 8
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            X.C18740tg.A0B(r0)
        L_0x002d:
            java.util.ArrayList r2 = r6.A09
            java.lang.Object r1 = r2.get(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            char r0 = r7.charAt(r3)
        L_0x0039:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x003d:
            r1.setText(r0)
            int r3 = r3 + 1
            r0 = 9
            if (r3 >= r0) goto L_0x0060
            if (r3 != r5) goto L_0x0051
            java.lang.Object r1 = r2.get(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = "-"
            goto L_0x003d
        L_0x0051:
            if (r3 < r5) goto L_0x002d
            java.lang.Object r1 = r2.get(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r3 + -1
            char r0 = r7.charAt(r0)
            goto L_0x0039
        L_0x0060:
            android.widget.LinearLayout r0 = r6.A00
            if (r0 != 0) goto L_0x0069
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x0069:
            r0.setContentDescription(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity.A01(com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity, java.lang.String):void");
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A03 = C36351kA.A0W(A0B);
            this.A04 = C18840tu.A00(A0B.A08);
            this.A02 = (C25951Ih) A0B.A1z.get();
        }
    }

    public void onBackPressed() {
        C25951Ih r0 = this.A02;
        if (r0 != null) {
            C25951Ih.A00(r0).A04();
            super.onBackPressed();
            return;
        }
        throw C36331k8.A0d("companionRegistrationManager");
    }

    public RegisterAsCompanionLinkCodeActivity(int i) {
        this.A08 = false;
        C89324Wc.A00(this, 26);
    }

    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A01 = (ProgressBar) C36361kB.A0H(this, R.id.loading_spinner);
        this.A00 = (LinearLayout) C36361kB.A0G(this.A00, R.id.link_code_boxes);
        int i = 0;
        do {
            WaTextView waTextView = new WaTextView(new ContextThemeWrapper(this, R.style.f13nameremoved));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            layoutParams.weight = 1.0f;
            layoutParams.gravity = 17;
            waTextView.setLayoutParams(layoutParams);
            this.A09.add(waTextView);
            LinearLayout linearLayout = this.A00;
            if (linearLayout == null) {
                throw C36331k8.A0d("codeInputBoxesLinearLayout");
            }
            linearLayout.addView(waTextView);
            i++;
        } while (i < 9);
        TextView A0Q = C36391kE.A0Q(this, R.id.companion_registration_linking_instructions_step_two);
        Spanned fromHtml = Html.fromHtml(getString(R.string.f12nameremoved));
        AnonymousClass00C.A08(fromHtml);
        SpannableStringBuilder A012 = C37351mE.A01(A0Q.getPaint(), AnonymousClass3UF.A08(C36381kD.A0H(this, R.drawable.ic_ios_settings), C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved)), fromHtml, "[settings_icon]");
        A0Q.setText(C37351mE.A01(A0Q.getPaint(), AnonymousClass3UF.A08(C36381kD.A0H(this, R.drawable.android_overflow_icon), C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved)), A012, "[overflow_menu_icon]"));
        C36361kB.A1P(getString(R.string.f12nameremoved), C36391kE.A0Q(this, R.id.companion_registration_linking_instructions_step_three));
        C36361kB.A1P(getString(R.string.f12nameremoved), C36391kE.A0Q(this, R.id.companion_registration_linking_instructions_step_four));
        TextView A0Q2 = C36391kE.A0Q(this, R.id.companion_registration_linking_instructions_step_five);
        A0Q2.setText(R.string.f12nameremoved);
        A0Q2.setVisibility(0);
        C36341k9.A13(this, R.id.linking_instructions_step_five_number, 0);
        if (C36401kF.A1X(this.A00)) {
            View findViewById = findViewById(R.id.linking_instructions_constraint_layout);
            AnonymousClass00C.A0E(findViewById, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
            C07690Yx r1 = new C07690Yx();
            r1.A0B(constraintLayout);
            r1.A07(R.id.companion_registration_linking_instructions_step_one);
            r1.A07(R.id.companion_registration_linking_instructions_step_two);
            r1.A07(R.id.companion_registration_linking_instructions_step_three);
            r1.A07(R.id.companion_registration_linking_instructions_step_four);
            r1.A09(constraintLayout);
        }
        String stringExtra = getIntent().getStringExtra("country_code");
        String stringExtra2 = getIntent().getStringExtra("phone_number");
        if (stringExtra == null || stringExtra2 == null) {
            throw AnonymousClass001.A0A("RegisterAsCompanionLinkCodeActivity/setupNumberPreview/cc or pn is null");
        }
        this.A05 = stringExtra;
        this.A07 = stringExtra2;
        TextView A0Q3 = C36391kE.A0Q(this, R.id.companion_registration_show_link_code_hint);
        String A0m = C36361kB.A0m(this, R.string.f12nameremoved);
        Object[] A0M = AnonymousClass001.A0M();
        String str = this.A05;
        if (str == null) {
            throw C36331k8.A0d("cc");
        }
        String str2 = this.A07;
        if (str2 == null) {
            throw C36331k8.A0d("pn");
        }
        A0M[0] = C65983Uf.A0E(str, str2);
        Spanned fromHtml2 = Html.fromHtml(C36391kE.A0v(this, A0m, A0M, 1, R.string.f12nameremoved));
        AnonymousClass00C.A08(fromHtml2);
        SpannableStringBuilder A0P = C36441kJ.A0P(fromHtml2);
        A0P.setSpan(new AnonymousClass4VU(this, 1), (fromHtml2.length() - A0m.length()) - 1, fromHtml2.length() - 1, 33);
        A0Q3.setText(A0P);
        A0Q3.setLinksClickable(true);
        C36391kE.A1J(A0Q3);
        if (!(bundle == null || (string = bundle.getString("link_code")) == null)) {
            A01(this, string);
        }
        C25951Ih r0 = this.A02;
        if (r0 != null) {
            C25951Ih.A00(r0).A06(this.A0A);
            return;
        }
        throw C36331k8.A0d("companionRegistrationManager");
    }

    public void onDestroy() {
        super.onDestroy();
        C25951Ih r0 = this.A02;
        if (r0 != null) {
            C25951Ih.A00(r0).A07(this.A0A);
            return;
        }
        throw C36331k8.A0d("companionRegistrationManager");
    }

    public RegisterAsCompanionLinkCodeActivity() {
        this(0);
        this.A09 = AnonymousClass001.A0I();
        this.A0A = new AnonymousClass4W1(this, 2);
    }
}
