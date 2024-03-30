package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.1aB  reason: invalid class name and case insensitive filesystem */
public class C30421aB {
    public C81873xm A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AnonymousClass1XT A02;
    public final C232417s A03;
    public final C30431aC A04;
    public final AnonymousClass189 A05;
    public final AnonymousClass1OD A06;
    public final C19770wU A07;
    public final AnonymousClass18I A08;

    public void A00(DeviceJid deviceJid) {
        StringBuilder sb = new StringBuilder();
        sb.append("Prekey request returned none or signature invalid; jid=");
        sb.append(deviceJid);
        Log.i(sb.toString());
        AnonymousClass6EZ A022 = C133256Xm.A02(deviceJid);
        AnonymousClass18I r0 = this.A08;
        AnonymousClass79X A002 = AnonymousClass18I.A00(A022, r0);
        AnonymousClass18I.A03(A002, r0);
        try {
            this.A05.A0Q((AnonymousClass3FZ) null, A022);
            AnonymousClass1XT r2 = this.A02;
            synchronized (r2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("prekeysmanager/onGetPreKeyNone:");
                sb2.append(deviceJid);
                Log.i(sb2.toString());
                r2.A08.remove(deviceJid);
            }
            if (deviceJid.getDevice() != 0) {
                this.A06.A0B(deviceJid, true);
            }
            if (A002 != null) {
                A002.close();
            }
        } catch (Throwable th) {
            if (A002 != null) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x000e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.util.List r21) {
        /*
            r20 = this;
            java.lang.String r0 = "RecvPreKeyMessageListener/processPrekeys"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r6 = r21.iterator()
        L_0x000e:
            boolean r0 = r6.hasNext()
            r3 = r20
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r6.next()
            X.5xu r0 = (X.C124295xu) r0
            com.whatsapp.jid.DeviceJid r15 = r0.A01
            byte[] r11 = r0.A05
            byte[] r12 = r0.A06
            byte[] r1 = r0.A04
            byte r13 = r0.A00
            X.5tq r9 = r0.A02
            X.5tq r10 = r0.A03
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "prekey request successful; initiating signal protocol session; jid="
            r2.append(r0)
            r2.append(r15)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.18I r0 = r3.A08
            X.79X r5 = r0.A08(r15)
            int r0 = r15.getDevice()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0063
            X.1OD r14 = r3.A06     // Catch:{ all -> 0x0094 }
            r19 = 4
            r16 = r1
            r17 = r11
            r18 = r13
            boolean r0 = r14.A0E(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "recvprekeymessagelistener/onGetPreKeySuccess adv verification fails"
        L_0x005c:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0094 }
            r3.A00(r15)     // Catch:{ all -> 0x0094 }
            goto L_0x008d
        L_0x0063:
            X.6EZ r8 = X.C133256Xm.A02(r15)     // Catch:{ all -> 0x0094 }
            X.189 r7 = r3.A05     // Catch:{ all -> 0x0094 }
            int r2 = r7.A05(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0094 }
            if (r2 != 0) goto L_0x0070
            goto L_0x0082
        L_0x0070:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r1.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "Error received from SignalCoordinator; status="
            r1.append(r0)     // Catch:{ all -> 0x0094 }
            r1.append(r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0094 }
            goto L_0x005c
        L_0x0082:
            r0 = 0
            if (r9 != 0) goto L_0x0086
            r0 = 1
        L_0x0086:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0094 }
            r4.put(r15, r0)     // Catch:{ all -> 0x0094 }
        L_0x008d:
            if (r5 == 0) goto L_0x000e
            r5.close()
            goto L_0x000e
        L_0x0094:
            r1 = move-exception
            if (r5 == 0) goto L_0x009f
            r5.close()     // Catch:{ all -> 0x009b }
            throw r1
        L_0x009b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x009f:
            throw r1
        L_0x00a0:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00b2
            android.os.Handler r2 = r3.A01
            r1 = 11
            X.1jB r0 = new X.1jB
            r0.<init>(r3, r4, r1)
            r2.post(r0)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30421aB.A01(java.util.List):void");
    }

    public C30421aB(AnonymousClass1XT r3, C232417s r4, C30431aC r5, AnonymousClass189 r6, AnonymousClass18I r7, AnonymousClass1OD r8, C19770wU r9) {
        this.A07 = r9;
        this.A08 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A06 = r8;
        this.A02 = r3;
        this.A04 = r5;
    }
}
