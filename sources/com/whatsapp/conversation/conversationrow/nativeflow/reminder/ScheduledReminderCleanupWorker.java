package com.whatsapp.conversation.conversationrow.nativeflow.reminder;

import X.AnonymousClass1A1;
import X.AnonymousClass3CS;
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

public final class ScheduledReminderCleanupWorker extends C128916Ec {
    public static final long A07 = TimeUnit.DAYS.toMillis(2);
    public final AnonymousClass3CS A00;
    public final C65003Qi A01;
    public final C62173Fb A02;
    public final AnonymousClass1A1 A03;
    public final C19970wo A04;
    public final C20810yC A05;
    public final C19770wU A06;

    public C17880sD A06() {
        C99424tL r2 = new C99424tL();
        if (this.A05.A0E(5075)) {
            C80283v9.A00(this.A06, this, r2, 31);
            return r2;
        }
        this.A01.A01();
        r2.A04(new C97334ow());
        return r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScheduledReminderCleanupWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A03 = C36351kA.A0n(A0P);
        this.A01 = A0P.AzS();
        this.A02 = (C62173Fb) A0P.A7Y.get();
        this.A06 = C36341k9.A0Z(A0P);
        this.A04 = A0P.Bvc();
        this.A00 = (AnonymousClass3CS) A0P.A7M.get();
        this.A05 = A0P.Azp();
    }
}
