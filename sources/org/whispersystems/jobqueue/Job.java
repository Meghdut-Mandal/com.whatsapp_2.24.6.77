package org.whispersystems.jobqueue;

import X.AnonymousClass000;
import X.C156757ad;
import X.C156767af;
import X.C156777ag;
import X.C156787aj;
import X.C27311Ns;
import X.C36321k7;
import X.C36341k9;
import X.C64933Qa;
import X.C90464aC;
import X.C90484aE;
import android.os.PowerManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.BulkGetPreKeyJob;
import com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob;
import com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob;
import com.whatsapp.jobqueue.job.GetStatusPrivacyJob;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob;
import com.whatsapp.jobqueue.job.SendDisableLiveLocationJob;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.jobqueue.job.SendStatusPrivacyListJob;
import com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob;
import com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob;
import com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob;
import com.whatsapp.jobqueue.job.SyncDevicesJob;
import com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob;
import com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.Set;
import org.whispersystems.jobqueue.requirements.Requirement;

public abstract class Job implements Serializable {
    public transient int A00;
    public transient long A01;
    public transient PowerManager.WakeLock A02;
    public final JobParameters parameters;

    public abstract void A0B();

    public void A08(long j) {
        if (this instanceof SendStatusPrivacyListJob) {
            SendStatusPrivacyListJob sendStatusPrivacyListJob = (SendStatusPrivacyListJob) this;
            sendStatusPrivacyListJob.A01 = j;
            SendStatusPrivacyListJob.A01 = j;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("set persistent id for send status privacy job");
            C36321k7.A1a(A0u, SendStatusPrivacyListJob.A00(sendStatusPrivacyListJob));
            return;
        }
        this.A01 = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x00fd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09() {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C156757ad
            if (r0 != 0) goto L_0x0015
            boolean r0 = r8 instanceof X.C156767af
            if (r0 != 0) goto L_0x0015
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob
            if (r0 != 0) goto L_0x0015
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "SyncdTableEmptyKeyCheckJob/onadded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0015:
            return
        L_0x0016:
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.SyncDevicesJob
            if (r0 == 0) goto L_0x002e
            r2 = r8
            com.whatsapp.jobqueue.job.SyncDevicesJob r2 = (com.whatsapp.jobqueue.job.SyncDevicesJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SyncDevicesJob/onAdded/sync devices job added param="
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SyncDevicesJob.A00(r2)
            X.C36321k7.A1a(r1, r0)
            return
        L_0x002e:
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob
            if (r0 == 0) goto L_0x0046
            r2 = r8
            com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob r2 = (com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SyncDevicesAndSendInvisibleMessageJob/onAdded/sync devices job added param="
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob.A00(r2)
            X.C36321k7.A1a(r1, r0)
            return
        L_0x0046:
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob
            if (r0 == 0) goto L_0x006a
            r3 = r8
            com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob r3 = (com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob) r3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SyncDeviceForAdvValidationJob/onAdded/sync devices job added param="
            java.lang.StringBuilder r1 = X.C90484aE.A0q(r0, r2)
            java.lang.String r0 = "; jids="
            r1.append(r0)
            java.lang.String[] r0 = r3.jids
            java.lang.String r0 = X.AnonymousClass143.A05(r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.C36321k7.A1a(r2, r0)
            return
        L_0x006a:
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob
            if (r0 == 0) goto L_0x0082
            r2 = r8
            com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob r2 = (com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onAdded/sync devices job added param="
            r1.append(r0)
            java.lang.String r0 = r2.A0E()
            X.C36321k7.A1a(r1, r0)
            return
        L_0x0082:
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            if (r0 != 0) goto L_0x0015
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.SendLiveLocationKeyJob
            if (r0 == 0) goto L_0x00d6
            r3 = r8
            com.whatsapp.jobqueue.job.SendLiveLocationKeyJob r3 = (com.whatsapp.jobqueue.job.SendLiveLocationKeyJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "live location key notification send job added"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.A01(r3)
            X.C36321k7.A1a(r1, r0)
            java.util.HashSet r4 = X.C36441kJ.A16()
            org.whispersystems.jobqueue.JobParameters r0 = r3.parameters
            java.util.List r0 = r0.requirements
            java.util.Iterator r2 = r0.iterator()
        L_0x00a9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0214
            java.lang.Object r1 = r2.next()
            org.whispersystems.jobqueue.requirements.Requirement r1 = (org.whispersystems.jobqueue.requirements.Requirement) r1
            boolean r0 = r1 instanceof com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            if (r0 == 0) goto L_0x00c7
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r1 = (com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement) r1
            boolean r0 = r1.BMk()
            if (r0 != 0) goto L_0x00a9
            com.whatsapp.jid.DeviceJid r0 = r1.A00
        L_0x00c3:
            r4.add(r0)
            goto L_0x00a9
        L_0x00c7:
            boolean r0 = r1 instanceof com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            if (r0 == 0) goto L_0x00a9
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r1 = (com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement) r1
            boolean r0 = r1.BMk()
            if (r0 != 0) goto L_0x00a9
            com.whatsapp.jid.DeviceJid r0 = r1.A00
            goto L_0x00c3
        L_0x00d6:
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob
            if (r0 == 0) goto L_0x0130
            r6 = r8
            com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob r6 = (com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob) r6
            org.whispersystems.jobqueue.JobParameters r0 = r6.parameters
            java.util.List r2 = r0.requirements
            java.lang.String r0 = r6.rawDeviceJid
            com.whatsapp.jid.DeviceJid r7 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "final live location notification send retry job added"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob.A00(r6)
            X.C36321k7.A1a(r1, r0)
            java.util.Iterator r5 = r2.iterator()
            r4 = 0
            r3 = 0
        L_0x00fd:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r2 = r5.next()
            org.whispersystems.jobqueue.requirements.Requirement r2 = (org.whispersystems.jobqueue.requirements.Requirement) r2
            boolean r0 = r2 instanceof com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r1 = 1
            if (r0 == 0) goto L_0x0122
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r2 = (com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement) r2
            boolean r0 = r2.BMk()
        L_0x0114:
            if (r0 != 0) goto L_0x012d
            r3 = 1
        L_0x0117:
            X.1XT r2 = r6.A00
            com.whatsapp.jid.DeviceJid[] r1 = new com.whatsapp.jid.DeviceJid[r1]
            r1[r4] = r7
            r0 = 3
            r2.A04(r1, r0, r4)
            goto L_0x00fd
        L_0x0122:
            boolean r0 = r2 instanceof com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            if (r0 == 0) goto L_0x012d
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r2 = (com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement) r2
            boolean r0 = r2.BMk()
            goto L_0x0114
        L_0x012d:
            if (r3 == 0) goto L_0x00fd
            goto L_0x0117
        L_0x0130:
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob
            if (r0 == 0) goto L_0x016d
            r3 = r8
            com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob r3 = (com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob) r3
            org.whispersystems.jobqueue.JobParameters r0 = r3.parameters
            java.util.List r2 = r0.requirements
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "final live location notification send job added"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob.A01(r3)
            X.C36321k7.A1a(r1, r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x014f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r1 = r2.next()
            org.whispersystems.jobqueue.requirements.Requirement r1 = (org.whispersystems.jobqueue.requirements.Requirement) r1
            boolean r0 = r1 instanceof com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            if (r0 == 0) goto L_0x014f
            com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r1 = (com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement) r1
            boolean r0 = r1.BMk()
            if (r0 != 0) goto L_0x014f
            X.1P5 r0 = r3.A00
            r0.A0e()
            goto L_0x014f
        L_0x016d:
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.SendDisableLiveLocationJob
            if (r0 == 0) goto L_0x0185
            r2 = r8
            com.whatsapp.jobqueue.job.SendDisableLiveLocationJob r2 = (com.whatsapp.jobqueue.job.SendDisableLiveLocationJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "disable live location job added"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SendDisableLiveLocationJob.A00(r2)
            X.C36321k7.A1a(r1, r0)
            return
        L_0x0185:
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob
            if (r0 != 0) goto L_0x0015
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.RotateSignedPreKeyJob
            if (r0 == 0) goto L_0x01a1
            r2 = r8
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob r2 = (com.whatsapp.jobqueue.job.RotateSignedPreKeyJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "rotate signed pre key job added"
            r1.append(r0)
            java.lang.String r0 = r2.A0E()
            X.C36321k7.A1a(r1, r0)
            return
        L_0x01a1:
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.GetVNameCertificateJob
            if (r0 == 0) goto L_0x01f0
            r5 = r8
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r5 = (com.whatsapp.jobqueue.job.GetVNameCertificateJob) r5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GetVNameCertificateJob/onAdded"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.GetVNameCertificateJob.A00(r5)
            X.C36321k7.A1a(r1, r0)
            java.util.concurrent.ConcurrentHashMap r2 = com.whatsapp.jobqueue.job.GetVNameCertificateJob.A02
            java.lang.String r1 = r5.jid
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.put(r1, r0)
            org.whispersystems.jobqueue.JobParameters r0 = r5.parameters
            java.util.List r0 = r0.requirements
            java.util.Iterator r4 = r0.iterator()
        L_0x01c9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r1 = r4.next()
            org.whispersystems.jobqueue.requirements.Requirement r1 = (org.whispersystems.jobqueue.requirements.Requirement) r1
            boolean r0 = r1 instanceof com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            if (r0 == 0) goto L_0x01c9
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r1 = (com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement) r1
            boolean r0 = r1.BMk()
            if (r0 != 0) goto L_0x01c9
            X.1XT r3 = r5.A00
            r0 = 1
            com.whatsapp.jid.DeviceJid[] r2 = new com.whatsapp.jid.DeviceJid[r0]
            com.whatsapp.jid.DeviceJid r0 = r1.A00
            r1 = 0
            r2[r1] = r0
            r0 = 2
            r3.A04(r2, r0, r1)
            goto L_0x01c9
        L_0x01f0:
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.GetStatusPrivacyJob
            if (r0 != 0) goto L_0x0015
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob
            if (r0 != 0) goto L_0x0015
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob
            if (r0 != 0) goto L_0x0015
            boolean r0 = r8 instanceof com.whatsapp.jobqueue.job.BulkGetPreKeyJob
            if (r0 == 0) goto L_0x0015
            r2 = r8
            com.whatsapp.jobqueue.job.BulkGetPreKeyJob r2 = (com.whatsapp.jobqueue.job.BulkGetPreKeyJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "bulk get pre key job added"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.BulkGetPreKeyJob.A00(r2)
            X.C36321k7.A1a(r1, r0)
            return
        L_0x0214:
            X.1XT r3 = r3.A00
            r2 = 0
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r2]
            java.lang.Object[] r1 = r4.toArray(r0)
            com.whatsapp.jid.DeviceJid[] r1 = (com.whatsapp.jid.DeviceJid[]) r1
            r0 = 4
            r3.A04(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.Job.A09():void");
    }

    public void A0A() {
        if (this instanceof C156757ad) {
            Log.w("Fetch2FAEmailStatusJob/canceled");
        } else if (this instanceof C156767af) {
        } else {
            if (this instanceof AsyncMessageJob) {
                AsyncMessageJob asyncMessageJob = (AsyncMessageJob) this;
                StringBuilder A0u = AnonymousClass000.A0u();
                StringBuilder A0q = C90484aE.A0q("asyncMessageJob/canceled async message job", A0u);
                A0q.append("; rowId=");
                A0q.append(asyncMessageJob.rowId);
                A0q.append("; job=");
                C36341k9.A1O(A0u, AnonymousClass000.A0q(asyncMessageJob.A0F(), A0q));
            } else if (this instanceof SyncdTableEmptyKeyCheckJob) {
                Log.i("SyncdTableEmptyKeyCheckJob/onCanceled");
                ((SyncdTableEmptyKeyCheckJob) this).A00.A03(7);
            } else if (this instanceof SyncDevicesJob) {
                SyncDevicesJob syncDevicesJob = (SyncDevicesJob) this;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("SyncDevicesJob/onCanceled/cancel sync devices job param=");
                C36341k9.A1O(A0u2, SyncDevicesJob.A00(syncDevicesJob));
                syncDevicesJob.A00.A00(syncDevicesJob.jids);
            } else if (this instanceof SyncDevicesAndSendInvisibleMessageJob) {
                SyncDevicesAndSendInvisibleMessageJob syncDevicesAndSendInvisibleMessageJob = (SyncDevicesAndSendInvisibleMessageJob) this;
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("SyncDeviceAndResendMessageJob/onCanceled/param=");
                C36341k9.A1O(A0u3, SyncDevicesAndSendInvisibleMessageJob.A00(syncDevicesAndSendInvisibleMessageJob));
                C27311Ns r1 = syncDevicesAndSendInvisibleMessageJob.A00;
                C64933Qa r0 = syncDevicesAndSendInvisibleMessageJob.A03;
                Set set = r1.A02;
                synchronized (set) {
                    set.remove(r0);
                }
            } else if (this instanceof SyncDeviceForAdvValidationJob) {
            } else {
                if (this instanceof SyncDeviceAndResendMessageJob) {
                    SyncDeviceAndResendMessageJob syncDeviceAndResendMessageJob = (SyncDeviceAndResendMessageJob) this;
                    StringBuilder A0u4 = AnonymousClass000.A0u();
                    A0u4.append("SyncDeviceAndResendMessageJob/onCanceled/param=");
                    C36341k9.A1O(A0u4, syncDeviceAndResendMessageJob.A0E());
                    C27311Ns r12 = syncDeviceAndResendMessageJob.A05;
                    C64933Qa r02 = syncDeviceAndResendMessageJob.A0H;
                    Set set2 = r12.A02;
                    synchronized (set2) {
                        set2.remove(r02);
                    }
                } else if (this instanceof SendStatusPrivacyListJob) {
                    StringBuilder A0u5 = AnonymousClass000.A0u();
                    A0u5.append("canceled send status privacy job");
                    C36341k9.A1O(A0u5, SendStatusPrivacyListJob.A00((SendStatusPrivacyListJob) this));
                } else if (this instanceof SendLiveLocationKeyJob) {
                    StringBuilder A0u6 = AnonymousClass000.A0u();
                    A0u6.append("canceled send live location key job");
                    C36341k9.A1O(A0u6, SendLiveLocationKeyJob.A01((SendLiveLocationKeyJob) this));
                } else if (this instanceof SendFinalLiveLocationRetryJob) {
                    StringBuilder A0u7 = AnonymousClass000.A0u();
                    A0u7.append("canceled send final live location retry job");
                    C36341k9.A1O(A0u7, SendFinalLiveLocationRetryJob.A00((SendFinalLiveLocationRetryJob) this));
                } else if (this instanceof SendFinalLiveLocationNotificationJob) {
                    StringBuilder A0u8 = AnonymousClass000.A0u();
                    A0u8.append("canceled send final live location job");
                    C36341k9.A1O(A0u8, SendFinalLiveLocationNotificationJob.A01((SendFinalLiveLocationNotificationJob) this));
                } else if (this instanceof SendDisableLiveLocationJob) {
                    StringBuilder A0u9 = AnonymousClass000.A0u();
                    A0u9.append("canceled disable live location job");
                    C36341k9.A1O(A0u9, SendDisableLiveLocationJob.A00((SendDisableLiveLocationJob) this));
                } else if (this instanceof SendDeleteHistorySyncMmsJob) {
                    StringBuilder A0u10 = AnonymousClass000.A0u();
                    A0u10.append("SendDeleteHistorySyncMmsJob/ cancelled chunkId=");
                    C36341k9.A1O(A0u10, ((SendDeleteHistorySyncMmsJob) this).chunkId);
                } else if (this instanceof RotateSignedPreKeyJob) {
                    StringBuilder A0u11 = AnonymousClass000.A0u();
                    A0u11.append("canceled rotate signed pre key job");
                    C36341k9.A1O(A0u11, ((RotateSignedPreKeyJob) this).A0E());
                } else if (this instanceof GetVNameCertificateJob) {
                    GetVNameCertificateJob getVNameCertificateJob = (GetVNameCertificateJob) this;
                    StringBuilder A0u12 = AnonymousClass000.A0u();
                    A0u12.append("GetVNameCertificateJob/canceled get vname certificate job");
                    C36341k9.A1O(A0u12, GetVNameCertificateJob.A00(getVNameCertificateJob));
                    GetVNameCertificateJob.A02.remove(getVNameCertificateJob.jid);
                } else if (this instanceof GetStatusPrivacyJob) {
                    StringBuilder A0u13 = AnonymousClass000.A0u();
                    A0u13.append("canceled get status privacy job");
                    C36341k9.A1O(A0u13, C90464aC.A0k((GetStatusPrivacyJob) this).toString());
                } else if (this instanceof GeneratePrivacyTokenJob) {
                    GeneratePrivacyTokenJob generatePrivacyTokenJob = (GeneratePrivacyTokenJob) this;
                    UserJid userJid = generatePrivacyTokenJob.A01;
                    if (userJid != null) {
                        generatePrivacyTokenJob.A02.A01(userJid);
                    }
                    StringBuilder A0u14 = AnonymousClass000.A0u();
                    A0u14.append("canceled generate privacy token job");
                    C36341k9.A1O(A0u14, C90464aC.A0k(generatePrivacyTokenJob).toString());
                } else if (this instanceof DeleteAccountFromHsmServerJob) {
                    StringBuilder A0u15 = AnonymousClass000.A0u();
                    A0u15.append("DeleteAccountFromHsmServerJob/canceled delete account from hsm server job");
                    C36341k9.A1O(A0u15, C90464aC.A0k(this).toString());
                } else if (this instanceof BulkGetPreKeyJob) {
                    StringBuilder A0u16 = AnonymousClass000.A0u();
                    A0u16.append("canceled bulk get pre key job");
                    C36341k9.A1O(A0u16, BulkGetPreKeyJob.A00((BulkGetPreKeyJob) this));
                } else if (this instanceof C156777ag) {
                    C156777ag r3 = (C156777ag) this;
                    StringBuilder A0u17 = AnonymousClass000.A0u();
                    A0u17.append("GroupFetchAllMembershipApprovalRequestsJob canceled");
                    StringBuilder A0k = C90464aC.A0k(r3);
                    A0k.append("; groupJid=");
                    C36341k9.A1O(A0u17, AnonymousClass000.A0q(r3.groupJidRawString, A0k));
                } else {
                    StringBuilder A0u18 = AnonymousClass000.A0u();
                    A0u18.append("MemberSuggestedGroupsSyncJob/canceled; ");
                    C36341k9.A1O(A0u18, ((C156787aj) this).A0E());
                }
            }
        }
    }

    public boolean A0C() {
        if (this instanceof SyncDeviceAndResendMessageJob) {
            SyncDeviceAndResendMessageJob syncDeviceAndResendMessageJob = (SyncDeviceAndResendMessageJob) this;
            for (Requirement requirement : syncDeviceAndResendMessageJob.parameters.requirements) {
                if (!requirement.BMk()) {
                    if (requirement instanceof ChatConnectionRequirement) {
                        syncDeviceAndResendMessageJob.A01 = 1;
                        syncDeviceAndResendMessageJob.A0K = true;
                        return false;
                    }
                    syncDeviceAndResendMessageJob.A01 = 2;
                    return false;
                }
            }
            return true;
        }
        for (Requirement BMk : this.parameters.requirements) {
            if (!BMk.BMk()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ad, code lost:
        if (r1 >= 500) goto L_0x01af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0D(java.lang.Exception r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C156757ad
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "Fetch2FAEmailStatusJob/exception"
            com.whatsapp.util.Log.w(r0, r6)
            r0 = 1
            return r0
        L_0x000b:
            boolean r0 = r5 instanceof X.C156767af
            if (r0 == 0) goto L_0x0011
            r0 = 1
            return r0
        L_0x0011:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob
            if (r0 == 0) goto L_0x003e
            r4 = r5
            com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob r4 = (com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob) r4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "asyncMessageJob/exception while running async message job"
            java.lang.StringBuilder r2 = X.C90484aE.A0q(r0, r3)
            java.lang.String r0 = "; rowId="
            r2.append(r0)
            long r0 = r4.rowId
            r2.append(r0)
            java.lang.String r0 = "; job="
            r2.append(r0)
            java.lang.String r0 = r4.A0F()
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            X.C36351kA.A1P(r0, r3, r6)
            r0 = 1
            return r0
        L_0x003e:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob
            if (r0 == 0) goto L_0x0052
            r1 = r5
            com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob r1 = (com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob) r1
            java.lang.String r0 = "SyncdTableEmptyKeyCheckJob/onShouldRetry"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19n r1 = r1.A00
            r0 = 7
            r1.A03(r0)
            r0 = 0
            return r0
        L_0x0052:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.SyncDevicesJob
            if (r0 == 0) goto L_0x006b
            r2 = r5
            com.whatsapp.jobqueue.job.SyncDevicesJob r2 = (com.whatsapp.jobqueue.job.SyncDevicesJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SyncDevicesJob/onShouldReply/exception while running devices sync param="
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SyncDevicesJob.A00(r2)
            X.C36341k9.A1O(r1, r0)
            r0 = 1
            return r0
        L_0x006b:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob
            if (r0 == 0) goto L_0x0089
            r2 = r5
            com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob r2 = (com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onShouldReply/param="
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob.A00(r2)
            r1.append(r0)
            java.lang.String r0 = " ;exception="
            X.C36321k7.A1L(r6, r0, r1)
            r0 = 1
            return r0
        L_0x0089:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob
            if (r0 == 0) goto L_0x008f
            r0 = 0
            return r0
        L_0x008f:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob
            if (r0 == 0) goto L_0x00ad
            r2 = r5
            com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob r2 = (com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onShouldReply/param="
            r1.append(r0)
            java.lang.String r0 = r2.A0E()
            r1.append(r0)
            java.lang.String r0 = " ;exception="
            X.C36321k7.A1L(r6, r0, r1)
            r0 = 1
            return r0
        L_0x00ad:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            if (r0 == 0) goto L_0x00c6
            r2 = r5
            com.whatsapp.jobqueue.job.SendStatusPrivacyListJob r2 = (com.whatsapp.jobqueue.job.SendStatusPrivacyListJob) r2
            java.lang.StringBuilder r1 = X.C36341k9.A0i(r6)
            java.lang.String r0 = "exception while running send status privacy job"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SendStatusPrivacyListJob.A00(r2)
            X.C36351kA.A1P(r0, r1, r6)
            r0 = 1
            return r0
        L_0x00c6:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.SendLiveLocationKeyJob
            if (r0 == 0) goto L_0x00df
            r2 = r5
            com.whatsapp.jobqueue.job.SendLiveLocationKeyJob r2 = (com.whatsapp.jobqueue.job.SendLiveLocationKeyJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "exception while running send live location key job"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.A01(r2)
            X.C36351kA.A1P(r0, r1, r6)
            r0 = 1
            return r0
        L_0x00df:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob
            if (r0 == 0) goto L_0x00f8
            r2 = r5
            com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob r2 = (com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "exception while running send final live location retry job"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob.A00(r2)
            X.C36351kA.A1P(r0, r1, r6)
            r0 = 1
            return r0
        L_0x00f8:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob
            if (r0 == 0) goto L_0x0111
            r2 = r5
            com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob r2 = (com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "exception while running send final live location job"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob.A01(r2)
            X.C36351kA.A1P(r0, r1, r6)
            r0 = 1
            return r0
        L_0x0111:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.SendDisableLiveLocationJob
            if (r0 == 0) goto L_0x012a
            r2 = r5
            com.whatsapp.jobqueue.job.SendDisableLiveLocationJob r2 = (com.whatsapp.jobqueue.job.SendDisableLiveLocationJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "exception while running disable live location job"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.SendDisableLiveLocationJob.A00(r2)
            X.C36351kA.A1P(r0, r1, r6)
            r0 = 1
            return r0
        L_0x012a:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob
            if (r0 == 0) goto L_0x0141
            r2 = r5
            com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob r2 = (com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SendDeleteHistorySyncMmsJob/ exception while running job chunkId="
            r1.append(r0)
            java.lang.String r0 = r2.chunkId
            X.C36341k9.A1O(r1, r0)
            r0 = 1
            return r0
        L_0x0141:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.RotateSignedPreKeyJob
            if (r0 == 0) goto L_0x015a
            r2 = r5
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob r2 = (com.whatsapp.jobqueue.job.RotateSignedPreKeyJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "exception while running rotate signed pre key job"
            r1.append(r0)
            java.lang.String r0 = r2.A0E()
            X.C36351kA.A1P(r0, r1, r6)
            r0 = 1
            return r0
        L_0x015a:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.GetVNameCertificateJob
            if (r0 == 0) goto L_0x0173
            r2 = r5
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r2 = (com.whatsapp.jobqueue.job.GetVNameCertificateJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GetVNameCertificateJob/onShouldRetry, exception while running get vname certificate job"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.GetVNameCertificateJob.A00(r2)
            X.C36351kA.A1P(r0, r1, r6)
            r0 = 1
            return r0
        L_0x0173:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.GetStatusPrivacyJob
            if (r0 == 0) goto L_0x0190
            r2 = r5
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r2 = (com.whatsapp.jobqueue.job.GetStatusPrivacyJob) r2
            java.lang.StringBuilder r1 = X.C36341k9.A0i(r6)
            java.lang.String r0 = "exception while running get status privacy job"
            r1.append(r0)
            java.lang.StringBuilder r0 = X.C90464aC.A0k(r2)
            java.lang.String r0 = r0.toString()
            X.C36351kA.A1P(r0, r1, r6)
            r0 = 1
            return r0
        L_0x0190:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob
            if (r0 == 0) goto L_0x01d4
            java.lang.Throwable r1 = r6.getCause()
            boolean r0 = r1 instanceof X.AnonymousClass5V6
            if (r0 == 0) goto L_0x01af
            X.5V6 r1 = (X.AnonymousClass5V6) r1
            X.9nx r0 = r1.node
            if (r0 == 0) goto L_0x01af
            int r1 = X.AnonymousClass3ME.A00(r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r1 < r0) goto L_0x01af
            r0 = 500(0x1f4, float:7.0E-43)
            r2 = 0
            if (r1 < r0) goto L_0x01b0
        L_0x01af:
            r2 = 1
        L_0x01b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "exception while running generate privacy token job, "
            r1.append(r0)
            if (r2 == 0) goto L_0x01d1
            java.lang.String r0 = ""
        L_0x01bd:
            r1.append(r0)
            java.lang.String r0 = "retrying"
            r1.append(r0)
            java.lang.StringBuilder r0 = X.C90464aC.A0k(r5)
            java.lang.String r0 = r0.toString()
            X.C36351kA.A1P(r0, r1, r6)
            return r2
        L_0x01d1:
            java.lang.String r0 = "not "
            goto L_0x01bd
        L_0x01d4:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob
            if (r0 == 0) goto L_0x01ee
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DeleteAccountFromHsmServerJob/exception while running delete account from hsm server job"
            r1.append(r0)
            java.lang.StringBuilder r0 = X.C90464aC.A0k(r5)
            java.lang.String r0 = r0.toString()
            X.C36351kA.A1P(r0, r1, r6)
            r0 = 1
            return r0
        L_0x01ee:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.job.BulkGetPreKeyJob
            if (r0 == 0) goto L_0x0207
            r2 = r5
            com.whatsapp.jobqueue.job.BulkGetPreKeyJob r2 = (com.whatsapp.jobqueue.job.BulkGetPreKeyJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "exception while running bulk get pre key job"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.jobqueue.job.BulkGetPreKeyJob.A00(r2)
            X.C36351kA.A1P(r0, r1, r6)
            r0 = 1
            return r0
        L_0x0207:
            boolean r0 = r5 instanceof X.C156777ag
            if (r0 == 0) goto L_0x025a
            r4 = r5
            X.7ag r4 = (X.C156777ag) r4
            r2 = 0
            if (r6 == 0) goto L_0x0258
            java.lang.Throwable r1 = r6.getCause()
        L_0x0215:
            boolean r0 = r1 instanceof X.AnonymousClass5V6
            if (r0 == 0) goto L_0x021d
            X.5V6 r1 = (X.AnonymousClass5V6) r1
            X.9nx r2 = r1.node
        L_0x021d:
            r3 = 1
            if (r2 == 0) goto L_0x022d
            int r1 = X.AnonymousClass3ME.A00(r2)
            r0 = 400(0x190, float:5.6E-43)
            if (r0 > r1) goto L_0x022d
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L_0x022d
            r3 = 0
        L_0x022d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupFetchAllMembershipApprovalRequestsJob/ exception while running iq call "
            r2.append(r0)
            if (r3 == 0) goto L_0x0255
            java.lang.String r0 = ""
        L_0x023a:
            r2.append(r0)
            java.lang.String r0 = "retrying"
            r2.append(r0)
            java.lang.StringBuilder r1 = X.C90464aC.A0k(r4)
            java.lang.String r0 = "; groupJid="
            r1.append(r0)
            java.lang.String r0 = r4.groupJidRawString
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.C36351kA.A1P(r0, r2, r6)
            return r3
        L_0x0255:
            java.lang.String r0 = "not "
            goto L_0x023a
        L_0x0258:
            r1 = r2
            goto L_0x0215
        L_0x025a:
            r4 = r5
            X.7aj r4 = (X.C156787aj) r4
            r2 = 0
            if (r6 == 0) goto L_0x029d
            java.lang.Throwable r1 = r6.getCause()
        L_0x0264:
            boolean r0 = r1 instanceof X.AnonymousClass5V6
            if (r0 == 0) goto L_0x026b
            r2 = r1
            X.5V6 r2 = (X.AnonymousClass5V6) r2
        L_0x026b:
            r3 = 1
            if (r2 == 0) goto L_0x027e
            X.9nx r0 = r2.node
            if (r0 == 0) goto L_0x027e
            int r1 = X.AnonymousClass3ME.A00(r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r0 > r1) goto L_0x0299
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L_0x0299
        L_0x027e:
            java.lang.String r2 = ""
        L_0x0280:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MemberSuggestedGroupsSyncJob/exception while running iq call,"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " retrying; "
            r1.append(r0)
            java.lang.String r0 = r4.A0E()
            X.C36351kA.A1P(r0, r1, r6)
            return r3
        L_0x0299:
            r3 = 0
            java.lang.String r2 = " not"
            goto L_0x0280
        L_0x029d:
            r1 = r2
            goto L_0x0264
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.Job.A0D(java.lang.Exception):boolean");
    }

    public Job(JobParameters jobParameters) {
        this.parameters = jobParameters;
    }
}
