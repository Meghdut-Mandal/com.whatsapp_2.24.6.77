package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass16E;
import X.AnonymousClass19A;
import X.AnonymousClass7i8;
import X.C119655qE;
import X.C130256Ki;
import X.C144576sT;
import X.C165337tG;
import X.C18800tq;
import X.C18830tt;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C21690ze;
import X.C36371kC;
import X.C90464aC;
import X.C99424tL;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public final class GetStatusPrivacyJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass16E A00;
    public transient C144576sT A01;
    public transient C130256Ki A02;

    public void Bqf(Context context) {
        AnonymousClass00C.A0D(context, 0);
        C18800tq A0P = C36371kC.A0P(context);
        this.A00 = (AnonymousClass16E) A0P.A80.get();
        this.A02 = C18830tt.ACg(A0P.AfI.A00);
        this.A01 = (C144576sT) A0P.A8T.get();
    }

    public void A0B() {
        AtomicInteger atomicInteger = new AtomicInteger();
        C130256Ki r6 = this.A02;
        if (r6 != null) {
            C119655qE r5 = new C119655qE(this, atomicInteger);
            C99424tL r0 = new C99424tL();
            AnonymousClass19A r11 = r6.A02;
            String A09 = r11.A09();
            C20810yC r10 = r6.A01;
            if (r10.A0E(3845)) {
                C21690ze r9 = r6.A03;
                int hashCode = A09.hashCode();
                r9.markerStart(154475307, hashCode);
                r9.markerAnnotate(154475307, hashCode, "iq_type", 121);
            }
            if (C20800yB.A01(C21000yV.A01, r10, 3843)) {
                r11.A0D(r6.A00, new C165337tG(r5, r0, r6, 13), C130256Ki.A00(A09), A09, 121, 0, 32000);
            } else {
                r11.A0K(new C165337tG(r5, r0, r6, 13), C130256Ki.A00(A09), A09, 121, 32000);
            }
            r0.get(32000, TimeUnit.MILLISECONDS);
        }
        if (atomicInteger.get() == 500) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("server 500 error during get status privacy job");
            throw new Exception(AnonymousClass000.A0q(C90464aC.A0k(this).toString(), A0u));
        }
    }

    public GetStatusPrivacyJob(JobParameters jobParameters) {
        super(jobParameters);
    }
}
