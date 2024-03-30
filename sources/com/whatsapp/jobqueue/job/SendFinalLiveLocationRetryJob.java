package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass187;
import X.AnonymousClass189;
import X.AnonymousClass1PA;
import X.AnonymousClass1XT;
import X.AnonymousClass2XH;
import X.AnonymousClass630;
import X.AnonymousClass7i8;
import X.AnonymousClass8SX;
import X.C110545aq;
import X.C133256Xm;
import X.C163757qi;
import X.C18740tg;
import X.C18800tq;
import X.C19730wQ;
import X.C36321k7;
import X.C36351kA;
import X.C36411kG;
import X.C36421kH;
import X.C63593Kq;
import X.C90464aC;
import X.C90504aG;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;
import org.whispersystems.jobqueue.Job;

public final class SendFinalLiveLocationRetryJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1XT A00;
    public transient AnonymousClass189 A01;
    public transient C19730wQ A02;
    public transient AnonymousClass187 A03;
    public transient AnonymousClass2XH A04;
    public transient AnonymousClass1PA A05;
    public final String contextRawJid;
    public final double latitude;
    public final double longitude;
    public final String msgId;
    public final String rawDeviceJid;
    public final int retryCount;
    public final int timeOffset;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendFinalLiveLocationRetryJob(com.whatsapp.jid.DeviceJid r4, X.C64933Qa r5, X.C63593Kq r6, byte[] r7, int r8, int r9) {
        /*
            r3 = this;
            X.673 r2 = new X.673
            r2.<init>()
            if (r7 == 0) goto L_0x0011
            int r0 = r7.length
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0011:
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r4)
            r2.A02(r0)
            if (r7 == 0) goto L_0x0023
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r4, r7)
            r2.A02(r0)
        L_0x0023:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "final-live-location-"
            java.lang.String r0 = X.AnonymousClass000.A0l(r4, r0, r1)
            r2.A00 = r0
            X.AnonymousClass673.A00(r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A01()
            r3.<init>(r0)
            boolean r0 = X.AnonymousClass000.A1R(r9)
            X.C18740tg.A0C(r0)
            java.lang.String r0 = r4.getRawString()
            r3.rawDeviceJid = r0
            X.11F r1 = r5.A00
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = X.AnonymousClass143.A03(r1)
        L_0x0052:
            r3.contextRawJid = r0
            java.lang.String r0 = r5.A01
            r3.msgId = r0
            double r0 = r6.A00
            r3.latitude = r0
            double r0 = r6.A01
            r3.longitude = r0
            long r0 = r6.A05
            r3.timestamp = r0
            r3.timeOffset = r8
            r3.retryCount = r9
            return
        L_0x0069:
            r0 = 0
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob.<init>(com.whatsapp.jid.DeviceJid, X.3Qa, X.3Kq, byte[], int, int):void");
    }

    public void A0B() {
        AnonymousClass630 r4;
        AnonymousClass11F r3;
        C63593Kq r2 = new C63593Kq(this.A02.A09());
        r2.A00 = this.latitude;
        r2.A01 = this.longitude;
        r2.A05 = this.timestamp;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("run send final live location retry job");
        C36321k7.A1a(A0u, A00(this));
        AnonymousClass8SX A022 = this.A04.A02(r2, Integer.valueOf(this.timeOffset));
        try {
            if (this.A01.A0X()) {
                r4 = C110545aq.A01(C133256Xm.A02(DeviceJid.getNullable(this.rawDeviceJid)), this.A01, A022.A0o());
            } else {
                r4 = (AnonymousClass630) C90504aG.A0i(this.A03, new C163757qi(this, A022, 6));
            }
            DeviceJid nullable = DeviceJid.getNullable(this.rawDeviceJid);
            C18740tg.A06(nullable);
            UserJid userJid = nullable.userJid;
            AnonymousClass1PA r1 = this.A05;
            String str = this.contextRawJid;
            if (str == null) {
                r3 = null;
            } else {
                r3 = C36421kH.A0N(str);
            }
            r1.A00(userJid, r3, r4, this.msgId, this.retryCount).get();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("LocationSharingManager/encryptAndSendLocation error", e);
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("sent final live location notifications");
        C36321k7.A1a(A0u2, A00(this));
    }

    public static String A00(SendFinalLiveLocationRetryJob sendFinalLiveLocationRetryJob) {
        StringBuilder A0k = C90464aC.A0k(sendFinalLiveLocationRetryJob);
        A0k.append("; jid=");
        A0k.append(sendFinalLiveLocationRetryJob.rawDeviceJid);
        A0k.append("; msgId=");
        A0k.append(sendFinalLiveLocationRetryJob.msgId);
        A0k.append("; location.timestamp=");
        return C36411kG.A11(A0k, sendFinalLiveLocationRetryJob.timestamp);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawDeviceJid)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("jid must not be empty");
            throw C90464aC.A0N(A00(this), A0u);
        } else if (TextUtils.isEmpty(this.msgId)) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("msgId must not be empty");
            throw C90464aC.A0N(A00(this), A0u2);
        } else if (this.timestamp == 0) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("location timestamp must not be 0");
            throw C90464aC.A0N(A00(this), A0u3);
        }
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A02 = C36351kA.A0N(A0I);
        this.A04 = C36411kG.A0m(A0I);
        this.A03 = (AnonymousClass187) A0I.A7n.get();
        this.A01 = A0I.AzT();
        this.A05 = (AnonymousClass1PA) A0I.A4X.get();
        this.A00 = (AnonymousClass1XT) A0I.A6b.get();
    }
}
