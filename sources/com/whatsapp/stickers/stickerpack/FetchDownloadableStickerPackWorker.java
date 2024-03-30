package com.whatsapp.stickers.stickerpack;

import X.C109385Xj;
import X.C24181Bk;
import X.C36321k7;
import X.C36371kC;
import X.C97344ox;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class FetchDownloadableStickerPackWorker extends Worker {
    public final C24181Bk A00;

    public C109385Xj A09() {
        this.A00.A00();
        return new C97344ox();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchDownloadableStickerPackWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        this.A00 = C36371kC.A0P(context).Azf();
    }
}
