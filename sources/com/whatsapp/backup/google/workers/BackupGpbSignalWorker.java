package com.whatsapp.backup.google.workers;

import X.AnonymousClass1BE;
import X.AnonymousClass6FS;
import X.C005502l;
import X.C18800tq;
import X.C19420v0;
import X.C19730wQ;
import X.C20810yC;
import X.C24461Cn;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class BackupGpbSignalWorker extends CoroutineWorker {
    public final C19730wQ A00;
    public final C24461Cn A01;
    public final AnonymousClass6FS A02;
    public final C19420v0 A03;
    public final C20810yC A04;
    public final C005502l A05 = AnonymousClass1BE.A00();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackupGpbSignalWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A04 = A0P.Azp();
        this.A00 = C36351kA.A0N(A0P);
        this.A02 = (AnonymousClass6FS) A0P.A3g.get();
        this.A03 = C36351kA.A0Y(A0P);
        this.A01 = (C24461Cn) A0P.A0c.get();
    }
}
