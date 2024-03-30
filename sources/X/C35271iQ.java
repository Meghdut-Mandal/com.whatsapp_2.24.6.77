package X;

/* renamed from: X.1iQ  reason: invalid class name and case insensitive filesystem */
public class C35271iQ implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C35271iQ(Object obj, int i, Object obj2, int i2, int i3) {
        this.A04 = i3;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = obj;
        this.A03 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028e, code lost:
        if ((r8 * 1000) >= X.C19970wo.A00(r7)) goto L_0x02f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r5 = r21
            int r0 = r5.A04
            switch(r0) {
                case 0: goto L_0x0355;
                case 1: goto L_0x0210;
                case 2: goto L_0x01ff;
                case 3: goto L_0x01ee;
                case 4: goto L_0x01ee;
                case 5: goto L_0x0007;
                case 6: goto L_0x0007;
                case 7: goto L_0x02f8;
                case 8: goto L_0x00c4;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r8 = r5.A02
            X.1cI r8 = (X.C31731cI) r8
            int r7 = r5.A00
            java.lang.Object r6 = r5.A03
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            int r1 = r5.A01
            X.6EZ r5 = X.C133256Xm.A02(r6)
            X.18I r0 = r8.A05
            X.79X r3 = X.AnonymousClass18I.A00(r5, r0)
            X.AnonymousClass18I.A03(r3, r0)
            r10 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r2.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "axolotl checking sessions for "
            r2.append(r0)     // Catch:{ all -> 0x00b8 }
            r2.append(r5)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = " due to retry receipt for "
            r2.append(r0)     // Catch:{ all -> 0x00b8 }
            r2.append(r6)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00b8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00b8 }
            X.189 r4 = r8.A03     // Catch:{ all -> 0x00b8 }
            boolean r0 = r4.A0Z(r5)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a8
            X.9eC r0 = r4.A0D(r5)     // Catch:{ all -> 0x00b8 }
            X.9bJ r0 = r0.A01     // Catch:{ all -> 0x00b8 }
            X.8S2 r9 = r0.A00     // Catch:{ all -> 0x00b8 }
            int r0 = r9.remoteRegistrationId_     // Catch:{ all -> 0x00b8 }
            if (r0 == r1) goto L_0x0071
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r1.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "axolotl deleting session due to registration id change for "
            r1.append(r0)     // Catch:{ all -> 0x00b8 }
            r1.append(r6)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = " stop retrying"
            r1.append(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00b8 }
            r4.A0E(r5)     // Catch:{ all -> 0x00b8 }
            r4.A0R(r5)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b2
        L_0x0071:
            r2 = 2
            if (r7 < r2) goto L_0x00a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r1.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "axolotl requiring new session before resending for "
            r1.append(r0)     // Catch:{ all -> 0x00b8 }
            r1.append(r6)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00b8 }
            X.AUx r0 = r9.aliceBaseKey_     // Catch:{ all -> 0x00b8 }
            byte[] r10 = r0.A06()     // Catch:{ all -> 0x00b8 }
            if (r7 <= r2) goto L_0x009e
            com.whatsapp.jid.UserJid r0 = r6.userJid     // Catch:{ all -> 0x00b8 }
            boolean r0 = r4.A0a(r5, r0)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = "axolotl will wait to send notification until a new prekey has been fetched"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b2
        L_0x009e:
            java.lang.String r0 = "axolotl will record the base key used to send "
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00b8 }
            com.whatsapp.jid.UserJid r0 = r6.userJid     // Catch:{ all -> 0x00b8 }
            r4.A0S(r5, r0, r10)     // Catch:{ all -> 0x00b8 }
        L_0x00a8:
            X.164 r1 = r8.A02     // Catch:{ all -> 0x00b8 }
            com.whatsapp.jobqueue.job.SendLiveLocationKeyJob r0 = new com.whatsapp.jobqueue.job.SendLiveLocationKeyJob     // Catch:{ all -> 0x00b8 }
            r0.<init>(r6, r10, r7)     // Catch:{ all -> 0x00b8 }
            r1.A01(r0)     // Catch:{ all -> 0x00b8 }
        L_0x00b2:
            if (r3 == 0) goto L_0x034e
            r3.close()
            return
        L_0x00b8:
            r1 = move-exception
            if (r3 == 0) goto L_0x00c3
            r3.close()     // Catch:{ all -> 0x00bf }
            throw r1
        L_0x00bf:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x00c3:
            throw r1
        L_0x00c4:
            java.lang.Object r8 = r5.A02
            X.1Xt r8 = (X.C29731Xt) r8
            int r2 = r5.A00
            int r7 = r5.A01
            java.lang.Object r6 = r5.A03
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            r5 = 3
            X.2R5 r3 = new X.2R5
            r3.<init>()
            X.3Ao r0 = r8.A00
            if (r0 == 0) goto L_0x014c
            long r0 = r0.A05
        L_0x00dc:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A03 = r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3.A02 = r4
            X.3Qa r10 = r6.A1J
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0147
            X.13z r1 = X.C223613z.A00
        L_0x00f6:
            if (r1 == 0) goto L_0x0114
            X.16D r0 = r8.A02
            X.141 r1 = r0.A08(r1)
            if (r1 == 0) goto L_0x0114
            boolean r0 = r1.A0C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            boolean r0 = r1.A0B()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
        L_0x0114:
            X.0yW r0 = r8.A07
            r0.Blw(r3)
            X.3Rn r1 = r8.A01
            if (r1 == 0) goto L_0x034e
            r0 = 1
            if (r2 != r0) goto L_0x034e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map r0 = r1.A0B
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x014f
            java.util.Iterator r1 = r0.iterator()
        L_0x0131:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x014f
            java.lang.Object r0 = r1.next()
            X.3An r0 = (X.C61093An) r0
            java.util.Map r0 = r0.A08
            java.util.Collection r0 = r0.values()
            r2.addAll(r0)
            goto L_0x0131
        L_0x0147:
            com.whatsapp.jid.UserJid r1 = r6.A0L()
            goto L_0x00f6
        L_0x014c:
            r0 = 0
            goto L_0x00dc
        L_0x014f:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r3 = r2.iterator()
        L_0x0158:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.3OI r0 = (X.AnonymousClass3OI) r0
            java.lang.String r1 = r0.A0N
            java.lang.String r0 = r10.A01
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0158
            r9.add(r2)
            goto L_0x0158
        L_0x0173:
            java.util.Iterator r13 = r9.iterator()
        L_0x0177:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x034e
            java.lang.Object r9 = r13.next()
            X.3OI r9 = (X.AnonymousClass3OI) r9
            long r0 = r9.A09
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
            boolean r0 = r9.A0L
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r0)
            java.lang.String r10 = r9.A0N
            com.whatsapp.jid.UserJid r14 = r9.A0M
            java.lang.Integer r0 = r9.A0E
            r12 = 1
            if (r0 == 0) goto L_0x01aa
            int r1 = r0.intValue()
            r0 = 4
            if (r1 == r0) goto L_0x01a1
            if (r1 != r5) goto L_0x01aa
        L_0x01a1:
            long r2 = r9.A08
            long r0 = r9.A06
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x01aa
            r12 = 0
        L_0x01aa:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r12)
            int r0 = r9.A02
            int r0 = X.AnonymousClass3OI.A00(r0)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            r1 = 15
            X.1Xv r15 = r8.A0B
            r2 = 1
            r0 = 262144(0x40000, float:3.67342E-40)
            boolean r0 = r6.A1T(r0)
            if (r1 != r7) goto L_0x01df
            if (r0 != r2) goto L_0x0177
            r20 = r10
            X.2SO r3 = X.C29751Xv.A01(r14, r15, r16, r17, r18, r19, r20)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01d2:
            r3.A06 = r0
            X.0yW r1 = r15.A01
            X.0u5 r0 = new X.0u5
            r0.<init>(r2, r2)
            r1.Bls(r3, r0, r2)
            goto L_0x0177
        L_0x01df:
            if (r0 != r2) goto L_0x0177
            r20 = r10
            X.2SO r3 = X.C29751Xv.A01(r14, r15, r16, r17, r18, r19, r20)
            r3.A04 = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x01d2
        L_0x01ee:
            java.lang.Object r3 = r5.A02
            X.0yO r3 = (X.C20930yO) r3
            int r2 = r5.A00
            int r1 = r5.A01
            java.lang.Object r0 = r5.A03
            r3.A00(r2)
            r3.A01(r0, r1, r2)
            return
        L_0x01ff:
            java.lang.Object r3 = r5.A02
            X.0yR r3 = (X.C20960yR) r3
            int r2 = r5.A00
            java.lang.Object r1 = r5.A03
            int r0 = r5.A01
            r3.A01()
            X.C20960yR.A00(r3, r1, r2, r0)
            return
        L_0x0210:
            java.lang.Object r4 = r5.A02
            X.1Ps r4 = (X.C27761Ps) r4
            java.lang.Object r0 = r5.A03
            X.11F r0 = (X.AnonymousClass11F) r0
            int r3 = r5.A00
            int r2 = r5.A01
            boolean r1 = r0 instanceof X.C28981Uw
            if (r1 == 0) goto L_0x034f
            X.1O8 r11 = r4.A03
            X.1Uw r0 = (X.C28981Uw) r0
            r14 = 0
            X.1AQ r15 = r11.A06
            X.1O9 r13 = r11.A05
            X.3mx r10 = new X.3mx
            r12 = r11
            r10.<init>(r11, r12, r13, r14, r15)
            long r1 = r11.A00
            X.0wo r7 = r11.A01
            long r5 = X.C19970wo.A00(r7)
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x034e
            r1 = r3 & 1
            if (r1 == 0) goto L_0x026e
            X.1AT r1 = r15.A01
            boolean r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x026e
        L_0x0247:
            r5 = 1
            if (r5 == r3) goto L_0x024b
            r5 = 0
        L_0x024b:
            X.1OB r6 = r11.A04
            X.5xp r4 = r6.A00(r0, r5)
            if (r4 == 0) goto L_0x034e
            X.11F r1 = r4.A03
            boolean r1 = r1 instanceof X.C28981Uw
            if (r1 == 0) goto L_0x02f0
            java.lang.String r1 = r4.A04
            if (r1 == 0) goto L_0x02f0
            android.net.Uri r2 = android.net.Uri.parse(r1)
            java.lang.String r1 = "oe"
            java.lang.String r2 = r2.getQueryParameter(r1)
            r8 = -1
            if (r2 == 0) goto L_0x0290
            r1 = 16
            goto L_0x027b
        L_0x026e:
            r1 = r3 & 2
            if (r1 == 0) goto L_0x034e
            X.1AT r1 = r15.A02
            boolean r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x034e
            goto L_0x0247
        L_0x027b:
            long r8 = java.lang.Long.parseLong(r2, r1)     // Catch:{ NumberFormatException -> 0x027f }
        L_0x027f:
            r2 = 0
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0290
            r1 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r1
            long r2 = X.C19970wo.A00(r7)
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x02f0
        L_0x0290:
            java.lang.String r1 = "ProfilePhotoManager/loadNewsletterProfilePicture loading pic with expired url/requesting new url"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.3no r1 = new X.3no
            r1.<init>(r10, r11, r5)
            r2 = 0
            X.AnonymousClass00C.A0D(r0, r2)
            X.1GQ r3 = r6.A02
            r2 = 3877(0xf25, float:5.433E-42)
            boolean r2 = X.AnonymousClass1GQ.A01(r3, r2)
            if (r2 == 0) goto L_0x034e
            X.12q r2 = r6.A01
            boolean r2 = X.C65903Tx.A06(r2, r0, r3)
            if (r2 == 0) goto L_0x034e
            X.1OA r4 = r6.A03
            X.1GQ r3 = r4.A01
            r2 = 3877(0xf25, float:5.433E-42)
            boolean r2 = X.AnonymousClass1GQ.A01(r3, r2)
            if (r2 == 0) goto L_0x034e
            X.0yC r5 = r4.A00
            r2 = 3604(0xe14, float:5.05E-42)
            X.0yV r4 = X.C21000yV.A02
            boolean r2 = X.C20800yB.A01(r4, r5, r2)
            if (r2 == 0) goto L_0x034e
            r3 = 1
            r7 = 0
            int r3 = r3 << r7
            r2 = 3605(0xe15, float:5.052E-42)
            int r2 = X.C20800yB.A00(r4, r5, r2)
            r3 = r3 & r2
            if (r3 == 0) goto L_0x034e
            X.164 r2 = r6.A00
            r5 = 1
            X.9d8 r4 = new X.9d8
            r6 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.8fM r3 = new X.8fM
            r3.<init>(r0, r1, r4)
            r2.A01(r3)
            return
        L_0x02f0:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10.Bdf(r4, r0)
            return
        L_0x02f8:
            java.lang.Object r7 = r5.A02
            X.1cI r7 = (X.C31731cI) r7
            java.lang.Object r6 = r5.A03
            X.9uj r6 = (X.C207209uj) r6
            int r2 = r5.A00
            int r4 = r5.A01
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "need to send retry receipt; stanzaKey="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            byte[] r3 = X.C203239na.A02(r2)
            r0 = 1
            if (r4 <= r0) goto L_0x0324
            X.0xL r0 = r7.A01
            r0.A06()
        L_0x0324:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "axolotl sending retry receipt; stanzaKey="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; localRegistrationId="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1P5 r2 = r7.A06
            com.whatsapp.jid.UserJid r1 = r6.A00()
            X.C18740tg.A06(r1)
            int r0 = r4 + 1
            r2.A0Y(r1, r3, r0)
        L_0x034e:
            return
        L_0x034f:
            X.1O8 r1 = r4.A03
            r1.A01(r0, r2, r3)
            return
        L_0x0355:
            int r0 = r5.A00
            int r4 = r5.A01
            java.lang.Object r3 = r5.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r5.A03
            X.1PZ r2 = (X.AnonymousClass1PZ) r2
            X.2RF r1 = new X.2RF
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A03 = r0
            r1.A02 = r3
            java.lang.String r0 = r2.A00
            r1.A05 = r0
            X.1NX r0 = r2.A01
            X.00T r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.A04 = r0
            X.0yW r0 = r2.A03
            r0.Bly(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35271iQ.run():void");
    }
}
