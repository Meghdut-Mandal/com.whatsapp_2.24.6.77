package com.whatsapp.privacy.usernotice;

import X.AnonymousClass13E;
import X.C18800tq;
import X.C20050ww;
import X.C21080yd;
import X.C29351Wh;
import X.C29371Wj;
import X.C36381kD;
import X.C90464aC;
import X.C90494aF;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class UserNoticeIconWorker extends Worker {
    public final C20050ww A00;
    public final AnonymousClass13E A01;
    public final C29351Wh A02;
    public final C29371Wj A03;
    public final C21080yd A04;

    public UserNoticeIconWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18800tq A0I = C90464aC.A0I(context);
        this.A00 = C36381kD.A0U(A0I);
        this.A03 = (C29371Wj) A0I.A8p.get();
        this.A04 = (C21080yd) A0I.A7U.get();
        this.A01 = C90494aF.A0L(A0I);
        this.A02 = (C29351Wh) A0I.A8n.get();
    }
}
