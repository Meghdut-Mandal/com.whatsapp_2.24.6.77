package com.whatsapp.lastseen;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass3GS;
import X.AnonymousClass3Y3;
import X.AnonymousClass4CC;
import X.AnonymousClass4CD;
import X.AnonymousClass4CE;
import X.AnonymousClass4CF;
import X.AnonymousClass4CG;
import X.AnonymousClass4CH;
import X.AnonymousClass4P2;
import X.C18800tq;
import X.C18830tt;
import X.C27341Nv;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36411kG;
import X.C36431kI;
import X.C89344We;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;

public final class PresencePrivacyActivity extends AnonymousClass155 implements AnonymousClass4P2 {
    public C27341Nv A00;
    public AnonymousClass190 A01;
    public boolean A02;
    public final AnonymousClass3GS A03;
    public final AnonymousClass00T A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass3GS A0A;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    private final void A07(RadioButton radioButton, int i, int i2, boolean z) {
        if (i != i2 || !z) {
            radioButton.setChecked(AnonymousClass000.A1S(i, i2));
        } else {
            this.A0A.A01(radioButton);
        }
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36351kA.A0h(A0B);
            this.A00 = C36411kG.A0X(A0B);
        }
    }

    public final C27341Nv A3i() {
        C27341Nv r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("privacySettingManager");
    }

    public PresencePrivacyActivity(int i) {
        this.A02 = false;
        C89344We.A00(this, 10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        if (r3 == 4) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r6 = this;
            X.1Nv r0 = r6.A3i()
            java.lang.String r1 = "last"
            java.util.Map r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            r4 = 1
            r2 = 0
            r5 = 1
            if (r0 != 0) goto L_0x0017
            r5 = 0
            X.3GS r0 = r6.A0A
            r0.A00()
        L_0x0017:
            X.1Nv r0 = r6.A3i()
            int r3 = r0.A00(r1)
            X.00T r0 = r6.A05
            java.lang.Object r0 = X.C36381kD.A0p(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r6.A07(r0, r3, r4, r5)
            X.00T r0 = r6.A04
            java.lang.Object r0 = X.C36381kD.A0p(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r6.A07(r0, r3, r2, r5)
            X.00T r0 = r6.A07
            java.lang.Object r1 = X.C36381kD.A0p(r0)
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            r0 = 2
            r6.A07(r1, r3, r0, r5)
            X.00T r0 = r6.A06
            java.lang.Object r1 = X.C36381kD.A0p(r0)
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            r0 = 3
            r6.A07(r1, r3, r0, r5)
            X.1Nv r0 = r6.A3i()
            java.lang.String r1 = "online"
            java.util.Map r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0061
            r4 = 0
            X.3GS r0 = r6.A03
            r0.A00()
        L_0x0061:
            X.1Nv r0 = r6.A3i()
            int r3 = r0.A00(r1)
            X.00T r0 = r6.A08
            java.lang.Object r1 = X.C36381kD.A0p(r0)
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            if (r3 != r2) goto L_0x008f
            if (r4 == 0) goto L_0x008d
            X.3GS r0 = r6.A03
            r0.A01(r1)
        L_0x007a:
            X.00T r0 = r6.A09
            java.lang.Object r2 = X.C36381kD.A0p(r0)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r0 = 4
            if (r3 != r0) goto L_0x0094
            if (r4 == 0) goto L_0x0098
            X.3GS r0 = r6.A03
            r0.A01(r2)
            return
        L_0x008d:
            r0 = 1
            goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            r1.setChecked(r0)
            goto L_0x007a
        L_0x0094:
            r1 = 4
            r0 = 0
            if (r3 != r1) goto L_0x0099
        L_0x0098:
            r0 = 1
        L_0x0099:
            r2.setChecked(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lastseen.PresencePrivacyActivity.A01():void");
    }

    public void BgP() {
        A01();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            supportActionBar.A0I(R.string.f12nameremoved);
            View findViewById = findViewById(R.id.reciprocity_description);
            AnonymousClass00C.A0E(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            C36361kB.A1P(getString(R.string.f12nameremoved), (TextView) findViewById);
            AnonymousClass00T r7 = this.A05;
            C36351kA.A0G(r7).setText(R.string.f12nameremoved);
            AnonymousClass00T r6 = this.A04;
            C36351kA.A0G(r6).setText(R.string.f12nameremoved);
            AnonymousClass00T r5 = this.A06;
            C36351kA.A0G(r5).setText(R.string.f12nameremoved);
            AnonymousClass00T r4 = this.A07;
            C36351kA.A0G(r4).setText(R.string.f12nameremoved);
            AnonymousClass00T r3 = this.A08;
            C36351kA.A0G(r3).setText(R.string.f12nameremoved);
            AnonymousClass00T r2 = this.A09;
            C36351kA.A0G(r2).setText(R.string.f12nameremoved);
            AnonymousClass3Y3.A00(C36361kB.A0I(r7), this, 45);
            AnonymousClass3Y3.A00(C36361kB.A0I(r6), this, 48);
            AnonymousClass3Y3.A00(C36361kB.A0I(r5), this, 47);
            AnonymousClass3Y3.A00(C36361kB.A0I(r4), this, 49);
            AnonymousClass3Y3.A00(C36361kB.A0I(r3), this, 44);
            AnonymousClass3Y3.A00(C36361kB.A0I(r2), this, 46);
            return;
        }
        throw C36381kD.A0l();
    }

    public void onPause() {
        super.onPause();
        A3i().A03.remove(this);
    }

    public void onResume() {
        super.onResume();
        A3i().A03.add(this);
        A01();
    }

    public PresencePrivacyActivity() {
        this(0);
        this.A04 = C36431kI.A1I(new AnonymousClass4CC(this));
        this.A05 = C36431kI.A1I(new AnonymousClass4CD(this));
        this.A06 = C36431kI.A1I(new AnonymousClass4CE(this));
        this.A07 = C36431kI.A1I(new AnonymousClass4CF(this));
        this.A08 = C36431kI.A1I(new AnonymousClass4CG(this));
        this.A09 = C36431kI.A1I(new AnonymousClass4CH(this));
        this.A0A = new AnonymousClass3GS();
        this.A03 = new AnonymousClass3GS();
    }
}
