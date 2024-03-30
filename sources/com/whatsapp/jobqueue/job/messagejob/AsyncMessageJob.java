package com.whatsapp.jobqueue.job.messagejob;

import X.AnonymousClass12P;
import X.AnonymousClass1A1;
import X.AnonymousClass1M0;
import X.AnonymousClass3T1;
import X.AnonymousClass7i8;
import X.C1495671s;
import X.C18800tq;
import X.C36351kA;
import X.C36371kC;
import X.C36421kH;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public abstract class AsyncMessageJob extends Job implements AnonymousClass7i8 {
    public transient AnonymousClass12P A00;
    public transient AnonymousClass1A1 A01;
    public final long rowId;
    public final long sortId;

    public abstract Object A0E(AnonymousClass3T1 r1);

    public abstract String A0F();

    public abstract void A0G(AnonymousClass3T1 r1, Object obj);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AsyncMessageJob(long r3, long r5) {
        /*
            r2 = this;
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = "async-message"
            r1.A00 = r0
            r0 = 1
            r1.A01 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r2.<init>(r0)
            r2.rowId = r3
            r2.sortId = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob.<init>(long, long):void");
    }

    public final void A0B() {
        C1495671s B1k;
        AnonymousClass1M0 A05 = this.A00.A05();
        try {
            B1k = A05.B1k();
            AnonymousClass3T1 A0R = C36421kH.A0R(this.A01, this.rowId);
            B1k.A00();
            B1k.close();
            A05.close();
            if (A0R != null) {
                Object A0E = A0E(A0R);
                A05 = this.A00.A05();
                B1k = A05.B1k();
                AnonymousClass3T1 A0R2 = C36421kH.A0R(this.A01, this.rowId);
                if (A0R2 != null && !A0R2.A1P) {
                    A0G(A0R2, A0E);
                }
                B1k.A00();
                B1k.close();
                A05.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void Bqf(Context context) {
        C18800tq A0P = C36371kC.A0P(context);
        this.A01 = C36351kA.A0n(A0P);
        this.A00 = (AnonymousClass12P) A0P.A5G.get();
    }
}
