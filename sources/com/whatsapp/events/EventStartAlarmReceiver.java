package com.whatsapp.events;

import X.AnonymousClass16D;
import X.AnonymousClass190;
import X.AnonymousClass1A1;
import X.AnonymousClass1CR;
import X.AnonymousClass1MX;
import X.AnonymousClass3UJ;
import X.C18800tq;
import X.C18830tt;
import X.C19770wU;
import X.C19970wo;
import X.C20600xp;
import X.C20810yC;
import X.C220412q;
import X.C29581Xe;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import X.C56042vd;
import X.C58412zp;
import X.C64933Qa;
import X.C81313wo;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public final class EventStartAlarmReceiver extends AnonymousClass1MX {
    public C58412zp A00;
    public C20810yC A01;
    public C19770wU A02;
    public final Object A03;
    public volatile boolean A04;

    public void A01(Context context, Intent intent) {
        Context context2 = context;
        C36321k7.A0w(context, intent);
        Log.i("EventStartAlarmReceiver event start alarm triggered");
        C20810yC r1 = this.A01;
        if (r1 == null) {
            throw C36321k7.A07();
        } else if (!r1.A0E(7306)) {
            Log.i("EventStartAlarmReceiver skipping event start alarm trigger/ abprop disabled");
        } else {
            C64933Qa A022 = AnonymousClass3UJ.A02(intent);
            if (A022 != null) {
                C58412zp r12 = this.A00;
                if (r12 != null) {
                    C19970wo A0V = C36351kA.A0V(r12.A00.A00);
                    C18800tq r13 = r12.A00.A00;
                    C220412q A0a = C36351kA.A0a(r13);
                    AnonymousClass190 A0h = C36351kA.A0h(r13);
                    AnonymousClass16D A0R = C36341k9.A0R(r13);
                    AnonymousClass1A1 A0n = C36351kA.A0n(r13);
                    AnonymousClass1CR A0j = C36371kC.A0j(r13);
                    C81313wo r14 = new C81313wo(context2, A0R, A0V, C36391kE.A0d(r13), A0a, (C29581Xe) r13.A36.get(), A0h, (C20600xp) r13.A6w.get(), A022, A0j, A0n);
                    C19770wU r0 = this.A02;
                    if (r0 != null) {
                        r0.Boy(r14);
                        return;
                    }
                    throw C36321k7.A08();
                }
                throw C36331k8.A0d("eventStartNotificationRunnableFactory");
            }
        }
    }

    public void A00(Context context) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    C18830tt.APK(C56042vd.A00(context), this);
                    this.A04 = true;
                }
            }
        }
    }

    public EventStartAlarmReceiver(int i) {
        this.A04 = false;
        this.A03 = C36441kJ.A11();
    }

    public void onReceive(Context context, Intent intent) {
        A00(context);
        super.onReceive(context, intent);
    }

    public EventStartAlarmReceiver() {
        this(0);
    }
}
