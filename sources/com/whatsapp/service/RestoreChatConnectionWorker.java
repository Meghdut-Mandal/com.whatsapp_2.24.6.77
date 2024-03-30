package com.whatsapp.service;

import X.AnonymousClass17Y;
import X.AnonymousClass19J;
import X.C128916Ec;
import X.C18800tq;
import X.C19600wD;
import X.C20720y3;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C90514aH;
import X.C97484pl;
import android.content.Context;
import android.os.Handler;
import androidx.work.WorkerParameters;

public class RestoreChatConnectionWorker extends C128916Ec {
    public final Handler A00 = C36341k9.A0H();
    public final C97484pl A01 = new C97484pl();
    public final AnonymousClass17Y A02;
    public final AnonymousClass19J A03;
    public final C19600wD A04;
    public final C20720y3 A05;

    public RestoreChatConnectionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A02 = C36351kA.A0M(A0P);
        this.A05 = (C20720y3) A0P.A6u.get();
        this.A03 = C90514aH.A0Z(A0P);
        this.A04 = C36391kE.A0c(A0P);
    }
}
