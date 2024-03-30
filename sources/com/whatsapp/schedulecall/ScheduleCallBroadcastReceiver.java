package com.whatsapp.schedulecall;

import X.AnonymousClass17Y;
import X.AnonymousClass1HR;
import X.AnonymousClass3Eq;
import X.AnonymousClass3UM;
import X.C18820ts;
import X.C18830tt;
import X.C19700wN;
import X.C19770wU;
import X.C19970wo;
import X.C20310xM;
import X.C26211Jh;
import X.C31021b9;
import X.C31031bA;
import X.C36441kJ;
import X.C44722Op;
import X.C56042vd;
import X.C591632w;
import X.C80303vB;
import X.C81213we;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ScheduleCallBroadcastReceiver extends BroadcastReceiver {
    public C19700wN A00;
    public AnonymousClass17Y A01;
    public AnonymousClass1HR A02;
    public AnonymousClass3Eq A03;
    public C19970wo A04;
    public C18820ts A05;
    public C20310xM A06;
    public C26211Jh A07;
    public C31021b9 A08;
    public C31031bA A09;
    public C591632w A0A;
    public C19770wU A0B;
    public final Object A0C;
    public volatile boolean A0D;

    public void onReceive(Context context, Intent intent) {
        boolean z;
        C19700wN r1;
        String str;
        if (!this.A0D) {
            synchronized (this.A0C) {
                if (!this.A0D) {
                    C18830tt.APu(C56042vd.A00(context), this);
                    this.A0D = true;
                }
            }
        }
        Intent intent2 = intent;
        String action = intent2.getAction();
        long longExtra = intent2.getLongExtra("extra_message_row_id", -1);
        boolean z2 = false;
        if (longExtra == -1) {
            r1 = this.A00;
            str = "scheduled-call-broadcast-receiver-no-row-id";
        } else if (action == null) {
            r1 = this.A00;
            str = "scheduled-call-broadcast-receiver-null-action";
        } else {
            switch (action.hashCode()) {
                case 181260125:
                    z = action.equals("action_schedule_call_advance_alert");
                    break;
                case 348840125:
                    z = action.equals("action_schedule_call");
                    break;
                case 1085261791:
                    if (action.equals("action_schedule_call_timeout")) {
                        this.A0B.Bp1(new C80303vB(this, longExtra, 18));
                        return;
                    }
                    return;
                default:
                    return;
            }
            if (z) {
                long longExtra2 = intent2.getLongExtra("extra_scheduled_call_timestamp_ms", -1);
                if (longExtra2 == -1) {
                    r1 = this.A00;
                    str = "scheduled-call-broadcast-receiver-no-scheduled-timestamp";
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = currentTimeMillis - longExtra2;
                    AnonymousClass3UM.A00(this.A05, currentTimeMillis);
                    AnonymousClass3UM.A00(this.A05, longExtra2);
                    if (j > 900000) {
                        z2 = true;
                    }
                    boolean equals = "action_schedule_call".equals(action);
                    C19770wU r0 = this.A0B;
                    if (equals) {
                        r0.Bp1(new C81213we(this, 5, longExtra, z2));
                        C591632w r2 = this.A0A;
                        C44722Op r12 = new C44722Op();
                        r12.A01 = Long.valueOf(j);
                        r2.A00.Bly(r12);
                        return;
                    }
                    r0.Bp1(new C81213we(this, 4, longExtra, z2));
                    return;
                }
            } else {
                return;
            }
        }
        r1.A0E(str, (String) null, false);
    }

    public ScheduleCallBroadcastReceiver(int i) {
        this.A0D = false;
        this.A0C = C36441kJ.A11();
    }

    public ScheduleCallBroadcastReceiver() {
        this(0);
    }
}
