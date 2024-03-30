package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass777;
import X.AnonymousClass7i8;
import X.C165617ti;
import X.C207209uj;
import X.C21221ADd;
import X.C222513o;
import X.C30481aH;
import X.C35661j3;
import X.C36321k7;
import X.C36341k9;
import X.C36371kC;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C64933Qa;
import X.C80113ur;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import org.whispersystems.jobqueue.Job;

public final class ReceiptProcessingJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C30481aH A00;
    public final boolean[] keyFromMe;
    public final String[] keyId;
    public final String[] keyRemoteChatJidRawString;
    public final String participantDeviceJidRawString;
    public final C80113ur receiptPrivacyMode;
    public final String remoteJidRawString;
    public final int status;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReceiptProcessingJob(com.whatsapp.jid.DeviceJid r6, com.whatsapp.jid.Jid r7, X.C80113ur r8, X.C64933Qa[] r9, int r10, long r11) {
        /*
            r5 = this;
            X.673 r1 = new X.673
            r1.<init>()
            r0 = 1
            r1.A01 = r0
            java.lang.String r0 = "ReceiptProcessingGroup"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r5.<init>(r0)
            int r4 = r9.length
            java.lang.String[] r0 = new java.lang.String[r4]
            r5.keyId = r0
            boolean[] r0 = new boolean[r4]
            r5.keyFromMe = r0
            java.lang.String[] r0 = new java.lang.String[r4]
            r5.keyRemoteChatJidRawString = r0
            r3 = 0
        L_0x0021:
            if (r3 >= r4) goto L_0x0040
            java.lang.String[] r1 = r5.keyId
            r0 = r9[r3]
            java.lang.String r0 = r0.A01
            r1[r3] = r0
            boolean[] r1 = r5.keyFromMe
            r2 = r9[r3]
            boolean r0 = r2.A02
            r1[r3] = r0
            java.lang.String[] r1 = r5.keyRemoteChatJidRawString
            X.11F r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0040:
            java.lang.String r0 = r7.getRawString()
            r5.remoteJidRawString = r0
            java.lang.String r0 = X.AnonymousClass143.A03(r6)
            r5.participantDeviceJidRawString = r0
            r5.status = r10
            r5.timestamp = r11
            r5.receiptPrivacyMode = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.ReceiptProcessingJob.<init>(com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid, X.3ur, X.3Qa[], int, long):void");
    }

    private String A00() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; remoteJid=");
        A0u.append(C36411kG.A0i(this.remoteJidRawString));
        A0u.append("; number of keys=");
        A0u.append(this.keyId.length);
        A0u.append("; receiptPrivacyMode=");
        return AnonymousClass000.A0o(this.receiptPrivacyMode, A0u);
    }

    public void A09() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReceiptProcessingJob/onAdded ");
        C36321k7.A1a(A0u, A00());
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReceiptProcessingJob/onCanceled/cancel job param=");
        C36341k9.A1O(A0u, A00());
    }

    public void A0B() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReceiptProcessingJob/onRun/start param=");
        C36321k7.A1a(A0u, A00());
        int length = this.keyId.length;
        ArrayList A14 = C36441kJ.A14(length);
        for (int i = 0; i < length; i++) {
            AnonymousClass11F A0N = C36421kH.A0N(this.keyRemoteChatJidRawString[i]);
            if (A0N != null) {
                A14.add(C165617ti.A0R(A0N, this.keyId[i], this.keyFromMe[i]));
            }
        }
        String str = this.remoteJidRawString;
        C222513o r0 = Jid.Companion;
        Jid A002 = C222513o.A00(str);
        int i2 = this.status;
        long j = this.timestamp;
        C21221ADd aDd = new C21221ADd(DeviceJid.getNullable(this.participantDeviceJidRawString), A002, this.receiptPrivacyMode, (C207209uj) null, (C64933Qa[]) A14.toArray(new C64933Qa[0]), i2, j);
        C30481aH r4 = this.A00;
        AnonymousClass777 r3 = new AnonymousClass777();
        r4.A0K.A02(new C35661j3(r3, aDd, r4, 7), 13);
        r3.get();
    }

    public boolean A0D(Exception exc) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReceiptProcessingJob/onShouldRetry/exception while running param=");
        C36341k9.A1O(A0u, A00());
        return true;
    }

    public void Bqf(Context context) {
        this.A00 = (C30481aH) C36371kC.A0P(context).A5K.get();
    }
}
