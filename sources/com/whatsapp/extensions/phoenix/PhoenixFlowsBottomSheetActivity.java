package com.whatsapp.extensions.phoenix;

import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass1N6;
import X.AnonymousClass60P;
import X.AnonymousClass6EW;
import X.AnonymousClass707;
import X.C131376Ou;
import X.C149066zs;
import X.C163027pX;
import X.C163227pr;
import X.C18800tq;
import X.C18830tt;
import X.C20810yC;
import X.C222713q;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36431kI;
import X.C80243v5;
import X.C90464aC;
import X.C90484aE;
import X.C90504aG;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.extensions.phoenix.view.FlowsInitialLoadingView;
import com.whatsapp.extensions.phoenix.view.PhoenixFlowsBottomSheetContainer;
import com.whatsapp.jid.Jid;
import com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer;
import com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity;

public final class PhoenixFlowsBottomSheetActivity extends WaFcsBottomSheetModalActivity {
    public AnonymousClass1N6 A00;
    public boolean A01;
    public boolean A02;

    public boolean A2g() {
        return true;
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C90464aC.A11(r2, this);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A01 = r2.A3f();
            this.A00 = (AnonymousClass60P) A0L.A3V.get();
            this.A02 = C90484aE.A0a(r2);
            this.A04 = C27111My.A02(A0L);
            this.A00 = C90504aG.A0V(r2);
        }
    }

    public void A2X() {
        if (this.A0D.A0E(6715)) {
            AnonymousClass1N6 r4 = this.A00;
            if (r4 != null) {
                C222713q r0 = AnonymousClass11F.A00;
                r4.A03(C222713q.A00(Jid.Companion.A02(getIntent().getStringExtra("extra_business_jid"))), 63);
            } else {
                throw C36331k8.A0d("navigationTimeSpentManager");
            }
        }
        super.A2X();
    }

    public FcsBottomSheetBaseContainer A3i() {
        C20810yC r7 = this.A0D;
        AnonymousClass00C.A07(r7);
        String stringExtra = getIntent().getStringExtra("fds_observer_id");
        String stringExtra2 = getIntent().getStringExtra("extra_business_jid");
        String stringExtra3 = getIntent().getStringExtra("flow_id");
        PhoenixFlowsBottomSheetContainer phoenixFlowsBottomSheetContainer = new PhoenixFlowsBottomSheetContainer();
        Bundle A0I = C36431kI.A0I("fds_observer_id", stringExtra);
        A0I.putString("business_jid", stringExtra2);
        A0I.putString("flow_id", stringExtra3);
        A0I.putInt("fcs_bottom_sheet_max_height_percentage", r7.A07(3319));
        A0I.putBoolean("fcs_show_divider_under_nav_bar", true);
        phoenixFlowsBottomSheetContainer.A17(A0I);
        return phoenixFlowsBottomSheetContainer;
    }

    public PhoenixFlowsBottomSheetActivity(int i) {
        this.A02 = false;
        C163027pX.A00(this, 27);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass6EW r3 = this.A05;
        if (r3 != null) {
            r3.A01(new C163227pr(this, 4), C149066zs.class, r3);
            r3.A01(new C163227pr(this, 3), AnonymousClass707.class, r3);
        }
    }

    public void onDestroy() {
        String stringExtra = getIntent().getStringExtra("fds_observer_id");
        if (stringExtra != null) {
            synchronized (this.A02) {
                C131376Ou.A02.remove(stringExtra);
            }
        }
        this.A04.Boy(new C80243v5(this, 15));
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onResume() {
        PhoenixFlowsBottomSheetContainer phoenixFlowsBottomSheetContainer;
        super.onResume();
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = this.A03;
        if (fcsBottomSheetBaseContainer instanceof PhoenixFlowsBottomSheetContainer) {
            phoenixFlowsBottomSheetContainer = (PhoenixFlowsBottomSheetContainer) fcsBottomSheetBaseContainer;
        } else {
            phoenixFlowsBottomSheetContainer = null;
        }
        String stringExtra = getIntent().getStringExtra("extra_error_message");
        if (phoenixFlowsBottomSheetContainer != null) {
            FlowsInitialLoadingView flowsInitialLoadingView = phoenixFlowsBottomSheetContainer.A01;
            if (flowsInitialLoadingView != null) {
                flowsInitialLoadingView.setErrorMessage(stringExtra);
            }
            phoenixFlowsBottomSheetContainer.A1m();
        }
    }

    public PhoenixFlowsBottomSheetActivity() {
        this(0);
    }
}
