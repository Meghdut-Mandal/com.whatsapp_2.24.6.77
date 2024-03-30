package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass19A;
import X.AnonymousClass7i8;
import X.AnonymousClass9YT;
import X.C177618e5;
import X.C193479Lp;
import X.C207209uj;
import X.C222713q;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36421kH;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

@Deprecated
public final class SendPlayedReceiptJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass19A A00;
    public final String messageId;
    public final String remoteJidRawJid;
    public final String remoteResourceRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPlayedReceiptJob(X.AnonymousClass3T1 r6) {
        /*
            r5 = this;
            X.673 r4 = new X.673
            r4.<init>()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "played-receipt-"
            r3.append(r0)
            X.3Qa r2 = r6.A1J
            X.11F r1 = r2.A00
            X.C18740tg.A06(r1)
            java.lang.String r0 = r1.getRawString()
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r3)
            r4.A00 = r0
            X.AnonymousClass673.A00(r4)
            org.whispersystems.jobqueue.JobParameters r0 = r4.A01()
            r5.<init>(r0)
            java.lang.String r0 = r1.getRawString()
            r5.remoteJidRawJid = r0
            X.11F r0 = r6.A0J()
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            r5.remoteResourceRawJid = r0
            java.lang.String r0 = r2.A01
            r5.messageId = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPlayedReceiptJob.<init>(X.3T1):void");
    }

    public void A0B() {
        AnonymousClass11F r1;
        String str = this.remoteJidRawJid;
        C222713q r0 = AnonymousClass11F.A00;
        AnonymousClass11F A01 = C222713q.A01(str);
        if (!TextUtils.isEmpty(this.remoteResourceRawJid)) {
            r1 = C36421kH.A0N(this.remoteResourceRawJid);
        } else {
            r1 = null;
        }
        String str2 = this.messageId;
        AnonymousClass11F r8 = r1;
        if (!(r1 instanceof C177618e5)) {
            r8 = A01;
            A01 = r1;
        }
        AnonymousClass9YT A002 = AnonymousClass9YT.A00(r8);
        A002.A05 = "receipt";
        A002.A08 = "played";
        A002.A07 = str2;
        A002.A01 = A01;
        C207209uj A012 = A002.A01();
        this.A00.A05(Message.obtain((Handler) null, 0, 38, 0, new C193479Lp(r8, A01, "played", new String[]{this.messageId})), A012).get();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.remoteJidRawJid)) {
            throw new InvalidObjectException("remoteJid must not be empty");
        } else if (TextUtils.isEmpty(this.messageId)) {
            throw new InvalidObjectException("messageId must not be empty");
        }
    }

    public void A09() {
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SendPlayedReceiptJob/canceled send played receipts job; id=");
        C36341k9.A1O(A0u, this.messageId);
    }

    public boolean A0D(Exception exc) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SendPlayedReceiptJob/exception while running sent played receipt job; id=");
        C36351kA.A1P(this.messageId, A0u, exc);
        return true;
    }

    public void Bqf(Context context) {
        this.A00 = C36361kB.A0c(C36371kC.A0P(context));
    }
}
