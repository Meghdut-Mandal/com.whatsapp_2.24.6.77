package com.whatsapp.bonsai.onboarding;

import X.AnonymousClass05O;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1K3;
import X.AnonymousClass1K4;
import X.AnonymousClass1K6;
import X.AnonymousClass4WZ;
import X.C10950fU;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36431kI;
import X.C39341s7;
import X.C51412nm;
import X.C89314Wb;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public final class BonsaiOnboardingActivity extends AnonymousClass155 {
    public AnonymousClass1K3 A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = (AnonymousClass1K3) A0B.A0x.get();
        }
    }

    public BonsaiOnboardingActivity(int i) {
        this.A01 = false;
        C89314Wb.A00(this, 28);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        Integer valueOf;
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("bonsaiOnboardingEntryPoint", -1);
        if (intExtra == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(intExtra);
        }
        if (isTaskRoot()) {
            finish();
            C10950fU r4 = new C10950fU(this);
            Intent A03 = AnonymousClass190.A03(this);
            ArrayList arrayList = r4.A01;
            arrayList.add(A03);
            Intent A0D = C36431kI.A0D();
            if (valueOf != null) {
                A0D.putExtra("bonsaiOnboardingEntryPoint", valueOf);
            }
            A0D.setClassName(getPackageName(), "com.whatsapp.bonsai.onboarding.BonsaiOnboardingActivity");
            arrayList.add(A0D);
            r4.A02();
            return;
        }
        AnonymousClass1K3 r0 = this.A00;
        if (r0 != null) {
            AnonymousClass1K6.A00(this, new AnonymousClass4WZ(this, 0, 0, valueOf), ((AnonymousClass1K4) r0).A04, C51412nm.AGENT, valueOf);
            getSupportFragmentManager().A0S.A00.add(new AnonymousClass05O(new C39341s7(this), false));
            return;
        }
        throw C36331k8.A0d("bonsaiUiUtil");
    }

    public BonsaiOnboardingActivity() {
        this(0);
    }
}
