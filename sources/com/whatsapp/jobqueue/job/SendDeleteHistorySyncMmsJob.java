package com.whatsapp.jobqueue.job;

import X.AnonymousClass1BS;
import X.AnonymousClass1BV;
import X.AnonymousClass1GH;
import X.AnonymousClass685;
import X.AnonymousClass7i8;
import X.C139336jc;
import X.C18800tq;
import X.C25471Gl;
import X.C90464aC;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public class SendDeleteHistorySyncMmsJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1BV A00;
    public transient AnonymousClass1GH A01;
    public transient AnonymousClass1BS A02;
    public final String chunkId;
    public final String directPath;
    public final String mediaEncHash;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendDeleteHistorySyncMmsJob(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            X.673 r1 = new X.673
            r1.<init>()
            r0 = 1
            r1.A01 = r0
            org.whispersystems.jobqueue.requirements.NetworkRequirement r0 = new org.whispersystems.jobqueue.requirements.NetworkRequirement
            r0.<init>()
            r1.A02(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r2.<init>(r0)
            r2.chunkId = r3
            r2.directPath = r4
            r2.mediaEncHash = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void A0B() {
        AnonymousClass685 r1 = new AnonymousClass685();
        r1.A01 = this.A01;
        r1.A08 = this.mediaEncHash;
        C25471Gl r0 = C25471Gl.A0p;
        r1.A07 = "md-msg-hist";
        r1.A0A = false;
        AnonymousClass1BS.A00(this.A02, "md-msg-hist", (String) null, (String) null, 0, false).A00(new C139336jc(this, r1.A01(), 0));
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A02 = (AnonymousClass1BS) A0I.A7Q.get();
        this.A01 = (AnonymousClass1GH) A0I.A8g.get();
        this.A00 = A0I.AzY();
    }
}
