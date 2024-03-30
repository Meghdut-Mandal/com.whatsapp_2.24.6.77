package com.whatsapp.privacy.protocol.xmpp;

import X.AnonymousClass19A;
import X.AnonymousClass1Z6;
import X.AnonymousClass1ZE;
import X.C111285c2;
import X.C128076At;
import X.C128916Ec;
import X.C17880sD;
import X.C18800tq;
import X.C19550w8;
import X.C19970wo;
import X.C36361kB;
import X.C36371kC;
import X.C99424tL;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;

public class DisclosureMetadataGetWorker extends C128916Ec {
    public final C19970wo A00;
    public final AnonymousClass19A A01;
    public final AnonymousClass1ZE A02;
    public final Context A03;

    public static void A00(DisclosureMetadataGetWorker disclosureMetadataGetWorker, int i) {
        AnonymousClass1Z6 A002 = disclosureMetadataGetWorker.A02.A00(2);
        if (A002 != null) {
            A002.BVo(new int[]{i}, 430);
        }
    }

    public C17880sD A05() {
        Notification A002;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || i < 23 || (A002 = C111285c2.A00(this.A03)) == null) {
            return super.A05();
        }
        C99424tL r3 = new C99424tL();
        r3.A04(new C128076At(59, A002, C19550w8.A06() ? 1 : 0));
        return r3;
    }

    public DisclosureMetadataGetWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A03 = context;
        C18800tq A0P = C36371kC.A0P(context);
        this.A00 = A0P.Bvc();
        this.A01 = C36361kB.A0c(A0P);
        this.A02 = (AnonymousClass1ZE) A0P.A2q.get();
    }
}
