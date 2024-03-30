package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass19A;
import X.AnonymousClass1C5;
import X.AnonymousClass1M0;
import X.AnonymousClass34Z;
import X.AnonymousClass7i8;
import X.AnonymousClass9YT;
import X.C1495671s;
import X.C165587tf;
import X.C165617ti;
import X.C18800tq;
import X.C193479Lp;
import X.C194909Rs;
import X.C203359nq;
import X.C219712j;
import X.C222713q;
import X.C28981Uw;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import android.content.ContentValues;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SendPlayedReceiptJobV2 extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass34Z A00;
    public transient AnonymousClass19A A01;
    public transient AnonymousClass1C5 A02;
    public final String[] messageIds;
    public final Long[] messageRowIds;
    public final String participantRawJid;
    public final boolean playedSelfFromPeer;
    public final String toRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPlayedReceiptJobV2(X.C194909Rs r5, boolean r6) {
        /*
            r4 = this;
            X.673 r3 = new X.673
            r3.<init>()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "played-receipt-v2-"
            r2.append(r0)
            X.11F r1 = r5.A01
            java.lang.String r0 = r1.getRawString()
            X.C18740tg.A06(r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            r3.A00 = r0
            X.AnonymousClass673.A00(r3)
            org.whispersystems.jobqueue.JobParameters r0 = r3.A01()
            r4.<init>(r0)
            java.lang.String r0 = r1.getRawString()
            X.C18740tg.A06(r0)
            r4.toRawJid = r0
            X.11F r0 = r5.A00
            if (r0 != 0) goto L_0x0048
            r0 = 0
        L_0x0035:
            r4.participantRawJid = r0
            java.lang.Long[] r0 = r5.A02
            X.C18740tg.A0H(r0)
            r4.messageRowIds = r0
            java.lang.String[] r0 = r5.A03
            X.C18740tg.A0H(r0)
            r4.messageIds = r0
            r4.playedSelfFromPeer = r6
            return
        L_0x0048:
            java.lang.String r0 = r0.getRawString()
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2.<init>(X.9Rs, boolean):void");
    }

    private String A00() {
        String str = this.toRawJid;
        C222713q r1 = AnonymousClass11F.A00;
        AnonymousClass11F A022 = r1.A02(str);
        AnonymousClass11F A023 = r1.A02(this.participantRawJid);
        StringBuilder A0u = AnonymousClass000.A0u();
        C165587tf.A1J(A022, "; jid=", A0u);
        A0u.append(A023);
        A0u.append("; id=");
        String[] strArr = this.messageIds;
        C165617ti.A0g(A0u, strArr, 0);
        A0u.append("; count=");
        return C36381kD.A10(A0u, strArr.length);
    }

    public void A0B() {
        boolean z;
        String str;
        C1495671s B1k;
        String str2 = this.toRawJid;
        C222713q r0 = AnonymousClass11F.A00;
        AnonymousClass11F A012 = C222713q.A01(str2);
        String str3 = this.participantRawJid;
        C222713q r1 = AnonymousClass11F.A00;
        Pair A06 = C203359nq.A06((DeviceJid) null, A012, r1.A02(str3));
        if (!this.A02.A04(C222713q.A00((Jid) A06.first)) || (C222713q.A00((Jid) A06.first) instanceof C28981Uw)) {
            z = false;
            str = "played-self";
        } else {
            z = true;
            str = "played";
        }
        A00();
        if (!z) {
            AnonymousClass34Z r12 = this.A00;
            C194909Rs r11 = new C194909Rs(C222713q.A01(this.toRawJid), r1.A02(this.participantRawJid), this.messageRowIds, this.messageIds);
            C36321k7.A1K(r11, "PlayedSelfReceiptStore/insertPlayedSelfReceipt/toJid = ", AnonymousClass000.A0u());
            ContentValues contentValues = new ContentValues();
            int i = 0;
            while (true) {
                String[] strArr = r11.A03;
                if (i >= strArr.length) {
                    break;
                }
                contentValues.clear();
                C219712j r6 = r12.A00;
                contentValues.put("to_jid_row_id", Long.valueOf(r6.A07(r11.A01)));
                AnonymousClass11F r02 = r11.A00;
                if (r02 != null) {
                    contentValues.put("participant_jid_row_id", Long.valueOf(r6.A07(r02)));
                }
                contentValues.put("message_row_id", r11.A02[i]);
                contentValues.put("message_id", strArr[i]);
                AnonymousClass1M0 A05 = r12.A01.A05();
                try {
                    B1k = A05.B1k();
                    if (A05.A02.A04("played_self_receipt", "PlayedSelfReceiptStore/INSERT_PLAYED_SELF_RECEIPT", contentValues) == -1) {
                        Log.w("PlayedSelfReceiptStore/insertPlayedSelfReceipt fail to insert");
                    }
                    B1k.A00();
                    B1k.close();
                    A05.close();
                    i++;
                } catch (Throwable th) {
                    try {
                        A05.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            if (this.playedSelfFromPeer) {
                return;
            }
        }
        AnonymousClass9YT r13 = new AnonymousClass9YT();
        r13.A02 = (Jid) A06.first;
        r13.A05 = "receipt";
        r13.A08 = str;
        r13.A07 = this.messageIds[0];
        r13.A01 = (Jid) A06.second;
        this.A01.A05(Message.obtain((Handler) null, 0, 38, 0, new C193479Lp(C222713q.A00((Jid) A06.first), C222713q.A00((Jid) A06.second), str, this.messageIds)), r13.A01()).get();
        return;
        throw th;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.toRawJid)) {
            String[] strArr = this.messageIds;
            if (strArr == null || strArr.length == 0) {
                throw new InvalidObjectException("messageIds must not be empty");
            }
            return;
        }
        throw new InvalidObjectException("toJid must not be empty");
    }

    public void A09() {
        A00();
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SendPlayedReceiptJobV2/onCanceled; ");
        C36341k9.A1O(A0u, A00());
    }

    public boolean A0D(Exception exc) {
        A00();
        return true;
    }

    public void Bqf(Context context) {
        C18800tq A0P = C36371kC.A0P(context);
        this.A01 = C36361kB.A0c(A0P);
        this.A02 = (AnonymousClass1C5) A0P.A7B.get();
        this.A00 = (AnonymousClass34Z) A0P.AfI.A00.A3H.get();
    }
}
