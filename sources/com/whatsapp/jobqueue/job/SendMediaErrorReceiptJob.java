package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass19A;
import X.AnonymousClass1Y8;
import X.AnonymousClass7i8;
import X.AnonymousClass9ND;
import X.AnonymousClass9YT;
import X.C177528dw;
import X.C177618e5;
import X.C18740tg;
import X.C18750th;
import X.C18800tq;
import X.C193849Nd;
import X.C197259bO;
import X.C207209uj;
import X.C222713q;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C90464aC;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.wamsys.JniBridge;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class SendMediaErrorReceiptJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1Y8 A00;
    public transient AnonymousClass19A A01;
    public final String category;
    public final boolean mediaFromMe;
    public final byte[] mediaKey;
    public final String messageId;
    public final String myPrimaryJid;
    public final String remoteJidRawJid;
    public final String remoteResourceRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendMediaErrorReceiptJob(X.AnonymousClass11F r3, X.AnonymousClass3T1 r4, java.lang.String r5, byte[] r6) {
        /*
            r2 = this;
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = "media-error-receipt"
            r1.A00 = r0
            X.AnonymousClass673.A00(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r2.<init>(r0)
            X.3Qa r1 = r4.A1J
            X.11F r0 = r1.A00
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.getRawString()
            r2.remoteJidRawJid = r0
            X.11F r0 = r4.A0J()
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            r2.remoteResourceRawJid = r0
            java.lang.String r0 = X.AnonymousClass143.A03(r3)
            r2.myPrimaryJid = r0
            java.lang.String r0 = r1.A01
            r2.messageId = r0
            r2.mediaKey = r6
            r2.category = r5
            boolean r0 = r1.A02
            r2.mediaFromMe = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob.<init>(X.11F, X.3T1, java.lang.String, byte[]):void");
    }

    public void A0B() {
        AnonymousClass11F r9;
        boolean z;
        AnonymousClass11F r7;
        Message obtain;
        String str = this.remoteJidRawJid;
        C222713q r1 = AnonymousClass11F.A00;
        AnonymousClass11F A02 = r1.A02(str);
        AnonymousClass11F r2 = null;
        if (!TextUtils.isEmpty(this.remoteResourceRawJid)) {
            r9 = r1.A02(this.remoteResourceRawJid);
        } else {
            r9 = null;
        }
        boolean z2 = r9 instanceof C177618e5;
        String str2 = this.myPrimaryJid;
        if (str2 != null) {
            z = true;
            r7 = C222713q.A01(str2);
            C18740tg.A06(A02);
        } else {
            z = false;
            r7 = A02;
            if (z2) {
                r7 = r9;
            }
            C18740tg.A06(r7);
        }
        if (!AnonymousClass143.A0G(A02) && !(A02 instanceof C177528dw)) {
            r9 = null;
            if (z2) {
                r9 = A02;
            }
        }
        AnonymousClass9YT A002 = AnonymousClass9YT.A00(r7);
        A002.A05 = "receipt";
        A002.A08 = "server-error";
        A002.A07 = this.messageId;
        if (!z) {
            r2 = r9;
        }
        A002.A01 = r2;
        C207209uj A012 = A002.A01();
        byte[] A0H = C18750th.A0H(12);
        String str3 = this.messageId;
        AnonymousClass00C.A0D(str3, 0);
        C197259bO r0 = new C197259bO(str3);
        byte[] bArr = this.mediaKey;
        String str4 = this.messageId;
        C36321k7.A0x(bArr, str4);
        AnonymousClass1Y8.A00(bArr, A0H);
        byte[] bArr2 = (byte[]) JniBridge.jvidispatchOOOOO(0, str4, r0.A00, bArr, A0H);
        if (z) {
            obtain = Message.obtain((Handler) null, 0, 327, 0, new C193849Nd(r7, A02, r9, this.messageId, bArr2, A0H, this.mediaFromMe));
        } else {
            obtain = Message.obtain((Handler) null, 0, 77, 0, new AnonymousClass9ND(r7, r9, this.messageId, this.category, bArr2, A0H));
        }
        this.A01.A05(obtain, A012).get();
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
        A0u.append("SendMediaErrorReceiptJob/canceled send played receipts job id=");
        C36341k9.A1O(A0u, this.messageId);
    }

    public boolean A0D(Exception exc) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SendMediaErrorReceiptJob/exception while running sent played receipt job id=");
        C36351kA.A1P(this.messageId, A0u, exc);
        return true;
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A01 = C36361kB.A0c(A0I);
        this.A00 = (AnonymousClass1Y8) A0I.A7O.get();
    }
}
