package X;

import android.util.Pair;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.1id  reason: invalid class name and case insensitive filesystem */
public class C35401id implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r3 = r0.A02
            X.1cI r3 = (X.C31731cI) r3
            int r15 = r0.A00
            java.lang.Object r10 = r0.A03
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10
            int r7 = r0.A01
            java.lang.Object r11 = r0.A04
            X.3Qa r11 = (X.C64933Qa) r11
            java.lang.Object r0 = r0.A05
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r12 = r0.first
            X.3Kq r12 = (X.C63593Kq) r12
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r14 = r0.intValue()
            java.lang.String r5 = "; targetJid="
            com.whatsapp.jid.UserJid r4 = r10.userJid
            X.6EZ r6 = X.C133256Xm.A02(r10)
            X.18I r0 = r3.A05
            X.79X r2 = X.AnonymousClass18I.A00(r6, r0)
            X.AnonymousClass18I.A03(r2, r0)
            r13 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r1.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl checking sessions due to retry receipt; recipient="
            r1.append(r0)     // Catch:{ all -> 0x00ed }
            r1.append(r6)     // Catch:{ all -> 0x00ed }
            r1.append(r5)     // Catch:{ all -> 0x00ed }
            r1.append(r4)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ed }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ed }
            X.189 r1 = r3.A03     // Catch:{ all -> 0x00ed }
            boolean r0 = r1.A0Z(r6)     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00b0
            X.9eC r0 = r1.A0D(r6)     // Catch:{ all -> 0x00ed }
            X.9bJ r0 = r0.A01     // Catch:{ all -> 0x00ed }
            X.8S2 r8 = r0.A00     // Catch:{ all -> 0x00ed }
            int r0 = r8.remoteRegistrationId_     // Catch:{ all -> 0x00ed }
            if (r0 == r7) goto L_0x007d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r3.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl deleting session due to registration id change; stop retrying; targetJid="
            r3.append(r0)     // Catch:{ all -> 0x00ed }
            r3.append(r4)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00ed }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ed }
            r1.A0E(r6)     // Catch:{ all -> 0x00ed }
            r1.A0R(r6)     // Catch:{ all -> 0x00ed }
            goto L_0x00e7
        L_0x007d:
            r7 = 2
            if (r15 < r7) goto L_0x00b0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r9.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl requiring new session before resending; targetJid="
            r9.append(r0)     // Catch:{ all -> 0x00ed }
            r9.append(r4)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x00ed }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ed }
            X.AUx r0 = r8.aliceBaseKey_     // Catch:{ all -> 0x00ed }
            byte[] r13 = r0.A06()     // Catch:{ all -> 0x00ed }
            if (r15 <= r7) goto L_0x00a8
            boolean r0 = r1.A0a(r6, r4)     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00b0
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl will wait to send notification until a new prekey has been fetched"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ed }
            goto L_0x00e7
        L_0x00a8:
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl will record the base key used to send"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ed }
            r1.A0S(r6, r4, r13)     // Catch:{ all -> 0x00ed }
        L_0x00b0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r1.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; create new SendFinalLiveLocationRetryJob; messageKey="
            r1.append(r0)     // Catch:{ all -> 0x00ed }
            r1.append(r11)     // Catch:{ all -> 0x00ed }
            r1.append(r5)     // Catch:{ all -> 0x00ed }
            r1.append(r4)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "; timeOffset="
            r1.append(r0)     // Catch:{ all -> 0x00ed }
            r1.append(r14)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "; retryCount="
            r1.append(r0)     // Catch:{ all -> 0x00ed }
            r1.append(r15)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ed }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ed }
            X.164 r0 = r3.A02     // Catch:{ all -> 0x00ed }
            X.C18740tg.A06(r10)     // Catch:{ all -> 0x00ed }
            com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob r9 = new com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob     // Catch:{ all -> 0x00ed }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00ed }
            r0.A01(r9)     // Catch:{ all -> 0x00ed }
        L_0x00e7:
            if (r2 == 0) goto L_0x00ec
            r2.close()
        L_0x00ec:
            return
        L_0x00ed:
            r1 = move-exception
            if (r2 == 0) goto L_0x00f8
            r2.close()     // Catch:{ all -> 0x00f4 }
            throw r1
        L_0x00f4:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x00f8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35401id.run():void");
    }

    public C35401id(Pair pair, DeviceJid deviceJid, C31731cI r3, C64933Qa r4, int i, int i2) {
        this.A02 = r3;
        this.A00 = i;
        this.A03 = deviceJid;
        this.A01 = i2;
        this.A04 = r4;
        this.A05 = pair;
    }
}
