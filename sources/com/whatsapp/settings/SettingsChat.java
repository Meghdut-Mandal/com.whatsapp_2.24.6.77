package com.whatsapp.settings;

import X.AnonymousClass005;
import X.AnonymousClass13J;
import X.AnonymousClass15P;
import X.AnonymousClass1CR;
import X.AnonymousClass1DH;
import X.AnonymousClass1JL;
import X.AnonymousClass2df;
import X.AnonymousClass3MK;
import X.AnonymousClass3PI;
import X.AnonymousClass3Q7;
import X.AnonymousClass3RQ;
import X.AnonymousClass3T0;
import X.AnonymousClass4QA;
import X.AnonymousClass6R8;
import X.C144596sV;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19420v0;
import X.C20830yE;
import X.C21010yW;
import X.C226515g;
import X.C24331Ca;
import X.C24341Cb;
import X.C27111My;
import X.C34191gb;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C71063gA;
import X.C81163wZ;
import X.C89364Wg;
import android.app.Dialog;
import android.content.res.Configuration;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import java.util.Set;

public class SettingsChat extends AnonymousClass2df implements AnonymousClass15P {
    public SwitchCompat A00;
    public SwitchCompat A01;
    public SwitchCompat A02;
    public C24331Ca A03;
    public AnonymousClass1DH A04;
    public C24341Cb A05;
    public C20830yE A06;
    public C144596sV A07;
    public C21010yW A08;
    public AnonymousClass1JL A09;
    public AnonymousClass3Q7 A0A;
    public SettingsRowIconText A0B;
    public SettingsRowIconText A0C;
    public AnonymousClass1CR A0D;
    public AnonymousClass3T0 A0E;
    public AnonymousClass3PI A0F;
    public AnonymousClass13J A0G;
    public AnonymousClass005 A0H;
    public AnonymousClass005 A0I;
    public String A0J;
    public String[] A0K;
    public TextView A0L;
    public SettingsChatViewModel A0M;
    public boolean A0N;
    public boolean A0O;
    public String[] A0P;
    public final C226515g A0Q;
    public final AnonymousClass4QA A0R;
    public final Set A0S;

    public void Bgm(int i, int i2) {
        if (i == 1) {
            C36341k9.A0x(C19420v0.A00(this.A09), "interface_font_size", String.valueOf(Integer.valueOf(this.A0K[i2]).intValue()));
            this.A0L.setText(this.A0P[i2]);
        } else if (i == 2 && this.A0A.A02(i2)) {
            this.A0C.setVisibility(0);
            this.A0C.setSubText(this.A0A.A00());
            finish();
            overridePendingTransition(0, R.anim.f1nameremoved);
            this.A0O = true;
            startActivity(getIntent());
        }
    }

    public static void A07(SettingsChat settingsChat) {
        SettingsRowIconText settingsRowIconText;
        String string;
        if (settingsChat.A0B != null) {
            if (C34191gb.A08(settingsChat.getApplicationContext())) {
                settingsRowIconText = settingsChat.A0B;
                string = null;
            } else if (settingsChat.A06.A0D()) {
                SettingsChatViewModel settingsChatViewModel = settingsChat.A0M;
                C81163wZ.A00(settingsChatViewModel.A02, settingsChatViewModel, 23);
                return;
            } else {
                settingsRowIconText = settingsChat.A0B;
                string = settingsChat.getString(R.string.f12nameremoved);
            }
            settingsRowIconText.setSubText(string);
        }
    }

    public void A2F() {
        if (!this.A0N) {
            this.A0N = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r3 = r1.A00;
            C36321k7.A0X(r1, r3, this, C36321k7.A05(r1, r3, this));
            this.A08 = C36351kA.A0g(r1);
            this.A04 = (AnonymousClass1DH) r1.A0K.get();
            this.A0G = C36351kA.A0q(r1);
            this.A0I = C18840tu.A00(r1.A10);
            this.A0E = (AnonymousClass3T0) r3.A4L.get();
            this.A03 = (C24331Ca) r1.ABI.get();
            this.A0D = C36371kC.A0j(r1);
            this.A05 = C36431kI.A0a(r1);
            this.A07 = (C144596sV) r1.AQW.get();
            this.A0F = C27111My.A3F(A0L2);
            this.A09 = (AnonymousClass1JL) r3.A3t.get();
            this.A0A = C27111My.A3E(A0L2);
            this.A06 = C36351kA.A0X(r1);
            this.A0H = C18840tu.A00(r1.ACK);
        }
    }

