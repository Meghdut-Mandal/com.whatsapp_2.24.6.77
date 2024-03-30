package com.whatsapp.xfamily.crossposting.ui;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01P;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass15K;
import X.AnonymousClass1Q1;
import X.AnonymousClass1US;
import X.AnonymousClass1UZ;
import X.AnonymousClass3ZU;
import X.AnonymousClass4XY;
import X.C132686Uv;
import X.C1501674f;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C21060yb;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36411kG;
import X.C36431kI;
import X.C89374Wh;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

public final class ShareToFacebookActivity extends AnonymousClass155 implements AnonymousClass15K {
    public static final AnonymousClass1US A07 = AnonymousClass1US.SHARE_TO_FACEBOOK_ACTIVITY;
    public AnonymousClass3ZU A00;
    public AnonymousClass1Q1 A01;
    public AnonymousClass1UZ A02;
    public C132686Uv A03;
    public AnonymousClass005 A04;
    public AnonymousClass005 A05;
    public boolean A06;

    public String BCV() {
        return "share_to_fb_activity";
    }

    public AnonymousClass3ZU BHi(int i, int i2, boolean z) {
        View view = this.A00;
        ArrayList A13 = C36411kG.A13(view);
        C21060yb r5 = this.A08;
        AnonymousClass00C.A07(r5);
        AnonymousClass3ZU r2 = new AnonymousClass3ZU(view, (AnonymousClass012) this, r5, (List) A13, i, i2, z);
        this.A00 = r2;
        r2.A05(new C1501674f(this, 16));
        AnonymousClass3ZU r1 = this.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.snackbar.WaSnackbar");
        return r1;
    }

    public void A2F() {
        if (!this.A06) {
            this.A06 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A05 = C18840tu.A00(r2.A3S);
            this.A04 = C18840tu.A00(A0L.A00);
            this.A03 = (C132686Uv) r1.A6Y.get();
            this.A01 = (AnonymousClass1Q1) r2.A9I.get();
            this.A02 = (AnonymousClass1UZ) r2.AfD.get();
        }
    }

    public final AnonymousClass1UZ A3i() {
        AnonymousClass1UZ r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("xFamilyUserFlowLogger");
    }

    public AnonymousClass01P BAc() {
        AnonymousClass01P r0 = this.A06.A02;
        AnonymousClass00C.A08(r0);
        return r0;
    }

    public void onDestroy() {
        AnonymousClass1Q1 r0 = this.A01;
        if (r0 != null) {
            r0.A02(this);
            AnonymousClass1UZ A3i = A3i();
            AnonymousClass005 r02 = this.A05;
            if (r02 != null) {
                A3i.A02(Boolean.valueOf(C36341k9.A1Z(C36431kI.A10(r02).A01(A07))), "final_auto_setting");
                A3i.A04("EXIT_STATUS_PRIVACY_DETAILS");
                A3i.A01();
                super.onDestroy();
                return;
            }
            throw C36331k8.A0d("fbAccountManagerLazy");
        }
        throw C36331k8.A0d("waSnackbarRegistry");
    }

    public ShareToFacebookActivity(int i) {
        this.A06 = false;
        C89374Wh.A00(this, 25);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1Q1 r0 = this.A01;
        if (r0 != null) {
            r0.A01(this);
            AnonymousClass07B supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0U(true);
                supportActionBar.A0Q(getString(R.string.f12nameremoved));
            }
            setContentView((int) R.layout.f9nameremoved);
            CompoundButton compoundButton = (CompoundButton) C36361kB.A0G(this.A00, R.id.auto_crosspost_setting_switch);
            AnonymousClass005 r02 = this.A05;
            if (r02 != null) {
                compoundButton.setChecked(C36341k9.A1Z(C36431kI.A10(r02).A01(A07)));
                AnonymousClass4XY.A00(compoundButton, this, 25);
                C36351kA.A1E(findViewById(R.id.share_to_facebook_unlink_container), this, 43);
                AnonymousClass1UZ A3i = A3i();
                A3i.A06((String) null, "SEE_STATUS_PRIVACY_DETAILS", 927601761);
                A3i.A02(Boolean.valueOf(compoundButton.isChecked()), "initial_auto_setting");
                return;
            }
            throw C36331k8.A0d("fbAccountManagerLazy");
        }
        throw C36331k8.A0d("waSnackbarRegistry");
    }

    public ShareToFacebookActivity() {
        this(0);
    }
}
