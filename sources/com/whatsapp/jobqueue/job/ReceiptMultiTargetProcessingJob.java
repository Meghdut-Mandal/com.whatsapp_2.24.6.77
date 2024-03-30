package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass777;
import X.AnonymousClass7i8;
import X.C165617ti;
import X.C207209uj;
import X.C21220ADc;
import X.C222513o;
import X.C222713q;
import X.C30481aH;
import X.C35661j3;
import X.C36321k7;
import X.C36341k9;
import X.C36441kJ;
import X.C64933Qa;
import X.C80113ur;
import X.C90464aC;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import org.whispersystems.jobqueue.Job;

public final class ReceiptMultiTargetProcessingJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C30481aH A00;
    public final boolean keyFromMe;
    public final String keyId;
    public final String keyRemoteChatJidRawString;
    public final String[] participantDeviceJidRawString;
    public final C80113ur receiptPrivacyMode;
    public final String remoteJidString;
    public final int status;
    public final long[] timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReceiptMultiTargetProcessingJob(com.whatsapp.jid.Jid r7, X.C64933Qa r8, X.C80113ur r9, java.util.List r10, int r11) {
        /*
            r6 = this;
            X.673 r1 = new X.673
            r1.<init>()
            r0 = 1
            r1.A01 = r0
            java.lang.String r0 = "ReceiptProcessingGroup"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r6.<init>(r0)
            int r5 = r10.size()
            java.lang.String r0 = r8.A01
            r6.keyId = r0
            boolean r0 = r8.A02
            r6.keyFromMe = r0
            X.11F r0 = r8.A00
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.getRawString()
            r6.keyRemoteChatJidRawString = r0
            java.lang.String r0 = r7.getRawString()
            r6.remoteJidString = r0
            r6.status = r11
            java.lang.String[] r0 = new java.lang.String[r5]
            r6.participantDeviceJidRawString = r0
            long[] r0 = new long[r5]
            r6.timestamp = r0
            r6.receiptPrivacyMode = r9
            r4 = 0
        L_0x003d:
            if (r4 >= r5) goto L_0x0061
            java.lang.Object r3 = r10.get(r4)
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.String[] r1 = r6.participantDeviceJidRawString
            java.lang.Object r0 = r3.first
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            r1[r4] = r0
            long[] r2 = r6.timestamp
            java.lang.Object r0 = r3.second
            X.C18740tg.A06(r0)
            long r0 = X.C36431kI.A09(r0)
            r2[r4] = r0
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob.<init>(com.whatsapp.jid.Jid, X.3Qa, X.3ur, java.util.List, int):void");
    }

    private String A00() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; keyRemoteJid=");
        String str = this.keyRemoteChatJidRawString;
        C222513o r1 = Jid.Companion;
        A0u.append(r1.A02(str));
        A0u.append("; remoteJid=");
        A0u.append(r1.A02(this.remoteJidString));
        A0u.append("; number of participants=");
        A0u.append(this.participantDeviceJidRawString.length);
        A0u.append("; recepitPrivacyMode=");
        return AnonymousClass000.A0o(this.receiptPrivacyMode, A0u);
    }

    public void A09() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReceiptMultiTargetProcessingJob/onAdded ");
        C36321k7.A1a(A0u, A00());
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReceiptMultiTargetProcessingJob/onCanceled/cancel job param=");
        C36341k9.A1O(A0u, A00());
    }

    public void A0B() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReceiptMultiTargetProcessingJob/onRun/start param=");
        C36321k7.A1a(A0u, A00());
        String str = this.keyRemoteChatJidRawString;
        C222713q r0 = AnonymousClass11F.A00;
        C64933Qa A0R = C165617ti.A0R(C222713q.A01(str), this.keyId, this.keyFromMe);
        Jid A002 = C222513o.A00(this.remoteJidString);
        int length = this.participantDeviceJidRawString.length;
        ArrayList A14 = C36441kJ.A14(length);
        for (int i = 0; i < length; i++) {
            DeviceJid nullable = DeviceJid.getNullable(this.participantDeviceJidRawString[i]);
            if (nullable != null) {
                A14.add(C36441kJ.A0Q(nullable, Long.valueOf(this.timestamp[i])));
            }
        }
        C21220ADc aDc = new C21220ADc(A002, A0R, this.receiptPrivacyMode, (C207209uj) null, A14, this.status);
        C30481aH r4 = this.A00;
        AnonymousClass777 r3 = new AnonymousClass777();
        r4.A0K.A02(new C35661j3(r3, aDc, r4, 7), 13);
        r3.get();
    }

    public boolean A0D(Exception exc) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReceiptMultiTargetProcessingJob/onShouldRetry/exception while running param=");
        C36341k9.A1O(A0u, A00());
        return true;
    }

    public void Bqf(Context context) {
        this.A00 = (C30481aH) C90464aC.A0I(context).A5K.get();
    }
}
