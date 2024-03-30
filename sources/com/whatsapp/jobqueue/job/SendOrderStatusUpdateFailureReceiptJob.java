package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass19A;
import X.AnonymousClass7i8;
import X.AnonymousClass9YT;
import X.C207209uj;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36421kH;
import X.C90484aE;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import org.whispersystems.jobqueue.Job;

public final class SendOrderStatusUpdateFailureReceiptJob extends Job implements AnonymousClass7i8 {
    public transient AnonymousClass19A A00;
    public final String jid;
    public final String messageKeyId;

    public void A09() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendOrderStatusUpdateFailureReceiptJob(X.AnonymousClass11F r4, java.lang.String r5) {
        /*
            r3 = this;
            X.673 r2 = new X.673
            r2.<init>()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "order-status-update-failure-"
            java.lang.String r0 = X.C165607th.A0r(r4, r0, r1)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r2.A00 = r0
            X.AnonymousClass673.A00(r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A01()
            r3.<init>(r0)
            java.lang.String r0 = r4.getRawString()
            r3.jid = r0
            r3.messageKeyId = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob.<init>(X.11F, java.lang.String):void");
    }

    public void A0B() {
        AnonymousClass11F A0N = C36421kH.A0N(this.jid);
        AnonymousClass9YT A002 = AnonymousClass9YT.A00(A0N);
        A002.A07 = this.messageKeyId;
        A002.A08 = "error";
        A002.A05 = "receipt";
        C207209uj A01 = A002.A01();
        AnonymousClass19A r4 = this.A00;
        String str = this.messageKeyId;
        Message obtain = Message.obtain((Handler) null, 0, 295, 0, A0N);
        obtain.getData().putString("messageKeyId", str);
        r4.A05(obtain, A01).get();
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0q = C90484aE.A0q("canceled send order-status-update-failure receipt job", A0u);
        A0q.append("; jid=");
        A0q.append(this.jid);
        A0q.append("; id=");
        C36341k9.A1O(A0u, AnonymousClass000.A0q(this.messageKeyId, A0q));
    }

    public boolean A0D(Exception exc) {
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0q = C90484aE.A0q("exception while running send order status update failure receipt job", A0u);
        A0q.append("; jid=");
        A0q.append(this.jid);
        A0q.append("; id=");
        C36351kA.A1P(AnonymousClass000.A0q(this.messageKeyId, A0q), A0u, exc);
        return true;
    }

    public void Bqf(Context context) {
        this.A00 = C36361kB.A0c(C36371kC.A0P(context));
    }
}
