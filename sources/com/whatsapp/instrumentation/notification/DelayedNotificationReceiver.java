package com.whatsapp.instrumentation.notification;

import X.AnonymousClass1VE;
import X.C18820ts;
import X.C18830tt;
import X.C25271Fq;
import X.C33251ey;
import X.C36441kJ;
import X.C56042vd;
import X.C65743Th;
import X.C75473nI;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DelayedNotificationReceiver extends BroadcastReceiver {
    public C25271Fq A00;
    public C18820ts A01;
    public C33251ey A02;
    public AnonymousClass1VE A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    C18830tt.APM(C56042vd.A00(context), this);
                    this.A05 = true;
                }
            }
        }
        this.A03.A03(new C75473nI(context, this));
        PendingIntent A012 = C65743Th.A01(context, 0, intent, 536870912);
        if (A012 != null) {
            A012.cancel();
        }
    }

    public DelayedNotificationReceiver(int i) {
        this.A05 = false;
        this.A04 = C36441kJ.A11();
    }

    public DelayedNotificationReceiver() {
        this(0);
    }
}
