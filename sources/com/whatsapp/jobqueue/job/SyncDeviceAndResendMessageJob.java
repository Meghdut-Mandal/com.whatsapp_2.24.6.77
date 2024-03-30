package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass17X;
import X.AnonymousClass1A1;
import X.AnonymousClass1DT;
import X.AnonymousClass1FL;
import X.AnonymousClass1FN;
import X.AnonymousClass3T1;
import X.AnonymousClass7i8;
import X.C124185xj;
import X.C18800tq;
import X.C19700wN;
import X.C19730wQ;
import X.C19970wo;
import X.C20280xJ;
import X.C20430xY;
import X.C20810yC;
import X.C220412q;
import X.C25121Fb;
import X.C25151Fe;
import X.C26171Jd;
import X.C27301Nr;
import X.C27311Ns;
import X.C29571Xd;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C64933Qa;
import X.C90464aC;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

public class SyncDeviceAndResendMessageJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient Boolean A00;
    public transient int A01;
    public transient C19700wN A02;
    public transient C19730wQ A03;
    public transient C20430xY A04;
    public transient C27311Ns A05;
    public transient C27301Nr A06;
    public transient C124185xj A07;
    public transient C29571Xd A08;
    public transient AnonymousClass17X A09;
    public transient C25151Fe A0A;
    public transient AnonymousClass1FN A0B;
    public transient C26171Jd A0C;
    public transient AnonymousClass1FL A0D;
    public transient C20810yC A0E;
    public transient C25121Fb A0F;
    public transient C20280xJ A0G;
    public transient C64933Qa A0H;
    public transient AnonymousClass1A1 A0I;
    public transient Set A0J = C36441kJ.A16();
    public transient boolean A0K;
    public transient AnonymousClass1DT A0L;
    public transient C19970wo A0M;
    public transient C220412q A0N;
    public final long expirationMs;
    public final String messageId;
    public final String messageRawChatJid;
    public final String[] rawUserJids;
    public final long startTimeMs;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDeviceAndResendMessageJob(X.C64933Qa r6, com.whatsapp.jid.UserJid[] r7, long r8, long r10, boolean r12) {
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
            java.util.HashSet r0 = X.C36441kJ.A16()
            r5.A0J = r0
            int r4 = r7.length
            r3 = 0
        L_0x0022:
            if (r3 >= r4) goto L_0x0033
            r2 = r7[r3]
            java.util.Set r1 = r5.A0J
            java.lang.String r0 = "invalid jid"
            X.C18740tg.A07(r2, r0)
            r1.add(r2)
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0033:
            r5.A0H = r6
            java.util.List r0 = java.util.Arrays.asList(r7)
            java.lang.String[] r0 = X.AnonymousClass143.A0O(r0)
            r5.rawUserJids = r0
            java.lang.String r0 = r6.A01
            r5.messageId = r0
            X.11F r0 = r6.A00
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.getRawString()
            r5.messageRawChatJid = r0
            r5.expirationMs = r10
            r5.startTimeMs = r8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r5.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob.<init>(X.3Qa, com.whatsapp.jid.UserJid[], long, long, boolean):void");
    }

    public void A0F(int i) {
        AnonymousClass3T1 A032 = this.A0I.A03(this.A0H);
        if (A032 != null || (A032 = this.A0C.A0B(this.A0H)) != null) {
            HashSet A002 = this.A0B.A00(this.A0H);
            this.A0L.A0P(A032, (Integer) null, i, 1, AnonymousClass143.A09(this.A02, A002).size(), A002.size(), 0, 0, 0, false, false, true, this.A0K);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.rawUserJids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw new InvalidObjectException("rawJids must not be empty");
        }
        this.A0J = C36441kJ.A16();
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            UserJid A0l = C36431kI.A0l(str);
            if (A0l != null) {
                this.A0J.add(A0l);
                i++;
            } else {
                throw new InvalidObjectException(C36321k7.A0D("invalid jid:", str));
            }
        }
        AnonymousClass11F A0N2 = C36421kH.A0N(this.messageRawChatJid);
        if (A0N2 != null) {
            this.A0H = new C64933Qa(A0N2, this.messageId, true);
        } else {
            throw C90464aC.A0N(this.messageRawChatJid, AnonymousClass000.A0v("invalid jid:"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.util.HashSet} */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02df A[Catch:{ Exception -> 0x044b }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r22 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/param="
            r1.append(r0)
            r11 = r22
            java.lang.String r0 = r11.A0E()
            X.C36321k7.A1a(r1, r0)
            long r3 = r11.expirationMs
            r10 = 0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            X.0wo r0 = r11.A0M
            long r3 = X.C19970wo.A00(r0)
            long r1 = r11.expirationMs
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/skipping job due to expiration"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 5
            r11.A0F(r0)
            int r0 = r11.A01
            if (r0 <= 0) goto L_0x0058
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/expiration due to waiting for requirements"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0wN r2 = r11.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            int r0 = r11.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.Boolean r0 = r11.A00
            java.lang.String r1 = X.AnonymousClass000.A0o(r0, r1)
            java.lang.String r0 = "e2e-backfill-expired"
            r2.A0E(r0, r1, r10)
        L_0x0058:
            return
        L_0x0059:
            X.3Qa r0 = r11.A0H     // Catch:{ Exception -> 0x044b }
            X.11F r1 = r0.A00     // Catch:{ Exception -> 0x044b }
            boolean r0 = X.AnonymousClass143.A0I(r1)     // Catch:{ Exception -> 0x044b }
            if (r0 != 0) goto L_0x0210
            X.12q r0 = r11.A0N     // Catch:{ Exception -> 0x044b }
            boolean r0 = r0.A0P(r1)     // Catch:{ Exception -> 0x044b }
            if (r0 != 0) goto L_0x0210
            X.3Qa r0 = r11.A0H     // Catch:{ Exception -> 0x044b }
            X.11F r0 = r0.A00     // Catch:{ Exception -> 0x044b }
            boolean r0 = r0 instanceof X.C177528dw     // Catch:{ Exception -> 0x044b }
            if (r0 != 0) goto L_0x0210
            X.0yC r1 = r11.A0E     // Catch:{ Exception -> 0x044b }
            r0 = 2193(0x891, float:3.073E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x0210
            X.17X r1 = r11.A09     // Catch:{ Exception -> 0x044b }
            X.3Qa r0 = r11.A0H     // Catch:{ Exception -> 0x044b }
            X.11F r0 = r0.A00     // Catch:{ Exception -> 0x044b }
            boolean r0 = r1.A0B(r0)     // Catch:{ Exception -> 0x044b }
            if (r0 != 0) goto L_0x0210
            java.util.Set r0 = r11.A0J     // Catch:{ Exception -> 0x044b }
            java.util.HashSet r1 = X.C90524aI.A0k(r0)     // Catch:{ Exception -> 0x044b }
            X.0wQ r0 = r11.A03     // Catch:{ Exception -> 0x044b }
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r0)     // Catch:{ Exception -> 0x044b }
            r1.remove(r0)     // Catch:{ Exception -> 0x044b }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x00b7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/requestPrekeyForDevices only self device in the list. recipients size="
            r1.append(r0)     // Catch:{ Exception -> 0x044b }
            java.util.Set r0 = r11.A0J     // Catch:{ Exception -> 0x044b }
            int r0 = r0.size()     // Catch:{ Exception -> 0x044b }
            X.C36351kA.A1R(r1, r0)     // Catch:{ Exception -> 0x044b }
        L_0x00b0:
            r0 = 8
            r11.A0F(r0)     // Catch:{ Exception -> 0x044b }
            goto L_0x0447
        L_0x00b7:
            X.5xj r8 = r11.A07     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = ""
            X.C18740tg.A09(r0, r1)     // Catch:{ Exception -> 0x044b }
            X.777 r9 = new X.777     // Catch:{ Exception -> 0x044b }
            r9.<init>()     // Catch:{ Exception -> 0x044b }
            X.61v r7 = new X.61v     // Catch:{ Exception -> 0x044b }
            r7.<init>(r8, r9)     // Catch:{ Exception -> 0x044b }
            X.0wN r6 = r8.A00     // Catch:{ Exception -> 0x044b }
            X.19A r5 = r8.A04     // Catch:{ Exception -> 0x044b }
            java.util.HashMap r4 = X.AnonymousClass001.A0J()     // Catch:{ Exception -> 0x044b }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ Exception -> 0x044b }
        L_0x00d4:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x0112
            com.whatsapp.jid.UserJid r3 = X.C36441kJ.A0o(r14)     // Catch:{ Exception -> 0x044b }
            java.util.HashMap r2 = X.AnonymousClass001.A0J()     // Catch:{ Exception -> 0x044b }
            X.17i r0 = r8.A03     // Catch:{ Exception -> 0x044b }
            java.util.HashSet r0 = r0.A0B(r3)     // Catch:{ Exception -> 0x044b }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ Exception -> 0x044b }
        L_0x00ec:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x010e
            java.lang.Object r1 = r13.next()     // Catch:{ Exception -> 0x044b }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ Exception -> 0x044b }
            X.6EZ r12 = X.C133256Xm.A02(r1)     // Catch:{ Exception -> 0x044b }
            X.189 r0 = r8.A01     // Catch:{ Exception -> 0x044b }
            X.9eC r0 = r0.A0D(r12)     // Catch:{ Exception -> 0x044b }
            X.9bJ r0 = r0.A01     // Catch:{ Exception -> 0x044b }
            X.8S2 r0 = r0.A00     // Catch:{ Exception -> 0x044b }
            int r0 = r0.remoteRegistrationId_     // Catch:{ Exception -> 0x044b }
            if (r0 <= 0) goto L_0x00ec
            X.C36341k9.A1K(r1, r2, r0)     // Catch:{ Exception -> 0x044b }
            goto L_0x00ec
        L_0x010e:
            r4.put(r3, r2)     // Catch:{ Exception -> 0x044b }
            goto L_0x00d4
        L_0x0112:
            X.6xg r8 = new X.6xg     // Catch:{ Exception -> 0x044b }
            r8.<init>(r6, r7, r5, r4)     // Catch:{ Exception -> 0x044b }
            java.util.Map r2 = r8.A01     // Catch:{ Exception -> 0x044b }
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x044b }
            r0 = r0 ^ 1
            X.C18740tg.A0B(r0)     // Catch:{ Exception -> 0x044b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = "FetchPrekeyForAllDevicesProtocolHelper/sendFetchPrekeyForAllDeviceRequest size="
            r1.append(r0)     // Catch:{ Exception -> 0x044b }
            int r0 = r2.size()     // Catch:{ Exception -> 0x044b }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ Exception -> 0x044b }
            X.19A r15 = r8.A00     // Catch:{ Exception -> 0x044b }
            java.lang.String r7 = r15.A09()     // Catch:{ Exception -> 0x044b }
            r19 = 346(0x15a, float:4.85E-43)
            int r0 = r2.size()     // Catch:{ Exception -> 0x044b }
            java.util.ArrayList r14 = X.C36441kJ.A14(r0)     // Catch:{ Exception -> 0x044b }
            java.util.Iterator r18 = X.AnonymousClass000.A0y(r2)     // Catch:{ Exception -> 0x044b }
        L_0x0146:
            boolean r0 = r18.hasNext()     // Catch:{ Exception -> 0x044b }
            r13 = 0
            java.lang.String r12 = "id"
            r6 = 1
            if (r0 == 0) goto L_0x01c1
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r18)     // Catch:{ Exception -> 0x044b }
            java.lang.Object r5 = r0.getKey()     // Catch:{ Exception -> 0x044b }
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5     // Catch:{ Exception -> 0x044b }
            java.lang.Object r1 = r0.getValue()     // Catch:{ Exception -> 0x044b }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Exception -> 0x044b }
            int r0 = r1.size()     // Catch:{ Exception -> 0x044b }
            java.util.ArrayList r4 = X.C36441kJ.A14(r0)     // Catch:{ Exception -> 0x044b }
            java.util.Iterator r17 = X.AnonymousClass000.A0y(r1)     // Catch:{ Exception -> 0x044b }
        L_0x016c:
            boolean r0 = r17.hasNext()     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x01a7
            java.util.Map$Entry r16 = X.AnonymousClass000.A11(r17)     // Catch:{ Exception -> 0x044b }
            java.lang.Object r0 = r16.getValue()     // Catch:{ Exception -> 0x044b }
            int r0 = X.C90514aH.A0H(r0)     // Catch:{ Exception -> 0x044b }
            byte[] r1 = X.C203239na.A02(r0)     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = "registration"
            X.9nx r3 = new X.9nx     // Catch:{ Exception -> 0x044b }
            r3.<init>((java.lang.String) r0, (byte[]) r1, (X.AnonymousClass1AL[]) r13)     // Catch:{ Exception -> 0x044b }
            X.1AL[] r2 = new X.AnonymousClass1AL[r6]     // Catch:{ Exception -> 0x044b }
            java.lang.Object r0 = r16.getKey()     // Catch:{ Exception -> 0x044b }
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0     // Catch:{ Exception -> 0x044b }
            int r1 = r0.getDevice()     // Catch:{ Exception -> 0x044b }
            X.1AL r0 = new X.1AL     // Catch:{ Exception -> 0x044b }
            r0.<init>((java.lang.String) r12, (int) r1)     // Catch:{ Exception -> 0x044b }
            r2[r10] = r0     // Catch:{ Exception -> 0x044b }
            java.lang.String r1 = "device"
            X.9nx r0 = new X.9nx     // Catch:{ Exception -> 0x044b }
            r0.<init>((X.C203399nx) r3, (java.lang.String) r1, (X.AnonymousClass1AL[]) r2)     // Catch:{ Exception -> 0x044b }
            r4.add(r0)     // Catch:{ Exception -> 0x044b }
            goto L_0x016c
        L_0x01a7:
            X.1AL[] r3 = new X.AnonymousClass1AL[r6]     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = "jid"
            X.C90504aG.A1E(r5, r0, r3, r10)     // Catch:{ Exception -> 0x044b }
            X.9nx[] r0 = new X.C203399nx[r10]     // Catch:{ Exception -> 0x044b }
            java.lang.Object[] r2 = r4.toArray(r0)     // Catch:{ Exception -> 0x044b }
            X.9nx[] r2 = (X.C203399nx[]) r2     // Catch:{ Exception -> 0x044b }
            java.lang.String r1 = "user"
            X.9nx r0 = new X.9nx     // Catch:{ Exception -> 0x044b }
            r0.<init>((java.lang.String) r1, (X.AnonymousClass1AL[]) r3, (X.C203399nx[]) r2)     // Catch:{ Exception -> 0x044b }
            r14.add(r0)     // Catch:{ Exception -> 0x044b }
            goto L_0x0146
        L_0x01c1:
            r0 = 4
            X.1AL[] r4 = new X.AnonymousClass1AL[r0]     // Catch:{ Exception -> 0x044b }
            X.C36341k9.A1L(r12, r7, r4, r10)     // Catch:{ Exception -> 0x044b }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "encrypt"
            X.C36341k9.A1L(r1, r0, r4, r6)     // Catch:{ Exception -> 0x044b }
            r2 = 2
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C36341k9.A1L(r1, r0, r4, r2)     // Catch:{ Exception -> 0x044b }
            r2 = 3
            X.C36341k9.A1V(r4, r2)     // Catch:{ Exception -> 0x044b }
            X.9nx[] r0 = new X.C203399nx[r10]     // Catch:{ Exception -> 0x044b }
            java.lang.Object[] r3 = r14.toArray(r0)     // Catch:{ Exception -> 0x044b }
            X.9nx[] r3 = (X.C203399nx[]) r3     // Catch:{ Exception -> 0x044b }
            java.lang.String r1 = "key_fetch"
            X.9nx r0 = new X.9nx     // Catch:{ Exception -> 0x044b }
            r0.<init>((java.lang.String) r1, (X.AnonymousClass1AL[]) r13, (X.C203399nx[]) r3)     // Catch:{ Exception -> 0x044b }
            X.9nx r17 = X.C36391kE.A0m(r0, r4)     // Catch:{ Exception -> 0x044b }
            r20 = 64000(0xfa00, double:3.162E-319)
            r16 = r8
            r18 = r7
            r15.A0E(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x044b }
            java.lang.Object r0 = r9.get()     // Catch:{ Exception -> 0x044b }
            boolean r4 = X.AnonymousClass000.A1X(r0)     // Catch:{ Exception -> 0x044b }
            X.1Nr r3 = r11.A06     // Catch:{ Exception -> 0x044b }
            java.util.Set r1 = r11.A0J     // Catch:{ Exception -> 0x044b }
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r10]     // Catch:{ Exception -> 0x044b }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ Exception -> 0x044b }
            com.whatsapp.jid.UserJid[] r0 = (com.whatsapp.jid.UserJid[]) r0     // Catch:{ Exception -> 0x044b }
            r3.A01(r0, r2)     // Catch:{ Exception -> 0x044b }
            goto L_0x02dd
        L_0x0210:
            X.3Qa r0 = r11.A0H     // Catch:{ Exception -> 0x044b }
            X.11F r0 = r0.A00     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x02a6
            X.0yC r1 = r11.A0E     // Catch:{ Exception -> 0x044b }
            r0 = 4961(0x1361, float:6.952E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x02a6
            java.util.Set r0 = r11.A0J     // Catch:{ Exception -> 0x044b }
            java.util.HashSet r5 = X.C90524aI.A0k(r0)     // Catch:{ Exception -> 0x044b }
            X.17X r8 = r11.A09     // Catch:{ Exception -> 0x044b }
            X.3Qa r0 = r11.A0H     // Catch:{ Exception -> 0x044b }
            X.11F r7 = r0.A00     // Catch:{ Exception -> 0x044b }
            boolean r0 = r7 instanceof X.AnonymousClass144     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x02a3
            X.17b r0 = r8.A0C     // Catch:{ Exception -> 0x044b }
            r2 = r7
            X.144 r2 = (X.AnonymousClass144) r2     // Catch:{ Exception -> 0x044b }
            boolean r1 = r0.A02(r2)     // Catch:{ Exception -> 0x044b }
            X.17r r0 = r8.A07     // Catch:{ Exception -> 0x044b }
            X.6X6 r2 = r0.A0C(r2)     // Catch:{ Exception -> 0x044b }
            X.0wQ r0 = r8.A02     // Catch:{ Exception -> 0x044b }
            boolean r0 = r2.A0P(r0)     // Catch:{ Exception -> 0x044b }
            if (r1 == 0) goto L_0x02a3
            if (r0 == 0) goto L_0x02a3
            java.util.HashSet r4 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x044b }
            X.17i r1 = r8.A0A     // Catch:{ Exception -> 0x044b }
            java.util.Map r0 = r2.A07     // Catch:{ Exception -> 0x044b }
            java.util.Set r0 = r0.keySet()     // Catch:{ Exception -> 0x044b }
            X.0y7 r0 = X.C20760y7.copyOf((java.util.Collection) r0)     // Catch:{ Exception -> 0x044b }
            java.util.HashMap r9 = r1.A08(r0)     // Catch:{ Exception -> 0x044b }
            java.util.Map r0 = r2.A08     // Catch:{ Exception -> 0x044b }
            java.util.Set r0 = r0.keySet()     // Catch:{ Exception -> 0x044b }
            X.0y7 r0 = X.C20760y7.copyOf((java.util.Collection) r0)     // Catch:{ Exception -> 0x044b }
            java.util.HashMap r0 = r1.A08(r0)     // Catch:{ Exception -> 0x044b }
            java.util.Iterator r12 = X.C36371kC.A10(r0)     // Catch:{ Exception -> 0x044b }
        L_0x026f:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x02a9
            java.util.Map$Entry r6 = X.AnonymousClass000.A11(r12)     // Catch:{ Exception -> 0x044b }
            java.lang.Object r1 = r6.getKey()     // Catch:{ Exception -> 0x044b }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ Exception -> 0x044b }
            X.12O r0 = r8.A09     // Catch:{ Exception -> 0x044b }
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1     // Catch:{ Exception -> 0x044b }
            X.13w r3 = r0.A09(r1)     // Catch:{ Exception -> 0x044b }
            java.lang.Object r2 = r9.get(r3)     // Catch:{ Exception -> 0x044b }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ Exception -> 0x044b }
            java.lang.Object r0 = r6.getValue()     // Catch:{ Exception -> 0x044b }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x044b }
            if (r2 == 0) goto L_0x029f
            int r1 = r0.size()     // Catch:{ Exception -> 0x044b }
            int r0 = r2.size()     // Catch:{ Exception -> 0x044b }
            if (r1 == r0) goto L_0x026f
        L_0x029f:
            r4.add(r3)     // Catch:{ Exception -> 0x044b }
            goto L_0x026f
        L_0x02a3:
            X.02c r4 = X.C004702c.A00     // Catch:{ Exception -> 0x044b }
            goto L_0x02c3
        L_0x02a6:
            java.util.Set r5 = r11.A0J     // Catch:{ Exception -> 0x044b }
            goto L_0x02c6
        L_0x02a9:
            int r0 = r4.size()     // Catch:{ Exception -> 0x044b }
            if (r0 <= 0) goto L_0x02c3
            X.0wN r2 = r8.A00     // Catch:{ Exception -> 0x044b }
            java.lang.StringBuilder r1 = X.C36381kD.A11(r7)     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = ":"
            X.C36341k9.A1N(r0, r1, r4)     // Catch:{ Exception -> 0x044b }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = "pnh-cag-missing-lids"
            r2.A0E(r0, r1, r10)     // Catch:{ Exception -> 0x044b }
        L_0x02c3:
            r5.addAll(r4)     // Catch:{ Exception -> 0x044b }
        L_0x02c6:
            X.0xY r1 = r11.A04     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = "jid list is empty"
            X.C18740tg.A09(r0, r5)     // Catch:{ Exception -> 0x044b }
            X.5Tu r0 = X.C108515Tu.A0F     // Catch:{ Exception -> 0x044b }
            X.5Lg r0 = r1.A04(r0, r5)     // Catch:{ Exception -> 0x044b }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x044b }
            X.6Pu r0 = (X.C131626Pu) r0     // Catch:{ Exception -> 0x044b }
            boolean r4 = r0.A00()     // Catch:{ Exception -> 0x044b }
        L_0x02dd:
            if (r4 == 0) goto L_0x00b0
            X.3Qa r3 = r11.A0H     // Catch:{ Exception -> 0x044b }
            X.1A1 r0 = r11.A0I     // Catch:{ Exception -> 0x044b }
            X.3T1 r6 = r0.A03(r3)     // Catch:{ Exception -> 0x044b }
            if (r6 != 0) goto L_0x0304
            X.1Jd r0 = r11.A0C     // Catch:{ Exception -> 0x044b }
            X.2bM r6 = r0.A0B(r3)     // Catch:{ Exception -> 0x044b }
            if (r6 != 0) goto L_0x0304
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/revokeMessage/message "
            r1.append(r0)     // Catch:{ Exception -> 0x044b }
            r1.append(r3)     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = " no longer exist"
            X.C36321k7.A1a(r1, r0)     // Catch:{ Exception -> 0x044b }
            goto L_0x0448
        L_0x0304:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r6.A1T(r0)     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x031e
            X.3Kx r0 = r6.A0P()     // Catch:{ Exception -> 0x044b }
            if (r0 != 0) goto L_0x031e
            X.1Fb r2 = r11.A0F     // Catch:{ Exception -> 0x044b }
            X.02c r1 = X.C004702c.A00     // Catch:{ Exception -> 0x044b }
            X.3IP r0 = new X.3IP     // Catch:{ Exception -> 0x044b }
            r0.<init>(r1, r10)     // Catch:{ Exception -> 0x044b }
            r2.A00(r0, r6)     // Catch:{ Exception -> 0x044b }
        L_0x031e:
            boolean r0 = r6 instanceof X.C46732ba     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x032e
            X.1Xd r0 = r11.A08     // Catch:{ Exception -> 0x044b }
            X.2ba r6 = (X.C46732ba) r6     // Catch:{ Exception -> 0x044b }
            X.3T1 r6 = r0.A01(r6)     // Catch:{ Exception -> 0x044b }
            if (r6 != 0) goto L_0x032e
            goto L_0x0449
        L_0x032e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/message = "
            X.C36321k7.A1K(r6, r0, r1)     // Catch:{ Exception -> 0x044b }
            X.1FN r0 = r11.A0B     // Catch:{ Exception -> 0x044b }
            java.util.HashSet r4 = r0.A00(r3)     // Catch:{ Exception -> 0x044b }
            X.1Fe r9 = r11.A0A     // Catch:{ Exception -> 0x044b }
            boolean r0 = r6 instanceof X.AnonymousClass2bO     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x035a
            java.util.HashSet r2 = r9.A06(r6)     // Catch:{ Exception -> 0x044b }
        L_0x0347:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/original list = "
            X.C36321k7.A1K(r4, r0, r1)     // Catch:{ Exception -> 0x044b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/new list = "
            X.C36321k7.A1K(r2, r0, r1)     // Catch:{ Exception -> 0x044b }
            goto L_0x0389
        L_0x035a:
            X.3Qa r0 = r6.A1J     // Catch:{ Exception -> 0x044b }
            boolean r5 = r0.A02     // Catch:{ Exception -> 0x044b }
            if (r5 == 0) goto L_0x036d
            long r1 = r6.A0G     // Catch:{ Exception -> 0x044b }
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x036d
            java.util.HashSet r2 = X.C25151Fe.A03(r9, r6)     // Catch:{ Exception -> 0x044b }
            goto L_0x0347
        L_0x036d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = "MessageDeviceTargetManager/getDevicesToResendMessage/invalid message: "
            r2.append(r0)     // Catch:{ Exception -> 0x044b }
            r2.append(r5)     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = " : "
            r2.append(r0)     // Catch:{ Exception -> 0x044b }
            long r0 = r6.A0G     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = X.C36411kG.A11(r2, r0)     // Catch:{ Exception -> 0x044b }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x044b }
            r2 = 0
            goto L_0x0347
        L_0x0389:
            if (r2 == 0) goto L_0x0058
            r2.removeAll(r4)     // Catch:{ Exception -> 0x044b }
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x044b }
            if (r0 != 0) goto L_0x040e
            X.1FL r1 = r11.A0D     // Catch:{ Exception -> 0x044b }
            X.0wN r0 = r11.A02     // Catch:{ Exception -> 0x044b }
            java.util.Set r0 = X.AnonymousClass143.A09(r0, r2)     // Catch:{ Exception -> 0x044b }
            java.util.HashMap r5 = r1.A01(r0)     // Catch:{ Exception -> 0x044b }
            X.1FN r1 = r11.A0B     // Catch:{ Exception -> 0x044b }
            X.1A1 r0 = r1.A03     // Catch:{ Exception -> 0x044b }
            X.3T1 r0 = r0.A03(r3)     // Catch:{ Exception -> 0x044b }
            if (r0 != 0) goto L_0x040a
            X.1FM r0 = r1.A00     // Catch:{ Exception -> 0x044b }
        L_0x03ac:
            java.util.HashMap r4 = r0.A03(r3)     // Catch:{ Exception -> 0x044b }
            java.util.HashSet r3 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x044b }
            java.util.Iterator r8 = r2.iterator()     // Catch:{ Exception -> 0x044b }
        L_0x03b8:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x040d
            java.lang.Object r7 = r8.next()     // Catch:{ Exception -> 0x044b }
            com.whatsapp.jid.DeviceJid r7 = (com.whatsapp.jid.DeviceJid) r7     // Catch:{ Exception -> 0x044b }
            boolean r0 = X.AnonymousClass9ZV.A00(r7)     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x03d0
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/filterInvalidDevices/dropping hosted jid"
        L_0x03cc:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x044b }
            goto L_0x03b8
        L_0x03d0:
            com.whatsapp.jid.UserJid r2 = r7.userJid     // Catch:{ Exception -> 0x044b }
            java.lang.Object r1 = r5.get(r2)     // Catch:{ Exception -> 0x044b }
            java.lang.Object r0 = r4.get(r2)     // Catch:{ Exception -> 0x044b }
            boolean r0 = X.C1901797e.A00(r1, r0)     // Catch:{ Exception -> 0x044b }
            if (r0 == 0) goto L_0x03e4
            r3.add(r7)     // Catch:{ Exception -> 0x044b }
            goto L_0x03b8
        L_0x03e4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/filterInvalidDevices/dropping: "
            r1.append(r0)     // Catch:{ Exception -> 0x044b }
            r1.append(r7)     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = " currentVersion: "
            r1.append(r0)     // Catch:{ Exception -> 0x044b }
            java.lang.Object r0 = r5.get(r2)     // Catch:{ Exception -> 0x044b }
            r1.append(r0)     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = " versionsAtTimeOfMessageSend: "
            r1.append(r0)     // Catch:{ Exception -> 0x044b }
            java.lang.Object r0 = r4.get(r2)     // Catch:{ Exception -> 0x044b }
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)     // Catch:{ Exception -> 0x044b }
            goto L_0x03cc
        L_0x040a:
            X.1FK r0 = r1.A01     // Catch:{ Exception -> 0x044b }
            goto L_0x03ac
        L_0x040d:
            r2 = r3
        L_0x040e:
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x044b }
            if (r0 != 0) goto L_0x0058
            X.1Fe r0 = r11.A0A     // Catch:{ Exception -> 0x044b }
            r0.A07(r6, r2)     // Catch:{ Exception -> 0x044b }
            X.1FN r0 = r11.A0B     // Catch:{ Exception -> 0x044b }
            r0.A03(r6, r2)     // Catch:{ Exception -> 0x044b }
            X.777 r12 = new X.777     // Catch:{ Exception -> 0x044b }
            r12.<init>()     // Catch:{ Exception -> 0x044b }
            X.0xJ r9 = r11.A0G     // Catch:{ Exception -> 0x044b }
            long r3 = r11.expirationMs     // Catch:{ Exception -> 0x044b }
            long r0 = r11.startTimeMs     // Catch:{ Exception -> 0x044b }
            r8 = 0
            X.0wo r7 = r9.A07     // Catch:{ Exception -> 0x044b }
            X.5yc r5 = new X.5yc     // Catch:{ Exception -> 0x044b }
            r5.<init>(r7, r6)     // Catch:{ Exception -> 0x044b }
            r5.A07 = r10     // Catch:{ Exception -> 0x044b }
            r5.A06 = r10     // Catch:{ Exception -> 0x044b }
            r5.A05 = r2     // Catch:{ Exception -> 0x044b }
            r5.A02 = r3     // Catch:{ Exception -> 0x044b }
            r5.A00 = r0     // Catch:{ Exception -> 0x044b }
            X.6Do r0 = new X.6Do     // Catch:{ Exception -> 0x044b }
            r0.<init>(r5)     // Catch:{ Exception -> 0x044b }
            X.C20280xJ.A00(r9, r0, r12, r8)     // Catch:{ Exception -> 0x044b }
            r12.get()     // Catch:{ Exception -> 0x044b }
            goto L_0x044a
        L_0x0447:
            return
        L_0x0448:
            return
        L_0x0449:
            return
        L_0x044a:
            return
        L_0x044b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/error, param="
            r1.append(r0)
            java.lang.String r0 = r11.A0E()
            X.C36321k7.A1Z(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob.A0B():void");
    }

    public String A0E() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; key=");
        A0u.append(this.A0H);
        A0u.append("; timeoutMs=");
        A0u.append(this.expirationMs);
        A0u.append("; rawJids=");
        A0u.append(this.A0J);
        A0u.append("; offlineInProgressDuringMessageSend=");
        return AnonymousClass000.A0o(this.A00, A0u);
    }

    public void Bqf(Context context) {
        C18800tq A0I2 = C90464aC.A0I(context);
        this.A0M = A0I2.Bvc();
        this.A0E = C36341k9.A0V(A0I2);
        this.A02 = A0I2.B3m();
        this.A03 = C36351kA.A0N(A0I2);
        this.A0N = C36351kA.A0a(A0I2);
        this.A0L = (AnonymousClass1DT) A0I2.A55.get();
        this.A0I = C36351kA.A0n(A0I2);
        this.A06 = (C27301Nr) A0I2.A2m.get();
        this.A04 = C36421kH.A0K(A0I2);
        this.A0G = (C20280xJ) A0I2.A7d.get();
        this.A0C = (C26171Jd) A0I2.A4s.get();
        this.A08 = (C29571Xd) A0I2.A2u.get();
        this.A0B = (AnonymousClass1FN) A0I2.A7D.get();
        this.A05 = (C27311Ns) A0I2.A2l.get();
        this.A0F = (C25121Fb) A0I2.A3K.get();
        this.A09 = C36351kA.A0b(A0I2);
        this.A0D = (AnonymousClass1FL) A0I2.A6e.get();
        this.A0A = (C25151Fe) A0I2.A51.get();
        this.A07 = (C124185xj) A0I2.AfI.A00.A1j.get();
        this.A05.A01(this.A0H);
    }
}
