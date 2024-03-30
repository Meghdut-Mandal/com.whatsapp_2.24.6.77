package X;

/* renamed from: X.1j5  reason: invalid class name and case insensitive filesystem */
public class C35681j5 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C35681j5(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c7, code lost:
        com.whatsapp.util.Log.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ca, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02cc, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02fa, code lost:
        r2.post(new X.C35681j5(r4, r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0302, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0a2d, code lost:
        if (r5.A06 != -1) goto L_0x0a2f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0a34, code lost:
        if (r5.A06 == 0) goto L_0x0a36;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:93:0x0253, B:127:0x02c0] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02c6 A[ExcHandler: Error | RuntimeException (r1v103 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:93:0x0253] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r43 = this;
            r2 = r43
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0a16;
                case 1: goto L_0x087a;
                case 2: goto L_0x0843;
                case 3: goto L_0x0834;
                case 4: goto L_0x0826;
                case 5: goto L_0x0818;
                case 6: goto L_0x080a;
                case 7: goto L_0x07fe;
                case 8: goto L_0x07d0;
                case 9: goto L_0x0766;
                case 10: goto L_0x072a;
                case 11: goto L_0x0705;
                case 12: goto L_0x06eb;
                case 13: goto L_0x06ce;
                case 14: goto L_0x06b7;
                case 15: goto L_0x0699;
                case 16: goto L_0x0673;
                case 17: goto L_0x0647;
                case 18: goto L_0x0621;
                case 19: goto L_0x05eb;
                case 20: goto L_0x05c6;
                case 21: goto L_0x059b;
                case 22: goto L_0x058f;
                case 23: goto L_0x0581;
                case 24: goto L_0x0566;
                case 25: goto L_0x0495;
                case 26: goto L_0x044b;
                case 27: goto L_0x043f;
                case 28: goto L_0x030f;
                case 29: goto L_0x0007;
                case 30: goto L_0x0303;
                case 31: goto L_0x0007;
                case 32: goto L_0x02ee;
                case 33: goto L_0x02e2;
                case 34: goto L_0x0007;
                case 35: goto L_0x0007;
                case 36: goto L_0x02d5;
                case 37: goto L_0x0007;
                case 38: goto L_0x02b8;
                case 39: goto L_0x02a2;
                case 40: goto L_0x022b;
                case 41: goto L_0x0115;
                case 42: goto L_0x00f5;
                case 43: goto L_0x00d5;
                case 44: goto L_0x00b5;
                case 45: goto L_0x00a6;
                case 46: goto L_0x0082;
                case 47: goto L_0x0029;
                case 48: goto L_0x0a60;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A00
            X.1HJ r0 = (X.AnonymousClass1HJ) r0
            java.lang.Object r2 = r2.A01
            X.5Nh r2 = (X.C107265Nh) r2
            X.1HP r0 = r0.A0I
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0019:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r0 = r1.next()
            X.1co r0 = (X.C32011co) r0
            r0.BSg(r2)
            goto L_0x0019
        L_0x0029:
            java.lang.Object r4 = r2.A00
            X.0xM r4 = (X.C20310xM) r4
            java.lang.Object r0 = r2.A01
            X.3B8 r0 = (X.AnonymousClass3B8) r0
            java.util.List r0 = r0.A09
            java.util.ArrayList r7 = X.AnonymousClass6XV.newArrayList()
            java.util.Iterator r3 = r0.iterator()
        L_0x003b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            X.1A1 r0 = r4.A1B     // Catch:{ all -> 0x0059 }
            X.175 r0 = r0.A01     // Catch:{ all -> 0x0059 }
            X.3T1 r0 = r0.A01(r1)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x003b
            r7.add(r0)
            goto L_0x003b
        L_0x0059:
            r1 = move-exception
            throw r1
        L_0x005b:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0a6d
            X.16J r6 = r4.A0Z
            java.lang.Iterable r0 = r6.getObservers()
            java.util.Iterator r5 = r0.iterator()
        L_0x006b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r4 = r5.next()
            X.191 r4 = (X.AnonymousClass191) r4
            long r2 = r6.A00
            r0 = 1
            long r2 = r2 + r0
            r6.A00 = r2
            r4.Bb9(r7)
            goto L_0x006b
        L_0x0082:
            java.lang.Object r4 = r2.A00
            X.0xM r4 = (X.C20310xM) r4
            java.lang.Object r0 = r2.A01
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x008e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r2 = r3.next()
            X.11F r2 = (X.AnonymousClass11F) r2
            X.1DP r1 = r4.A0G
            r0 = 0
            r1.A02(r2, r0)
            X.16J r0 = r4.A0Z
            r0.A01(r2)
            goto L_0x008e
        L_0x00a6:
            java.lang.Object r0 = r2.A00
            X.0xM r0 = (X.C20310xM) r0
            java.lang.Object r2 = r2.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.16J r1 = r0.A0Z
            r0 = 0
            r1.A08(r2, r0)
            return
        L_0x00b5:
            java.lang.Object r0 = r2.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Object r2 = r2.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x00c5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r0 = r1.next()
            X.1JB r0 = (X.AnonymousClass1JB) r0
            r0.BQM(r2)
            goto L_0x00c5
        L_0x00d5:
            java.lang.Object r0 = r2.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Object r2 = r2.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x00e5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r0 = r1.next()
            X.1JB r0 = (X.AnonymousClass1JB) r0
            r0.BQL(r2)
            goto L_0x00e5
        L_0x00f5:
            java.lang.Object r0 = r2.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Object r2 = r2.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0105:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r0 = r1.next()
            X.1JB r0 = (X.AnonymousClass1JB) r0
            r0.BQH(r2)
            goto L_0x0105
        L_0x0115:
            java.lang.Object r7 = r2.A00
            X.12t r7 = (X.C220712t) r7
            java.lang.Object r6 = r2.A01
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            X.3Qa r0 = r6.A1J
            X.11F r5 = r0.A00
            X.12q r0 = r7.A00
            r9 = 0
            X.3Qp r4 = r0.A09(r5, r9)
            if (r4 == 0) goto L_0x0a6d
            long r2 = r4.A0U
            long r0 = r6.A1N
            r8 = 1
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r15 = 0
            if (r10 != 0) goto L_0x0135
            r15 = 1
        L_0x0135:
            long r2 = r4.A0N
            long r0 = r6.A1N
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r14 = 0
            if (r10 != 0) goto L_0x013f
            r14 = 1
        L_0x013f:
            if (r15 != 0) goto L_0x0144
            if (r14 != 0) goto L_0x0144
            return
        L_0x0144:
            long r2 = r6.A1O
            long r0 = r4.A0Q
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x01a1
            X.005 r0 = r7.A01
            java.lang.Object r0 = r0.get()
            X.1Do r0 = (X.C24731Do) r0
            X.12P r0 = r0.A0H
            X.1M0 r2 = r0.get()
            X.14e r11 = r2.A02     // Catch:{ all -> 0x0199 }
            java.lang.String r10 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND sort_id > ? AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0199 }
            long r0 = r4.A0W     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0199 }
            r3[r9] = r0     // Catch:{ all -> 0x0199 }
            long r0 = r4.A0Q     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0199 }
            r3[r8] = r0     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = "GET_UNREAD_MESSAGES_COUNT_FOR_CHAT"
            android.database.Cursor r3 = r11.A09(r10, r0, r3)     // Catch:{ all -> 0x0199 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x0189
            java.lang.String r0 = "count"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018d }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x018d }
            r4.A08 = r0     // Catch:{ all -> 0x018d }
        L_0x0189:
            r3.close()     // Catch:{ all -> 0x0199 }
            goto L_0x019e
        L_0x018d:
            r1 = move-exception
            if (r3 == 0) goto L_0x0198
            r3.close()     // Catch:{ all -> 0x0194 }
            goto L_0x0198
        L_0x0194:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0199 }
        L_0x0198:
            throw r1     // Catch:{ all -> 0x0199 }
        L_0x0199:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x09e3 }
            throw r1
        L_0x019e:
            r2.close()
        L_0x01a1:
            X.005 r7 = r7.A01
            java.lang.Object r0 = r7.get()
            X.1Do r0 = (X.C24731Do) r0
            X.17T r0 = r0.A0J
            long r0 = r0.A03(r5)
            java.lang.Object r2 = r7.get()
            X.1Do r2 = (X.C24731Do) r2
            X.17U r2 = r2.A0K
            long r2 = r2.A06(r5)
            r11 = 0
            r12 = 1
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x01d0
            java.lang.Object r9 = r7.get()
            X.1Do r9 = (X.C24731Do) r9
            X.1A1 r9 = r9.A0V
            X.175 r9 = r9.A01
            X.3T1 r11 = r9.A01(r0)
        L_0x01d0:
            java.lang.Object r9 = r7.get()
            X.1Do r9 = (X.C24731Do) r9
            X.163 r9 = r9.A0C
            X.12q r10 = r9.A00
            r9 = 0
            X.3Qp r9 = r10.A09(r5, r9)
            if (r9 == 0) goto L_0x01f1
            if (r15 == 0) goto L_0x01e9
            r9.A0U = r0
            r9.A0V = r2
            r9.A0d = r11
        L_0x01e9:
            if (r14 == 0) goto L_0x01f1
            r9.A0N = r0
            r9.A0O = r2
            r9.A0c = r11
        L_0x01f1:
            long r0 = r4.A0H
            long r2 = r6.A1O
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x01fd
            r0 = -9223372036854775808
            r4.A0H = r0
        L_0x01fd:
            java.lang.Object r0 = r7.get()
            X.1Do r0 = (X.C24731Do) r0
            X.163 r0 = r0.A0C
            boolean r0 = r0.A0L(r4)
            if (r0 != 0) goto L_0x021f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ChatManager/refresh/chatpreview/update/insert failed gid="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x021f:
            java.lang.Object r0 = r7.get()
            X.1Do r0 = (X.C24731Do) r0
            X.1DP r0 = r0.A0B
            r0.A02(r5, r8)
            return
        L_0x022b:
            java.lang.Object r0 = r2.A00
            X.12t r0 = (X.C220712t) r0
            java.lang.Object r7 = r2.A01
            X.3Qp r7 = (X.C65073Qp) r7
            X.005 r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.1Do r0 = (X.C24731Do) r0
            X.163 r5 = r0.A0C
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/reset-show-group-description "
            r1.append(r0)
            X.11F r6 = r7.A0q
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12P r0 = r5.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x029b, Error | RuntimeException -> 0x02c6 }
            X.1M0 r4 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x029b, Error | RuntimeException -> 0x02c6 }
            monitor-enter(r7)     // Catch:{ all -> 0x0291 }
            r0 = 2
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x028e }
            r3.<init>(r0)     // Catch:{ all -> 0x028e }
            java.lang.String r2 = "show_group_description"
            boolean r1 = r7.A0p     // Catch:{ all -> 0x028e }
            r0 = 0
            if (r1 == 0) goto L_0x0268
            r0 = 1
        L_0x0268:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x028e }
            r3.put(r2, r0)     // Catch:{ all -> 0x028e }
            monitor-exit(r7)     // Catch:{ all -> 0x0291 }
            int r0 = r5.A05(r3, r7)     // Catch:{ all -> 0x0291 }
            if (r0 != 0) goto L_0x028a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0291 }
            r1.<init>()     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = "msgstore/reset-show-group-description/did not update "
            r1.append(r0)     // Catch:{ all -> 0x0291 }
            r1.append(r6)     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0291 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0291 }
        L_0x028a:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x029b, Error | RuntimeException -> 0x02c6 }
            return
        L_0x028e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0291 }
            throw r0     // Catch:{ all -> 0x0291 }
        L_0x0291:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0296 }
            goto L_0x029a
        L_0x0296:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x029b, Error | RuntimeException -> 0x02c6 }
        L_0x029a:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x029b, Error | RuntimeException -> 0x02c6 }
        L_0x029b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r5.A03
            goto L_0x02d1
        L_0x02a2:
            java.lang.Object r0 = r2.A00
            X.12t r0 = (X.C220712t) r0
            java.lang.Object r1 = r2.A01
            X.3Qp r1 = (X.C65073Qp) r1
            X.005 r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.1Do r0 = (X.C24731Do) r0
            X.163 r0 = r0.A0C
            r0.A0H(r1)
            return
        L_0x02b8:
            java.lang.Object r3 = r2.A00
            X.1Cu r3 = (X.C24531Cu) r3
            java.lang.Object r1 = r2.A01
            X.3Qp r1 = (X.C65073Qp) r1
            X.163 r0 = r3.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cb, Error | RuntimeException -> 0x02c6, Error | RuntimeException -> 0x02c6 }
            r0.A0D(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cb, Error | RuntimeException -> 0x02c6, Error | RuntimeException -> 0x02c6 }
            return
        L_0x02c6:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            throw r1
        L_0x02cb:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r3.A03
        L_0x02d1:
            r0.A03()
            return
        L_0x02d5:
            java.lang.Object r4 = r2.A00
            X.1HJ r4 = (X.AnonymousClass1HJ) r4
            java.lang.Object r3 = r2.A01
            X.1DQ r0 = r4.A0A
            android.os.Handler r2 = r0.A02
            r1 = 35
            goto L_0x02fa
        L_0x02e2:
            java.lang.Object r1 = r2.A00
            X.1HJ r1 = (X.AnonymousClass1HJ) r1
            java.lang.Object r0 = r2.A01
            X.5Nh r0 = (X.C107265Nh) r0
            X.AnonymousClass1HJ.A04(r1, r0)
            return
        L_0x02ee:
            java.lang.Object r4 = r2.A00
            X.1HJ r4 = (X.AnonymousClass1HJ) r4
            java.lang.Object r3 = r2.A01
            X.1DQ r0 = r4.A0A
            android.os.Handler r2 = r0.A02
            r1 = 31
        L_0x02fa:
            X.1j5 r0 = new X.1j5
            r0.<init>(r4, r3, r1)
            r2.post(r0)
            return
        L_0x0303:
            java.lang.Object r1 = r2.A00
            X.1HJ r1 = (X.AnonymousClass1HJ) r1
            java.lang.Object r0 = r2.A01
            X.5Nh r0 = (X.C107265Nh) r0
            X.AnonymousClass1HJ.A02(r1, r0)
            return
        L_0x030f:
            java.lang.Object r7 = r2.A00
            X.1HJ r7 = (X.AnonymousClass1HJ) r7
            java.lang.Object r6 = r2.A01
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r7.A0K
            r42 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r42.writeLock()
            r0.lock()
            java.util.Iterator r16 = r6.iterator()     // Catch:{ all -> 0x0436 }
        L_0x032b:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0436 }
            if (r0 == 0) goto L_0x0421
            java.lang.Object r4 = r16.next()     // Catch:{ all -> 0x0436 }
            X.5Nh r4 = (X.C107265Nh) r4     // Catch:{ all -> 0x0436 }
            boolean r0 = r4.A05     // Catch:{ all -> 0x0436 }
            if (r0 != 0) goto L_0x03d5
            X.5Iy r2 = r4.A03     // Catch:{ all -> 0x0436 }
            boolean r0 = r2 instanceof X.AnonymousClass5J4     // Catch:{ all -> 0x0436 }
            if (r0 == 0) goto L_0x037c
            X.1HK r3 = r7.A07     // Catch:{ all -> 0x0436 }
            r1 = 0
            if (r2 == 0) goto L_0x0347
            r1 = 1
        L_0x0347:
            java.lang.String r0 = "not a legacy/v1 call log"
            X.C18740tg.A0E(r1, r0)     // Catch:{ all -> 0x0436 }
            java.util.ArrayList r0 = r4.A0C()     // Catch:{ all -> 0x0436 }
            int r0 = r0.size()     // Catch:{ all -> 0x0436 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0436 }
            r2.<init>(r0)     // Catch:{ all -> 0x0436 }
            java.util.ArrayList r0 = r4.A0C()     // Catch:{ all -> 0x0436 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0436 }
        L_0x0361:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0436 }
            if (r0 == 0) goto L_0x0382
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x0436 }
            X.5Nf r0 = (X.C107255Nf) r0     // Catch:{ all -> 0x0436 }
            com.whatsapp.jid.UserJid r10 = r0.A00     // Catch:{ all -> 0x0436 }
            int r9 = r0.A01     // Catch:{ all -> 0x0436 }
            r0 = -1
            X.5Nf r8 = new X.5Nf     // Catch:{ all -> 0x0436 }
            r8.<init>(r10, r9, r0)     // Catch:{ all -> 0x0436 }
            r2.add(r8)     // Catch:{ all -> 0x0436 }
            goto L_0x0361
        L_0x037c:
            X.1HK r0 = r7.A07     // Catch:{ all -> 0x0436 }
            r0.A07(r4)     // Catch:{ all -> 0x0436 }
            goto L_0x03d5
        L_0x0382:
            X.6by r0 = r4.A04     // Catch:{ all -> 0x0436 }
            r22 = r0
            long r9 = r4.A01     // Catch:{ all -> 0x0436 }
            boolean r0 = r4.A0K     // Catch:{ all -> 0x0436 }
            r38 = r0
            int r0 = r4.A09     // Catch:{ all -> 0x0436 }
            r19 = r0
            int r0 = r4.A07     // Catch:{ all -> 0x0436 }
            r17 = r0
            X.5Tz r23 = r4.A0B()     // Catch:{ all -> 0x0436 }
            long r0 = r4.A0B     // Catch:{ all -> 0x0436 }
            com.whatsapp.jid.GroupJid r15 = r4.A0D     // Catch:{ all -> 0x0436 }
            boolean r14 = r4.A0J     // Catch:{ all -> 0x0436 }
            com.whatsapp.jid.DeviceJid r13 = r4.A02     // Catch:{ all -> 0x0436 }
            java.lang.String r12 = r4.A0H     // Catch:{ all -> 0x0436 }
            X.C107265Nh.A01(r4)     // Catch:{ all -> 0x0436 }
            int r11 = r4.A0A     // Catch:{ all -> 0x0436 }
            r18 = 0
            r32 = -1
            r31 = 0
            X.5Nh r8 = new X.5Nh     // Catch:{ all -> 0x0436 }
            r24 = r18
            r25 = r18
            r39 = 0
            r40 = 0
            r20 = r15
            r21 = r18
            r26 = r12
            r27 = r2
            r28 = r19
            r29 = r17
            r30 = r11
            r34 = r9
            r36 = r0
            r41 = r14
            r17 = r8
            r19 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r39, r40, r41)     // Catch:{ all -> 0x0436 }
            r3.A07(r8)     // Catch:{ all -> 0x0436 }
        L_0x03d5:
            X.1HS r0 = r7.A00     // Catch:{ all -> 0x0436 }
            r0.A01(r4)     // Catch:{ all -> 0x0436 }
            X.0yC r0 = r7.A0F     // Catch:{ all -> 0x0436 }
            boolean r0 = X.C34681hT.A0K(r0)     // Catch:{ all -> 0x0436 }
            if (r0 == 0) goto L_0x032b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0436 }
            r1.<init>()     // Catch:{ all -> 0x0436 }
            X.6by r9 = r4.A04     // Catch:{ all -> 0x0436 }
            com.whatsapp.jid.UserJid r0 = r9.A01     // Catch:{ all -> 0x0436 }
            r1.add(r0)     // Catch:{ all -> 0x0436 }
            java.util.HashSet r0 = r4.A0D()     // Catch:{ all -> 0x0436 }
            r1.addAll(r0)     // Catch:{ all -> 0x0436 }
            com.whatsapp.jid.GroupJid r0 = r4.A0D     // Catch:{ all -> 0x0436 }
            if (r0 == 0) goto L_0x03fe
            com.whatsapp.jid.GroupJid r0 = r4.A0D     // Catch:{ all -> 0x0436 }
            r1.add(r0)     // Catch:{ all -> 0x0436 }
        L_0x03fe:
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x0436 }
        L_0x0402:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0436 }
            if (r0 == 0) goto L_0x032b
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x0436 }
            X.11F r4 = (X.AnonymousClass11F) r4     // Catch:{ all -> 0x0436 }
            X.176 r3 = r7.A0B     // Catch:{ all -> 0x0436 }
            boolean r2 = r9.A03     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x0436 }
            java.lang.String r1 = X.C34681hT.A08(r0)     // Catch:{ all -> 0x0436 }
            X.3Qa r0 = new X.3Qa     // Catch:{ all -> 0x0436 }
            r0.<init>(r4, r1, r2)     // Catch:{ all -> 0x0436 }
            r3.A0C(r0)     // Catch:{ all -> 0x0436 }
            goto L_0x0402
        L_0x0421:
            X.1DQ r0 = r7.A0A     // Catch:{ all -> 0x0436 }
            android.os.Handler r2 = r0.A01     // Catch:{ all -> 0x0436 }
            r1 = 3
            X.1j0 r0 = new X.1j0     // Catch:{ all -> 0x0436 }
            r0.<init>(r7, r5, r6, r1)     // Catch:{ all -> 0x0436 }
            r2.post(r0)     // Catch:{ all -> 0x0436 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r42.writeLock()
            r0.unlock()
            return
        L_0x0436:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r42.writeLock()
            r0.unlock()
            throw r1
        L_0x043f:
            java.lang.Object r1 = r2.A00
            X.1HJ r1 = (X.AnonymousClass1HJ) r1
            java.lang.Object r0 = r2.A01
            X.6by r0 = (X.C135006by) r0
            X.AnonymousClass1HJ.A01(r1, r0)
            return
        L_0x044b:
            java.lang.Object r0 = r2.A00
            X.1CY r0 = (X.AnonymousClass1CY) r0
            java.lang.Object r3 = r2.A01
            X.777 r3 = (X.AnonymousClass777) r3
            X.1CZ r0 = r0.A00
            java.util.Map r1 = r0.A00
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0464:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0493
            java.lang.Object r0 = r1.next()
            X.62q r0 = (X.C1261262q) r0
            int r2 = r0.A00
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 < r0) goto L_0x0464
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "getKeyForEncryptedBackupWithFuture/received/received/error "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x048b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.BVO(r0)
            return
        L_0x0493:
            r0 = 1
            goto L_0x048b
        L_0x0495:
            java.lang.Object r3 = r2.A00
            X.0zv r3 = (X.C21860zv) r3
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r1 = "app_state"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            r3.A04 = r0
            java.io.File r0 = r3.A04
            boolean r0 = r0.exists()
            r2 = 0
            if (r0 == 0) goto L_0x04bb
            java.io.File r0 = r3.A04
            boolean r0 = r0.isDirectory()
            if (r0 != 0) goto L_0x04cb
        L_0x04bb:
            java.io.File r0 = r3.A04
            r0.delete()
            java.io.File r0 = r3.A04
            boolean r0 = r0.mkdir()
            if (r0 != 0) goto L_0x04cb
            r3.A06 = r2
            return
        L_0x04cb:
            r4 = 0
        L_0x04cc:
            java.io.File r0 = r3.A04
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.io.File r5 = new java.io.File
            r5.<init>(r0, r1)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x04f9
            int r4 = r4 + 1
            r0 = 5
            if (r4 < r0) goto L_0x04cc
            long r4 = java.lang.System.currentTimeMillis()
            r0 = 5
            long r4 = r4 % r0
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r3.A05 = r0
            java.io.File r1 = r3.A04
            java.lang.String r0 = r3.A05
            java.io.File r5 = new java.io.File
            r5.<init>(r1, r0)
            goto L_0x04fb
        L_0x04f9:
            r3.A05 = r1
        L_0x04fb:
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0563 }
            r4.<init>(r5, r0)     // Catch:{ IOException -> 0x0563 }
            r9 = 1024(0x400, double:5.06E-321)
            r4.setLength(r9)     // Catch:{ all -> 0x0559 }
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch:{ all -> 0x0559 }
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ all -> 0x0559 }
            r7 = 0
            java.nio.MappedByteBuffer r0 = r5.map(r6, r7, r9)     // Catch:{ all -> 0x0559 }
            r3.A01 = r0     // Catch:{ all -> 0x0559 }
            r0.position(r2)     // Catch:{ all -> 0x0559 }
            java.nio.MappedByteBuffer r0 = r3.A01     // Catch:{ all -> 0x0559 }
            byte[] r6 = X.C21860zv.A08     // Catch:{ all -> 0x0559 }
            r0.put(r6)     // Catch:{ all -> 0x0559 }
            java.nio.MappedByteBuffer r1 = r3.A01     // Catch:{ all -> 0x0559 }
            int r5 = X.C21860zv.A07     // Catch:{ all -> 0x0559 }
            int r0 = r5 + -1
            r1.position(r0)     // Catch:{ all -> 0x0559 }
            java.nio.MappedByteBuffer r1 = r3.A01     // Catch:{ all -> 0x0559 }
            r0 = 10
            r1.put(r0)     // Catch:{ all -> 0x0559 }
            java.nio.MappedByteBuffer r0 = r3.A01     // Catch:{ all -> 0x0559 }
            r0.put(r6)     // Catch:{ all -> 0x0559 }
            java.nio.MappedByteBuffer r0 = r3.A01     // Catch:{ all -> 0x0559 }
            r0.position(r2)     // Catch:{ all -> 0x0559 }
            java.nio.MappedByteBuffer r1 = r3.A01     // Catch:{ all -> 0x0559 }
            java.lang.String r0 = X.C21870zw.A00     // Catch:{ all -> 0x0559 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0559 }
            r1.put(r0)     // Catch:{ all -> 0x0559 }
            java.nio.MappedByteBuffer r1 = r3.A01     // Catch:{ all -> 0x0559 }
            int r0 = r5 + 2
            r1.position(r0)     // Catch:{ all -> 0x0559 }
            X.106 r0 = new X.106     // Catch:{ all -> 0x0559 }
            r0.<init>()     // Catch:{ all -> 0x0559 }
            r3.A00 = r0     // Catch:{ all -> 0x0559 }
            r0 = 1
            r3.A06 = r0     // Catch:{ all -> 0x0559 }
            r4.close()     // Catch:{ IOException -> 0x0563 }
            return
        L_0x0559:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x055e }
            goto L_0x0562
        L_0x055e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0563 }
        L_0x0562:
            throw r1     // Catch:{ IOException -> 0x0563 }
        L_0x0563:
            r3.A06 = r2
            return
        L_0x0566:
            java.lang.Object r1 = r2.A00
            X.0wN r1 = (X.C19700wN) r1
            java.lang.Object r3 = r2.A01
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r0 = "log_files_upload"
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            r4 = 0
            r5 = 1
            r6 = 1
            r7 = 1
            r1.A0F(r2, r3, r4, r5, r6, r7)
            return
        L_0x0581:
            java.lang.Object r1 = r2.A01
            X.14u r1 = (X.C225314u) r1
            r0 = 9
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r0 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A03(r0)
            r1.Btm(r0)
            return
        L_0x058f:
            java.lang.Object r1 = r2.A00
            X.1e0 r1 = (X.C32671e0) r1
            java.lang.Object r0 = r2.A01
            X.02E r0 = (X.AnonymousClass02E) r0
            r1.A02(r0)
            return
        L_0x059b:
            java.lang.Object r5 = r2.A00
            X.1ci r5 = (X.C31951ci) r5
            java.lang.Object r1 = r2.A01
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0a6d
            java.util.Iterator r4 = r1.iterator()
        L_0x05ad:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r3 = r4.next()
            X.11F r3 = (X.AnonymousClass11F) r3
            com.whatsapp.conversationslist.ConversationsFragment r0 = r5.A0N
            X.12t r2 = r0.A1k
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A08(r3, r0, r1)
            goto L_0x05ad
        L_0x05c6:
            java.lang.Object r3 = r2.A00
            X.1ci r3 = (X.C31951ci) r3
            java.lang.Object r4 = r2.A01
            java.util.List r4 = (java.util.List) r4
            com.whatsapp.conversationslist.ConversationsFragment r2 = r3.A0N
            X.12t r1 = r2.A1k
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r5 = r1.A04(r0, r4)
            int r6 = r4.size()
            X.17Y r0 = r2.A0d
            r7 = 2
            X.1iX r2 = new X.1iX
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0H(r2)
            return
        L_0x05eb:
            java.lang.Object r4 = r2.A00
            X.1ci r4 = (X.C31951ci) r4
            java.lang.Object r0 = r2.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            int r3 = r0.size()
            java.util.Iterator r2 = r0.iterator()
        L_0x05fb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x060f
            java.lang.Object r1 = r2.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            com.whatsapp.conversationslist.ConversationsFragment r0 = r4.A0N
            X.12t r0 = r0.A1k
            r0.A03(r1)
            goto L_0x05fb
        L_0x060f:
            r0 = 1
            r2 = 2131895225(0x7f1223b9, float:1.9425277E38)
            if (r3 != r0) goto L_0x0618
            r2 = 2131895226(0x7f1223ba, float:1.942528E38)
        L_0x0618:
            com.whatsapp.conversationslist.ConversationsFragment r0 = r4.A0N
            X.17Y r1 = r0.A0d
            r0 = 0
            r1.A07(r2, r0)
            return
        L_0x0621:
            java.lang.Object r4 = r2.A00
            X.1ci r4 = (X.C31951ci) r4
            java.lang.Object r0 = r2.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x062d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r2 = r3.next()
            X.11F r2 = (X.AnonymousClass11F) r2
            boolean r0 = r2 instanceof X.AnonymousClass146
            if (r0 != 0) goto L_0x062d
            com.whatsapp.conversationslist.ConversationsFragment r0 = r4.A0N
            X.1dx r1 = r0.A2N
            X.2oi r0 = X.C51992oi.CHAT_LIST_SCREEN
            r1.A01(r2, r0)
            goto L_0x062d
        L_0x0647:
            java.lang.Object r0 = r2.A00
            X.1ji r0 = (X.C36071ji) r0
            java.lang.Object r3 = r2.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.Object r2 = r0.A00
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            X.1gf r0 = r2.A1Q
            if (r0 == 0) goto L_0x066f
            X.15b r0 = r0.A01
            java.util.List r1 = r0.A04
            if (r1 != 0) goto L_0x065f
            X.09w r1 = X.C023409w.A00
        L_0x065f:
            java.lang.String r0 = "UNREAD_FILTER"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x066f
            X.15b r0 = r2.A1c()
            r2.B1H(r0)
            return
        L_0x066f:
            com.whatsapp.conversationslist.ConversationsFragment.A0M(r2, r3)
            return
        L_0x0673:
            java.lang.Object r3 = r2.A00
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            java.lang.Object r1 = r2.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.16D r0 = r3.A15
            X.141 r1 = r0.A08(r1)
            if (r1 == 0) goto L_0x0a6d
            boolean r0 = r1.A0D()
            if (r0 != 0) goto L_0x068f
            boolean r0 = r1.A0E()
            if (r0 == 0) goto L_0x0a6d
        L_0x068f:
            X.1KI r1 = r3.A2x
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            return
        L_0x0699:
            java.lang.Object r0 = r2.A00
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r3 = r2.A01
            X.1fI r3 = (X.C33421fI) r3
            java.util.Iterator r2 = r0.iterator()
        L_0x06a5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r1 = r2.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            X.12t r0 = r3.A04
            r0.A03(r1)
            goto L_0x06a5
        L_0x06b7:
            java.lang.Object r3 = r2.A00
            X.1fI r3 = (X.C33421fI) r3
            java.lang.Object r1 = r2.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            r2 = 0
            X.12t r0 = r3.A04
            r0.A03(r1)
            X.17Y r1 = r3.A00
            r0 = 2131895226(0x7f1223ba, float:1.942528E38)
            r1.A07(r0, r2)
            return
        L_0x06ce:
            java.lang.Object r5 = r2.A00
            X.1fI r5 = (X.C33421fI) r5
            java.lang.Object r4 = r2.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            r3 = 0
            X.1fH r2 = r5.A02
            X.0wo r0 = r5.A03
            long r0 = X.C19970wo.A00(r0)
            r2.A01(r4, r0)
            X.17Y r1 = r5.A00
            r0 = 2131893052(0x7f121b3c, float:1.942087E38)
            r1.A07(r0, r3)
            return
        L_0x06eb:
            java.lang.Object r1 = r2.A00
            X.0v0 r1 = (X.C19420v0) r1
            java.lang.Object r0 = r2.A01
            X.17T r0 = (X.AnonymousClass17T) r0
            long r2 = r0.A01()
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r1)
            java.lang.String r0 = "last_message_row_id_since_archive_open"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
            return
        L_0x0705:
            java.lang.Object r3 = r2.A00
            X.1NM r3 = (X.AnonymousClass1NM) r3
            java.lang.Object r2 = r2.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ChatMessageCounts/recordMatMessageReceived jid:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A07()
            r0 = 25
            r3.A09(r2, r0)
            return
        L_0x072a:
            java.lang.Object r7 = r2.A00
            X.1NM r7 = (X.AnonymousClass1NM) r7
            java.lang.Object r1 = r2.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            monitor-enter(r7)
            android.content.SharedPreferences r6 = X.AnonymousClass1NM.A00(r7)     // Catch:{ all -> 0x0763 }
            X.17V r0 = r7.A0N     // Catch:{ all -> 0x0763 }
            long r4 = r0.A01()     // Catch:{ all -> 0x0763 }
            X.3Qa r0 = r1.A1J     // Catch:{ all -> 0x0763 }
            X.11F r3 = r0.A00     // Catch:{ all -> 0x0763 }
            long r1 = r1.A0I     // Catch:{ all -> 0x0763 }
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x075e
            if (r3 == 0) goto L_0x075e
            java.lang.String r2 = r3.getRawString()     // Catch:{ all -> 0x0763 }
            java.lang.String r0 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r6.getString(r2, r0)     // Catch:{ all -> 0x0763 }
            X.9fc r1 = X.C199619fc.A00(r0)     // Catch:{ all -> 0x0763 }
            r0 = 6
            r1.A01(r0)     // Catch:{ all -> 0x0763 }
            X.AnonymousClass1NM.A02(r6, r1, r2)     // Catch:{ all -> 0x0763 }
        L_0x075e:
            monitor-exit(r7)
            r7.A07()
            return
        L_0x0763:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        L_0x0766:
            java.lang.Object r1 = r2.A00
            X.1JC r1 = (X.AnonymousClass1JC) r1
            java.lang.Object r5 = r2.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.13w r5 = (X.C223313w) r5
            X.1FV r0 = r1.A07
            r0.A07(r5)
            X.12O r0 = r1.A06
            com.whatsapp.jid.PhoneUserJid r6 = r0.A0A(r5)
            X.004 r0 = r1.A09
            java.lang.Object r2 = r0.get()
            X.196 r2 = (X.AnonymousClass196) r2
            X.12q r1 = r2.A0N
            r0 = 0
            X.3Qp r0 = r1.A09(r5, r0)
            if (r0 == 0) goto L_0x0799
            X.2oy r1 = X.C52152oy.USERNAME
            X.2oy r0 = r0.A0Z
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0799
            r2.A0E()
        L_0x0799:
            X.1AE r1 = r2.A0T
            java.lang.String r0 = "pnForLidChat"
            X.1LZ r1 = r1.A00(r0)
            X.8Y6 r1 = (X.AnonymousClass8Y6) r1
            if (r1 == 0) goto L_0x07cd
            if (r6 == 0) goto L_0x0a6d
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            X.0wo r0 = r1.A00
            long r8 = X.C19970wo.A00(r0)
            r4 = 0
            X.8bT r3 = new X.8bT
            r7 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Set r0 = java.util.Collections.singleton(r3)
            r2.A0M(r0)
        L_0x07bf:
            X.141 r0 = new X.141
            r0.<init>(r6)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 1
            r2.A0O(r1, r0)
            return
        L_0x07cd:
            if (r6 == 0) goto L_0x0a6d
            goto L_0x07bf
        L_0x07d0:
            java.lang.Object r0 = r2.A00
            X.1Nz r0 = (X.C27381Nz) r0
            java.lang.Object r1 = r2.A01
            X.6Pu r1 = (X.C131626Pu) r1
            X.005 r0 = r0.A0S
            java.lang.Object r0 = r0.get()
            X.0wB r0 = (X.C19580wB) r0
            boolean r3 = r1.A01()
            java.util.Set r2 = r1.A01
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x07ee:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r0 = r1.next()
            X.16B r0 = (X.AnonymousClass16B) r0
            r0.BUX(r2, r3)
            goto L_0x07ee
        L_0x07fe:
            java.lang.Object r1 = r2.A00
            X.1Nz r1 = (X.C27381Nz) r1
            java.lang.Object r0 = r2.A01
            X.6Pq r0 = (X.C131586Pq) r0
            X.C27381Nz.A02(r1, r0)
            return
        L_0x080a:
            java.lang.Object r0 = r2.A00
            X.1a7 r0 = (X.C30381a7) r0
            java.lang.Object r1 = r2.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Nx r0 = r0.A0Q
            r0.A07(r1)
            return
        L_0x0818:
            java.lang.Object r0 = r2.A00
            X.1a7 r0 = (X.C30381a7) r0
            java.lang.Object r1 = r2.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Cd r0 = r0.A05
            r0.A00(r1)
            return
        L_0x0826:
            java.lang.Object r0 = r2.A00
            X.1a7 r0 = (X.C30381a7) r0
            java.lang.Object r1 = r2.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1HT r0 = r0.A0G
            r0.A01(r1)
            return
        L_0x0834:
            java.lang.Object r0 = r2.A00
            X.1a7 r0 = (X.C30381a7) r0
            java.lang.Object r2 = r2.A01
            X.6Pq r2 = (X.C131586Pq) r2
            X.0xY r1 = r0.A0B
            r0 = 1
            X.C20430xY.A00(r1, r2, r0)
            return
        L_0x0843:
            java.lang.Object r3 = r2.A00
            X.1du r3 = (X.C32611du) r3
            java.lang.Object r2 = r2.A01
            X.2Rz r2 = (X.C45602Rz) r2
            X.0yb r1 = r3.A01
            X.0yE r0 = r3.A02
            java.lang.Integer r0 = X.C63723Ld.A00(r1, r0)
            if (r0 == 0) goto L_0x085f
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
        L_0x085f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.16D r0 = r3.A00
            r0.A0i(r1)
            int r0 = r1.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
            X.0yW r0 = r3.A03
            r0.Bly(r2)
            return
        L_0x087a:
            java.lang.Object r4 = r2.A00
            X.1O7 r4 = (X.AnonymousClass1O7) r4
            java.lang.Object r8 = r2.A01
            X.5xp r8 = (X.C124245xp) r8
            X.16D r1 = r4.A01
            X.11F r0 = r8.A03
            X.141 r3 = r1.A0D(r0)
            boolean r15 = X.C197029b1.A00(r0)
            int r12 = r8.A02
            r6 = 0
            r9 = 1
            if (r12 != r9) goto L_0x0980
            byte[] r5 = r8.A00
        L_0x0896:
            r11 = 2
            if (r12 != r11) goto L_0x089b
            byte[] r6 = r8.A00
        L_0x089b:
            r4.A01(r3, r5, r6)
            int r13 = r3.A05
            java.lang.String r10 = " should be >= "
            r2 = 0
            if (r5 == 0) goto L_0x092b
            int r13 = r8.A01
            r7 = r13
        L_0x08a8:
            int r14 = r3.A06
            if (r6 == 0) goto L_0x08da
            r2 = r7
        L_0x08ad:
            r4.A00(r3, r13, r2)
            X.1AQ r0 = r4.A06
            java.lang.Class<X.11F> r2 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r1 = r3.A06(r2)
            if (r12 != r9) goto L_0x08d7
            X.1AT r0 = r0.A01
        L_0x08bc:
            r0.A01(r1)
            boolean r0 = r3.A0G()
            if (r0 == 0) goto L_0x0a05
            if (r12 != r11) goto L_0x0a05
            X.1Cv r12 = r4.A05
            com.whatsapp.jid.Jid r11 = r3.A06(r2)
            X.11F r11 = (X.AnonymousClass11F) r11
            X.12P r0 = r12.A04
            X.1M0 r10 = r0.get()
            goto L_0x0983
        L_0x08d7:
            X.1AT r0 = r0.A02
            goto L_0x08bc
        L_0x08da:
            if (r14 == r7) goto L_0x0900
            if (r7 >= r14) goto L_0x0902
            X.11F r0 = r3.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x0902
            if (r15 != 0) goto L_0x0902
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ContactPhotoUpdater/writeProfilePhotoToDb received photo_thumb_id invalid, "
            r1.append(r0)
            r1.append(r7)
            r1.append(r10)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0900:
            r2 = r14
            goto L_0x08ad
        L_0x0902:
            X.16K r0 = r4.A03
            java.io.File r10 = r0.A01(r3)
            if (r10 == 0) goto L_0x08ad
            boolean r0 = r10.exists()
            if (r0 == 0) goto L_0x08ad
            boolean r0 = r10.delete()
            if (r0 != 0) goto L_0x08ad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ContactPhotoUpdater/writeProfilePhotoToDb failed to delete; file="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x08ad
        L_0x092b:
            int r7 = r8.A01
            if (r13 == r7) goto L_0x08a8
            if (r7 >= r13) goto L_0x0955
            X.11F r0 = r3.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x0955
            if (r15 != 0) goto L_0x0955
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "received photo_full_id invalid, "
            r1.append(r0)
            r1.append(r7)
            r1.append(r10)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x08a8
        L_0x0955:
            X.16K r0 = r4.A03
            java.io.File r13 = r0.A00(r3)
            if (r13 == 0) goto L_0x097d
            boolean r0 = r13.exists()
            if (r0 == 0) goto L_0x097d
            boolean r0 = r13.delete()
            if (r0 != 0) goto L_0x097d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "failed to delete; file="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x097d:
            r13 = 0
            goto L_0x08a8
        L_0x0980:
            r5 = r6
            goto L_0x0896
        L_0x0983:
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x09de }
            r2 = 0
            X.163 r0 = r12.A00     // Catch:{ all -> 0x09de }
            long r0 = r0.A08(r11)     // Catch:{ all -> 0x09de }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x09de }
            r9[r2] = r0     // Catch:{ all -> 0x09de }
            X.0yC r2 = r12.A05     // Catch:{ all -> 0x09de }
            r1 = 6261(0x1875, float:8.774E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x09de }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ all -> 0x09de }
            if (r0 == 0) goto L_0x09a9
            java.lang.String r2 = X.C56882x2.A01     // Catch:{ all -> 0x09de }
        L_0x09a0:
            X.14e r1 = r10.A02     // Catch:{ all -> 0x09de }
            java.lang.String r0 = "GET_LAST_PHOTO_CHANGE_MESSAGE_SQL"
            android.database.Cursor r9 = r1.A09(r2, r0, r9)     // Catch:{ all -> 0x09de }
            goto L_0x09ac
        L_0x09a9:
            java.lang.String r2 = X.C56882x2.A00     // Catch:{ all -> 0x09de }
            goto L_0x09a0
        L_0x09ac:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x09d2 }
            if (r0 == 0) goto L_0x09b9
            X.1A1 r0 = r12.A07     // Catch:{ all -> 0x09d2 }
            X.3T1 r2 = r0.A01(r9, r11)     // Catch:{ all -> 0x09d2 }
            goto L_0x09ce
        L_0x09b9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09d2 }
            r1.<init>()     // Catch:{ all -> 0x09d2 }
            java.lang.String r0 = "msgstore/last-photo-change/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x09d2 }
            r1.append(r11)     // Catch:{ all -> 0x09d2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x09d2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x09d2 }
            r2 = 0
        L_0x09ce:
            r9.close()     // Catch:{ all -> 0x09de }
            goto L_0x09e8
        L_0x09d2:
            r1 = move-exception
            if (r9 == 0) goto L_0x09dd
            r9.close()     // Catch:{ all -> 0x09d9 }
            goto L_0x09dd
        L_0x09d9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09de }
        L_0x09dd:
            throw r1     // Catch:{ all -> 0x09de }
        L_0x09de:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x09e3 }
            throw r1
        L_0x09e3:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x09e8:
            r10.close()
            X.2bI r2 = (X.AnonymousClass2bI) r2
            boolean r0 = r2 instanceof X.C181238n9
            if (r0 == 0) goto L_0x0a05
            r0 = r2
            X.8n9 r0 = (X.C181238n9) r0
            com.whatsapp.data.ProfilePhotoChange r1 = r0.A00
            if (r1 == 0) goto L_0x0a05
            int r0 = r1.newPhotoId
            if (r0 != r7) goto L_0x0a05
            byte[] r0 = r8.A00
            r1.newPhoto = r0
            X.0xM r0 = r4.A04
            r0.A0k(r2)
        L_0x0a05:
            if (r5 != 0) goto L_0x0a09
            if (r6 == 0) goto L_0x0a6d
        L_0x0a09:
            X.17Y r2 = r4.A00
            r1 = 49
            X.1j2 r0 = new X.1j2
            r0.<init>(r4, r3, r1)
            r2.A0H(r0)
            return
        L_0x0a16:
            java.lang.Object r4 = r2.A00
            X.1O7 r4 = (X.AnonymousClass1O7) r4
            java.lang.Object r6 = r2.A01
            X.11F r6 = (X.AnonymousClass11F) r6
            X.16D r0 = r4.A01
            X.141 r5 = r0.A0D(r6)
            int r2 = r5.A05
            r8 = 1
            r1 = -1
            if (r2 != r1) goto L_0x0a2f
            int r0 = r5.A06
            r3 = 1
            if (r0 == r1) goto L_0x0a5e
        L_0x0a2f:
            r3 = 0
            if (r2 != 0) goto L_0x0a5e
            int r0 = r5.A06
            if (r0 != 0) goto L_0x0a5e
        L_0x0a36:
            X.16K r0 = r4.A03
            r0.A03(r5)
            r4.A00(r5, r1, r1)
            X.1AQ r2 = r4.A06
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r1 = r5.A06(r0)
            X.1AT r0 = r2.A01
            r0.A01(r1)
            X.1AT r0 = r2.A02
            r0.A01(r1)
            if (r3 != 0) goto L_0x0a6d
            X.17Y r0 = r4.A00
            r7 = 2
            X.1iY r3 = new X.1iY
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0H(r3)
            return
        L_0x0a5e:
            r8 = 0
            goto L_0x0a36
        L_0x0a60:
            java.lang.Object r0 = r2.A00
            X.0xM r0 = (X.C20310xM) r0
            java.lang.Object r1 = r2.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.16J r0 = r0.A0Z
            r0.A00(r1)
        L_0x0a6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35681j5.run():void");
    }
}
