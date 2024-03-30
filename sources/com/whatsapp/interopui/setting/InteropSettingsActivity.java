package com.whatsapp.interopui.setting;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass3MZ;
import X.AnonymousClass3T1;
import X.AnonymousClass4CA;
import X.AnonymousClass4KT;
import X.C18800tq;
import X.C18830tt;
import X.C20380xT;
import X.C24791Du;
import X.C32931eR;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36431kI;
import X.C66023Uj;
import X.C89344We;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

public final class InteropSettingsActivity extends AnonymousClass155 {
    public C24791Du A00;
    public C32931eR A01;
    public C20380xT A02;
    public boolean A03;
    public final AnonymousClass00T A04;

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36431kI.A0g(A0B);
            this.A02 = C36331k8.A0I(A0B);
            this.A00 = (C24791Du) A0B.A4R.get();
        }
    }

    public InteropSettingsActivity(int i) {
        this.A03 = false;
        C89344We.A00(this, 6);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        Toolbar toolbar = (Toolbar) C36361kB.A0H(this, R.id.toolbar);
        super.setSupportActionBar(toolbar);
        AnonymousClass07B A0N = C36341k9.A0N(this);
        String A0m = C36361kB.A0m(this, R.string.f12nameremoved);
        A0N.A0Q(A0m);
        AnonymousClass3MZ.A01(toolbar, this.A00, A0m);
        C66023Uj.A01(this, ((InteropSettingsViewModel) this.A04.getValue()).A00, new AnonymousClass4KT(this), 37);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) != R.id.info_menu_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        C20380xT r1 = this.A02;
        if (r1 != null) {
            Uri A022 = r1.A02("317021344671277");
            AnonymousClass00C.A08(A022);
            C24791Du r12 = this.A00;
            if (r12 != null) {
                r12.Bp7(this, A022, (AnonymousClass3T1) null);
                return true;
            }
            throw C36331k8.A0d("activityLauncher");
        }
        throw C36331k8.A0d("faqLinkFactory");
    }

    public void onResume() {
        super.onResume();
        C32931eR r0 = this.A01;
        if (r0 != null) {
            r0.A00();
            return;
        }
        throw C36331k8.A0d("interopRolloutManager");
    }

    public InteropSettingsActivity() {
        this(0);
        this.A04 = C36431kI.A1I(new AnonymousClass4CA(this));
    }
}
