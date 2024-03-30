package com.whatsapp.accounttransfer;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass098;
import X.C1496972k;
import X.C18830tt;
import X.C19770wU;
import X.C21060yb;
import X.C34201gc;
import X.C36321k7;
import X.C36331k8;
import X.C36441kJ;
import X.C56042vd;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;

public final class AccountTransferReceiver extends BroadcastReceiver {
    public C21060yb A00;
    public C19770wU A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        String str;
        KeyguardManager A06;
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C18830tt.APE(C56042vd.A00(context), this);
                    this.A03 = true;
                }
            }
        }
        boolean A1a = C36331k8.A1a(context, intent);
        String action = intent.getAction();
        C36321k7.A1Q("AccountTransferReceiver/onReceive/action=", action, AnonymousClass000.A0u());
        if (action == null || AnonymousClass098.A06(action) != A1a) {
            C21060yb r2 = this.A00;
            if (r2 == null) {
                throw C36331k8.A0W();
            } else if (Build.VERSION.SDK_INT < 23 || (A06 = r2.A06()) == null || !A06.isDeviceSecure() || C34201gc.A00(context) != 0) {
                str = "AccountTransferReceiver/onReceive/disabled";
            } else if (AnonymousClass00C.A0J(action, "com.google.android.gms.auth.START_ACCOUNT_EXPORT")) {
                C19770wU r22 = this.A01;
                if (r22 != null) {
                    r22.Boy(new C1496972k(context, 21));
                    return;
                }
                throw C36321k7.A08();
            } else {
                return;
            }
        } else {
            str = "AccountTransferReceiver/onReceive/action is empty";
        }
        Log.i(str);
    }

    public AccountTransferReceiver(int i) {
        this.A03 = false;
        this.A02 = C36441kJ.A11();
    }

    public AccountTransferReceiver() {
        this(0);
    }
}
