package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass19A;
import X.AnonymousClass19L;
import X.AnonymousClass1C5;
import X.AnonymousClass7i8;
import X.AnonymousClass9YT;
import X.C165587tf;
import X.C165617ti;
import X.C177638e7;
import X.C18800tq;
import X.C194019Nu;
import X.C201579ju;
import X.C203359nq;
import X.C207209uj;
import X.C222713q;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36411kG;
import X.C36431kI;
import X.C90464aC;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.whispersystems.jobqueue.Job;

public final class SendReadReceiptJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass19A A00;
    public transient AnonymousClass1C5 A01;
    public transient AnonymousClass19L A02;
    public final transient Throwable A03;
    public final String jid;
    public final long loggableStanzaId;
    public final String[] messageIds;
    public final long originalMessageTimestamp;
    public final String participant;
    public final String recipient;
    public final String remoteSender;
    public final boolean shouldForceReadSelfReceipt;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendReadReceiptJob(X.AnonymousClass11F r4, X.AnonymousClass11F r5, X.AnonymousClass11F r6, com.whatsapp.jid.DeviceJid r7, java.lang.String[] r8, long r9, long r11, boolean r13) {
        /*
            r3 = this;
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "read-receipt-"
            java.lang.String r0 = X.C165607th.A0r(r4, r0, r2)
            r2.append(r0)
            java.lang.String r0 = "-"
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass143.A03(r5)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            r1.A00 = r0
            X.AnonymousClass673.A00(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r3.<init>(r0)
            java.lang.String r0 = r4.getRawString()
            X.C18740tg.A06(r0)
            r3.jid = r0
            r1 = 0
            if (r5 != 0) goto L_0x007e
            r0 = r1
        L_0x0038:
            r3.participant = r0
            if (r7 != 0) goto L_0x0079
            r0 = r1
        L_0x003d:
            r3.remoteSender = r0
            if (r6 != 0) goto L_0x0074
            r0 = r1
        L_0x0042:
            r3.recipient = r0
            X.C18740tg.A0H(r8)
            r3.messageIds = r8
            r3.originalMessageTimestamp = r9
            r3.shouldForceReadSelfReceipt = r13
            r3.loggableStanzaId = r11
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0071
            if (r5 == 0) goto L_0x0071
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            r3.A03 = r0
        L_0x005c:
            int r2 = r8.length
            r1 = 0
        L_0x005e:
            if (r1 >= r2) goto L_0x006d
            r0 = r8[r1]
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "SendReadReceiptJob/can't create the job with invalid message id(s)"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x006d:
            return
        L_0x006e:
            int r1 = r1 + 1
            goto L_0x005e
        L_0x0071:
            r3.A03 = r1
            goto L_0x005c
        L_0x0074:
            java.lang.String r0 = r6.getRawString()
            goto L_0x0042
        L_0x0079:
            java.lang.String r0 = r7.getRawString()
            goto L_0x003d
        L_0x007e:
            java.lang.String r0 = r5.getRawString()
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendReadReceiptJob.<init>(X.11F, X.11F, X.11F, com.whatsapp.jid.DeviceJid, java.lang.String[], long, long, boolean):void");
    }

    private String A00() {
        String str = this.jid;
        C222713q r1 = AnonymousClass11F.A00;
        AnonymousClass11F A022 = r1.A02(str);
        AnonymousClass11F A023 = r1.A02(this.participant);
        DeviceJid nullable = DeviceJid.getNullable(this.remoteSender);
        StringBuilder A0u = AnonymousClass000.A0u();
        C165587tf.A1J(A022, "; jid=", A0u);
        A0u.append(A023);
        A0u.append("; remoteSender=");
        A0u.append(nullable);
        A0u.append("; recipient=");
        A0u.append(this.recipient);
        A0u.append("; shouldForceReadSelfReceipt=");
        A0u.append(this.shouldForceReadSelfReceipt);
        A0u.append("; ids:");
        return AnonymousClass000.A0q(Arrays.deepToString(this.messageIds), A0u);
    }

    public void A0B() {
        AnonymousClass11F A022;
        A00();
        String str = this.jid;
        C222713q r1 = AnonymousClass11F.A00;
        AnonymousClass11F A023 = r1.A02(str);
        if (A023 instanceof C177638e7) {
            A022 = null;
        } else {
            A022 = r1.A02(this.participant);
        }
        DeviceJid nullable = DeviceJid.getNullable(this.remoteSender);
        UserJid A0l = C36431kI.A0l(this.recipient);
        if (this.A01.A05(A023, this.A03, this.messageIds, this.originalMessageTimestamp, this.shouldForceReadSelfReceipt)) {
            C194019Nu A012 = this.A01.A01(A023, A022, nullable, A0l, this.messageIds, 1, this.loggableStanzaId, this.shouldForceReadSelfReceipt);
            Pair A06 = C203359nq.A06(nullable, A023, A022);
            AnonymousClass9YT r3 = new AnonymousClass9YT();
            r3.A02 = (Jid) A06.first;
            r3.A05 = "receipt";
            r3.A08 = A012.A07;
            r3.A07 = C165617ti.A0a(this.messageIds);
            r3.A01 = (Jid) A06.second;
            r3.A03 = A0l;
            r3.A00 = this.loggableStanzaId;
            C207209uj A013 = r3.A01();
            C201579ju A002 = AnonymousClass19L.A00(this.A02, 0, this.loggableStanzaId);
            if (A002 != null) {
                A002.A04(6);
            }
            this.A00.A05(Message.obtain((Handler) null, 0, 89, 0, A012), A013).get();
            A00();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (C36411kG.A0i(this.jid) == null) {
            throw new InvalidObjectException("jid must not be empty");
        } else if (this.messageIds.length == 0) {
            throw new InvalidObjectException("messageIds must not be empty");
        }
    }

    public void A09() {
        A00();
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("canceled sent read receipts job");
        C36341k9.A1O(A0u, A00());
    }

    public boolean A0D(Exception exc) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("exception while running sent read receipts job");
        C36351kA.A1P(A00(), A0u, exc);
        return true;
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A00 = C36361kB.A0c(A0I);
        this.A01 = (AnonymousClass1C5) A0I.A7B.get();
        this.A02 = (AnonymousClass19L) A0I.A4Y.get();
    }
}
