package com.whatsapp.inappsupport.ui;

import X.AnonymousClass001;
import X.AnonymousClass13J;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16P;
import X.AnonymousClass1CF;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1M4;
import X.AnonymousClass2OI;
import X.AnonymousClass3DY;
import X.AnonymousClass3E6;
import X.AnonymousClass3FE;
import X.AnonymousClass3GU;
import X.AnonymousClass3P9;
import X.AnonymousClass3SE;
import X.AnonymousClass3XH;
import X.AnonymousClass4S7;
import X.AnonymousClass4XN;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19460v5;
import X.C20050ww;
import X.C20310xM;
import X.C20380xT;
import X.C21010yW;
import X.C220412q;
import X.C24341Cb;
import X.C24381Cf;
import X.C31211bS;
import X.C32681e1;
import X.C33751fs;
import X.C33761ft;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C50092kC;
import X.C50132kG;
import X.C66213Vc;
import X.C89334Wd;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import java.util.ArrayList;

public class ContactUsActivity extends AnonymousClass155 implements AnonymousClass4S7 {
    public EditText A00;
    public TextView A01;
    public AppCompatCheckBox A02;
    public C19460v5 A03;
    public AnonymousClass3DY A04;
    public C20050ww A05;
    public C33751fs A06;
    public C24341Cb A07;
    public C18820ts A08;
    public C220412q A09;
    public C24381Cf A0A;
    public C20310xM A0B;
    public C21010yW A0C;
    public AnonymousClass3XH A0D;
    public AnonymousClass1CF A0E;
    public C33761ft A0F;
    public AnonymousClass3E6 A0G;
    public C50132kG A0H;
    public AnonymousClass3SE A0I;
    public AnonymousClass147 A0J;
    public AnonymousClass1EV A0K;
    public AnonymousClass1EU A0L;
    public AnonymousClass16P A0M;
    public AnonymousClass3FE A0N;
    public C20380xT A0O;
    public C31211bS A0P;
    public AnonymousClass1M4 A0Q;
    public C32681e1 A0R;
    public AnonymousClass13J A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public AnonymousClass3GU A0W;
    public boolean A0X;

    public void A2x(int i) {
        if (i == 1) {
            finish();
        }
    }

    public void A2F() {
        if (!this.A0X) {
            this.A0X = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r2 = A0B2.A00;
            C36321k7.A0X(A0B2, r2, this, C36321k7.A05(A0B2, r2, this));
            this.A0R = C36351kA.A0p(r2);
            this.A05 = C36381kD.A0U(A0B2);
            this.A09 = C36351kA.A0a(A0B2);
            this.A0C = C36351kA.A0g(A0B2);
            this.A0Q = C36361kB.A0f(A0B2);
            this.A04 = C36361kB.A0Q(A0B2);
            this.A0O = C36331k8.A0I(A0B2);
            this.A08 = C36341k9.A0T(A0B2);
            this.A0L = C36381kD.A0f(A0B2);
            this.A0P = (C31211bS) A0B2.AFS.get();
            this.A07 = C36431kI.A0a(A0B2);
            this.A0E = C36361kB.A0b(A0B2);
            this.A0N = (AnonymousClass3FE) r2.A6C.get();
            this.A06 = C36361kB.A0X(r2);
            this.A0K = C36371kC.A0h(A0B2);
            this.A0A = C36371kC.A0Y(A0B2);
            this.A0G = (AnonymousClass3E6) r2.A60.get();
            this.A0M = A0B2.ALI();
            this.A03 = C36381kD.A0Q(A0B2.API);
            this.A0F = (C33761ft) A0B2.Abq.get();
            this.A0S = C36351kA.A0q(A0B2);
            this.A0B = C36371kC.A0Z(A0B2);
        }
    }

