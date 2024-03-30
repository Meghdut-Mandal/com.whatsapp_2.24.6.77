package com.whatsapp.payments.ui;

import X.AnonymousClass190;
import X.B7Z;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;

public class IndiaUpiOnboardingErrorEducationActivity extends C179128jE {
    public int A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public WDSButton A04;
    public boolean A05;

    public void onBackPressed() {
        A10(this, 1);
        if (this.A00 != 4059001) {
            A0z(this);
        } else {
            finish();
        }
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0143 A[LOOP:0: B:32:0x013d->B:34:0x0143, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r2 = r17
            r0 = r18
            super.onCreate(r0)
            r0 = 2131625199(0x7f0e04ef, float:1.88776E38)
            r2.setContentView((int) r0)
            r1 = 2131233405(0x7f080a7d, float:1.8082947E38)
            r0 = 2131433566(0x7f0b185e, float:1.8488921E38)
            r2.A3y(r1, r0)
            X.07B r3 = r2.getSupportActionBar()
            r1 = 1
            if (r3 == 0) goto L_0x002a
            r0 = 2131892545(0x7f121941, float:1.9419841E38)
            java.lang.String r0 = r2.getString(r0)
            r3.A0Q(r0)
            r3.A0U(r1)
        L_0x002a:
            r0 = 2131430755(0x7f0b0d63, float:1.848322E38)
            android.widget.ImageView r0 = X.C36411kG.A0Q(r2, r0)
            r2.A01 = r0
            r0 = 2131430020(0x7f0b0a84, float:1.848173E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r2, r0)
            r2.A03 = r0
            r0 = 2131430019(0x7f0b0a83, float:1.8481727E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r2, r0)
            r2.A02 = r0
            r0 = 2131432199(0x7f0b1307, float:1.8486149E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r2.A04 = r0
            android.content.Intent r4 = r2.getIntent()
            r0 = -1
            java.lang.String r3 = "error_code"
            int r0 = r4.getIntExtra(r3, r0)
            r2.A00 = r0
            r4 = 0
            X.6Ps[] r0 = new X.C131606Ps[r4]
            r5 = 0
            X.6Ps r9 = new X.6Ps
            r9.<init>(r5, r0)
            int r0 = r2.A00
            r9.A02(r3, r0)
            X.AF7 r8 = r2.A0S
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r6 = "extra_referral_screen"
            java.lang.String r13 = r0.getStringExtra(r6)
            java.lang.String r7 = "error"
            r11 = r5
            r12 = r7
            r10 = r16
            r8.BOp(r9, r10, r11, r12, r13)
            int r3 = r2.A00
            r0 = 446(0x1be, float:6.25E-43)
            if (r3 == r0) goto L_0x032e
            r0 = 11498(0x2cea, float:1.6112E-41)
            if (r3 == r0) goto L_0x034b
            r0 = 1383026(0x151a72, float:1.938032E-39)
            if (r3 == r0) goto L_0x0309
            r0 = 4059001(0x3def79, float:5.687872E-39)
            if (r3 == r0) goto L_0x02dc
            android.content.Intent r0 = r2.getIntent()
            int r8 = r0.getIntExtra(r7, r4)
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "error_text"
            java.lang.String r3 = r3.getStringExtra(r0)
            r0 = 2131895292(0x7f1223fc, float:1.9425413E38)
            if (r8 == r0) goto L_0x0309
            android.content.Intent r7 = r2.getIntent()
            java.lang.String r0 = "error_type"
            int r12 = r7.getIntExtra(r0, r4)
            android.os.Parcelable r7 = X.C173858Tk.A07(r2)
            X.8bA r7 = (X.C175848bA) r7
            java.lang.String r10 = ""
            if (r7 == 0) goto L_0x025a
            X.6c7 r0 = r7.A01
            java.lang.Object r10 = X.C165577te.A0g(r0)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r13 = r7.A04
        L_0x00cd:
            r14 = 5
            if (r12 < r1) goto L_0x025d
            r0 = 4
            if (r12 > r0) goto L_0x025d
            X.0wQ r0 = r2.A02
            X.142 r0 = X.C36381kD.A0T(r0)
            java.lang.String r7 = X.AnonymousClass3U8.A03(r0)
            r3 = 0
            if (r7 == 0) goto L_0x00e8
            r3 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r3 = r7.replace(r3, r0)
        L_0x00e8:
            X.0ts r0 = r2.A00
            java.lang.String r11 = r0.A0H(r3)
            r0 = 2131430234(0x7f0b0b5a, float:1.8482163E38)
            android.view.View r7 = r2.findViewById(r0)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r0 = 2131430235(0x7f0b0b5b, float:1.8482165E38)
            android.widget.TextView r9 = X.C36391kE.A0P(r7, r0)
            java.util.ArrayList r3 = X.C36441kJ.A14(r14)
            r14 = 2
            if (r12 != r1) goto L_0x01b6
            com.whatsapp.wds.components.button.WDSButton r9 = r2.A04
            r0 = 2131892706(0x7f1219e2, float:1.9420168E38)
            r9.setText(r0)
            android.widget.TextView r15 = r2.A03
            r12 = 2131886679(0x7f120257, float:1.9407944E38)
            java.lang.Object[] r9 = new java.lang.Object[r1]
            X.0ts r0 = r2.A00
            java.lang.String r0 = r0.A0G(r10)
            r9[r4] = r0
            X.C36341k9.A0s(r2, r15, r9, r12)
            r0 = 2131889942(0x7f120f16, float:1.9414562E38)
            r10 = 2131889942(0x7f120f16, float:1.9414562E38)
            if (r8 != r0) goto L_0x0139
            android.widget.TextView r9 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x01a7
            r0 = 2131889943(0x7f120f17, float:1.9414564E38)
            java.lang.String r1 = X.C36351kA.A0w(r2, r11, r1, r0)
        L_0x0136:
            r9.setText(r1)
        L_0x0139:
            java.util.Iterator r10 = r3.iterator()
        L_0x013d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x029a
            java.lang.String r9 = X.AnonymousClass001.A0C(r10)
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r9)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131167887(0x7f070a8f, float:1.795006E38)
            int r0 = X.C36441kJ.A05(r1, r0)
            X.4cb r1 = new X.4cb
            r1.<init>(r0)
            int r0 = r9.length()
            r8.setSpan(r1, r4, r0, r4)
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r2)
            r9.setText(r8)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131102153(0x7f0609c9, float:1.7816736E38)
            X.C36351kA.A15(r1, r9, r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131167844(0x7f070a64, float:1.7949973E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r9.setTextSize(r4, r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131167843(0x7f070a63, float:1.7949971E38)
            r8 = 2131167843(0x7f070a63, float:1.7949971E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.setLineSpacing(r1, r0)
            android.content.res.Resources r0 = r2.getResources()
            int r0 = r0.getDimensionPixelSize(r8)
            r9.setPadding(r4, r4, r4, r0)
            r7.addView(r9)
            goto L_0x013d
        L_0x01a7:
            java.lang.Object[] r8 = new java.lang.Object[r14]
            r8[r4] = r11
            X.0ts r0 = r2.A00
            java.lang.String r0 = r0.A0H(r13)
            java.lang.String r1 = X.C36391kE.A0v(r2, r0, r8, r1, r10)
            goto L_0x0136
        L_0x01b6:
            if (r12 != r14) goto L_0x0204
            android.widget.ImageView r3 = r2.A01
            if (r3 == 0) goto L_0x01c2
            r0 = 2131232378(0x7f08067a, float:1.8080864E38)
            X.C36391kE.A18(r2, r3, r0)
        L_0x01c2:
            android.widget.TextView r3 = r2.A03
            r0 = 2131888789(0x7f120a95, float:1.9412223E38)
            r3.setText(r0)
            r0 = 2131888786(0x7f120a92, float:1.9412217E38)
            r9.setText(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            r0 = 2131888782(0x7f120a8e, float:1.941221E38)
            java.lang.String r0 = X.C36351kA.A0w(r2, r11, r1, r0)
            r3.add(r0)
            r0 = 2131888783(0x7f120a8f, float:1.9412211E38)
            java.lang.String r0 = r2.getString(r0)
            r3.add(r0)
            r0 = 2131888784(0x7f120a90, float:1.9412213E38)
            java.lang.String r0 = r2.getString(r0)
            r3.add(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r8 > r0) goto L_0x0139
            r0 = 2131888785(0x7f120a91, float:1.9412215E38)
            java.lang.String r0 = X.C36351kA.A0w(r2, r11, r1, r0)
            r3.add(r0)
            goto L_0x0139
        L_0x0204:
            r0 = 3
            if (r12 != r0) goto L_0x023e
            android.widget.ImageView r3 = r2.A01
            if (r3 == 0) goto L_0x0211
            r0 = 2131232378(0x7f08067a, float:1.8080864E38)
            X.C36391kE.A18(r2, r3, r0)
        L_0x0211:
            android.widget.TextView r3 = r2.A03
            r0 = 2131888790(0x7f120a96, float:1.9412225E38)
            r3.setText(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r8 > r0) goto L_0x022d
            r0 = 2131888788(0x7f120a94, float:1.9412221E38)
            java.lang.String r0 = r2.getString(r0)
            r3.add(r0)
        L_0x022d:
            r0 = 2131888781(0x7f120a8d, float:1.9412207E38)
            java.lang.String r1 = X.C36351kA.A0w(r2, r11, r1, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0136
            android.widget.TextView r9 = r2.A02
            goto L_0x0136
        L_0x023e:
            android.widget.ImageView r1 = r2.A01
            if (r1 == 0) goto L_0x0248
            r0 = 2131232378(0x7f08067a, float:1.8080864E38)
            X.C36391kE.A18(r2, r1, r0)
        L_0x0248:
            android.widget.TextView r1 = r2.A03
            r0 = 2131888789(0x7f120a95, float:1.9412223E38)
            r1.setText(r0)
            android.widget.TextView r1 = r2.A02
            r0 = 2131888787(0x7f120a93, float:1.941222E38)
            r1.setText(r0)
            goto L_0x0139
        L_0x025a:
            r13 = r10
            goto L_0x00cd
        L_0x025d:
            if (r8 <= 0) goto L_0x02aa
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0277
            if (r12 != r14) goto L_0x0277
        L_0x0267:
            android.widget.TextView r3 = r2.A02
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.0ts r0 = r2.A00
            java.lang.String r0 = r0.A0G(r10)
            r1[r4] = r0
            X.C36341k9.A0s(r2, r3, r1, r8)
            goto L_0x02aa
        L_0x0277:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0281
            r0 = 6
            if (r12 != r0) goto L_0x0281
            goto L_0x0267
        L_0x0281:
            r0 = 7
            if (r12 != r0) goto L_0x0292
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 2131892706(0x7f1219e2, float:1.9420168E38)
            r1.setText(r0)
        L_0x028c:
            android.widget.TextView r0 = r2.A02
            r0.setText(r3)
            goto L_0x02aa
        L_0x0292:
            if (r3 != 0) goto L_0x028c
            android.widget.TextView r0 = r2.A02
            r0.setText(r8)
            goto L_0x02aa
        L_0x029a:
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x02aa
            r7.setVisibility(r4)
            android.widget.TextView r1 = r2.A02
            r0 = 8
            r1.setVisibility(r0)
        L_0x02aa:
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 28
            X.C207359uy.A00(r1, r2, r0)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "extra_error_screen_name"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L_0x02d4
            X.AF7 r4 = r2.A0S
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r3 = r0.getStringExtra(r1)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = r0.getStringExtra(r6)
            r0 = r16
            r4.BOm(r0, r5, r3, r1)
        L_0x02d4:
            android.content.res.Configuration r0 = X.AnonymousClass000.A0U(r2)
            r2.onConfigurationChanged(r0)
            return
        L_0x02dc:
            r1 = 2131232378(0x7f08067a, float:1.8080864E38)
            android.widget.ImageView r0 = r2.A01
            X.C36391kE.A18(r2, r0, r1)
            r1 = 2131892709(0x7f1219e5, float:1.9420174E38)
            android.widget.TextView r0 = r2.A03
            r0.setText(r1)
            r1 = 2131892408(0x7f1218b8, float:1.9419563E38)
            android.widget.TextView r0 = r2.A02
            r0.setText(r1)
            r0 = 25
            X.9uy r3 = new X.9uy
            r3.<init>(r2, r0)
            r1 = 2131892706(0x7f1219e2, float:1.9420168E38)
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A04
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A04
            r0.setOnClickListener(r3)
            return
        L_0x0309:
            r1 = 2131231983(0x7f0804ef, float:1.8080062E38)
            android.widget.ImageView r0 = r2.A01
            X.C36391kE.A18(r2, r0, r1)
            r1 = 2131895293(0x7f1223fd, float:1.9425415E38)
            android.widget.TextView r0 = r2.A03
            r0.setText(r1)
            r1 = 2131895292(0x7f1223fc, float:1.9425413E38)
            android.widget.TextView r0 = r2.A02
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 2131895291(0x7f1223fb, float:1.942541E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 29
            goto L_0x0367
        L_0x032e:
            r1 = 2131231983(0x7f0804ef, float:1.8080062E38)
            android.widget.ImageView r0 = r2.A01
            X.C36391kE.A18(r2, r0, r1)
            r1 = 2131892709(0x7f1219e5, float:1.9420174E38)
            android.widget.TextView r0 = r2.A03
            r0.setText(r1)
            r1 = 2131895476(0x7f1224b4, float:1.9425786E38)
            android.widget.TextView r0 = r2.A02
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 27
            goto L_0x0367
        L_0x034b:
            r1 = 2131231983(0x7f0804ef, float:1.8080062E38)
            android.widget.ImageView r0 = r2.A01
            X.C36391kE.A18(r2, r0, r1)
            r1 = 2131886680(0x7f120258, float:1.9407946E38)
            android.widget.TextView r0 = r2.A03
            r0.setText(r1)
            r1 = 2131895322(0x7f12241a, float:1.9425474E38)
            android.widget.TextView r0 = r2.A02
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 26
        L_0x0367:
            X.C207359uy.A00(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiOnboardingErrorEducationActivity(int i) {
        this.A05 = false;
        B7Z.A00(this, 20);
    }

    public static void A0z(IndiaUpiOnboardingErrorEducationActivity indiaUpiOnboardingErrorEducationActivity) {
        Intent A0G;
        int i = 0;
        if (indiaUpiOnboardingErrorEducationActivity.getIntent() != null) {
            i = indiaUpiOnboardingErrorEducationActivity.getIntent().getIntExtra("try_again", 0);
        }
        if (indiaUpiOnboardingErrorEducationActivity.A0k || i <= 0) {
            A0G = C165597tg.A0G(indiaUpiOnboardingErrorEducationActivity);
        } else {
            if (i == 1) {
                A0G = AnonymousClass190.A08(indiaUpiOnboardingErrorEducationActivity);
            }
            indiaUpiOnboardingErrorEducationActivity.finish();
        }
        indiaUpiOnboardingErrorEducationActivity.A42(A0G);
        indiaUpiOnboardingErrorEducationActivity.startActivity(A0G);
        indiaUpiOnboardingErrorEducationActivity.finish();
    }

    public static void A10(IndiaUpiOnboardingErrorEducationActivity indiaUpiOnboardingErrorEducationActivity, int i) {
        if (indiaUpiOnboardingErrorEducationActivity.getIntent().hasExtra("extra_error_screen_name")) {
            indiaUpiOnboardingErrorEducationActivity.A0S.BOm(C36361kB.A0i(), Integer.valueOf(i), indiaUpiOnboardingErrorEducationActivity.getIntent().getStringExtra("extra_error_screen_name"), C165587tf.A0g(indiaUpiOnboardingErrorEducationActivity));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A10(this, 1);
        if (this.A00 != 4059001) {
            A0z(this);
            return true;
        }
        finish();
        return true;
    }

    public IndiaUpiOnboardingErrorEducationActivity() {
        this(0);
        this.A00 = -1;
    }
}
