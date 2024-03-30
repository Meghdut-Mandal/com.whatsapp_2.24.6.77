package com.whatsapp.jobqueue.job;

import X.AnonymousClass19J;
import X.AnonymousClass7i8;
import X.C18800tq;
import X.C19420v0;
import X.C20430xY;
import X.C231417i;
import X.C36351kA;
import X.C36371kC;
import X.C36421kH;
import X.C90514aH;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public class SyncDeviceForAdvValidationJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass19J A00;
    public transient C20430xY A01;
    public transient C19420v0 A02;
    public transient C231417i A03;
    public final String[] jids;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDeviceForAdvValidationJob(com.whatsapp.jid.UserJid[] r3) {
        /*
            r2 = this;
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = "SyncDeviceForAdvValidationJob"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r2.<init>(r0)
            java.util.List r0 = java.util.Arrays.asList(r3)
            java.lang.String[] r0 = X.AnonymousClass143.A0O(r0)
            r2.jids = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob.<init>(com.whatsapp.jid.UserJid[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r6.A00.A02() != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r6 = this;
            java.lang.String[] r0 = r6.jids
            java.util.ArrayList r5 = X.AnonymousClass143.A08(r0)
            X.19J r0 = r6.A00
            int r2 = r0.A04
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x000f
            r0 = 1
        L_0x000f:
            r3 = 0
            if (r0 == 0) goto L_0x001b
            X.19J r0 = r6.A00
            boolean r0 = r0.A02()
            r4 = 1
            if (r0 == 0) goto L_0x0023
        L_0x001b:
            r4 = 0
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            return
        L_0x0023:
            X.0v0 r0 = r6.A02
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.util.HashSet r0 = X.C36441kJ.A16()
            java.lang.String r2 = "adv_validating_users_to_sync"
            java.util.Set r1 = r1.getStringSet(r2, r0)
            X.C18740tg.A06(r1)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.ArrayList r0 = X.AnonymousClass143.A08(r0)
            java.util.HashSet r3 = X.C90524aI.A0k(r0)
            boolean r0 = r3.addAll(r5)
            if (r0 == 0) goto L_0x0061
            java.lang.String[] r0 = X.AnonymousClass143.A0O(r3)
            java.util.HashSet r1 = X.C36421kH.A0g(r0)
            X.0v0 r0 = r6.A02
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r2, r1)
            r0.apply()
        L_0x0061:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0022
            if (r4 == 0) goto L_0x0022
            X.0xY r1 = r6.A01     // Catch:{ Exception -> 0x0087 }
            X.5Tu r0 = X.C108515Tu.A05     // Catch:{ Exception -> 0x0087 }
            X.5Lg r0 = r1.A04(r0, r3)     // Catch:{ Exception -> 0x0087 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0087 }
            X.6Pu r0 = (X.C131626Pu) r0     // Catch:{ Exception -> 0x0087 }
            boolean r0 = r0.A00()     // Catch:{ Exception -> 0x0087 }
            if (r0 == 0) goto L_0x0091
            X.0v0 r0 = r6.A02     // Catch:{ Exception -> 0x0087 }
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r0)     // Catch:{ Exception -> 0x0087 }
            X.C36341k9.A0u(r0, r2)     // Catch:{ Exception -> 0x0087 }
            goto L_0x0091
        L_0x0087:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DeviceSyncManager/syncDeviceForAdvValidation/error ex="
            X.C36321k7.A1J(r2, r0, r1)
        L_0x0091:
            X.0v0 r1 = r6.A02
            X.17i r0 = r6.A03
            X.0wo r0 = r0.A01
            long r2 = r0.A06()
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r1)
            java.lang.String r0 = "adv_last_device_job_ts"
            X.C36341k9.A0w(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob.A0B():void");
    }

    public void Bqf(Context context) {
        C18800tq A0P = C36371kC.A0P(context);
        this.A00 = C90514aH.A0Z(A0P);
        this.A03 = (C231417i) A0P.A8k.get();
        this.A01 = C36421kH.A0K(A0P);
        this.A02 = C36351kA.A0Y(A0P);
    }
}
