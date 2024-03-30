package com.whatsapp.wabloks.ui;

import X.AnonymousClass5OV;
import X.AnonymousClass6EW;
import X.AnonymousClass703;
import X.C19430v1;
import X.C26981Mg;
import X.C90874b1;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;

public class WaFcsPreloadedBloksActivity extends AnonymousClass5OV {
    public final BroadcastReceiver A00 = new C90874b1(this);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C26981Mg.A00(this.A00, this, new IntentFilter("com.whatsapp.payments.phoenix.action.launch_activity_for_phoenix_result"), (Handler) null, C19430v1.A0C, true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundle;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            AnonymousClass6EW r1 = this.A00;
            if (r1 != null) {
                r1.A02(new AnonymousClass703(i2, bundle));
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.A00);
    }
}
