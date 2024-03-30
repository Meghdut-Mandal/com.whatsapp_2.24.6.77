package X;

import android.content.Context;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.Aue  reason: case insensitive filesystem */
public abstract class C22726Aue extends Job implements AnonymousClass4PA, AnonymousClass7i8 {
    public boolean isCancelled;
    public AnonymousClass4OL newsletterRequestTimeManager;

    public void Bqf(Context context) {
        AnonymousClass00C.A0D(context, 0);
    }

    public void cancel() {
        this.isCancelled = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22726Aue(java.lang.String r3) {
        /*
            r2 = this;
            X.673 r1 = new X.673
            r1.<init>()
            r1.A00 = r3
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r1.A02(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22726Aue.<init>(java.lang.String):void");
    }

    public void A0B() {
    }
}
