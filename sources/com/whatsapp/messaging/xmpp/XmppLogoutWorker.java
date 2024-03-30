package com.whatsapp.messaging.xmpp;

import X.AnonymousClass19O;
import X.AnonymousClass19Q;
import X.AnonymousClass64I;
import X.C005502l;
import X.C18800tq;
import X.C20810yC;
import X.C36321k7;
import X.C36371kC;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class XmppLogoutWorker extends CoroutineWorker {
    public final C20810yC A00;
    public final AnonymousClass64I A01;
    public final AnonymousClass19O A02;
    public final C005502l A03 = AnonymousClass19Q.A00();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppLogoutWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A02 = (AnonymousClass19O) A0P.A9f.get();
        this.A00 = A0P.Azp();
        this.A01 = (AnonymousClass64I) A0P.A9n.get();
    }
}
