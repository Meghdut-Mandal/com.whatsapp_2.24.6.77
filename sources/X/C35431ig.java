package X;

/* renamed from: X.1ig  reason: invalid class name and case insensitive filesystem */
public class C35431ig implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public C35431ig(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.A06 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = i;
        this.A04 = obj4;
        this.A05 = obj5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        if (r4 < 100) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x028c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0291, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0292, code lost:
        if (r16 != null) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0297, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        com.whatsapp.util.Log.w("prekey digest SHA1 algorithm unknown", r1);
        r4.A00.A03();
        r4.A02.A24(false);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:29:0x0095, B:76:0x01b4, B:129:0x0288] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r7 = r19
            int r0 = r7.A06
            switch(r0) {
                case 0: goto L_0x029d;
                case 1: goto L_0x0074;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r12 = r7.A01
            X.1SL r12 = (X.AnonymousClass1SL) r12
            java.lang.Object r8 = r7.A02
            X.1Uw r8 = (X.C28981Uw) r8
            java.lang.Object r3 = r7.A03
            X.3Qp r3 = (X.C65073Qp) r3
            java.lang.Object r13 = r7.A04
            java.lang.Long r13 = (java.lang.Long) r13
            int r14 = r7.A00
            java.lang.Object r9 = r7.A05
            X.Az1 r9 = (X.C22949Az1) r9
            X.17U r2 = r12.A04
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            X.163 r0 = r2.A00
            long r0 = r0.A08(r8)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r4[r0] = r1
            X.12P r0 = r2.A02
            X.1M0 r6 = r0.get()
            X.14e r2 = r6.A02     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (message_type != '7') AND (message_type != '8') ORDER BY sort_id ASC LIMIT 1"
            java.lang.String r0 = "GET_FIRST_SORT_REF_SQL"
            android.database.Cursor r2 = r2.A09(r1, r0, r4)     // Catch:{ all -> 0x006f }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "sort_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0063 }
            long r4 = r2.getLong(r0)     // Catch:{ all -> 0x0063 }
            r2.close()     // Catch:{ all -> 0x006f }
            r6.close()
            r15 = r4
            r1 = 100
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x022e
            goto L_0x022c
        L_0x005e:
            r2.close()     // Catch:{ all -> 0x006f }
            goto L_0x0213
        L_0x0063:
            r1 = move-exception
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ all -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x006f }
        L_0x006e:
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0298 }
            throw r1
        L_0x0074:
            java.lang.Object r4 = r7.A01
            X.1aA r4 = (X.C30411aA) r4
            java.lang.Object r6 = r7.A02
            byte[] r6 = (byte[]) r6
            int r0 = r7.A00
            byte r1 = (byte) r0
            java.lang.Object r3 = r7.A03
            byte[] r3 = (byte[]) r3
            java.lang.Object r5 = r7.A04
            byte[][] r5 = (byte[][]) r5
            java.lang.Object r7 = r7.A05
            byte[] r7 = (byte[]) r7
            X.18I r0 = r4.A04
            X.79X r16 = r0.A07()
            r0 = 5
            r2 = 0
            if (r1 == r0) goto L_0x00a1
            X.0xL r0 = r4.A00     // Catch:{ all -> 0x0291 }
            r0.A03()     // Catch:{ all -> 0x0291 }
            X.0v0 r0 = r4.A02     // Catch:{ all -> 0x0291 }
            r0.A24(r2)     // Catch:{ all -> 0x0291 }
            goto L_0x020d
        L_0x00a1:
            int r1 = X.C203239na.A01(r6, r2)     // Catch:{ all -> 0x0291 }
            X.189 r11 = r4.A03     // Catch:{ all -> 0x0291 }
            X.18l r0 = r11.A07     // Catch:{ all -> 0x0291 }
            int r0 = r0.A03()     // Catch:{ all -> 0x0291 }
            if (r1 == r0) goto L_0x00bb
            X.0xL r0 = r4.A00     // Catch:{ all -> 0x0291 }
            r0.A03()     // Catch:{ all -> 0x0291 }
            X.0v0 r0 = r4.A02     // Catch:{ all -> 0x0291 }
            r0.A24(r2)     // Catch:{ all -> 0x0291 }
            goto L_0x020d
        L_0x00bb:
            byte[] r9 = r11.A0c()     // Catch:{ all -> 0x0291 }
            X.5tq r8 = r11.A0G()     // Catch:{ all -> 0x0291 }
            byte[] r0 = r8.A01     // Catch:{ all -> 0x0291 }
            boolean r0 = java.util.Arrays.equals(r0, r3)     // Catch:{ all -> 0x0291 }
            if (r0 != 0) goto L_0x00d7
            X.0xL r0 = r4.A00     // Catch:{ all -> 0x0291 }
            r0.A03()     // Catch:{ all -> 0x0291 }
            X.0v0 r0 = r4.A02     // Catch:{ all -> 0x0291 }
            r0.A24(r2)     // Catch:{ all -> 0x0291 }
            goto L_0x020d
        L_0x00d7:
            int r3 = r5.length     // Catch:{ all -> 0x0291 }
            int[] r10 = new int[r3]     // Catch:{ all -> 0x0291 }
            r1 = 0
        L_0x00db:
            if (r1 >= r3) goto L_0x00e8
            r0 = r5[r1]     // Catch:{ all -> 0x0291 }
            int r0 = X.C203239na.A00(r0)     // Catch:{ all -> 0x0291 }
            r10[r1] = r0     // Catch:{ all -> 0x0291 }
            int r1 = r1 + 1
            goto L_0x00db
        L_0x00e8:
            X.18I r0 = r11.A0K     // Catch:{ all -> 0x0291 }
            X.79X r15 = r0.A07()     // Catch:{ all -> 0x0291 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0285 }
            r5.<init>(r3)     // Catch:{ all -> 0x0285 }
            android.util.SparseArray r6 = new android.util.SparseArray     // Catch:{ all -> 0x0285 }
            r6.<init>(r3)     // Catch:{ all -> 0x0285 }
            X.18o r0 = r11.A09     // Catch:{ all -> 0x0285 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0285 }
            r14.<init>()     // Catch:{ all -> 0x0285 }
            X.18M r0 = r0.A01     // Catch:{ all -> 0x0285 }
            X.1M0 r11 = r0.get()     // Catch:{ all -> 0x0285 }
            X.14e r13 = r11.A02     // Catch:{ all -> 0x027b }
            java.lang.String r12 = "SELECT prekey_id, record FROM prekeys"
            r1 = 0
            java.lang.String r0 = "SignalPreKeyStore/getPreKeys"
            android.database.Cursor r13 = r13.A09(r12, r0, r1)     // Catch:{ all -> 0x027b }
        L_0x0110:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x026f }
            if (r0 == 0) goto L_0x0133
            java.lang.String r0 = "prekey_id"
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x026f }
            int r12 = r13.getInt(r0)     // Catch:{ all -> 0x026f }
            java.lang.String r0 = "record"
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x026f }
            byte[] r1 = r13.getBlob(r0)     // Catch:{ all -> 0x026f }
            X.33q r0 = new X.33q     // Catch:{ all -> 0x026f }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x026f }
            r14.add(r0)     // Catch:{ all -> 0x026f }
            goto L_0x0110
        L_0x0133:
            r13.close()     // Catch:{ all -> 0x027b }
            r11.close()     // Catch:{ all -> 0x0285 }
            java.util.Iterator r13 = r14.iterator()     // Catch:{ all -> 0x0285 }
        L_0x013d:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0285 }
            if (r0 == 0) goto L_0x016d
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x0285 }
            X.33q r12 = (X.C593633q) r12     // Catch:{ all -> 0x0285 }
            int r1 = r12.A00     // Catch:{ IOException -> 0x0155 }
            byte[] r0 = r12.A01     // Catch:{ IOException -> 0x0155 }
            X.5tq r0 = X.AnonymousClass189.A00(r0, r1)     // Catch:{ IOException -> 0x0155 }
            r6.put(r1, r0)     // Catch:{ IOException -> 0x0155 }
            goto L_0x013d
        L_0x0155:
            r11 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0285 }
            r1.<init>()     // Catch:{ all -> 0x0285 }
            java.lang.String r0 = "error reading prekey "
            r1.append(r0)     // Catch:{ all -> 0x0285 }
            int r0 = r12.A00     // Catch:{ all -> 0x0285 }
            r1.append(r0)     // Catch:{ all -> 0x0285 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0285 }
            com.whatsapp.util.Log.e(r0, r11)     // Catch:{ all -> 0x0285 }
            goto L_0x013d
        L_0x016d:
            r1 = 0
        L_0x016e:
            if (r1 >= r3) goto L_0x0181
            r0 = r10[r1]     // Catch:{ all -> 0x0285 }
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x0285 }
            X.5tq r0 = (X.C121865tq) r0     // Catch:{ all -> 0x0285 }
            if (r0 != 0) goto L_0x017b
            goto L_0x01a7
        L_0x017b:
            r5.add(r0)     // Catch:{ all -> 0x0285 }
            int r1 = r1 + 1
            goto L_0x016e
        L_0x0181:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0285 }
            r1.<init>()     // Catch:{ all -> 0x0285 }
            java.lang.String r0 = "axolotl reporting back "
            r1.append(r0)     // Catch:{ all -> 0x0285 }
            int r0 = r5.size()     // Catch:{ all -> 0x0285 }
            r1.append(r0)     // Catch:{ all -> 0x0285 }
            java.lang.String r0 = " sequenced prekeys"
            r1.append(r0)     // Catch:{ all -> 0x0285 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0285 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0285 }
            X.5tq[] r0 = new X.C121865tq[r2]     // Catch:{ all -> 0x0285 }
            java.lang.Object[] r6 = r5.toArray(r0)     // Catch:{ all -> 0x0285 }
            X.5tq[] r6 = (X.C121865tq[]) r6     // Catch:{ all -> 0x0285 }
            goto L_0x01a8
        L_0x01a7:
            r6 = 0
        L_0x01a8:
            if (r15 == 0) goto L_0x01ad
            r15.close()     // Catch:{ all -> 0x0291 }
        L_0x01ad:
            if (r6 == 0) goto L_0x0203
            int r5 = r6.length     // Catch:{ all -> 0x0291 }
            if (r5 != r3) goto L_0x0203
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x01f2 }
            r3.update(r9)     // Catch:{ all -> 0x0291 }
            byte[] r0 = r8.A00     // Catch:{ all -> 0x0291 }
            r3.update(r0)     // Catch:{ all -> 0x0291 }
            byte[] r0 = r8.A02     // Catch:{ all -> 0x0291 }
            r3.update(r0)     // Catch:{ all -> 0x0291 }
            r1 = 0
        L_0x01c6:
            if (r1 >= r5) goto L_0x01d2
            r0 = r6[r1]     // Catch:{ all -> 0x0291 }
            byte[] r0 = r0.A00     // Catch:{ all -> 0x0291 }
            r3.update(r0)     // Catch:{ all -> 0x0291 }
            int r1 = r1 + 1
            goto L_0x01c6
        L_0x01d2:
            byte[] r0 = r3.digest()     // Catch:{ all -> 0x0291 }
            boolean r0 = java.util.Arrays.equals(r0, r7)     // Catch:{ all -> 0x0291 }
            if (r0 != 0) goto L_0x01ec
            java.lang.String r0 = "prekey digest check failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0291 }
            X.0xL r0 = r4.A00     // Catch:{ all -> 0x0291 }
            r0.A03()     // Catch:{ all -> 0x0291 }
        L_0x01e6:
            X.0v0 r0 = r4.A02     // Catch:{ all -> 0x0291 }
            r0.A24(r2)     // Catch:{ all -> 0x0291 }
            goto L_0x020d
        L_0x01ec:
            java.lang.String r0 = "prekey digest check passed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0291 }
            goto L_0x01e6
        L_0x01f2:
            r1 = move-exception
            java.lang.String r0 = "prekey digest SHA1 algorithm unknown"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0291 }
            X.0xL r0 = r4.A00     // Catch:{ all -> 0x0291 }
            r0.A03()     // Catch:{ all -> 0x0291 }
            X.0v0 r0 = r4.A02     // Catch:{ all -> 0x0291 }
            r0.A24(r2)     // Catch:{ all -> 0x0291 }
            goto L_0x020d
        L_0x0203:
            X.0xL r0 = r4.A00     // Catch:{ all -> 0x0291 }
            r0.A03()     // Catch:{ all -> 0x0291 }
            X.0v0 r0 = r4.A02     // Catch:{ all -> 0x0291 }
            r0.A24(r2)     // Catch:{ all -> 0x0291 }
        L_0x020d:
            if (r16 == 0) goto L_0x023e
            r16.close()
            return
        L_0x0213:
            r6.close()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SortIdStore/ getFirstSortId can't get value for "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r4 = -9223372036854775808
        L_0x022c:
            r15 = 100
        L_0x022e:
            X.2La r3 = (X.C44072La) r3
            boolean r0 = r3.A0P
            r10 = 0
            if (r0 == 0) goto L_0x023f
            r11 = r8
            X.AnonymousClass1SL.A00(r11, r12, r13, r14, r15)
        L_0x0239:
            if (r9 == 0) goto L_0x023e
            r9.BoK(r10)
        L_0x023e:
            return
        L_0x023f:
            r1 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x024f
            X.1TZ r7 = r12.A09
            r14 = 0
            r12 = 50
            r11 = r10
            r7.A01(r8, r9, r10, r11, r12, r14)
            return
        L_0x024f:
            r11 = r8
            X.AnonymousClass1SL.A00(r11, r12, r13, r14, r15)
            if (r13 == 0) goto L_0x023e
            long r1 = r13.longValue()
            long r1 = r1 - r4
            r16 = 50
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0239
            X.1TZ r11 = r12.A09
            java.lang.Long r14 = java.lang.Long.valueOf(r4)
            r18 = 0
            r12 = r8
            r13 = r9
            r15 = r10
            r11.A01(r12, r13, r14, r15, r16, r18)
            return
        L_0x026f:
            r1 = move-exception
            if (r13 == 0) goto L_0x027a
            r13.close()     // Catch:{ all -> 0x0276 }
            goto L_0x027a
        L_0x0276:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x027b }
        L_0x027a:
            throw r1     // Catch:{ all -> 0x027b }
        L_0x027b:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0280 }
            goto L_0x0284
        L_0x0280:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0285 }
        L_0x0284:
            throw r1     // Catch:{ all -> 0x0285 }
        L_0x0285:
            r1 = move-exception
            if (r15 == 0) goto L_0x0290
            r15.close()     // Catch:{ all -> 0x028c }
            goto L_0x0290
        L_0x028c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0291 }
        L_0x0290:
            throw r1     // Catch:{ all -> 0x0291 }
        L_0x0291:
            r1 = move-exception
            if (r16 == 0) goto L_0x029c
            r16.close()     // Catch:{ all -> 0x0298 }
            throw r1
        L_0x0298:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x029c:
            throw r1
        L_0x029d:
            java.lang.Object r5 = r7.A01
            X.0xQ r5 = (X.C20350xQ) r5
            java.lang.Object r4 = r7.A02
            X.146 r4 = (X.AnonymousClass146) r4
            java.lang.Object r3 = r7.A03
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            int r2 = r7.A00
            java.lang.Object r9 = r7.A04
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r10 = r7.A05
            java.io.File r10 = (java.io.File) r10
            r0 = 300(0x12c, double:1.48E-321)
            android.os.SystemClock.sleep(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "group/create again, jid:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " subject:"
            r1.append(r0)
            java.lang.String r0 = r3.A0b()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3FK r1 = new X.3FK
            r1.<init>(r4)
            java.lang.String r0 = r3.A0b()
            r1.A03 = r0
            java.util.List r0 = r3.A0e()
            r1.A04 = r0
            r1.A00 = r2
            X.3B9 r7 = r1.A00()
            X.0wo r2 = r5.A0I
            X.0xM r4 = r5.A0O
            X.19x r8 = r5.A0x
            X.1Cf r3 = r5.A0N
            X.2Vj r1 = new X.2Vj
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.0yC r10 = r5.A0a
            X.0wN r7 = r5.A03
            X.0wQ r8 = r5.A05
            X.19A r0 = r5.A0q
            X.3B9 r13 = r1.A00
            X.3pa r6 = new X.3pa
            r9 = r2
            r11 = r5
            r12 = r1
            r14 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r6.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35431ig.run():void");
    }
}
