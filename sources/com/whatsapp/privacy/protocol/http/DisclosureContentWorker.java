package com.whatsapp.privacy.protocol.http;

import X.AnonymousClass00C;
import X.AnonymousClass13E;
import X.AnonymousClass1Z5;
import X.AnonymousClass1ZE;
import X.C111285c2;
import X.C128076At;
import X.C18800tq;
import X.C19550w8;
import X.C20050ww;
import X.C21080yd;
import X.C36321k7;
import X.C36371kC;
import X.C36381kD;
import X.C90494aF;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class DisclosureContentWorker extends Worker {
    public final C20050ww A00;
    public final AnonymousClass13E A01;
    public final AnonymousClass1ZE A02;
    public final C21080yd A03;
    public final AnonymousClass1Z5 A04;

    public static final void A00(DisclosureContentWorker disclosureContentWorker, int[] iArr, int i) {
        for (int A012 : iArr) {
            disclosureContentWorker.A04.A01(A012, Integer.valueOf(i));
        }
    }

    public C128076At A08() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || i < 23) {
            super.A08();
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        Context context = this.A00;
        AnonymousClass00C.A08(context);
        Notification A002 = C111285c2.A00(context);
        if (A002 != null) {
            return new C128076At(59, A002, C19550w8.A06() ? 1 : 0);
        }
        super.A08();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisclosureContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A00 = C36381kD.A0U(A0P);
        this.A01 = C90494aF.A0L(A0P);
        this.A03 = (C21080yd) A0P.A7U.get();
        this.A04 = (AnonymousClass1Z5) A0P.A6i.get();
        this.A02 = (AnonymousClass1ZE) A0P.A2q.get();
    }
}
