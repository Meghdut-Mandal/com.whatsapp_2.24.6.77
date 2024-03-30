package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass12U;
import X.AnonymousClass143;
import X.AnonymousClass16J;
import X.AnonymousClass17E;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass187;
import X.AnonymousClass189;
import X.AnonymousClass19A;
import X.AnonymousClass19I;
import X.AnonymousClass1A1;
import X.AnonymousClass1AL;
import X.AnonymousClass1AW;
import X.AnonymousClass1DT;
import X.AnonymousClass1DU;
import X.AnonymousClass1DW;
import X.AnonymousClass1EE;
import X.AnonymousClass1EO;
import X.AnonymousClass1ER;
import X.AnonymousClass1EU;
import X.AnonymousClass1FE;
import X.AnonymousClass1FN;
import X.AnonymousClass1FU;
import X.AnonymousClass1JV;
import X.AnonymousClass1KK;
import X.AnonymousClass1OD;
import X.AnonymousClass1P5;
import X.AnonymousClass1WY;
import X.AnonymousClass1XT;
import X.AnonymousClass1XZ;
import X.AnonymousClass3T1;
import X.AnonymousClass3UK;
import X.AnonymousClass630;
import X.AnonymousClass64Y;
import X.AnonymousClass6H4;
import X.AnonymousClass7i8;
import X.AnonymousClass8Q4;
import X.AnonymousClass8SW;
import X.AnonymousClass8SX;
import X.AnonymousClass96U;
import X.AnonymousClass9K2;
import X.AnonymousClass9KM;
import X.AnonymousClass9Ta;
import X.AnonymousClass9UO;
import X.C000100b;
import X.C06120Sj;
import X.C110545aq;
import X.C132166Sm;
import X.C133256Xm;
import X.C165577te;
import X.C165587tf;
import X.C165617ti;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C191959Fd;
import X.C192649Ia;
import X.C194359Pj;
import X.C19460v5;
import X.C19470v6;
import X.C19700wN;
import X.C19730wQ;
import X.C19970wo;
import X.C202969n1;
import X.C20310xM;
import X.C203399nx;
import X.C20520xh;
import X.C20810yC;
import X.C21060yb;
import X.C220412q;
import X.C222713q;
import X.C232617u;
import X.C24961El;
import X.C25121Fb;
import X.C25151Fe;
import X.C26171Jd;
import X.C26191Jf;
import X.C28291Sb;
import X.C29571Xd;
import X.C29821Yc;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C61883Du;
import X.C80293vA;
import X.C90464aC;
import X.C90524aI;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.exception.EncryptionFailException;
import com.whatsapp.jobqueue.job.exception.OutOfMemoryException;
import com.whatsapp.jobqueue.job.exception.UnrecoverableErrorException;
import com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.service.UnsentMessagesNetworkAvailableJob;
import com.whatsapp.util.Log;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class SendE2EMessageJob extends Job implements AnonymousClass7i8 {
    public static final ConcurrentHashMap A1E = C90524aI.A0s();
    public static final long serialVersionUID = 1;
    public transient C19460v5 A00;
    public transient C19700wN A01;
    public transient AnonymousClass17Y A02;
    public transient C19730wQ A03;
    public transient AnonymousClass1KK A04;
    public transient C19970wo A05;
    public transient AnonymousClass1ER A06;
    public transient C220412q A07;
    public transient C29571Xd A08;
    public transient AnonymousClass17X A09;
    public transient AnonymousClass16J A0A;
    public transient C26171Jd A0B;
    public transient C20810yC A0C;
    public transient AnonymousClass17E A0D;
    public transient C25121Fb A0E;
    public transient DeviceJid A0F;
    public transient AnonymousClass9Ta A0G;
    public transient AnonymousClass64Y A0H;
    public transient AnonymousClass9KM A0I;
    public transient AnonymousClass1DU A0J;
    public transient AnonymousClass1FU A0K;
    public transient C132166Sm A0L;
    public transient AnonymousClass19I A0M;
    public transient AnonymousClass8SX A0N;
    public transient AnonymousClass3T1 A0O;
    public transient AnonymousClass1EO A0P;
    public transient AnonymousClass1A1 A0Q;
    public transient AnonymousClass005 A0R;
    public transient AnonymousClass005 A0S;
    public transient boolean A0T;
    public transient int A0U;
    public transient int A0V;
    public transient long A0W;
    public transient long A0X;
    public transient long A0Y;
    public transient long A0Z;
    public transient C19460v5 A0a;
    public transient C19460v5 A0b;
    public transient C19460v5 A0c;
    public transient C19460v5 A0d;
    public transient C19460v5 A0e;
    public transient AnonymousClass1DT A0f;
    public transient AnonymousClass1XT A0g;
    public transient AnonymousClass1XZ A0h;
    public transient AnonymousClass185 A0i;
    public transient AnonymousClass189 A0j;
    public transient AnonymousClass187 A0k;
    public transient AnonymousClass96U A0l;
    public transient C29821Yc A0m;
    public transient C20310xM A0n;
    public transient C232617u A0o;
    public transient AnonymousClass1FE A0p;
    public transient C25151Fe A0q;
    public transient C28291Sb A0r;
    public transient AnonymousClass1FN A0s;
    public transient AnonymousClass1OD A0t;
    public transient C194359Pj A0u;
    public transient C20520xh A0v;
    public transient C202969n1 A0w;
    public transient AnonymousClass1P5 A0x;
    public transient AnonymousClass19A A0y;
    public transient C26191Jf A0z;
    public transient AnonymousClass1EU A10;
    public transient C191959Fd A11;
    public transient AnonymousClass1AW A12;
    public transient AnonymousClass12U A13;
    public transient AnonymousClass1JV A14;
    public transient C192649Ia A15;
    public transient C61883Du A16;
    public transient C24961El A17;
    public transient C000100b A18;
    public transient AnonymousClass005 A19;
    public transient boolean A1A;
    public transient boolean A1B;
    public transient boolean A1C;
    public transient boolean A1D;
    public final String botInvokeRawJid;
    public final String broadcastListName;
    public final HashMap broadcastParticipantEphemeralSettings;
    public boolean duplicate;
    public final int editVersion;
    public final HashMap encryptionRetryCounts;
    public final byte[] ephemeralSharedSecret;
    public final long expireTimeMs;
    public final boolean forceSenderKeyDistribution;
    public final String groupParticipantHash;
    public final String groupParticipantUserHash;
    public final String id;
    public final boolean includeSenderKeysInMessage;
    public final String jid;
    public final Integer liveLocationDuration;
    public final long messageSendStartTime;
    public final int messageType;
    public final boolean multiDeviceFanOut;
    public final long originalTimestamp;
    public final int originationFlags;
    public final String participant;
    public final String recipientRawJid;
    public final int retryCount;
    public final HashSet targetDeviceRawJids;
    public final boolean useLidForEncryption;
    public final boolean useOneOneEncryptionOnPHashMismatch;
    public final boolean useParticipantUserHash;

    public static AnonymousClass630 A00(AnonymousClass9K2 r4) {
        if (r4 == null || r4.A01 != 0) {
            return null;
        }
        return new AnonymousClass630(r4.A02, 2, C110545aq.A00(r4.A00));
    }

    private String A01() {
        String A052;
        String A042 = AnonymousClass143.A04(this.jid);
        String A043 = AnonymousClass143.A04(this.participant);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("; id=");
        A0u2.append(this.id);
        A0u2.append("; jid=");
        A0u2.append(A042);
        A0u2.append("; participant=");
        A0u2.append(A043);
        A0u2.append("; retryCount=");
        A0u2.append(this.retryCount);
        A0u2.append("; targetDevices=");
        HashSet hashSet = this.targetDeviceRawJids;
        if (hashSet == null) {
            A052 = "null";
        } else {
            A052 = AnonymousClass143.A05(C36371kC.A1b(hashSet, 0));
        }
        A0u2.append(A052);
        A0u2.append("; groupParticipantHash=");
        A0u2.append(this.groupParticipantHash);
        A0u2.append("; includeSenderKeysInMessage=");
        A0u2.append(this.includeSenderKeysInMessage);
        A0u2.append("; useOneOneEncryptionOnPHashMismatch=");
        A0u2.append(this.useOneOneEncryptionOnPHashMismatch);
        A0u2.append("; forceSenderKeyDistribution=");
        A0u2.append(this.forceSenderKeyDistribution);
        A0u2.append("; useParticipantUserHash=");
        A0u2.append(this.useParticipantUserHash);
        A0u2.append("; persistentId=");
        return C36411kG.A11(A0u2, this.A01);
    }

    private void A03(int i, int i2) {
        AnonymousClass3T1 r2 = this.A0O;
        if (r2 != null) {
            int i3 = i2;
            this.A0f.A0P(r2, (Integer) null, 9, r2.A1f, this.A0O.A0B, this.A0H.A00().size(), i3, i, 0, !A07(), false, A07(), this.A1D);
            this.A0r.A01((C06120Sj) null, this.A0O.A1J, 20);
        }
    }

    private void A04(int i, int i2, boolean z) {
        AnonymousClass3T1 r2 = this.A0O;
        if (r2 != null) {
            this.A0f.A0P(r2, (Integer) null, i, i2, r2.A0B, this.A0H.A00().size(), 0, 0, 0, z, false, A07(), this.A1D);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r8 != null) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05(com.whatsapp.jid.DeviceJid r8, com.whatsapp.jid.Jid r9) {
        /*
            r7 = this;
            boolean r3 = r9 instanceof X.AnonymousClass144
            if (r3 == 0) goto L_0x0007
            r2 = 1
            if (r8 == 0) goto L_0x0027
        L_0x0007:
            r2 = 0
            if (r8 == 0) goto L_0x0027
            r6 = 0
            if (r3 != 0) goto L_0x0028
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "participant cannot be set if the primary jid is not a group or broadcast list"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r0 = r7.retryCount
            if (r0 < 0) goto L_0x0243
            java.lang.String r0 = r7.groupParticipantHash
            if (r0 == 0) goto L_0x0050
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "groupParticipantHash cannot be set to an empty string"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0050:
            java.lang.String r1 = r7.groupParticipantHash
            if (r1 == 0) goto L_0x008c
            if (r3 == 0) goto L_0x0072
            if (r8 == 0) goto L_0x008c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "groupParticipantHash cannot be set if participant is set"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0072:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "groupParticipantHash cannot be set if the primary jid is not a group or broadcast list"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x008c:
            boolean r0 = r7.includeSenderKeysInMessage
            if (r0 == 0) goto L_0x00ac
            if (r3 != 0) goto L_0x00ac
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "includeSenderKeysInMessage cannot be set if the primary jid is not a group or broadcast list"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00ac:
            if (r2 == 0) goto L_0x00d4
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r7.A06()
            if (r0 != 0) goto L_0x00d4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "cannot send e2e message to a group without a participant hash"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00d4:
            long r1 = r7.expireTimeMs
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x00f6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "expireTimeMs must be non-negative"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00f6:
            if (r3 != 0) goto L_0x0118
            com.whatsapp.jid.DeviceJid r0 = r7.A0F     // Catch:{ IllegalArgumentException -> 0x00fe }
            X.C133256Xm.A02(r0)     // Catch:{ IllegalArgumentException -> 0x00fe }
            goto L_0x0118
        L_0x00fe:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "jid is not a valid axolotl address"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0118:
            if (r6 != 0) goto L_0x0138
            X.C133256Xm.A02(r8)     // Catch:{ IllegalArgumentException -> 0x011e }
            goto L_0x0138
        L_0x011e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "participant is not a valid axolotl address"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0138:
            boolean r0 = r9 instanceof X.C177538dx
            byte[] r1 = r7.ephemeralSharedSecret
            if (r0 != 0) goto L_0x0196
            if (r1 != 0) goto L_0x017c
            java.util.HashMap r0 = r7.broadcastParticipantEphemeralSettings
            if (r0 != 0) goto L_0x0162
            java.lang.String r0 = r7.broadcastListName
            if (r0 == 0) goto L_0x019c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "broadcastListName should only be set for a broadcast list jid"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0162:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "broadcastParticipantEphemeralSettings should only be set for a broadcast list jid"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x017c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ephemeralSharedSecret should only be set for a broadcast list jid"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0196:
            java.util.HashMap r0 = r7.broadcastParticipantEphemeralSettings
            if (r1 != 0) goto L_0x01bc
            if (r0 != 0) goto L_0x0229
        L_0x019c:
            boolean r0 = r7.forceSenderKeyDistribution
            if (r0 == 0) goto L_0x01e3
            if (r3 != 0) goto L_0x01c3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "forced sender key distribution can only be used with target devices "
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01bc:
            if (r0 != 0) goto L_0x019c
            int r0 = r7.retryCount
            if (r0 == 0) goto L_0x0229
            goto L_0x019c
        L_0x01c3:
            boolean r0 = r7.A06()
            if (r0 != 0) goto L_0x01e3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "forced sender key distribution can only be used with target devices "
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01e3:
            boolean r0 = r7.forceSenderKeyDistribution
            if (r0 == 0) goto L_0x0209
            X.8SX r0 = r7.A0N
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 != 0) goto L_0x0209
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "missing sender key distribution message "
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0209:
            java.lang.String r4 = r7.jid
            java.lang.String r3 = r7.id
            int r1 = r7.editVersion
            java.lang.String r0 = r7.participant
            X.9UO r2 = new X.9UO
            r2.<init>(r4, r3, r0, r1)
            java.util.concurrent.ConcurrentHashMap r1 = A1E
            monitor-enter(r1)
            boolean r0 = r1.containsKey(r2)     // Catch:{ all -> 0x0226 }
            r7.duplicate = r0     // Catch:{ all -> 0x0226 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0226 }
            r1.put(r2, r0)     // Catch:{ all -> 0x0226 }
            monitor-exit(r1)     // Catch:{ all -> 0x0226 }
            return
        L_0x0226:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0226 }
            throw r0
        L_0x0229:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "both or neither ephemeral parameter should be set for a broadcast list jid"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0243:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "retryCount cannot be negative"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.A05(com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid):void");
    }

    private boolean A06() {
        HashSet hashSet = this.targetDeviceRawJids;
        if (hashSet == null || hashSet.isEmpty()) {
            return false;
        }
        return true;
    }

    private boolean A07() {
        int i = this.messageType;
        if (i == 58 || i == 69 || i == 77 || !A06()) {
            return false;
        }
        return true;
    }

    public boolean A0C() {
        if (!C36401kF.A1U((C19970wo.A00(this.A05) > this.expireTimeMs ? 1 : (C19970wo.A00(this.A05) == this.expireTimeMs ? 0 : -1)))) {
            for (Requirement requirement : this.parameters.requirements) {
                if ((this.A0I == null || (!(requirement instanceof AxolotlSessionRequirement) && !(requirement instanceof AxolotlDifferentAliceBaseKeyRequirement) && !(requirement instanceof AxolotlMultiDeviceSessionRequirement))) && !requirement.BMk()) {
                    if (!(requirement instanceof ChatConnectionRequirement)) {
                        return false;
                    }
                    this.A1D = true;
                    return false;
                } else if (!this.A1A && !this.A1C) {
                    if ((requirement instanceof AxolotlSessionRequirement) || (requirement instanceof AxolotlDifferentAliceBaseKeyRequirement) || (requirement instanceof AxolotlMultiDeviceSessionRequirement)) {
                        this.A1C = true;
                        C19970wo r2 = this.A05;
                        this.A0X = SystemClock.uptimeMillis();
                        this.A0W = C19970wo.A00(r2);
                    }
                }
            }
        }
        return true;
    }

    public void A0E(AnonymousClass3T1 r28, Collection collection, int i, int i2, int i3, int i4, boolean z) {
        long j;
        AnonymousClass3T1 r6 = r28;
        if (r28 != null) {
            if (this.messageSendStartTime != 0 && this.A0Z != 0) {
                C19970wo r0 = this.A05;
                long uptimeMillis = SystemClock.uptimeMillis();
                long A002 = C19970wo.A00(r0) - this.messageSendStartTime;
                int i5 = i;
                if (i5 == 6) {
                    j = this.A0Z;
                } else {
                    j = r6.A1S;
                }
                AnonymousClass1DT r5 = this.A0f;
                int i6 = this.retryCount;
                boolean z2 = this.A1D;
                boolean z3 = this.A1B;
                int i7 = this.A0V;
                Collection collection2 = collection;
                int i8 = i2;
                int i9 = i3;
                int i10 = i4;
                r5.A0Q(r6, collection2, i5, i8, i6, i7, i10, 0, 0, i9, uptimeMillis - j, A002, A002, z2, z3, this.A1A, A07(), z);
            }
        }
    }

    public static final ArrayList A02(AnonymousClass1AL r8, List list) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        int i = 0;
        if (list != null) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!AnonymousClass00C.A0J(C36431kI.A0s(it).A00, "meta")) {
                    i2++;
                } else if (i2 >= 0) {
                    ArrayList A072 = C203399nx.A07(list.get(i2));
                    A072.add(r8);
                    C203399nx A042 = C203399nx.A04("meta", C165577te.A1a(A072, 0));
                    ArrayList A0I3 = AnonymousClass001.A0I();
                    for (Object next : list) {
                        int i3 = i + 1;
                        if (i < 0) {
                            throw C36351kA.A0v();
                        }
                        if (i != i2) {
                            A0I3.add(next);
                        }
                        i = i3;
                    }
                    A0I2.addAll(A0I3);
                    A0I2.add(A042);
                    return A0I2;
                }
            }
        }
        C203399nx.A0E("meta", A0I2, new AnonymousClass1AL[]{r8});
        return A0I2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A0N = AnonymousClass8SX.A0i((byte[]) objectInputStream.readObject());
        } catch (OptionalDataException unused) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("SendE2EMessageJob/e2e missing message bytes ");
            C36321k7.A1Z(A0u2, A01());
        }
        if (this.A0N == null) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("message must not be null");
            throw C90464aC.A0N(A01(), A0u3);
        } else if (this.id != null) {
            Jid A0i2 = C36411kG.A0i(this.jid);
            if (A0i2 != null) {
                this.A0F = DeviceJid.getNullable(this.jid);
                DeviceJid nullable = DeviceJid.getNullable(this.participant);
                this.A1A = true;
                this.A0Z = SystemClock.uptimeMillis();
                A05(nullable, A0i2);
                StringBuilder A0u4 = AnonymousClass000.A0u();
                A0u4.append("SendE2EMessageJob/readObject done: ");
                C36321k7.A1a(A0u4, A01());
                return;
            }
            StringBuilder A0u5 = AnonymousClass000.A0u();
            A0u5.append("jid must not be null");
            throw C90464aC.A0N(A01(), A0u5);
        } else {
            StringBuilder A0u6 = AnonymousClass000.A0u();
            A0u6.append("id must not be null");
            throw C90464aC.A0N(A01(), A0u6);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A0N.A0o());
    }

    public void A09() {
        int i;
        Collection collection;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("SendE2EMessageJob/e2e message send job added");
        C36321k7.A1a(A0u2, A01());
        if (this.duplicate) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("SendE2EMessageJob/e2e messasge job is duplicate, skipping requirement check");
            C36341k9.A1O(A0u3, A01());
            return;
        }
        if (A06()) {
            i = 11;
        } else {
            i = 1;
            if (this.retryCount > 0) {
                i = 12;
            }
        }
        DeviceJid deviceJid = null;
        this.A1C = true;
        for (Requirement requirement : this.parameters.requirements) {
            if (requirement instanceof AxolotlSessionRequirement) {
                AxolotlSessionRequirement axolotlSessionRequirement = (AxolotlSessionRequirement) requirement;
                if (!axolotlSessionRequirement.BMk()) {
                    deviceJid = axolotlSessionRequirement.A00;
                }
            } else if (requirement instanceof AxolotlDifferentAliceBaseKeyRequirement) {
                AxolotlDifferentAliceBaseKeyRequirement axolotlDifferentAliceBaseKeyRequirement = (AxolotlDifferentAliceBaseKeyRequirement) requirement;
                if (!axolotlDifferentAliceBaseKeyRequirement.BMk()) {
                    deviceJid = axolotlDifferentAliceBaseKeyRequirement.A00;
                }
            } else if (requirement instanceof AxolotlMultiDeviceSessionRequirement) {
                AxolotlMultiDeviceSessionRequirement axolotlMultiDeviceSessionRequirement = (AxolotlMultiDeviceSessionRequirement) requirement;
                List<List> A002 = AxolotlMultiDeviceSessionRequirement.A00(axolotlMultiDeviceSessionRequirement);
                if (A002 == null) {
                    collection = Collections.emptySet();
                } else {
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    for (List A0K2 : A002) {
                        A0I2.addAll(C133256Xm.A04(axolotlMultiDeviceSessionRequirement.A01.A0K(A0K2)));
                    }
                    collection = A0I2;
                }
                if (!collection.isEmpty()) {
                    DeviceJid[] deviceJidArr = (DeviceJid[]) collection.toArray(new DeviceJid[0]);
                    this.A1B = true;
                    this.A1C = false;
                    this.A0Y = SystemClock.uptimeMillis();
                    int size = collection.size();
                    this.A0V = size;
                    AnonymousClass1XT r9 = this.A0g;
                    boolean z = axolotlMultiDeviceSessionRequirement instanceof AxolotlMultiDeviceSenderKeyRequirement;
                    Jid jid2 = axolotlMultiDeviceSessionRequirement.A04;
                    if (z) {
                        C222713q r0 = AnonymousClass11F.A00;
                        jid2 = AnonymousClass6H4.A00(jid2);
                        C18740tg.A06(jid2);
                    }
                    r9.A03(deviceJidArr, i, AnonymousClass3UK.A04(jid2), AnonymousClass3UK.A00(size), false);
                }
            } else if (requirement instanceof AxolotlFastRatchetSenderKeyRequirement) {
                if (!((AxolotlFastRatchetSenderKeyRequirement) requirement).BMk()) {
                    this.A0x.A0e();
                }
            } else if (!(requirement instanceof ChatConnectionRequirement)) {
                C19460v5 r1 = this.A0e;
                if (r1.A05()) {
                    r1.A02();
                    throw AnonymousClass001.A0A("isValidVNameRequirementNotFulfilled");
                }
            } else if (!((ChatConnectionRequirement) requirement).BMk()) {
                this.A1D = true;
                if (this.retryCount == 0) {
                    AnonymousClass1JV r5 = this.A14;
                    Log.i("Scheduling job for unsent messages");
                    C21060yb r12 = r5.A00;
                    JobScheduler jobScheduler = r12.A01;
                    if (jobScheduler == null) {
                        jobScheduler = (JobScheduler) C21060yb.A03(r12, "jobscheduler", true);
                        r12.A01 = jobScheduler;
                    }
                    jobScheduler.schedule(new JobInfo.Builder(6, new ComponentName(r5.A01.A00, UnsentMessagesNetworkAvailableJob.class)).setRequiredNetworkType(1).setPersisted(true).build());
                }
            }
        }
        if (deviceJid != null) {
            this.A1B = true;
            this.A1C = false;
            this.A0Y = SystemClock.uptimeMillis();
            this.A0g.A03(new DeviceJid[]{deviceJid}, i, AnonymousClass3UK.A04(deviceJid), 0, false);
        }
        this.A0g.A00();
        if (this.A1B) {
            AnonymousClass1DT r13 = this.A0f;
            int hashCode = this.id.hashCode();
            int i2 = this.messageType;
            if (r13.A0a) {
                r13.A0N.A04(hashCode, 8, -1, i2);
            }
        }
    }

    public void A0A() {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("SendE2EMessageJob/e2e send job canceled");
        C36341k9.A1O(A0u2, A01());
        A1E.remove(new AnonymousClass9UO(this.jid, this.id, this.participant, this.editVersion));
        AnonymousClass8SX r1 = this.A0N;
        if ((r1.bitField1_ & 256) != 0) {
            AnonymousClass8Q4 r0 = r1.keepInChatMessage_;
            if (r0 != null || (r0 = AnonymousClass8Q4.DEFAULT_INSTANCE) != null) {
                AnonymousClass8SW r02 = r0.key_;
                if (r02 == null) {
                    r02 = AnonymousClass8SW.DEFAULT_INSTANCE;
                }
                AnonymousClass11F A0N2 = C36421kH.A0N(r02.remoteJid_);
                if (A0N2 != null) {
                    this.A0M.A02(this.A0F, C165617ti.A0R(A0N2, this.id, true));
                    this.A02.A0H(new C80293vA(this, A0N2, 29));
                }
            }
        }
    }

    public boolean A0D(Exception exc) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("SendE2EMessageJob/exception while sending e2e message");
        C36351kA.A1P(A01(), A0u2, exc);
        try {
            if (exc instanceof EncryptionFailException) {
                this.A0f.A0F(this.id.hashCode(), 7);
                EncryptionFailException encryptionFailException = (EncryptionFailException) exc;
                if (encryptionFailException.encryptionRetryCount > 3) {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append("SendE2EMessageJob/encryption failure limit reached for ");
                    C36331k8.A1P(encryptionFailException.jid, A0u3);
                    AnonymousClass1DT r1 = this.A0f;
                    int hashCode = this.id.hashCode();
                    if (r1.A0a) {
                        AnonymousClass1EE r12 = r1.A0N;
                        if (r12.A01.A02(hashCode)) {
                            r12.A05(hashCode, 3);
                        }
                    }
                    AnonymousClass3T1 r0 = this.A0O;
                    if (r0 != null) {
                        A04(12, r0.A1f, false);
                        return false;
                    }
                } else {
                    StringBuilder A0u4 = AnonymousClass000.A0u();
                    A0u4.append("SendE2EMessageJob/retrying job due to encryption failure for ");
                    A0u4.append(encryptionFailException.jid);
                    A0u4.append("; encRetryCount ");
                    Log.w(C36381kD.A10(A0u4, encryptionFailException.encryptionRetryCount));
                    return true;
                }
            } else if (exc instanceof OutOfMemoryException) {
                StringBuilder A0u5 = AnonymousClass000.A0u();
                A0u5.append("SendE2EMessageJob/Cannot send message due to oom ");
                C36321k7.A1Z(A0u5, A01());
                A03(((OutOfMemoryException) exc).messageDistributionType, 0);
                return false;
            } else if (exc.getCause() instanceof AnonymousClass1WY) {
                StringBuilder A0u6 = AnonymousClass000.A0u();
                A0u6.append("SendE2EMessageJob/Cannot send message due to large payload ");
                C36321k7.A1Z(A0u6, A01());
                A03(this.A0U, ((AnonymousClass1WY) exc.getCause()).excessPayloadByteSize);
                return false;
            } else if (!(exc instanceof UnrecoverableErrorException)) {
                return true;
            } else {
                AnonymousClass3T1 r02 = this.A0O;
                if (r02 != null) {
                    int i = r02.A1f;
                    if (this.A0O != null) {
                        A04(3, i, !A07());
                    }
                    this.A0r.A01((C06120Sj) null, this.A0O.A1J, 20);
                }
            }
            return false;
        } catch (Exception e) {
            Log.e(C36331k8.A0i("SendE2EMessageJob/error handling exception ", AnonymousClass000.A0u(), exc), e);
            return true;
        }
    }

    public void Bqf(Context context) {
        C18800tq A0I2 = C90464aC.A0I(context);
        this.A05 = A0I2.Bvc();
        this.A0C = A0I2.Azp();
        this.A02 = C36351kA.A0M(A0I2);
        this.A01 = A0I2.B3m();
        this.A03 = C36351kA.A0N(A0I2);
        this.A07 = C36351kA.A0a(A0I2);
        this.A18 = (C000100b) A0I2.A6t.get();
        this.A0J = (AnonymousClass1DU) A0I2.A4T.get();
        this.A0y = C36361kB.A0c(A0I2);
        this.A0R = C18840tu.A00(A0I2.A0y);
        this.A0f = (AnonymousClass1DT) A0I2.A55.get();
        this.A0k = (AnonymousClass187) A0I2.A7n.get();
        this.A06 = (AnonymousClass1ER) A0I2.A1h.get();
        this.A0D = (AnonymousClass17E) A0I2.A3I.get();
        this.A0v = (C20520xh) A0I2.A3N.get();
        this.A10 = C36381kD.A0f(A0I2);
        this.A0n = C36371kC.A0Z(A0I2);
        this.A0Q = C36351kA.A0n(A0I2);
        this.A0M = C165577te.A0U(A0I2);
        this.A0A = C36361kB.A0Z(A0I2);
        this.A0m = A0I2.AzU();
        this.A0j = A0I2.AzT();
        this.A17 = (C24961El) A0I2.A9L.get();
        this.A0r = (C28291Sb) A0I2.A5C.get();
        C18830tt r3 = A0I2.AfI.A00;
        this.A15 = (C192649Ia) r3.A3Y.get();
        this.A0z = A0I2.Azb();
        this.A0h = (AnonymousClass1XZ) A0I2.A11.get();
        this.A0B = (C26171Jd) A0I2.A4s.get();
        this.A0p = (AnonymousClass1FE) A0I2.A50.get();
        this.A0i = C36371kC.A0U(A0I2);
        this.A0t = (AnonymousClass1OD) A0I2.A2j.get();
        this.A08 = (C29571Xd) A0I2.A2u.get();
        this.A0s = (AnonymousClass1FN) A0I2.A7D.get();
        this.A16 = (C61883Du) r3.A3Z.get();
        this.A0d = (C19460v5) A0I2.A5w.get();
        this.A0K = (AnonymousClass1FU) A0I2.A2T.get();
        this.A0o = (C232617u) A0I2.A3u.get();
        this.A0g = (AnonymousClass1XT) A0I2.A6b.get();
        this.A04 = C165587tf.A0L(A0I2);
        this.A0x = (AnonymousClass1P5) A0I2.A4V.get();
        this.A0L = (C132166Sm) r3.A1B.get();
        this.A0u = (C194359Pj) A0I2.A32.get();
        this.A0E = (C25121Fb) A0I2.A3K.get();
        this.A19 = C18840tu.A00(A0I2.A5A);
        this.A09 = C36351kA.A0b(A0I2);
        this.A13 = (AnonymousClass12U) A0I2.A7L.get();
        this.A11 = C18830tt.A8a(r3);
        this.A0q = (C25151Fe) A0I2.A51.get();
        this.A14 = (AnonymousClass1JV) A0I2.A5W.get();
        C19470v6 r2 = C19470v6.A00;
        this.A00 = r2;
        this.A0a = r2;
        this.A0c = r2;
        this.A0l = (AnonymousClass96U) r3.A1G.get();
        this.A0S = C18840tu.A00(A0I2.A25);
        this.A0b = r2;
        this.A12 = (AnonymousClass1AW) A0I2.A4H.get();
        this.A0P = (AnonymousClass1EO) A0I2.A4I.get();
        C20810yC r8 = this.A0C;
        C19730wQ r22 = this.A03;
        C000100b r11 = this.A18;
        AnonymousClass005 r12 = this.A0R;
        AnonymousClass1A1 r10 = this.A0Q;
        C26191Jf r9 = this.A0z;
        AnonymousClass1OD r6 = this.A0t;
        this.A0w = new C202969n1(r22, this.A0h, this.A0p, this.A0s, r6, (AnonymousClass1DW) A0I2.A2f.get(), r8, r9, r10, r11, r12);
        this.A0G = new AnonymousClass9Ta(this.encryptionRetryCounts);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX WARNING: type inference failed for: r6v9, types: [org.whispersystems.jobqueue.requirements.Requirement] */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r16v2, types: [com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement] */
    /* JADX WARNING: type inference failed for: r16v3, types: [com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r27 != null) goto L_0x002b;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendE2EMessageJob(X.C19460v5 r26, com.whatsapp.jid.DeviceJid r27, com.whatsapp.jid.Jid r28, com.whatsapp.jid.UserJid r29, com.whatsapp.jid.UserJid r30, X.AnonymousClass8SX r31, java.lang.Integer r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.util.Map r37, java.util.Set r38, byte[] r39, byte[] r40, int r41, int r42, int r43, int r44, long r45, long r47, long r49, long r51, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, boolean r59, boolean r60) {
        /*
            r25 = this;
            r1 = r29
            r3 = r28
            r10 = r3
            r14 = r35
            r20 = r14
            if (r29 != 0) goto L_0x0014
            boolean r0 = r3 instanceof com.whatsapp.jid.DeviceJid
            r1 = r3
            if (r0 == 0) goto L_0x0014
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            com.whatsapp.jid.UserJid r1 = r1.userJid
        L_0x0014:
            if (r60 == 0) goto L_0x003a
            java.lang.String r0 = "LowPriorityMessageJob"
        L_0x0018:
            X.673 r5 = new X.673
            r5.<init>()
            r5.A00 = r0
            X.AnonymousClass673.A00(r5)
            boolean r0 = r3 instanceof X.AnonymousClass144
            r4 = r27
            if (r0 == 0) goto L_0x002b
            r6 = 1
            if (r27 == 0) goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            r12 = r39
            if (r39 == 0) goto L_0x003f
            int r0 = r12.length
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x003a:
            java.lang.String r0 = r1.getRawString()
            goto L_0x0018
        L_0x003f:
            r1 = r38
            r13 = r34
            r11 = r33
            r0 = r41
            r15 = r57
            r8 = r56
            r7 = r59
            r9 = r54
            r2 = r44
            if (r6 == 0) goto L_0x00ab
            if (r39 != 0) goto L_0x01b4
            if (r54 == 0) goto L_0x01ad
            r6 = 8
            boolean r6 = X.C36381kD.A1U(r2, r6)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r6)
            X.13q r6 = X.AnonymousClass11F.A00
            X.144 r17 = X.AnonymousClass6H4.A00(r3)
            if (r59 != 0) goto L_0x006b
            r20 = r13
        L_0x006b:
            com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement r6 = new com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement
            r21 = r1
            r22 = r0
            r23 = r15
            r24 = r7
            r19 = r11
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x007c:
            r5.A02(r6)
        L_0x007f:
            if (r30 == 0) goto L_0x008d
            com.whatsapp.jid.DeviceJid r10 = r30.getPrimaryDevice()
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r6 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r6.<init>(r10)
            r5.A02(r6)
        L_0x008d:
            r6 = r32
            if (r32 == 0) goto L_0x0099
            com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r10 = new com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            r10.<init>()
            r5.A02(r10)
        L_0x0099:
            r10 = r26
            boolean r12 = r10.A05()
            if (r12 == 0) goto L_0x00e3
            r10.A02()
            java.lang.String r0 = "getValidVNameRequirement"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00ab:
            if (r56 == 0) goto L_0x00c9
            r6 = 8
            boolean r6 = X.C36381kD.A1U(r2, r6)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r6)
            X.11F r10 = (X.AnonymousClass11F) r10
            com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement r6 = new com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement
            r16 = r6
            r19 = r11
            r20 = r1
            r21 = r0
            r17 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x007c
        L_0x00c9:
            if (r27 == 0) goto L_0x00cc
            r10 = r4
        L_0x00cc:
            com.whatsapp.jid.DeviceJid r10 = com.whatsapp.jid.DeviceJid.of(r10)
            X.C18740tg.A06(r10)
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r6 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r6.<init>(r10)
            r5.A02(r6)
            if (r39 == 0) goto L_0x007f
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r6 = new com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r6.<init>(r10, r12)
            goto L_0x007c
        L_0x00e3:
            org.whispersystems.jobqueue.JobParameters r12 = r5.A01()
            r5 = r25
            r5.<init>(r12)
            r12 = 0
            r5.A0U = r12
            java.util.HashMap r12 = X.AnonymousClass001.A0J()
            r5.encryptionRetryCounts = r12
            r12 = r31
            X.C18740tg.A06(r12)
            r5.A0N = r12
            X.C18740tg.A05(r11)
            r5.id = r11
            java.lang.String r11 = r3.getRawString()
            r5.jid = r11
            com.whatsapp.jid.DeviceJid r11 = com.whatsapp.jid.DeviceJid.of(r3)
            r5.A0F = r11
            java.lang.String r11 = X.AnonymousClass143.A03(r4)
            r5.participant = r11
            java.lang.String r11 = X.AnonymousClass143.A03(r29)
            r5.recipientRawJid = r11
            java.util.HashSet r11 = X.C36441kJ.A16()
            X.AnonymousClass143.A0C(r1, r11)
            r5.targetDeviceRawJids = r11
            r5.messageType = r0
            r0 = r42
            r5.retryCount = r0
            r0 = r53
            r5.A1D = r0
            r0 = r45
            r5.A0Z = r0
            r5.groupParticipantHash = r13
            r5.groupParticipantUserHash = r14
            r5.includeSenderKeysInMessage = r9
            r0 = r47
            r5.expireTimeMs = r0
            r0 = r49
            r5.messageSendStartTime = r0
            r0 = r51
            r5.originalTimestamp = r0
            r0 = r43
            r5.originationFlags = r0
            r5.editVersion = r2
            r5.liveLocationDuration = r6
            r0 = r55
            r5.useOneOneEncryptionOnPHashMismatch = r0
            r5.multiDeviceFanOut = r8
            r5.useLidForEncryption = r15
            r0 = r40
            r5.ephemeralSharedSecret = r0
            r5.A0e = r10
            if (r37 == 0) goto L_0x0186
            java.util.Set r0 = r37.entrySet()
            java.util.HashMap r8 = X.AnonymousClass001.A0J()
            if (r0 == 0) goto L_0x0187
            java.util.Iterator r6 = r0.iterator()
        L_0x0168:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0187
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r6)
            java.lang.Object r0 = r2.getKey()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x0168
            java.lang.String r1 = r0.getRawString()
            java.lang.Object r0 = r2.getValue()
            r8.put(r1, r0)
            goto L_0x0168
        L_0x0186:
            r8 = 0
        L_0x0187:
            r5.broadcastParticipantEphemeralSettings = r8
            r0 = r36
            r5.broadcastListName = r0
            r0 = r58
            r5.forceSenderKeyDistribution = r0
            r5.useParticipantUserHash = r7
            java.lang.String r0 = X.AnonymousClass143.A03(r30)
            r5.botInvokeRawJid = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SendE2EMessageJob/e2e message send job created"
            r1.append(r0)
            java.lang.String r0 = r5.A01()
            X.C36321k7.A1a(r1, r0)
            r5.A05(r4, r3)
            return
        L_0x01ad:
            java.lang.String r0 = "cannot use group encryption without including sender key in message"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x01b4:
            java.lang.String r0 = "cannot use group encryption and old alice base key simultaneously"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.<init>(X.0v5, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid, com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid, X.8SX, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Set, byte[], byte[], int, int, int, int, long, long, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v55, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v69, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v7, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v8, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v9, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v10, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r7v95, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r7v96 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 1442 */
    /* JADX WARNING: Code restructure failed: missing block: B:1014:0x1502, code lost:
        r11.addAll(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1106:0x17c8, code lost:
        if (r4 != null) goto L_0x17ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1120:0x1808, code lost:
        if (r4 == null) goto L_0x1813;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1121:0x180a, code lost:
        if (r3 == null) goto L_0x1813;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1122:0x180c, code lost:
        r6 = new X.C1270266q(r8, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1123:0x1813, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1144:0x1855, code lost:
        if (X.AnonymousClass143.A0G(r37) != false) goto L_0x1857;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1292:?, code lost:
        r2 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException(r8, r3.A00(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1297:0x1b4a, code lost:
        com.whatsapp.util.Log.e("sende2emessagejob/missing broadcast setting");
        r1 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException(r7, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1299:?, code lost:
        r2 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException(r5, r3.A00(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1323:0x1bdd, code lost:
        if (r0.includeSenderKeysInMessage == false) goto L_0x1bdf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0283, code lost:
        if (r2 == X.AnonymousClass916.A02) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x04fe, code lost:
        if ((!r1.A0P(r12)) != false) goto L_0x0559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0557, code lost:
        if ((!r7.equals(r1)) != false) goto L_0x0559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0566, code lost:
        if (r20 != null) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x075a, code lost:
        if (r8.getDevice() != 0) goto L_0x0760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x075c, code lost:
        if (r11 == false) goto L_0x0760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0760, code lost:
        X.C36321k7.A1J(r8, "sende2emessagejob/encryptMessages/dropping message due to encryption failure for ", X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x076e, code lost:
        if (r6.isEmpty() != false) goto L_0x0785;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0774, code lost:
        if (r9.isEmpty() == false) goto L_0x0785;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0776, code lost:
        com.whatsapp.util.Log.e("sende2emessagejob/encryptMessages/no encrypted messages due to encryption failures");
        r2 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException((com.whatsapp.jid.DeviceJid) null, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0785, code lost:
        r2 = X.AnonymousClass000.A0u();
        r2.append("messages encrypted: ");
        r5.A02(X.C36381kD.A10(r2, r9.size()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:?, code lost:
        r5.A01();
        r5 = new X.AnonymousClass9KL((java.util.List) null, r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0814, code lost:
        if (r67.A0N(r7) == false) goto L_0x0818;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0816, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0818, code lost:
        r9 = r7.userJid;
        r1 = (X.C80103un) r5.get(r9.getPrimaryDevice().getRawString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0828, code lost:
        if (r1 == null) goto L_0x1b4a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x082a, code lost:
        r1 = r29.A00(r8, r9, r49, r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0838, code lost:
        if (r1 != null) goto L_0x084a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x083a, code lost:
        com.whatsapp.util.Log.e("sende2emessagejob/failed to encrypt broadcast setting");
        r1 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException(r7, r3.A00(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x084a, code lost:
        r10.put(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x08b2, code lost:
        if (r67.A0N(r8) == false) goto L_0x08b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0a76, code lost:
        if (r5.getDevice() != 0) goto L_0x0a7c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0a78, code lost:
        if (r8 == false) goto L_0x0a7c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0a7c, code lost:
        X.C36321k7.A1J(r5, "sende2emessagejob/encryptMessages/dropping message due to encryption failure for ", X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0112, code lost:
        if ((r1.bitField0_ & 2) != 0) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0c09, code lost:
        if (((X.AnonymousClass1HX) r0.A0R.get()).A05(r37, r0.messageType) == false) goto L_0x0c0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:804:0x107e, code lost:
        if (X.AnonymousClass143.A0G(r30) != false) goto L_0x1080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:885:0x11ea, code lost:
        if (r9 == null) goto L_0x11ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:975:0x1436, code lost:
        r10.addAll(r7);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1048:0x161c A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1061:0x164f A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1064:0x166e A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1068:0x16c8 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1077:0x1730 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01e2 A[Catch:{ RuntimeException -> 0x1c07 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1084:0x1753 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1098:0x17a5 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1131:0x1823 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1135:0x1831 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1149:0x186c A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1151:0x1887 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1185:0x1920 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1195:0x196c A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1198:0x198e A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1203:0x19a5 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1278:0x1aef A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04d7 A[Catch:{ RuntimeException -> 0x1c07 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0504 A[Catch:{ RuntimeException -> 0x1c07 }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0564 A[Catch:{ RuntimeException -> 0x1c07 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x056e A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0576 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0584 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0752 A[Catch:{ all -> 0x1b45 }, LOOP:6: B:371:0x0705->B:385:0x0752, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0756 A[Catch:{ all -> 0x1b45 }, EDGE_INSN: B:386:0x0756->B:387:0x075a ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fc A[Catch:{ RuntimeException -> 0x1c07 }] */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x0a6e A[Catch:{ all -> 0x1b60 }, LOOP:15: B:490:0x0a1f->B:504:0x0a6e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x0a72 A[Catch:{ all -> 0x1b60 }, EDGE_INSN: B:505:0x0a72->B:506:0x0a76 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x0ad2 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:538:0x0b15 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:645:0x0d5e A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:646:0x0d66 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:648:0x0d6a A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:651:0x0d73 A[ADDED_TO_REGION, Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:709:0x0ed5 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:710:0x0ed8 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:713:0x0ef1 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:714:0x0ef3 A[ADDED_TO_REGION, Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0157 A[Catch:{ RuntimeException -> 0x1c07 }] */
    /* JADX WARNING: Removed duplicated region for block: B:753:0x0fca A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:755:0x0fd0 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:756:0x0fd1 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:768:0x1013 A[ADDED_TO_REGION, Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:781:0x103e A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:806:0x1082 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0179 A[Catch:{ RuntimeException -> 0x1c07 }] */
    /* JADX WARNING: Removed duplicated region for block: B:846:0x1122 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:851:0x1131 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:852:0x113c A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:878:0x11d6 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:881:0x11de A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:902:0x1225 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:913:0x124d A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:916:0x1258 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:924:0x1311 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:925:0x131c A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:927:0x1323 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:928:0x1327 A[Catch:{ Exception -> 0x1af6, OutOfMemoryError -> 0x1b74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b0 A[Catch:{ RuntimeException -> 0x1c07 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r76 = this;
            java.lang.String r41 = "-"
            java.lang.String r40 = "SendE2EMessageJob/onRun/out of memory sending message: "
            long r21 = android.os.SystemClock.uptimeMillis()
            r0 = r76
            long r2 = r0.A0Z
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0016
            r1 = r21
            r0.A0Z = r1
        L_0x0016:
            java.lang.String r39 = r0.A01()
            boolean r1 = r0.duplicate
            if (r1 == 0) goto L_0x002a
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "SendE2EMessageJob/e2e messasge job is duplicate skipping"
            r0 = r39
            X.C36321k7.A1R(r1, r0, r2)
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r2 = r0.jid     // Catch:{ RuntimeException -> 0x1c07 }
            X.13o r1 = com.whatsapp.jid.Jid.Companion     // Catch:{ RuntimeException -> 0x1c07 }
            com.whatsapp.jid.Jid r37 = X.C222513o.A00(r2)     // Catch:{ RuntimeException -> 0x1c07 }
            X.11F r30 = X.AnonymousClass143.A00(r37)     // Catch:{ RuntimeException -> 0x1c07 }
            X.C18740tg.A06(r30)     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r30
            boolean r1 = r1 instanceof X.C28981Uw     // Catch:{ RuntimeException -> 0x1c07 }
            r4 = 0
            r3 = 0
            if (r1 == 0) goto L_0x004a
            X.0wN r2 = r0.A01     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = "cant use sende2emessagejob for this jid"
            r2.A0E(r1, r3, r4)     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x026d
        L_0x004a:
            java.lang.String r1 = r0.participant     // Catch:{ RuntimeException -> 0x1c07 }
            com.whatsapp.jid.DeviceJid r20 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = r0.recipientRawJid     // Catch:{ RuntimeException -> 0x1c07 }
            com.whatsapp.jid.UserJid r26 = X.C36431kI.A0l(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = r0.participant     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0063
            com.whatsapp.jid.DeviceJid r1 = r0.A0F     // Catch:{ RuntimeException -> 0x1c07 }
            r24 = r1
            goto L_0x0065
        L_0x0063:
            r24 = r20
        L_0x0065:
            r3 = 1
            if (r26 == 0) goto L_0x0084
            com.whatsapp.jid.DeviceJid r1 = r0.A0F     // Catch:{ RuntimeException -> 0x1c07 }
            X.C18740tg.A06(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            com.whatsapp.jid.UserJid r2 = r1.userJid     // Catch:{ RuntimeException -> 0x1c07 }
            X.0wQ r1 = r0.A03     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = r1.A0M(r2)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x0095
            boolean r1 = X.C197029b1.A00(r30)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x0095
            java.lang.String r1 = "SendE2EMessageJob/cannot send e2e message with recipient other than own devices"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x026e
        L_0x0084:
            int r2 = r0.editVersion     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 8
            boolean r3 = X.C36381kD.A1U(r2, r1)
            java.lang.String r2 = r0.id     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r30
            X.3Qa r33 = X.C165617ti.A0R(r1, r2, r3)     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x009d
        L_0x0095:
            java.lang.String r2 = r0.id     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r26
            X.3Qa r33 = X.C165617ti.A0R(r1, r2, r3)     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x009d:
            X.005 r6 = r0.A0R     // Catch:{ RuntimeException -> 0x1c07 }
            X.1FN r5 = r0.A0s     // Catch:{ RuntimeException -> 0x1c07 }
            X.1Fe r4 = r0.A0q     // Catch:{ RuntimeException -> 0x1c07 }
            int r3 = r0.messageType     // Catch:{ RuntimeException -> 0x1c07 }
            java.util.HashSet r2 = r0.targetDeviceRawJids     // Catch:{ RuntimeException -> 0x1c07 }
            X.64Y r1 = new X.64Y     // Catch:{ RuntimeException -> 0x1c07 }
            r7 = r1
            r8 = r4
            r9 = r5
            r10 = r37
            r11 = r33
            r12 = r6
            r13 = r2
            r14 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ RuntimeException -> 0x1c07 }
            r0.A0H = r1     // Catch:{ RuntimeException -> 0x1c07 }
            X.8SX r4 = r0.A0N     // Catch:{ RuntimeException -> 0x1c07 }
            X.0yC r2 = r0.A0C     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 1
            X.AnonymousClass00C.A0D(r2, r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r4 == 0) goto L_0x00d5
            int r3 = r4.bitField1_     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r3 & 16
            if (r1 != 0) goto L_0x0114
            r1 = r3 & 4096(0x1000, float:5.74E-42)
            if (r1 != 0) goto L_0x0114
            r1 = r3 & 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x0114
            r1 = r3 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0123
            goto L_0x0108
        L_0x00d5:
            X.1A1 r2 = r0.A0Q     // Catch:{ RuntimeException -> 0x1c07 }
            X.3T1 r6 = r2.A03(r11)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r6 == 0) goto L_0x0114
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r1 = r6.A1T(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x00f8
            X.3Kx r1 = r6.A0P()     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x00f8
            X.1Fb r4 = r0.A0E     // Catch:{ RuntimeException -> 0x1c07 }
            X.02c r3 = X.C004702c.A00     // Catch:{ RuntimeException -> 0x1c07 }
            r2 = 0
            X.3IP r1 = new X.3IP     // Catch:{ RuntimeException -> 0x1c07 }
            r1.<init>(r3, r2)     // Catch:{ RuntimeException -> 0x1c07 }
            r4.A00(r1, r6)     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x00f8:
            boolean r1 = r6 instanceof X.C46732ba     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0141
            X.1Xd r1 = r0.A08     // Catch:{ RuntimeException -> 0x1c07 }
            X.2ba r6 = (X.C46732ba) r6     // Catch:{ RuntimeException -> 0x1c07 }
            X.3T1 r6 = r1.A01(r6)     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 1
            r0.A0T = r1     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x0141
        L_0x0108:
            X.8Qj r1 = r4.pollUpdateMessage_     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x010e
            X.8Qj r1 = X.C173098Qj.DEFAULT_INSTANCE     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x010e:
            int r1 = r1.bitField0_     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0123
        L_0x0114:
            X.1Jd r2 = r0.A0B     // Catch:{ RuntimeException -> 0x1c07 }
            X.2bM r6 = r2.A0B(r11)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r6 != 0) goto L_0x00f8
            int r3 = r0.messageType     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 58
            if (r3 == r1) goto L_0x0139
            goto L_0x0131
        L_0x0123:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 & r1
            if (r3 == 0) goto L_0x00d5
            r1 = 4164(0x1044, float:5.835E-42)
            boolean r1 = r2.A0E(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x00d5
            goto L_0x0114
        L_0x0131:
            r1 = 69
            if (r3 == r1) goto L_0x0139
            r1 = 77
            if (r3 != r1) goto L_0x00f8
        L_0x0139:
            X.17E r4 = r0.A0D     // Catch:{ RuntimeException -> 0x1c07 }
            long r1 = r0.messageSendStartTime     // Catch:{ RuntimeException -> 0x1c07 }
            X.3T1 r6 = r4.A00(r11, r3, r1)     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x0141:
            if (r6 == 0) goto L_0x016f
            X.0yC r2 = r0.A0C     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 5623(0x15f7, float:7.88E-42)
            boolean r1 = r2.A0E(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x016f
            X.3Qa r1 = r6.A1J     // Catch:{ RuntimeException -> 0x1c07 }
            X.11F r2 = r1.A00     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = X.AnonymousClass143.A0I(r2)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x016f
            X.12q r1 = r0.A07     // Catch:{ RuntimeException -> 0x1c07 }
            X.3Qp r1 = X.C36371kC.A0W(r1, r2)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0163
            X.2oy r1 = r1.A0Z     // Catch:{ RuntimeException -> 0x1c07 }
            r6.A0L = r1     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x0163:
            X.2oy r1 = r6.A0L     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x016f
            X.1ER r1 = r0.A06     // Catch:{ RuntimeException -> 0x1c07 }
            X.2oy r1 = r1.A00(r2)     // Catch:{ RuntimeException -> 0x1c07 }
            r6.A0L = r1     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x016f:
            r0.A0O = r6     // Catch:{ RuntimeException -> 0x1c07 }
            X.9Ia r5 = r0.A15     // Catch:{ RuntimeException -> 0x1c07 }
            r4 = r10
            r3 = 1
            boolean r1 = r10 instanceof X.C223313w     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x0186
            boolean r1 = r10 instanceof X.C177508du     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0189
            X.8du r4 = (X.C177508du) r4     // Catch:{ RuntimeException -> 0x1c07 }
            com.whatsapp.jid.UserJid r4 = r4.userJid     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.AnonymousClass00C.A0E(r4, r1)     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x0186:
            X.13w r4 = (X.C223313w) r4     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x018a
        L_0x0189:
            r4 = 0
        L_0x018a:
            r32 = 0
            if (r4 == 0) goto L_0x019c
            if (r6 == 0) goto L_0x01cb
            int r2 = r6.A1I     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 73
            if (r2 == r1) goto L_0x019c
            X.2oy r2 = r6.A0L     // Catch:{ RuntimeException -> 0x1c07 }
            X.2oy r1 = X.C52152oy.USERNAME     // Catch:{ RuntimeException -> 0x1c07 }
            if (r2 != r1) goto L_0x01cb
        L_0x019c:
            X.3Du r3 = r0.A16     // Catch:{ RuntimeException -> 0x1c07 }
            X.3T1 r2 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r34 = r3.A00(r10, r2, r11)     // Catch:{ RuntimeException -> 0x1c07 }
            X.8SX r1 = r0.A0N     // Catch:{ RuntimeException -> 0x1c07 }
            int r1 = r1.bitField0_     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 != 0) goto L_0x01e2
            X.3T1 r1 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x01e2
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r2 = "SendE2EMessageJob/e2e message was deleted from message store"
            r1 = r39
            X.C36321k7.A1Q(r2, r1, r3)     // Catch:{ RuntimeException -> 0x1c07 }
            X.8SX r2 = r0.A0N     // Catch:{ RuntimeException -> 0x1c07 }
            int r1 = r2.bitField1_     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0029
            X.8Q4 r2 = r2.keepInChatMessage_     // Catch:{ RuntimeException -> 0x1c07 }
            if (r2 != 0) goto L_0x0271
            X.8Q4 r2 = X.AnonymousClass8Q4.DEFAULT_INSTANCE     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x026f
        L_0x01cb:
            boolean r1 = r11.A02     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x019c
            X.1FV r1 = r5.A01     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.Boolean r1 = r1.A06(r4)     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = X.C36371kC.A1X(r1, r3)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x019c
            X.12O r1 = r5.A00     // Catch:{ RuntimeException -> 0x1c07 }
            com.whatsapp.jid.PhoneUserJid r32 = r1.A0A(r4)     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x019c
        L_0x01e2:
            X.3T1 r4 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            if (r4 == 0) goto L_0x01fe
            boolean r1 = r4 instanceof X.AnonymousClass2bZ     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x01fe
            r1 = r4
            X.2bZ r1 = (X.AnonymousClass2bZ) r1     // Catch:{ RuntimeException -> 0x1c07 }
            X.9uk r3 = r1.A00     // Catch:{ RuntimeException -> 0x1c07 }
            if (r3 == 0) goto L_0x01fe
            X.9ui r2 = r3.A01     // Catch:{ RuntimeException -> 0x1c07 }
            if (r2 == 0) goto L_0x01fc
            java.lang.String r1 = r2.A03     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x01fc
            r1 = 0
            r2.A03 = r1     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x01fc:
            r3.A01 = r2     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x01fe:
            if (r4 == 0) goto L_0x0201
            goto L_0x0204
        L_0x0201:
            r27 = 0
            goto L_0x0218
        L_0x0204:
            boolean r1 = r0.A0T     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x0201
            boolean r1 = r4 instanceof X.AnonymousClass2bM     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x0201
            boolean r1 = r4 instanceof X.AnonymousClass0p5     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x0201
            X.0xM r1 = r0.A0n     // Catch:{ RuntimeException -> 0x1c07 }
            X.1FT r1 = r1.A0k     // Catch:{ RuntimeException -> 0x1c07 }
            int r27 = r1.A01(r4)     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x0218:
            X.0wo r1 = r0.A05     // Catch:{ RuntimeException -> 0x1c07 }
            long r4 = X.C19970wo.A00(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            long r1 = r0.expireTimeMs     // Catch:{ RuntimeException -> 0x1c07 }
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x0240
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r2 = "SendE2EMessageJob/e2e message send job expired"
            r1 = r39
            X.C36321k7.A1Q(r2, r1, r3)     // Catch:{ RuntimeException -> 0x1c07 }
            X.3T1 r1 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0029
            r3 = 5
            boolean r1 = r0.A07()     // Catch:{ RuntimeException -> 0x1c07 }
            r2 = r1 ^ 1
            r1 = r27
            r0.A04(r3, r1, r2)     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x029b
        L_0x0240:
            X.3T1 r3 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            if (r3 == 0) goto L_0x029d
            X.0wo r1 = r0.A05     // Catch:{ RuntimeException -> 0x1c07 }
            long r1 = X.C19970wo.A00(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = X.C66013Ui.A0v(r3, r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x029d
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r2 = "SendE2EMessageJob/e2e message is ephemerally expired"
            r1 = r39
            X.C36321k7.A1Q(r2, r1, r3)     // Catch:{ RuntimeException -> 0x1c07 }
            r3 = 15
            X.3T1 r1 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0029
            boolean r1 = r0.A07()     // Catch:{ RuntimeException -> 0x1c07 }
            r2 = r1 ^ 1
            r1 = r27
            r0.A04(r3, r1, r2)     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x029c
        L_0x026d:
            return
        L_0x026e:
            return
        L_0x026f:
            if (r2 == 0) goto L_0x0285
        L_0x0271:
            int r1 = r2.bitField0_     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0287
            int r1 = r2.keepType_     // Catch:{ RuntimeException -> 0x1c07 }
            X.916 r2 = X.AnonymousClass916.A00(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r2 != 0) goto L_0x0281
            X.916 r2 = X.AnonymousClass916.UNKNOWN     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x0281:
            X.916 r1 = X.AnonymousClass916.UNDO_KEEP_FOR_ALL     // Catch:{ RuntimeException -> 0x1c07 }
            if (r2 != r1) goto L_0x0287
        L_0x0285:
            r5 = 1
            goto L_0x0288
        L_0x0287:
            r5 = 0
        L_0x0288:
            X.0wN r4 = r0.A01     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r3 = "SendE2EMessageJob/unkeep-failed-msg-deleted"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = "isUnkeep? "
            java.lang.String r2 = X.C36371kC.A0z(r1, r2, r5)     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 0
            r4.A0E(r3, r2, r1)     // Catch:{ RuntimeException -> 0x1c07 }
            return
        L_0x029b:
            return
        L_0x029c:
            return
        L_0x029d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = "SendE2EMessageJob/running e2e message send job"
            r3 = r39
            X.C36321k7.A1Q(r1, r3, r2)     // Catch:{ RuntimeException -> 0x1c07 }
            int r2 = r0.retryCount     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 4
            if (r2 <= r1) goto L_0x02b9
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r2 = "SendE2EMessageJob/aborting e2e message send job due to high retry count"
            r1 = r39
            X.C36321k7.A1R(r2, r1, r3)     // Catch:{ RuntimeException -> 0x1c07 }
            return
        L_0x02b9:
            X.64Y r1 = r0.A0H     // Catch:{ RuntimeException -> 0x1c07 }
            java.util.Set r38 = r1.A00()     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = r0.A06()     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x02d7
            boolean r1 = r38.isEmpty()     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x02d7
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r2 = "SendE2EMessageJob/aborting e2e message send job due to empty target devices"
            r1 = r39
            X.C36321k7.A1R(r2, r1, r3)     // Catch:{ RuntimeException -> 0x1c07 }
            return
        L_0x02d7:
            X.0wQ r2 = r0.A03     // Catch:{ RuntimeException -> 0x1c07 }
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r30)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x02f9
            com.whatsapp.jid.UserJid r1 = r1.userJid     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = r2.A0M(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x02f9
            boolean r1 = r38.isEmpty()     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x02f9
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r2 = "SendE2EMessageJob/aborting e2e message send job due to empty deviceEncryptedMessages for self-thread"
            r1 = r39
            X.C36321k7.A1R(r2, r1, r3)     // Catch:{ RuntimeException -> 0x1c07 }
            return
        L_0x02f9:
            X.3T1 r3 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = X.AnonymousClass9ZV.A01(r30)     // Catch:{ RuntimeException -> 0x1c07 }
            r4 = 0
            if (r1 == 0) goto L_0x033c
            r1 = r38
            X.AnonymousClass00C.A0D(r1, r4)     // Catch:{ RuntimeException -> 0x1c07 }
            X.9ww r1 = X.C207759ww.A00     // Catch:{ RuntimeException -> 0x1c07 }
            r2 = r38
            boolean r1 = X.AnonymousClass6XG.A02(r1, r2)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x033c
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = "msg_send: "
            r2.append(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r3 == 0) goto L_0x0323
            int r1 = r3.A1I     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x0325
        L_0x0323:
            java.lang.String r1 = "null"
        L_0x0325:
            r2.append(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = ";"
            r2.append(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            int r1 = r30.getType()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r3 = X.C36381kD.A10(r2, r1)     // Catch:{ RuntimeException -> 0x1c07 }
            X.0wN r2 = r0.A01     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = "unexpected-hosted-device"
            r2.A0E(r1, r3, r4)     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x033c:
            boolean r1 = r0.A1B     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x034d
            X.1DT r3 = r0.A0f     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = r0.id     // Catch:{ RuntimeException -> 0x1c07 }
            int r2 = r1.hashCode()     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 8
            r3.A0F(r2, r1)     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x034d:
            X.1DT r2 = r0.A0f     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = r0.id     // Catch:{ RuntimeException -> 0x1c07 }
            int r5 = r1.hashCode()     // Catch:{ RuntimeException -> 0x1c07 }
            X.3T1 r1 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x039d
            int r4 = r1.A1I     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x035b:
            r3 = 7
            boolean r1 = r2.A0a     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0366
            X.1EE r2 = r2.A0N     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = -1
            r2.A04(r5, r3, r1, r4)     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x0366:
            r6 = r10
            r7 = r26
            r5 = r20
            java.lang.String r1 = r11.A01     // Catch:{ RuntimeException -> 0x1c07 }
            r69 = r1
            int r1 = r0.editVersion     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x039b
            java.lang.String r4 = java.lang.Integer.toString(r1)     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x0377:
            X.005 r1 = r0.A0R     // Catch:{ RuntimeException -> 0x1c07 }
            r1.get()     // Catch:{ RuntimeException -> 0x1c07 }
            X.11F r1 = r11.A00     // Catch:{ RuntimeException -> 0x1c07 }
            r75 = r1
            X.3T1 r3 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            r2 = 0
            X.AnonymousClass00C.A0D(r1, r2)     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = r3 instanceof X.C180828mU     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x03cf
            X.11F r1 = X.C222713q.A00(r75)     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = X.C197029b1.A00(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x03cf
            boolean r1 = X.AnonymousClass143.A0G(r75)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x03cf
            goto L_0x03a0
        L_0x039b:
            r4 = 0
            goto L_0x0377
        L_0x039d:
            int r4 = r0.messageType     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x035b
        L_0x03a0:
            if (r20 != 0) goto L_0x03cf
            X.005 r1 = r0.A0R     // Catch:{ RuntimeException -> 0x1c07 }
            r1.get()     // Catch:{ RuntimeException -> 0x1c07 }
            X.3T1 r2 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = r2 instanceof X.C180828mU     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x03cf
            X.8mU r2 = (X.C180828mU) r2     // Catch:{ RuntimeException -> 0x1c07 }
            if (r2 == 0) goto L_0x03cf
            X.3Qa r2 = r2.A03     // Catch:{ RuntimeException -> 0x1c07 }
            if (r2 == 0) goto L_0x03cf
            X.1A1 r1 = r0.A0Q     // Catch:{ RuntimeException -> 0x1c07 }
            X.3T1 r2 = r1.A03(r2)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r2 == 0) goto L_0x03cf
            com.whatsapp.jid.UserJid r1 = r2.A0L()     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x03cf
            com.whatsapp.jid.UserJid r1 = r2.A0L()     // Catch:{ RuntimeException -> 0x1c07 }
            com.whatsapp.jid.DeviceJid r5 = r1.getPrimaryDevice()     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x03cf:
            X.005 r1 = r0.A0R     // Catch:{ RuntimeException -> 0x1c07 }
            r1.get()     // Catch:{ RuntimeException -> 0x1c07 }
            int r2 = r0.retryCount     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 1
            r3 = r30
            X.AnonymousClass00C.A0D(r3, r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r2 <= 0) goto L_0x03f2
            if (r26 == 0) goto L_0x03e6
            boolean r1 = X.C197029b1.A00(r30)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x03f0
        L_0x03e6:
            if (r5 == 0) goto L_0x03f2
            com.whatsapp.jid.UserJid r1 = r5.userJid     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = X.C197029b1.A00(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x03f2
        L_0x03f0:
            r1 = 1
            goto L_0x03f3
        L_0x03f2:
            r1 = 0
        L_0x03f3:
            java.lang.String r2 = "message"
            if (r1 == 0) goto L_0x040e
            boolean r1 = X.AnonymousClass143.A0G(r75)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x03ff
            r7 = r10
            r6 = r5
        L_0x03ff:
            X.9YT r1 = X.AnonymousClass9YT.A00(r7)     // Catch:{ RuntimeException -> 0x1c07 }
            r1.A05 = r2     // Catch:{ RuntimeException -> 0x1c07 }
            r2 = r69
            r1.A07 = r2     // Catch:{ RuntimeException -> 0x1c07 }
            r1.A06 = r4     // Catch:{ RuntimeException -> 0x1c07 }
            r1.A01 = r6     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x041e
        L_0x040e:
            X.9YT r1 = X.AnonymousClass9YT.A00(r37)     // Catch:{ RuntimeException -> 0x1c07 }
            r1.A05 = r2     // Catch:{ RuntimeException -> 0x1c07 }
            r2 = r69
            r1.A07 = r2     // Catch:{ RuntimeException -> 0x1c07 }
            r1.A01 = r5     // Catch:{ RuntimeException -> 0x1c07 }
            r1.A03 = r7     // Catch:{ RuntimeException -> 0x1c07 }
            r1.A06 = r4     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x041e:
            X.9uj r36 = r1.A01()     // Catch:{ RuntimeException -> 0x1c07 }
            X.0yC r1 = r0.A0C     // Catch:{ RuntimeException -> 0x1c07 }
            r68 = r1
            X.0wN r1 = r0.A01     // Catch:{ RuntimeException -> 0x1c07 }
            r31 = r1
            X.0wQ r1 = r0.A03     // Catch:{ RuntimeException -> 0x1c07 }
            r67 = r1
            X.1DT r1 = r0.A0f     // Catch:{ RuntimeException -> 0x1c07 }
            r66 = r1
            X.005 r1 = r0.A0R     // Catch:{ RuntimeException -> 0x1c07 }
            r65 = r1
            X.1A1 r1 = r0.A0Q     // Catch:{ RuntimeException -> 0x1c07 }
            r64 = r1
            X.9n1 r1 = r0.A0w     // Catch:{ RuntimeException -> 0x1c07 }
            r63 = r1
            X.189 r4 = r0.A0j     // Catch:{ RuntimeException -> 0x1c07 }
            X.1OD r2 = r0.A0t     // Catch:{ RuntimeException -> 0x1c07 }
            X.9Pj r1 = r0.A0u     // Catch:{ RuntimeException -> 0x1c07 }
            r29 = r1
            X.17X r1 = r0.A09     // Catch:{ RuntimeException -> 0x1c07 }
            r62 = r1
            X.0v5 r8 = r0.A00     // Catch:{ RuntimeException -> 0x1c07 }
            X.64Y r1 = r0.A0H     // Catch:{ RuntimeException -> 0x1c07 }
            r61 = r1
            java.lang.String r1 = r0.jid     // Catch:{ RuntimeException -> 0x1c07 }
            r60 = r1
            java.lang.String r1 = r0.recipientRawJid     // Catch:{ RuntimeException -> 0x1c07 }
            r59 = r1
            X.3T1 r1 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            r19 = r1
            X.8SX r1 = r0.A0N     // Catch:{ RuntimeException -> 0x1c07 }
            r58 = r1
            byte[] r6 = r0.ephemeralSharedSecret     // Catch:{ RuntimeException -> 0x1c07 }
            java.util.HashMap r5 = r0.broadcastParticipantEphemeralSettings     // Catch:{ RuntimeException -> 0x1c07 }
            X.9Ta r3 = r0.A0G     // Catch:{ RuntimeException -> 0x1c07 }
            int r1 = r0.retryCount     // Catch:{ RuntimeException -> 0x1c07 }
            r23 = r1
            int r1 = r0.editVersion     // Catch:{ RuntimeException -> 0x1c07 }
            r57 = r1
            boolean r1 = r0.useLidForEncryption     // Catch:{ RuntimeException -> 0x1c07 }
            r18 = r1
            r35 = 0
            com.whatsapp.jid.Jid r45 = X.C36411kG.A0i(r60)     // Catch:{ RuntimeException -> 0x1c07 }
            X.9KM r1 = r0.A0I     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0487
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r7 = "SendE2EMessageJob/reusing encrypted payloads from previous run for job:"
            r1 = r39
            X.C36321k7.A1Q(r7, r1, r9)     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x0487:
            X.3T1 r12 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            if (r12 == 0) goto L_0x04c2
            boolean r1 = r0.A0T     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x04c2
            boolean r1 = r12 instanceof X.AnonymousClass2bM     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x04c2
            boolean r1 = r12 instanceof X.AnonymousClass0p5     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x04c2
            X.0xM r11 = r0.A0n     // Catch:{ RuntimeException -> 0x1c07 }
            int r10 = r27 + 1
            r12.A1f = r10     // Catch:{ RuntimeException -> 0x1c07 }
            X.1C7 r9 = r11.A0F     // Catch:{ RuntimeException -> 0x1c07 }
            r7 = 18
            X.1iP r1 = new X.1iP     // Catch:{ RuntimeException -> 0x1c07 }
            r1.<init>((java.lang.Object) r11, (int) r10, (int) r7, (java.lang.Object) r12)     // Catch:{ RuntimeException -> 0x1c07 }
            r7 = 24
            r9.A01(r1, r7)     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x04ab:
            X.0yC r13 = r0.A0C     // Catch:{ RuntimeException -> 0x1c07 }
            X.0wQ r12 = r0.A03     // Catch:{ RuntimeException -> 0x1c07 }
            X.12q r11 = r0.A07     // Catch:{ RuntimeException -> 0x1c07 }
            X.17u r10 = r0.A0o     // Catch:{ RuntimeException -> 0x1c07 }
            X.3T1 r7 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = r7 instanceof X.C46752bc     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x04c8
            r1 = r7
            X.2bc r1 = (X.C46752bc) r1     // Catch:{ RuntimeException -> 0x1c07 }
            int r1 = r1.A01     // Catch:{ RuntimeException -> 0x1c07 }
            r9 = 1
            if (r1 == 0) goto L_0x04c9
            goto L_0x04c8
        L_0x04c2:
            java.lang.String r1 = "SendE2EMessageJob/onRun: Not saving to count store. FMessage is null or doesn't support counter."
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x04ab
        L_0x04c8:
            r9 = 0
        L_0x04c9:
            boolean r1 = r7 instanceof X.AnonymousClass2c7     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x04cf
            if (r9 == 0) goto L_0x0500
        L_0x04cf:
            X.3Qa r1 = r7.A1J     // Catch:{ RuntimeException -> 0x1c07 }
            X.11F r9 = r1.A00     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = r9 instanceof X.AnonymousClass144     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0500
            X.144 r9 = (X.AnonymousClass144) r9     // Catch:{ RuntimeException -> 0x1c07 }
            int r7 = r7.A1I     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 3069(0xbfd, float:4.3E-42)
            boolean r1 = r13.A0E(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0500
            boolean r1 = r11.A0O(r9)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0500
            r1 = 15
            if (r7 == r1) goto L_0x04f2
            r1 = 68
            if (r7 == r1) goto L_0x04f2
            goto L_0x0500
        L_0x04f2:
            X.6X6 r1 = r10.A09(r9)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0500
            boolean r1 = r1.A0P(r12)     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x0559
        L_0x0500:
            boolean r1 = r0.useOneOneEncryptionOnPHashMismatch     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x055c
            X.0v5 r1 = r0.A00     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r7 = r1.A05()     // Catch:{ RuntimeException -> 0x1c07 }
            if (r7 == 0) goto L_0x0516
            r1.A02()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = "isPremiumMessageBroadcast"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r1)     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x0515:
            throw r1     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x0516:
            r1 = r30
            boolean r1 = r1 instanceof X.AnonymousClass144     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x055c
            java.lang.String r1 = r0.participant     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x055c
            boolean r1 = r0.A06()     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x0559
            r10 = r30
            X.144 r10 = (X.AnonymousClass144) r10     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r9 = r0.useParticipantUserHash     // Catch:{ RuntimeException -> 0x1c07 }
            X.17X r7 = r0.A09     // Catch:{ RuntimeException -> 0x1c07 }
            boolean r1 = r0.useLidForEncryption     // Catch:{ RuntimeException -> 0x1c07 }
            if (r9 == 0) goto L_0x0543
            java.lang.String r7 = r7.A04(r10, r1)     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = r0.groupParticipantUserHash     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x053c:
            boolean r1 = r7.equals(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r1 ^ 1
            goto L_0x0557
        L_0x0543:
            X.17r r7 = r7.A07     // Catch:{ RuntimeException -> 0x1c07 }
            X.6X6 r7 = r7.A0C(r10)     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0552
            java.lang.String r7 = r7.A0B()     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x054f:
            java.lang.String r1 = r0.groupParticipantHash     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x053c
        L_0x0552:
            java.lang.String r7 = r7.A0D()     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x054f
        L_0x0557:
            if (r1 == 0) goto L_0x055c
        L_0x0559:
            r17 = 1
            goto L_0x055e
        L_0x055c:
            r17 = 0
        L_0x055e:
            r1 = r30
            boolean r1 = r1 instanceof X.AnonymousClass144     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 == 0) goto L_0x0568
            r16 = 1
            if (r20 == 0) goto L_0x056a
        L_0x0568:
            r16 = 0
        L_0x056a:
            X.9KM r1 = r0.A0I     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0b15
            java.util.Map r1 = r1.A02     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r28 = r1
        L_0x0572:
            X.9KM r1 = r0.A0I     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0584
            X.9KL r5 = r1.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0578:
            java.util.Map r1 = r5.A02     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r29 = r1
            if (r16 == 0) goto L_0x0d66
            boolean r1 = r0.includeSenderKeysInMessage     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0d66
            goto L_0x0d5c
        L_0x0584:
            boolean r1 = r0.includeSenderKeysInMessage     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.144 r11 = X.AnonymousClass6H4.A00(r45)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r17 == 0) goto L_0x07b9
            X.C18740tg.A06(r11)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.HashMap r7 = X.AnonymousClass001.A0J()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r11 == 0) goto L_0x07a5
            java.util.Set r10 = r61.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r10 == 0) goto L_0x07a5
            boolean r1 = r11 instanceof X.C177538dx     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x061f
            if (r6 == 0) goto L_0x061f
            if (r5 == 0) goto L_0x061f
            android.os.Parcelable$Creator r1 = X.C177538dx.CREATOR     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.8dx r11 = (X.C177538dx) r11     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C18740tg.A06(r11)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.Iterator r9 = r10.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x05ae:
            boolean r1 = r9.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x05c9
            java.lang.Object r1 = r9.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = X.AnonymousClass143.A0I(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x05ae
            X.13w r49 = r67.A09()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x05c4:
            java.util.Iterator r13 = r10.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x05d1
        L_0x05c9:
            com.whatsapp.jid.PhoneUserJid r49 = X.C36371kC.A0e(r67)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x05c4
        L_0x05ce:
            r7.put(r9, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x05d1:
            boolean r1 = r13.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x061f
            java.lang.Object r9 = r13.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.DeviceJid r9 = (com.whatsapp.jid.DeviceJid) r9     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r7.containsKey(r9)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x05d1
            r1 = r67
            boolean r1 = r1.A0N(r9)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x05ed
            r1 = 0
            goto L_0x05ce
        L_0x05ed:
            com.whatsapp.jid.UserJid r12 = r9.userJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.DeviceJid r1 = r12.getPrimaryDevice()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = r1.getRawString()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.Object r1 = r5.get(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3un r1 = (X.C80103un) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1b2f
            r46 = r29
            r47 = r11
            r48 = r12
            r50 = r1
            r51 = r6
            java.lang.String r1 = r46.A00(r47, r48, r49, r50, r51)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x05ce
            java.lang.String r1 = "sende2emessagejob/failed to encrypt broadcast setting"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r2 = r3.A00(r9)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jobqueue.job.exception.EncryptionFailException r1 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.<init>(r9, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x061f:
            java.lang.String r1 = "E2eMessageEncryptor/getParticipantsDataForForceOneOneEncryption"
            X.14g r5 = new X.14g     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r5.<init>((java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r5.A03()     // Catch:{ all -> 0x1b45 }
            int r1 = r10.size()     // Catch:{ all -> 0x1b45 }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x1b45 }
            r6.<init>(r1)     // Catch:{ all -> 0x1b45 }
            r1 = r31
            X.AnonymousClass143.A0A(r1, r10, r6)     // Catch:{ all -> 0x1b45 }
            r1 = r18
            java.util.HashMap r9 = r2.A09(r6, r1)     // Catch:{ all -> 0x1b45 }
            java.util.TreeMap r6 = new java.util.TreeMap     // Catch:{ all -> 0x1b45 }
            r6.<init>()     // Catch:{ all -> 0x1b45 }
            boolean r1 = r8.A05()     // Catch:{ all -> 0x1b45 }
            r12 = 0
            if (r1 == 0) goto L_0x0653
            r8.A02()     // Catch:{ all -> 0x1b45 }
            java.lang.String r1 = "isPremiumMessageBroadcast"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r1)     // Catch:{ all -> 0x1b45 }
            throw r1     // Catch:{ all -> 0x1b45 }
        L_0x0653:
            r10.size()     // Catch:{ all -> 0x1b45 }
            java.util.Iterator r11 = r10.iterator()     // Catch:{ all -> 0x1b45 }
        L_0x065a:
            boolean r1 = r11.hasNext()     // Catch:{ all -> 0x1b45 }
            if (r1 == 0) goto L_0x06b8
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x1b45 }
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10     // Catch:{ all -> 0x1b45 }
            r1 = r67
            boolean r1 = r1.A0O(r10)     // Catch:{ all -> 0x1b45 }
            if (r1 != 0) goto L_0x065a
            boolean r1 = android.text.TextUtils.isEmpty(r59)     // Catch:{ all -> 0x1b45 }
            r51 = r60
            if (r1 != 0) goto L_0x0678
            r51 = r59
        L_0x0678:
            r46 = r63
            r47 = r10
            r48 = r58
            r49 = r19
            r50 = r33
            X.8SX r8 = r46.A07(r47, r48, r49, r50, r51)     // Catch:{ all -> 0x1b45 }
            com.whatsapp.jid.UserJid r1 = r10.userJid     // Catch:{ all -> 0x1b45 }
            java.lang.Object r2 = r9.get(r1)     // Catch:{ all -> 0x1b45 }
            X.9Na r2 = (X.C193829Na) r2     // Catch:{ all -> 0x1b45 }
            if (r2 == 0) goto L_0x06a2
            X.8SX r1 = X.AnonymousClass8SX.DEFAULT_INSTANCE     // Catch:{ all -> 0x1b45 }
            X.8NN r1 = r1.A0p()     // Catch:{ all -> 0x1b45 }
            r1.A0T(r8)     // Catch:{ all -> 0x1b45 }
            X.8NL r1 = (X.AnonymousClass8NL) r1     // Catch:{ all -> 0x1b45 }
            X.C183348qe.A03(r2, r1)     // Catch:{ all -> 0x1b45 }
            X.8SX r8 = X.AnonymousClass8NN.A0D(r1)     // Catch:{ all -> 0x1b45 }
        L_0x06a2:
            r2 = 1723(0x6bb, float:2.414E-42)
            r1 = r68
            int r2 = r1.A07(r2)     // Catch:{ all -> 0x1b45 }
            r1 = -1
            if (r2 == r1) goto L_0x06b1
            X.8SX r8 = X.C202969n1.A02(r8, r2)     // Catch:{ all -> 0x1b45 }
        L_0x06b1:
            if (r12 != 0) goto L_0x06b4
            r12 = 1
        L_0x06b4:
            r6.put(r10, r8)     // Catch:{ all -> 0x1b45 }
            goto L_0x065a
        L_0x06b8:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1b45 }
            java.lang.String r1 = "e2e messages created: "
            r2.append(r1)     // Catch:{ all -> 0x1b45 }
            int r1 = r6.size()     // Catch:{ all -> 0x1b45 }
            java.lang.String r1 = X.C36381kD.A10(r2, r1)     // Catch:{ all -> 0x1b45 }
            r5.A02(r1)     // Catch:{ all -> 0x1b45 }
            java.util.TreeMap r9 = new java.util.TreeMap     // Catch:{ all -> 0x1b45 }
            r9.<init>()     // Catch:{ all -> 0x1b45 }
            java.util.HashMap r8 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x1b45 }
            java.util.Iterator r11 = X.C36371kC.A10(r6)     // Catch:{ all -> 0x1b45 }
        L_0x06d9:
            boolean r1 = r11.hasNext()     // Catch:{ all -> 0x1b45 }
            if (r1 == 0) goto L_0x06fb
            java.util.Map$Entry r10 = X.AnonymousClass000.A11(r11)     // Catch:{ all -> 0x1b45 }
            java.lang.Object r1 = r10.getKey()     // Catch:{ all -> 0x1b45 }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x1b45 }
            X.6EZ r2 = X.C133256Xm.A02(r1)     // Catch:{ all -> 0x1b45 }
            java.lang.Object r1 = r10.getValue()     // Catch:{ all -> 0x1b45 }
            X.A7h r1 = (X.C21070A7h) r1     // Catch:{ all -> 0x1b45 }
            byte[] r1 = r1.A0o()     // Catch:{ all -> 0x1b45 }
            r8.put(r2, r1)     // Catch:{ all -> 0x1b45 }
            goto L_0x06d9
        L_0x06fb:
            java.util.HashMap r1 = r4.A0I(r8)     // Catch:{ all -> 0x1b45 }
            java.util.Iterator r12 = X.C36371kC.A10(r1)     // Catch:{ all -> 0x1b45 }
            r10 = r35
        L_0x0705:
            boolean r1 = r12.hasNext()     // Catch:{ all -> 0x1b45 }
            if (r1 == 0) goto L_0x076a
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r12)     // Catch:{ all -> 0x1b45 }
            java.lang.Object r1 = r2.getKey()     // Catch:{ all -> 0x1b45 }
            X.6EZ r1 = (X.AnonymousClass6EZ) r1     // Catch:{ all -> 0x1b45 }
            com.whatsapp.jid.DeviceJid r8 = X.C133256Xm.A03(r1)     // Catch:{ all -> 0x1b45 }
            X.C18740tg.A06(r8)     // Catch:{ all -> 0x1b45 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x1b45 }
            X.9K2 r2 = (X.AnonymousClass9K2) r2     // Catch:{ all -> 0x1b45 }
            int r1 = r2.A01     // Catch:{ all -> 0x1b45 }
            if (r1 == 0) goto L_0x0729
            if (r10 != 0) goto L_0x0731
            goto L_0x072d
        L_0x0729:
            r11 = 1
            r48 = 0
            goto L_0x073d
        L_0x072d:
            java.util.Set r10 = r61.A00()     // Catch:{ all -> 0x1b45 }
        L_0x0731:
            boolean r11 = r10.contains(r8)     // Catch:{ all -> 0x1b45 }
            if (r11 == 0) goto L_0x074c
            int r1 = r3.A01(r8)     // Catch:{ all -> 0x1b45 }
            int r48 = r1 + 1
        L_0x073d:
            r42 = r66
            r43 = r2
            r44 = r8
            r46 = r19
            r47 = r23
            r49 = r57
            r42.A0G(r43, r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x1b45 }
        L_0x074c:
            X.630 r1 = A00(r2)     // Catch:{ all -> 0x1b45 }
            if (r1 == 0) goto L_0x0756
            r9.put(r8, r1)     // Catch:{ all -> 0x1b45 }
            goto L_0x0705
        L_0x0756:
            int r1 = r8.getDevice()     // Catch:{ all -> 0x1b45 }
            if (r1 != 0) goto L_0x0760
            if (r11 == 0) goto L_0x0760
            goto L_0x1b3b
        L_0x0760:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1b45 }
            java.lang.String r1 = "sende2emessagejob/encryptMessages/dropping message due to encryption failure for "
            X.C36321k7.A1J(r8, r1, r2)     // Catch:{ all -> 0x1b45 }
            goto L_0x0705
        L_0x076a:
            boolean r1 = r6.isEmpty()     // Catch:{ all -> 0x1b45 }
            if (r1 != 0) goto L_0x0785
            boolean r1 = r9.isEmpty()     // Catch:{ all -> 0x1b45 }
            if (r1 == 0) goto L_0x0785
            java.lang.String r1 = "sende2emessagejob/encryptMessages/no encrypted messages due to encryption failures"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x1b45 }
            r3 = 4
            com.whatsapp.jobqueue.job.exception.EncryptionFailException r2 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException     // Catch:{ all -> 0x1b45 }
            r1 = r35
            r2.<init>(r1, r3)     // Catch:{ all -> 0x1b45 }
            goto L_0x1b44
        L_0x0785:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1b45 }
            java.lang.String r1 = "messages encrypted: "
            r2.append(r1)     // Catch:{ all -> 0x1b45 }
            int r1 = r9.size()     // Catch:{ all -> 0x1b45 }
            java.lang.String r1 = X.C36381kD.A10(r2, r1)     // Catch:{ all -> 0x1b45 }
            r5.A02(r1)     // Catch:{ all -> 0x1b45 }
            r5.A01()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9KL r5 = new X.9KL     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r35
            r5.<init>(r1, r7, r9)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0578
        L_0x07a5:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = "sende2emessagejob/unable to retrieve participants for one time message"
            r1 = r39
            X.C36321k7.A1R(r2, r1, r5)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9KL r5 = new X.9KL     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = r35
            r5.<init>(r2, r7, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0578
        L_0x07b9:
            if (r16 == 0) goto L_0x0b08
            if (r1 == 0) goto L_0x0b08
            X.C18740tg.A06(r11)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.HashMap r10 = X.AnonymousClass001.A0J()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r11 == 0) goto L_0x0af4
            java.util.Set r44 = r61.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r44 == 0) goto L_0x0af4
            boolean r1 = r11 instanceof X.C177538dx     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r43 = r1
            if (r1 == 0) goto L_0x0853
            if (r6 == 0) goto L_0x0853
            if (r5 == 0) goto L_0x0853
            android.os.Parcelable$Creator r1 = X.C177538dx.CREATOR     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r8 = r11
            X.8dx r8 = (X.C177538dx) r8     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C18740tg.A06(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.Iterator r7 = r44.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x07e2:
            boolean r1 = r7.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x084e
            java.lang.Object r1 = r7.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = X.AnonymousClass143.A0I(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x07e2
            X.13w r49 = r67.A09()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x07f8:
            java.util.Iterator r12 = r44.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x07fc:
            boolean r1 = r12.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0853
            java.lang.Object r7 = r12.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.DeviceJid r7 = (com.whatsapp.jid.DeviceJid) r7     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r10.containsKey(r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x07fc
            r1 = r67
            boolean r1 = r1.A0N(r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0818
            r1 = 0
            goto L_0x084a
        L_0x0818:
            com.whatsapp.jid.UserJid r9 = r7.userJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.DeviceJid r1 = r9.getPrimaryDevice()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = r1.getRawString()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.Object r1 = r5.get(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3un r1 = (X.C80103un) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1b4a
            r46 = r29
            r47 = r8
            r48 = r9
            r50 = r1
            r51 = r6
            java.lang.String r1 = r46.A00(r47, r48, r49, r50, r51)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x084a
            java.lang.String r1 = "sende2emessagejob/failed to encrypt broadcast setting"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r2 = r3.A00(r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jobqueue.job.exception.EncryptionFailException r1 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.<init>(r7, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x084a:
            r10.put(r7, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x07fc
        L_0x084e:
            com.whatsapp.jid.PhoneUserJid r49 = X.C36371kC.A0e(r67)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x07f8
        L_0x0853:
            r1 = r62
            X.17r r1 = r1.A07     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.6X6 r5 = r1.A0C(r11)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r67
            r6 = r18
            java.util.HashSet r14 = r5.A0I(r1, r6)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r14.isEmpty()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x086e
            r1 = r44
            r14.retainAll(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x086e:
            java.util.TreeMap r42 = new java.util.TreeMap     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r42.<init>()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "E2eMessageEncryptor/getParticipantsData"
            X.14g r15 = new X.14g     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r15.<init>((java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r15.A03()     // Catch:{ all -> 0x1b60 }
            int r1 = r14.size()     // Catch:{ all -> 0x1b60 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x1b60 }
            r5.<init>(r1)     // Catch:{ all -> 0x1b60 }
            r1 = r31
            X.AnonymousClass143.A0A(r1, r14, r5)     // Catch:{ all -> 0x1b60 }
            java.util.HashMap r31 = r2.A09(r5, r6)     // Catch:{ all -> 0x1b60 }
            java.util.Iterator r29 = r44.iterator()     // Catch:{ all -> 0x1b60 }
            r13 = r35
            r12 = r13
            r25 = r13
            r9 = r13
        L_0x0899:
            boolean r1 = r29.hasNext()     // Catch:{ all -> 0x1b60 }
            if (r1 == 0) goto L_0x09cc
            java.lang.Object r8 = r29.next()     // Catch:{ all -> 0x1b60 }
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8     // Catch:{ all -> 0x1b60 }
            boolean r2 = r14.contains(r8)     // Catch:{ all -> 0x1b60 }
            if (r43 == 0) goto L_0x08b4
            r1 = r67
            boolean r1 = r1.A0N(r8)     // Catch:{ all -> 0x1b60 }
            r6 = 1
            if (r1 != 0) goto L_0x08b5
        L_0x08b4:
            r6 = 0
        L_0x08b5:
            if (r2 == 0) goto L_0x098f
            if (r13 != 0) goto L_0x08db
            if (r18 == 0) goto L_0x08c0
            X.8du r1 = r67.A07()     // Catch:{ all -> 0x1b60 }
            goto L_0x08c7
        L_0x08c0:
            r67.A0G()     // Catch:{ all -> 0x1b60 }
            r1 = r67
            X.13x r1 = r1.A02     // Catch:{ all -> 0x1b60 }
        L_0x08c7:
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x1b60 }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x1b60 }
            X.6EZ r5 = X.C133256Xm.A02(r1)     // Catch:{ all -> 0x1b60 }
            X.6EU r2 = new X.6EU     // Catch:{ all -> 0x1b60 }
            r1 = r60
            r2.<init>(r5, r1)     // Catch:{ all -> 0x1b60 }
            X.5q1 r13 = r4.A0C(r2)     // Catch:{ all -> 0x1b60 }
        L_0x08db:
            if (r6 == 0) goto L_0x0949
            if (r12 != 0) goto L_0x08fd
            java.util.HashSet r5 = X.C36441kJ.A16()     // Catch:{ all -> 0x1b60 }
            java.util.Iterator r6 = r44.iterator()     // Catch:{ all -> 0x1b60 }
        L_0x08e7:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x1b60 }
            if (r1 == 0) goto L_0x08f9
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x1b60 }
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2     // Catch:{ all -> 0x1b60 }
            r1 = r67
            X.C165587tf.A15(r1, r2, r5)     // Catch:{ all -> 0x1b60 }
            goto L_0x08e7
        L_0x08f9:
            java.lang.String r12 = X.AnonymousClass6UD.A03(r5)     // Catch:{ all -> 0x1b60 }
        L_0x08fd:
            if (r9 != 0) goto L_0x09bf
            com.whatsapp.jid.UserJid r2 = r8.userJid     // Catch:{ all -> 0x1b60 }
            r1 = r31
            java.lang.Object r6 = r1.get(r2)     // Catch:{ all -> 0x1b60 }
            X.9Na r6 = (X.C193829Na) r6     // Catch:{ all -> 0x1b60 }
            byte[] r5 = r13.A01     // Catch:{ all -> 0x1b60 }
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x1b60 }
            X.8NL r1 = X.C170918Hz.A0D()     // Catch:{ all -> 0x1b60 }
            X.8Hz r1 = r1.A00     // Catch:{ all -> 0x1b60 }
            X.8SX r1 = (X.AnonymousClass8SX) r1     // Catch:{ all -> 0x1b60 }
            X.8PE r1 = r1.senderKeyDistributionMessage_     // Catch:{ all -> 0x1b60 }
            if (r1 != 0) goto L_0x091c
            X.8PE r1 = X.AnonymousClass8PE.DEFAULT_INSTANCE     // Catch:{ all -> 0x1b60 }
        L_0x091c:
            X.8NN r2 = r1.A0q()     // Catch:{ all -> 0x1b60 }
            X.8N4 r2 = (X.AnonymousClass8N4) r2     // Catch:{ all -> 0x1b60 }
            r1 = r60
            r2.A0V(r1)     // Catch:{ all -> 0x1b60 }
            X.AyA r1 = X.C21674AUx.A01     // Catch:{ all -> 0x1b60 }
            X.8I5 r1 = X.C165607th.A0O(r5)     // Catch:{ all -> 0x1b60 }
            r2.A0U(r1)     // Catch:{ all -> 0x1b60 }
            X.8NL r1 = X.C170918Hz.A0D()     // Catch:{ all -> 0x1b60 }
            r1.A0e(r2)     // Catch:{ all -> 0x1b60 }
            X.C183348qe.A03(r6, r1)     // Catch:{ all -> 0x1b60 }
            X.8SX r9 = X.AnonymousClass8NN.A0D(r1)     // Catch:{ all -> 0x1b60 }
            if (r12 == 0) goto L_0x09bf
            r2 = r68
            r1 = r35
            X.8SX r9 = X.C202969n1.A00(r2, r9, r1, r12)     // Catch:{ all -> 0x1b60 }
            goto L_0x09bf
        L_0x0949:
            com.whatsapp.jid.UserJid r2 = r8.userJid     // Catch:{ all -> 0x1b60 }
            r1 = r31
            java.lang.Object r7 = r1.get(r2)     // Catch:{ all -> 0x1b60 }
            X.9Na r7 = (X.C193829Na) r7     // Catch:{ all -> 0x1b60 }
            byte[] r1 = r13.A01     // Catch:{ all -> 0x1b60 }
            r5 = r1
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x1b60 }
            X.8NL r1 = X.C170918Hz.A0D()     // Catch:{ all -> 0x1b60 }
            X.8Hz r1 = r1.A00     // Catch:{ all -> 0x1b60 }
            X.8SX r1 = (X.AnonymousClass8SX) r1     // Catch:{ all -> 0x1b60 }
            X.8PE r1 = r1.senderKeyDistributionMessage_     // Catch:{ all -> 0x1b60 }
            if (r1 != 0) goto L_0x0967
            X.8PE r1 = X.AnonymousClass8PE.DEFAULT_INSTANCE     // Catch:{ all -> 0x1b60 }
        L_0x0967:
            X.8NN r6 = r1.A0q()     // Catch:{ all -> 0x1b60 }
            X.8N4 r6 = (X.AnonymousClass8N4) r6     // Catch:{ all -> 0x1b60 }
            r1 = r60
            r6.A0V(r1)     // Catch:{ all -> 0x1b60 }
            X.AyA r1 = X.C21674AUx.A01     // Catch:{ all -> 0x1b60 }
            int r1 = r5.length     // Catch:{ all -> 0x1b60 }
            r2 = r1
            r1 = 0
            X.8I5 r1 = X.C21674AUx.A01(r5, r1, r2)     // Catch:{ all -> 0x1b60 }
            r6.A0U(r1)     // Catch:{ all -> 0x1b60 }
            X.8NL r1 = X.C170918Hz.A0D()     // Catch:{ all -> 0x1b60 }
            r1.A0e(r6)     // Catch:{ all -> 0x1b60 }
            X.C183348qe.A03(r7, r1)     // Catch:{ all -> 0x1b60 }
            X.8SX r1 = X.AnonymousClass8NN.A0D(r1)     // Catch:{ all -> 0x1b60 }
            r2 = r9
            r9 = r1
            goto L_0x09c0
        L_0x098f:
            if (r6 == 0) goto L_0x09c8
            if (r12 != 0) goto L_0x09b1
            java.util.HashSet r5 = X.C36441kJ.A16()     // Catch:{ all -> 0x1b60 }
            java.util.Iterator r6 = r44.iterator()     // Catch:{ all -> 0x1b60 }
        L_0x099b:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x1b60 }
            if (r1 == 0) goto L_0x09ad
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x1b60 }
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2     // Catch:{ all -> 0x1b60 }
            r1 = r67
            X.C165587tf.A15(r1, r2, r5)     // Catch:{ all -> 0x1b60 }
            goto L_0x099b
        L_0x09ad:
            java.lang.String r12 = X.AnonymousClass6UD.A03(r5)     // Catch:{ all -> 0x1b60 }
        L_0x09b1:
            if (r25 != 0) goto L_0x09bb
            r5 = r68
            r2 = r35
            X.8SX r25 = X.C202969n1.A00(r5, r2, r2, r12)     // Catch:{ all -> 0x1b60 }
        L_0x09bb:
            r2 = r9
            r9 = r25
            goto L_0x09c0
        L_0x09bf:
            r2 = r9
        L_0x09c0:
            if (r9 == 0) goto L_0x09c9
            r1 = r42
            r1.put(r8, r9)     // Catch:{ all -> 0x1b60 }
            goto L_0x09c9
        L_0x09c8:
            r2 = r9
        L_0x09c9:
            r9 = r2
            goto L_0x0899
        L_0x09cc:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1b60 }
            java.lang.String r1 = "e2e messages created: "
            r2.append(r1)     // Catch:{ all -> 0x1b60 }
            int r1 = r42.size()     // Catch:{ all -> 0x1b60 }
            java.lang.String r1 = X.C36381kD.A10(r2, r1)     // Catch:{ all -> 0x1b60 }
            r15.A02(r1)     // Catch:{ all -> 0x1b60 }
            boolean r1 = r42.isEmpty()     // Catch:{ all -> 0x1b60 }
            if (r1 != 0) goto L_0x0aa1
            java.util.TreeMap r6 = new java.util.TreeMap     // Catch:{ all -> 0x1b60 }
            r6.<init>()     // Catch:{ all -> 0x1b60 }
            java.util.HashMap r5 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x1b60 }
            java.util.Iterator r8 = X.C36371kC.A10(r42)     // Catch:{ all -> 0x1b60 }
        L_0x09f3:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x1b60 }
            if (r1 == 0) goto L_0x0a15
            java.util.Map$Entry r7 = X.AnonymousClass000.A11(r8)     // Catch:{ all -> 0x1b60 }
            java.lang.Object r1 = r7.getKey()     // Catch:{ all -> 0x1b60 }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x1b60 }
            X.6EZ r2 = X.C133256Xm.A02(r1)     // Catch:{ all -> 0x1b60 }
            java.lang.Object r1 = r7.getValue()     // Catch:{ all -> 0x1b60 }
            X.A7h r1 = (X.C21070A7h) r1     // Catch:{ all -> 0x1b60 }
            byte[] r1 = r1.A0o()     // Catch:{ all -> 0x1b60 }
            r5.put(r2, r1)     // Catch:{ all -> 0x1b60 }
            goto L_0x09f3
        L_0x0a15:
            java.util.HashMap r1 = r4.A0I(r5)     // Catch:{ all -> 0x1b60 }
            java.util.Iterator r9 = X.C36371kC.A10(r1)     // Catch:{ all -> 0x1b60 }
            r7 = r35
        L_0x0a1f:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x1b60 }
            if (r1 == 0) goto L_0x0a86
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r9)     // Catch:{ all -> 0x1b60 }
            java.lang.Object r1 = r2.getKey()     // Catch:{ all -> 0x1b60 }
            X.6EZ r1 = (X.AnonymousClass6EZ) r1     // Catch:{ all -> 0x1b60 }
            com.whatsapp.jid.DeviceJid r5 = X.C133256Xm.A03(r1)     // Catch:{ all -> 0x1b60 }
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x1b60 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x1b60 }
            X.9K2 r2 = (X.AnonymousClass9K2) r2     // Catch:{ all -> 0x1b60 }
            int r1 = r2.A01     // Catch:{ all -> 0x1b60 }
            if (r1 == 0) goto L_0x0a43
            if (r7 != 0) goto L_0x0a4b
            goto L_0x0a47
        L_0x0a43:
            r8 = 1
            r52 = 0
            goto L_0x0a57
        L_0x0a47:
            java.util.Set r7 = r61.A00()     // Catch:{ all -> 0x1b60 }
        L_0x0a4b:
            boolean r8 = r7.contains(r5)     // Catch:{ all -> 0x1b60 }
            if (r8 == 0) goto L_0x0a68
            int r1 = r3.A01(r5)     // Catch:{ all -> 0x1b60 }
            int r52 = r1 + 1
        L_0x0a57:
            r46 = r66
            r47 = r2
            r48 = r5
            r50 = r19
            r51 = r23
            r53 = r57
            r49 = r45
            r46.A0G(r47, r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x1b60 }
        L_0x0a68:
            X.630 r1 = A00(r2)     // Catch:{ all -> 0x1b60 }
            if (r1 == 0) goto L_0x0a72
            r6.put(r5, r1)     // Catch:{ all -> 0x1b60 }
            goto L_0x0a1f
        L_0x0a72:
            int r1 = r5.getDevice()     // Catch:{ all -> 0x1b60 }
            if (r1 != 0) goto L_0x0a7c
            if (r8 == 0) goto L_0x0a7c
            goto L_0x1b56
        L_0x0a7c:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1b60 }
            java.lang.String r1 = "sende2emessagejob/encryptMessages/dropping message due to encryption failure for "
            X.C36321k7.A1J(r5, r1, r2)     // Catch:{ all -> 0x1b60 }
            goto L_0x0a1f
        L_0x0a86:
            boolean r1 = r42.isEmpty()     // Catch:{ all -> 0x1b60 }
            if (r1 != 0) goto L_0x0aa3
            boolean r1 = r6.isEmpty()     // Catch:{ all -> 0x1b60 }
            if (r1 == 0) goto L_0x0aa3
            java.lang.String r1 = "sende2emessagejob/encryptMessages/no encrypted messages due to encryption failures"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x1b60 }
            r3 = 4
            com.whatsapp.jobqueue.job.exception.EncryptionFailException r2 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException     // Catch:{ all -> 0x1b60 }
            r1 = r35
            r2.<init>(r1, r3)     // Catch:{ all -> 0x1b60 }
            goto L_0x1b5f
        L_0x0aa1:
            r6 = r35
        L_0x0aa3:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1b60 }
            java.lang.String r1 = "messages encrypted: "
            r2.append(r1)     // Catch:{ all -> 0x1b60 }
            if (r6 == 0) goto L_0x0aaf
            goto L_0x0ab1
        L_0x0aaf:
            r1 = 0
            goto L_0x0ab5
        L_0x0ab1:
            int r1 = r6.size()     // Catch:{ all -> 0x1b60 }
        L_0x0ab5:
            java.lang.String r1 = X.C36381kD.A10(r2, r1)     // Catch:{ all -> 0x1b60 }
            r15.A02(r1)     // Catch:{ all -> 0x1b60 }
            r15.A01()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r11 instanceof X.C177618e5     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0ae6
            java.util.TreeSet r5 = new java.util.TreeSet     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r5.<init>()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.Iterator r7 = r44.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0acc:
            boolean r1 = r7.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0ae9
            java.lang.Object r2 = r7.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r6 == 0) goto L_0x0ae0
            boolean r1 = r6.containsKey(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0acc
        L_0x0ae0:
            r1 = r67
            X.C165587tf.A15(r1, r2, r5)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0acc
        L_0x0ae6:
            r1 = r35
            goto L_0x0aed
        L_0x0ae9:
            java.util.ArrayList r1 = X.C36441kJ.A15(r5)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0aed:
            X.9KL r5 = new X.9KL     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r5.<init>(r1, r10, r6)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0578
        L_0x0af4:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = "sende2emessagejob/unable to retrieve participants in group at time of message"
            r1 = r39
            X.C36321k7.A1R(r2, r1, r5)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9KL r5 = new X.9KL     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = r35
            r5.<init>(r2, r10, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0578
        L_0x0b08:
            java.util.HashMap r6 = X.AnonymousClass001.A0J()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9KL r5 = new X.9KL     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = r35
            r5.<init>(r2, r6, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0578
        L_0x0b15:
            boolean r1 = r0.multiDeviceFanOut     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0c0b
            r1 = r37
            boolean r1 = r1 instanceof X.AnonymousClass144     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0c0b
            X.0wQ r7 = r0.A03     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0bec
            com.whatsapp.jid.UserJid r1 = r1.userJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r7.A0M(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0bec
            java.util.HashMap r28 = X.AnonymousClass001.A0J()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r38.isEmpty()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0bcf
            java.util.Set r7 = r61.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r38
            r1.retainAll(r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r13 = 0
            java.util.Iterator r12 = r38.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0b47:
            boolean r1 = r12.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0bcf
            java.lang.Object r11 = r12.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.DeviceJid r11 = (com.whatsapp.jid.DeviceJid) r11     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.UserJid r10 = X.C222813r.A00(r75)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = android.text.TextUtils.isEmpty(r59)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r51 = r60
            if (r1 != 0) goto L_0x0b61
            r51 = r59
        L_0x0b61:
            r46 = r63
            r47 = r11
            r48 = r58
            r49 = r19
            r50 = r33
            X.8SX r9 = r46.A07(r47, r48, r49, r50, r51)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r10 != 0) goto L_0x0b73
            com.whatsapp.jid.UserJid r10 = r11.userJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0b73:
            r7 = r68
            r1 = r63
            X.8SX r1 = X.C202969n1.A01(r7, r10, r1, r9)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r13 != 0) goto L_0x0b7e
            r13 = 1
        L_0x0b7e:
            X.6EZ r7 = X.C133256Xm.A02(r11)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            byte[] r1 = r1.A0o()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9K2 r1 = r4.A09(r7, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r7 = r11.getDevice()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r7 == 0) goto L_0x0ba6
            java.util.Set r7 = r61.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r7 = r7.contains(r11)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r7 != 0) goto L_0x0ba6
            java.lang.StringBuilder r7 = X.C165587tf.A0k(r11)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = " identity has changed, ignoring encryption failure"
            X.C36341k9.A1O(r7, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r35
            goto L_0x0bc2
        L_0x0ba6:
            int r7 = r1.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r7 != 0) goto L_0x0bad
            r48 = 0
            goto L_0x0bb3
        L_0x0bad:
            int r7 = r3.A01(r11)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r48 = r7 + 1
        L_0x0bb3:
            r42 = r66
            r43 = r1
            r44 = r11
            r46 = r19
            r47 = r23
            r49 = r57
            r42.A0G(r43, r44, r45, r46, r47, r48, r49)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0bc2:
            X.630 r7 = A00(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r7 == 0) goto L_0x0b47
            r1 = r28
            r1.put(r11, r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0b47
        L_0x0bcf:
            boolean r1 = r28.isEmpty()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0572
            X.0wQ r1 = r0.A03     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.A0G()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.13x r3 = r1.A02     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C18740tg.A06(r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9Ta r1 = r0.A0G     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r2 = r1.A00(r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jobqueue.job.exception.EncryptionFailException r1 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.<init>(r3, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x0bec:
            int r1 = r38.size()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r9 = 1
            if (r1 > r9) goto L_0x0c11
            boolean r1 = r0.A06()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0c11
            X.005 r1 = r0.A0R     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.Object r10 = r1.get()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1HX r10 = (X.AnonymousClass1HX) r10     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r7 = r0.messageType     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r37
            boolean r1 = r10.A05(r1, r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0c11
        L_0x0c0b:
            java.util.Map r28 = java.util.Collections.emptyMap()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0572
        L_0x0c11:
            com.whatsapp.jid.UserJid r13 = X.C222813r.A00(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r13 == 0) goto L_0x0c94
            boolean r28 = X.AnonymousClass143.A0J(r13)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r25 = X.AnonymousClass143.A0I(r13)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.Iterator r15 = r38.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0c27:
            boolean r1 = r15.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r11 = 0
            if (r1 == 0) goto L_0x0c6d
            java.lang.Object r10 = r15.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r28 == 0) goto L_0x0c3c
            boolean r1 = X.AnonymousClass143.A0J(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0c44
        L_0x0c3c:
            if (r25 == 0) goto L_0x0c46
            boolean r1 = X.AnonymousClass143.A0I(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0c46
        L_0x0c44:
            r14 = 1
            goto L_0x0c47
        L_0x0c46:
            r14 = 0
        L_0x0c47:
            int r1 = r10.getDevice()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0c60
            X.0wQ r7 = r0.A03     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.UserJid r1 = r10.userJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r7.A0M(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0c60
            com.whatsapp.jid.UserJid r1 = r10.userJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r1.equals(r13)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0c60
            r11 = 1
        L_0x0c60:
            if (r14 == 0) goto L_0x0c64
            if (r11 == 0) goto L_0x0c27
        L_0x0c64:
            r12.append(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = ","
            r12.append(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0c27
        L_0x0c6d:
            int r1 = r12.length()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 <= 0) goto L_0x0c94
            int r1 = r12.length()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r1 = r1 - r9
            r12.setLength(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "remoteChatJid="
            r7.append(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r7.append(r13)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "; invalid devices="
            java.lang.String r10 = X.AnonymousClass000.A0l(r12, r1, r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.0wN r7 = r0.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "InvalidDevicesForMdFanoutMessage"
            r7.A0E(r1, r10, r11)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0c94:
            java.util.HashMap r28 = X.AnonymousClass001.A0J()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r38.isEmpty()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0d34
            java.util.Set r7 = r61.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r38
            r1.retainAll(r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r14 = 0
            java.util.Iterator r13 = r38.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0cac:
            boolean r1 = r13.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0d34
            java.lang.Object r10 = r13.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.UserJid r12 = X.C222813r.A00(r75)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = android.text.TextUtils.isEmpty(r59)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r51 = r60
            if (r1 != 0) goto L_0x0cc6
            r51 = r59
        L_0x0cc6:
            r46 = r63
            r47 = r10
            r48 = r58
            r49 = r19
            r50 = r33
            X.8SX r11 = r46.A07(r47, r48, r49, r50, r51)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r12 != 0) goto L_0x0cd8
            com.whatsapp.jid.UserJid r12 = r10.userJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0cd8:
            r7 = r68
            r1 = r63
            X.8SX r1 = X.C202969n1.A01(r7, r12, r1, r11)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r14 != 0) goto L_0x0ce3
            r14 = 1
        L_0x0ce3:
            X.6EZ r7 = X.C133256Xm.A02(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            byte[] r1 = r1.A0o()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9K2 r7 = r4.A09(r7, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r1 = r10.getDevice()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0d0b
            java.util.Set r1 = r61.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r1.contains(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0d0b
            java.lang.StringBuilder r7 = X.C165587tf.A0k(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = " identity has changed, ignoring encryption failure"
            X.C36341k9.A1O(r7, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r7 = r35
            goto L_0x0d27
        L_0x0d0b:
            int r1 = r7.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0d12
            r48 = 0
            goto L_0x0d18
        L_0x0d12:
            int r1 = r3.A01(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r48 = r1 + 1
        L_0x0d18:
            r42 = r66
            r43 = r7
            r44 = r10
            r46 = r19
            r47 = r23
            r49 = r57
            r42.A0G(r43, r44, r45, r46, r47, r48, r49)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0d27:
            X.630 r7 = A00(r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r7 == 0) goto L_0x0cac
            r1 = r28
            r1.put(r10, r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0cac
        L_0x0d34:
            com.whatsapp.jid.DeviceJid r7 = com.whatsapp.jid.DeviceJid.of(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C18740tg.A06(r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r0.A06()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0572
            int r1 = r38.size()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 <= r9) goto L_0x0572
            r1 = r28
            boolean r1 = r1.containsKey(r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0572
            X.9Ta r1 = r0.A0G     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r2 = r1.A00(r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jobqueue.job.exception.EncryptionFailException r1 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.<init>(r7, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x0d5c:
            if (r29 == 0) goto L_0x0d66
            int r49 = r29.size()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 2
            r0.A0U = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0d68
        L_0x0d66:
            r49 = 0
        L_0x0d68:
            if (r17 == 0) goto L_0x0d6d
            r1 = 1
            r0.A0U = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0d6d:
            boolean r1 = r28.isEmpty()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0ff7
            if (r17 != 0) goto L_0x0ff7
            X.9KM r1 = r0.A0I     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0d7e
            X.630 r1 = r1.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r15 = r1
            goto L_0x0fce
        L_0x0d7e:
            if (r16 == 0) goto L_0x0f01
            X.144 r13 = X.AnonymousClass6H4.A00(r75)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C18740tg.A06(r13)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r18 == 0) goto L_0x0d8e
            X.8du r8 = r67.A07()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0d95
        L_0x0d8e:
            r67.A0G()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r67
            X.13x r8 = r1.A02     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0d95:
            X.C18740tg.A06(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.6EZ r2 = X.C133256Xm.A02(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.6EU r7 = new X.6EU     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r60
            r7.<init>(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = r58
            boolean r1 = X.C202969n1.A05(r19)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0db3
            r1 = r19
            X.8SX r2 = X.C202969n1.A03(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0db3:
            byte[] r56 = r2.A0o()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.18I r1 = r4.A0K     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.79X r14 = X.AnonymousClass18I.A01(r1, r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r14.lock()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.0yC r2 = r4.A0N     // Catch:{ all -> 0x0efb }
            X.AnonymousClass6UT.A01(r2)     // Catch:{ all -> 0x0efb }
            r1 = 189(0xbd, float:2.65E-43)
            boolean r1 = r2.A0E(r1)     // Catch:{ all -> 0x0efb }
            if (r1 == 0) goto L_0x0e77
            X.18v r1 = r4.A01     // Catch:{ all -> 0x0efb }
            X.00b r6 = r1.A04     // Catch:{ all -> 0x0efb }
            java.lang.String r1 = r7.A01     // Catch:{ all -> 0x0efb }
            r15 = r1
            X.6EZ r12 = r7.A00     // Catch:{ all -> 0x0efb }
            java.lang.String r54 = X.AnonymousClass6R2.A01(r12)     // Catch:{ all -> 0x0efb }
            int r1 = r12.A00     // Catch:{ all -> 0x0efb }
            com.whatsapp.wamsys.JniBridge r6 = (com.whatsapp.wamsys.JniBridge) r6     // Catch:{ all -> 0x0efb }
            long r1 = (long) r1     // Catch:{ all -> 0x0efb }
            r42 = r1
            java.util.concurrent.atomic.AtomicReference r1 = r6.wajContext     // Catch:{ all -> 0x0efb }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0efb }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ all -> 0x0efb }
            r11 = 1
            r50 = 1
            r51 = r42
            r53 = r15
            r55 = r1
            java.lang.Object r2 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOO(r50, r51, r53, r54, r55)     // Catch:{ all -> 0x0efb }
            com.facebook.simplejni.NativeHolder r2 = (com.facebook.simplejni.NativeHolder) r2     // Catch:{ all -> 0x0efb }
            X.9Fn r1 = new X.9Fn     // Catch:{ all -> 0x0efb }
            r1.<init>(r2)     // Catch:{ all -> 0x0efb }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x0efb }
            com.facebook.simplejni.NativeHolder r10 = r1.A00     // Catch:{ all -> 0x0efb }
            r1 = 57
            long r1 = (long) r1     // Catch:{ all -> 0x0efb }
            r9 = 0
            java.lang.Object r9 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r9, r1, r10)     // Catch:{ all -> 0x0efb }
            byte[] r9 = (byte[]) r9     // Catch:{ all -> 0x0efb }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x0efb }
            r1 = 59
            long r1 = (long) r1     // Catch:{ all -> 0x0efb }
            long r1 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r11, r1, r10)     // Catch:{ all -> 0x0efb }
            int r10 = (int) r1     // Catch:{ all -> 0x0efb }
            X.5q1 r1 = new X.5q1     // Catch:{ all -> 0x0efb }
            r1.<init>(r9, r10)     // Catch:{ all -> 0x0efb }
            int r9 = r1.A00     // Catch:{ all -> 0x0efb }
            if (r9 == 0) goto L_0x0e31
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0efb }
            java.lang.String r1 = "wamsys/encryptForGroup createSenderKeyDistributionMessage returned status="
            r2.append(r1)     // Catch:{ all -> 0x0efb }
            r2.append(r9)     // Catch:{ all -> 0x0efb }
            java.lang.String r1 = "; address="
            X.C36321k7.A1J(r7, r1, r2)     // Catch:{ all -> 0x0efb }
        L_0x0e31:
            java.lang.String r54 = X.AnonymousClass6R2.A01(r12)     // Catch:{ all -> 0x0efb }
            java.util.concurrent.atomic.AtomicReference r1 = r6.wajContext     // Catch:{ all -> 0x0efb }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0efb }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ all -> 0x0efb }
            r6 = 0
            r50 = 0
            r55 = r1
            java.lang.Object r2 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOOO(r50, r51, r53, r54, r55, r56)     // Catch:{ all -> 0x0efb }
            com.facebook.simplejni.NativeHolder r2 = (com.facebook.simplejni.NativeHolder) r2     // Catch:{ all -> 0x0efb }
            X.9Fm r1 = new X.9Fm     // Catch:{ all -> 0x0efb }
            r1.<init>(r2)     // Catch:{ all -> 0x0efb }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x0efb }
            com.facebook.simplejni.NativeHolder r7 = r1.A00     // Catch:{ all -> 0x0efb }
            r1 = 52
            long r1 = (long) r1     // Catch:{ all -> 0x0efb }
            java.lang.Object r6 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r6, r1, r7)     // Catch:{ all -> 0x0efb }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x0efb }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x0efb }
            r1 = 53
            long r1 = (long) r1     // Catch:{ all -> 0x0efb }
            long r1 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r11, r1, r7)     // Catch:{ all -> 0x0efb }
            int r9 = (int) r1     // Catch:{ all -> 0x0efb }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x0efb }
            r1 = 54
            long r1 = (long) r1     // Catch:{ all -> 0x0efb }
            long r1 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r11, r1, r7)     // Catch:{ all -> 0x0efb }
            int r7 = (int) r1     // Catch:{ all -> 0x0efb }
            X.9K2 r2 = new X.9K2     // Catch:{ all -> 0x0efb }
            r2.<init>(r6, r9, r7)     // Catch:{ all -> 0x0efb }
            goto L_0x0ece
        L_0x0e77:
            X.18u r1 = r4.A00     // Catch:{ all -> 0x0efb }
            X.187 r6 = r1.A04     // Catch:{ all -> 0x0efb }
            boolean r10 = r6.A00()     // Catch:{ all -> 0x0efb }
            X.18s r1 = r1.A02     // Catch:{ all -> 0x0efb }
            X.18k r2 = r1.A04     // Catch:{ all -> 0x0efb }
            X.9Tg r9 = new X.9Tg     // Catch:{ all -> 0x0efb }
            r9.<init>(r2)     // Catch:{ all -> 0x0efb }
            X.66a r1 = X.AnonymousClass6R2.A02(r7)     // Catch:{ all -> 0x0efb }
            if (r10 == 0) goto L_0x0e99
            java.lang.Object r10 = X.C200689hx.A00     // Catch:{ all -> 0x0efb }
            monitor-enter(r10)     // Catch:{ all -> 0x0efb }
            r9.A00(r1)     // Catch:{ all -> 0x0e96 }
            monitor-exit(r10)     // Catch:{ all -> 0x0e96 }
            goto L_0x0e9c
        L_0x0e96:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0e96 }
            throw r1     // Catch:{ all -> 0x0efb }
        L_0x0e99:
            r9.A00(r1)     // Catch:{ all -> 0x0efb }
        L_0x0e9c:
            X.66a r9 = X.AnonymousClass6R2.A02(r7)     // Catch:{ all -> 0x0efb }
            r7 = 0
            byte[] r1 = X.C235218u.A03(r56)     // Catch:{ 18E -> 0x0ec5, 18D -> 0x0ec2 }
            boolean r6 = r6.A00()     // Catch:{ 18E -> 0x0ec5, 18D -> 0x0ec2 }
            if (r6 == 0) goto L_0x0eb7
            java.lang.Object r10 = X.C200689hx.A00     // Catch:{ 18E -> 0x0ec5, 18D -> 0x0ec2 }
            monitor-enter(r10)     // Catch:{ 18E -> 0x0ec5, 18D -> 0x0ec2 }
            byte[] r6 = X.C200689hx.A01(r2, r9, r1)     // Catch:{ all -> 0x0eb4 }
            monitor-exit(r10)     // Catch:{ all -> 0x0eb4 }
            goto L_0x0ebb
        L_0x0eb4:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0eb4 }
            throw r1     // Catch:{ 18E -> 0x0ec5, 18D -> 0x0ec2 }
        L_0x0eb7:
            byte[] r6 = X.C200689hx.A01(r2, r9, r1)     // Catch:{ 18E -> 0x0ec5, 18D -> 0x0ec2 }
        L_0x0ebb:
            r1 = 3
            X.9K2 r2 = new X.9K2     // Catch:{ 18E -> 0x0ec5, 18D -> 0x0ec2 }
            r2.<init>(r6, r1, r7)     // Catch:{ 18E -> 0x0ec5, 18D -> 0x0ec2 }
            goto L_0x0ece
        L_0x0ec2:
            r6 = -1008(0xfffffffffffffc10, float:NaN)
            goto L_0x0ec7
        L_0x0ec5:
            r6 = -1002(0xfffffffffffffc16, float:NaN)
        L_0x0ec7:
            X.9K2 r2 = new X.9K2     // Catch:{ all -> 0x0efb }
            r1 = r35
            r2.<init>(r1, r7, r6)     // Catch:{ all -> 0x0efb }
        L_0x0ece:
            r14.close()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r1 = r2.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0ed8
            r56 = 0
            goto L_0x0ede
        L_0x0ed8:
            int r6 = r3.A01(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r56 = r6 + 1
        L_0x0ede:
            r50 = r66
            r51 = r2
            r52 = r35
            r53 = r13
            r54 = r19
            r55 = r23
            r50.A0G(r51, r52, r53, r54, r55, r56, r57)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r6 = -1002(0xfffffffffffffc16, float:NaN)
            if (r1 != r6) goto L_0x0ef3
            goto L_0x0f90
        L_0x0ef3:
            if (r1 == 0) goto L_0x0fc6
            r6 = -1008(0xfffffffffffffc10, float:NaN)
            if (r1 == r6) goto L_0x0fc6
            goto L_0x1b65
        L_0x0efb:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x1ae9 }
            goto L_0x1b73
        L_0x0f01:
            X.C18740tg.A06(r24)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r2 = r24.getDevice()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 0
            if (r2 != 0) goto L_0x0f0c
            r1 = 1
        L_0x0f0c:
            r8 = r1 ^ 1
            if (r8 == 0) goto L_0x0f26
            java.util.Set r2 = r61.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r24
            boolean r1 = r2.contains(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0f26
            java.lang.StringBuilder r2 = X.C165587tf.A0k(r24)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = " identity has changed, dropping the message"
            X.C36341k9.A1O(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0f6d
        L_0x0f26:
            com.whatsapp.jid.UserJid r7 = X.C222813r.A00(r75)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = android.text.TextUtils.isEmpty(r59)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r14 = r60
            if (r1 != 0) goto L_0x0f34
            r14 = r59
        L_0x0f34:
            r9 = r63
            r10 = r24
            r11 = r58
            r12 = r19
            r13 = r33
            X.8SX r6 = r9.A07(r10, r11, r12, r13, r14)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r7 != 0) goto L_0x0f46
            com.whatsapp.jid.UserJid r7 = r10.userJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0f46:
            r2 = r68
            X.8SX r1 = X.C202969n1.A01(r2, r7, r9, r6)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.6EZ r2 = X.C133256Xm.A02(r24)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            byte[] r1 = r1.A0o()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9K2 r2 = r4.A09(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r8 == 0) goto L_0x0f74
            java.util.Set r6 = r61.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r6.contains(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0f74
            java.lang.StringBuilder r2 = X.C165587tf.A0k(r24)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = " identity has changed, ignoring encryption failure"
            X.C36341k9.A1O(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0f6d:
            java.lang.String r1 = "SendE2EMessageJob/not sending message since companion's identity has changed"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1be7
        L_0x0f74:
            int r1 = r2.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0f7a
            r12 = 0
            goto L_0x0f80
        L_0x0f7a:
            int r1 = r3.A01(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r12 = r1 + 1
        L_0x0f80:
            r6 = r66
            r7 = r2
            r8 = r10
            r9 = r45
            r10 = r19
            r11 = r23
            r13 = r57
            r6.A0G(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0fc6
        L_0x0f90:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r6 = "sende2emessagejob/group cipher has invalid sender key"
            r1 = r39
            X.C36321k7.A1R(r6, r1, r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.6EZ r7 = X.C133256Xm.A02(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.6EU r6 = new X.6EU     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r60
            r6.<init>(r7, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r7 = 1
            X.18k r1 = r4.A0A     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r1.A07(r6, r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x0fb9
            r1 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r66
            r1.A0K(r13, r6)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0fb9:
            r1 = r62
            X.17r r1 = r1.A07     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.6X6 r6 = r1.A0C(r13)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r62
            r1.A06(r6)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0fc6:
            int r1 = r2.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x0fd1
            X.630 r15 = A00(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0fce:
            if (r15 != 0) goto L_0x0ff8
            goto L_0x0f6d
        L_0x0fd1:
            if (r18 == 0) goto L_0x0fd8
            X.8du r1 = r67.A07()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x0fdf
        L_0x0fd8:
            r67.A0G()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r67
            X.13x r1 = r1.A02     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x0fdf:
            if (r16 == 0) goto L_0x0fe3
            r24 = r1
        L_0x0fe3:
            X.C18740tg.A06(r24)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r24
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r3 = r3.A00(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jobqueue.job.exception.EncryptionFailException r1 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = r24
            r1.<init>(r2, r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x0ff7:
            r15 = 0
        L_0x0ff8:
            X.3T1 r1 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.UserJid r6 = r1.A0L()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = r0.botInvokeRawJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r2 = r0.A07()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.UserJid r9 = X.C36431kI.A0l(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r65.get()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r9 == 0) goto L_0x1011
            if (r2 != 0) goto L_0x1011
            if (r23 == 0) goto L_0x1114
        L_0x1011:
            if (r23 <= 0) goto L_0x1028
            if (r26 == 0) goto L_0x101b
            boolean r1 = X.C197029b1.A00(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1080
        L_0x101b:
            if (r20 == 0) goto L_0x1028
            r1 = r20
            com.whatsapp.jid.UserJid r1 = r1.userJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = X.C197029b1.A00(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1028
            goto L_0x1080
        L_0x1028:
            r1 = r19
            boolean r1 = r1 instanceof X.C180828mU     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1045
            X.11F r1 = X.C222713q.A00(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = X.C197029b1.A00(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1045
            r1 = r30
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1080
            boolean r1 = X.AnonymousClass143.A0G(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1045
            goto L_0x1080
        L_0x1045:
            r1 = r19
            boolean r2 = r1 instanceof X.AnonymousClass2bO     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x1064
            boolean r1 = X.C197029b1.A00(r6)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1064
            boolean r1 = X.C197029b1.A00(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1064
            r1 = r30
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1080
            boolean r1 = X.AnonymousClass143.A0G(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1064
            goto L_0x1080
        L_0x1064:
            if (r19 == 0) goto L_0x11ec
            if (r2 == 0) goto L_0x11ec
            boolean r1 = r19.A1H()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x11ec
            boolean r1 = X.C197029b1.A00(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x11ec
            r1 = r30
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1080
            boolean r1 = X.AnonymousClass143.A0G(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x11ec
        L_0x1080:
            if (r9 != 0) goto L_0x1114
            r65.get()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r19
            boolean r1 = r1 instanceof X.C180828mU     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x10c2
            X.11F r1 = X.C222713q.A00(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = X.C197029b1.A00(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x10c2
            r1 = r30
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x10a1
            boolean r1 = X.AnonymousClass143.A0G(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x10c2
        L_0x10a1:
            r65.get()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 0
            r2 = r19
            X.AnonymousClass00C.A0D(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r19
            X.8mU r1 = (X.C180828mU) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x11ec
            X.3Qa r2 = r1.A03     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x11ec
            r1 = r64
            X.3T1 r1 = r1.A03(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x11ec
            com.whatsapp.jid.UserJid r9 = r1.A0L()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x11ea
        L_0x10c2:
            r65.get()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r19
            boolean r2 = r1 instanceof X.AnonymousClass2bO     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x10e5
            boolean r1 = X.C197029b1.A00(r6)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x10e5
            boolean r1 = X.C197029b1.A00(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x10e5
            r1 = r30
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x11e9
            boolean r1 = X.AnonymousClass143.A0G(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x10e5
            goto L_0x11e9
        L_0x10e5:
            r65.get()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r19 == 0) goto L_0x11ec
            if (r2 == 0) goto L_0x11ec
            boolean r1 = r19.A1H()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x11ec
            boolean r1 = X.C197029b1.A00(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x11ec
            r1 = r30
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1104
            boolean r1 = X.AnonymousClass143.A0G(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x11ec
        L_0x1104:
            java.lang.Object r2 = r65.get()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1HX r2 = (X.AnonymousClass1HX) r2     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r19
            java.util.List r1 = r1.A0w     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.UserJid r9 = r2.A01(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x11ea
        L_0x1114:
            com.whatsapp.jid.DeviceJid r8 = r9.getPrimaryDevice()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C18740tg.A06(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r2 = r8.getDevice()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 0
            if (r2 != 0) goto L_0x1123
            r1 = 1
        L_0x1123:
            r10 = r1 ^ 1
            if (r10 == 0) goto L_0x113c
            java.util.Set r1 = r61.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r1.contains(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x113c
            java.lang.StringBuilder r2 = X.C165587tf.A0k(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = " identity has changed, dropping the message"
            X.C36341k9.A1O(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x11ec
        L_0x113c:
            com.whatsapp.jid.UserJid r7 = X.C222813r.A00(r75)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = android.text.TextUtils.isEmpty(r59)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1148
            r59 = r60
        L_0x1148:
            r50 = r63
            r51 = r8
            r52 = r58
            r53 = r19
            r54 = r33
            r55 = r59
            X.8SX r6 = r50.A07(r51, r52, r53, r54, r55)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r7 != 0) goto L_0x115c
            com.whatsapp.jid.UserJid r7 = r8.userJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x115c:
            r2 = r68
            r1 = r63
            X.8SX r1 = X.C202969n1.A01(r2, r7, r1, r6)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.6EZ r2 = X.C133256Xm.A02(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            byte[] r1 = r1.A0o()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9K2 r2 = r4.A09(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r10 == 0) goto L_0x1186
            java.util.Set r1 = r61.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r1.contains(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1186
            java.lang.StringBuilder r2 = X.C165587tf.A0k(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = " identity has changed, ignoring encryption failure"
            X.C36341k9.A1O(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x11ec
        L_0x1186:
            int r1 = r2.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x118d
            r56 = 0
            goto L_0x1193
        L_0x118d:
            int r4 = r3.A01(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r56 = r4 + 1
        L_0x1193:
            r50 = r66
            r51 = r2
            r52 = r8
            r53 = r45
            r54 = r19
            r55 = r23
            r50.A0G(r51, r52, r53, r54, r55, r56, r57)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1b19
            X.630 r1 = A00(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x11ec
            X.9Vg r18 = new X.9Vg     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = r18
            r2.<init>(r9, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x11b1:
            java.lang.Integer r1 = r0.liveLocationDuration     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r19 = 0
            if (r1 == 0) goto L_0x11da
            X.1A1 r2 = r0.A0Q     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r33
            X.3T1 r3 = r2.A03(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.2br r3 = (X.C46902br) r3     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r3 == 0) goto L_0x11da
            X.0wo r1 = r0.A05     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r6 = X.C19970wo.A00(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r1 = r3.A0I     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r3 = r3.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r6 = r6 - r1
            long r1 = X.C36391kE.A0B(r6)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r4 = (int) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x11da
            java.lang.Integer r19 = java.lang.Integer.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x11da:
            int r1 = r0.retryCount     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x11f5
            X.8SX r1 = r0.A0N     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r1 = r1.bitField0_     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r1
            if (r2 != 0) goto L_0x120c
            goto L_0x11ef
        L_0x11e9:
            r9 = r6
        L_0x11ea:
            if (r9 != 0) goto L_0x1114
        L_0x11ec:
            r18 = r35
            goto L_0x11b1
        L_0x11ef:
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r2
            if (r1 != 0) goto L_0x120c
            goto L_0x11f8
        L_0x11f5:
            r24 = 0
            goto L_0x121b
        L_0x11f8:
            X.3T1 r2 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x11f5
            int r1 = r2.A05     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = X.AnonymousClass000.A1R(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x11f5
            java.lang.String r1 = r2.A0t     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x11f5
        L_0x120c:
            X.1EU r1 = r0.A10     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.AnonymousClass1EU.A00(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1Ed r3 = r1.A05     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = r69
            r1 = r35
            X.9lY r24 = X.C165587tf.A0R(r3, r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x121b:
            boolean r1 = X.AnonymousClass143.A0G(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1323
            X.3T1 r1 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1323
            int r1 = r1.A05     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.Integer r23 = java.lang.Integer.valueOf(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x122b:
            X.185 r2 = r0.A0i     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.UserJid r1 = X.C222813r.A00(r37)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3L0 r6 = r2.A02(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r6 == 0) goto L_0x131f
            boolean r1 = r6.A01()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x131f
            int r7 = r6.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r7 <= 0) goto L_0x131f
            int r4 = r6.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r4 <= 0) goto L_0x131f
            long r1 = r6.A04     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r8 = 0
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x131f
            X.3ur r25 = new X.3ur     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r3 = r25
            r3.<init>((int) r7, (long) r1, (int) r4)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1254:
            X.3T1 r1 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x131c
            int r1 = r1.A0B     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r31 = r1
            X.0wo r1 = r0.A05     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r64 = android.os.SystemClock.uptimeMillis()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r66 = X.C19970wo.A00(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r1 = r0.A0X     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r7 = 0
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x12af
            X.1DT r1 = r0.A0f     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r42 = r1
            X.3T1 r14 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r45 = 8
            int r13 = r0.retryCount     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r12 = r0.A1D     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r11 = r0.A1B     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r10 = r0.A0V     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r9 = r0.A1A     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r62 = r0.A07()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r50 = 0
            long r3 = r0.A0X     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r1 = r0.A0Y     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r3 = r3 - r1
            long r1 = r0.A0W     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r7 = r0.messageSendStartTime     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r1 = r1 - r7
            r51 = 0
            r57 = r3
            r43 = r14
            r44 = r38
            r46 = r27
            r47 = r13
            r48 = r10
            r52 = r31
            r53 = r3
            r55 = r1
            r59 = r12
            r60 = r11
            r61 = r9
            r63 = r17
            r42.A0Q(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r55, r57, r59, r60, r61, r62, r63)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x12af:
            X.1DT r12 = r0.A0f     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r11 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r3 = 7
            int r10 = r0.retryCount     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r9 = r0.A1D     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r8 = r0.A1B     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r7 = r0.A0V     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r4 = r0.A1A     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r73 = r0.A07()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r61 = 0
            long r64 = r64 - r21
            long r1 = r0.messageSendStartTime     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r66 = r66 - r1
            long r68 = android.os.SystemClock.uptimeMillis()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r68 = r68 - r21
            r56 = 7
            r62 = 0
            r53 = r12
            r54 = r11
            r55 = r38
            r57 = r27
            r58 = r10
            r59 = r7
            r63 = r31
            r70 = r9
            r71 = r8
            r72 = r4
            r74 = r17
            r60 = r49
            r53.A0Q(r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r66, r68, r70, r71, r72, r73, r74)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1DT r2 = r0.A0f     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = r0.id     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r1 = r1.hashCode()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2.A0F(r1, r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r0.A1D     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1309
            X.19I r1 = r0.A0M     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r2 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3Qa r2 = r2.A1J     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.Set r1 = r1.A02     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.add(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1309:
            X.0v5 r1 = r0.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r2 = r1.A05()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x1327
            r1.A02()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "isPremiumMessageChat"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x131c:
            r31 = 0
            goto L_0x1309
        L_0x131f:
            r25 = 0
            goto L_0x1254
        L_0x1323:
            r23 = 0
            goto L_0x122b
        L_0x1327:
            X.0xh r2 = r0.A0v     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r1 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.List r1 = r2.A01(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1363
            java.util.LinkedList r7 = X.C90524aI.A0l()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r7.addAll(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1338:
            X.9n1 r3 = r0.A0w     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.0yC r2 = r0.A0C     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.8SX r1 = r0.A0N     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.8SX r2 = X.AnonymousClass9ZT.A01(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1DW r1 = r3.A02     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r21 = X.C203229nZ.A07(r1, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.005 r1 = r0.A19     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.Object r3 = r1.get()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9R4 r3 = (X.AnonymousClass9R4) r3     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.0yC r2 = r3.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 5717(0x1655, float:8.011E-42)
            boolean r1 = r2.A0E(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x13bf
            X.005 r1 = r3.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.Object r4 = r1.get()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.6TA r4 = (X.AnonymousClass6TA) r4     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1365
        L_0x1363:
            r7 = 0
            goto L_0x1338
        L_0x1365:
            if (r4 == 0) goto L_0x13bf
            X.0wQ r1 = r0.A03     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.PhoneUserJid r3 = X.C36441kJ.A0n(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r2 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C36321k7.A0w(r2, r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r4.A02(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x13bf
            byte[] r1 = r2.A1b     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x13bf
            byte[] r12 = X.AnonymousClass6TA.A01(r3, r3, r2, r4, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r12 == 0) goto L_0x13bf
            int r1 = r12.length     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x13bf
            X.6QB r11 = X.C165597tg.A0X()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r10 = "reporting"
            X.6QB r9 = X.C36441kJ.A0q(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "reporting_token"
            X.6QB r8 = X.C36441kJ.A0q(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r3 = 32
            r1 = 128(0x80, double:6.32E-322)
            X.C203539oF.A0I(r12, r3, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r8.A01 = r12     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9nx r1 = X.C165567td.A0I(r8, r9)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r11.A05(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9nx r1 = r11.A03()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9nx r2 = r1.A0c(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x13bf
            if (r7 != 0) goto L_0x13b6
            java.util.LinkedList r1 = X.C90524aI.A0l()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x13bb
        L_0x13b6:
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.<init>(r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x13bb:
            r7 = r1
            r1.add(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x13bf:
            X.3T1 r2 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x148a
            X.1Yc r1 = r0.A0m     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12 = 0
            X.2oy r11 = r2.A0L     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r11 == 0) goto L_0x1444
            X.0yC r2 = r1.A02     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 5623(0x15f7, float:7.88E-42)
            boolean r1 = r2.A0E(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1444
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r9 = "origin"
            java.lang.String r8 = "meta"
            r4 = 1
            if (r7 == 0) goto L_0x1439
            java.util.Iterator r13 = r7.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r3 = 0
        L_0x13e4:
            boolean r1 = r13.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = -1
            if (r1 == 0) goto L_0x1436
            X.9nx r1 = X.C36431kI.A0s(r13)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = r1.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = X.AnonymousClass00C.A0J(r1, r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x13f8
            goto L_0x13fb
        L_0x13f8:
            int r3 = r3 + 1
            goto L_0x13e4
        L_0x13fb:
            if (r3 == r2) goto L_0x1436
            java.lang.Object r1 = r7.get(r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.ArrayList r1 = X.C203399nx.A07(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = r11.origin     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C36381kD.A1M(r9, r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1AL[] r1 = X.C165577te.A1a(r1, r12)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9nx r8 = X.C203399nx.A04(r8, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.Iterator r9 = r7.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = 0
        L_0x141b:
            boolean r1 = r9.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1446
            java.lang.Object r1 = r9.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r7 = r2 + 1
            if (r2 >= 0) goto L_0x142f
            java.lang.RuntimeException r1 = X.C36351kA.A0v()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x142f:
            if (r2 == r3) goto L_0x1434
            r4.add(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1434:
            r2 = r7
            goto L_0x141b
        L_0x1436:
            r10.addAll(r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1439:
            X.1AL[] r2 = new X.AnonymousClass1AL[r4]     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = r11.origin     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C36341k9.A1L(r9, r1, r2, r12)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C203399nx.A0E(r8, r10, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x144c
        L_0x1444:
            r10 = r7
            goto L_0x144c
        L_0x1446:
            r10.addAll(r4)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r10.add(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x144c:
            X.3T1 r1 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.AnonymousClass00C.A0D(r1, r12)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r2 = r1.A1I     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 73
            if (r2 == r1) goto L_0x1459
            r7 = r10
            goto L_0x1466
        L_0x1459:
            java.lang.String r3 = "share_pn"
            java.lang.String r2 = "true"
            X.1AL r1 = new X.1AL     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.<init>((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.ArrayList r7 = A02(r1, r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1466:
            int r1 = r0.retryCount     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 > 0) goto L_0x1470
            boolean r1 = r0.A06()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x148a
        L_0x1470:
            X.3T1 r2 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.AnonymousClass00C.A0D(r2, r12)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 134217728(0x8000000, float:3.85186E-34)
            boolean r1 = r2.A1T(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x148a
            java.lang.String r3 = "sender_intent"
            java.lang.String r2 = "hosted"
            X.1AL r1 = new X.1AL     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.<init>((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.ArrayList r7 = A02(r1, r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x148a:
            X.3T1 r1 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r1 instanceof X.C46902br     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x150e
            X.9Fd r1 = r0.A11     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1P7 r1 = r1.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r12 = r1.A01()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r12 == 0) goto L_0x150e
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r10 = "liveloc_mode"
            java.lang.String r9 = "meta"
            r8 = 1
            r4 = 0
            if (r7 == 0) goto L_0x1505
            java.util.Iterator r13 = r7.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r3 = 0
        L_0x14ab:
            boolean r1 = r13.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = -1
            if (r1 == 0) goto L_0x1502
            X.9nx r1 = X.C36431kI.A0s(r13)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = r1.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = X.AnonymousClass00C.A0J(r1, r9)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x14bf
            goto L_0x14c2
        L_0x14bf:
            int r3 = r3 + 1
            goto L_0x14ab
        L_0x14c2:
            if (r3 == r2) goto L_0x1502
            java.lang.Object r1 = r7.get(r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.ArrayList r1 = X.C203399nx.A07(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C36381kD.A1M(r10, r12, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1AL[] r1 = X.C165577te.A1a(r1, r4)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9nx r8 = X.C203399nx.A04(r9, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.Iterator r9 = r7.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = 0
        L_0x14e0:
            boolean r1 = r9.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x14fb
            java.lang.Object r1 = r9.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r7 = r2 + 1
            if (r2 >= 0) goto L_0x14f4
            java.lang.RuntimeException r1 = X.C36351kA.A0v()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x14f4:
            if (r2 == r3) goto L_0x14f9
            r4.add(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x14f9:
            r2 = r7
            goto L_0x14e0
        L_0x14fb:
            r11.addAll(r4)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r11.add(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x150d
        L_0x1502:
            r11.addAll(r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1505:
            X.1AL[] r1 = new X.AnonymousClass1AL[r8]     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C36341k9.A1L(r10, r12, r1, r4)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C203399nx.A0E(r9, r11, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x150d:
            r7 = r11
        L_0x150e:
            X.8SX r8 = r0.A0N     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r4 = r0.originationFlags     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r3 = r0.retryCount     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r2 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.0wN r1 = r0.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r42 = r1
            r43 = r24
            r44 = r8
            r45 = r2
            r46 = r21
            r47 = r4
            r48 = r3
            java.lang.String r4 = X.C183348qe.A02(r42, r43, r44, r45, r46, r47, r48)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r13 = 0
            X.3T1 r2 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r2 instanceof X.C23043B1o     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1610
            X.B1o r2 = (X.C23043B1o) r2     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1AW r1 = r0.A12     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9gz r2 = r1.A01(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x1610
            boolean r1 = r2 instanceof X.C181938oH     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x15a8
            java.lang.String r1 = "biz"
            X.6QB r13 = X.C36441kJ.A0q(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9uk r2 = r2.A02     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r14 = 1
            r12 = 0
            boolean r1 = X.C207219uk.A01(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != r14) goto L_0x1558
            java.lang.String r2 = "native_flow_name"
            java.lang.String r1 = "order_status"
            X.C36331k8.A1D(r13, r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1610
        L_0x1558:
            X.8Q1 r1 = X.AnonymousClass8Q1.DEFAULT_INSTANCE     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r11 = r1.messageVersion_     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9uX r1 = r2.A04     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r10 = "name"
            if (r1 == 0) goto L_0x15a5
            java.util.List r1 = r1.A03     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = X.C36401kF.A1a(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x15a5
            X.9uX r1 = r2.A04     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.List r1 = r1.A03     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.Object r1 = r1.get(r12)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9tc r1 = (X.C206569tc) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9uL r1 = r1.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r9 = r1.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.AnonymousClass00C.A07(r9)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x157e:
            java.lang.String r1 = "interactive"
            X.6QB r8 = X.C36441kJ.A0q(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "type"
            java.lang.String r3 = "native_flow"
            X.C36331k8.A1D(r8, r1, r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = "v"
            X.1AL r1 = new X.1AL     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.<init>((java.lang.String) r2, (int) r11)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r8.A04(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1AL[] r1 = new X.AnonymousClass1AL[r14]     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C36341k9.A1L(r10, r9, r1, r12)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9nx r1 = X.C203399nx.A04(r3, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r8.A05(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.C36361kB.A1H(r8, r13)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1610
        L_0x15a5:
            java.lang.String r9 = ""
            goto L_0x157e
        L_0x15a8:
            boolean r1 = r2 instanceof X.C181908oE     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x15c5
            X.1AL[] r3 = X.C165617ti.A0k()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = "type"
            java.lang.String r1 = "product_list"
            X.C36381kD.A1N(r2, r1, r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "list"
            X.9nx r8 = X.C203399nx.A04(r1, r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = "biz"
            X.9nx r3 = new X.9nx     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r3.<init>((X.C203399nx) r8, (java.lang.String) r2, (X.AnonymousClass1AL[]) r13)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1619
        L_0x15c5:
            boolean r1 = r2 instanceof X.C181888oC     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x15fa
            java.lang.String r1 = "biz"
            X.6QB r9 = X.C36441kJ.A0q(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "interactive"
            X.6QB r8 = X.C36441kJ.A0q(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "type"
            java.lang.String r10 = "native_flow"
            X.C36331k8.A1D(r8, r1, r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = "v"
            java.lang.String r1 = "1"
            X.C36331k8.A1D(r8, r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1AL[] r3 = X.C165617ti.A0k()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = "name"
            java.lang.String r1 = "mpm"
            X.C36381kD.A1N(r2, r1, r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9nx r1 = X.C203399nx.A04(r10, r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r8.A05(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9nx r3 = X.C165567td.A0I(r8, r9)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1619
        L_0x15fa:
            boolean r1 = r2 instanceof X.C181948oI     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1618
            X.1AL[] r3 = X.C165617ti.A0k()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = "native_flow_name"
            java.lang.String r1 = "order_details"
            X.C36381kD.A1N(r2, r1, r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "biz"
            X.9nx r3 = X.C203399nx.A04(r1, r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1619
        L_0x1610:
            r3 = 0
            if (r13 == 0) goto L_0x1619
            X.9nx r3 = r13.A03()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1619
        L_0x1618:
            r3 = 0
        L_0x1619:
            if (r6 == 0) goto L_0x161c
            goto L_0x161e
        L_0x161c:
            r11 = 0
            goto L_0x1668
        L_0x161e:
            int r2 = r6.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 2
            if (r2 != r1) goto L_0x161c
            X.3T1 r1 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9TX r1 = r1.A0K     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x161c
            boolean r1 = r1 instanceof X.C175418aS     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x161c
            X.0yC r2 = r0.A0C     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 5776(0x1690, float:8.094E-42)
            boolean r1 = r2.A0E(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x161c
            X.005 r1 = r0.A0S     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.Object r1 = r1.get()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3EX r1 = (X.AnonymousClass3EX) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r1.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x164f
            X.0yC r2 = r0.A0C     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 5877(0x16f5, float:8.235E-42)
            boolean r1 = r2.A0E(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x161c
        L_0x164f:
            X.3T1 r1 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9TX r6 = r1.A0K     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.8aS r6 = (X.C175418aS) r6     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 0
            X.AnonymousClass00C.A0D(r6, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = r6.A03     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "FB_Ads"
            boolean r2 = X.AnonymousClass00C.A0J(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = r6.A02     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9Vf r11 = new X.9Vf     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r11.<init>(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1668:
            com.whatsapp.jid.UserJid r10 = X.C222813r.A00(r75)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r10 == 0) goto L_0x16c8
            X.1KK r1 = r0.A04     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1LE r1 = r1.A06     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r9 = r1.A05(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1676:
            X.3T1 r1 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r46 = 6
            r43 = r0
            r44 = r1
            r45 = r38
            r47 = r27
            r48 = r31
            r50 = r17
            r43.A0E(r44, r45, r46, r47, r48, r49, r50)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            long r1 = r0.originalTimestamp     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r8 = r0.retryCount     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r6 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r6 = r6.A1I     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9T2 r12 = new X.9T2     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r50 = r12
            r51 = r37
            r52 = r33
            r53 = r36
            r54 = r8
            r55 = r6
            r56 = r1
            r50.<init>(r51, r52, r53, r54, r55, r56)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r32
            r12.A05 = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r34
            r12.A0O = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r20
            r12.A04 = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r26
            r12.A06 = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.0yC r13 = r0.A0C     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.12q r8 = r0.A07     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.17X r6 = r0.A09     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.GroupJid r2 = X.C36441kJ.A0l(r30)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 3803(0xedb, float:5.329E-42)
            boolean r13 = r13.A0E(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 0
            if (r13 == 0) goto L_0x16dc
            goto L_0x16ca
        L_0x16c8:
            r9 = 0
            goto L_0x1676
        L_0x16ca:
            if (r2 == 0) goto L_0x16dc
            boolean r8 = r8.A0P(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = "pn"
            if (r8 != 0) goto L_0x16dc
            boolean r2 = r6.A0B(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x16dc
            java.lang.String r1 = "lid"
        L_0x16dc:
            r12.A0I = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = r0.groupParticipantHash     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A0J = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A0L = r4     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r21
            r12.A0K = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = r0.broadcastListName     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A0G = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A0B = r15     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.Map r2 = r5.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A0S = r2     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r29
            r12.A0U = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.List r1 = r5.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A0Q = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r1 = r0.originationFlags     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A02 = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A0R = r7     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r1 = r0.editVersion     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A00 = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r19
            r12.A0E = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r24
            r12.A03 = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r28
            r12.A0T = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r23
            r12.A0F = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r0.A06()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A0W = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A0D = r3     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r25
            r12.A0C = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r2 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r2.A1O()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A0V = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r2 instanceof X.AnonymousClass2cT     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1816
            X.2cT r2 = (X.AnonymousClass2cT) r2     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1EO r1 = r0.A0P     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.B1p r2 = r1.A00(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r2 instanceof X.C182008oO     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1816
            X.8oO r2 = (X.C182008oO) r2     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9ud r1 = r2.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9uD r1 = r1.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1816
            java.lang.String r1 = r1.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1746:
            r12.A0M = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r13 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1FU r1 = r0.A0K     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r1.A00(r13)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r6 = 0
            if (r1 == 0) goto L_0x177a
            X.64Y r1 = r0.A0H     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.Set r8 = r1.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.0wN r2 = r0.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.AnonymousClass143.A0A(r2, r8, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r3 = r8.size()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3Qa r2 = r13.A1J     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.11F r2 = r2.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r2 = X.AnonymousClass143.A0G(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x17a6
            X.0yC r4 = r0.A0C     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = 3168(0xc60, float:4.44E-42)
            int r2 = r4.A07(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r3 <= r2) goto L_0x17a6
        L_0x177a:
            r12.A07 = r6     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r18
            r12.A09 = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r6 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.0yC r4 = r0.A0C     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3Qa r3 = r6.A1J     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.11F r1 = r3.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r2 = r1 instanceof X.C177528dw     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 0
            if (r2 == 0) goto L_0x1828
            boolean r2 = r3.A02     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x1828
            boolean r2 = X.C66013Ui.A0n(r6)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 != 0) goto L_0x1828
            r2 = 4905(0x1329, float:6.873E-42)
            boolean r2 = r4.A0E(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x1828
            X.3GP r2 = r6.A0c     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r3 = r2.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r3 == 0) goto L_0x1823
            goto L_0x1819
        L_0x17a6:
            X.1DU r3 = r0.A0J     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = 0
            X.AnonymousClass00C.A0D(r3, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r2 = r13 instanceof X.AnonymousClass2bV     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r7 = 0
            if (r2 == 0) goto L_0x17d6
            java.lang.String r2 = r13.A0b()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r4 = r3.A03(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = r13
            X.2bV r2 = (X.AnonymousClass2bV) r2     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = r2.A06     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x17c8
            int r3 = r2.length()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r3 == 0) goto L_0x17c8
            r4 = r2
            goto L_0x17ca
        L_0x17c8:
            if (r4 == 0) goto L_0x17d6
        L_0x17ca:
            java.lang.String r2 = X.AnonymousClass1DU.A01(r4)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r7 = X.AnonymousClass3TO.A02(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x17d6:
            X.6Sm r6 = r0.A0L     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.2bV r13 = (X.AnonymousClass2bV) r13     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.0wQ r2 = r6.A00     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.PhoneUserJid r2 = X.C36441kJ.A0n(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 != 0) goto L_0x17e4
            r4 = 0
            goto L_0x17e8
        L_0x17e4:
            byte[] r4 = r6.A01(r2, r13, r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x17e8:
            java.util.HashMap r3 = X.AnonymousClass001.A0J()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x17f0:
            boolean r1 = r14.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1808
            java.lang.Object r2 = r14.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ OutOfMemoryError -> 0x1b74 }
            byte[] r1 = r6.A01(r2, r13, r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1803
            goto L_0x1807
        L_0x1803:
            r3.put(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x17f0
        L_0x1807:
            r3 = 0
        L_0x1808:
            if (r4 == 0) goto L_0x1813
            if (r3 == 0) goto L_0x1813
            X.66q r6 = new X.66q     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r6.<init>(r8, r3, r4)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x177a
        L_0x1813:
            r6 = 0
            goto L_0x177a
        L_0x1816:
            r1 = 0
            goto L_0x1746
        L_0x1819:
            r2 = 1
            if (r3 == r2) goto L_0x1820
            r2 = 2
            if (r3 != r2) goto L_0x1828
            goto L_0x1826
        L_0x1820:
            java.lang.String r1 = "allowlist"
            goto L_0x1828
        L_0x1823:
            java.lang.String r1 = "contacts"
            goto L_0x1828
        L_0x1826:
            java.lang.String r1 = "denylist"
        L_0x1828:
            r12.A0P = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A08 = r11     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r12.A01 = r9     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r4 = 1
            if (r18 == 0) goto L_0x1832
            goto L_0x1834
        L_0x1832:
            r4 = 0
            goto L_0x1857
        L_0x1834:
            X.005 r1 = r0.A0R     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.get()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r1 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r2 = r1.A1I     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 88
            if (r2 != r1) goto L_0x1832
            X.11F r1 = X.C222713q.A00(r37)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = X.C197029b1.A00(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1832
            r1 = r37
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1857
            boolean r1 = X.AnonymousClass143.A0G(r37)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1832
        L_0x1857:
            X.3T1 r3 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 0
            X.AnonymousClass00C.A0D(r3, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r2 = r3.A1I     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 88
            if (r2 != r1) goto L_0x1887
            int r2 = r3.A0F()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x1887
            X.8za r1 = X.C188438za.BIZ_FEEDBACK     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x186e:
            r12.A0A = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9Xd r4 = r12.A00()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.19A r3 = r0.A0y     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = 0
            r1 = 8
            r6 = r35
            android.os.Message r1 = android.os.Message.obtain(r6, r2, r1, r2, r4)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = r36
            X.777 r1 = r3.A05(r1, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1907
        L_0x1887:
            if (r4 != 0) goto L_0x1903
            X.005 r1 = r0.A0R     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.Object r3 = r1.get()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1HX r3 = (X.AnonymousClass1HX) r3     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r1 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r2 = r1.A1I     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r37
            boolean r1 = r3.A05(r1, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1903
            X.3T1 r3 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r2 = r3.A1I     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 87
            if (r2 != r1) goto L_0x18a8
            X.8za r1 = X.C188438za.REQUEST_WELCOME     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x186e
        L_0x18a8:
            if (r10 == 0) goto L_0x1900
            boolean r1 = r3 instanceof X.AnonymousClass2bV     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1900
            X.1KK r1 = r0.A04     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9uZ r2 = r1.A07(r10)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r2 == 0) goto L_0x1900
            java.util.List r1 = r2.A0P     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.List r4 = r2.A0S     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r2 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r3 = r2.A0b()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = 0
            if (r3 == 0) goto L_0x1900
            int r6 = r3.length()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r6 == 0) goto L_0x1900
            java.util.Iterator r6 = r1.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x18cd:
            boolean r1 = r6.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x18e4
            java.lang.Object r1 = r6.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3uw r1 = (X.C80153uw) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = r1.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = X.AnonymousClass099.A0O(r3, r1, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x18cd
            X.8za r1 = X.C188438za.COMMAND     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x186e
        L_0x18e4:
            java.util.Iterator r2 = r4.iterator()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x18e8:
            boolean r1 = r2.hasNext()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1900
            java.lang.Object r1 = r2.next()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.69W r1 = (X.AnonymousClass69W) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r1 = r1.A01     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = X.AnonymousClass00C.A0J(r1, r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x18e8
            X.8za r1 = X.C188438za.PROMPT     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x186e
        L_0x1900:
            r1 = 0
            goto L_0x186e
        L_0x1903:
            X.8za r1 = X.C188438za.CONSUMER_FEEDBACK     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x186e
        L_0x1907:
            r1.get()     // Catch:{ Exception -> 0x1af6 }
            X.3T1 r1 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r3 = 3
            r2 = r38
            r4 = r27
            r5 = r31
            r6 = r49
            r7 = r17
            r0.A0E(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r0.A07()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1949
            X.1DT r3 = r0.A0f     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.3T1 r2 = r0.A0O     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.util.HashSet r1 = r0.targetDeviceRawJids     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r48 = r1.size()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            boolean r1 = r0.A1D     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r45 = 1
            r46 = 1
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 1
            r42 = r3
            r43 = r2
            r44 = r35
            r47 = r5
            r55 = r1
            r42.A0P(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1949:
            if (r17 == 0) goto L_0x194f
            boolean r1 = r0.forceSenderKeyDistribution     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1be8
        L_0x194f:
            if (r16 == 0) goto L_0x1be8
            if (r29 == 0) goto L_0x1be8
            boolean r1 = r29.isEmpty()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1be8
            java.util.Set r2 = r29.keySet()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r38
            r2.retainAll(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r30
            X.144 r1 = (X.AnonymousClass144) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r30 = r1
            boolean r1 = r0.useLidForEncryption     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x19a5
            X.0wQ r1 = r0.A03     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.8du r1 = r1.A07()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1972:
            X.C18740tg.A06(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.189 r5 = r0.A0j     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r4 = r30.getRawString()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.6EZ r1 = X.C133256Xm.A02(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.6EU r3 = new X.6EU     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r3.<init>(r1, r4)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.18k r1 = r5.A0A     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9HA r1 = r1.A03(r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1aef
            boolean r1 = r0.useLidForEncryption     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1a26
            X.17X r3 = r0.A09     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r30
            boolean r1 = r3.A0B(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 != 0) goto L_0x1a26
            X.17X r3 = r0.A09     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.12P r1 = r3.A06     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1M0 r9 = r1.A05()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x19ad
        L_0x19a5:
            X.0wQ r1 = r0.A03     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.A0G()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.13x r1 = r1.A02     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1972
        L_0x19ad:
            X.71s r8 = r9.B1k()     // Catch:{ all -> 0x1ae3 }
            X.17r r4 = r3.A07     // Catch:{ all -> 0x1ad9 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1ad9 }
            java.lang.String r1 = "participant-user-store/markParticipantsAsHavingAddOnSenderKey/"
            X.C36321k7.A1K(r2, r1, r3)     // Catch:{ all -> 0x1ad9 }
            X.12P r1 = r4.A06     // Catch:{ all -> 0x1ad9 }
            X.1M0 r7 = r1.A05()     // Catch:{ all -> 0x1ad9 }
            X.71s r6 = r7.B1k()     // Catch:{ all -> 0x1acf }
            X.17w r5 = r4.A07     // Catch:{ all -> 0x1ac5 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1ac5 }
            java.lang.String r1 = "participant-device-store/markDevicesAsHavingAddOnSenderKey: "
            r3.append(r1)     // Catch:{ all -> 0x1ac5 }
            r1 = r30
            r3.append(r1)     // Catch:{ all -> 0x1ac5 }
            java.lang.String r1 = " "
            X.C36321k7.A1K(r2, r1, r3)     // Catch:{ all -> 0x1ac5 }
            java.lang.String r3 = "UPDATE group_participant_device SET sent_add_on_sender_key = ? WHERE device_jid_row_id = ? AND group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)"
            r1 = r30
            X.C232817w.A00(r5, r1, r3, r2)     // Catch:{ all -> 0x1ac5 }
            X.6X6 r1 = r4.A0C(r1)     // Catch:{ all -> 0x1ac5 }
            java.util.Map r1 = r1.A07     // Catch:{ all -> 0x1ac5 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x1ac5 }
            X.0y7 r1 = X.C20760y7.copyOf((java.util.Collection) r1)     // Catch:{ all -> 0x1ac5 }
            X.14x r5 = r1.iterator()     // Catch:{ all -> 0x1ac5 }
        L_0x19f4:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x1ac5 }
            if (r1 == 0) goto L_0x1ab1
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x1ac5 }
            X.6PM r1 = (X.AnonymousClass6PM) r1     // Catch:{ all -> 0x1ac5 }
            java.util.concurrent.ConcurrentHashMap r1 = r1.A04     // Catch:{ all -> 0x1ac5 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x1ac5 }
            X.0y7 r1 = X.C20760y7.copyOf((java.util.Collection) r1)     // Catch:{ all -> 0x1ac5 }
            X.14x r4 = r1.iterator()     // Catch:{ all -> 0x1ac5 }
        L_0x1a0e:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x1ac5 }
            if (r1 == 0) goto L_0x19f4
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x1ac5 }
            X.6B1 r3 = (X.AnonymousClass6B1) r3     // Catch:{ all -> 0x1ac5 }
            com.whatsapp.jid.DeviceJid r1 = r3.A02     // Catch:{ all -> 0x1ac5 }
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x1ac5 }
            if (r1 == 0) goto L_0x1a0e
            r1 = 1
            r3.A00 = r1     // Catch:{ all -> 0x1ac5 }
            goto L_0x1a0e
        L_0x1a26:
            X.17X r3 = r0.A09     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.12P r1 = r3.A06     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.1M0 r9 = r1.A05()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.71s r8 = r9.B1k()     // Catch:{ all -> 0x1ae3 }
            X.17r r4 = r3.A07     // Catch:{ all -> 0x1ad9 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1ad9 }
            java.lang.String r1 = "participant-user-store/markParticipantsAsHavingSenderKey/"
            X.C36321k7.A1K(r2, r1, r3)     // Catch:{ all -> 0x1ad9 }
            X.12P r1 = r4.A06     // Catch:{ all -> 0x1ad9 }
            X.1M0 r7 = r1.A05()     // Catch:{ all -> 0x1ad9 }
            X.71s r6 = r7.B1k()     // Catch:{ all -> 0x1acf }
            X.17w r5 = r4.A07     // Catch:{ all -> 0x1ac5 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1ac5 }
            java.lang.String r1 = "participant-device-store/markDevicesAsHavingSenderKey: "
            r3.append(r1)     // Catch:{ all -> 0x1ac5 }
            r1 = r30
            r3.append(r1)     // Catch:{ all -> 0x1ac5 }
            java.lang.String r1 = " "
            X.C36321k7.A1K(r2, r1, r3)     // Catch:{ all -> 0x1ac5 }
            java.lang.String r3 = "UPDATE group_participant_device SET sent_sender_key = ? WHERE device_jid_row_id = ? AND group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)"
            r1 = r30
            X.C232817w.A00(r5, r1, r3, r2)     // Catch:{ all -> 0x1ac5 }
            X.6X6 r4 = r4.A0C(r1)     // Catch:{ all -> 0x1ac5 }
            int r3 = r4.A00     // Catch:{ all -> 0x1ac5 }
            r1 = 3
            if (r1 != r3) goto L_0x1aac
            java.util.Map r1 = r4.A07     // Catch:{ all -> 0x1ac5 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x1ac5 }
            X.0y7 r1 = X.C20760y7.copyOf((java.util.Collection) r1)     // Catch:{ all -> 0x1ac5 }
        L_0x1a76:
            X.14x r5 = r1.iterator()     // Catch:{ all -> 0x1ac5 }
        L_0x1a7a:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x1ac5 }
            if (r1 == 0) goto L_0x1ab1
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x1ac5 }
            X.6PM r1 = (X.AnonymousClass6PM) r1     // Catch:{ all -> 0x1ac5 }
            java.util.concurrent.ConcurrentHashMap r1 = r1.A04     // Catch:{ all -> 0x1ac5 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x1ac5 }
            X.0y7 r1 = X.C20760y7.copyOf((java.util.Collection) r1)     // Catch:{ all -> 0x1ac5 }
            X.14x r4 = r1.iterator()     // Catch:{ all -> 0x1ac5 }
        L_0x1a94:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x1ac5 }
            if (r1 == 0) goto L_0x1a7a
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x1ac5 }
            X.6B1 r3 = (X.AnonymousClass6B1) r3     // Catch:{ all -> 0x1ac5 }
            com.whatsapp.jid.DeviceJid r1 = r3.A02     // Catch:{ all -> 0x1ac5 }
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x1ac5 }
            if (r1 == 0) goto L_0x1a94
            r1 = 1
            r3.A01 = r1     // Catch:{ all -> 0x1ac5 }
            goto L_0x1a94
        L_0x1aac:
            X.0y7 r1 = r4.A07()     // Catch:{ all -> 0x1ac5 }
            goto L_0x1a76
        L_0x1ab1:
            r6.A00()     // Catch:{ all -> 0x1ac5 }
            r6.close()     // Catch:{ all -> 0x1acf }
            r7.close()     // Catch:{ all -> 0x1ad9 }
            r8.A00()     // Catch:{ all -> 0x1ad9 }
            r8.close()     // Catch:{ all -> 0x1ae3 }
            r9.close()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1be8
        L_0x1ac5:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x1aca }
            goto L_0x1ace
        L_0x1aca:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x1acf }
        L_0x1ace:
            throw r2     // Catch:{ all -> 0x1acf }
        L_0x1acf:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x1ad4 }
            goto L_0x1ad8
        L_0x1ad4:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x1ad9 }
        L_0x1ad8:
            throw r2     // Catch:{ all -> 0x1ad9 }
        L_0x1ad9:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x1ade }
            goto L_0x1ae2
        L_0x1ade:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x1ae3 }
        L_0x1ae2:
            throw r2     // Catch:{ all -> 0x1ae3 }
        L_0x1ae3:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x1ae9 }
            goto L_0x1b73
        L_0x1ae9:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x1aef:
            java.lang.String r1 = "SendE2EMessageJob/onRun/senderKey doesn't exist after receiving the ack"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1be8
        L_0x1af6:
            r4 = move-exception
            r1 = 1
            r0.A1D = r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.0yC r2 = r0.A0C     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = 2472(0x9a8, float:3.464E-42)
            boolean r1 = r2.A0E(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            if (r1 == 0) goto L_0x1b18
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = "SendE2EMessageJob/storing encrypted payload for:"
            r1 = r39
            X.C36321k7.A1Q(r2, r1, r3)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            X.9KM r3 = new X.9KM     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1 = r28
            r3.<init>(r5, r15, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r0.A0I = r3     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1b18:
            throw r4     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1b19:
            if (r18 == 0) goto L_0x1b1f
            r67.A07()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b22
        L_0x1b1f:
            r67.A0G()     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1b22:
            X.C18740tg.A06(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            int r2 = r3.A00(r8)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            com.whatsapp.jobqueue.job.exception.EncryptionFailException r1 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.<init>(r8, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x1b2f:
            java.lang.String r1 = "sende2emessagejob/missing broadcast setting"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = 4
            com.whatsapp.jobqueue.job.exception.EncryptionFailException r1 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.<init>(r9, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x1b3b:
            int r1 = r3.A00(r8)     // Catch:{ all -> 0x1b45 }
            com.whatsapp.jobqueue.job.exception.EncryptionFailException r2 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException     // Catch:{ all -> 0x1b45 }
            r2.<init>(r8, r1)     // Catch:{ all -> 0x1b45 }
        L_0x1b44:
            throw r2     // Catch:{ all -> 0x1b45 }
        L_0x1b45:
            r1 = move-exception
            r5.A01()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x1b4a:
            java.lang.String r1 = "sende2emessagejob/missing broadcast setting"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r2 = 4
            com.whatsapp.jobqueue.job.exception.EncryptionFailException r1 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException     // Catch:{ OutOfMemoryError -> 0x1b74 }
            r1.<init>(r7, r2)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x1b56:
            int r1 = r3.A00(r5)     // Catch:{ all -> 0x1b60 }
            com.whatsapp.jobqueue.job.exception.EncryptionFailException r2 = new com.whatsapp.jobqueue.job.exception.EncryptionFailException     // Catch:{ all -> 0x1b60 }
            r2.<init>(r5, r1)     // Catch:{ all -> 0x1b60 }
        L_0x1b5f:
            throw r2     // Catch:{ all -> 0x1b60 }
        L_0x1b60:
            r1 = move-exception
            r15.A01()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            goto L_0x1b73
        L_0x1b65:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.String r2 = "Error when calling signalCoordinator.encryptForGroup(); status="
            java.lang.String r1 = X.AnonymousClass000.A0r(r2, r3, r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
            java.lang.AssertionError r1 = X.C90524aI.A0Y(r1)     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1b73:
            throw r1     // Catch:{ OutOfMemoryError -> 0x1b74 }
        L_0x1b74:
            r5 = move-exception
            r2 = r40
            r1 = r39
            java.lang.StringBuilder r3 = X.C36331k8.A0k(r2, r1)     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r2 = " :forceOneOneEncryption="
            r1 = r17
            java.lang.String r1 = X.C36371kC.A0z(r2, r3, r1)     // Catch:{ RuntimeException -> 0x1c07 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ RuntimeException -> 0x1c07 }
            X.0wN r4 = r0.A01     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r1 = "msg-send-failure-oom-"
            r2.append(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            X.3T1 r1 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            int r1 = X.AnonymousClass3UK.A05(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r3 = X.C36381kD.A10(r2, r1)     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            int r1 = r0.messageType     // Catch:{ RuntimeException -> 0x1c07 }
            r2.append(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r41
            r2.append(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r17
            r2.append(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = r41
            r2.append(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            int r1 = r38.size()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r2 = X.C36381kD.A10(r2, r1)     // Catch:{ RuntimeException -> 0x1c07 }
            r1 = 0
            r4.A0E(r3, r2, r1)     // Catch:{ RuntimeException -> 0x1c07 }
            X.3T1 r2 = r0.A0O     // Catch:{ RuntimeException -> 0x1c07 }
            if (r2 == 0) goto L_0x1bd4
            boolean r1 = r0.A0T     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x1bd4
            boolean r1 = r2 instanceof X.AnonymousClass2bM     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x1bd4
            boolean r1 = r2 instanceof X.AnonymousClass0p5     // Catch:{ RuntimeException -> 0x1c07 }
            if (r1 != 0) goto L_0x1bd4
            if (r27 > 0) goto L_0x1bd4
            goto L_0x1c06
        L_0x1bd4:
            if (r17 == 0) goto L_0x1bd8
            r2 = 1
            goto L_0x1be0
        L_0x1bd8:
            if (r16 == 0) goto L_0x1bdf
            boolean r1 = r0.includeSenderKeysInMessage     // Catch:{ RuntimeException -> 0x1c07 }
            r2 = 2
            if (r1 != 0) goto L_0x1be0
        L_0x1bdf:
            r2 = 0
        L_0x1be0:
            com.whatsapp.jobqueue.job.exception.OutOfMemoryException r1 = new com.whatsapp.jobqueue.job.exception.OutOfMemoryException     // Catch:{ RuntimeException -> 0x1c07 }
            r1.<init>(r2)     // Catch:{ RuntimeException -> 0x1c07 }
            goto L_0x0515
        L_0x1be7:
            return
        L_0x1be8:
            java.util.concurrent.ConcurrentHashMap r6 = A1E     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r5 = r0.jid     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r4 = r0.id     // Catch:{ RuntimeException -> 0x1c07 }
            int r3 = r0.editVersion     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r2 = r0.participant     // Catch:{ RuntimeException -> 0x1c07 }
            X.9UO r1 = new X.9UO     // Catch:{ RuntimeException -> 0x1c07 }
            r1.<init>(r5, r4, r2, r3)     // Catch:{ RuntimeException -> 0x1c07 }
            r6.remove(r1)     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x1c07 }
            java.lang.String r2 = "SendE2EMessageJob/e2e message send job finished"
            r1 = r39
            X.C36321k7.A1Q(r2, r1, r3)     // Catch:{ RuntimeException -> 0x1c07 }
            return
        L_0x1c06:
            throw r5     // Catch:{ RuntimeException -> 0x1c07 }
        L_0x1c07:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            r2 = r40
            r1 = r39
            X.C90464aC.A1L(r2, r1, r3, r4)
            X.0yC r1 = r0.A0C
            r0 = 7962(0x1f1a, float:1.1157E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x1c1e
            throw r4
        L_0x1c1e:
            com.whatsapp.jobqueue.job.exception.UnrecoverableErrorException r0 = new com.whatsapp.jobqueue.job.exception.UnrecoverableErrorException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.A0B():void");
    }
}
