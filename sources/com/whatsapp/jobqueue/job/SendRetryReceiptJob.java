package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass187;
import X.AnonymousClass189;
import X.AnonymousClass18I;
import X.AnonymousClass79X;
import X.AnonymousClass7i8;
import X.AnonymousClass9YT;
import X.B8U;
import X.C121865tq;
import X.C18800tq;
import X.C194079Oa;
import X.C19730wQ;
import X.C19980wp;
import X.C203239na;
import X.C203359nq;
import X.C207209uj;
import X.C222513o;
import X.C30831aq;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C90464aC;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class SendRetryReceiptJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C19730wQ A00;
    public transient C19980wp A01;
    public transient AnonymousClass189 A02;
    public transient AnonymousClass187 A03;
    public transient AnonymousClass18I A04;
    public transient C30831aq A05;
    public final String category;
    public final String id;
    public final String jid;
    public final int localRegistrationId;
    public final long loggableStanzaId;
    public final String participant;
    public final String recipientJid;
    public final int retryCount;
    public final int retryErrorCode;
    public final long timestamp;

    public void A09() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendRetryReceiptJob(X.C23084B3s r4, int r5, int r6) {
        /*
            r3 = this;
            X.673 r2 = new X.673
            r2.<init>()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "retry-receipt-"
            r1.append(r0)
            X.11F r0 = r4.BGb()
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r2.A00 = r0
            X.AnonymousClass673.A00(r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A01()
            r3.<init>(r0)
            com.whatsapp.jid.Jid r0 = r4.BGc()
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.getRawString()
            r3.jid = r0
            java.lang.String r0 = r4.getId()
            X.C18740tg.A06(r0)
            r3.id = r0
            com.whatsapp.jid.Jid r0 = r4.BFE()
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            r3.participant = r0
            com.whatsapp.jid.UserJid r0 = r4.BGZ()
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            r3.recipientJid = r0
            long r0 = r4.BIM()
            r3.timestamp = r0
            int r0 = r4.BGp()
            r3.retryCount = r0
            r3.localRegistrationId = r5
            long r0 = r4.BDf()
            r3.loggableStanzaId = r0
            java.lang.String r0 = r4.B9T()
            r3.category = r0
            r3.retryErrorCode = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendRetryReceiptJob.<init>(X.B3s, int, int):void");
    }

    public static Pair A00(SendRetryReceiptJob sendRetryReceiptJob) {
        AnonymousClass79X A07 = sendRetryReceiptJob.A04.A07();
        try {
            Pair A0Q = C36441kJ.A0Q(sendRetryReceiptJob.A02.A0c(), new C121865tq[]{sendRetryReceiptJob.A02.A0G(), sendRetryReceiptJob.A02.A0H()});
            if (A07 != null) {
                A07.close();
            }
            return A0Q;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0B() {
        C194079Oa r11;
        Pair pair;
        byte[] A022 = C203239na.A02(this.localRegistrationId);
        String str = this.jid;
        C222513o r1 = Jid.Companion;
        Jid A023 = r1.A02(str);
        Jid A024 = r1.A02(this.participant);
        byte[] bArr = null;
        Pair A06 = C203359nq.A06((DeviceJid) null, A023, A024);
        AnonymousClass9YT r12 = new AnonymousClass9YT();
        r12.A02 = (Jid) A06.first;
        r12.A05 = "receipt";
        r12.A08 = "retry";
        r12.A07 = this.id;
        r12.A01 = (Jid) A06.second;
        String str2 = this.category;
        if (str2 != null) {
            r12.A04 = str2;
        }
        C207209uj A012 = r12.A01();
        if (this.retryCount > 0) {
            if (this.A02.A0X()) {
                pair = A00(this);
            } else {
                AnonymousClass187 r4 = this.A03;
                pair = (Pair) r4.A00.submit(new B8U((Object) this, 18)).get();
            }
            byte[] bArr2 = (byte[]) pair.first;
            C121865tq[] r13 = (C121865tq[]) pair.second;
            C121865tq r15 = r13[0];
            C121865tq r16 = r13[1];
            if (this.A00.A0L()) {
                bArr = this.A01.A02();
            }
            String str3 = this.id;
            UserJid A0l = C36431kI.A0l(this.recipientJid);
            long j = this.timestamp;
            int i = 1 + this.retryCount;
            long j2 = this.loggableStanzaId;
            String str4 = this.category;
            String str5 = str3;
            r11 = new C194079Oa(A023, A024, A0l, r15, r16, str5, str4, A022, bArr2, bArr, (byte) 5, i, this.retryErrorCode, j, j2);
        } else {
            String str6 = this.id;
            UserJid A0l2 = C36431kI.A0l(this.recipientJid);
            long j3 = this.timestamp;
            int i2 = 1 + this.retryCount;
            long j4 = this.loggableStanzaId;
            String str7 = str6;
            r11 = new C194079Oa(A023, A024, A0l2, (C121865tq) null, (C121865tq) null, str7, this.category, A022, (byte[]) null, (byte[]) null, (byte) 0, i2, this.retryErrorCode, j3, j4);
        }
        C30831aq r42 = this.A05;
        Message obtain = Message.obtain((Handler) null, 0, 11, 0, r11);
        r42.A00((C194079Oa) obtain.obj);
        r42.A03.A05(obtain, A012).get();
    }

    public String A0E() {
        String str = this.jid;
        C222513o r1 = Jid.Companion;
        Jid A022 = r1.A02(str);
        Jid A023 = r1.A02(this.participant);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; jid=");
        A0u.append(A022);
        A0u.append("; id=");
        A0u.append(this.id);
        A0u.append("; participant=");
        A0u.append(A023);
        A0u.append("; retryCount=");
        return C36381kD.A10(A0u, this.retryCount);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (C36411kG.A0i(this.jid) == null) {
            throw new InvalidObjectException("jid must not be empty");
        } else if (TextUtils.isEmpty(this.id)) {
            throw new InvalidObjectException("id must not be empty");
        }
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("canceled sent read receipts job");
        C36341k9.A1O(A0u, A0E());
    }

    public boolean A0D(Exception exc) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("exception while running sent persistent retry job");
        C36351kA.A1P(A0E(), A0u, exc);
        return true;
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A00 = C36351kA.A0N(A0I);
        this.A04 = (AnonymousClass18I) A0I.A7o.get();
        this.A03 = (AnonymousClass187) A0I.A7n.get();
        this.A02 = A0I.AzT();
        this.A05 = (C30831aq) A0I.A59.get();
        this.A01 = (C19980wp) A0I.A1x.get();
    }
}
