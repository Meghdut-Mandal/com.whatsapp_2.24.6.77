package com.whatsapp.systemreceivers.appupdated;

import X.AnonymousClass00C;
import X.AnonymousClass13N;
import X.C18830tt;
import X.C36331k8;
import X.C36441kJ;
import X.C56042vd;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class AppUpdatedReceiver extends BroadcastReceiver {
    public AnonymousClass13N A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    C18830tt.APx(C56042vd.A00(context), this);
                    this.A02 = true;
                }
            }
        }
        AnonymousClass00C.A0D(context, 0);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(str) && this.A00 == null) {
            throw C36331k8.A0d("appUpdateManager");
        }
    }

    public AppUpdatedReceiver(int i) {
        this.A02 = false;
        this.A01 = C36441kJ.A11();
    }

    public AppUpdatedReceiver() {
        this(0);
    }
}
