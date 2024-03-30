package com.whatsapp.notification;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass39J;
import X.AnonymousClass735;
import X.C18830tt;
import X.C19420v0;
import X.C19740wR;
import X.C222713q;
import X.C28361Si;
import X.C36341k9;
import X.C36431kI;
import X.C36441kJ;
import X.C56042vd;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.Locale;

public class MessageNotificationDismissedReceiver extends BroadcastReceiver {
    public C19420v0 A00;
    public C28361Si A01;
    public AnonymousClass39J A02;
    public final Object A03;
    public volatile boolean A04;

    public void onReceive(Context context, Intent intent) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    C18830tt.APS(C56042vd.A00(context), this);
                    this.A04 = true;
                }
            }
        }
        if (intent.hasExtra("chat_jid")) {
            long longExtra = intent.getLongExtra("last_message_time", -1);
            String stringExtra = intent.getStringExtra("chat_jid");
            Locale locale = Locale.US;
            Object[] A1a = C36431kI.A1a("messagenotificationdismissedreceiver/onreceive", stringExtra, 3);
            AnonymousClass000.A1M(A1a, 2, longExtra);
            String.format(locale, "%s child notification: chatJid=%s, last_message_time=%d", A1a);
            AnonymousClass39J r3 = this.A02;
            String stringExtra2 = intent.getStringExtra("chat_jid");
            long longExtra2 = intent.getLongExtra("last_message_time", -1);
            try {
                C222713q r0 = AnonymousClass11F.A00;
                AnonymousClass11F A012 = C222713q.A01(stringExtra2);
                r3.A03.put(A012, Long.valueOf(longExtra2));
                r3.A02.Boy(new AnonymousClass735(r3, A012, 5, longExtra2));
            } catch (C19740wR unused) {
                Log.e("messagenotificationdismisshelper/handleDismissIntent: Invalid Jid stored in intent");
            }
        } else {
            String stringExtra3 = intent.getStringExtra("notification_hash");
            C36341k9.A0x(C19420v0.A00(this.A00), "notification_hash", stringExtra3);
            String.format("%s summary notification: notification_hash=%s", C36431kI.A1a("messagenotificationdismissedreceiver/onreceive", stringExtra3, 2));
            this.A01.A08();
        }
    }

    public MessageNotificationDismissedReceiver(int i) {
        this.A04 = false;
        this.A03 = C36441kJ.A11();
    }

    public MessageNotificationDismissedReceiver() {
        this(0);
    }
}
