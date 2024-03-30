package com.whatsapp.privacy.protocol.xmpp;

import X.AnonymousClass19A;
import X.C128916Ec;
import X.C36361kB;
import X.C36371kC;
import android.content.Context;
import androidx.work.WorkerParameters;

public class DisclosureResetOnServerWorker extends C128916Ec {
    public final AnonymousClass19A A00;

    public DisclosureResetOnServerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = C36361kB.A0c(C36371kC.A0P(context));
    }
}
