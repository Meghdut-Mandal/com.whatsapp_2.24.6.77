package com.whatsapp.networkresources;

import X.AnonymousClass60c;
import X.AnonymousClass7hA;
import X.C90464aC;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class NetworkResourceDownloadWorker extends Worker implements AnonymousClass7hA {
    public final AnonymousClass60c A00;

    public NetworkResourceDownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = (AnonymousClass60c) C90464aC.A0I(context).AfI.A00.A1d.get();
    }

    public boolean BLb() {
        return this.A03;
    }
}
