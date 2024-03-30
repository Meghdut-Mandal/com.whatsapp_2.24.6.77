package com.whatsapp.notification;

import X.AnonymousClass1A1;
import X.AnonymousClass1TF;
import X.AnonymousClass1Y3;
import X.C18830tt;
import X.C19770wU;
import X.C36321k7;
import X.C36441kJ;
import X.C56042vd;
import X.C80393vK;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class OtpZeroTapMarkAsReadNotificationHandlerReceiver extends BroadcastReceiver {
    public AnonymousClass1Y3 A00;
    public AnonymousClass1TF A01;
    public AnonymousClass1A1 A02;
    public C19770wU A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    C18830tt.APV(C56042vd.A00(context), this);
                    this.A05 = true;
                }
            }
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extra_remote_jid");
            String stringExtra2 = intent.getStringExtra("extra_message_key_id");
            if (stringExtra != null && stringExtra2 != null) {
                C19770wU r2 = this.A03;
                if (r2 != null) {
                    r2.Boy(new C80393vK(this, stringExtra, stringExtra2, 13));
                    return;
                }
                throw C36321k7.A08();
            }
        }
    }

    public OtpZeroTapMarkAsReadNotificationHandlerReceiver(int i) {
        this.A05 = false;
        this.A04 = C36441kJ.A11();
    }

    public OtpZeroTapMarkAsReadNotificationHandlerReceiver() {
        this(0);
    }
}
