package com.whatsapp.media.download;

import X.AnonymousClass66Q;
import X.C36371kC;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class ExpressPathGarbageCollectWorker extends Worker {
    public final AnonymousClass66Q A00;

    public ExpressPathGarbageCollectWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = C36371kC.A0P(context).Aza();
    }
}
