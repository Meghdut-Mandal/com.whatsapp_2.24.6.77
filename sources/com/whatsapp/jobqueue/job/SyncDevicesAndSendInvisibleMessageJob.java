package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass5J0;
import X.AnonymousClass6SZ;
import X.AnonymousClass7i8;
import X.C108515Tu;
import X.C131626Pu;
import X.C18740tg;
import X.C18800tq;
import X.C19970wo;
import X.C20310xM;
import X.C20430xY;
import X.C27311Ns;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C64933Qa;
import X.C90464aC;
import android.content.Context;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

public class SyncDevicesAndSendInvisibleMessageJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C27311Ns A00;
    public transient C19970wo A01;
    public transient C20310xM A02;
    public transient C64933Qa A03;
    public transient C20430xY A04;
    public transient Set A05 = C36441kJ.A16();
    public final String messageId;
    public final String rawGroupJid;
    public final String[] rawUserJids;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDevicesAndSendInvisibleMessageJob(X.AnonymousClass5J0 r6, com.whatsapp.jid.UserJid[] r7) {
        /*
            r5 = this;
            X.673 r1 = new X.673
            r1.<init>()
            X.AnonymousClass673.A00(r1)
            com.whatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement r0 = new com.whatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement
            r0.<init>()
            r1.A02(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r5.<init>(r0)
            X.C18740tg.A0H(r7)
            X.3Qa r3 = r6.A1J
            X.11F r2 = r3.A00
            boolean r1 = r2 instanceof com.whatsapp.jid.GroupJid
            java.lang.String r0 = "Invalid message"
            X.C18740tg.A0E(r1, r0)
            r5.A03 = r3
            X.C18740tg.A06(r2)
            java.lang.String r0 = r2.getRawString()
            r5.rawGroupJid = r0
            java.lang.String r0 = r3.A01
            r5.messageId = r0
            java.util.HashSet r0 = X.C36441kJ.A16()
            r5.A05 = r0
            int r4 = r7.length
            r3 = 0
        L_0x003c:
            if (r3 >= r4) goto L_0x004d
            r2 = r7[r3]
            java.util.Set r1 = r5.A05
            java.lang.String r0 = "invalid jid"
            X.C18740tg.A07(r2, r0)
            r1.add(r2)
            int r3 = r3 + 1
            goto L_0x003c
        L_0x004d:
            java.util.List r0 = java.util.Arrays.asList(r7)
            java.lang.String[] r0 = X.AnonymousClass143.A0O(r0)
            r5.rawUserJids = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob.<init>(X.5J0, com.whatsapp.jid.UserJid[]):void");
    }

    public static String A00(SyncDevicesAndSendInvisibleMessageJob syncDevicesAndSendInvisibleMessageJob) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; key=");
        A0u.append(syncDevicesAndSendInvisibleMessageJob.A03);
        A0u.append("; rawJids=");
        return AnonymousClass000.A0o(syncDevicesAndSendInvisibleMessageJob.A05, A0u);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.rawUserJids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw new InvalidObjectException("rawJids must not be empty");
        }
        this.A05 = C36441kJ.A16();
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            UserJid A0l = C36431kI.A0l(str);
            if (A0l != null) {
                this.A05.add(A0l);
                i++;
            } else {
                throw new InvalidObjectException(C36321k7.A0D("invalid jid:", str));
            }
        }
        GroupJid A022 = GroupJid.Companion.A02(this.rawGroupJid);
        if (A022 != null) {
            this.A03 = new C64933Qa(A022, this.messageId, true);
        } else {
            throw C90464aC.A0N(this.rawGroupJid, AnonymousClass000.A0v("invalid jid:"));
        }
    }

    public void A0B() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SyncDevicesAndSendInvisibleMessageJob/onRun/param=");
        C36321k7.A1a(A0u, A00(this));
        try {
            C20430xY r2 = this.A04;
            Set set = this.A05;
            C18740tg.A09("jid list is empty", set);
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("SyncDevicesAndSendInvisibleMessageJob/onRun/sync is success=");
            C36331k8.A1S(A0u2, ((C131626Pu) r2.A04(C108515Tu.A0F, set).get()).A00());
            String str = this.rawGroupJid;
            AnonymousClass6SZ r0 = GroupJid.Companion;
            this.A02.A0h(new AnonymousClass5J0(new C64933Qa(AnonymousClass6SZ.A01(str), this.messageId, true), C19970wo.A00(this.A01)));
        } catch (Exception e) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("SyncDevicesAndSendInvisibleMessageJob/onRun/error, param=");
            C36321k7.A1Z(A0u3, A00(this));
            throw e;
        }
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A01 = A0I.Bvc();
        this.A02 = C36371kC.A0Z(A0I);
        this.A04 = C36421kH.A0K(A0I);
        C27311Ns r1 = (C27311Ns) A0I.A2l.get();
        this.A00 = r1;
        r1.A01(this.A03);
    }
}
