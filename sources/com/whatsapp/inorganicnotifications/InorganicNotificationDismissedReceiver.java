package com.whatsapp.inorganicnotifications;

import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass1NW;
import X.C18830tt;
import X.C36331k8;
import X.C36441kJ;
import X.C56042vd;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class InorganicNotificationDismissedReceiver extends BroadcastReceiver {
    public AnonymousClass1NW A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    C18830tt.APL(C56042vd.A00(context), this);
                    this.A02 = true;
                }
            }
        }
        AnonymousClass00C.A0D(context, 0);
        if (intent != null && intent.getStringExtra("inorganic_notification_id") != null) {
            AnonymousClass1NW r5 = this.A00;
            if (r5 != null) {
                r5.A00(AnonymousClass11F.A00.A02(intent.getStringExtra("inorganic_notification_chat_jid")), intent.getStringExtra("inorganic_notification_id"), intent.getIntExtra("inorganic_notification_type", -1), 2);
                return;
            }
            throw C36331k8.A0d("inorganicNotificationLogger");
        }
    }

    public InorganicNotificationDismissedReceiver(int i) {
        this.A02 = false;
        this.A01 = C36441kJ.A11();
    }

    public InorganicNotificationDismissedReceiver() {
        this(0);
    }
}
