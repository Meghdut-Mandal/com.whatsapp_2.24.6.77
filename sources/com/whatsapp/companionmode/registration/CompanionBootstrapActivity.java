package com.whatsapp.companionmode.registration;

import X.AnonymousClass00F;
import X.AnonymousClass155;
import X.AnonymousClass1Pd;
import X.AnonymousClass2ZE;
import X.AnonymousClass3LD;
import X.AnonymousClass4W1;
import X.C18800tq;
import X.C18830tt;
import X.C19550w8;
import X.C25951Ih;
import X.C27661Pe;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36441kJ;
import X.C587730z;
import X.C89324Wc;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.ProgressBar;
import com.whatsapp.R;

public class CompanionBootstrapActivity extends AnonymousClass155 {
    public AnonymousClass2ZE A00;
    public C25951Ih A01;
    public AnonymousClass1Pd A02;
    public C27661Pe A03;
    public ProgressBar A04;
    public boolean A05;
    public final AnonymousClass3LD A06;
    public final C587730z A07;

    public void onBackPressed() {
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = (AnonymousClass1Pd) A0B.AEE.get();
            this.A00 = (AnonymousClass2ZE) A0B.AE5.get();
            this.A01 = (C25951Ih) A0B.A1z.get();
            this.A03 = (C27661Pe) A0B.A1u.get();
        }
    }

    public CompanionBootstrapActivity(int i) {
        this.A05 = false;
        C89324Wc.A00(this, 22);
    }

    public static void A01(CompanionBootstrapActivity companionBootstrapActivity, int i) {
        boolean A022 = C19550w8.A02();
        ProgressBar progressBar = companionBootstrapActivity.A04;
        if (A022) {
            progressBar.setProgress(i, true);
            return;
        }
        int[] A1O = C36441kJ.A1O();
        A1O[0] = progressBar.getProgress();
        A1O[1] = i;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", A1O);
        C36391kE.A13(ofInt);
        ofInt.start();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C25951Ih r0 = this.A01;
        C25951Ih.A00(r0).A06(this.A06);
        setContentView((int) R.layout.f9nameremoved);
        if (this.A03.A01()) {
            C36411kG.A0Q(this, R.id.header_image).setImageResource(R.drawable.ic_linked_android_phone);
        }
        this.A04 = (ProgressBar) findViewById(R.id.progress_indicator);
        AnonymousClass00F.A00(this, C36381kD.A02(this));
        A01(this, (this.A00.A09.get() * 100) / 3);
        this.A00.registerObserver(this.A07);
    }

    public void onDestroy() {
        super.onDestroy();
        C25951Ih r0 = this.A01;
        C25951Ih.A00(r0).A07(this.A06);
        this.A00.unregisterObserver(this.A07);
    }

    public CompanionBootstrapActivity() {
        this(0);
        this.A06 = new AnonymousClass4W1(this, 0);
        this.A07 = new C587730z(this);
    }
}
