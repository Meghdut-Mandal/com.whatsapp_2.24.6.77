package com.whatsapp.wabloks.ui;

import X.AnonymousClass00C;
import X.AnonymousClass01z;
import X.AnonymousClass5Oq;
import X.AnonymousClass60P;
import X.AnonymousClass65A;
import X.AnonymousClass6EW;
import X.AnonymousClass7i0;
import X.C100984wM;
import X.C116645kv;
import X.C120325rK;
import X.C1265064h;
import X.C131376Ou;
import X.C149116zx;
import X.C1498172w;
import X.C158047fi;
import X.C158057fj;
import X.C159757js;
import X.C162137o5;
import X.C18740tg;
import X.C36331k8;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.wabloks.base.FdsContentFragmentManager;
import java.util.Map;
import java.util.Queue;

public class WaFcsBottomSheetModalActivity extends C100984wM implements C159757js, AnonymousClass7i0, C162137o5 {
    public AnonymousClass60P A00;
    public C1265064h A01;
    public C131376Ou A02;
    public FcsBottomSheetBaseContainer A03;
    public Map A04;
    public AnonymousClass6EW A05;

    public AnonymousClass65A BJB() {
        return this.A00.A00(this, getSupportFragmentManager(), new C116645kv(this.A04));
    }

    public void BsW(boolean z) {
        this.A03.BsW(z);
    }

    public void Bwn(C158057fj r5) {
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = this.A03;
        C120325rK r2 = fcsBottomSheetBaseContainer.A0D;
        if (r2 != null) {
            C1498172w r1 = new C1498172w(r5, fcsBottomSheetBaseContainer, 31);
            if (r2.A00) {
                r2.A01.add(r1);
            } else {
                r1.run();
            }
        } else {
            throw C36331k8.A0d("bkPendingScreenTransitionCallbacks");
        }
    }

    public void Bwo(C158047fi r5, C158057fj r6, boolean z) {
        Toolbar toolbar;
        ProgressBar progressBar;
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = this.A03;
        AnonymousClass5Oq r0 = fcsBottomSheetBaseContainer.A0G;
        if (r0 != null) {
            r0.A01(r5, r6);
        }
        if (z && (toolbar = fcsBottomSheetBaseContainer.A03) != null) {
            Menu menu = toolbar.getMenu();
            AnonymousClass00C.A08(menu);
            MenuInflater menuInflater = fcsBottomSheetBaseContainer.A0i().getMenuInflater();
            AnonymousClass00C.A08(menuInflater);
            fcsBottomSheetBaseContainer.A1U(menu, menuInflater);
            Menu menu2 = toolbar.getMenu();
            AnonymousClass00C.A08(menu2);
            if (menu2.size() == 0 && (progressBar = fcsBottomSheetBaseContainer.A02) != null) {
                progressBar.setVisibility(4);
            }
        }
    }

    public void A1r() {
        super.A1r();
        FdsContentFragmentManager fdsContentFragmentManager = this.A03.A0E;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A01 = true;
            while (true) {
                Queue queue = fdsContentFragmentManager.A03;
                if (!queue.isEmpty()) {
                    C36411kG.A1O(queue.remove());
                } else {
                    return;
                }
            }
        }
    }

    public FcsBottomSheetBaseContainer A3i() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("fds_observer_id");
        String stringExtra2 = intent.getStringExtra("fds_on_back");
        String stringExtra3 = intent.getStringExtra("fds_on_back_params");
        String stringExtra4 = intent.getStringExtra("fds_button_style");
        String stringExtra5 = intent.getStringExtra("fds_state_name");
        int intExtra = intent.getIntExtra("fcs_bottom_sheet_max_height_percentage", 100);
        boolean A1T = C36421kH.A1T(intent, "fcs_show_divider_under_nav_bar");
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = new FcsBottomSheetBaseContainer();
        Bundle A0I = C36431kI.A0I("fds_observer_id", stringExtra);
        A0I.putString("fds_on_back", stringExtra2);
        A0I.putString("fds_on_back_params", stringExtra3);
        A0I.putString("fds_button_style", stringExtra4);
        A0I.putString("fds_state_name", stringExtra5);
        A0I.putInt("fcs_bottom_sheet_max_height_percentage", intExtra);
        A0I.putBoolean("fcs_show_divider_under_nav_bar", A1T);
        fcsBottomSheetBaseContainer.A17(A0I);
        return fcsBottomSheetBaseContainer;
    }

    public C1265064h B8t() {
        return this.A01;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(getResources().getColor(R.color.f6nameremoved));
        int i = 1;
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        }
        setRequestedOrientation(i);
        AnonymousClass6EW A022 = this.A02.A02(getIntent().getStringExtra("fds_observer_id"));
        this.A05 = A022;
        AnonymousClass6EW.A00(A022, C149116zx.class, this, 27);
        FcsBottomSheetBaseContainer A3i = A3i();
        this.A03 = A3i;
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        C18740tg.A06(supportFragmentManager);
        A3i.A1f(supportFragmentManager, "fds_bottom_sheet_container");
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass6EW r0 = this.A05;
        if (r0 != null) {
            r0.A04(this);
        }
        this.A05 = null;
    }

    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        FdsContentFragmentManager fdsContentFragmentManager = this.A03.A0E;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A01 = false;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        FdsContentFragmentManager fdsContentFragmentManager = this.A03.A0E;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A01 = false;
        }
    }
}
