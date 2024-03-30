package com.whatsapp.newsletter.ui.settings;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass155;
import X.AnonymousClass1GQ;
import X.AnonymousClass39I;
import X.C18800tq;
import X.C18830tt;
import X.C220412q;
import X.C28981Uw;
import X.C32241dD;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import X.C44072La;
import X.C52452pS;
import X.C65073Qp;
import X.C84244Cm;
import X.C89344We;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class NewsletterSettingsActivity extends AnonymousClass155 {
    public RadioButton A00;
    public RadioButton A01;
    public RadioButton A02;
    public RadioGroup A03;
    public RadioGroup A04;
    public WaTextView A05;
    public WaTextView A06;
    public C220412q A07;
    public C28981Uw A08;
    public AnonymousClass1GQ A09;
    public AnonymousClass39I A0A;
    public C32241dD A0B;
    public boolean A0C;
    public final AnonymousClass00T A0D;

    private final C44072La A07() {
        C220412q r1 = this.A07;
        if (r1 != null) {
            C28981Uw r0 = this.A08;
            if (r0 == null) {
                throw C36331k8.A0d("jid");
            }
            C65073Qp A0W = C36371kC.A0W(r1, r0);
            AnonymousClass00C.A0E(A0W, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
            return (C44072La) A0W;
        }
        throw C36331k8.A0d("chatsCache");
    }

    public void A2F() {
        if (!this.A0C) {
            this.A0C = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0A = (AnonymousClass39I) r1.AAF.get();
            this.A09 = C36371kC.A0f(A0B2);
            this.A0B = C36431kI.A0n(A0B2);
            this.A07 = C36351kA.A0a(A0B2);
        }
    }

    public NewsletterSettingsActivity(int i) {
        this.A0C = false;
        C89344We.A00(this, 30);
    }

    public static final int A01(int i) {
        C52452pS r0;
        if (i == R.id.newsletter_media_cache_day) {
            r0 = C52452pS.DAY;
        } else if (i == R.id.newsletter_media_cache_week) {
            r0 = C52452pS.WEEK;
        } else if (i == R.id.newsletter_media_cache_month) {
            r0 = C52452pS.MONTH;
        } else if (i == R.id.newsletter_media_cache_never) {
            r0 = C52452pS.NEVER;
        } else if (i != R.id.newsletter_media_cache_default) {
            return Integer.MIN_VALUE;
        } else {
            r0 = C52452pS.DEFAULT;
        }
        return r0.value;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (A07().A0L() == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            X.3Ro r1 = X.C28981Uw.A03
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "jid"
            java.lang.String r0 = r0.getStringExtra(r2)
            X.1Uw r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0019
            r7.finish()
        L_0x0018:
            return
        L_0x0019:
            r7.A08 = r0
            r0 = 2131624057(0x7f0e0079, float:1.8875283E38)
            r7.setContentView((int) r0)
            X.07B r1 = r7.getSupportActionBar()
            if (r1 == 0) goto L_0x0031
            r0 = 1
            r1.A0U(r0)
            r0 = 2131891496(0x7f121528, float:1.9417714E38)
            r1.A0I(r0)
        L_0x0031:
            X.1GQ r0 = r7.A09
            if (r0 == 0) goto L_0x02c6
            X.0yC r1 = r0.A00
            r0 = 4887(0x1317, float:6.848E-42)
            boolean r0 = r1.A0E(r0)
            r3 = 0
            if (r0 == 0) goto L_0x004b
            X.2La r0 = r7.A07()
            boolean r0 = r0.A0L()
            r1 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            r0 = 2131431935(0x7f0b11ff, float:1.8485613E38)
            android.view.View r0 = X.C36361kB.A0H(r7, r0)
            if (r1 != 0) goto L_0x0057
            r3 = 8
        L_0x0057:
            r0.setVisibility(r3)
            if (r1 == 0) goto L_0x01b3
            r0 = 2131432024(0x7f0b1258, float:1.8485794E38)
            android.view.View r0 = X.C36361kB.A0H(r7, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A06 = r0
            r0 = 2131432025(0x7f0b1259, float:1.8485796E38)
            android.view.View r0 = X.C36361kB.A0H(r7, r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r7.A04 = r0
            r0 = 2131433129(0x7f0b16a9, float:1.8488035E38)
            android.view.View r0 = X.C36361kB.A0H(r7, r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r7.A00 = r0
            r0 = 2131433153(0x7f0b16c1, float:1.8488084E38)
            android.view.View r0 = X.C36361kB.A0H(r7, r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r7.A01 = r0
            r0 = 2131433155(0x7f0b16c3, float:1.8488088E38)
            android.view.View r3 = X.C36361kB.A0H(r7, r0)
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            r7.A02 = r3
            if (r3 != 0) goto L_0x009c
            java.lang.String r0 = "noneButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x009c:
            X.1GQ r0 = r7.A09
            if (r0 == 0) goto L_0x02b0
            X.0yC r1 = r0.A00
            r0 = 5274(0x149a, float:7.39E-42)
            boolean r0 = r1.A0E(r0)
            int r0 = X.C36351kA.A00(r0)
            r3.setVisibility(r0)
            r0 = 2131432024(0x7f0b1258, float:1.8485794E38)
            android.widget.TextView r1 = X.C36391kE.A0Q(r7, r0)
            if (r1 == 0) goto L_0x00be
            r0 = 2131891468(0x7f12150c, float:1.9417657E38)
            r1.setText(r0)
        L_0x00be:
            android.widget.RadioButton r1 = r7.A00
            if (r1 != 0) goto L_0x00c9
            java.lang.String r0 = "anyButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00c9:
            r0 = 2131891469(0x7f12150d, float:1.9417659E38)
            r1.setText(r0)
            android.widget.RadioButton r1 = r7.A02
            if (r1 != 0) goto L_0x00da
            java.lang.String r0 = "noneButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00da:
            r0 = 2131891472(0x7f121510, float:1.9417665E38)
            r1.setText(r0)
            android.widget.RadioButton r6 = r7.A01
            if (r6 != 0) goto L_0x00eb
            java.lang.String r0 = "defaultButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00eb:
            r5 = 2131891471(0x7f12150f, float:1.9417663E38)
            java.lang.Object[] r4 = X.AnonymousClass001.A0L()
            r3 = 0
            java.util.List r1 = X.C56352w9.A00
            X.AnonymousClass00C.A09(r1)
            java.lang.String r0 = " "
            java.lang.String r0 = X.C36381kD.A0x(r0, r1)
            java.lang.String r0 = X.C36371kC.A0y(r0)
            r4[r3] = r0
            X.C36341k9.A0s(r7, r6, r4, r5)
            android.widget.RadioButton r1 = r7.A00
            if (r1 != 0) goto L_0x0112
            java.lang.String r0 = "anyButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0112:
            r0 = 38
            X.AnonymousClass3Y4.A00(r1, r7, r0)
            android.widget.RadioButton r1 = r7.A02
            if (r1 != 0) goto L_0x0122
            java.lang.String r0 = "noneButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0122:
            r0 = 41
            X.AnonymousClass3Y4.A00(r1, r7, r0)
            android.widget.RadioButton r1 = r7.A01
            if (r1 != 0) goto L_0x0132
            java.lang.String r0 = "defaultButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0132:
            r0 = 40
            X.AnonymousClass3Y4.A00(r1, r7, r0)
            android.widget.RadioButton r0 = r7.A01
            java.lang.String r6 = "defaultButton"
            if (r0 != 0) goto L_0x0142
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0142:
            r0.setChecked(r3)
            android.widget.RadioButton r0 = r7.A02
            java.lang.String r5 = "noneButton"
            if (r0 != 0) goto L_0x0150
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0150:
            r0.setChecked(r3)
            android.widget.RadioButton r0 = r7.A00
            java.lang.String r4 = "anyButton"
            if (r0 != 0) goto L_0x015e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x015e:
            r0.setChecked(r3)
            X.39I r0 = r7.A0A
            if (r0 == 0) goto L_0x02a9
            X.1Uw r1 = r7.A08
            if (r1 != 0) goto L_0x016e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x016e:
            X.12q r0 = r0.A03
            X.3Qp r1 = X.C36371kC.A0W(r0, r1)
            boolean r0 = r1 instanceof X.C44072La
            if (r0 == 0) goto L_0x0194
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x0194
            X.2pM r0 = r1.A0B
        L_0x017e:
            int r3 = r0.ordinal()
            r2 = 1
            if (r3 == r2) goto L_0x01a7
            r0 = 0
            if (r3 == r0) goto L_0x019e
            r1 = 2
            android.widget.RadioButton r0 = r7.A02
            if (r3 == r1) goto L_0x0197
            if (r0 != 0) goto L_0x01b0
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0194:
            X.2pM r0 = X.C52392pM.DEFAULT
            goto L_0x017e
        L_0x0197:
            if (r0 != 0) goto L_0x01b0
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x019e:
            android.widget.RadioButton r0 = r7.A01
            if (r0 != 0) goto L_0x01b0
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x01a7:
            android.widget.RadioButton r0 = r7.A00
            if (r0 != 0) goto L_0x01b0
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x01b0:
            r0.setChecked(r2)
        L_0x01b3:
            r0 = 2131431999(0x7f0b123f, float:1.8485743E38)
            android.view.View r0 = X.C36361kB.A0H(r7, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A05 = r0
            r0 = 2131431998(0x7f0b123e, float:1.8485741E38)
            android.view.View r0 = X.C36361kB.A0H(r7, r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r7.A03 = r0
            com.whatsapp.WaTextView r1 = r7.A05
            if (r1 != 0) goto L_0x01d4
            java.lang.String r0 = "mediaCacheHeader"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01d4:
            X.00T r3 = r7.A0D
            boolean r0 = X.C36331k8.A1b(r3)
            r2 = 0
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            android.widget.RadioGroup r1 = r7.A03
            if (r1 != 0) goto L_0x01ed
            java.lang.String r0 = "mediaCacheSettings"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01ed:
            boolean r0 = X.C36331k8.A1b(r3)
            if (r0 != 0) goto L_0x01f5
            r2 = 8
        L_0x01f5:
            r1.setVisibility(r2)
            boolean r0 = X.C36331k8.A1b(r3)
            if (r0 == 0) goto L_0x0018
            r0 = 5
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r0 = 2131431993(0x7f0b1239, float:1.848573E38)
            X.AnonymousClass000.A1J(r1, r0)
            r0 = 2131432001(0x7f0b1241, float:1.8485747E38)
            X.AnonymousClass000.A1K(r1, r0)
            r0 = 2131431995(0x7f0b123b, float:1.8485735E38)
            X.C36331k8.A1V(r1, r0)
            r0 = 2131431996(0x7f0b123c, float:1.8485737E38)
            X.C36341k9.A1T(r1, r0)
            r0 = 2131431994(0x7f0b123a, float:1.8485733E38)
            X.C36341k9.A1U(r1, r0)
            java.util.List r0 = java.util.Arrays.asList(r1)
            X.AnonymousClass00C.A08(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x022a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0253
            int r3 = X.C36341k9.A0A(r4)
            int r1 = A01(r3)
            X.2La r0 = r7.A07()
            X.2pS r0 = r0.A0A
            int r0 = r0.value
            boolean r2 = X.AnonymousClass000.A1S(r0, r1)
            android.view.View r1 = r7.findViewById(r3)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 39
            X.AnonymousClass3Y4.A00(r1, r7, r0)
            r1.setChecked(r2)
            goto L_0x022a
        L_0x0253:
            X.39I r0 = r7.A0A
            if (r0 == 0) goto L_0x02bf
            X.0v0 r0 = r0.A02
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "newsletter_media_cache_purge_after"
            r5 = 0
            int r4 = r1.getInt(r0, r5)
            X.2pS[] r3 = X.C52452pS.values()
            int r2 = r3.length
        L_0x0269:
            if (r5 >= r2) goto L_0x02b7
            r1 = r3[r5]
            int r0 = r1.value
            if (r0 != r4) goto L_0x02a6
            int r2 = r1.ordinal()
            r4 = 1
            r0 = 2
            r1 = 2131896858(0x7f122a1a, float:1.942859E38)
            if (r2 == r0) goto L_0x028a
            r0 = 3
            r1 = 2131896862(0x7f122a1e, float:1.9428597E38)
            if (r2 == r0) goto L_0x028a
            r0 = 4
            if (r2 == r0) goto L_0x02a2
            if (r2 != r4) goto L_0x0018
            r1 = 2131896861(0x7f122a1d, float:1.9428595E38)
        L_0x028a:
            java.lang.String r3 = X.C36361kB.A0m(r7, r1)
            r0 = 2131431994(0x7f0b123a, float:1.8485733E38)
            android.widget.TextView r2 = X.C36391kE.A0Q(r7, r0)
            if (r2 == 0) goto L_0x0018
            r1 = 2131896859(0x7f122a1b, float:1.9428591E38)
            java.lang.Object[] r0 = X.C36431kI.A1Z(r3, r4)
            X.C36341k9.A0s(r7, r2, r0, r1)
            return
        L_0x02a2:
            r1 = 2131896860(0x7f122a1c, float:1.9428593E38)
            goto L_0x028a
        L_0x02a6:
            int r5 = r5 + 1
            goto L_0x0269
        L_0x02a9:
            java.lang.String r0 = "settingsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02b0:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02b7:
            java.lang.String r1 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x02bf:
            java.lang.String r0 = "settingsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02c6:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity.onCreate(android.os.Bundle):void");
    }

    public NewsletterSettingsActivity() {
        this(0);
        this.A0D = C36431kI.A1I(new C84244Cm(this));
    }
}
