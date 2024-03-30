package com.whatsapp.migration.export.encryption;

import X.AnonymousClass6F7;
import X.C18800tq;
import X.C19700wN;
import X.C90464aC;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class ExportEncryptionManager$KeyPrefetchWorker extends Worker {
    public final C19700wN A00;
    public final AnonymousClass6F7 A01;

    public ExportEncryptionManager$KeyPrefetchWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18800tq A0I = C90464aC.A0I(context);
        this.A00 = A0I.B3m();
        this.A01 = (AnonymousClass6F7) A0I.A38.get();
    }
}
