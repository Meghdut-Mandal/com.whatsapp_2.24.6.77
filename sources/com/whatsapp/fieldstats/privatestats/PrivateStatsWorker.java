package com.whatsapp.fieldstats.privatestats;

import X.AnonymousClass6X1;
import X.C36371kC;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class PrivateStatsWorker extends Worker {
    public final AnonymousClass6X1 A00;

    public PrivateStatsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = (AnonymousClass6X1) C36371kC.A0P(context).AfI.A00.A3M.get();
    }
}
