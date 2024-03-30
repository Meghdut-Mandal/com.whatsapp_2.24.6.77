package com.whatsapp.workmanager;

import X.AnonymousClass00C;
import X.AnonymousClass7i6;
import X.C128916Ec;
import X.C17880sD;
import X.C19970wo;
import X.C36321k7;
import androidx.work.WorkerParameters;

public final class ObservableWorkerFactory$LogExceptionsWorker extends C128916Ec {
    public final C128916Ec A00;
    public final AnonymousClass7i6 A01;
    public final C19970wo A02;

    public C17880sD A05() {
        C17880sD A05 = this.A00.A05();
        AnonymousClass00C.A08(A05);
        return A05;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObservableWorkerFactory$LogExceptionsWorker(C128916Ec r2, AnonymousClass7i6 r3, C19970wo r4, WorkerParameters workerParameters) {
        super(r2.A00, workerParameters);
        C36321k7.A18(r2, r3, r4, workerParameters);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
