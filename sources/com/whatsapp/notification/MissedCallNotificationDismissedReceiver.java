package com.whatsapp.notification;

import X.AnonymousClass12P;
import X.C18830tt;
import X.C34061gO;
import X.C36441kJ;
import X.C56042vd;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class MissedCallNotificationDismissedReceiver extends BroadcastReceiver {
    public AnonymousClass12P A00;
    public C34061gO A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C18830tt.APU(C56042vd.A00(context), this);
                    this.A03 = true;
                }
            }
        }
        Log.i("missedcallnotification/dismiss");
        AnonymousClass12P r0 = this.A00;
        r0.A06();
        if (r0.A08) {
            this.A01.A02();
        }
    }

    public MissedCallNotificationDismissedReceiver(int i) {
        this.A03 = false;
        this.A02 = C36441kJ.A11();
    }

    public MissedCallNotificationDismissedReceiver() {
        this(0);
    }
}