    public void A34(Configuration configuration) {
        if (!this.A0O) {
            super.A34(configuration);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047 A[LOOP:0: B:12:0x0047->B:15:0x0057, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x003e
            if (r5 == 0) goto L_0x003e
            java.lang.String r0 = "oom"
            r1 = 0
            boolean r0 = r5.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "conversation/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131889315(0x7f120ca3, float:1.941329E38)
            r2.BO5(r0)
        L_0x0018:
            java.lang.String r0 = "no-space"
            boolean r0 = r5.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "conversation/activityres/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131889309(0x7f120c9d, float:1.9413278E38)
            r2.BO5(r0)
        L_0x002b:
            java.lang.String r0 = "io-error"
            boolean r0 = r5.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "conversation/activityres/fail/load-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131889297(0x7f120c91, float:1.9413254E38)
            r2.BO5(r0)
        L_0x003e:
            super.onActivityResult(r3, r4, r5)
            java.util.Set r0 = r2.A0S
            java.util.Iterator r1 = r0.iterator()
        L_0x0047:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r1.next()
            X.4P8 r0 = (X.AnonymousClass4P8) r0
            boolean r0 = r0.BQk(r5, r3, r4)
            if (r0 == 0) goto L_0x0047
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsChat.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.A0O) {
            super.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [boolean, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0294, code lost:
        if (r2 == 2) goto L_0x0296;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r8 = r19
            r0 = r20
            super.onCreate(r0)
            X.04H r1 = X.C36441kJ.A0b(r8)
            java.lang.Class<com.whatsapp.settings.SettingsChatViewModel> r0 = com.whatsapp.settings.SettingsChatViewModel.class
            X.04R r0 = r1.A00(r0)
            com.whatsapp.settings.SettingsChatViewModel r0 = (com.whatsapp.settings.SettingsChatViewModel) r0
            r8.A0M = r0
            r0 = 2131896976(0x7f122a90, float:1.9428828E38)
            r8.setTitle(r0)
            r0 = 2131625915(0x7f0e07bb, float:1.8879051E38)
            r8.setContentView((int) r0)
            boolean r13 = X.C36341k9.A1X(r8)
            android.view.View r1 = r8.A00
            r0 = 2131429983(0x7f0b0a5f, float:1.8481654E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r8.A00 = r0
            android.view.View r1 = r8.A00
            r0 = 2131431548(0x7f0b107c, float:1.8484828E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r8.A01 = r0
            android.view.View r1 = r8.A00
            r0 = 2131430364(0x7f0b0bdc, float:1.8482427E38)
            android.widget.TextView r0 = X.C36391kE.A0O(r1, r0)
            r8.A0L = r0
            android.view.View r1 = r8.A00
            r0 = 2131434195(0x7f0b1ad3, float:1.8490197E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r8.A02 = r0
            android.view.View r1 = r8.A00
            r0 = 2131428789(0x7f0b05b5, float:1.8479232E38)
            X.1RJ r18 = X.C36341k9.A0X(r1, r0)
            android.view.View r1 = r8.A00
            r0 = 2131434008(0x7f0b1a18, float:1.8489818E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            com.whatsapp.settings.SettingsRowIconText r0 = (com.whatsapp.settings.SettingsRowIconText) r0
            r8.A0C = r0
            android.view.View r1 = r8.A00
            r0 = 2131435298(0x7f0b1f22, float:1.8492434E38)
            android.view.View r9 = X.C012005e.A02(r1, r0)
            com.whatsapp.settings.SettingsRowIconText r9 = (com.whatsapp.settings.SettingsRowIconText) r9
            android.view.View r1 = r8.A00
            r0 = 2131429982(0x7f0b0a5e, float:1.8481652E38)
            android.view.View r11 = X.C012005e.A02(r1, r0)
            android.view.View r1 = r8.A00
            r0 = 2131430363(0x7f0b0bdb, float:1.8482425E38)
            android.view.View r7 = X.C012005e.A02(r1, r0)
            android.view.View r1 = r8.A00
            r0 = 2131431547(0x7f0b107b, float:1.8484826E38)
            android.view.View r6 = X.C012005e.A02(r1, r0)
            android.view.View r1 = r8.A00
            r0 = 2131430946(0x7f0b0e22, float:1.8483607E38)
            android.view.ViewStub r2 = X.C36441kJ.A0S(r1, r0)
            android.view.View r1 = r8.A00
            r0 = 2131434194(0x7f0b1ad2, float:1.8490195E38)
            android.view.View r10 = X.C012005e.A02(r1, r0)
            android.view.View r1 = r8.A00
            r0 = 2131428115(0x7f0b0313, float:1.8477865E38)
            android.view.ViewStub r12 = X.C36441kJ.A0S(r1, r0)
            android.view.View r1 = r8.A00
            r0 = 2131428766(0x7f0b059e, float:1.8479186E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            com.whatsapp.settings.SettingsRowIconText r0 = (com.whatsapp.settings.SettingsRowIconText) r0
            r8.A0B = r0
            android.view.View r1 = r8.A00
            r0 = 2131428770(0x7f0b05a2, float:1.8479194E38)
            android.view.View r5 = X.C012005e.A02(r1, r0)
            com.whatsapp.settings.SettingsRowIconText r5 = (com.whatsapp.settings.SettingsRowIconText) r5
            android.view.View r1 = r8.A00
            r0 = 2131428796(0x7f0b05bc, float:1.8479247E38)
            X.1RJ r17 = X.C36341k9.A0X(r1, r0)
            com.whatsapp.settings.SettingsRowIconText r1 = r8.A0C
            r0 = 19
            X.AnonymousClass3Y7.A00(r1, r8, r0)
            com.whatsapp.settings.SettingsRowIconText r1 = r8.A0C
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.settings.SettingsRowIconText r1 = r8.A0C
            X.3Q7 r0 = r8.A0A
            java.lang.String r0 = r0.A00()
            r1.setSubText(r0)
            X.0yC r0 = r8.A0D
            boolean r0 = X.C63743Lf.A01(r0)
            r4 = 0
            if (r0 == 0) goto L_0x01d1
            android.view.View r2 = r2.inflate()
            r0 = 2131430947(0x7f0b0e23, float:1.848361E38)
            android.view.View r1 = X.C012005e.A02(r2, r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            X.1CR r0 = r8.A0D
            boolean r0 = r0.A0h()
            r1.setChecked(r0)
            r0 = 8
            X.AnonymousClass3YC.A00(r2, r8, r1, r0)
        L_0x010b:
            X.005 r0 = r8.A0I
            java.lang.Object r0 = r0.get()
            X.1Hg r0 = (X.C25681Hg) r0
            X.0yC r3 = r0.A01
            X.0yV r1 = X.C21000yV.A01
            r0 = 8002(0x1f42, float:1.1213E-41)
            boolean r0 = X.C20800yB.A01(r1, r3, r0)
            if (r0 != 0) goto L_0x01cf
            X.005 r0 = r8.A0I
            java.lang.Object r0 = r0.get()
            X.1Hg r0 = (X.C25681Hg) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x01cf
            android.view.View r1 = r12.inflate()
            r0 = 2131428116(0x7f0b0314, float:1.8477867E38)
            android.view.View r12 = X.C012005e.A02(r1, r0)
            android.widget.CompoundButton r12 = (android.widget.CompoundButton) r12
            X.005 r0 = r8.A0H
            java.lang.Object r0 = r0.get()
            X.1HY r0 = (X.AnonymousClass1HY) r0
            X.00T r0 = r0.A02
            android.content.SharedPreferences r3 = X.C36411kG.A0E(r0)
            java.lang.String r0 = "bonsai_meta_ai_button_setting_enabled"
            boolean r0 = r3.getBoolean(r0, r13)
            r12.setChecked(r0)
            r0 = 9
            X.AnonymousClass3YC.A00(r1, r8, r12, r0)
        L_0x0156:
            X.0yC r0 = r8.A0D
            boolean r16 = X.C36411kG.A1W(r0)
            if (r16 == 0) goto L_0x01d4
            com.whatsapp.settings.SettingsRowIconText r3 = r8.A0C
            r0 = 2131232690(0x7f0807b2, float:1.8081496E38)
            r3.setIcon((int) r0)
            r0 = 2131232692(0x7f0807b4, float:1.80815E38)
            r9.setIcon((int) r0)
            com.whatsapp.settings.SettingsRowIconText r3 = r8.A0B
            r0 = 2131232686(0x7f0807ae, float:1.8081488E38)
            r3.setIcon((int) r0)
            r0 = 2131232688(0x7f0807b0, float:1.8081492E38)
            r5.setIcon((int) r0)
            r0 = 6
            android.view.View[] r14 = new android.view.View[r0]
            r15 = 0
            r14[r15] = r11
            X.C36411kG.A1Q(r6, r2, r14, r13)
            r0 = 3
            r14[r0] = r7
            X.C36381kD.A1L(r10, r1, r14)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168273(0x7f070c11, float:1.7950843E38)
            int r12 = X.C36441kJ.A05(r1, r0)
            r3 = 6
            r2 = 0
        L_0x0196:
            r1 = r14[r2]
            if (r1 == 0) goto L_0x01a1
            int r0 = r1.getPaddingTop()
            X.C36341k9.A0z(r1, r12, r0)
        L_0x01a1:
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x0196
            int r0 = r18.A00()
            if (r0 != 0) goto L_0x01d4
            android.view.View[] r12 = new android.view.View[r13]
            android.view.View r0 = r18.A01()
            r12[r15] = r0
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168273(0x7f070c11, float:1.7950843E38)
            int r3 = X.C36441kJ.A05(r1, r0)
            r2 = 0
        L_0x01bf:
            if (r2 >= r13) goto L_0x01d4
            r1 = r12[r2]
            if (r1 == 0) goto L_0x01cc
            int r0 = r1.getPaddingTop()
            X.C36341k9.A0z(r1, r3, r0)
        L_0x01cc:
            int r2 = r2 + 1
            goto L_0x01bf
        L_0x01cf:
            r1 = r4
            goto L_0x0156
        L_0x01d1:
            r2 = r4
            goto L_0x010b
        L_0x01d4:
            boolean r0 = X.C36421kH.A1V(r8)
            r3 = 8
            if (r0 == 0) goto L_0x038f
            r11.setVisibility(r3)
        L_0x01df:
            X.1JL r0 = r8.A09
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L_0x0379
            X.1JL r0 = r8.A09
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0379
            r10.setVisibility(r3)
        L_0x01f2:
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2130903056(0x7f030010, float:1.741292E38)
            java.lang.String[] r0 = r1.getStringArray(r0)
            r8.A0P = r0
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2130903057(0x7f030011, float:1.7412921E38)
            java.lang.String[] r0 = r1.getStringArray(r0)
            r8.A0K = r0
            int r2 = A01(r8, r0)
            if (r2 < 0) goto L_0x021b
            android.widget.TextView r1 = r8.A0L
            java.lang.String[] r0 = r8.A0P
            r0 = r0[r2]
            r1.setText(r0)
        L_0x021b:
            r0 = 26
            X.AnonymousClass3Y7.A00(r7, r8, r0)
            android.view.View r1 = r8.A00
            r0 = 2131433165(0x7f0b16cd, float:1.8488108E38)
            android.view.ViewStub r10 = X.C36441kJ.A0S(r1, r0)
            android.view.View r1 = r8.A00
            r0 = 2131427762(0x7f0b01b2, float:1.847715E38)
            android.view.ViewStub r7 = X.C36441kJ.A0S(r1, r0)
            X.0v0 r0 = r8.A09
            boolean r0 = r0.A2F()
            if (r0 == 0) goto L_0x0286
            boolean r0 = X.C36421kH.A1V(r8)
            if (r0 != 0) goto L_0x0286
            android.view.View r2 = r18.A01()
            com.whatsapp.components.WaSwitchView r2 = (com.whatsapp.components.WaSwitchView) r2
            X.0v0 r0 = r8.A09
            boolean r0 = r0.A2G()
            r0 = r0 ^ 1
            r2.setChecked(r0)
            r1 = 18
            X.4XY r0 = new X.4XY
            r0.<init>(r8, r1)
            r2.setOnCheckedChangeListener(r0)
            r1 = 17
            X.3Y7 r0 = new X.3Y7
            r0.<init>(r2, r1)
            r2.setOnClickListener(r0)
            r10.inflate()
            r7.inflate()
            android.content.Intent r1 = r8.getIntent()
            if (r1 == 0) goto L_0x0286
            java.lang.String r0 = "scroll_to_setting"
            java.lang.String r1 = r1.getStringExtra(r0)
            java.lang.String r0 = "archived_chats"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0286
            android.view.ViewParent r0 = r2.getParent()
            r0.requestChildFocus(r2, r2)
        L_0x0286:
            androidx.appcompat.widget.SwitchCompat r7 = r8.A01
            X.1CR r0 = r8.A0D
            X.3LI r0 = r0.A0R()
            int r2 = r0.A03
            if (r2 == 0) goto L_0x0296
            r0 = 2
            r1 = 0
            if (r2 != r0) goto L_0x0297
        L_0x0296:
            r1 = 1
        L_0x0297:
            r7.setChecked(r1)
            r0 = 27
            X.AnonymousClass3Y7.A00(r6, r8, r0)
            r0 = 18
            X.AnonymousClass3Y7.A00(r9, r8, r0)
            boolean r0 = X.C36421kH.A1V(r8)
            if (r0 == 0) goto L_0x035f
            com.whatsapp.settings.SettingsRowIconText r0 = r8.A0B
            r0.setVisibility(r3)
        L_0x02af:
            r0 = 22
            X.AnonymousClass3Y7.A00(r5, r8, r0)
            boolean r0 = X.C19550w8.A01()
            if (r0 == 0) goto L_0x02e1
            X.0yC r1 = r8.A0D
            r0 = 2870(0xb36, float:4.022E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x02e1
            boolean r0 = X.C36421kH.A1V(r8)
            if (r0 != 0) goto L_0x02e1
            if (r16 == 0) goto L_0x02d8
            android.view.View r1 = r17.A01()
            com.whatsapp.settings.SettingsRowIconText r1 = (com.whatsapp.settings.SettingsRowIconText) r1
            r0 = 2131232662(0x7f080796, float:1.808144E38)
            r1.setIcon((int) r0)
        L_0x02d8:
            android.view.View r1 = r17.A01()
            r0 = 23
            X.AnonymousClass3Y7.A00(r1, r8, r0)
        L_0x02e1:
            X.17Y r6 = r8.A05
            X.3fq r3 = new X.3fq
            r3.<init>(r6)
            X.2sH r12 = new X.2sH
            r12.<init>()
            X.0yb r2 = r8.A08
            X.3T0 r0 = r8.A0E
            X.3ck r1 = new X.3ck
            r7 = r1
            r9 = r8
            r10 = r6
            r11 = r3
            r13 = r2
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            java.util.Set r0 = r8.A0S
            r0.add(r1)
            com.whatsapp.settings.SettingsChatViewModel r0 = r8.A0M
            X.00s r0 = r0.A00
            r7 = 1
            X.C65963Ud.A00(r8, r0, r7)
            android.content.Intent r6 = r8.getIntent()
            if (r6 == 0) goto L_0x0333
            java.lang.String r3 = "page"
            java.lang.String r2 = r6.getStringExtra(r3)
            if (r2 == 0) goto L_0x0333
            java.lang.String r0 = "font"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x034b
            java.lang.String r0 = "theme"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0345
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SettingChat/Deeplink entry point: Entrypoint unsupported: "
            X.C36321k7.A1P(r0, r2, r1)
        L_0x0330:
            r6.removeExtra(r3)
        L_0x0333:
            java.lang.String r3 = X.C36381kD.A0q(r8)
            r8.A0J = r3
            X.3PI r2 = r8.A0F
            android.view.View r1 = r8.A00
            java.lang.String r0 = "chat"
            r2.A02(r1, r0, r3)
            r8.A0J = r4
            return
        L_0x0345:
            X.3Q7 r0 = r8.A0A
            r0.A01(r8)
            goto L_0x0330
        L_0x034b:
            java.lang.String[] r0 = r8.A0K
            int r2 = A01(r8, r0)
            r1 = 2131894134(0x7f121f76, float:1.9423064E38)
            r0 = 2130903056(0x7f030010, float:1.741292E38)
            com.whatsapp.SingleSelectionDialogFragment r0 = com.whatsapp.SingleSelectionDialogFragment.A06(r7, r1, r2, r0)
            r8.Btm(r0)
            goto L_0x0330
        L_0x035f:
            android.content.Context r0 = r8.getApplicationContext()
            boolean r0 = X.C34191gb.A08(r0)
            com.whatsapp.settings.SettingsRowIconText r1 = r8.A0B
            if (r0 != 0) goto L_0x0372
            r0 = 20
            X.AnonymousClass3Y7.A00(r1, r8, r0)
            goto L_0x02af
        L_0x0372:
            r0 = 21
            X.AnonymousClass3Y7.A00(r1, r8, r0)
            goto L_0x02af
        L_0x0379:
            r0 = 25
            X.AnonymousClass3Y7.A00(r10, r8, r0)
            androidx.appcompat.widget.SwitchCompat r2 = r8.A02
            X.0wh r0 = r8.A0A
            android.content.SharedPreferences r1 = r0.A01
            java.lang.String r0 = "otp_split_mode_user_choice"
            boolean r0 = X.C36441kJ.A1I(r1, r0)
            r2.setChecked(r0)
            goto L_0x01f2
        L_0x038f:
            r0 = 24
            X.AnonymousClass3Y7.A00(r11, r8, r0)
            androidx.appcompat.widget.SwitchCompat r2 = r8.A00
            android.content.SharedPreferences r1 = X.C36331k8.A06(r8)
            java.lang.String r0 = "input_enter_send"
            boolean r0 = X.C36441kJ.A1I(r1, r0)
            r2.setChecked(r0)
            goto L_0x01df
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsChat.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        if (i == 600) {
            return AnonymousClass3RQ.A01(this);
        }
        if (i != 602) {
            return super.onCreateDialog(i);
        }
        return AnonymousClass3RQ.A00(this);
    }

    public void onPause() {
        C24341Cb r0 = this.A05;
        AnonymousClass4QA r1 = this.A0R;
        if (r1 != null) {
            r0.A01.remove(r1);
        }
        super.onPause();
    }

    public SettingsChat(int i) {
        this.A0N = false;
        C89364Wg.A00(this, 22);
    }

    public static int A01(SettingsChat settingsChat, String[] strArr) {
        int A002 = AnonymousClass6R8.A00(C36331k8.A06(settingsChat).getString("interface_font_size", "0"), 0);
        for (int i = 0; i < strArr.length; i++) {
            if (A002 == Integer.valueOf(strArr[i]).intValue()) {
                return i;
            }
        }
        return -1;
    }

    public void onResume() {
        super.onResume();
        C24341Cb r0 = this.A05;
        AnonymousClass4QA r1 = this.A0R;
        if (r1 != null) {
            r0.A01.add(r1);
        }
        A07(this);
    }

    public SettingsChat() {
        this(0);
        this.A0R = new C71063gA(this);
        this.A0J = null;
        this.A0S = C36441kJ.A16();
        this.A0Q = new AnonymousClass3MK(this, 5);
    }
}
