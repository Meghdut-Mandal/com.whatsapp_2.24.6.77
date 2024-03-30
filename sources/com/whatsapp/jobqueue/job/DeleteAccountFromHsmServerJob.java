package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass1WC;
import X.AnonymousClass7i8;
import X.C101494xn;
import X.C148216yV;
import X.C18800tq;
import X.C19770wU;
import X.C24441Cl;
import X.C24451Cm;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C90464aC;
import android.content.Context;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public final class DeleteAccountFromHsmServerJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C24441Cl A00;
    public transient C19770wU A01;
    public transient Random A02;

    public void A0B() {
        AtomicInteger atomicInteger = new AtomicInteger();
        C19770wU r3 = this.A01;
        C24441Cl r2 = this.A00;
        Random random = this.A02;
        AnonymousClass00C.A0D(random, 1);
        new C101494xn(new C148216yV(this, atomicInteger), r2, new C24451Cm(random, 20, 3600000), r3).A02();
        if (atomicInteger.get() != 0 && atomicInteger.get() != 404) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("retriable error during delete account from hsm server job");
            C36351kA.A1K(C90464aC.A0k(this), A0u);
            throw new Exception(A0u.toString());
        }
    }

    public void Bqf(Context context) {
        C18800tq A0P = C36371kC.A0P(context);
        this.A02 = AnonymousClass1WC.A00();
        this.A01 = C36341k9.A0Z(A0P);
        this.A00 = (C24441Cl) A0P.A30.get();
    }

    public DeleteAccountFromHsmServerJob(JobParameters jobParameters) {
        super(jobParameters);
    }
}
