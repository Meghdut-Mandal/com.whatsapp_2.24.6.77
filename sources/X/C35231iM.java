package X;

/* renamed from: X.1iM  reason: invalid class name and case insensitive filesystem */
public class C35231iM implements Runnable {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C35231iM(C28361Si r2, int i, boolean z) {
        this.A02 = i;
        if (5 - i != 0) {
            this.A00 = r2;
            this.A01 = z;
            return;
        }
        this.A00 = r2;
        this.A01 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03e8, code lost:
        if (r7 == null) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0715, code lost:
        r2.Bpg(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0718, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x07e9, code lost:
        r2.A03(r1, "MessageNotification1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07ee, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r3 = r30
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x0841;
                case 1: goto L_0x0719;
                case 2: goto L_0x06ff;
                case 3: goto L_0x06c3;
                case 4: goto L_0x07ef;
                case 5: goto L_0x07be;
                case 6: goto L_0x078f;
                case 7: goto L_0x0785;
                case 8: goto L_0x0779;
                case 9: goto L_0x00f0;
                case 10: goto L_0x0764;
                case 11: goto L_0x00d9;
                case 12: goto L_0x003a;
                case 13: goto L_0x0007;
                case 14: goto L_0x0007;
                case 15: goto L_0x0019;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r1 = r3.A01
            java.lang.Object r0 = r3.A00
            X.1hr r0 = (X.C34921hr) r0
            if (r1 != 0) goto L_0x0018
            X.17Y r2 = r0.A00
            r1 = 0
            r0 = 2131897196(0x7f122b6c, float:1.9429275E38)
            r2.A06(r0, r1)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r0 = r3.A00
            X.1UM r0 = (X.AnonymousClass1UM) r0
            X.1UL r0 = r0.A01
            java.lang.Iterable r0 = r0.getObservers()
            X.AnonymousClass00C.A08(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x002a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r1.next()
            X.3HN r0 = (X.AnonymousClass3HN) r0
            r0.A01()
            goto L_0x002a
        L_0x003a:
            java.lang.Object r5 = r3.A00
            X.1c1 r5 = (X.C31561c1) r5
            boolean r2 = r3.A01
            r11 = 0
            java.util.ArrayList r6 = X.C31561c1.A00(r5, r11)
            r0 = 1
            java.util.ArrayList r4 = X.C31561c1.A00(r5, r0)
            int r7 = r6.size()
            int r0 = r4.size()
            if (r7 != 0) goto L_0x0057
            if (r0 != 0) goto L_0x0057
            return
        L_0x0057:
            int r7 = r7 + r0
            java.util.Map r0 = r5.A0C
            java.util.Collection r0 = r0.values()
            X.AnonymousClass00C.A0D(r0, r11)
            java.util.Iterator r1 = r0.iterator()
            r12 = 0
        L_0x0066:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r12 = r12 + r0
            goto L_0x0066
        L_0x0078:
            if (r2 == 0) goto L_0x00a8
            java.util.Iterator r2 = r4.iterator()
        L_0x007e:
            boolean r0 = r2.hasNext()
            java.lang.String r3 = "replyreminder"
            if (r0 == 0) goto L_0x0092
            java.lang.Object r1 = r2.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Fq r0 = r5.A05
            r0.A06(r1, r3)
            goto L_0x007e
        L_0x0092:
            java.util.Iterator r2 = r6.iterator()
        L_0x0096:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r1 = r2.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Fq r0 = r5.A05
            r0.A06(r1, r3)
            goto L_0x0096
        L_0x00a8:
            r1 = 1
            if (r7 > r1) goto L_0x0866
            if (r12 > r1) goto L_0x0866
            java.util.Iterator r2 = r6.iterator()
        L_0x00b1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r1 = r2.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            java.lang.String r0 = ""
            r5.A02(r1, r1, r1, r0)
            goto L_0x00b1
        L_0x00c3:
            java.util.Iterator r2 = r4.iterator()
        L_0x00c7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r1 = r2.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            java.lang.String r0 = ""
            r5.A02(r1, r1, r1, r0)
            goto L_0x00c7
        L_0x00d9:
            java.lang.Object r5 = r3.A00
            X.1aL r5 = (X.C30521aL) r5
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0018
            r3 = 1000(0x3e8, double:4.94E-321)
            X.17Y r2 = r5.A01
            r1 = 23
            X.1jA r0 = new X.1jA
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.A0I(r0, r3)
            return
        L_0x00f0:
            java.lang.Object r2 = r3.A00
            X.1aL r2 = (X.C30521aL) r2
            boolean r0 = r3.A01
            r26 = r0
            X.1DQ r0 = r2.A0B
            android.os.Handler r1 = r0.A00
            r0 = 7
            android.os.Message r0 = android.os.Message.obtain(r1, r0)
            r0.sendToTarget()
            X.1Xd r9 = r2.A0A
            X.1SR r8 = r9.A0B
            java.lang.Object r7 = r8.A0b
            monitor-enter(r7)
            java.util.ArrayList r21 = new java.util.ArrayList     // Catch:{ all -> 0x0976 }
            r21.<init>()     // Catch:{ all -> 0x0976 }
            X.12P r0 = r8.A0J     // Catch:{ all -> 0x0976 }
            X.1M0 r20 = r0.A05()     // Catch:{ all -> 0x0976 }
            r0 = r20
            X.14e r14 = r0.A02     // Catch:{ all -> 0x096c }
            java.lang.String r13 = "SELECT _id, key_id, from_me, chat_row_id, sender_jid_row_id, timestamp, message_type, revoked_key_id, retry_count, admin_jid_row_id, orphan_message_data  FROM message_orphaned_edit"
            r0 = 0
            java.lang.String r12 = "GET_ORPHANED_EDITS_SQL"
            android.database.Cursor r6 = r14.A09(r13, r12, r0)     // Catch:{ all -> 0x096c }
            X.16E r0 = r8.A0N     // Catch:{ all -> 0x0960 }
            java.util.Map r19 = r0.A0C()     // Catch:{ all -> 0x0960 }
            X.0wo r0 = r8.A02     // Catch:{ all -> 0x0960 }
            long r17 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0960 }
            r5 = 0
            r4 = 0
            r1 = 0
        L_0x0132:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0960 }
            if (r0 == 0) goto L_0x01b5
            X.3AW r11 = r8.A01(r6)     // Catch:{ all -> 0x0960 }
            if (r11 == 0) goto L_0x01aa
            int r1 = r11.A01     // Catch:{ all -> 0x0960 }
            if (r1 != 0) goto L_0x0185
            java.lang.String r0 = r11.A06     // Catch:{ all -> 0x0960 }
            r16 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r16)     // Catch:{ all -> 0x0960 }
            if (r0 != 0) goto L_0x01b2
            com.whatsapp.jid.UserJid r15 = r11.A04     // Catch:{ all -> 0x0960 }
            if (r15 != 0) goto L_0x0179
            X.3Qa r10 = r11.A05     // Catch:{ all -> 0x0960 }
            long r0 = r11.A02     // Catch:{ all -> 0x0960 }
            X.2c7 r3 = new X.2c7     // Catch:{ all -> 0x0960 }
            r3.<init>(r10, r0)     // Catch:{ all -> 0x0960 }
        L_0x0159:
            r0 = r16
            r3.A01 = r0     // Catch:{ all -> 0x0960 }
            X.11F r0 = r11.A03     // Catch:{ all -> 0x0960 }
            r3.A0q(r0)     // Catch:{ all -> 0x0960 }
            int r0 = r11.A00     // Catch:{ all -> 0x0960 }
            r3.A0C = r0     // Catch:{ all -> 0x0960 }
            r0 = -1
            r3.A1Q = r0     // Catch:{ all -> 0x0960 }
            boolean r0 = r10.A02     // Catch:{ all -> 0x0960 }
            if (r0 == 0) goto L_0x0171
            r0 = 1
            r3.A1Y = r0     // Catch:{ all -> 0x0960 }
        L_0x0171:
            r1 = 1
            r0 = 0
            X.AnonymousClass1SR.A00(r8, r3, r0, r0, r1)     // Catch:{ all -> 0x0960 }
            int r5 = r5 + 1
            goto L_0x01b2
        L_0x0179:
            X.3Qa r10 = r11.A05     // Catch:{ all -> 0x0960 }
            long r0 = r11.A02     // Catch:{ all -> 0x0960 }
            X.2c8 r3 = new X.2c8     // Catch:{ all -> 0x0960 }
            r3.<init>(r10, r0)     // Catch:{ all -> 0x0960 }
            r3.A00 = r15     // Catch:{ all -> 0x0960 }
            goto L_0x0159
        L_0x0185:
            r0 = 1
            if (r1 != r0) goto L_0x01b2
            long r0 = r11.A02     // Catch:{ all -> 0x0960 }
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 + r15
            int r3 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r3 <= 0) goto L_0x01b2
            X.11F r1 = r11.A03     // Catch:{ all -> 0x0960 }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0960 }
            com.whatsapp.jid.UserJid r1 = X.C222813r.A00(r1)     // Catch:{ all -> 0x0960 }
            if (r1 == 0) goto L_0x01b2
            r0 = r19
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0960 }
            if (r0 == 0) goto L_0x01b2
            r0 = r21
            r0.add(r11)     // Catch:{ all -> 0x0960 }
            goto L_0x01b0
        L_0x01aa:
            java.lang.String r0 = "msgstore/edit/resolve-orphaned-edits error reading orphaned message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0960 }
            goto L_0x01b2
        L_0x01b0:
            int r4 = r4 + 1
        L_0x01b2:
            r1 = 1
            goto L_0x0132
        L_0x01b5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0960 }
            r3.<init>()     // Catch:{ all -> 0x0960 }
            java.lang.String r0 = "msgstore/edit/resolve-orphaned-edits orphaned="
            r3.append(r0)     // Catch:{ all -> 0x0960 }
            r3.append(r5)     // Catch:{ all -> 0x0960 }
            java.lang.String r0 = " delayed="
            r3.append(r0)     // Catch:{ all -> 0x0960 }
            r3.append(r4)     // Catch:{ all -> 0x0960 }
            java.lang.String r0 = " deleteNeeded="
            r3.append(r0)     // Catch:{ all -> 0x0960 }
            r3.append(r1)     // Catch:{ all -> 0x0960 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0960 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0960 }
            if (r1 == 0) goto L_0x01f5
            java.lang.String r5 = "message_orphaned_edit"
            java.lang.String r4 = "message_type IN ( ?, ? )"
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0960 }
            r1 = 0
            java.lang.String r0 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0960 }
            r3[r1] = r0     // Catch:{ all -> 0x0960 }
            r1 = 1
            java.lang.String r0 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0960 }
            r3[r1] = r0     // Catch:{ all -> 0x0960 }
            java.lang.String r0 = "EditMessageStore/DELETE_ORPHANED_EDITS_SQL"
            r14.A03(r5, r4, r0, r3)     // Catch:{ all -> 0x0960 }
        L_0x01f5:
            r6.close()     // Catch:{ all -> 0x096c }
            r20.close()     // Catch:{ all -> 0x0976 }
            monitor-exit(r7)     // Catch:{ all -> 0x0976 }
            X.0yC r1 = r9.A0W
            r0 = 2189(0x88d, float:3.067E-42)
            X.0yV r14 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r14, r1, r0)
            if (r0 == 0) goto L_0x0290
            X.12P r0 = r9.A0L
            X.1M0 r3 = r0.A05()
            X.14e r1 = r3.A02     // Catch:{ all -> 0x0913 }
            r0 = 0
            android.database.Cursor r4 = r1.A09(r13, r12, r0)     // Catch:{ all -> 0x0913 }
            r4.getCount()     // Catch:{ all -> 0x0907 }
        L_0x0218:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0907 }
            if (r0 == 0) goto L_0x028a
            X.3AW r6 = r8.A01(r4)     // Catch:{ all -> 0x0907 }
            if (r6 == 0) goto L_0x0218
            int r1 = r6.A01     // Catch:{ all -> 0x0907 }
            r0 = 2
            if (r1 != r0) goto L_0x0218
            X.0xh r10 = r9.A0X     // Catch:{ all -> 0x0907 }
            r5 = 0
            byte[] r0 = r6.A07     // Catch:{ 186 -> 0x0283, 1Ta -> 0x0257 }
            X.8SX r11 = X.AnonymousClass8SX.A0i(r0)     // Catch:{ 186 -> 0x0283, 1Ta -> 0x0257 }
            int r0 = r11.bitField1_     // Catch:{ 186 -> 0x0283, 1Ta -> 0x0257 }
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0251
            X.3Qa r7 = r6.A05     // Catch:{ 186 -> 0x0283, 1Ta -> 0x0257 }
            long r0 = r6.A02     // Catch:{ 186 -> 0x0283, 1Ta -> 0x0257 }
            X.9T0 r1 = X.C1899296d.A00(r11, r7, r0)     // Catch:{ 186 -> 0x0283, 1Ta -> 0x0257 }
            r0 = 1
            r1.A01 = r0     // Catch:{ 186 -> 0x0283, 1Ta -> 0x0257 }
            X.9YL r0 = r1.A00()     // Catch:{ 186 -> 0x0283, 1Ta -> 0x0257 }
            X.3T1 r5 = r10.A00(r0)     // Catch:{ 186 -> 0x0283, 1Ta -> 0x0257 }
            X.11F r0 = r6.A03     // Catch:{ 186 -> 0x0283, 1Ta -> 0x0257 }
            r5.A0q(r0)     // Catch:{ 186 -> 0x0283, 1Ta -> 0x0257 }
            goto L_0x025f
        L_0x0251:
            java.lang.String r0 = "EditedMessageManager/getMessageAddOnFromOrphan/Invalid edited orphan message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 186 -> 0x0283, 1Ta -> 0x0257 }
            goto L_0x0218
        L_0x0257:
            r1 = move-exception
            java.lang.String r0 = "EditedMessageManager/buildFMessageFromOrphanEdit/Bad e2e message found "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0907 }
            if (r5 == 0) goto L_0x0218
        L_0x025f:
            r1 = 0
            r0 = 1
            X.3T1 r0 = X.C29571Xd.A00(r9, r5, r1, r0)     // Catch:{ IllegalArgumentException -> 0x026b }
            if (r0 == 0) goto L_0x0218
            r9.A02(r5)     // Catch:{ IllegalArgumentException -> 0x026b }
            goto L_0x0218
        L_0x026b:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0907 }
            r1.<init>()     // Catch:{ all -> 0x0907 }
            java.lang.String r0 = "EditMessageManager/resolveOrphanedEdits/edit resolution resulted in IllegalArgumentException for :"
            r1.append(r0)     // Catch:{ all -> 0x0907 }
            X.3Qa r0 = r6.A05     // Catch:{ all -> 0x0907 }
            r1.append(r0)     // Catch:{ all -> 0x0907 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0907 }
            com.whatsapp.util.Log.e(r0, r5)     // Catch:{ all -> 0x0907 }
            goto L_0x0218
        L_0x0283:
            r1 = move-exception
            java.lang.String r0 = "EditedMessageManager/getMessageAddOnFromOrphan/Failed to parse orphan message "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0907 }
            goto L_0x0218
        L_0x028a:
            r4.close()     // Catch:{ all -> 0x0913 }
            r3.close()
        L_0x0290:
            java.util.Iterator r5 = r21.iterator()
        L_0x0294:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02e8
            java.lang.Object r3 = r5.next()
            X.3AW r3 = (X.AnonymousClass3AW) r3
            X.1aK r6 = r2.A00
            X.9Sf r4 = new X.9Sf
            r4.<init>()
            X.3Qa r1 = r3.A05
            X.11F r0 = r1.A00
            X.C18740tg.A06(r0)
            r4.A02 = r0
            java.lang.String r0 = r1.A01
            r4.A07 = r0
            long r0 = r3.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A05 = r0
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A04 = r0
            X.AHp r7 = r4.A00()
            X.11F r0 = r3.A03
            X.C18740tg.A06(r0)
            r7.A0E = r0
            r0 = 7
            r7.A01 = r0
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A0Y = r0
            r8 = 0
            r12 = 1
            r10 = r8
            r11 = r8
            r9 = r8
            X.9Sr r1 = r6.A00(r7, r8, r9, r10, r11, r12)
            r0 = 13
            r1.A00(r0)
            goto L_0x0294
        L_0x02e8:
            X.1Jd r5 = r2.A0E
            java.lang.String r0 = "MessageAddOnManager/resolveOrphanedMessageAddOns"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r29 = new java.util.HashSet
            r29.<init>()
            java.util.HashSet r28 = new java.util.HashSet
            r28.<init>()
            X.12P r0 = r5.A0C
            X.1M0 r27 = r0.get()
            X.1Jj r6 = r5.A0E     // Catch:{ all -> 0x0956 }
            r0 = r27
            X.14e r4 = r0.A02     // Catch:{ all -> 0x0956 }
            java.lang.String r3 = X.AnonymousClass3TN.A03     // Catch:{ all -> 0x0956 }
            r1 = 0
            java.lang.String r0 = "MessageAddOnOrphanStore/getMessageAddOnOrphansCursor"
            android.database.Cursor r4 = r4.A09(r3, r0, r1)     // Catch:{ all -> 0x0956 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x094a }
            r3.<init>()     // Catch:{ all -> 0x094a }
            java.lang.String[] r0 = X.C73923km.A00     // Catch:{ all -> 0x094a }
            X.C224014d.A02(r4, r3, r0)     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "_id"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x094a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x094a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x094a }
            int r25 = r0.intValue()     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "parent_from_me"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x094a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x094a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x094a }
            int r24 = r0.intValue()     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "parent_key_id"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x094a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x094a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x094a }
            int r23 = r0.intValue()     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "parent_chat_row_id"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x094a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x094a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x094a }
            int r22 = r0.intValue()     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "parent_sender_jid_row_id"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x094a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x094a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x094a }
            int r21 = r0.intValue()     // Catch:{ all -> 0x094a }
        L_0x0363:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x094a }
            if (r0 == 0) goto L_0x0502
            r0 = r25
            long r19 = r4.getLong(r0)     // Catch:{ all -> 0x094a }
            r0 = r22
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x094a }
            X.163 r7 = r5.A05     // Catch:{ all -> 0x094a }
            long r0 = (long) r0     // Catch:{ all -> 0x094a }
            X.11F r11 = r7.A0A(r0)     // Catch:{ all -> 0x094a }
            r0 = r24
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x094a }
            r12 = 1
            if (r0 == r12) goto L_0x0386
            r12 = 0
        L_0x0386:
            r0 = r23
            java.lang.String r7 = r4.getString(r0)     // Catch:{ all -> 0x094a }
            r0 = r21
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x094a }
            X.12j r8 = r5.A09     // Catch:{ all -> 0x094a }
            java.lang.Class<X.11F> r10 = X.AnonymousClass11F.class
            long r0 = (long) r0     // Catch:{ all -> 0x094a }
            com.whatsapp.jid.Jid r9 = r8.A0C(r10, r0)     // Catch:{ all -> 0x094a }
            X.11F r9 = (X.AnonymousClass11F) r9     // Catch:{ all -> 0x094a }
            if (r11 != 0) goto L_0x03be
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x094a }
            r8.<init>()     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "MessageAddOnManager/resolveOrphanedMessageAddOns ignoring orphanId="
            r8.append(r0)     // Catch:{ all -> 0x094a }
            r0 = r19
            r8.append(r0)     // Catch:{ all -> 0x094a }
            java.lang.String r0 = " id="
            r8.append(r0)     // Catch:{ all -> 0x094a }
            r8.append(r7)     // Catch:{ all -> 0x094a }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x094a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x094a }
            goto L_0x0363
        L_0x03be:
            X.3Qa r8 = new X.3Qa     // Catch:{ all -> 0x094a }
            r8.<init>(r11, r7, r12)     // Catch:{ all -> 0x094a }
            r0 = r29
            boolean r0 = r0.contains(r8)     // Catch:{ all -> 0x094a }
            if (r0 != 0) goto L_0x0363
            X.1A1 r1 = r5.A0J     // Catch:{ all -> 0x094a }
            X.3T1 r7 = r1.A03(r8)     // Catch:{ all -> 0x094a }
            if (r7 != 0) goto L_0x03f1
            X.1Jg r0 = r5.A0A     // Catch:{ all -> 0x094a }
            android.database.Cursor r11 = r0.A00(r8)     // Catch:{ all -> 0x094a }
            if (r11 == 0) goto L_0x03ea
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0918 }
            if (r0 == 0) goto L_0x03e5
            X.3T1 r7 = r1.A00(r11)     // Catch:{ all -> 0x0918 }
        L_0x03e5:
            r11.close()     // Catch:{ all -> 0x094a }
            if (r7 != 0) goto L_0x03f1
        L_0x03ea:
            r0 = r29
            r0.add(r8)     // Catch:{ all -> 0x094a }
            goto L_0x0363
        L_0x03f1:
            X.1Je r11 = r5.A0B     // Catch:{ all -> 0x094a }
            long r0 = r7.A1N     // Catch:{ all -> 0x094a }
            byte[] r11 = r11.A01(r0)     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "chat_row_id"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x094a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x094a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x094a }
            int r1 = r0.intValue()     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "from_me"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x094a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x094a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x094a }
            int r15 = r0.intValue()     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "key_id"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x094a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x094a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x094a }
            int r12 = r0.intValue()     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "sender_jid_row_id"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x094a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x094a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x094a }
            int r18 = r0.intValue()     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "timestamp"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x094a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x094a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x094a }
            int r17 = r0.intValue()     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "orphan_message_data"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x094a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x094a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x094a }
            int r16 = r0.intValue()     // Catch:{ all -> 0x094a }
            int r0 = r4.getInt(r1)     // Catch:{ all -> 0x094a }
            X.163 r13 = r6.A00     // Catch:{ all -> 0x094a }
            long r0 = (long) r0     // Catch:{ all -> 0x094a }
            X.11F r13 = r13.A0A(r0)     // Catch:{ all -> 0x094a }
            int r0 = r4.getInt(r15)     // Catch:{ all -> 0x094a }
            r1 = 1
            if (r0 == r1) goto L_0x0466
            r1 = 0
        L_0x0466:
            java.lang.String r0 = r4.getString(r12)     // Catch:{ all -> 0x094a }
            X.3Qa r12 = new X.3Qa     // Catch:{ all -> 0x094a }
            r12.<init>(r13, r0, r1)     // Catch:{ all -> 0x094a }
            r0 = r18
            int r1 = r4.getInt(r0)     // Catch:{ all -> 0x094a }
            r0 = -1
            if (r1 == r0) goto L_0x048e
            X.12j r13 = r6.A01     // Catch:{ all -> 0x094a }
            long r0 = (long) r1     // Catch:{ all -> 0x094a }
            com.whatsapp.jid.Jid r13 = r13.A0C(r10, r0)     // Catch:{ all -> 0x094a }
            X.11F r13 = (X.AnonymousClass11F) r13     // Catch:{ all -> 0x094a }
        L_0x0481:
            r0 = r17
            long r0 = r4.getLong(r0)     // Catch:{ all -> 0x094a }
            r10 = r16
            byte[] r10 = r4.getBlob(r10)     // Catch:{ all -> 0x094a }
            goto L_0x0490
        L_0x048e:
            r13 = 0
            goto L_0x0481
        L_0x0490:
            X.8SX r10 = X.AnonymousClass8SX.A0i(r10)     // Catch:{ 186 -> 0x04fa }
            r15 = 0
            X.AnonymousClass00C.A0D(r10, r15)     // Catch:{ all -> 0x094a }
            X.9T0 r0 = X.C1899296d.A00(r10, r12, r0)     // Catch:{ all -> 0x094a }
            X.9YL r1 = r0.A00()     // Catch:{ all -> 0x094a }
            X.0xh r0 = r6.A03     // Catch:{ 1Ta -> 0x0363 }
            X.3T1 r10 = r0.A00(r1)     // Catch:{ 1Ta -> 0x0363 }
            boolean r0 = r10 instanceof X.AnonymousClass2bM     // Catch:{ 1Ta -> 0x0363 }
            if (r0 == 0) goto L_0x0363
            X.2bM r10 = (X.AnonymousClass2bM) r10     // Catch:{ 1Ta -> 0x0363 }
            r10.A0q(r13)     // Catch:{ all -> 0x094a }
            X.9Vv r0 = new X.9Vv     // Catch:{ all -> 0x094a }
            r0.<init>(r9, r8)     // Catch:{ all -> 0x094a }
            r10.A04 = r0     // Catch:{ all -> 0x094a }
            if (r11 == 0) goto L_0x04ba
            r10.A1b = r11     // Catch:{ all -> 0x094a }
        L_0x04ba:
            boolean r0 = r7 instanceof X.AnonymousClass2bK     // Catch:{ all -> 0x094a }
            if (r0 == 0) goto L_0x04c4
            boolean r0 = r10 instanceof X.C180858mX     // Catch:{ all -> 0x094a }
            if (r0 == 0) goto L_0x04c4
            goto L_0x0363
        L_0x04c4:
            boolean r0 = r7 instanceof X.C46732ba     // Catch:{ all -> 0x094a }
            if (r0 == 0) goto L_0x04d5
            X.3Qa r8 = r7.A1J     // Catch:{ all -> 0x094a }
            com.whatsapp.jid.UserJid r1 = r7.A0L()     // Catch:{ all -> 0x094a }
            X.9Vv r0 = new X.9Vv     // Catch:{ all -> 0x094a }
            r0.<init>(r1, r8)     // Catch:{ all -> 0x094a }
            r10.A04 = r0     // Catch:{ all -> 0x094a }
        L_0x04d5:
            int r7 = X.C26171Jd.A00(r5, r10, r15)     // Catch:{ all -> 0x094a }
            boolean r0 = X.C65733Tg.A02(r7)     // Catch:{ all -> 0x094a }
            if (r0 != 0) goto L_0x04e2
            r0 = 5
            if (r7 != r0) goto L_0x04eb
        L_0x04e2:
            java.lang.Long r1 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x094a }
            r0 = r28
            r0.add(r1)     // Catch:{ all -> 0x094a }
        L_0x04eb:
            r0 = 8
            if (r7 == r0) goto L_0x04f5
            r0 = 9
            if (r7 == r0) goto L_0x04f5
            goto L_0x0363
        L_0x04f5:
            r5.A0K(r10)     // Catch:{ all -> 0x094a }
            goto L_0x0363
        L_0x04fa:
            r1 = move-exception
            java.lang.String r0 = "MessageAddOnOrphanStore/getMessageAddOnFromOrphan failed to parse orphan message"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x094a }
            goto L_0x0363
        L_0x0502:
            boolean r0 = r28.isEmpty()     // Catch:{ all -> 0x094a }
            if (r0 != 0) goto L_0x058f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x094a }
            r1.<init>()     // Catch:{ all -> 0x094a }
            java.lang.String r0 = "MessageAddOnManager/deleteMessageAddOnOrphans count = "
            r1.append(r0)     // Catch:{ all -> 0x094a }
            int r0 = r28.size()     // Catch:{ all -> 0x094a }
            r1.append(r0)     // Catch:{ all -> 0x094a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x094a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x094a }
            int r0 = r28.size()     // Catch:{ all -> 0x094a }
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x094a }
            java.util.Iterator r5 = r28.iterator()     // Catch:{ all -> 0x094a }
            r3 = 0
        L_0x052b:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x094a }
            if (r0 == 0) goto L_0x0545
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x094a }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x094a }
            long r7 = r0.longValue()     // Catch:{ all -> 0x094a }
            int r1 = r3 + 1
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x094a }
            r9[r3] = r0     // Catch:{ all -> 0x094a }
            r3 = r1
            goto L_0x052b
        L_0x0545:
            r0 = 975(0x3cf, float:1.366E-42)
            X.72Z r1 = new X.72Z     // Catch:{ all -> 0x094a }
            r1.<init>(r9, r0)     // Catch:{ all -> 0x094a }
            X.12P r0 = r6.A02     // Catch:{ all -> 0x094a }
            X.1M0 r7 = r0.A05()     // Catch:{ all -> 0x094a }
            X.71s r9 = r7.B1k()     // Catch:{ all -> 0x0929 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x091f }
        L_0x055a:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x091f }
            if (r0 == 0) goto L_0x0586
            java.lang.Object r6 = r8.next()     // Catch:{ all -> 0x091f }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ all -> 0x091f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x091f }
            r1.<init>()     // Catch:{ all -> 0x091f }
            java.lang.String r0 = "_id IN "
            r1.append(r0)     // Catch:{ all -> 0x091f }
            int r0 = r6.length     // Catch:{ all -> 0x091f }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r0)     // Catch:{ all -> 0x091f }
            r1.append(r0)     // Catch:{ all -> 0x091f }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x091f }
            X.14e r3 = r7.A02     // Catch:{ all -> 0x091f }
            java.lang.String r1 = "message_add_on_orphan"
            java.lang.String r0 = "MessageAddOnOrphanStore/deleteMessageAddOnOrphans"
            r3.A03(r1, r5, r0, r6)     // Catch:{ all -> 0x091f }
            goto L_0x055a
        L_0x0586:
            r9.A00()     // Catch:{ all -> 0x091f }
            r9.close()     // Catch:{ all -> 0x0929 }
            r7.close()     // Catch:{ all -> 0x094a }
        L_0x058f:
            r4.close()     // Catch:{ all -> 0x0956 }
            r27.close()
            X.0wU r3 = r2.A0U
            r0 = 21
            X.1jA r1 = new X.1jA
            r1.<init>((java.lang.Object) r2, (int) r0)
            java.lang.String r0 = "OfflineResumeHandler/onOfflineComplete orphaned messages"
            r3.Boz(r1, r0)
            X.0yC r5 = r2.A0H
            X.0yV r1 = X.C21000yV.A01
            r0 = 3702(0xe76, float:5.188E-42)
            boolean r0 = X.C20800yB.A01(r1, r5, r0)
            if (r0 == 0) goto L_0x061c
            X.1aO r7 = r2.A06
            java.lang.String r0 = "PresortingChatsManager/resetConversationTimestamps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1A6 r0 = r7.A00
            X.1A7 r6 = r0.A01
            monitor-enter(r6)
            boolean r1 = r6.A00     // Catch:{ all -> 0x0937 }
            r0 = 0
            if (r1 == 0) goto L_0x0613
            r6.A00 = r0     // Catch:{ all -> 0x0937 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0937 }
            r8.<init>()     // Catch:{ all -> 0x0937 }
            java.util.HashMap r10 = r6.A03     // Catch:{ all -> 0x0937 }
            java.util.Set r0 = r10.entrySet()     // Catch:{ all -> 0x0937 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0937 }
        L_0x05d1:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0937 }
            if (r0 == 0) goto L_0x05f6
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0937 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0937 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0937 }
            X.11F r1 = (X.AnonymousClass11F) r1     // Catch:{ all -> 0x0937 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0937 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0937 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x0937 }
            X.3I6 r0 = new X.3I6     // Catch:{ all -> 0x0937 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0937 }
            r8.add(r0)     // Catch:{ all -> 0x0937 }
            goto L_0x05d1
        L_0x05f6:
            r10.clear()     // Catch:{ all -> 0x0937 }
            java.util.Comparator r0 = r6.A02     // Catch:{ all -> 0x0937 }
            java.util.Collections.sort(r8, r0)     // Catch:{ all -> 0x0937 }
            java.util.ArrayList r1 = r6.A01     // Catch:{ all -> 0x0937 }
            boolean r0 = r1.equals(r8)     // Catch:{ all -> 0x0937 }
            if (r0 != 0) goto L_0x0613
            java.lang.String r0 = "SortedConversationsList/resetThreadMetadata restoring the real timestamps"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0937 }
            r1.clear()     // Catch:{ all -> 0x0937 }
            r1.addAll(r8)     // Catch:{ all -> 0x0937 }
            r0 = 1
            goto L_0x0614
        L_0x0613:
            r0 = 0
        L_0x0614:
            monitor-exit(r6)     // Catch:{ all -> 0x0937 }
            if (r0 == 0) goto L_0x061c
            X.1Cf r0 = r7.A01
            r0.A00()
        L_0x061c:
            r0 = 7461(0x1d25, float:1.0455E-41)
            boolean r0 = X.C20800yB.A01(r14, r5, r0)
            if (r0 == 0) goto L_0x069e
            X.17Y r3 = r2.A01
            r1 = 22
            X.1jA r0 = new X.1jA
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.A0H(r0)
        L_0x0630:
            r0 = 7462(0x1d26, float:1.0456E-41)
            boolean r0 = X.C20800yB.A01(r14, r5, r0)
            if (r0 == 0) goto L_0x0690
            X.17Y r4 = r2.A01
            X.19O r3 = r2.A0V
            java.util.Objects.requireNonNull(r3)
            r1 = 18
            X.1jA r0 = new X.1jA
            r0.<init>((java.lang.Object) r3, (int) r1)
            r4.A0H(r0)
        L_0x0649:
            X.17Y r5 = r2.A01
            X.19J r3 = r2.A02
            java.util.Objects.requireNonNull(r3)
            r1 = 17
            X.1jA r0 = new X.1jA
            r0.<init>((java.lang.Object) r3, (int) r1)
            r5.A0H(r0)
            X.1Ud r4 = r2.A0O
            X.00T r0 = r4.A00
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher r0 = (com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A00
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x06b4
            r3 = 11
            X.1iM r1 = new X.1iM
            r0 = r26
            r1.<init>((int) r3, (java.lang.Object) r2, (boolean) r0)
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x093a
            X.00T r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x093a
            java.lang.String r0 = "DelayedStanzasManager/pullDelayedNotifications ignoring, instead will be pulling when app goes to fg"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.run()
            return
        L_0x0690:
            X.19O r0 = r2.A0V
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0E
            r0 = 0
            r1.set(r0)
            java.lang.String r0 = "XmppConnectionMetrics/onOfflineResumeComplete"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0649
        L_0x069e:
            X.19B r0 = r2.A0N
            X.9WB r4 = r0.A04()
            if (r4 == 0) goto L_0x0630
            X.1MN r3 = r2.A0L
            r1 = 30
            X.1jD r0 = new X.1jD
            r0.<init>(r2, r4, r1)
            r3.A0B(r0)
            goto L_0x0630
        L_0x06b4:
            if (r26 == 0) goto L_0x0018
            r3 = 2000(0x7d0, double:9.88E-321)
            r1 = 23
            X.1jA r0 = new X.1jA
            r0.<init>((java.lang.Object) r2, (int) r1)
            r5.A0I(r0, r3)
            return
        L_0x06c3:
            java.lang.Object r4 = r3.A00
            X.0yX r4 = (X.C21020yX) r4
            boolean r3 = r3.A01
            if (r3 == 0) goto L_0x06db
            X.0v0 r0 = r4.A0H
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "wam_is_current_buffer_real_time"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
        L_0x06db:
            boolean r0 = X.C21020yX.A0D(r4)
            if (r0 == 0) goto L_0x06ee
            X.005 r0 = r4.A0A
            java.lang.Object r1 = r0.get()
            X.7jN r1 = (X.C159447jN) r1
            X.1C9 r0 = r4.A04
            r1.Bpg(r0, r3)
        L_0x06ee:
            boolean r0 = X.C21020yX.A0B(r4)
            if (r0 == 0) goto L_0x0018
            X.005 r0 = r4.A0A
            java.lang.Object r2 = r0.get()
            X.7jN r2 = (X.C159447jN) r2
            X.1C9 r0 = r4.A01
            goto L_0x0715
        L_0x06ff:
            java.lang.Object r1 = r3.A00
            X.0yX r1 = (X.C21020yX) r1
            boolean r3 = r3.A01
            boolean r0 = X.C21020yX.A0C(r1)
            if (r0 == 0) goto L_0x0018
            X.005 r0 = r1.A09
            java.lang.Object r2 = r0.get()
            X.7jN r2 = (X.C159447jN) r2
            X.1C9 r0 = r1.A03
        L_0x0715:
            r2.Bpg(r0, r3)
            return
        L_0x0719:
            java.lang.Object r2 = r3.A00
            X.0xH r2 = (X.C20260xH) r2
            boolean r1 = r3.A01
            X.1WQ r0 = r2.A0K
            r0.A03(r1)
            X.0wG r0 = r2.A0W
            android.content.Context r5 = r0.A00
            X.0yb r0 = r2.A0U
            android.app.ActivityManager r0 = r0.A04()
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x0018
            java.lang.String r4 = r5.getPackageName()
            java.util.Iterator r3 = r0.iterator()
        L_0x073c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0979
            java.lang.Object r2 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            int r1 = r2.importance
            r0 = 100
            if (r1 != r0) goto L_0x073c
            java.lang.String r0 = r2.processName
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x073c
            android.content.Intent r1 = X.AnonymousClass190.A09(r5)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r1.setFlags(r0)
            r5.startActivity(r0)
            goto L_0x073c
        L_0x0764:
            java.lang.Object r4 = r3.A00
            X.1aL r4 = (X.C30521aL) r4
            boolean r3 = r3.A01
            X.1C7 r2 = r4.A09
            r0 = 9
            X.1iM r1 = new X.1iM
            r1.<init>((int) r0, (java.lang.Object) r4, (boolean) r3)
            r0 = 14
            r2.A02(r1, r0)
            return
        L_0x0779:
            java.lang.Object r0 = r3.A00
            X.1fi r0 = (X.C33651fi) r0
            boolean r1 = r3.A01
            X.1YQ r0 = r0.A03
            r0.A09(r1)
            return
        L_0x0785:
            java.lang.Object r1 = r3.A00
            X.1gO r1 = (X.C34061gO) r1
            boolean r0 = r3.A01
            r1.A05(r0)
            return
        L_0x078f:
            java.lang.Object r4 = r3.A00
            X.1Si r4 = (X.C28361Si) r4
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x07ba
            java.lang.String r0 = "updating dismissed notification hash"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r3 = r4.A09
            X.005 r0 = r3.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "last_notification_hash"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r3)
            java.lang.String r0 = "notification_hash"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
        L_0x07ba:
            X.1Fq r2 = r4.A08
            r1 = 1
            goto L_0x07e9
        L_0x07be:
            java.lang.Object r4 = r3.A00
            X.1Si r4 = (X.C28361Si) r4
            java.lang.String r0 = "updating dismissed notification hash"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r3 = r4.A09
            X.005 r0 = r3.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "locked_chat_last_notification_hash"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r3)
            java.lang.String r0 = "locked_chat_notification_hash"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
            X.1Fq r2 = r4.A08
            r1 = 57
        L_0x07e9:
            java.lang.String r0 = "MessageNotification1"
            r2.A03(r1, r0)
            return
        L_0x07ef:
            java.lang.Object r7 = r3.A00
            X.1Zi r7 = (X.C30131Zi) r7
            boolean r6 = r3.A01
            X.0yC r0 = r7.A0E
            X.3oV r8 = new X.3oV
            r8.<init>(r0)
            X.1Dq r0 = r7.A0Q
            java.util.concurrent.ConcurrentHashMap r1 = r0.A00
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.put(r8, r0)
            X.3Su[] r3 = r8.BnK()
            r2 = 4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            r1 = 0
        L_0x0813:
            r0 = r3[r1]
            int r0 = r0.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x0813
            X.1Ds r4 = r7.A0P
            X.3Su[] r3 = r8.BnK()
            X.1Dr r0 = r4.A01
            X.0yC r2 = r0.A00
            r1 = 4679(0x1247, float:6.557E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x083b
            X.1Dj r0 = r4.A02
            r0.A04(r3)
        L_0x083b:
            X.1Dj r0 = r7.A0R
            r0.A03(r5, r6)
            return
        L_0x0841:
            java.lang.Object r0 = r3.A00
            X.1X4 r0 = (X.AnonymousClass1X4) r0
            boolean r3 = r3.A01
            X.17Y r2 = r0.A02
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to "
            r1.append(r0)
            if (r3 == 0) goto L_0x0863
            java.lang.String r0 = "Keep"
        L_0x0857:
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 0
            r2.A0E(r1, r0)
            return
        L_0x0863:
            java.lang.String r0 = "undo Keep"
            goto L_0x0857
        L_0x0866:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.addAll(r6)
            r3.addAll(r4)
            int r0 = r3.size()
            if (r0 <= r1) goto L_0x08ff
            r0 = 0
        L_0x0878:
            java.lang.Object r10 = r3.get(r11)
            X.11F r10 = (X.AnonymousClass11F) r10
            int r1 = r3.size()
            r9 = 1
            r4 = 2
            if (r1 < r4) goto L_0x08ce
            X.16D r2 = r5.A02
            java.lang.Object r1 = r3.get(r11)
            X.11F r1 = (X.AnonymousClass11F) r1
            X.141 r15 = r2.A0A(r1)
            java.lang.Object r1 = r3.get(r9)
            X.11F r1 = (X.AnonymousClass11F) r1
            X.141 r14 = r2.A0A(r1)
            if (r15 == 0) goto L_0x08fd
            if (r14 == 0) goto L_0x08fd
            int r1 = r3.size()
            r3 = 3
            X.0ts r13 = r5.A07
            r8 = 2131755393(0x7f100181, float:1.9141664E38)
            if (r1 != r4) goto L_0x08af
            r8 = 2131755395(0x7f100183, float:1.9141668E38)
        L_0x08af:
            long r1 = (long) r12
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r7[r11] = r3
            X.171 r6 = r5.A03
            java.lang.String r3 = r6.A0H(r15)
            r7[r9] = r3
            java.lang.String r3 = r6.A0H(r14)
            r7[r4] = r3
            java.lang.String r1 = r13.A0L(r7, r8, r1)
        L_0x08ca:
            r5.A02(r0, r10, r0, r1)
            return
        L_0x08ce:
            int r1 = r3.size()
            if (r1 != r9) goto L_0x08fd
            X.16D r2 = r5.A02
            java.lang.Object r1 = r3.get(r11)
            X.11F r1 = (X.AnonymousClass11F) r1
            X.141 r8 = r2.A0A(r1)
            if (r8 == 0) goto L_0x08fd
            X.0ts r7 = r5.A07
            r6 = 2131755394(0x7f100182, float:1.9141666E38)
            long r2 = (long) r12
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r4[r11] = r1
            X.171 r1 = r5.A03
            java.lang.String r1 = r1.A0H(r8)
            r4[r9] = r1
            java.lang.String r1 = r7.A0L(r4, r6, r2)
            goto L_0x08ca
        L_0x08fd:
            r1 = 0
            goto L_0x08ca
        L_0x08ff:
            java.lang.Object r0 = r3.get(r11)
            X.11F r0 = (X.AnonymousClass11F) r0
            goto L_0x0878
        L_0x0907:
            r1 = move-exception
            if (r4 == 0) goto L_0x0912
            r4.close()     // Catch:{ all -> 0x090e }
            goto L_0x0912
        L_0x090e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0913 }
        L_0x0912:
            throw r1     // Catch:{ all -> 0x0913 }
        L_0x0913:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x095b }
            throw r1
        L_0x0918:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x091d }
            goto L_0x0936
        L_0x091d:
            r0 = move-exception
            goto L_0x0933
        L_0x091f:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0924 }
            goto L_0x0928
        L_0x0924:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0929 }
        L_0x0928:
            throw r1     // Catch:{ all -> 0x0929 }
        L_0x0929:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x092e }
            goto L_0x0936
        L_0x092e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x094a }
            goto L_0x0936
        L_0x0933:
            r1.addSuppressed(r0)     // Catch:{ all -> 0x094a }
        L_0x0936:
            throw r1     // Catch:{ all -> 0x094a }
        L_0x0937:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0937 }
            throw r0
        L_0x093a:
            X.040 r3 = r4.A02
            r0 = 0
            com.whatsapp.messaging.offline.DelayedStanzasFetcher$pullDelayedNotifications$1 r2 = new com.whatsapp.messaging.offline.DelayedStanzasFetcher$pullDelayedNotifications$1
            r2.<init>(r4, r1, r0)
            X.03u r1 = X.C008903u.A00
            java.lang.Integer r0 = X.C023109s.A00
            X.AnonymousClass0A2.A02(r0, r1, r2, r3)
            return
        L_0x094a:
            r1 = move-exception
            if (r4 == 0) goto L_0x0955
            r4.close()     // Catch:{ all -> 0x0951 }
            goto L_0x0955
        L_0x0951:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0956 }
        L_0x0955:
            throw r1     // Catch:{ all -> 0x0956 }
        L_0x0956:
            r1 = move-exception
            r27.close()     // Catch:{ all -> 0x095b }
            throw r1
        L_0x095b:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0960:
            r1 = move-exception
            if (r6 == 0) goto L_0x096b
            r6.close()     // Catch:{ all -> 0x0967 }
            goto L_0x096b
        L_0x0967:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x096c }
        L_0x096b:
            throw r1     // Catch:{ all -> 0x096c }
        L_0x096c:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x0971 }
            goto L_0x0975
        L_0x0971:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0976 }
        L_0x0975:
            throw r1     // Catch:{ all -> 0x0976 }
        L_0x0976:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0976 }
            throw r0
        L_0x0979:
            r0 = 0
            java.lang.System.exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35231iM.run():void");
    }

    public C35231iM(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }
}
