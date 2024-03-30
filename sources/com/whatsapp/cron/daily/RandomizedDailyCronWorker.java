package com.whatsapp.cron.daily;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class RandomizedDailyCronWorker extends Worker {
    public final Context A00;

    public RandomizedDailyCronWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = context;
    }
}
