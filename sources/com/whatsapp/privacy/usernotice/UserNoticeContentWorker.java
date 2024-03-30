package com.whatsapp.privacy.usernotice;

import X.AnonymousClass13E;
import X.C18800tq;
import X.C20050ww;
import X.C21080yd;
import X.C24691Dk;
import X.C29351Wh;
import X.C29371Wj;
import X.C36371kC;
import X.C36381kD;
import X.C90494aF;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class UserNoticeContentWorker extends Worker {
    public final C20050ww A00;
    public final AnonymousClass13E A01;
    public final C29351Wh A02;
    public final C24691Dk A03;
    public final C29371Wj A04;
    public final C21080yd A05;

    public UserNoticeContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A00 = C36381kD.A0U(A0P);
        this.A04 = (C29371Wj) A0P.A8p.get();
        this.A05 = (C21080yd) A0P.A7U.get();
        this.A01 = C90494aF.A0L(A0P);
        this.A02 = (C29351Wh) A0P.A8n.get();
        this.A03 = (C24691Dk) A0P.A8o.get();
    }
}
