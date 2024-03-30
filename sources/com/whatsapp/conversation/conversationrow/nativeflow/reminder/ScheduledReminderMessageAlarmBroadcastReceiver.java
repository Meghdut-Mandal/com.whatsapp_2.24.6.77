package com.whatsapp.conversation.conversationrow.nativeflow.reminder;

import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass16D;
import X.AnonymousClass185;
import X.AnonymousClass1A1;
import X.AnonymousClass1AW;
import X.AnonymousClass3CS;
import X.AnonymousClass3UJ;
import X.C18820ts;
import X.C18830tt;
import X.C19770wU;
import X.C19970wo;
import X.C20310xM;
import X.C20810yC;
import X.C238019x;
import X.C25271Fq;
import X.C36321k7;
import X.C36331k8;
import X.C36441kJ;
import X.C56042vd;
import X.C62173Fb;
import X.C64933Qa;
import X.C80673vm;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class ScheduledReminderMessageAlarmBroadcastReceiver extends BroadcastReceiver {
    public AnonymousClass16D A00;
    public AnonymousClass185 A01;
    public AnonymousClass3CS A02;
    public C19970wo A03;
    public C25271Fq A04;
    public C18820ts A05;
    public C20310xM A06;
    public C20310xM A07;
    public C62173Fb A08;
    public C20810yC A09;
    public C238019x A0A;
    public AnonymousClass1AW A0B;
    public AnonymousClass1A1 A0C;
    public C19770wU A0D;
    public final Object A0E;
    public volatile boolean A0F;

    public void onReceive(Context context, Intent intent) {
        String str;
        Bundle extras;
        Context context2 = context;
        if (!this.A0F) {
            synchronized (this.A0E) {
                if (!this.A0F) {
                    C18830tt.APJ(C56042vd.A00(context), this);
                    this.A0F = true;
                }
            }
        }
        AnonymousClass00C.A0D(context, 0);
        C20810yC r1 = this.A09;
        if (r1 == null) {
            throw C36321k7.A07();
        } else if (r1.A0E(5075)) {
            AnonymousClass11F r6 = null;
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (AnonymousClass00C.A0J(str, "scheduled_reminder_message_broadcast_action") && (extras = intent.getExtras()) != null) {
                long j = extras.getLong("scheduled_time_in_ms", -1);
                if (j >= 0) {
                    C64933Qa A022 = AnonymousClass3UJ.A02(intent);
                    if (A022 != null) {
                        r6 = A022.A00;
                    }
                    if (this.A03 != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C19770wU r0 = this.A0D;
                        if (r0 != null) {
                            r0.Boy(new C80673vm(context2, this, r6, A022, currentTimeMillis, j));
                            return;
                        }
                        throw C36321k7.A08();
                    }
                    throw C36331k8.A0d("time");
                }
            }
        }
    }

    public ScheduledReminderMessageAlarmBroadcastReceiver(int i) {
        this.A0F = false;
        this.A0E = C36441kJ.A11();
    }

    public ScheduledReminderMessageAlarmBroadcastReceiver() {
        this(0);
    }
}
