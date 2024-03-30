package com.whatsapp.notification;

import X.AnonymousClass17Y;
import X.AnonymousClass1A1;
import X.AnonymousClass1TF;
import X.AnonymousClass1Y3;
import X.C18830tt;
import X.C19770wU;
import X.C36441kJ;
import X.C56042vd;
import X.C80503vV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MessageOtpNotificationBroadcastReceiver extends BroadcastReceiver {
    public AnonymousClass17Y A00;
    public AnonymousClass1Y3 A01;
    public AnonymousClass1TF A02;
    public AnonymousClass1A1 A03;
    public C19770wU A04;
    public final Object A05;
    public volatile boolean A06;

    public void onReceive(Context context, Intent intent) {
        Context context2 = context;
        if (!this.A06) {
            synchronized (this.A05) {
                if (!this.A06) {
                    C18830tt.APT(C56042vd.A00(context), this);
                    this.A06 = true;
                }
            }
        }
        String stringExtra = intent.getStringExtra("extra_remote_jid");
        String stringExtra2 = intent.getStringExtra("extra_message_key_id");
        if (stringExtra != null && stringExtra2 != null) {
            this.A04.Boy(new C80503vV(this, context2, stringExtra, stringExtra2, 3));
        }
    }

    public MessageOtpNotificationBroadcastReceiver(int i) {
        this.A06 = false;
        this.A05 = C36441kJ.A11();
    }

    public MessageOtpNotificationBroadcastReceiver() {
        this(0);
    }
}
