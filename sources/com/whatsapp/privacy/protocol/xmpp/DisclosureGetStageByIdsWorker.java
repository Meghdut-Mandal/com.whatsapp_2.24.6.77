package com.whatsapp.privacy.protocol.xmpp;

import X.AnonymousClass19A;
import X.AnonymousClass1ZE;
import X.C128916Ec;
import X.C18800tq;
import X.C19970wo;
import X.C36361kB;
import X.C36371kC;
import android.content.Context;
import androidx.work.WorkerParameters;

public class DisclosureGetStageByIdsWorker extends C128916Ec {
    public final C19970wo A00;
    public final AnonymousClass19A A01;
    public final AnonymousClass1ZE A02;

    public DisclosureGetStageByIdsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A00 = A0P.Bvc();
        this.A01 = C36361kB.A0c(A0P);
        this.A02 = (AnonymousClass1ZE) A0P.A2q.get();
    }
}
