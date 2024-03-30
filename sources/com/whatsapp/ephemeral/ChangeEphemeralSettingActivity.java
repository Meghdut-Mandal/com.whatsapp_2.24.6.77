package com.whatsapp.ephemeral;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16I;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass17Z;
import X.AnonymousClass185;
import X.AnonymousClass1LL;
import X.AnonymousClass1LX;
import X.AnonymousClass1NG;
import X.AnonymousClass1T5;
import X.AnonymousClass1X4;
import X.AnonymousClass23D;
import X.AnonymousClass3UK;
import X.AnonymousClass4W3;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19980wp;
import X.C20350xQ;
import X.C20500xf;
import X.C20510xg;
import X.C21010yW;
import X.C226815j;
import X.C238119y;
import X.C24381Cf;
import X.C26371Jx;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C45282Qt;
import X.C62383Fy;
import X.C65533Sl;
import X.C89334Wd;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class ChangeEphemeralSettingActivity extends AnonymousClass155 {
    public int A00;
    public int A01;
    public AnonymousClass1X4 A02;
    public AnonymousClass1NG A03;
    public AnonymousClass16I A04;
    public AnonymousClass185 A05;
    public AnonymousClass1LL A06;
    public C19980wp A07;
    public AnonymousClass17Z A08;
    public C24381Cf A09;
    public AnonymousClass17X A0A;
    public AnonymousClass1T5 A0B;
    public C238119y A0C;
    public C62383Fy A0D;
    public C20500xf A0E;
    public C21010yW A0F;
    public C20350xQ A0G;
    public C20510xg A0H;
    public AnonymousClass11F A0I;
    public AnonymousClass1LX A0J;
    public C26371Jx A0K;
    public int A0L;
    public boolean A0M;
    public final C226815j A0N;

    private void A01() {
        AnonymousClass17Y r2;
        int i;
        AnonymousClass11F r1 = this.A0I;
        C18740tg.A06(r1);
        boolean z = r1 instanceof UserJid;
        if (!z || !this.A03.A0O((UserJid) r1)) {
            int i2 = this.A01;
            if (i2 != -1 && this.A0L != i2) {
                if (C36431kI.A1R(this)) {
                    AnonymousClass11F r5 = this.A0I;
                    if (r5 instanceof AnonymousClass147) {
                        AnonymousClass147 r52 = (AnonymousClass147) r5;
                        int i3 = this.A01;
                        this.A0H.A0C(new AnonymousClass23D(this.A09, this.A0G, r52, (String) null, (List) null, 224, true), r52, i3);
                        A07(i3);
                        return;
                    } else if (z) {
                        int i4 = this.A01;
                        this.A02.A0R((UserJid) r5, true, i4, 1);
                        A07(i4);
                        return;
                    } else {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Ephemeral not supported for this type of jid, type=");
                        C36351kA.A1R(A0u, r5.getType());
                        return;
                    }
                } else {
                    r2 = this.A05;
                    i = R.string.f12nameremoved;
                }
            } else {
                return;
            }
        } else {
            r2 = this.A05;
            int i5 = this.A01;
            i = R.string.f12nameremoved;
            if (i5 == 0) {
                i = R.string.f12nameremoved;
            }
        }
        r2.A06(i, 1);
    }

    private void A07(int i) {
        long j;
        C45282Qt r3 = new C45282Qt();
        r3.A02 = C36441kJ.A0y(i);
        int i2 = this.A0L;
        if (i2 == -1) {
            j = 0;
        } else {
            j = (long) i2;
        }
        r3.A03 = Long.valueOf(j);
        int i3 = this.A00;
        int i4 = 2;
        if (i3 != 2) {
            i4 = 3;
            if (i3 != 3) {
                i4 = 1;
            }
        }
        r3.A00 = Integer.valueOf(i4);
        AnonymousClass11F r2 = this.A0I;
        if (r2 instanceof AnonymousClass147) {
            r3.A01 = Integer.valueOf(AnonymousClass3UK.A02(C36381kD.A0R(this.A0A, C65533Sl.A02(r2)).size()));
        }
        this.A0F.Bly(r3);
    }

    public void A2F() {
        if (!this.A0M) {
            this.A0M = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0F = C36351kA.A0g(A0B2);
            this.A02 = C36361kB.A0T(A0B2);
            this.A0E = A0B2.AzV();
            this.A03 = C36381kD.A0V(A0B2);
            this.A04 = C36351kA.A0S(A0B2);
            this.A0G = C36361kB.A0a(A0B2);
            this.A0H = C36431kI.A0e(A0B2);
            this.A0J = C18800tq.AG6(A0B2);
            this.A05 = C36371kC.A0U(A0B2);
            this.A09 = C36371kC.A0Y(A0B2);
            this.A0A = C36351kA.A0b(A0B2);
            this.A0B = (AnonymousClass1T5) A0B2.AFv.get();
            this.A06 = (AnonymousClass1LL) A0B2.A2s.get();
            this.A0K = (C26371Jx) A0B2.A2n.get();
            this.A08 = C36411kG.A0c(A0B2);
            this.A07 = (C19980wp) A0B2.A1x.get();
            this.A0C = (C238119y) A0B2.AFx.get();
            this.A0D = (C62383Fy) r1.ABQ.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0092, code lost:
        if ((r6 instanceof com.whatsapp.jid.UserJid) != false) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r11 = r20
            r3 = r21
            super.onCreate(r3)
            X.16I r1 = r11.A04
            X.15j r0 = r11.A0N
            r1.registerObserver(r0)
            r0 = 2131625922(0x7f0e07c2, float:1.8879066E38)
            r11.setContentView((int) r0)
            r0 = 2131429993(0x7f0b0a69, float:1.8481674E38)
            android.view.View r2 = X.C03570Gk.A0B(r11, r0)
            r0 = 2131429994(0x7f0b0a6a, float:1.8481676E38)
            android.view.View r1 = X.C03570Gk.A0B(r11, r0)
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1
            boolean r0 = X.C222013h.A07
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0033
            r0 = 2131429992(0x7f0b0a68, float:1.8481672E38)
            X.C36391kE.A16(r11, r0, r5)
        L_0x0033:
            java.lang.Boolean r0 = X.C18750th.A03
            java.lang.String r0 = "ephemeral_settings_lottie_animation.lottie"
            r1.setAnimation((java.lang.String) r0)
            X.C36381kD.A1B(r1, r2)
            r0 = 2131889232(0x7f120c50, float:1.9413122E38)
            r4 = 2131889232(0x7f120c50, float:1.9413122E38)
            X.C36391kE.A15(r11, r0)
            androidx.appcompat.widget.Toolbar r2 = X.C36361kB.A0N(r11)
            X.0ts r1 = r11.A00
            r0 = 2131231957(0x7f0804d5, float:1.808001E38)
            X.C36331k8.A0s(r11, r2, r1, r0)
            java.lang.String r0 = r11.getString(r4)
            r2.setTitle((java.lang.CharSequence) r0)
            int r0 = X.C224314h.A00(r11)
            r2.setBackgroundResource(r0)
            r0 = 2132083846(0x7f150486, float:1.9807846E38)
            r2.A0J(r11, r0)
            r1 = 35
            X.3Y0 r0 = new X.3Y0
            r0.<init>(r11, r1)
            r2.setNavigationOnClickListener(r0)
            r11.setSupportActionBar(r2)
            X.11F r6 = X.C36331k8.A0F(r11)
            r4 = 1
            boolean r1 = X.AnonymousClass000.A1V(r6)
            java.lang.String r0 = "Cannot change ephemeral setting without chat jid"
            X.C18740tg.A0D(r1, r0)
            if (r6 != 0) goto L_0x0087
            r11.finish()
        L_0x0086:
            return
        L_0x0087:
            r11.A0I = r6
            boolean r0 = X.AnonymousClass143.A0G(r6)
            if (r0 != 0) goto L_0x0094
            boolean r0 = r6 instanceof com.whatsapp.jid.UserJid
            r2 = 0
            if (r0 == 0) goto L_0x0095
        L_0x0094:
            r2 = 1
        L_0x0095:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Ephemeral setting can only be changed for Groups and 1:1, jid type="
            r1.append(r0)
            int r0 = r6.getType()
            r1.append(r0)
            java.lang.String r0 = " is not supported"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.C18740tg.A0D(r2, r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "current_setting"
            r2 = -1
            int r0 = r1.getIntExtra(r0, r2)
            r11.A0L = r0
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "entry_point"
            int r0 = r1.getIntExtra(r0, r4)
            r11.A00 = r0
            int r0 = r11.A0L
            if (r0 == r2) goto L_0x00cc
            r5 = 1
        L_0x00cc:
            java.lang.String r0 = "add current ephemeral duration in bundle with extra ARG_CURRENT_SETTING"
            X.C18740tg.A0D(r5, r0)
            int r1 = r11.A0L
            r11.A01 = r1
            if (r21 == 0) goto L_0x00df
            java.lang.String r0 = "selected_setting"
            int r0 = r3.getInt(r0, r1)
            r11.A01 = r0
        L_0x00df:
            r0 = 2131430010(0x7f0b0a7a, float:1.8481709E38)
            android.view.View r3 = r11.findViewById(r0)
            android.widget.RadioGroup r3 = (android.widget.RadioGroup) r3
            r5 = 1
            X.4Xj r0 = new X.4Xj
            r0.<init>(r11, r4)
            r3.setOnCheckedChangeListener(r0)
            r0 = 2131429989(0x7f0b0a65, float:1.8481666E38)
            X.C36361kB.A0v(r11, r0)
            int r2 = r11.A01
            X.0yC r0 = r11.A0D
            r1 = 0
            X.AnonymousClass3TD.A03(r3, r0, r2, r1, r1)
            X.11F r2 = r11.A0I
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0120
            X.1Jx r0 = r11.A0K
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            boolean r0 = r0.A01(r2)
            if (r0 != 0) goto L_0x0120
            r2 = 0
        L_0x0110:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x0120
            android.view.View r0 = r3.getChildAt(r2)
            r0.setEnabled(r1)
            int r2 = r2 + 1
            goto L_0x0110
        L_0x0120:
            r0 = 2131429990(0x7f0b0a66, float:1.8481668E38)
            com.whatsapp.TextEmojiLabel r15 = X.C36421kH.A0I(r11, r0)
            X.11F r0 = r11.A0I
            boolean r2 = X.AnonymousClass143.A0G(r0)
            r0 = 2131889215(0x7f120c3f, float:1.9413087E38)
            if (r2 == 0) goto L_0x0135
            r0 = 2131889214(0x7f120c3e, float:1.9413085E38)
        L_0x0135:
            java.lang.String r18 = r11.getString(r0)
            X.0yC r6 = r11.A0D
            X.17Y r14 = r11.A05
            X.1Dv r13 = r11.A01
            X.0yb r4 = r11.A08
            X.3Fy r0 = r11.A0D
            X.0xT r3 = r0.A01
            java.lang.String r2 = "chats"
            java.lang.String r0 = "about-disappearing-messages"
            android.net.Uri r12 = r3.A04(r2, r0)
            X.AnonymousClass00C.A08(r12)
            java.lang.String r19 = "learn-more"
            r16 = r4
            r17 = r6
            X.AnonymousClass6YV.A0E(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.0ts r0 = r11.A00
            boolean r0 = X.C36401kF.A1X(r0)
            if (r0 == 0) goto L_0x0169
            r0 = 5
            r15.setGravity(r0)
            r0 = 3
            r15.setTextDirection(r0)
        L_0x0169:
            X.1T5 r0 = r11.A0B
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0086
            r0 = 2131429644(0x7f0b090c, float:1.8480967E38)
            android.view.View r4 = X.C03570Gk.A0B(r11, r0)
            r8 = 0
            r4.setVisibility(r1)
            r0 = 2131429645(0x7f0b090d, float:1.8480969E38)
            android.view.View r6 = X.C03570Gk.A0B(r11, r0)
            r0 = 2131429643(0x7f0b090b, float:1.8480965E38)
            android.widget.TextView r7 = X.C36401kF.A0H(r11, r0)
            X.19y r0 = r11.A0C
            android.content.SharedPreferences r3 = X.C238119y.A00(r0)
            java.lang.String r2 = "disappearing_mode_timestamp"
            r0 = 0
            long r9 = r3.getLong(r2, r0)
            r3 = 8
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x01aa
            r6.setVisibility(r8)
            r7.setVisibility(r3)
            r0 = 36
            X.AnonymousClass3Y0.A01(r4, r11, r0)
            return
        L_0x01aa:
            r7.setVisibility(r8)
            r6.setVisibility(r3)
            r0 = 2131888891(0x7f120afb, float:1.941243E38)
            java.lang.String r1 = r11.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r1)
            android.text.SpannableStringBuilder r6 = X.C36441kJ.A0P(r0)
            int r1 = r1.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r4 = r6.getSpans(r8, r1, r0)
            android.text.style.URLSpan[] r4 = (android.text.style.URLSpan[]) r4
            if (r4 == 0) goto L_0x01ec
            int r3 = r4.length
        L_0x01ce:
            if (r8 >= r3) goto L_0x01ec
            r2 = r4[r8]
            java.lang.String r1 = r2.getURL()
            java.lang.String r0 = "disappearing_mode_setting_link"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01e9
            X.4Vu r0 = new X.4Vu
            r0.<init>(r11, r11, r5)
            X.C36351kA.A18(r6, r2, r0)
            r6.removeSpan(r2)
        L_0x01e9:
            int r8 = r8 + 1
            goto L_0x01ce
        L_0x01ec:
            X.0yC r0 = r11.A0D
            X.C36331k8.A10(r7, r0)
            r7.setText(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ephemeral.ChangeEphemeralSettingActivity.onCreate(android.os.Bundle):void");
    }

    public ChangeEphemeralSettingActivity(int i) {
        this.A0M = false;
        C89334Wd.A00(this, 22);
    }

    public void onBackPressed() {
        A01();
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A04.unregisterObserver(this.A0N);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A01();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_setting", this.A01);
    }

    public void onStart() {
        super.onStart();
        this.A0D.A00(getSupportFragmentManager(), this.A0I, 2);
    }

    public ChangeEphemeralSettingActivity() {
        this(0);
        this.A0N = AnonymousClass4W3.A00(this, 21);
    }
}
