package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass187;
import X.AnonymousClass189;
import X.AnonymousClass1P5;
import X.AnonymousClass1P6;
import X.AnonymousClass1PA;
import X.AnonymousClass630;
import X.AnonymousClass6EU;
import X.AnonymousClass7i8;
import X.AnonymousClass8SX;
import X.C133256Xm;
import X.C163757qi;
import X.C177518dv;
import X.C18740tg;
import X.C18800tq;
import X.C19730wQ;
import X.C222713q;
import X.C36321k7;
import X.C36351kA;
import X.C36411kG;
import X.C46902br;
import X.C63593Kq;
import X.C64933Qa;
import X.C90464aC;
import X.C90504aG;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;
import org.whispersystems.jobqueue.Job;

public final class SendFinalLiveLocationNotificationJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1P5 A00;
    public transient C19730wQ A01;
    public transient AnonymousClass189 A02;
    public transient AnonymousClass187 A03;
    public transient AnonymousClass1P6 A04;
    public transient AnonymousClass1PA A05;
    public final double latitude;
    public final double longitude;
    public final String msgId;
    public final String rawJid;
    public final int timeOffset;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendFinalLiveLocationNotificationJob(X.C64933Qa r5, X.C63593Kq r6, int r7) {
        /*
            r4 = this;
            X.673 r3 = new X.673
            r3.<init>()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "final-live-location-"
            r2.append(r0)
            X.11F r1 = r5.A00
            java.lang.String r0 = X.AnonymousClass143.A03(r1)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            r3.A00 = r0
            X.AnonymousClass673.A00(r3)
            com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            r0.<init>()
            r3.A02(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r3.A01()
            r4.<init>(r0)
            boolean r0 = r5.A02
            X.C18740tg.A0C(r0)
            X.C18740tg.A06(r1)
            java.lang.String r0 = r1.getRawString()
            r4.rawJid = r0
            java.lang.String r0 = r5.A01
            r4.msgId = r0
            double r0 = r6.A00
            r4.latitude = r0
            double r0 = r6.A01
            r4.longitude = r0
            long r0 = r6.A05
            r4.timestamp = r0
            r4.timeOffset = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob.<init>(X.3Qa, X.3Kq, int):void");
    }

    public static AnonymousClass630 A00(SendFinalLiveLocationNotificationJob sendFinalLiveLocationNotificationJob, AnonymousClass8SX r4) {
        DeviceJid A0L = sendFinalLiveLocationNotificationJob.A00.A0L();
        C18740tg.A06(A0L);
        return new AnonymousClass630(sendFinalLiveLocationNotificationJob.A02.A0A(new AnonymousClass6EU(C133256Xm.A02(A0L), C177518dv.A00.getRawString()), r4.A0o()).A02, 2, 3);
    }

    public void A0B() {
        StringBuilder sb;
        String str;
        AnonymousClass630 r3;
        C63593Kq r8 = new C63593Kq(this.A01.A09());
        r8.A00 = this.latitude;
        r8.A01 = this.longitude;
        r8.A05 = this.timestamp;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("run send final live location job");
        C36321k7.A1a(A0u, A01(this));
        AnonymousClass1P5 r9 = this.A00;
        String str2 = this.rawJid;
        C222713q r4 = AnonymousClass11F.A00;
        AnonymousClass11F A022 = r4.A02(str2);
        C18740tg.A06(A022);
        C46902br A032 = AnonymousClass1P5.A03(r9, new C64933Qa(A022, this.msgId, true));
        if (A032 != null) {
            synchronized (r9.A0R) {
                C63593Kq r1 = A032.A02;
                if (!r8.equals(r1)) {
                    if (r1 == null || r8.A05 >= r1.A05) {
                        r9.A0a(r8, A032);
                    }
                }
                AnonymousClass8SX A023 = this.A04.A02(r8, Integer.valueOf(this.timeOffset));
                try {
                    if (this.A02.A0X()) {
                        r3 = A00(this, A023);
                    } else {
                        r3 = (AnonymousClass630) C90504aG.A0i(this.A03, new C163757qi(this, A023, 5));
                    }
                    this.A05.A00(r4.A02(this.rawJid), (AnonymousClass11F) null, r3, this.msgId, 0).get();
                } catch (InterruptedException | ExecutionException e) {
                    Log.e("LocationSharingManager/encryptAndSendLocation error", e);
                }
                sb = AnonymousClass000.A0u();
                str = "sent final live location notifications";
            }
            sb.append(str);
            C36321k7.A1a(sb, A01(this));
        }
        sb = AnonymousClass000.A0u();
        str = "skip sending final live location job, final live location notification already sent";
        sb.append(str);
        C36321k7.A1a(sb, A01(this));
    }

    public static String A01(SendFinalLiveLocationNotificationJob sendFinalLiveLocationNotificationJob) {
        StringBuilder A0k = C90464aC.A0k(sendFinalLiveLocationNotificationJob);
        A0k.append("; jid=");
        A0k.append(sendFinalLiveLocationNotificationJob.rawJid);
        A0k.append("; msgId=");
        A0k.append(sendFinalLiveLocationNotificationJob.msgId);
        A0k.append("; location.timestamp=");
        return C36411kG.A11(A0k, sendFinalLiveLocationNotificationJob.timestamp);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawJid)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("jid must not be empty");
            throw C90464aC.A0N(A01(this), A0u);
        } else if (TextUtils.isEmpty(this.msgId)) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("msgId must not be empty");
            throw C90464aC.A0N(A01(this), A0u2);
        } else if (this.timestamp == 0) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("location timestamp must not be 0");
            throw C90464aC.A0N(A01(this), A0u3);
        }
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A01 = C36351kA.A0N(A0I);
        this.A03 = (AnonymousClass187) A0I.A7n.get();
        this.A04 = (AnonymousClass1P6) A0I.A0g.get();
        this.A02 = A0I.AzT();
        this.A05 = (AnonymousClass1PA) A0I.A4X.get();
        this.A00 = C36411kG.A0l(A0I);
    }
}
