package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass12O;
import X.AnonymousClass187;
import X.AnonymousClass189;
import X.AnonymousClass195;
import X.AnonymousClass19A;
import X.AnonymousClass1AG;
import X.AnonymousClass1AI;
import X.AnonymousClass1M0;
import X.AnonymousClass1XT;
import X.AnonymousClass630;
import X.AnonymousClass7i8;
import X.AnonymousClass8NL;
import X.AnonymousClass8NN;
import X.AnonymousClass9K2;
import X.AnonymousClass9T2;
import X.AnonymousClass9YT;
import X.C110545aq;
import X.C133256Xm;
import X.C163737qg;
import X.C165607th;
import X.C170918Hz;
import X.C177508du;
import X.C180988mk;
import X.C180998ml;
import X.C181018mn;
import X.C18740tg;
import X.C18800tq;
import X.C1899396e;
import X.C19730wQ;
import X.C20520xh;
import X.C207209uj;
import X.C20760y7;
import X.C223313w;
import X.C231417i;
import X.C236919l;
import X.C25311Fu;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36411kG;
import X.C36441kJ;
import X.C61883Du;
import X.C64933Qa;
import X.C90524aI;
import android.content.ContentValues;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement;
import com.whatsapp.util.Log;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

public class SendPeerMessageJob extends Job implements AnonymousClass7i8 {
    public static final DeviceJid[] A0D = new DeviceJid[0];
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1XT A00;
    public transient AnonymousClass189 A01;
    public transient AnonymousClass187 A02;
    public transient C20520xh A03;
    public transient C19730wQ A04;
    public transient AnonymousClass1AG A05;
    public transient AnonymousClass12O A06;
    public transient C231417i A07;
    public transient AnonymousClass1AI A08;
    public transient AnonymousClass19A A09;
    public transient C236919l A0A;
    public transient C61883Du A0B;
    public final transient byte[] A0C;
    public final long peerMessageRowId;
    public final int retryCount;

    public SendPeerMessageJob(DeviceJid deviceJid, C181018mn r4) {
        this(deviceJid, r4, (byte[]) null, 0);
    }

