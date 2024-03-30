package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass143;
import X.AnonymousClass7i8;
import X.C108515Tu;
import X.C18740tg;
import X.C18800tq;
import X.C19970wo;
import X.C20430xY;
import X.C27311Ns;
import X.C36321k7;
import X.C36371kC;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

public class SyncDevicesJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C27311Ns A00;
    public transient C20430xY A01;
    public final String[] jids;
    public final int syncType;

    public void A0B() {
        C108515Tu r0;
        try {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SyncDevicesJob/onRun/start sync device. param=");
            C36321k7.A1a(A0u, A00(this));
            C20430xY r2 = this.A01;
            ArrayList A08 = AnonymousClass143.A08(this.jids);
            C18740tg.A09("jid list is empty", A08);
            switch (this.syncType) {
                case 1:
                    r0 = C108515Tu.A0F;
                    break;
                case 2:
                    r0 = C108515Tu.A0H;
                    break;
                case 3:
                    r0 = C108515Tu.A05;
                    break;
                case 4:
                    r0 = C108515Tu.A0L;
                    break;
                case 5:
                    r0 = C108515Tu.A0E;
                    break;
                case 6:
                    r0 = C108515Tu.A0D;
                    break;
                default:
                    r0 = C108515Tu.A0B;
                    break;
            }
            r2.A04(r0, A08).get();
            this.A00.A00(this.jids);
        } catch (Exception e) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("SyncDevicesJob/onRun/error, param=");
            C36321k7.A1Z(A0u2, A00(this));
            throw e;
        } catch (Throwable th) {
            if (0 == 0) {
                this.A00.A00(this.jids);
            }
            throw th;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDevicesJob(com.whatsapp.jid.UserJid[] r5, int r6) {
        /*
            r4 = this;
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = "SyncDevicesJob"
            r1.A00 = r0
            X.AnonymousClass673.A00(r1)
            com.whatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement r0 = new com.whatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement
            r0.<init>()
            r1.A02(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r4.<init>(r0)
            X.C18740tg.A0H(r5)
            int r3 = r5.length
            r2 = 0
        L_0x0020:
            if (r2 >= r3) goto L_0x002c
            r1 = r5[r2]
            java.lang.String r0 = "an element of jids was empty."
            X.C18740tg.A07(r1, r0)
            int r2 = r2 + 1
            goto L_0x0020
        L_0x002c:
            java.util.List r0 = java.util.Arrays.asList(r5)
            java.lang.String[] r0 = X.AnonymousClass143.A0O(r0)
            r4.jids = r0
            r4.syncType = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDevicesJob.<init>(com.whatsapp.jid.UserJid[], int):void");
    }

    public static String A00(SyncDevicesJob syncDevicesJob) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; jids=");
        return AnonymousClass000.A0q(AnonymousClass143.A05(syncDevicesJob.jids), A0u);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw new InvalidObjectException("jids must not be empty");
        }
        int i = 0;
        while (C36431kI.A0l(strArr[i]) != null) {
            i++;
            if (i >= length) {
                return;
            }
        }
        throw new InvalidObjectException("an jid is not a UserJid");
    }

    public void Bqf(Context context) {
        int length;
        C18800tq A0P = C36371kC.A0P(context);
        this.A01 = C36421kH.A0K(A0P);
        this.A00 = (C27311Ns) A0P.A2l.get();
        String[] strArr = this.jids;
        if (strArr != null && (length = strArr.length) > 0) {
            HashSet A16 = C36441kJ.A16();
            int i = 0;
            do {
                UserJid A0l = C36431kI.A0l(strArr[i]);
                if (A0l != null) {
                    A16.add(A0l);
                }
                i++;
            } while (i < length);
            C27311Ns r7 = this.A00;
            Set set = r7.A03;
            synchronized (set) {
                set.addAll(A16);
                long A002 = C19970wo.A00(r7.A00);
                Iterator it = A16.iterator();
                while (it.hasNext()) {
                    r7.A01.put(C36441kJ.A0o(it), Long.valueOf(A002));
                }
            }
        }
    }
}
