package com.whatsapp.accountswitching.notifications;

import X.AnonymousClass00C;
import X.AnonymousClass098;
import X.AnonymousClass6VR;
import X.C18740tg;
import X.C18830tt;
import X.C21060yb;
import X.C21570zS;
import X.C36321k7;
import X.C36331k8;
import X.C36441kJ;
import X.C56042vd;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class InactiveAccountNotificationReceiver extends BroadcastReceiver {
    public C21060yb A00;
    public C21570zS A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C18830tt.APD(C56042vd.A00(context), this);
                    this.A03 = true;
                }
            }
        }
        C36321k7.A0w(context, intent);
        if (AnonymousClass00C.A0J(intent.getAction(), "com.whatsapp.accountswitching.inactiveaccount.IgnoreCall")) {
            int intExtra = intent.getIntExtra("inactiveAccountNotificationId", -1);
            String stringExtra = intent.getStringExtra("inactiveAccountNotificationTag");
            if (intExtra != -1 && stringExtra != null && !AnonymousClass098.A06(stringExtra)) {
                C21060yb r0 = this.A00;
                if (r0 != null) {
                    NotificationManager A07 = r0.A07();
                    C18740tg.A06(A07);
                    A07.cancel(stringExtra, intExtra);
                    C21570zS r02 = this.A01;
                    if (r02 != null) {
                        ((AnonymousClass6VR) r02.get()).A0A(stringExtra);
                        return;
                    }
                    throw C36331k8.A0d("workManagerLazy");
                }
                throw C36331k8.A0W();
            }
        }
    }

    public InactiveAccountNotificationReceiver(int i) {
        this.A03 = false;
        this.A02 = C36441kJ.A11();
    }

    public InactiveAccountNotificationReceiver() {
        this(0);
    }
}