    public void A0B() {
        String str;
        AnonymousClass630 r7;
        LinkedList linkedList;
        String str2;
        String str3;
        boolean A0L = this.A04.A0L();
        if (this.A0A.A01.A2H() || A0L) {
            if (C36441kJ.A0n(this.A04) == null) {
                str = "SendPeerMessageJob/onRun/no my user id (unregistered?).";
            } else {
                C181018mn A022 = this.A08.A02(this.peerMessageRowId);
                if (A022 == null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("SendPeerMessageJob/onRun/no message found (");
                    A0u.append(this.peerMessageRowId);
                    str = AnonymousClass000.A0q(").", A0u);
                } else {
                    DeviceJid deviceJid = A022.A00;
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("SendPeerMessageJob/onRun/start send");
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append("; peer_msg_row_id=");
                    A0u2.append(C36411kG.A11(A0u3, this.peerMessageRowId));
                    A0u2.append("; type=");
                    int i = A022.A1I;
                    A0u2.append(i);
                    A0u2.append("; recipient=");
                    A0u2.append(deviceJid);
                    A0u2.append("; id=");
                    C64933Qa r12 = A022.A1J;
                    String str4 = r12.A01;
                    C36321k7.A1a(A0u2, str4);
                    C20760y7 A023 = this.A07.A02();
                    if (deviceJid == null || A023.isEmpty()) {
                        str = "SendPeerMessageJob/onRun/no target device or no companion device exists.";
                    } else if (!A023.contains(deviceJid)) {
                        str = "SendPeerMessageJob/onRun/target device is not in db.";
                    } else {
                        AnonymousClass9YT A002 = AnonymousClass9YT.A00(deviceJid);
                        A002.A05 = "message";
                        A002.A07 = str4;
                        AnonymousClass8NL A0D2 = C170918Hz.A0D();
                        try {
                            this.A03.A02(C1899396e.A00(A0D2).A00(), A022);
                        } catch (C25311Fu unused) {
                            C36321k7.A1J(r12, "SendPeerMessageJob/getPlaintextFromE2EForOwn/fail to build protobuf message, key=", AnonymousClass000.A0u());
                        }
                        byte[] A0N = AnonymousClass8NN.A0N(A0D2);
                        try {
                            if (this.A01.A0X()) {
                                AnonymousClass9K2 A092 = this.A01.A09(C133256Xm.A02(deviceJid), A0N);
                                r7 = new AnonymousClass630(A092.A02, 2, C110545aq.A00(A092.A00));
                            } else {
                                r7 = (AnonymousClass630) this.A02.A00.submit(new C163737qg(this, deviceJid, A0N, 2)).get();
                            }
                        } catch (Exception unused2) {
                            StringBuilder A0u4 = AnonymousClass000.A0u();
                            C36321k7.A1Z(A0u4, C165607th.A0r(deviceJid, "SendPeerMessageJob/getEncryptedMessage/fail to get the preKey, jid=", A0u4));
                            r7 = null;
                        }
                        List A012 = this.A03.A01(A022);
                        PhoneUserJid phoneUserJid = null;
                        if (A012 != null) {
                            linkedList = C90524aI.A0l();
                            linkedList.addAll(A012);
                        } else {
                            linkedList = null;
                        }
                        if (A022.A0M == null || this.retryCount <= 0) {
                            str2 = "text";
                        } else {
                            str2 = "pay";
                        }
                        if (i != 73 && r12.A02 && (deviceJid instanceof C177508du)) {
                            phoneUserJid = this.A06.A0A((C223313w) deviceJid.userJid);
                        }
                        String A003 = this.A0B.A00(deviceJid, A022, r12);
                        C207209uj A013 = A002.A01();
                        AnonymousClass9T2 r10 = new AnonymousClass9T2(deviceJid, r12, A013, this.retryCount, i, 0);
                        r10.A05 = phoneUserJid;
                        r10.A0O = A003;
                        r10.A0J = A022.A0s;
                        r10.A0L = str2;
                        r10.A0B = r7;
                        r10.A02 = A022.A0F();
                        r10.A0R = linkedList;
                        r10.A00 = A022.A01;
                        r10.A0F = Integer.valueOf(A022.A05);
                        r10.A0H = "peer";
                        if ((A022 instanceof C180998ml) || (A022 instanceof C180988mk)) {
                            str3 = "high";
                        } else {
                            str3 = null;
                        }
                        r10.A0N = str3;
                        this.A09.A05(Message.obtain((Handler) null, 0, 8, 0, r10.A00()), A013).get();
                        A022.A01 = true;
                        AnonymousClass1AI r5 = this.A08;
                        long j = A022.A1N;
                        C18740tg.A00();
                        AnonymousClass1M0 A042 = r5.A00.A04();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("acked", 1);
                            if (((long) A042.A02.A01(contentValues, "peer_messages", "_id = ?", "PeerMessagesTable.SET_MESSAGE_ACKED", new String[]{Long.toString(j)})) == 0) {
                                C36341k9.A1M("peer-messages-store/markAckReceived/cannot set ack received for message: ", AnonymousClass000.A0u(), j);
                            }
                            A042.close();
                            Iterator A0s = C36361kB.A0s(this.A05);
                            while (A0s.hasNext()) {
                                ((AnonymousClass195) A0s.next()).BXE(A022);
                            }
                            StringBuilder A0u5 = AnonymousClass000.A0u();
                            A0u5.append("SendPeerMessageJob/onRun/end send");
                            StringBuilder A0u6 = AnonymousClass000.A0u();
                            A0u6.append("; peer_msg_row_id=");
                            A0u5.append(C36411kG.A11(A0u6, this.peerMessageRowId));
                            C36321k7.A1Q("; id=", str4, A0u5);
                            return;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                            throw th;
                        }
                    }
                }
            }
            Log.e(str);
            return;
        }
        Log.w("SendPeerMessageJob/onRun/wap4 disable.");
    }

    public void A09() {
        Set singleton;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SendPeerMessageJob/onAdded/job added=");
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("; peer_msg_row_id=");
        C36321k7.A1a(A0u, C36411kG.A11(A0u2, this.peerMessageRowId));
        for (Requirement requirement : this.parameters.requirements) {
            if (requirement instanceof AxolotlPeerDeviceSessionRequirement) {
                AxolotlPeerDeviceSessionRequirement axolotlPeerDeviceSessionRequirement = (AxolotlPeerDeviceSessionRequirement) requirement;
                DeviceJid nullable = DeviceJid.getNullable(axolotlPeerDeviceSessionRequirement.targetJidRawString);
                C18740tg.A06(nullable);
                if (!axolotlPeerDeviceSessionRequirement.A01.A02().contains(nullable) || axolotlPeerDeviceSessionRequirement.A00.A0Z(C133256Xm.A02(nullable))) {
                    singleton = Collections.emptySet();
                } else {
                    singleton = Collections.singleton(nullable);
                }
            } else if (requirement instanceof AxolotlDifferentAliceBaseKeyRequirement) {
                AxolotlDifferentAliceBaseKeyRequirement axolotlDifferentAliceBaseKeyRequirement = (AxolotlDifferentAliceBaseKeyRequirement) requirement;
                if (!axolotlDifferentAliceBaseKeyRequirement.BMk()) {
                    singleton = Collections.singleton(axolotlDifferentAliceBaseKeyRequirement.A00);
                }
            }
            if (!singleton.isEmpty()) {
                this.A00.A04((DeviceJid[]) singleton.toArray(A0D), 5, false);
            }
        }
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SendPeerMessageJob/onCanceled/cancel send job");
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("; peer_msg_row_id=");
        C36341k9.A1O(A0u, C36411kG.A11(A0u2, this.peerMessageRowId));
    }

    public boolean A0D(Exception exc) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SendPeerMessageJob/onShouldReply/exception while running");
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("; peer_msg_row_id=");
        C36351kA.A1P(C36411kG.A11(A0u2, this.peerMessageRowId), A0u, exc);
        return true;
    }

    public void Bqf(Context context) {
        C18800tq A0P = C36371kC.A0P(context);
        this.A04 = C36351kA.A0N(A0P);
        this.A09 = C36361kB.A0c(A0P);
        this.A02 = (AnonymousClass187) A0P.A7n.get();
        this.A06 = (AnonymousClass12O) A0P.A98.get();
        this.A08 = (AnonymousClass1AI) A0P.A6Q.get();
        this.A01 = A0P.AzT();
        this.A07 = (C231417i) A0P.A8k.get();
        this.A0A = (C236919l) A0P.A5Q.get();
        this.A00 = (AnonymousClass1XT) A0P.A6b.get();
        this.A0B = (C61883Du) A0P.AfI.A00.A3Z.get();
        this.A03 = (C20520xh) A0P.A3N.get();
        this.A05 = (AnonymousClass1AG) A0P.A6P.get();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPeerMessageJob(com.whatsapp.jid.DeviceJid r5, X.C181018mn r6, byte[] r7, int r8) {
        /*
            r4 = this;
            int r2 = r6.A1I
            r0 = 35
            if (r2 == r0) goto L_0x0087
            r0 = 47
            if (r2 == r0) goto L_0x0084
            r0 = 50
            if (r2 == r0) goto L_0x0081
            r0 = 84
            if (r2 == r0) goto L_0x007e
            r0 = 38
            if (r2 == r0) goto L_0x007b
            r0 = 39
            if (r2 == r0) goto L_0x0078
            r0 = 70
            if (r2 == r0) goto L_0x0075
            r0 = 71
            if (r2 == r0) goto L_0x0072
            r0 = 75
            if (r2 == r0) goto L_0x006f
            r0 = 76
            if (r2 != r0) goto L_0x008a
            java.lang.String r1 = "peer_data_sticker_request_response"
        L_0x002c:
            X.673 r3 = new X.673
            r3.<init>()
            r0 = 1
            r3.A01 = r0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r1)
            java.lang.String r0 = "-"
            r2.append(r0)
            long r0 = r6.A1N
            java.lang.String r0 = X.C36411kG.A11(r2, r0)
            r3.A00 = r0
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.A02(r0)
            com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement
            r0.<init>(r5)
            r3.A02(r0)
            if (r7 == 0) goto L_0x005f
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r5, r7)
            r3.A02(r0)
        L_0x005f:
            org.whispersystems.jobqueue.JobParameters r0 = r3.A01()
            r4.<init>(r0)
            long r0 = r6.A1N
            r4.peerMessageRowId = r0
            r4.A0C = r7
            r4.retryCount = r8
            return
        L_0x006f:
            java.lang.String r1 = "peer_data_link_preview_request_response"
            goto L_0x002c
        L_0x0072:
            java.lang.String r1 = "peer_data_request_unknown_response"
            goto L_0x002c
        L_0x0075:
            java.lang.String r1 = "peer_data_operation_request"
            goto L_0x002c
        L_0x0078:
            java.lang.String r1 = "syncd-key-request"
            goto L_0x002c
        L_0x007b:
            java.lang.String r1 = "syncd-key-share"
            goto L_0x002c
        L_0x007e:
            java.lang.String r1 = "peer_data_placeholder_resend_response"
            goto L_0x002c
        L_0x0081:
            java.lang.String r1 = "syncd-fatal-exception-notification"
            goto L_0x002c
        L_0x0084:
            java.lang.String r1 = "sync-security-settings"
            goto L_0x002c
        L_0x0087:
            java.lang.String r1 = "device-history-sync-notification"
            goto L_0x002c
        L_0x008a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Cannot send message of type "
            java.lang.RuntimeException r0 = X.C165567td.A0U(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPeerMessageJob.<init>(com.whatsapp.jid.DeviceJid, X.8mn, byte[], int):void");
    }
}
