package X;

/* renamed from: X.1SL  reason: invalid class name */
public final class AnonymousClass1SL {
    public final C19970wo A00;
    public final C220412q A01;
    public final AnonymousClass12P A02;
    public final C26141Ja A03;
    public final AnonymousClass17U A04;
    public final C20810yC A05;
    public final AnonymousClass1GQ A06;
    public final AnonymousClass1SM A07;
    public final C28631Tk A08;
    public final AnonymousClass1TZ A09;
    public final AnonymousClass1SP A0A;
    public final C19770wU A0B;
    public final AnonymousClass164 A0C;
    public final AnonymousClass1SQ A0D;

    public AnonymousClass1SL(AnonymousClass164 r2, C19970wo r3, C220412q r4, AnonymousClass12P r5, C26141Ja r6, AnonymousClass17U r7, C20810yC r8, AnonymousClass1GQ r9, AnonymousClass1SM r10, C28631Tk r11, AnonymousClass1SQ r12, AnonymousClass1TZ r13, AnonymousClass1SP r14, C19770wU r15) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r8, 2);
        AnonymousClass00C.A0D(r15, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r7, 5);
        AnonymousClass00C.A0D(r2, 6);
        AnonymousClass00C.A0D(r6, 7);
        AnonymousClass00C.A0D(r9, 8);
        AnonymousClass00C.A0D(r5, 9);
        AnonymousClass00C.A0D(r10, 10);
        AnonymousClass00C.A0D(r12, 12);
        AnonymousClass00C.A0D(r13, 13);
        AnonymousClass00C.A0D(r11, 14);
        this.A00 = r3;
        this.A05 = r8;
        this.A0B = r15;
        this.A01 = r4;
        this.A04 = r7;
        this.A0C = r2;
        this.A03 = r6;
        this.A06 = r9;
        this.A02 = r5;
        this.A07 = r10;
        this.A0A = r14;
        this.A0D = r12;
        this.A09 = r13;
        this.A08 = r11;
    }

    public final void A05(C28981Uw r10, C22949Az1 az1, Long l, int i) {
        C28981Uw r3 = r10;
        AnonymousClass00C.A0D(r10, 0);
        C220412q r1 = this.A01;
        C65073Qp A092 = r1.A09(r10, false);
        if (A092 == null) {
            return;
        }
        if (!(A092 instanceof C44072La)) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (C65903Tx.A06(r1, r10, this.A06)) {
            this.A0B.Boy(new C35431ig(this, r3, A092, l, az1, i, 2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0124, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0125, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0128, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C28981Uw r16, X.AnonymousClass1SL r17, java.lang.Long r18, int r19, long r20) {
        /*
            r6 = r17
            X.0yC r3 = r6.A05
            r5 = 4306(0x10d2, float:6.034E-42)
            X.0yV r4 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r4, r3, r5)
            if (r0 == 0) goto L_0x0129
            X.12q r1 = r6.A01
            X.1GQ r0 = r6.A06
            r13 = r16
            boolean r0 = X.C65903Tx.A06(r1, r13, r0)
            if (r0 == 0) goto L_0x0129
            r0 = r19
            long r0 = (long) r0
            r7 = 300(0x12c, double:1.48E-321)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0025
            r0 = 300(0x12c, double:1.48E-321)
        L_0x0025:
            r11 = 1
            if (r18 != 0) goto L_0x005d
            X.17U r2 = r6.A04
            long r9 = r2.A06(r13)
            r7 = 9223372036854675807(0x7ffffffffffe795f, double:NaN)
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0129
            r7 = 100
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0129
            long r9 = r9 + r11
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            r15 = 0
        L_0x0044:
            boolean r2 = X.C20800yB.A01(r4, r3, r5)
            if (r2 == 0) goto L_0x0129
            r2 = 4326(0x10e6, float:6.062E-42)
            int r2 = X.C20800yB.A00(r4, r3, r2)
            long r2 = (long) r2
            r7 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r7
            X.1SM r7 = r6.A07
            X.12P r5 = r7.A03
            X.1M0 r5 = r5.get()
            goto L_0x007c
        L_0x005d:
            long r9 = r18.longValue()
            int r2 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r2 >= 0) goto L_0x0067
            r9 = r20
        L_0x0067:
            r7 = 9007199254740990(0x1ffffffffffffe, double:4.450147717014402E-308)
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0075
            r9 = 9007199254740990(0x1ffffffffffffe, double:4.450147717014402E-308)
        L_0x0075:
            r14 = 0
            long r9 = r9 - r11
            java.lang.Long r15 = java.lang.Long.valueOf(r9)
            goto L_0x0044
        L_0x007c:
            r17 = r7
            r18 = r14
            r19 = r15
            r20 = r0
            java.lang.String[] r10 = X.AnonymousClass1SM.A01(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0122 }
            X.14e r9 = r5.A02     // Catch:{ all -> 0x0122 }
            java.lang.String r8 = "SELECT MIN(extra_table_last_update_ts) AS temp_min_last_update_ts FROM newsletter_message  WHERE chat_row_id = ? AND server_message_id < ? AND server_message_id > ? ORDER BY server_message_id DESC LIMIT 1 "
            java.lang.String r7 = "GET_LAST_UPDATE_TS"
            android.database.Cursor r8 = r9.A09(r8, r7, r10)     // Catch:{ all -> 0x0122 }
            X.AnonymousClass00C.A08(r8)     // Catch:{ all -> 0x0122 }
            boolean r7 = r8.moveToNext()     // Catch:{ all -> 0x011b }
            if (r7 == 0) goto L_0x00a6
            java.lang.String r7 = "temp_min_last_update_ts"
            int r7 = r8.getColumnIndex(r7)     // Catch:{ all -> 0x011b }
            long r20 = r8.getLong(r7)     // Catch:{ all -> 0x011b }
            goto L_0x00a8
        L_0x00a6:
            r20 = -1
        L_0x00a8:
            r8.close()     // Catch:{ all -> 0x0122 }
            r5.close()
            r9 = 0
            int r5 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x00b6
            r20 = 0
        L_0x00b6:
            X.0wo r5 = r6.A00
            long r7 = X.C19970wo.A00(r5)
            long r7 = r7 - r20
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0129
            int r2 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x0129
            X.1TZ r5 = r6.A09
            monitor-enter(r5)
            X.0yC r3 = r5.A02     // Catch:{ all -> 0x0118 }
            r2 = 4306(0x10d2, float:6.034E-42)
            boolean r2 = X.C20800yB.A01(r4, r3, r2)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0116
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r3.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r13.getRawString()     // Catch:{ all -> 0x0118 }
            r3.append(r2)     // Catch:{ all -> 0x0118 }
            r3.append(r0)     // Catch:{ all -> 0x0118 }
            r3.append(r14)     // Catch:{ all -> 0x0118 }
            r3.append(r15)     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x0118 }
            java.util.Set r4 = r5.A04     // Catch:{ all -> 0x0118 }
            boolean r2 = r4.contains(r6)     // Catch:{ all -> 0x0118 }
            if (r2 != 0) goto L_0x0116
            X.12q r3 = r5.A01     // Catch:{ all -> 0x0118 }
            X.1GQ r2 = r5.A03     // Catch:{ all -> 0x0118 }
            boolean r2 = X.C65903Tx.A06(r3, r13, r2)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0116
            X.164 r3 = r5.A00     // Catch:{ all -> 0x0118 }
            X.AnT r2 = new X.AnT     // Catch:{ all -> 0x0118 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0118 }
            X.8fG r12 = new X.8fG     // Catch:{ all -> 0x0118 }
            r18 = r0
            r16 = r6
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r20)     // Catch:{ all -> 0x0118 }
            r3.A01(r12)     // Catch:{ all -> 0x0118 }
            r4.add(r6)     // Catch:{ all -> 0x0118 }
        L_0x0116:
            monitor-exit(r5)
            return
        L_0x0118:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x011b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x011d }
        L_0x011d:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x0122 }
            throw r0     // Catch:{ all -> 0x0122 }
        L_0x0122:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SL.A00(X.1Uw, X.1SL, java.lang.Long, int, long):void");
    }

    public final void A01(C28981Uw r5) {
        C44072La r3;
        C65073Qp A092 = this.A01.A09(r5, false);
        if (!(A092 instanceof C44072La) || (r3 = (C44072La) A092) == null) {
            throw new IllegalStateException("NewsletterInfo expected in chatCache");
        } else if (!r3.A0P) {
            this.A0B.Boy(new C35631j0(this, r5, r3, 41));
        }
    }

    public final void A02(C28981Uw r5) {
        long j;
        if (C20800yB.A01(C21000yV.A02, this.A05, 4306)) {
            if (r5 != null) {
                j = 300;
            } else {
                j = 1000;
            }
            this.A0C.A01(new C178188fF(r5, j));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0162, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0165, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0166, code lost:
        X.C05600Qi.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0169, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C05600Qi.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0141, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0145, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0148, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014f, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        X.C05600Qi.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0153, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0156, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0157, code lost:
        X.C05600Qi.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x015e, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C28981Uw r20) {
        /*
            r19 = this;
            r4 = r19
            X.1Tk r7 = r4.A08
            r1 = r20
            if (r20 != 0) goto L_0x0035
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            X.12P r6 = r7.A01
            X.1M0 r5 = r6.get()
            X.14e r3 = r5.A02     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = "SELECT _id, chat_row_id, server_message_id,reaction_from_me, reactions_from_me_ts, votes_from_me, votes_from_me_ts FROM newsletter_my_reaction_orphan_message"
            java.lang.String r1 = "SELECT_ALL_ORPHAN_MY_ADD_ONS"
            r0 = 0
            android.database.Cursor r2 = r3.A09(r2, r1, r0)     // Catch:{ all -> 0x0154 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x002d }
            X.C28631Tk.A00(r2, r7, r8)     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0029
            r2.close()     // Catch:{ all -> 0x0154 }
        L_0x0029:
            r5.close()
            goto L_0x0068
        L_0x002d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            X.C05600Qi.A00(r2, r0)     // Catch:{ all -> 0x0154 }
            goto L_0x0153
        L_0x0035:
            r2 = 0
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            X.163 r0 = r7.A00
            long r0 = r0.A08(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r2] = r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            X.12P r6 = r7.A01
            X.1M0 r3 = r6.get()
            X.14e r2 = r3.A02     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = "SELECT _id, chat_row_id, server_message_id, reaction_from_me, reactions_from_me_ts, votes_from_me, votes_from_me_ts FROM newsletter_my_reaction_orphan_message WHERE chat_row_id = ?"
            java.lang.String r0 = "SELECT_ORPHAN_MY_REACTIONS_FOR"
            android.database.Cursor r2 = r2.A09(r1, r0, r5)     // Catch:{ all -> 0x0163 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x015c }
            X.C28631Tk.A00(r2, r7, r8)     // Catch:{ all -> 0x015c }
            if (r2 == 0) goto L_0x0065
            r2.close()     // Catch:{ all -> 0x0163 }
        L_0x0065:
            r3.close()
        L_0x0068:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x015b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r8.iterator()
        L_0x007c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r5 = r9.next()
            X.3KI r5 = (X.AnonymousClass3KI) r5
            X.1SM r8 = r4.A07
            X.1Uw r7 = r5.A02
            long r0 = r5.A01
            X.3T1 r11 = r8.A02(r7, r0)
            if (r11 == 0) goto L_0x007c
            long r0 = r5.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            X.1SQ r10 = r4.A0D
            X.0wo r0 = r4.A00
            long r15 = X.C19970wo.A00(r0)
            r12 = 0
            java.lang.String r14 = r5.A05
            java.lang.Long r13 = r5.A03
            r18 = 0
            r17 = 1
            r10.A02(r11, r12, r13, r14, r15, r17, r18)
            X.3Qa r0 = r11.A1J
            X.11F r8 = r0.A00
            boolean r0 = r8 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x00d3
            boolean r0 = r11 instanceof X.AnonymousClass2bS
            if (r0 == 0) goto L_0x00d3
            java.util.List r7 = r5.A06
            java.lang.Long r1 = r5.A04
            if (r1 == 0) goto L_0x00d3
            X.1Uw r8 = (X.C28981Uw) r8
            r0 = r11
            X.2bS r0 = (X.AnonymousClass2bS) r0
            long r16 = r1.longValue()
            r12 = r10
            r13 = r8
            r14 = r0
            r15 = r7
            r12.A01(r13, r14, r15, r16)
        L_0x00d3:
            r2.add(r11)
            goto L_0x007c
        L_0x00d7:
            X.12P r0 = r4.A02
            X.1M0 r5 = r0.A05()
            X.71s r7 = r5.B1k()     // Catch:{ all -> 0x0154 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x014d }
        L_0x00e5:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x014d }
            X.3T1 r1 = (X.AnonymousClass3T1) r1     // Catch:{ all -> 0x014d }
            X.1SM r0 = r4.A07     // Catch:{ all -> 0x014d }
            r0.A05(r1)     // Catch:{ all -> 0x014d }
            goto L_0x00e5
        L_0x00f7:
            r10 = 0
            X.1M0 r4 = r6.A05()     // Catch:{ all -> 0x014d }
            X.71s r6 = r4.B1k()     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = ""
            java.lang.String[] r9 = new java.lang.String[]{r0}     // Catch:{ all -> 0x013f }
            java.util.Iterator r8 = r3.iterator()     // Catch:{ all -> 0x013f }
        L_0x010a:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x012c
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x013f }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x013f }
            long r0 = r0.longValue()     // Catch:{ all -> 0x013f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x013f }
            r9[r10] = r0     // Catch:{ all -> 0x013f }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x013f }
            java.lang.String r2 = "newsletter_my_reaction_orphan_message"
            java.lang.String r1 = "_id = ?"
            java.lang.String r0 = "STORE_RESOLVED"
            r3.A03(r2, r1, r0, r9)     // Catch:{ all -> 0x013f }
            goto L_0x010a
        L_0x012c:
            r6.A00()     // Catch:{ all -> 0x013f }
            r6.close()     // Catch:{ all -> 0x0146 }
            r4.close()     // Catch:{ all -> 0x014d }
            r7.A00()     // Catch:{ all -> 0x014d }
            r7.close()     // Catch:{ all -> 0x0154 }
            r5.close()
            return
        L_0x013f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x0146 }
            throw r0     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0148 }
        L_0x0148:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x014d }
            throw r0     // Catch:{ all -> 0x014d }
        L_0x014d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x014f }
        L_0x014f:
            r1 = move-exception
            X.C05600Qi.A00(r7, r0)     // Catch:{ all -> 0x0154 }
        L_0x0153:
            throw r1     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r1 = move-exception
            X.C05600Qi.A00(r5, r0)
            throw r1
        L_0x015b:
            return
        L_0x015c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x015e }
        L_0x015e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0163 }
            throw r0     // Catch:{ all -> 0x0163 }
        L_0x0163:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0165 }
        L_0x0165:
            r1 = move-exception
            X.C05600Qi.A00(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SL.A03(X.1Uw):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bb, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C28981Uw r22, long r23, long r25) {
        /*
            r21 = this;
            r16 = 100
            int r0 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0008
            r23 = 100
        L_0x0008:
            r5 = r21
            X.1SM r1 = r5.A07
            r2 = 0
            X.12P r0 = r1.A03
            X.1M0 r6 = r0.get()
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x00b5 }
            X.163 r0 = r1.A00     // Catch:{ all -> 0x00b5 }
            r4 = r22
            long r0 = r0.A08(r4)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b5 }
            r3[r2] = r0     // Catch:{ all -> 0x00b5 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r23)     // Catch:{ all -> 0x00b5 }
            r3[r1] = r0     // Catch:{ all -> 0x00b5 }
            r1 = 2
            java.lang.String r0 = java.lang.String.valueOf(r25)     // Catch:{ all -> 0x00b5 }
            r3[r1] = r0     // Catch:{ all -> 0x00b5 }
            X.14e r2 = r6.A02     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = "SELECT sort_id, timestamp  FROM message  WHERE chat_row_id = ? AND sort_id >= ?  AND sort_id <= ?  ORDER BY sort_id DESC"
            java.lang.String r0 = "GET_MESSAGE_SERVER_IDS"
            android.database.Cursor r3 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x00b5 }
            X.AnonymousClass00C.A08(r3)     // Catch:{ all -> 0x00b5 }
            r6.close()
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "sort_id"
            int r9 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "timestamp"
            int r8 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00ae }
            X.0wo r0 = r5.A00     // Catch:{ all -> 0x00ae }
            long r14 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x00ae }
            r0 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r14 = r14 - r0
            long r18 = r3.getLong(r9)     // Catch:{ all -> 0x00ae }
            long r12 = r3.getLong(r8)     // Catch:{ all -> 0x00ae }
        L_0x0068:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x00aa
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x00aa
            long r10 = r3.getLong(r9)     // Catch:{ all -> 0x00ae }
            long r6 = r3.getLong(r8)     // Catch:{ all -> 0x00ae }
            r1 = 9223372036854675807(0x7ffffffffffe795f, double:NaN)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0068
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0068
            long r18 = r18 - r10
            r1 = 1
            int r0 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x009a
            r18 = 100
            goto L_0x009a
        L_0x0096:
            r18 = r10
            r12 = r6
            goto L_0x0068
        L_0x009a:
            X.1TZ r0 = r5.A09     // Catch:{ all -> 0x00ae }
            java.lang.Long r17 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00ae }
            r15 = 0
            r20 = 1
            r13 = r0
            r14 = r4
            r16 = r15
            r13.A01(r14, r15, r16, r17, r18, r20)     // Catch:{ all -> 0x00ae }
        L_0x00aa:
            r3.close()
            return
        L_0x00ae:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x00b5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SL.A04(X.1Uw, long, long):void");
    }
}
