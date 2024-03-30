package com.whatsapp.conversation.conversationrow.nativeflow.reminder;

import X.AnonymousClass1A1;
import X.C128916Ec;
import X.C17880sD;
import X.C18800tq;
import X.C19770wU;
import X.C19970wo;
import X.C20810yC;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C62173Fb;
import X.C65003Qi;
import X.C80283v9;
import X.C97334ow;
import X.C99424tL;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;

public final class RescheduleReminderAlarmsWorker extends C128916Ec {
    public static final long A06 = TimeUnit.DAYS.toMillis(1);
    public final C65003Qi A00;
    public final C62173Fb A01;
    public final AnonymousClass1A1 A02;
    public final C19970wo A03;
    public final C20810yC A04;
    public final C19770wU A05;

    public C17880sD A06() {
        C99424tL r2 = new C99424tL();
        if (this.A04.A0E(5075)) {
            C80283v9.A00(this.A05, this, r2, 30);
            return r2;
        }
        this.A00.A01();
        r2.A04(new C97334ow());
        return r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RescheduleReminderAlarmsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A02 = C36351kA.A0n(A0P);
        this.A00 = A0P.AzS();
        this.A01 = (C62173Fb) A0P.A7Y.get();
        this.A05 = C36341k9.A0Z(A0P);
        this.A03 = A0P.Bvc();
        this.A04 = A0P.Azp();
    }
}