    public void A3i(int i) {
        AnonymousClass2OI r1 = new AnonymousClass2OI();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = this.A08.A06();
        this.A0C.Blw(r1);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 11) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            String str = null;
            if (intent != null) {
                if (intent.getIntExtra("com.whatsapp.inappsupport.ui.ContactUsActvity.support_type", 1) == 2) {
                    this.A0I.A01();
                    return;
                }
                str = intent.getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.debug_info");
            }
            this.A0I.A03(str);
        }
    }

    public void onBackPressed() {
        if (!TextUtils.isEmpty(C36331k8.A0f(this.A00))) {
            AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(new Object[0], R.string.f12nameremoved);
            AnonymousClass4XN r1 = new AnonymousClass4XN(this, 28);
            A032.A03 = R.string.f12nameremoved;
            A032.A06 = r1;
            C66213Vc r12 = C66213Vc.A00;
            A032.A04 = R.string.f12nameremoved;
            A032.A07 = r12;
            C36331k8.A12(A032.A02(), this);
        } else {
            super.onBackPressed();
        }
        ContactUsActivity contactUsActivity = this.A0I.A00;
        C18740tg.A06(contactUsActivity);
        contactUsActivity.A3i(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r13 = r18
            r0 = r19
            super.onCreate(r0)
            X.C36331k8.A0n(r13)
            X.0yC r12 = r13.A0D
            X.17Y r8 = r13.A05
            X.12q r9 = r13.A09
            X.1Cf r10 = r13.A0A
            X.0xM r11 = r13.A0B
            X.0wU r14 = r13.A04
            X.3SE r7 = new X.3SE
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r13.A0I = r7
            r0 = 2131624504(0x7f0e0238, float:1.887619E38)
            r13.setContentView((int) r0)
            r0 = 2131888767(0x7f120a7f, float:1.9412179E38)
            X.C36391kE.A15(r13, r0)
            androidx.appcompat.widget.Toolbar r2 = X.C36361kB.A0N(r13)
            X.0ts r0 = r13.A08
            X.AnonymousClass3UF.A0C(r13, r2, r0)
            X.3SE r0 = r13.A0I
            boolean r1 = r0.A04()
            r0 = 2131888767(0x7f120a7f, float:1.9412179E38)
            if (r1 == 0) goto L_0x0040
            r0 = 2131896445(0x7f12287d, float:1.9427751E38)
        L_0x0040:
            java.lang.String r0 = r13.getString(r0)
            r2.setTitle((java.lang.CharSequence) r0)
            r13.setSupportActionBar(r2)
            r1 = 16
            X.3Y3 r0 = new X.3Y3
            r0.<init>(r13, r1)
            r2.setNavigationOnClickListener(r0)
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r1 = "com.whatsapp.inappsupport.ui.ContactUsActivity.from"
            java.lang.String r0 = r3.getStringExtra(r1)
            r13.A0U = r0
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.suspendedEntityJid"
            android.os.Parcelable r0 = r3.getParcelableExtra(r0)
            X.147 r0 = (X.AnonymousClass147) r0
            r13.A0J = r0
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus"
            java.lang.String r0 = r3.getStringExtra(r0)
            r13.A0V = r0
            java.lang.String r0 = r13.A0U
            boolean r0 = X.C1906499t.A00(r0)
            if (r0 == 0) goto L_0x029d
            X.0yf r0 = r13.A06
            X.0yj r2 = X.C21100yf.A24
            java.lang.String r0 = r0.A07(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x029d
            X.0yf r0 = r13.A06
            java.lang.String r0 = r0.A07(r2)
        L_0x008e:
            r13.A0T = r0
            com.whatsapp.Me r0 = X.C36401kF.A0M(r13)
            r4 = 1
            if (r0 == 0) goto L_0x009f
            X.12U r0 = r13.A0A
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x00d2
        L_0x009f:
            X.0wN r5 = r13.A03
            r2 = 0
            java.lang.String r0 = "Unregistered client opening In App Support"
            r5.A0E(r0, r2, r4)
            java.lang.String r8 = r13.A0U
            java.lang.String r7 = r13.A0V
            java.lang.String r6 = r13.A0T
            android.content.Intent r5 = X.C36431kI.A0D()
            java.lang.String r2 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity"
            r5.setClassName(r2, r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.from"
            r5.putExtra(r0, r8)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.serverstatus"
            r5.putExtra(r0, r7)
            if (r6 == 0) goto L_0x00cb
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.emailAddress"
            r5.putExtra(r0, r6)
        L_0x00cb:
            r0 = 0
            r13.A33(r5, r0)
            r13.finish()
        L_0x00d2:
            r0 = 2131429498(0x7f0b087a, float:1.848067E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r13.A00 = r0
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.description"
            java.lang.String r2 = r3.getStringExtra(r0)
            if (r2 == 0) goto L_0x00f4
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x00f4
            android.widget.EditText r0 = r13.A00
            r0.setText(r2)
            X.3SE r0 = r13.A0I
            r0.A03 = r4
        L_0x00f4:
            r0 = 2131429499(0x7f0b087b, float:1.8480672E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r13, r0)
            r13.A01 = r0
            r0 = 2131429123(0x7f0b0703, float:1.847991E38)
            android.view.View r6 = r13.findViewById(r0)
            android.widget.EditText r0 = r13.A00
            java.lang.String r0 = X.C36361kB.A0n(r0)
            int r0 = r0.length()
            r2 = 0
            boolean r0 = X.C36371kC.A1T(r0, r4)
            r6.setEnabled(r0)
            android.widget.EditText r5 = r13.A00
            r0 = 13
            X.AnonymousClass4WJ.A00(r5, r13, r0)
            r0 = 17
            X.AnonymousClass3Y3.A00(r6, r13, r0)
            X.0yC r5 = r13.A0D
            r0 = 4150(0x1036, float:5.815E-42)
            boolean r0 = r5.A0E(r0)
            if (r0 != 0) goto L_0x01e4
            X.0yC r5 = r13.A0D
            r0 = 7044(0x1b84, float:9.871E-42)
            boolean r0 = r5.A0E(r0)
            if (r0 != 0) goto L_0x01e4
            r0 = 2131433849(0x7f0b1979, float:1.8489495E38)
            android.view.View r0 = r13.findViewById(r0)
            androidx.appcompat.widget.AppCompatCheckBox r0 = (androidx.appcompat.widget.AppCompatCheckBox) r0
            r13.A02 = r0
            r0.setChecked(r4)
            r0 = 2131433851(0x7f0b197b, float:1.84895E38)
            android.view.View r4 = r13.findViewById(r0)
            r0 = 18
            X.AnonymousClass3Y3.A00(r4, r13, r0)
            r0 = 2131433850(0x7f0b197a, float:1.8489497E38)
            com.whatsapp.TextEmojiLabel r4 = X.C36421kH.A0I(r13, r0)
            X.C36321k7.A0m(r13, r4)
            r0 = 2131888359(0x7f1208e7, float:1.9411351E38)
        L_0x015d:
            X.1e1 r12 = r13.A0R
            java.lang.String r15 = r13.getString(r0)
            int r17 = X.C36341k9.A05(r13)
            r0 = 29
            X.3v6 r14 = new X.3v6
            r14.<init>(r13, r0)
            java.lang.String r16 = "learn-more"
            android.text.SpannableStringBuilder r0 = r12.A03(r13, r14, r15, r16, r17)
            r4.setText(r0)
        L_0x0177:
            X.1EV r0 = r13.A0K
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x02ab
            X.1M4 r4 = r13.A0Q
            java.lang.String r0 = "BR"
            boolean r0 = r4.A05(r0)
            if (r0 != 0) goto L_0x0193
            X.1M4 r4 = r13.A0Q
            java.lang.String r0 = "IN"
            boolean r0 = r4.A05(r0)
            if (r0 == 0) goto L_0x02ab
        L_0x0193:
            r0 = 2131432583(0x7f0b1487, float:1.8486928E38)
            android.view.View r0 = r13.findViewById(r0)
            r12 = 0
            r0.setVisibility(r2)
            r0 = 2131432584(0x7f0b1488, float:1.848693E38)
            com.whatsapp.TextEmojiLabel r11 = X.C36421kH.A0I(r13, r0)
            r0 = 2131888356(0x7f1208e4, float:1.9411345E38)
            java.lang.String r0 = r13.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableStringBuilder r10 = X.C36441kJ.A0P(r0)
            android.text.style.URLSpan[] r9 = X.C36381kD.A1a(r10, r2)
            if (r9 == 0) goto L_0x02a5
            int r8 = r9.length
        L_0x01bb:
            if (r12 >= r8) goto L_0x02a5
            r7 = r9[r12]
            int r6 = r10.getSpanStart(r7)
            int r5 = r10.getSpanEnd(r7)
            int r4 = r10.getSpanFlags(r7)
            X.4Vv r0 = new X.4Vv
            r0.<init>(r13, r13, r13)
            r10.setSpan(r0, r6, r5, r4)
            r2 = 2132083113(0x7f1501a9, float:1.980636E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r13, r2)
            r10.setSpan(r0, r6, r5, r4)
            r10.removeSpan(r7)
            int r12 = r12 + 1
            goto L_0x01bb
        L_0x01e4:
            r0 = 2131433851(0x7f0b197b, float:1.84895E38)
            X.C36331k8.A11(r13, r0)
            X.0yC r5 = r13.A0D
            r0 = 7044(0x1b84, float:9.871E-42)
            boolean r5 = r5.A0E(r0)
            r0 = 2131429364(0x7f0b07f4, float:1.8480399E38)
            if (r5 == 0) goto L_0x028e
            android.widget.TextView r5 = X.C36391kE.A0Q(r13, r0)
            X.3SE r0 = r13.A0I
            boolean r0 = r0.A04()
            int r0 = X.C36381kD.A00(r0)
            r5.setVisibility(r0)
            X.0v5 r0 = r13.A03
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x021a
            r0 = 2131888361(0x7f1208e9, float:1.9411355E38)
            java.lang.CharSequence r0 = r13.getText(r0)
            r5.setText(r0)
        L_0x021a:
            r0 = 2131429120(0x7f0b0700, float:1.8479904E38)
            X.C36331k8.A11(r13, r0)
            r0 = 2131433516(0x7f0b182c, float:1.848882E38)
            android.view.View r9 = r13.findViewById(r0)
            r6 = 0
            r9.setVisibility(r2)
            r0 = 2131429122(0x7f0b0702, float:1.8479908E38)
            android.view.View r8 = r13.findViewById(r0)
            android.view.ViewTreeObserver r7 = r9.getViewTreeObserver()
            r5 = 2
            X.4Yl r0 = new X.4Yl
            r0.<init>(r9, r8, r13, r5)
            r7.addOnPreDrawListener(r0)
            r0 = 2131429365(0x7f0b07f5, float:1.84804E38)
            com.whatsapp.TextEmojiLabel r5 = X.C36421kH.A0I(r13, r0)
            r5.setVisibility(r2)
            X.C36321k7.A0m(r13, r5)
            r0 = 2131888360(0x7f1208e8, float:1.9411353E38)
            X.1e1 r12 = r13.A0R
            java.lang.String r15 = r13.getString(r0)
            int r17 = X.C36341k9.A05(r13)
            r0 = 29
            X.3v6 r14 = new X.3v6
            r14.<init>(r13, r0)
            java.lang.String r16 = "learn-more"
            android.text.SpannableStringBuilder r0 = r12.A03(r13, r14, r15, r16, r17)
            r5.setText(r0)
            r0 = 2131433517(0x7f0b182d, float:1.8488822E38)
            android.view.View r5 = r13.findViewById(r0)
            android.widget.EditText r0 = r13.A00
            java.lang.String r0 = X.C36361kB.A0n(r0)
            int r0 = r0.length()
            if (r0 < r4) goto L_0x027d
            r6 = 1
        L_0x027d:
            r5.setEnabled(r6)
            android.widget.EditText r4 = r13.A00
            r0 = 14
            X.AnonymousClass4WJ.A00(r4, r13, r0)
            r0 = 15
            X.AnonymousClass3Y3.A00(r5, r13, r0)
            goto L_0x0177
        L_0x028e:
            com.whatsapp.TextEmojiLabel r4 = X.C36421kH.A0I(r13, r0)
            r4.setVisibility(r2)
            X.C36321k7.A0m(r13, r4)
            r0 = 2131888352(0x7f1208e0, float:1.9411337E38)
            goto L_0x015d
        L_0x029d:
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.emailAddress"
            java.lang.String r0 = r3.getStringExtra(r0)
            goto L_0x008e
        L_0x02a5:
            X.C36321k7.A0m(r13, r11)
            r11.setText(r10)
        L_0x02ab:
            r0 = 2131429122(0x7f0b0702, float:1.8479908E38)
            android.view.View r6 = r13.findViewById(r0)
            r0 = 2131429120(0x7f0b0700, float:1.8479904E38)
            android.view.View r5 = r13.findViewById(r0)
            android.view.ViewTreeObserver r4 = r5.getViewTreeObserver()
            r2 = 1
            X.4Yl r0 = new X.4Yl
            r0.<init>(r5, r6, r13, r2)
            r4.addOnPreDrawListener(r0)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.supportUserContext"
            android.os.Parcelable r0 = r3.getParcelableExtra(r0)
            X.3XH r0 = (X.AnonymousClass3XH) r0
            r13.A0D = r0
            X.3GU r0 = X.AnonymousClass3GU.A00(r13, r6, r5)
            r13.A0W = r0
            r0.A01()
            X.3SE r2 = r13.A0I
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = r2.A00
            X.C18740tg.A06(r0)
            X.C18740tg.A06(r0)
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r0 = "biz-directory-browsing"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02fb
            com.whatsapp.inappsupport.ui.ContactUsActivity r1 = r2.A00
            r0 = 2131433852(0x7f0b197c, float:1.8489501E38)
            X.C36331k8.A11(r1, r0)
        L_0x02fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupport.ui.ContactUsActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ContactUsActivity contactUsActivity = this.A0I.A00;
        C18740tg.A06(contactUsActivity);
        if ("biz-directory-browsing".equals(contactUsActivity.getIntent().getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from")) || this.A0I.A04()) {
            return true;
        }
        menu.add(0, R.id.menuitem_contact_us_email, 0, getString(R.string.f12nameremoved)).setShowAsAction(0);
        return true;
    }

    public void onStop() {
        AnonymousClass3SE r2 = this.A0I;
        r2.A01 = null;
        r2.A08.unregisterObserver(r2.A07);
        super.onStop();
    }

    public ContactUsActivity(int i) {
        this.A0X = false;
        C89334Wd.A00(this, 46);
    }

    public static ArrayList A01(ContactUsActivity contactUsActivity, ArrayList arrayList) {
        Bundle A072 = AnonymousClass001.A07();
        A072.putParcelableArrayList((String) null, arrayList);
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(A072);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 450000) {
            return A01(contactUsActivity, C36441kJ.A15(arrayList.subList(0, arrayList.size() / 2)));
        }
        return arrayList;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0W.A01();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0I.A00 = null;
        C50092kC r1 = this.A0N.A00;
        if (r1 != null) {
            r1.A0D(false);
        }
        C50132kG r12 = this.A0H;
        if (r12 != null) {
            r12.A0D(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            AnonymousClass3SE r1 = this.A0I;
            ContactUsActivity contactUsActivity = r1.A00;
            C18740tg.A06(contactUsActivity);
            contactUsActivity.A3i(1);
            r1.A00.finish();
            return true;
        } else if (itemId != R.id.menuitem_contact_us_email) {
            return false;
        } else {
            this.A0I.A02(2);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.A00.clearFocus();
    }

    public void Beo(boolean z) {
        finish();
    }

    public ContactUsActivity() {
        this(0);
    }
}
