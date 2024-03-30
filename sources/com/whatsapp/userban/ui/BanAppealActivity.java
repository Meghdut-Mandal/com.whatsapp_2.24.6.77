package com.whatsapp.userban.ui;

import X.AnonymousClass000;
import X.AnonymousClass155;
import X.C18800tq;
import X.C18830tt;
import X.C19420v0;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36441kJ;
import X.C65563So;
import X.C65943Ub;
import X.C65963Ud;
import X.C89374Wh;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;

public class BanAppealActivity extends AnonymousClass155 {
    public BanAppealViewModel A00;
    public String A01;
    public boolean A02;

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public BanAppealActivity(int i) {
        this.A02 = false;
        C89374Wh.A00(this, 20);
    }

    public void onCreate(Bundle bundle) {
        Boolean bool;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A00 = (BanAppealViewModel) C36441kJ.A0b(this).A00(BanAppealViewModel.class);
        if (getIntent().hasExtra("is_eu_smb")) {
            bool = Boolean.valueOf(getIntent().getBooleanExtra("is_eu_smb", false));
        } else {
            bool = null;
        }
        String stringExtra = getIntent().getStringExtra("appeal_request_token");
        int intExtra = getIntent().getIntExtra("ban_violation_type", -1);
        int intExtra2 = getIntent().getIntExtra("launch_source", 0);
        BanAppealViewModel banAppealViewModel = this.A00;
        if (stringExtra != null) {
            C36341k9.A0x(C19420v0.A00(banAppealViewModel.A08.A06), "support_ban_appeal_token", stringExtra);
        }
        if (intExtra >= 0) {
            C65563So r2 = banAppealViewModel.A08;
            C36321k7.A1T("BanAppealRepository/storeBanViolationType ", AnonymousClass000.A0u(), intExtra);
            C36341k9.A0v(C19420v0.A00(r2.A06), "support_ban_appeal_violation_type", intExtra);
        }
        if (bool != null) {
            C65563So r3 = banAppealViewModel.A08;
            boolean booleanValue = bool.booleanValue();
            C36321k7.A1X("BanAppealRepository/storeBanIsEuSmbUser ", AnonymousClass000.A0u(), booleanValue);
            C36331k8.A0w(C19420v0.A00(r3.A06), "support_ban_appeal_is_eu_smb_user", booleanValue);
        }
        banAppealViewModel.A00 = intExtra2;
        if (bundle == null) {
            this.A00.A0S();
        } else {
            this.A01 = bundle.getString("first_fragment_tag_save_instance_state");
        }
        this.A00.A0A.A08(this, new C65943Ub(this, 1));
        this.A00.A01.A08(this, new C65943Ub(this, 0));
        C65963Ud.A00(this, this.A00.A09, 49);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("BanAppealActivity/onNewIntent");
        BanAppealViewModel banAppealViewModel = this.A00;
        if (banAppealViewModel.A00 == 4) {
            banAppealViewModel.A0S();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("first_fragment_tag_save_instance_state", this.A01);
    }

    public void onStart() {
        super.onStart();
        this.A00.A05.A03(42, "BanAppealActivity");
    }

    public BanAppealActivity() {
        this(0);
    }
}
