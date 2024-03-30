package X;

/* renamed from: X.1iq  reason: invalid class name and case insensitive filesystem */
public class C35531iq implements Runnable {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public C35531iq(Object obj, Object obj2, Object obj3, String str, int i, int i2, long j) {
        this.A06 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i;
        this.A01 = j;
        this.A04 = obj3;
        this.A05 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010b, code lost:
        if ((r0.A1J.A00 instanceof com.whatsapp.jid.UserJid) == false) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r38 = this;
            r2 = r38
            int r0 = r2.A06
            if (r0 == 0) goto L_0x003b
            java.lang.Object r7 = r2.A02
            X.1LW r7 = (X.AnonymousClass1LW) r7
            java.lang.Object r6 = r2.A03
            X.11F r6 = (X.AnonymousClass11F) r6
            java.lang.String r5 = r2.A05
            long r0 = r2.A01
            java.lang.Object r4 = r2.A04
            X.3G4 r4 = (X.AnonymousClass3G4) r4
            int r3 = r2.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.12q r1 = r7.A02
            r0 = 0
            X.3Qp r0 = r1.A09(r6, r0)
            if (r0 != 0) goto L_0x002f
            X.3Qp r0 = new X.3Qp
            r0.<init>((X.AnonymousClass11F) r6)
            r0.A0h = r5
            r1.A0I(r0, r6)
        L_0x002f:
            r0.A0h = r5
            r0.A02 = r3
            if (r4 == 0) goto L_0x0037
            r0.A0e = r4
        L_0x0037:
            X.AnonymousClass1LW.A00(r0, r7, r6, r2)
        L_0x003a:
            return
        L_0x003b:
            java.lang.Object r1 = r2.A02
            X.0xM r1 = (X.C20310xM) r1
            java.lang.Object r6 = r2.A03
            X.3Qa r6 = (X.C64933Qa) r6
            int r5 = r2.A00
            long r8 = r2.A01
            java.lang.Object r4 = r2.A04
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.String r0 = r2.A05
            r37 = r0
            long r16 = android.os.SystemClock.uptimeMillis()
            X.1A1 r0 = r1.A1B
            X.3T1 r0 = r0.A03(r6)
            if (r0 != 0) goto L_0x008f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "CoreMessageStore/receivedbyserver/nosuchmessage: "
            r5.append(r0)
            r5.append(r6)
        L_0x0068:
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x006f:
            if (r4 == 0) goto L_0x003a
            X.1FU r0 = r1.A15
            boolean r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x003a
            boolean r0 = android.text.TextUtils.isEmpty(r37)
            if (r0 != 0) goto L_0x003a
            X.2bV r4 = (X.AnonymousClass2bV) r4
            r0 = r37
            r4.A03 = r0
            X.1Eh r0 = r1.A0r
            X.12P r0 = r0.A00
            X.1M0 r3 = r0.A05()
            goto L_0x04c2
        L_0x008f:
            boolean r2 = r6.A02
            if (r2 != 0) goto L_0x00bc
            X.0wQ r2 = r1.A07
            boolean r2 = X.C66013Ui.A0T(r2, r0)
            if (r2 != 0) goto L_0x00bc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "CoreMessageStore/receivedbyserver/error "
            r2.append(r0)
            X.11F r0 = r6.A00
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            java.lang.String r0 = r6.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x006f
        L_0x00bc:
            int r2 = r0.A0D
            r3 = 4
            boolean r2 = X.AnonymousClass3TJ.A02(r2, r3)
            if (r2 == 0) goto L_0x00e5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "CoreMessageStore/receivedbyserver/statusdowngrade: "
            r5.append(r2)
            r5.append(r6)
            java.lang.String r2 = " current:"
            r5.append(r2)
            int r0 = r0.A0D
            r5.append(r0)
            java.lang.String r0 = " new:"
            r5.append(r0)
            r5.append(r3)
            goto L_0x0068
        L_0x00e5:
            X.0wQ r2 = r1.A07
            boolean r2 = X.C66013Ui.A0V(r2, r0)
            if (r2 == 0) goto L_0x0189
            r2 = 13
            r0.A0n(r2)
        L_0x00f2:
            r0.A0H = r8
            X.005 r2 = r1.A1F
            java.lang.Object r2 = r2.get()
            X.1HX r2 = (X.AnonymousClass1HX) r2
            boolean r2 = r2.A06(r0)
            if (r2 == 0) goto L_0x0186
            if (r5 != 0) goto L_0x010d
            X.3Qa r2 = r0.A1J
            X.11F r2 = r2.A00
            boolean r3 = r2 instanceof com.whatsapp.jid.UserJid
            r2 = 2
            if (r3 != 0) goto L_0x010f
        L_0x010d:
            int r2 = r5 + 1
        L_0x010f:
            r0.A0B = r2
        L_0x0111:
            X.3Qa r2 = r0.A1J
            X.11F r7 = r2.A00
            boolean r3 = r7 instanceof X.C177528dw
            r22 = r3
            r11 = 0
            if (r3 == 0) goto L_0x0183
            X.16E r3 = r1.A0o
            X.3Sz r10 = r3.A07()
            if (r10 == 0) goto L_0x0183
            long r12 = r10.A04()
            long r5 = r0.A1O
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0183
            r10.A0A(r8)
            r21 = 1
        L_0x0133:
            X.19I r3 = r1.A16
            java.util.Set r5 = r3.A02
            boolean r36 = r5.contains(r2)
            X.1FN r3 = r1.A0i
            java.util.HashSet r6 = r3.A00(r2)
            X.1DT r10 = r1.A08
            X.1FT r3 = r1.A0k
            int r27 = r3.A01(r0)
            X.0wN r3 = r1.A04
            java.util.Set r12 = X.AnonymousClass143.A09(r3, r6)
            int r28 = r12.size()
            int r29 = r6.size()
            r6 = 1
            r13 = 1
            r25 = 0
            r26 = 1
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r35 = 0
            r23 = r10
            r24 = r0
            r23.A0P(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            if (r36 == 0) goto L_0x0175
            r5.remove(r2)
        L_0x0175:
            X.1DQ r10 = r1.A0T
            r5 = 24
            r10.A01(r0, r5)
            X.12P r5 = r1.A0c
            X.1M0 r20 = r5.A05()
            goto L_0x018e
        L_0x0183:
            r21 = 0
            goto L_0x0133
        L_0x0186:
            r0.A0B = r5
            goto L_0x0111
        L_0x0189:
            r0.A0n(r3)
            goto L_0x00f2
        L_0x018e:
            X.71s r19 = r20.B1k()     // Catch:{ all -> 0x0518 }
            boolean r10 = r7 instanceof X.C177618e5     // Catch:{ all -> 0x050e }
            if (r10 == 0) goto L_0x0330
            if (r22 != 0) goto L_0x0330
            java.util.List r14 = r0.A0e()     // Catch:{ all -> 0x050e }
            r18 = 0
            if (r14 == 0) goto L_0x01fe
            int r12 = r14.size()     // Catch:{ all -> 0x050e }
            int r5 = r0.A0B     // Catch:{ all -> 0x050e }
            if (r12 < r5) goto L_0x01fe
            r3 = 3
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x050e }
            r12.<init>(r3)     // Catch:{ all -> 0x050e }
            int r3 = r0.A0D     // Catch:{ all -> 0x050e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x050e }
            java.lang.String r3 = "status"
            r12.put(r3, r5)     // Catch:{ all -> 0x050e }
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x050e }
            java.lang.String r8 = "receipt_server_timestamp"
            r12.put(r8, r5)     // Catch:{ all -> 0x050e }
            int r8 = r0.A0B     // Catch:{ all -> 0x050e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x050e }
            java.lang.String r8 = "recipient_count"
            r12.put(r8, r9)     // Catch:{ all -> 0x050e }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x050e }
            r8.<init>(r14)     // Catch:{ all -> 0x050e }
            r8.add(r7)     // Catch:{ all -> 0x050e }
            int r7 = r8.size()     // Catch:{ all -> 0x050e }
            int r7 = r7 + 1
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x050e }
            r9.<init>(r7)     // Catch:{ all -> 0x050e }
            java.util.Iterator r14 = r8.iterator()     // Catch:{ all -> 0x050e }
        L_0x01e4:
            boolean r7 = r14.hasNext()     // Catch:{ all -> 0x050e }
            if (r7 == 0) goto L_0x0267
            java.lang.Object r8 = r14.next()     // Catch:{ all -> 0x050e }
            X.11F r8 = (X.AnonymousClass11F) r8     // Catch:{ all -> 0x050e }
            X.163 r7 = r1.A0H     // Catch:{ all -> 0x050e }
            long r7 = r7.A08(r8)     // Catch:{ all -> 0x050e }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x050e }
            r9.add(r7)     // Catch:{ all -> 0x050e }
            goto L_0x01e4
        L_0x01fe:
            java.lang.String r7 = "message-table-scan"
            java.lang.String r5 = "broadcast-ack"
            r3.A0E(r7, r5, r6)     // Catch:{ all -> 0x050e }
            java.lang.String r3 = "CoreMessageStore/updateMessageTableForBroadcastAck falling back to table scan"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x050e }
            X.178 r3 = r1.A0U     // Catch:{ all -> 0x050e }
            X.12P r3 = r3.A03     // Catch:{ all -> 0x050e }
            X.1M0 r12 = r3.A05()     // Catch:{ all -> 0x050e }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x04f5 }
            r7.<init>()     // Catch:{ all -> 0x04f5 }
            java.lang.String r3 = "status"
            int r5 = r0.A0D     // Catch:{ all -> 0x04f5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x04f5 }
            r7.put(r3, r5)     // Catch:{ all -> 0x04f5 }
            java.lang.String r14 = "receipt_server_timestamp"
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x04f5 }
            r7.put(r14, r5)     // Catch:{ all -> 0x04f5 }
            java.lang.String r9 = "recipient_count"
            int r8 = r0.A0B     // Catch:{ all -> 0x04f5 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x04f5 }
            r7.put(r9, r8)     // Catch:{ all -> 0x04f5 }
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x04f5 }
            long r14 = r0.A0I     // Catch:{ all -> 0x04f5 }
            java.lang.String r9 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x04f5 }
            r8[r11] = r9     // Catch:{ all -> 0x04f5 }
            boolean r9 = r2.A02     // Catch:{ all -> 0x04f5 }
            if (r9 == 0) goto L_0x0247
            r18 = 1
        L_0x0247:
            java.lang.String r9 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x04f5 }
            r8[r6] = r9     // Catch:{ all -> 0x04f5 }
            r14 = 2
            java.lang.String r9 = r2.A01     // Catch:{ all -> 0x04f5 }
            r8[r14] = r9     // Catch:{ all -> 0x04f5 }
            X.14e r9 = r12.A02     // Catch:{ all -> 0x04f5 }
            java.lang.String r25 = "message"
            java.lang.String r26 = "timestamp = ? AND from_me = ? AND key_id = ?"
            java.lang.String r27 = "UPDATE_RCV_BROADCAST_SERVER_SQL"
            r23 = r9
            r24 = r7
            r28 = r8
            r23.A01(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x04f5 }
            r12.close()     // Catch:{ all -> 0x050e }
            goto L_0x02b1
        L_0x0267:
            java.lang.String r7 = r2.A01     // Catch:{ all -> 0x050e }
            r9.add(r7)     // Catch:{ all -> 0x050e }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x050e }
            r14.<init>()     // Catch:{ all -> 0x050e }
            java.lang.String r7 = "chat_row_id IN "
            r14.append(r7)     // Catch:{ all -> 0x050e }
            int r7 = r9.size()     // Catch:{ all -> 0x050e }
            int r7 = r7 - r6
            java.lang.String r7 = X.AnonymousClass1M2.A00(r7)     // Catch:{ all -> 0x050e }
            r14.append(r7)     // Catch:{ all -> 0x050e }
            java.lang.String r8 = " AND "
            r14.append(r8)     // Catch:{ all -> 0x050e }
            java.lang.String r7 = "from_me = 1"
            r14.append(r7)     // Catch:{ all -> 0x050e }
            r14.append(r8)     // Catch:{ all -> 0x050e }
            java.lang.String r7 = "key_id = ?"
            r14.append(r7)     // Catch:{ all -> 0x050e }
            java.lang.String r26 = r14.toString()     // Catch:{ all -> 0x050e }
            r7 = r20
            X.14e r8 = r7.A02     // Catch:{ all -> 0x050e }
            java.lang.String[] r7 = new java.lang.String[r11]     // Catch:{ all -> 0x050e }
            java.lang.Object[] r7 = r9.toArray(r7)     // Catch:{ all -> 0x050e }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x050e }
            java.lang.String r25 = "message"
            java.lang.String r27 = "updateBroadcastAckInMessageTable/UPDATE_MESSAGE"
            r23 = r8
            r24 = r12
            r28 = r7
            r23.A01(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x050e }
        L_0x02b1:
            X.17S r7 = r1.A0O     // Catch:{ all -> 0x050e }
            X.17W r7 = r7.A06     // Catch:{ all -> 0x050e }
            X.00I r9 = r7.A03(r0)     // Catch:{ all -> 0x050e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x050e }
            r8.<init>()     // Catch:{ all -> 0x050e }
            java.lang.String r7 = "SELECT _id FROM message_view"
            r8.append(r7)     // Catch:{ all -> 0x050e }
            java.lang.Object r7 = r9.A00     // Catch:{ all -> 0x050e }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x050e }
            r8.append(r7)     // Catch:{ all -> 0x050e }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x050e }
            java.lang.Object r7 = r9.A01     // Catch:{ all -> 0x050e }
            X.00I r9 = new X.00I     // Catch:{ all -> 0x050e }
            r9.<init>(r8, r7)     // Catch:{ all -> 0x050e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x050e }
            r8.<init>()     // Catch:{ all -> 0x050e }
            java.lang.String r7 = "UPDATE message_ephemeral SET expire_timestamp=? + ?*(SELECT duration FROM message_ephemeral t2 WHERE message_ephemeral.message_row_id=t2.message_row_id)"
            r8.append(r7)     // Catch:{ all -> 0x050e }
            java.lang.String r7 = " WHERE message_row_id IN ("
            r8.append(r7)     // Catch:{ all -> 0x050e }
            java.lang.Object r7 = r9.A00     // Catch:{ all -> 0x050e }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x050e }
            r8.append(r7)     // Catch:{ all -> 0x050e }
            java.lang.String r7 = ")"
            r8.append(r7)     // Catch:{ all -> 0x050e }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x050e }
            java.lang.Object r7 = r9.A01     // Catch:{ all -> 0x050e }
            X.00I r12 = new X.00I     // Catch:{ all -> 0x050e }
            r12.<init>(r8, r7)     // Catch:{ all -> 0x050e }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x050e }
            r9.<init>()     // Catch:{ all -> 0x050e }
            long r7 = r0.A0H     // Catch:{ all -> 0x050e }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x050e }
            r9.add(r7)     // Catch:{ all -> 0x050e }
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x050e }
            r9.add(r7)     // Catch:{ all -> 0x050e }
            java.lang.Object r7 = r12.A01     // Catch:{ all -> 0x050e }
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x050e }
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x050e }
            r9.addAll(r7)     // Catch:{ all -> 0x050e }
            r7 = r20
            X.14e r8 = r7.A02     // Catch:{ all -> 0x050e }
            java.lang.Object r12 = r12.A00     // Catch:{ all -> 0x050e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x050e }
            java.lang.Object[] r7 = new java.lang.Object[r11]     // Catch:{ all -> 0x050e }
            java.lang.Object[] r9 = r9.toArray(r7)     // Catch:{ all -> 0x050e }
            java.lang.String r7 = "UPDATE_TIMESTAMPS_FOR_BROADCAST_MESSAGE_CLONES"
            r8.A0E(r12, r7, r9)     // Catch:{ all -> 0x050e }
            goto L_0x0374
        L_0x0330:
            X.178 r12 = r1.A0U     // Catch:{ all -> 0x050e }
            X.12P r3 = r12.A03     // Catch:{ all -> 0x050e }
            X.1M0 r7 = r3.A05()     // Catch:{ all -> 0x050e }
            r3 = 3
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0504 }
            r6.<init>(r3)     // Catch:{ all -> 0x0504 }
            java.lang.String r3 = "status"
            int r5 = r0.A0D     // Catch:{ all -> 0x0504 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0504 }
            r6.put(r3, r5)     // Catch:{ all -> 0x0504 }
            java.lang.String r14 = "receipt_server_timestamp"
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0504 }
            r6.put(r14, r5)     // Catch:{ all -> 0x0504 }
            java.lang.String r9 = "recipient_count"
            int r8 = r0.A0B     // Catch:{ all -> 0x0504 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0504 }
            r6.put(r9, r8)     // Catch:{ all -> 0x0504 }
            X.14e r8 = r7.A02     // Catch:{ all -> 0x0504 }
            java.lang.String r25 = "message"
            java.lang.String r26 = "chat_row_id = ? AND from_me = ? AND key_id = ?"
            java.lang.String[] r28 = X.AnonymousClass178.A04(r12, r2)     // Catch:{ all -> 0x0504 }
            java.lang.String r27 = "UPDATE_RCV_SERVER_SQL"
            r23 = r8
            r24 = r6
            r23.A01(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0504 }
            r7.close()     // Catch:{ all -> 0x050e }
            r6 = 0
        L_0x0374:
            if (r21 == 0) goto L_0x03a4
            X.16E r12 = r1.A0o     // Catch:{ all -> 0x050e }
            X.12P r7 = r12.A03     // Catch:{ all -> 0x050e }
            X.1M0 r7 = r7.A05()     // Catch:{ all -> 0x050e }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0504 }
            r8.<init>(r13)     // Catch:{ all -> 0x0504 }
            java.lang.String r9 = "timestamp"
            r8.put(r9, r5)     // Catch:{ all -> 0x0504 }
            X.14e r9 = r7.A02     // Catch:{ all -> 0x0504 }
            java.lang.String r26 = "jid_row_id=?"
            X.13z r5 = X.C223613z.A00     // Catch:{ all -> 0x0504 }
            java.lang.String[] r28 = X.AnonymousClass16E.A04(r12, r5)     // Catch:{ all -> 0x0504 }
            java.lang.String r5 = "updateMyTimestamp/UPDATE"
            java.lang.String r27 = X.AnonymousClass16E.A00(r5)     // Catch:{ all -> 0x0504 }
            r23 = r9
            r24 = r8
            r25 = r3
            r23.A01(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0504 }
            r7.close()     // Catch:{ all -> 0x050e }
        L_0x03a4:
            int r7 = r0.A1I     // Catch:{ all -> 0x050e }
            boolean r3 = X.C66013Ui.A0K(r7)     // Catch:{ all -> 0x050e }
            if (r3 == 0) goto L_0x03b4
            X.1DG r5 = r1.A0V     // Catch:{ all -> 0x050e }
            r3 = r0
            X.2bU r3 = (X.AnonymousClass2bU) r3     // Catch:{ all -> 0x050e }
            r5.A03(r3, r13, r11)     // Catch:{ all -> 0x050e }
        L_0x03b4:
            if (r10 == 0) goto L_0x03c0
            X.176 r5 = r1.A0W     // Catch:{ all -> 0x050e }
            X.3hL r3 = new X.3hL     // Catch:{ all -> 0x050e }
            r3.<init>(r0, r6)     // Catch:{ all -> 0x050e }
            r5.A09(r3)     // Catch:{ all -> 0x050e }
        L_0x03c0:
            r3 = 36
            if (r7 != r3) goto L_0x0422
            r12 = r0
            X.2bH r12 = (X.AnonymousClass2bH) r12     // Catch:{ all -> 0x050e }
            X.1Fl r10 = r1.A0P     // Catch:{ all -> 0x050e }
            X.3Qp r9 = X.C25221Fl.A01(r10, r12)     // Catch:{ all -> 0x050e }
            if (r9 == 0) goto L_0x0449
            X.184 r14 = r10.A04     // Catch:{ all -> 0x050e }
            X.3un r5 = r9.A0b     // Catch:{ all -> 0x050e }
            X.3Qa r3 = r12.A1J     // Catch:{ all -> 0x050e }
            boolean r6 = r3.A02     // Catch:{ all -> 0x050e }
            if (r6 == 0) goto L_0x0449
            long r7 = r12.A0H     // Catch:{ all -> 0x050e }
            long r5 = r5.ephemeralSettingTimestamp     // Catch:{ all -> 0x050e }
            int r15 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r15 > 0) goto L_0x03fc
            int r15 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x0449
            X.11F r5 = r3.A00     // Catch:{ all -> 0x050e }
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x050e }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x050e }
            X.0wQ r3 = r14.A00     // Catch:{ all -> 0x050e }
            r3.A0G()     // Catch:{ all -> 0x050e }
            com.whatsapp.jid.PhoneUserJid r3 = r3.A03     // Catch:{ all -> 0x050e }
            if (r3 == 0) goto L_0x03fc
            int r3 = r5.compareTo((com.whatsapp.jid.Jid) r3)     // Catch:{ all -> 0x050e }
            if (r3 >= 0) goto L_0x03fc
            goto L_0x0449
        L_0x03fc:
            X.3un r3 = r9.A0b     // Catch:{ all -> 0x050e }
            int r3 = r3.expiration     // Catch:{ all -> 0x050e }
            int r7 = r12.A00     // Catch:{ all -> 0x050e }
            if (r3 == r7) goto L_0x040a
            long r5 = r0.A0H     // Catch:{ all -> 0x050e }
            X.C20310xM.A0F(r1, r0, r5)     // Catch:{ all -> 0x050e }
            goto L_0x0449
        L_0x040a:
            long r5 = r12.A0H     // Catch:{ all -> 0x050e }
            int r3 = r12.A04     // Catch:{ all -> 0x050e }
            java.lang.Boolean r8 = r12.A0d     // Catch:{ all -> 0x050e }
            r27 = 0
            r23 = r9
            r24 = r10
            r25 = r8
            r26 = r7
            r28 = r3
            r29 = r5
            X.C25221Fl.A02(r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x050e }
            goto L_0x0449
        L_0x0422:
            boolean r3 = r0.A1G()     // Catch:{ all -> 0x050e }
            if (r3 == 0) goto L_0x0449
            X.17S r10 = r1.A0O     // Catch:{ all -> 0x050e }
            boolean r3 = r2.A02     // Catch:{ all -> 0x050e }
            if (r3 == 0) goto L_0x0449
            X.12P r3 = r10.A04     // Catch:{ all -> 0x050e }
            X.1M0 r9 = r3.A05()     // Catch:{ all -> 0x050e }
            long r7 = r0.A0H     // Catch:{ all -> 0x04fa }
            int r3 = r0.A05     // Catch:{ all -> 0x04fa }
            long r5 = (long) r3     // Catch:{ all -> 0x04fa }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r14
            long r7 = r7 + r5
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x04fa }
            r0.A0g = r3     // Catch:{ all -> 0x04fa }
            X.AnonymousClass17S.A00(r10, r9, r0)     // Catch:{ all -> 0x04fa }
            r9.close()     // Catch:{ all -> 0x050e }
        L_0x0449:
            r19.A00()     // Catch:{ all -> 0x050e }
            r19.close()     // Catch:{ all -> 0x0518 }
            r20.close()
            X.9lY r3 = r0.A0M
            if (r3 == 0) goto L_0x0497
            X.8av r3 = r3.A0A
            if (r3 == 0) goto L_0x0497
            java.lang.String r8 = r3.A0E()
            if (r8 == 0) goto L_0x0497
            X.16S r5 = r1.A0w
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x0497
            X.54d r3 = r5.A00
            X.1M0 r6 = r3.A04()
            X.14e r10 = r6.A02     // Catch:{ all -> 0x04ff }
            java.lang.String r9 = "tmp_transactions"
            java.lang.String r7 = "tmp_id=?"
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ all -> 0x04ff }
            r5[r11] = r8     // Catch:{ all -> 0x04ff }
            java.lang.String r3 = "removePaymentTransactionTmpInfo/DELETE_SCHEMA_PAY_TRANSACTIONS_TMP"
            int r3 = r10.A03(r9, r7, r3, r5)     // Catch:{ all -> 0x04ff }
            if (r3 == r13) goto L_0x0494
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ff }
            r5.<init>()     // Catch:{ all -> 0x04ff }
            java.lang.String r3 = "PAY: PaymentStore removePaymentTransactionTmpInfo could not delete: "
            r5.append(r3)     // Catch:{ all -> 0x04ff }
            r5.append(r8)     // Catch:{ all -> 0x04ff }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x04ff }
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x04ff }
        L_0x0494:
            r6.close()
        L_0x0497:
            if (r22 == 0) goto L_0x04b3
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x04b3
            boolean r2 = X.C66013Ui.A0n(r0)
            if (r2 == 0) goto L_0x04b3
            r3 = 4
            int r2 = r0.A0D
            boolean r2 = X.AnonymousClass3TJ.A02(r2, r3)
            if (r2 == 0) goto L_0x04b3
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.A0t(r0)
        L_0x04b3:
            X.12g r5 = r1.A0M
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r16
            java.lang.String r0 = "CoreMessageStore/updateMessageReceivedByServerInBackground"
            r5.A01(r0, r2)
            goto L_0x006f
        L_0x04c2:
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x04f0 }
            r6.<init>()     // Catch:{ all -> 0x04f0 }
            java.lang.String r1 = r4.A03     // Catch:{ all -> 0x04f0 }
            java.lang.String r0 = "counter_abuse_token"
            if (r1 == 0) goto L_0x04e8
            r6.put(r0, r1)     // Catch:{ all -> 0x04f0 }
        L_0x04d0:
            X.14e r5 = r3.A02     // Catch:{ all -> 0x04f0 }
            java.lang.String r7 = "message_text"
            java.lang.String r8 = "message_row_id = ?"
            r0 = 1
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x04f0 }
            r2 = 0
            long r0 = r4.A1N     // Catch:{ all -> 0x04f0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04f0 }
            r10[r2] = r0     // Catch:{ all -> 0x04f0 }
            java.lang.String r9 = "UPDATE_CONTENT_BINDING_SQL"
            r5.A01(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x04f0 }
            goto L_0x04ec
        L_0x04e8:
            r6.putNull(r0)     // Catch:{ all -> 0x04f0 }
            goto L_0x04d0
        L_0x04ec:
            r3.close()
            return
        L_0x04f0:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x051d }
            throw r1
        L_0x04f5:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0509 }
            goto L_0x050d
        L_0x04fa:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0509 }
            goto L_0x050d
        L_0x04ff:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x051d }
            throw r1
        L_0x0504:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0509 }
            goto L_0x050d
        L_0x0509:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x050e }
        L_0x050d:
            throw r1     // Catch:{ all -> 0x050e }
        L_0x050e:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0513 }
            goto L_0x0517
        L_0x0513:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0518 }
        L_0x0517:
            throw r1     // Catch:{ all -> 0x0518 }
        L_0x0518:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x051d }
            throw r1
        L_0x051d:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35531iq.run():void");
    }
}
