package X;

import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5J3  reason: invalid class name */
public class AnonymousClass5J3 extends C196019Xg {
    public final /* synthetic */ AtomicInteger A00;
    public final /* synthetic */ AtomicReference A01;
    public final /* synthetic */ RotateSignedPreKeyJob A02;

    public AnonymousClass5J3(RotateSignedPreKeyJob rotateSignedPreKeyJob, AtomicInteger atomicInteger, AtomicReference atomicReference) {
        this.A02 = rotateSignedPreKeyJob;
        this.A00 = atomicInteger;
        this.A01 = atomicReference;
    }

    public void A02(C203399nx r4) {
        C203399nx A0d = r4.A0d("error");
        this.A00.set(A0d.A0S("code", 0));
        C203399nx A0c = A0d.A0c("identity");
        if (A0c != null) {
            this.A01.set(A0c.A01);
        }
    }

    public void A03(C203399nx r4) {
        RotateSignedPreKeyJob rotateSignedPreKeyJob = this.A02;
        if (rotateSignedPreKeyJob.A00.A0X()) {
            rotateSignedPreKeyJob.A00.A0P(C203239na.A00(rotateSignedPreKeyJob.id));
            return;
        }
        AnonymousClass187 r2 = rotateSignedPreKeyJob.A01;
        r2.A00.submit(new C80253v6(this, 42));
    }
}
