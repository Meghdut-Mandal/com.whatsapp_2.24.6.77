package com.whatsapp.privacy.protocol.xmpp;

import X.AnonymousClass19A;
import X.C128916Ec;
import X.C18800tq;
import X.C24701Dl;
import X.C36361kB;
import X.C36371kC;
import android.content.Context;
import androidx.work.WorkerParameters;

public class DisclosureResultSendWorker extends C128916Ec {
    public final AnonymousClass19A A00;
    public final C24701Dl A01;

    public DisclosureResultSendWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A00 = C36361kB.A0c(A0P);
        this.A01 = (C24701Dl) A0P.A6j.get();
    }
}
