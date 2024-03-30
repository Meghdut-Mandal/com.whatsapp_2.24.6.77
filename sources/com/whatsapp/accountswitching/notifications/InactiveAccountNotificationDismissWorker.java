package com.whatsapp.accountswitching.notifications;

import X.AnonymousClass00C;
import X.AnonymousClass6V1;
import X.C131306On;
import X.C18800tq;
import X.C18830tt;
import X.C19970wo;
import X.C21060yb;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class InactiveAccountNotificationDismissWorker extends Worker {
    public final C131306On A00;
    public final AnonymousClass6V1 A01;
    public final C21060yb A02;
    public final C18800tq A03;
    public final C19970wo A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InactiveAccountNotificationDismissWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        Context applicationContext = context.getApplicationContext();
        AnonymousClass00C.A08(applicationContext);
        C18800tq A0P = C36371kC.A0P(applicationContext);
        this.A03 = A0P;
        this.A04 = A0P.Bvc();
        this.A02 = C36351kA.A0U(A0P);
        C18830tt r1 = A0P.AfI.A00;
        this.A00 = (C131306On) r1.A2B.get();
        this.A01 = (AnonymousClass6V1) r1.A29.get();
    }
}
