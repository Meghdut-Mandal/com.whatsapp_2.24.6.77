package X;

/* renamed from: X.1cI  reason: invalid class name and case insensitive filesystem */
public class C31731cI extends C29421Wo {
    public final AnonymousClass17Y A00;
    public final C20300xL A01;
    public final AnonymousClass164 A02;
    public final AnonymousClass189 A03;
    public final AnonymousClass187 A04;
    public final AnonymousClass18I A05;
    public final AnonymousClass1P5 A06;
    public final AnonymousClass1PA A07;
    public final C19770wU A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31731cI(X.C19700wN r9, X.AnonymousClass17Y r10, X.C20300xL r11, X.AnonymousClass164 r12, X.AnonymousClass189 r13, X.AnonymousClass187 r14, X.AnonymousClass18I r15, X.AnonymousClass1P5 r16, X.AnonymousClass1PA r17, X.AnonymousClass19A r18, X.AnonymousClass19L r19, X.C19770wU r20) {
        /*
            r8 = this;
            r0 = 1
            int[] r6 = new int[r0]
            r7 = 0
            r0 = 240(0xf0, float:3.36E-43)
            r6[r7] = r0
            r1 = r8
            r2 = r9
            r3 = r18
            r4 = r19
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A00 = r10
            r8.A08 = r5
            r8.A05 = r15
            r8.A02 = r12
            r8.A04 = r14
            r8.A01 = r11
            r8.A03 = r13
            r0 = r17
            r8.A07 = r0
            r0 = r16
            r8.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31731cI.<init>(X.0wN, X.17Y, X.0xL, X.164, X.189, X.187, X.18I, X.1P5, X.1PA, X.19A, X.19L, X.0wU):void");
    }

    /* JADX WARNING: type inference failed for: r1v36, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r0v62, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r6v12, types: [X.1ic] */
    /* JADX WARNING: type inference failed for: r6v13, types: [X.1ic] */
    /* JADX WARNING: type inference failed for: r4v40, types: [X.1id] */
    /* JADX WARNING: type inference failed for: r4v41, types: [X.1id] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03c5, code lost:
        if (r11 != null) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04ee, code lost:
        r1.Boy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0500, code lost:
        r0.A00.execute(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0570, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x05ac, code lost:
        r0 = r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x070d, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        A05(r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C203399nx r27, int r28) {
        /*
            r26 = this;
            r0 = 240(0xf0, float:3.36E-43)
            r1 = r28
            if (r1 == r0) goto L_0x0007
            return
        L_0x0007:
            r9 = 0
            r2 = r27
            X.9nx r7 = r2.A0b(r9)
            if (r7 == 0) goto L_0x0782
            java.lang.String r1 = "t"
            r0 = 0
            java.lang.String r16 = r2.A0i(r1, r0)
            r3 = r26
            X.9uj r2 = r3.A03()
            com.whatsapp.jid.UserJid r6 = r2.A00()
            java.lang.String r1 = r7.A00
            r10 = -1
            int r0 = r1.hashCode()
            java.lang.String r5 = "enc"
            switch(r0) {
                case -1607257499: goto L_0x0731;
                case 100570: goto L_0x0728;
                case 1671308008: goto L_0x071d;
                case 1901043637: goto L_0x0712;
                default: goto L_0x002d;
            }
        L_0x002d:
            r12 = 4
            java.lang.String r14 = "registration"
            java.lang.String r15 = "retry"
            java.lang.String r4 = "count"
            java.lang.String r0 = "request"
            java.lang.String r8 = "; retryCount="
            java.lang.String r1 = "invalid registration node"
            switch(r10) {
                case 0: goto L_0x0507;
                case 1: goto L_0x046c;
                case 2: goto L_0x0346;
                case 3: goto L_0x0041;
                default: goto L_0x003d;
            }
        L_0x003d:
            r3.A05(r2)
            return
        L_0x0041:
            X.9nx r13 = r7.A0c(r0)
            X.9nx r11 = r7.A0c(r5)
            java.lang.String r5 = "final"
            r0 = 0
            java.lang.String r6 = r7.A0i(r5, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 == 0) goto L_0x005a
            java.lang.String r0 = "connection/handleLocationNotifications/final attribute is empty"
            goto L_0x070d
        L_0x005a:
            java.lang.String r10 = "; msgId="
            java.lang.String r5 = "context"
            if (r13 == 0) goto L_0x022f
            int r11 = r13.A0S(r15, r9)
            X.9nx r0 = r7.A0c(r14)
            if (r0 == 0) goto L_0x0767
            byte[] r13 = r0.A01
            if (r13 == 0) goto L_0x0761
            int r0 = r13.length
            if (r0 != r12) goto L_0x0761
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r9 = r7.A0X(r0, r5)
            X.11F r9 = (X.AnonymousClass11F) r9
            if (r9 != 0) goto L_0x0081
            com.whatsapp.jid.Jid r0 = r2.A02
            X.11F r9 = X.AnonymousClass143.A00(r0)
        L_0x0081:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "connection/handleLocationNotifications/final live location retry notification; stanzaKey="
            r1.append(r0)
            r1.append(r2)
            r1.append(r10)
            r1.append(r6)
            r1.append(r8)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.Jid r1 = r2.A02
            X.11F r5 = X.AnonymousClass143.A00(r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; stanzaKey="
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = "; contextJid="
            r7.append(r0)
            r7.append(r9)
            r7.append(r10)
            r7.append(r6)
            r7.append(r8)
            r7.append(r11)
            java.lang.String r0 = r7.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.AnonymousClass143.A0G(r5)
            if (r0 != 0) goto L_0x022b
            boolean r0 = r5 instanceof X.C177618e5
            if (r0 != 0) goto L_0x022b
            com.whatsapp.jid.DeviceJid r23 = com.whatsapp.jid.DeviceJid.of(r1)
            r0 = 0
            int r22 = X.C203239na.A01(r13, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl got final location retry request; retryCount="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r21 = "; targetDeviceJid="
            r0 = r21
            r1.append(r0)
            r0 = r23
            r1.append(r0)
            java.lang.String r0 = "; targetRegistrationIdInt="
            r1.append(r0)
            r0 = r22
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r11 <= r12) goto L_0x0121
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r21 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl skipping retry; reached max retry; jid="
        L_0x0115:
            r0 = r21
            r4.append(r0)
            r0 = r23
            r4.append(r0)
            goto L_0x05ac
        L_0x0121:
            r0 = 1
            X.3Qa r8 = new X.3Qa
            r8.<init>(r9, r6, r0)
            X.1P5 r1 = r3.A06
            X.C18740tg.A06(r23)
            r0 = r23
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r25 = r0
            X.2br r13 = X.AnonymousClass1P5.A03(r1, r8)
            if (r13 == 0) goto L_0x0206
            java.lang.Object r7 = r1.A0R
            monitor-enter(r7)
            java.util.Map r0 = X.AnonymousClass1P5.A06(r1)     // Catch:{ all -> 0x075e }
            X.11F r5 = r8.A00     // Catch:{ all -> 0x075e }
            java.lang.Object r14 = r0.get(r5)     // Catch:{ all -> 0x075e }
            X.38X r14 = (X.AnonymousClass38X) r14     // Catch:{ all -> 0x075e }
            r19 = 1000(0x3e8, double:4.94E-321)
            if (r14 == 0) goto L_0x0184
            X.005 r0 = r1.A0N     // Catch:{ all -> 0x075e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x075e }
            X.0xM r0 = (X.C20310xM) r0     // Catch:{ all -> 0x075e }
            boolean r0 = r0.A11(r8)     // Catch:{ all -> 0x075e }
            if (r0 == 0) goto L_0x0162
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x075e }
            r1.A0V(r5)     // Catch:{ all -> 0x075e }
        L_0x015f:
            monitor-exit(r7)     // Catch:{ all -> 0x075e }
            goto L_0x0206
        L_0x0162:
            X.3Kq r0 = r14.A00     // Catch:{ all -> 0x075e }
            if (r0 == 0) goto L_0x0184
            java.util.List r12 = r14.A03     // Catch:{ all -> 0x075e }
            r0 = r25
            boolean r0 = r12.contains(r0)     // Catch:{ all -> 0x075e }
            if (r0 == 0) goto L_0x0184
            X.3Kq r12 = r14.A00     // Catch:{ all -> 0x075e }
            long r0 = r12.A05     // Catch:{ all -> 0x075e }
            long r4 = r13.A0I     // Catch:{ all -> 0x075e }
            long r0 = r0 - r4
            long r0 = r0 / r19
            int r4 = (int) r0     // Catch:{ all -> 0x075e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x075e }
            android.util.Pair r5 = android.util.Pair.create(r12, r0)     // Catch:{ all -> 0x075e }
            monitor-exit(r7)     // Catch:{ all -> 0x075e }
            goto L_0x01ec
        L_0x0184:
            X.3Kq r12 = r13.A02     // Catch:{ all -> 0x075e }
            if (r12 == 0) goto L_0x015f
            X.1P9 r0 = r1.A0K     // Catch:{ all -> 0x075e }
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x075e }
            java.lang.String r1 = r8.A01     // Catch:{ all -> 0x075e }
            X.1P8 r0 = r0.A00     // Catch:{ Exception -> 0x0752 }
            X.1M0 r18 = r0.get()     // Catch:{ Exception -> 0x0752 }
            r0 = r18
            X.14e r0 = r0.A02     // Catch:{ all -> 0x0748 }
            r24 = r0
            java.lang.String r17 = "SELECT COUNT(*) AS count FROM location_sharer WHERE remote_jid = ? AND from_me = ? AND remote_resource = ? AND message_id = ?"
            r0 = 4
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ all -> 0x0748 }
            java.lang.String r0 = r5.getRawString()     // Catch:{ all -> 0x0748 }
            r16 = 0
            r15[r16] = r0     // Catch:{ all -> 0x0748 }
            java.lang.String r0 = "1"
            r14 = 1
            r15[r14] = r0     // Catch:{ all -> 0x0748 }
            r5 = 2
            java.lang.String r0 = r25.getRawString()     // Catch:{ all -> 0x0748 }
            r15[r5] = r0     // Catch:{ all -> 0x0748 }
            r0 = 3
            r15[r0] = r1     // Catch:{ all -> 0x0748 }
            java.lang.String r0 = "isLocationReceiver/QUERY_LOCATION_SHARER"
            r5 = r24
            r1 = r17
            android.database.Cursor r5 = r5.A09(r1, r0, r15)     // Catch:{ all -> 0x0748 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x073c }
            if (r0 == 0) goto L_0x01d3
            int r0 = r5.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x073c }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x073c }
            if (r0 != r14) goto L_0x01d3
            r16 = 1
        L_0x01d3:
            r5.close()     // Catch:{ all -> 0x0748 }
            r18.close()     // Catch:{ Exception -> 0x0752 }
            if (r16 == 0) goto L_0x015f
            long r4 = r12.A05     // Catch:{ all -> 0x075e }
            long r0 = r13.A0I     // Catch:{ all -> 0x075e }
            long r4 = r4 - r0
            long r4 = r4 / r19
            int r0 = (int) r4     // Catch:{ all -> 0x075e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x075e }
            android.util.Pair r5 = android.util.Pair.create(r12, r0)     // Catch:{ all -> 0x075e }
            monitor-exit(r7)     // Catch:{ all -> 0x075e }
        L_0x01ec:
            if (r5 == 0) goto L_0x0206
            X.189 r0 = r3.A03
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x021b
            X.0wU r1 = r3.A08
            X.1id r0 = new X.1id
            r4 = r0
            r6 = r23
            r7 = r3
            r9 = r11
            r10 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x04ee
        L_0x0206:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl skipping retry; final location message not found; contextJid="
            r4.append(r0)
            r4.append(r9)
            r4.append(r10)
            r4.append(r6)
            goto L_0x0115
        L_0x021b:
            X.187 r0 = r3.A04
            X.1id r1 = new X.1id
            r4 = r1
            r6 = r23
            r7 = r3
            r9 = r11
            r10 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0500
        L_0x022b:
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl received location key retry notification sent to a group or broadcast"
            goto L_0x0570
        L_0x022f:
            if (r11 == 0) goto L_0x0342
            int r4 = r11.A0S(r4, r9)
            java.lang.String r1 = "source"
            java.lang.String r1 = r7.A0i(r1, r0)
            java.lang.String r0 = "cache"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0308
            int r0 = java.lang.Integer.parseInt(r16)
            long r0 = (long) r0
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
        L_0x024b:
            java.lang.Class<X.11F> r9 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r12 = r7.A0X(r9, r5)
            X.11F r12 = (X.AnonymousClass11F) r12
            X.630 r7 = X.C111475cL.A00(r11)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r5 = "connection/handleLocationNotifications/final live location notification; stanzaKey="
            r9.append(r5)
            r9.append(r2)
            java.lang.String r13 = "; contextJid="
            r9.append(r13)
            r9.append(r12)
            r9.append(r10)
            r9.append(r6)
            r9.append(r8)
            r9.append(r4)
            java.lang.String r11 = "; cachedTime="
            r9.append(r11)
            r9.append(r0)
            java.lang.String r5 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r5 = "LocationNotificationHandler/onFinalLocationNotification/stanzaKey="
            r9.append(r5)
            r9.append(r2)
            r9.append(r13)
            r9.append(r12)
            r9.append(r10)
            r9.append(r6)
            r9.append(r8)
            r9.append(r4)
            r9.append(r11)
            r9.append(r0)
            java.lang.String r5 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            int r9 = r7.A01
            r5 = 2
            if (r9 == r5) goto L_0x02c7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLocationNotification/invalid ciphertext version; ciphertextVersion="
        L_0x02bf:
            r4.append(r0)
            r4.append(r9)
            goto L_0x05ac
        L_0x02c7:
            com.whatsapp.jid.Jid r8 = r2.A02
            X.11F r13 = X.AnonymousClass143.A00(r8)
            boolean r5 = X.AnonymousClass143.A0G(r13)
            if (r5 == 0) goto L_0x02f2
            com.whatsapp.jid.Jid r5 = r2.A01
            com.whatsapp.jid.DeviceJid r14 = com.whatsapp.jid.DeviceJid.of(r5)
        L_0x02d9:
            X.6sr r12 = new X.6sr
            r15 = r3
            r16 = r6
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            int r8 = r7.A00
            r5 = 3
            if (r8 != r5) goto L_0x02fe
            if (r4 <= 0) goto L_0x030c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLocationNotification/invalid ciphertext version for retry final location notification; ciphertextVersion="
            goto L_0x02bf
        L_0x02f2:
            boolean r5 = X.AnonymousClass143.A0G(r12)
            com.whatsapp.jid.DeviceJid r14 = com.whatsapp.jid.DeviceJid.of(r8)
            if (r5 == 0) goto L_0x02d9
            r13 = r12
            goto L_0x02d9
        L_0x02fe:
            if (r4 != 0) goto L_0x030c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLocationNotification/invalid ciphertext version for final location notification; ciphertextVersion="
            goto L_0x02bf
        L_0x0308:
            r0 = 0
            goto L_0x024b
        L_0x030c:
            X.189 r5 = r3.A03
            boolean r5 = r5.A0X()
            if (r5 == 0) goto L_0x032a
            X.0wU r5 = r3.A08
            X.1iu r11 = new X.1iu
            r16 = r7
            r17 = r2
            r18 = r6
            r19 = r4
            r20 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r5.Boy(r11)
            goto L_0x003d
        L_0x032a:
            X.187 r5 = r3.A04
            X.1iu r11 = new X.1iu
            r16 = r7
            r17 = r2
            r18 = r6
            r19 = r4
            r20 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.util.concurrent.ThreadPoolExecutor r0 = r5.A00
            r0.execute(r11)
            goto L_0x003d
        L_0x0342:
            java.lang.String r0 = "connection/handleLocationNotifications/none of request nor enc node exists"
            goto L_0x070d
        L_0x0346:
            r4 = -1
            java.lang.String r0 = "id"
            long r0 = r7.A0V(r0, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = "LocationNotificationHandler/on-location-disabled-notification; stanzaKey="
            r5.append(r4)
            r5.append(r2)
            java.lang.String r9 = "; sequenceNumber="
            r5.append(r9)
            r5.append(r0)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.1P5 r6 = r3.A06
            com.whatsapp.jid.Jid r4 = r2.A02
            X.11F r5 = X.AnonymousClass143.A00(r4)
            com.whatsapp.jid.UserJid r4 = r2.A00()
            if (r4 != 0) goto L_0x039f
            r4 = 0
        L_0x0379:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = "LocationSharingManager/onReceiveStopSharing; jid="
            r8.append(r7)
            r8.append(r5)
            java.lang.String r7 = "; participant="
            r8.append(r7)
            r8.append(r4)
            r8.append(r9)
            r8.append(r0)
            java.lang.String r7 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r7)
            java.lang.Object r9 = r6.A0Q
            monitor-enter(r9)
            goto L_0x03a4
        L_0x039f:
            com.whatsapp.jid.UserJid r4 = r2.A00()
            goto L_0x0379
        L_0x03a4:
            java.util.Map r10 = X.AnonymousClass1P5.A05(r6)     // Catch:{ all -> 0x076d }
            java.lang.Object r11 = r10.get(r5)     // Catch:{ all -> 0x076d }
            java.util.Map r11 = (java.util.Map) r11     // Catch:{ all -> 0x076d }
            if (r11 != 0) goto L_0x03c7
            boolean r7 = r5 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x076d }
            if (r7 == 0) goto L_0x0444
            X.1P7 r7 = r6.A0J     // Catch:{ all -> 0x076d }
            r8 = r5
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8     // Catch:{ all -> 0x076d }
            X.12O r7 = r7.A00     // Catch:{ all -> 0x076d }
            com.whatsapp.jid.UserJid r7 = r7.A0B(r8)     // Catch:{ all -> 0x076d }
            java.lang.Object r11 = r10.get(r7)     // Catch:{ all -> 0x076d }
            java.util.Map r11 = (java.util.Map) r11     // Catch:{ all -> 0x076d }
            if (r11 == 0) goto L_0x0444
        L_0x03c7:
            if (r4 != 0) goto L_0x03ca
            goto L_0x03cc
        L_0x03ca:
            r13 = r4
            goto L_0x03d2
        L_0x03cc:
            X.13r r7 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x076d }
            com.whatsapp.jid.UserJid r13 = X.C222813r.A00(r5)     // Catch:{ all -> 0x076d }
        L_0x03d2:
            java.lang.Object r7 = r11.get(r13)     // Catch:{ all -> 0x076d }
            X.375 r7 = (X.AnonymousClass375) r7     // Catch:{ all -> 0x076d }
            if (r7 == 0) goto L_0x0444
            X.3Qa r7 = r7.A02     // Catch:{ all -> 0x076d }
            X.2br r7 = X.AnonymousClass1P5.A03(r6, r7)     // Catch:{ all -> 0x076d }
            android.util.Pair r12 = android.util.Pair.create(r5, r13)     // Catch:{ all -> 0x076d }
            r15 = 0
            if (r7 == 0) goto L_0x03f3
            long r7 = r7.A01     // Catch:{ all -> 0x076d }
            int r14 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x03f3
            int r7 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r7 <= 0) goto L_0x03f3
            goto L_0x043a
        L_0x03f3:
            java.util.Map r8 = r6.A0X     // Catch:{ all -> 0x076d }
            java.lang.Object r14 = r8.get(r12)     // Catch:{ all -> 0x076d }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x076d }
            int r7 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r7 <= 0) goto L_0x0410
            if (r14 == 0) goto L_0x0409
            long r14 = r14.longValue()     // Catch:{ all -> 0x076d }
            int r7 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0410
        L_0x0409:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x076d }
            r8.put(r12, r0)     // Catch:{ all -> 0x076d }
        L_0x0410:
            java.lang.Object r0 = r11.remove(r13)     // Catch:{ all -> 0x076d }
            X.375 r0 = (X.AnonymousClass375) r0     // Catch:{ all -> 0x076d }
            X.AnonymousClass1P5.A0D(r6, r0)     // Catch:{ all -> 0x076d }
            X.1P9 r7 = r6.A0K     // Catch:{ all -> 0x076d }
            r1 = 0
            if (r4 == 0) goto L_0x0432
            java.util.List r0 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x076d }
            X.AnonymousClass1P9.A01(r5, r7, r0, r1)     // Catch:{ all -> 0x076d }
        L_0x0425:
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x076d }
            if (r0 == 0) goto L_0x042e
            r10.remove(r5)     // Catch:{ all -> 0x076d }
        L_0x042e:
            X.AnonymousClass1P5.A0F(r6, r10)     // Catch:{ all -> 0x076d }
            goto L_0x0444
        L_0x0432:
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch:{ all -> 0x076d }
            X.AnonymousClass1P9.A03(r7, r0, r1)     // Catch:{ all -> 0x076d }
            goto L_0x0425
        L_0x043a:
            java.lang.String r0 = "LocationSharingManager/onReceiveStopSharing; received old sequence number; skip stopping"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x076d }
            java.util.Map r0 = r6.A0X     // Catch:{ all -> 0x076d }
            r0.remove(r12)     // Catch:{ all -> 0x076d }
        L_0x0444:
            monitor-exit(r9)     // Catch:{ all -> 0x076d }
            java.util.List r0 = r6.A0U
            java.util.Iterator r1 = r0.iterator()
        L_0x044b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x045b
            java.lang.Object r0 = r1.next()
            X.4U8 r0 = (X.AnonymousClass4U8) r0
            r0.BeJ(r5, r4)
            goto L_0x044b
        L_0x045b:
            X.AnonymousClass1P5.A0B(r6)
            android.os.Handler r4 = r6.A06
            r1 = 44
            X.1j9 r0 = new X.1j9
            r0.<init>(r6, r5, r1)
            r4.post(r0)
            goto L_0x003d
        L_0x046c:
            int r4 = r7.A0S(r4, r9)
            X.630 r5 = X.C111475cL.A00(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "app/xmpp/recv/notification location key "
            r7.append(r0)
            r7.append(r6)
            r6 = 32
            r7.append(r6)
            r0 = r16
            r7.append(r0)
            r7.append(r6)
            long r0 = java.lang.System.currentTimeMillis()
            r7.append(r0)
            r7.append(r6)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/on-location-key-notification; stanzaKey="
            r1.append(r0)
            r1.append(r2)
            r1.append(r8)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r5.A01
            r0 = 2
            if (r1 == r0) goto L_0x04d0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "LocationNotificationHandler/invalid ciphertext version; ciphertextVersion="
            r4.append(r0)
            r4.append(r1)
            goto L_0x05ac
        L_0x04d0:
            com.whatsapp.jid.Jid r0 = r2.A01
            com.whatsapp.jid.DeviceJid r10 = com.whatsapp.jid.DeviceJid.of(r0)
            X.C18740tg.A06(r10)
            X.189 r0 = r3.A03
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x04f3
            X.0wU r1 = r3.A08
            X.1ic r0 = new X.1ic
            r12 = 2
            r6 = r0
            r7 = r3
            r8 = r2
            r9 = r5
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x04ee:
            r1.Boy(r0)
            goto L_0x003d
        L_0x04f3:
            X.187 r0 = r3.A04
            r12 = 3
            X.1ic r1 = new X.1ic
            r6 = r1
            r7 = r3
            r8 = r2
            r9 = r5
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0500:
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            r0.execute(r1)
            goto L_0x003d
        L_0x0507:
            X.9nx r5 = r7.A0c(r0)
            java.lang.String r0 = "deny"
            X.9nx r4 = r7.A0c(r0)
            if (r5 == 0) goto L_0x0634
            int r4 = r5.A0S(r15, r9)
            X.9nx r5 = r7.A0c(r14)
            if (r5 == 0) goto L_0x0779
            byte[] r7 = r5.A01
            if (r7 == 0) goto L_0x0773
            int r5 = r7.length
            if (r5 != r12) goto L_0x0773
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "connection/handleLocationNotifications/location key retry/participant="
            r5.append(r1)
            r5.append(r6)
            r5.append(r8)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "LocationNotificationHandler/onLocationKeyRetryNotification; stanzaKey="
            r5.append(r1)
            r5.append(r2)
            r5.append(r8)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.jid.Jid r6 = r2.A02
            X.11F r5 = X.AnonymousClass143.A00(r6)
            boolean r1 = X.AnonymousClass143.A0G(r5)
            if (r1 != 0) goto L_0x0630
            boolean r1 = r5 instanceof X.C177618e5
            if (r1 != 0) goto L_0x0630
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.of(r6)
            if (r5 != 0) goto L_0x0575
            java.lang.String r0 = "axolotl received location key retry notification for non-device jid"
        L_0x0570:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x003d
        L_0x0575:
            int r6 = X.C203239na.A01(r7, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "axolotl got location retry request "
            r7.append(r1)
            r7.append(r4)
            java.lang.String r1 = " for "
            r7.append(r1)
            r7.append(r5)
            java.lang.String r1 = " with "
            r7.append(r1)
            r7.append(r6)
            java.lang.String r1 = r7.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            if (r4 <= r12) goto L_0x05b1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "axolotl skipping retry; reached max retry; jid="
        L_0x05a6:
            r4.append(r0)
            r4.append(r5)
        L_0x05ac:
            java.lang.String r0 = r4.toString()
            goto L_0x0570
        L_0x05b1:
            X.1P5 r9 = r3.A06
            com.whatsapp.jid.UserJid r8 = r5.userJid
            java.lang.Object r7 = r9.A0R
            monitor-enter(r7)
            java.util.HashSet r1 = X.AnonymousClass1P5.A04(r9)     // Catch:{ all -> 0x0770 }
            boolean r1 = r1.contains(r8)     // Catch:{ all -> 0x0770 }
            monitor-exit(r7)     // Catch:{ all -> 0x0770 }
            if (r1 != 0) goto L_0x061f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "axolotl skipping retry; user should not get location key; jid="
            r4.append(r1)
            r4.append(r5)
            java.lang.String r1 = r4.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.1PA r1 = r3.A07
            com.whatsapp.jid.UserJid r8 = r5.userJid
            X.19A r6 = r1.A01
            java.lang.String r5 = r6.A09()
            r1 = 3
            X.1AL[] r7 = new X.AnonymousClass1AL[r1]
            java.lang.String r1 = "id"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r1, (java.lang.String) r5)
            r1 = 0
            r7[r1] = r4
            java.lang.String r1 = "to"
            X.1AL r4 = new X.1AL
            r4.<init>((com.whatsapp.jid.Jid) r8, (java.lang.String) r1)
            r1 = 1
            r7[r1] = r4
            java.lang.String r5 = "type"
            java.lang.String r1 = "location"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r5, (java.lang.String) r1)
            r1 = 2
            r7[r1] = r4
            r5 = 0
            X.9nx r1 = new X.9nx
            r1.<init>(r0, r5)
            java.lang.String r0 = "encrypt"
            X.9nx r4 = new X.9nx
            r4.<init>((X.C203399nx) r1, (java.lang.String) r0, (X.AnonymousClass1AL[]) r5)
            java.lang.String r0 = "notification"
            X.9nx r1 = new X.9nx
            r1.<init>((X.C203399nx) r4, (java.lang.String) r0, (X.AnonymousClass1AL[]) r7)
            r0 = 126(0x7e, float:1.77E-43)
            r6.A0G(r1, r0)
            goto L_0x003d
        L_0x061f:
            com.whatsapp.jid.UserJid r0 = r5.userJid
            boolean r0 = r9.A0g(r0, r4)
            if (r0 != 0) goto L_0x0686
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "axolotl skipping retry; retry too soon; jid="
            goto L_0x05a6
        L_0x0630:
            java.lang.String r0 = "axolotl received location key retry notification sent to a group or broadcast"
            goto L_0x0570
        L_0x0634:
            if (r4 == 0) goto L_0x070b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onLocationKeyDenyNotification; stanzaKey="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.Jid r0 = r2.A02
            X.11F r1 = X.AnonymousClass143.A00(r0)
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 != 0) goto L_0x0682
            boolean r0 = r1 instanceof X.C177618e5
            if (r0 != 0) goto L_0x0682
            X.1P5 r6 = r3.A06
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r5 = X.C222813r.A00(r1)
            X.C18740tg.A06(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationSharingManager/onReceiveDenySharing; jid="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.lang.Object r8 = r6.A0Q
            monitor-enter(r8)
            goto L_0x06b4
        L_0x0682:
            java.lang.String r0 = "axolotl received location key deny notification sent to a group or broadcast"
            goto L_0x0570
        L_0x0686:
            X.189 r0 = r3.A03
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x06a0
            X.0wU r1 = r3.A08
            r12 = 5
            X.1iQ r0 = new X.1iQ
            r7 = r0
            r8 = r3
            r9 = r4
            r10 = r5
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            r1.Boy(r0)
            goto L_0x003d
        L_0x06a0:
            X.187 r0 = r3.A04
            r12 = 6
            X.1iQ r1 = new X.1iQ
            r7 = r1
            r8 = r3
            r9 = r4
            r10 = r5
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            r0.execute(r1)
            goto L_0x003d
        L_0x06b4:
            java.util.Map r0 = X.AnonymousClass1P5.A05(r6)     // Catch:{ all -> 0x077f }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x077f }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x077f }
        L_0x06c0:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x077f }
            if (r0 == 0) goto L_0x06f6
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x077f }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x077f }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x077f }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x077f }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x077f }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x077f }
        L_0x06da:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x077f }
            if (r0 == 0) goto L_0x06c0
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x077f }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x077f }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x077f }
            if (r0 == 0) goto L_0x06da
            java.lang.Object r0 = r4.getKey()     // Catch:{ all -> 0x077f }
            X.11F r0 = (X.AnonymousClass11F) r0     // Catch:{ all -> 0x077f }
            r9.add(r0)     // Catch:{ all -> 0x077f }
            goto L_0x06da
        L_0x06f6:
            monitor-exit(r8)     // Catch:{ all -> 0x077f }
            java.util.Iterator r1 = r9.iterator()
        L_0x06fb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r1.next()
            X.11F r0 = (X.AnonymousClass11F) r0
            X.AnonymousClass1P5.A08(r0, r5, r6)
            goto L_0x06fb
        L_0x070b:
            java.lang.String r0 = "connection/handleLocationNotifications/none of request nor deny node exists"
        L_0x070d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x003d
        L_0x0712:
            java.lang.String r0 = "location"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            r10 = 3
            goto L_0x002d
        L_0x071d:
            java.lang.String r0 = "disable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            r10 = 2
            goto L_0x002d
        L_0x0728:
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x002d
            r10 = 1
            goto L_0x002d
        L_0x0731:
            java.lang.String r0 = "encrypt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            r10 = 0
            goto L_0x002d
        L_0x073c:
            r1 = move-exception
            if (r5 == 0) goto L_0x0747
            r5.close()     // Catch:{ all -> 0x0743 }
            goto L_0x0747
        L_0x0743:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0748 }
        L_0x0747:
            throw r1     // Catch:{ all -> 0x0748 }
        L_0x0748:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x074d }
            goto L_0x0751
        L_0x074d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0752 }
        L_0x0751:
            throw r1     // Catch:{ Exception -> 0x0752 }
        L_0x0752:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/isLocationReceiver/error checking location sharer"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x075e }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x075e }
            r0.<init>(r1)     // Catch:{ all -> 0x075e }
            throw r0     // Catch:{ all -> 0x075e }
        L_0x075e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x075e }
            throw r0
        L_0x0761:
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0767:
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x076d:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x076d }
            throw r0
        L_0x0770:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0770 }
            throw r0
        L_0x0773:
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0779:
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x077f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x077f }
            throw r0
        L_0x0782:
            java.lang.String r1 = "invalid location notification"
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31731cI.A07(X.9nx, int):void");
    }
}
