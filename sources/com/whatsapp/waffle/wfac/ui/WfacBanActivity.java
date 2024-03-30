package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass3TI;
import X.AnonymousClass5X0;
import X.AnonymousClass66X;
import X.C163037pY;
import X.C165207t3;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36441kJ;
import X.C90464aC;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;

public final class WfacBanActivity extends AnonymousClass155 {
    public WfacBanViewModel A00;
    public boolean A01;

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C90464aC.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C90464aC.A0y(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public WfacBanActivity(int i) {
        this.A01 = false;
        C163037pY.A00(this, 14);
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass66X r3;
        String str;
        String str2;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A00 = (WfacBanViewModel) C36441kJ.A0b(this).A00(WfacBanViewModel.class);
        int intExtra = getIntent().getIntExtra("ban_violation_type", -1);
        String stringExtra = getIntent().getStringExtra("ban_violation_reason");
        int intExtra2 = getIntent().getIntExtra("ban_violation_source", -1);
        int i = 2;
        if (intExtra2 == 0) {
            i = 0;
        } else if (intExtra2 == 1) {
            i = 1;
        } else if (intExtra2 != 2) {
            i = -1;
        }
        int intExtra3 = getIntent().getIntExtra("launch_source", 0);
        String stringExtra2 = getIntent().getStringExtra("appeal_decision");
        String str3 = "banned";
        String str4 = str3;
        if (!AnonymousClass00C.A0J(stringExtra2, str3)) {
            if (AnonymousClass00C.A0J(stringExtra2, "unbanned")) {
                str3 = "unbanned";
            } else {
                str3 = "other";
            }
        }
        String stringExtra3 = getIntent().getStringExtra("ban_status_request_token");
        WfacBanViewModel wfacBanViewModel = this.A00;
        if (wfacBanViewModel == null) {
            throw C36331k8.A0d("viewModel");
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WfacBanViewModel violation [");
        A0u.append(intExtra);
        A0u.append("] with reason [");
        A0u.append(stringExtra);
        A0u.append("], violation source [");
        A0u.append(i);
        A0u.append("]and appeal decision [");
        A0u.append(str3);
        A0u.append("] from launch source [");
        A0u.append(intExtra3);
        AnonymousClass00C.A0D(AnonymousClass000.A0t(A0u, ']'), 0);
        if (stringExtra3 != null) {
            C36341k9.A0x(C36351kA.A0A(wfacBanViewModel.A04.A00.A01), "wfac_ban_status_token", stringExtra3);
        }
        if (intExtra >= 0) {
            AnonymousClass66X r10 = wfacBanViewModel.A04;
            AnonymousClass3TI.A01(AnonymousClass000.A0r("WfacBanRepository/storeViolationType : ", AnonymousClass000.A0u(), intExtra));
            C36341k9.A0v(C36351kA.A0A(r10.A00.A01), "wfac_ban_violation_type", intExtra);
        }
        if (stringExtra != null) {
            AnonymousClass66X r9 = wfacBanViewModel.A04;
            AnonymousClass3TI.A01(AnonymousClass000.A0p("WfacBanRepository/storeViolationReason : ", stringExtra, AnonymousClass000.A0u()));
            C36341k9.A0x(C36351kA.A0A(r9.A00.A01), "wfac_ban_violation_reason", stringExtra);
        }
        wfacBanViewModel.A00 = intExtra3;
        if (intExtra3 == 2 || intExtra3 == 3) {
            AnonymousClass66X r2 = wfacBanViewModel.A04;
            AnonymousClass3TI.A01(AnonymousClass000.A0r("WfacBanRepository/storeViolationSource : ", AnonymousClass000.A0u(), i));
            C36341k9.A0v(C36351kA.A0A(r2.A00.A01), "wfac_ban_violation_source", i);
        }
        wfacBanViewModel.A01 = str3;
        WfacBanViewModel wfacBanViewModel2 = this.A00;
        if (wfacBanViewModel2 == null) {
            throw C36331k8.A0d("viewModel");
        }
        wfacBanViewModel2.A03.A08(this, new C165207t3(AnonymousClass5X0.A02(this, 34), 14));
        WfacBanViewModel wfacBanViewModel3 = this.A00;
        if (wfacBanViewModel3 == null) {
            throw C36331k8.A0d("viewModel");
        }
        int i2 = wfacBanViewModel3.A00;
        if (i2 == 2 || i2 == 3) {
            r3 = wfacBanViewModel3.A04;
            str = "CHECKPOINTED";
            AnonymousClass3TI.A01(AnonymousClass000.A0p("WfacBanRepository/storeBanState : ", str, AnonymousClass000.A0u()));
            C36341k9.A0x(C36351kA.A0A(r3.A00.A01), "wfac_ban_state", str);
        } else {
            if (i2 != 4) {
                str2 = "WfacBanViewModel/setBanState unknown or main default launch. Using previous state";
            } else {
                String str5 = wfacBanViewModel3.A01;
                if (AnonymousClass00C.A0J(str5, str4)) {
                    r3 = wfacBanViewModel3.A04;
                    str = "BANNED";
                } else if (AnonymousClass00C.A0J(str5, "unbanned")) {
                    r3 = wfacBanViewModel3.A04;
                    str = "UNBANNED";
                } else {
                    str2 = "WfacBanViewModel/setBanState unknown or missing appeal decision. Ignoring";
                }
                AnonymousClass3TI.A01(AnonymousClass000.A0p("WfacBanRepository/storeBanState : ", str, AnonymousClass000.A0u()));
                C36341k9.A0x(C36351kA.A0A(r3.A00.A01), "wfac_ban_state", str);
            }
            AnonymousClass3TI.A01(str2);
        }
        if (bundle == null) {
            WfacBanViewModel wfacBanViewModel4 = this.A00;
            if (wfacBanViewModel4 == null) {
                throw C36331k8.A0d("viewModel");
            }
            wfacBanViewModel4.A0T();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        AnonymousClass3TI.A01("WfacBanActivity/onNewIntent");
        WfacBanViewModel wfacBanViewModel = this.A00;
        if (wfacBanViewModel == null) {
            throw C36331k8.A0d("viewModel");
        } else if (wfacBanViewModel.A00 == 4) {
            wfacBanViewModel.A0T();
        }
    }

    public void onStart() {
        super.onStart();
        WfacBanViewModel wfacBanViewModel = this.A00;
        if (wfacBanViewModel == null) {
            throw C36331k8.A0a();
        }
        wfacBanViewModel.A02.A03(76, "WfacBanActivity");
    }

    public WfacBanActivity() {
        this(0);
    }
}
