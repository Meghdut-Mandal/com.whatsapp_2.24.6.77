package com.whatsapp.ml.ptt.worker;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass13E;
import X.AnonymousClass17Y;
import X.AnonymousClass616;
import X.AnonymousClass617;
import X.AnonymousClass6X2;
import X.AnonymousClass7VG;
import X.C07700Yy;
import X.C10810fG;
import X.C109385Xj;
import X.C128076At;
import X.C1503274v;
import X.C152837Ma;
import X.C18800tq;
import X.C18830tt;
import X.C19970wo;
import X.C20050ww;
import X.C21080yd;
import X.C25271Fq;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C90474aD;
import X.C90494aF;
import X.C97334ow;
import X.C97344ox;
import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class PttMLModelDownloadWorker extends Worker {
    public final Context A00;
    public final AnonymousClass17Y A01;
    public final C20050ww A02;
    public final C25271Fq A03;
    public final AnonymousClass13E A04;
    public final AnonymousClass616 A05;
    public final AnonymousClass617 A06;
    public final C21080yd A07;
    public final AnonymousClass00T A08 = C36431kI.A1I(new C152837Ma(this));
    public final C18800tq A09;
    public final C19970wo A0A;

    public C109385Xj A09() {
        String str;
        AnonymousClass6X2 r2 = this.A01.A01;
        String A0c = C90474aD.A0c("ML_MODEL_WORKER_MODEL_NAME", r2.A00);
        int A022 = r2.A02("ML_MODEL_WORKER_MODEL_VERSION", -1);
        if (A0c == null || A022 == -1) {
            return C97334ow.A00();
        }
        AnonymousClass00T r5 = this.A08;
        A04(new C128076At(80, ((C07700Yy) r5.getValue()).A05(), C36371kC.A1T(Build.VERSION.SDK_INT, 29) ? 1 : 0));
        C10810fG r22 = new C10810fG();
        r22.element = C97334ow.A00();
        this.A05.A00(A0c, new AnonymousClass7VG(this, A0c, r22, A022), A022);
        C109385Xj r4 = (C109385Xj) r22.element;
        if (r4 instanceof C97344ox) {
            str = "Download complete";
        } else {
            str = "Download failed";
        }
        this.A01.A0H(new C1503274v(4, str, this));
        C07700Yy r1 = (C07700Yy) r5.getValue();
        r1.A0E(str);
        r1.A07(0, 0, false);
        r1.A0J(false);
        this.A03.A02(80, ((C07700Yy) r5.getValue()).A05());
        return r4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PttMLModelDownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        Context applicationContext = context.getApplicationContext();
        AnonymousClass00C.A08(applicationContext);
        C18800tq A0P = C36371kC.A0P(applicationContext);
        this.A09 = A0P;
        C18830tt r1 = A0P.AfI.A00;
        this.A05 = C18830tt.A7G(r1);
        this.A04 = C90494aF.A0L(A0P);
        this.A07 = (C21080yd) A0P.A7U.get();
        this.A02 = C36381kD.A0U(A0P);
        this.A06 = (AnonymousClass617) r1.A3U.get();
        Context applicationContext2 = context.getApplicationContext();
        AnonymousClass00C.A08(applicationContext2);
        this.A00 = applicationContext2;
        this.A0A = A0P.Bvc();
        this.A01 = C36351kA.A0M(A0P);
        this.A03 = C36391kE.A0d(A0P);
    }
}
