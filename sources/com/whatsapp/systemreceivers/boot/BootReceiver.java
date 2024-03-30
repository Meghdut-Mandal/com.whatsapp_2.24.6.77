package com.whatsapp.systemreceivers.boot;

import X.AnonymousClass00C;
import X.AnonymousClass4S8;
import X.C18830tt;
import X.C36331k8;
import X.C36441kJ;
import X.C56042vd;
import X.C598135j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public final class BootReceiver extends BroadcastReceiver {
    public C598135j A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    C18830tt.APy(C56042vd.A00(context), this);
                    this.A02 = true;
                }
            }
        }
        AnonymousClass00C.A0D(context, 0);
        if (intent != null && "android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            C598135j r1 = this.A00;
            if (r1 == null) {
                throw C36331k8.A0d("bootManager");
            } else if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
                Log.i("BootManager; boot completed.");
                if (r1.A00.A03()) {
                    for (AnonymousClass4S8 BSH : r1.A01) {
                        BSH.BSH();
                    }
                }
            }
        }
    }

    public BootReceiver(int i) {
        this.A02 = false;
        this.A01 = C36441kJ.A11();
    }

    public BootReceiver() {
        this(0);
    }
}
