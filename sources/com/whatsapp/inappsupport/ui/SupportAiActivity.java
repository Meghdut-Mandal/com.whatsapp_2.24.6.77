package com.whatsapp.inappsupport.ui;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass155;
import X.AnonymousClass1LY;
import X.AnonymousClass3RF;
import X.AnonymousClass4C4;
import X.AnonymousClass4KJ;
import X.AnonymousClass4KK;
import X.AnonymousClass4KL;
import X.AnonymousClass4KM;
import X.C18800tq;
import X.C18830tt;
import X.C33761ft;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36431kI;
import X.C66023Uj;
import X.C80293vA;
import X.C89334Wd;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet;

public final class SupportAiActivity extends AnonymousClass155 {
    public C33761ft A00;
    public AnonymousClass1LY A01;
    public boolean A02;
    public final AnonymousClass00T A03;

    public static final void A01(Bundle bundle, SupportAiActivity supportAiActivity) {
        AnonymousClass00C.A0D(bundle, 2);
        if (bundle.getBoolean("start_chat")) {
            Parcelable parcelableExtra = supportAiActivity.getIntent().getParcelableExtra("com.whatsapp.inappsupport.ui.SupportAiActivity.supportUserContext");
            SupportAiViewModel supportAiViewModel = (SupportAiViewModel) supportAiActivity.A03.getValue();
            C36341k9.A18(supportAiViewModel.A03, true);
            C80293vA.A00(supportAiViewModel.A0D, supportAiViewModel, parcelableExtra, 17);
            return;
        }
        supportAiActivity.finish();
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = (AnonymousClass1LY) A0B.A5r.get();
            this.A00 = (C33761ft) A0B.Abq.get();
        }
    }

    public SupportAiActivity(int i) {
        this.A02 = false;
        C89334Wd.A00(this, 48);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass00T r3 = this.A03;
        C66023Uj.A01(this, ((SupportAiViewModel) r3.getValue()).A03, new AnonymousClass4KK(this), 26);
        C66023Uj.A01(this, ((SupportAiViewModel) r3.getValue()).A02, new AnonymousClass4KL(this), 24);
        C66023Uj.A01(this, ((SupportAiViewModel) r3.getValue()).A0C, new AnonymousClass4KM(this), 25);
        C66023Uj.A01(this, ((SupportAiViewModel) r3.getValue()).A0B, new AnonymousClass4KJ(this), 23);
        AnonymousClass1LY r2 = this.A01;
        if (r2 == null) {
            throw C36331k8.A0d("nuxManager");
        } else if (!r2.A01((Object) null, "support_ai")) {
            Btm(new SupportAiNuxBottomSheet());
            getSupportFragmentManager().A0l(new AnonymousClass3RF(this, 11), this, "request_start_chat");
        } else {
            SupportAiViewModel supportAiViewModel = (SupportAiViewModel) r3.getValue();
            Parcelable parcelableExtra = getIntent().getParcelableExtra("com.whatsapp.inappsupport.ui.SupportAiActivity.supportUserContext");
            C36341k9.A18(supportAiViewModel.A03, true);
            C80293vA.A00(supportAiViewModel.A0D, supportAiViewModel, parcelableExtra, 17);
        }
    }

    public SupportAiActivity() {
        this(0);
        this.A03 = C36431kI.A1I(new AnonymousClass4C4(this));
    }
}
