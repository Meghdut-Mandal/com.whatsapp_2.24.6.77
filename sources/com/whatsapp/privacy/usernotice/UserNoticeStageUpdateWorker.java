package com.whatsapp.privacy.usernotice;

import X.AnonymousClass19A;
import X.C128916Ec;
import X.C18800tq;
import X.C29341Wg;
import X.C29371Wj;
import X.C36361kB;
import X.C36371kC;
import android.content.Context;
import androidx.work.WorkerParameters;

public class UserNoticeStageUpdateWorker extends C128916Ec {
    public final AnonymousClass19A A00;
    public final C29371Wj A01;
    public final C29341Wg A02;

    public UserNoticeStageUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A00 = C36361kB.A0c(A0P);
        this.A01 = (C29371Wj) A0P.A8p.get();
        this.A02 = (C29341Wg) A0P.A8q.get();
    }
}
