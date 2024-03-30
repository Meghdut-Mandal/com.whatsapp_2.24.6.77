package com.whatsapp.extensions.webview;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass01z;
import X.AnonymousClass11F;
import X.AnonymousClass155;
import X.AnonymousClass1N6;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C80243v5;
import X.C89334Wd;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;

public final class WaFlowsWebViewBottomsheetModalActivity extends AnonymousClass155 {
    public AnonymousClass1N6 A00;
    public boolean A01;

    public boolean A2g() {
        return true;
    }

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36361kB.A0e(A0B);
        }
    }

    public void A2X() {
        if (this.A0D.A0E(6715)) {
            AnonymousClass1N6 r4 = this.A00;
            if (r4 != null) {
                r4.A03(AnonymousClass11F.A00.A02(getIntent().getStringExtra("chat_id")), 63);
            } else {
                throw C36331k8.A0d("navigationTimeSpentManager");
            }
        }
        super.A2X();
    }

    public void onDestroy() {
        C80243v5.A01(this.A04, this, 17);
        super.onDestroy();
    }

    public WaFlowsWebViewBottomsheetModalActivity(int i) {
        this.A01 = false;
        C89334Wd.A00(this, 26);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        setContentView((int) R.layout.f9nameremoved);
        getWindow().setStatusBarColor(AnonymousClass00F.A00(this, R.color.f6nameremoved));
        int i = 1;
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        }
        setRequestedOrientation(i);
        Intent intent = getIntent();
        AnonymousClass00C.A08(intent);
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = new FlowsWebBottomSheetContainer();
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("screen_params", intent.getStringExtra("screen_params"));
        A07.putString("chat_id", intent.getStringExtra("chat_id"));
        A07.putString("flow_id", intent.getStringExtra("flow_id"));
        A07.putAll(intent.getExtras());
        flowsWebBottomSheetContainer.A17(A07);
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        C18740tg.A06(supportFragmentManager);
        flowsWebBottomSheetContainer.A1f(supportFragmentManager, "flows_bottom_sheet_container");
    }

    public WaFlowsWebViewBottomsheetModalActivity() {
        this(0);
    }
}
