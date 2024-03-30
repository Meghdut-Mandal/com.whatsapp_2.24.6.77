package X;

import java.util.List;

/* renamed from: X.6sl  reason: invalid class name and case insensitive filesystem */
public final class C144756sl implements C159417jK {
    public final AnonymousClass6LT A00;
    public final AnonymousClass1CH A01;

    public C144756sl(AnonymousClass6LT r2, AnonymousClass1CH r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0142, code lost:
        r4 = -1;
        r3 = -1;
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0153, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        X.C05600Qi.A00(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0157, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015b, code lost:
        X.C05600Qi.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BV1() {
        /*
            r27 = this;
            r26 = r27
            r0 = r26
            X.6LT r9 = r0.A00
            X.0yC r1 = r9.A04
            r0 = 4960(0x1360, float:6.95E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01d8
            X.0v0 r8 = r9.A01
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r8)
            java.lang.String r7 = "calling_privacy_last_unknown_caller_stats_millis"
            long r5 = X.C36371kC.A08(r0, r7)
            X.0wo r4 = r9.A00
            long r2 = r4.A04()
            long r0 = X.AnonymousClass6LT.A06
            long r5 = r5 + r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x01d8
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r8)
            X.C36341k9.A0w(r0, r7, r2)
            long[] r8 = X.AnonymousClass6LT.A07
            r1 = 0
            X.AnonymousClass00C.A0D(r8, r1)
            r0 = 5
            r13 = 5
            X.5un[] r12 = new X.C122405un[r0]
            r7 = 0
            r23 = r8[r1]
            long r21 = r4.A04()
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x0046:
            int r7 = r7 + 1
            X.1HJ r10 = r9.A03
            r1 = 0
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r20 = r10.A08(r1, r6, r0)
            int r6 = r6 + r0
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x0145
            java.util.Iterator r1 = r20.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r1.next()
            X.72O r0 = (X.AnonymousClass72O) r0
            long r10 = r0.A02()
        L_0x006c:
            r18 = r10
        L_0x006e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r1.next()
            X.72O r0 = (X.AnonymousClass72O) r0
            long r10 = r0.A02()
            int r0 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x006e
            goto L_0x006c
        L_0x0083:
            java.util.Iterator r11 = r20.iterator()
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x015f
            java.lang.Object r0 = r11.next()
            X.72O r0 = (X.AnonymousClass72O) r0
            long r14 = r0.A02()
        L_0x0097:
            r0 = r14
        L_0x0098:
            boolean r10 = r11.hasNext()
            if (r10 == 0) goto L_0x00ad
            java.lang.Object r10 = r11.next()
            X.72O r10 = (X.AnonymousClass72O) r10
            long r14 = r10.A02()
            int r10 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r10 >= 0) goto L_0x0098
            goto L_0x0097
        L_0x00ad:
            X.5lm r11 = r9.A02
            java.util.HashSet r10 = X.C36441kJ.A16()
            X.12P r11 = r11.A00
            X.1M0 r11 = r11.get()
            X.14e r14 = r11.A02     // Catch:{ all -> 0x0158 }
            r25 = r14
            java.lang.String r17 = "SELECT call_log_row_id FROM call_unknown_caller WHERE call_log_row_id <= ? AND call_log_row_id >= ?"
            java.lang.String[] r16 = X.C36441kJ.A1S()     // Catch:{ all -> 0x0158 }
            r14 = 0
            r15 = r16
            X.C36351kA.A1V(r15, r14, r0)     // Catch:{ all -> 0x0158 }
            r15 = 1
            r14 = r16
            r0 = r18
            X.C36351kA.A1V(r14, r15, r0)     // Catch:{ all -> 0x0158 }
            java.lang.String r15 = "CallUnknownCallerStore.getUnknownCalls"
            r14 = r25
            r1 = r17
            r0 = r16
            android.database.Cursor r14 = r14.A09(r1, r15, r0)     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = "call_log_row_id"
            int r15 = r14.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0151 }
        L_0x00e3:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x0151 }
            if (r0 == 0) goto L_0x00f1
            long r0 = r14.getLong(r15)     // Catch:{ all -> 0x0151 }
            X.C36391kE.A1W(r10, r0)     // Catch:{ all -> 0x0151 }
            goto L_0x00e3
        L_0x00f1:
            r14.close()     // Catch:{ all -> 0x0158 }
            r11.close()
            java.util.Iterator r17 = r20.iterator()
        L_0x00fb:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x013e
            java.lang.Object r11 = r17.next()
            X.5Nh r11 = (X.C107265Nh) r11
        L_0x0107:
            long r0 = r11.A01
            long r15 = r21 - r23
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x011d
            X.5un r0 = new X.5un
            r0.<init>(r9, r4, r3, r2)
            r12[r5] = r0
            int r5 = r5 + 1
            if (r5 >= r13) goto L_0x016b
            r23 = r8[r5]
            goto L_0x0107
        L_0x011d:
            X.6by r0 = r11.A04
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x00fb
            int r4 = r4 + 1
            long r0 = r11.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x00fb
            int r3 = r3 + 1
            boolean r0 = r11.A0R()
            if (r0 != 0) goto L_0x00fb
            int r2 = r2 + 1
            goto L_0x00fb
        L_0x013e:
            r0 = 10
            if (r7 < r0) goto L_0x0046
            r4 = -1
            r3 = -1
            r2 = -1
        L_0x0145:
            X.5un r0 = new X.5un
            r0.<init>(r9, r4, r3, r2)
            r12[r5] = r0
            int r5 = r5 + 1
            if (r5 >= r13) goto L_0x016b
            goto L_0x0145
        L_0x0151:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0153 }
        L_0x0153:
            r0 = move-exception
            X.C05600Qi.A00(r14, r1)     // Catch:{ all -> 0x0158 }
            throw r0     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x015a }
        L_0x015a:
            r0 = move-exception
            X.C05600Qi.A00(r11, r1)
            throw r0
        L_0x015f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0165:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x016b:
            java.util.List r3 = X.AnonymousClass02R.A0C(r12)
            X.58i r2 = new X.58i
            r2.<init>()
            r1 = 0
            java.lang.Long r0 = A02(r3, r1)
            r2.A0B = r0
            java.lang.Long r0 = A00(r3, r1)
            r2.A06 = r0
            java.lang.Long r0 = A01(r3, r1)
            r2.A01 = r0
            r1 = 1
            java.lang.Long r0 = A02(r3, r1)
            r2.A0D = r0
            java.lang.Long r0 = A00(r3, r1)
            r2.A08 = r0
            java.lang.Long r0 = A01(r3, r1)
            r2.A03 = r0
            r1 = 2
            java.lang.Long r0 = A02(r3, r1)
            r2.A0E = r0
            java.lang.Long r0 = A00(r3, r1)
            r2.A09 = r0
            java.lang.Long r0 = A01(r3, r1)
            r2.A04 = r0
            r1 = 3
            java.lang.Long r0 = A02(r3, r1)
            r2.A0A = r0
            java.lang.Long r0 = A00(r3, r1)
            r2.A05 = r0
            java.lang.Long r0 = A01(r3, r1)
            r2.A00 = r0
            r1 = 4
            java.lang.Long r0 = A02(r3, r1)
            r2.A0C = r0
            java.lang.Long r0 = A00(r3, r1)
            r2.A07 = r0
            java.lang.Long r0 = A01(r3, r1)
            r2.A02 = r0
            X.0yW r0 = r9.A05
            r0.Bly(r2)
        L_0x01d8:
            r0 = r26
            X.1CH r7 = r0.A01
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.Set r6 = r7.A0B
            monitor-enter(r6)
            X.AnonymousClass1CH.A00(r7)     // Catch:{ all -> 0x0270 }
            java.util.Iterator r5 = X.C90474aD.A0r(r6)     // Catch:{ all -> 0x0270 }
            r4 = 0
            r3 = 0
        L_0x01ec:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0270 }
            if (r0 == 0) goto L_0x0218
            java.lang.String r2 = X.AnonymousClass001.A0C(r5)     // Catch:{ all -> 0x0270 }
            java.util.Set r0 = r7.A0A     // Catch:{ all -> 0x0270 }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x0270 }
            if (r0 != 0) goto L_0x01ec
            X.3Sl r0 = X.AnonymousClass147.A01     // Catch:{ all -> 0x0270 }
            X.147 r1 = r0.A06(r2)     // Catch:{ all -> 0x0270 }
            if (r1 == 0) goto L_0x0210
            boolean r0 = r7.A03(r1)     // Catch:{ all -> 0x0270 }
            if (r0 == 0) goto L_0x0210
            r8.add(r1)     // Catch:{ all -> 0x0270 }
            goto L_0x01ec
        L_0x0210:
            boolean r0 = r6.remove(r2)     // Catch:{ all -> 0x0270 }
            if (r0 == 0) goto L_0x01ec
            r3 = 1
            goto L_0x01ec
        L_0x0218:
            if (r3 == 0) goto L_0x021d
            X.AnonymousClass1CH.A01(r7)     // Catch:{ all -> 0x0270 }
        L_0x021d:
            monitor-exit(r6)     // Catch:{ all -> 0x0270 }
            int r1 = r8.size()
            r0 = 32
            if (r1 <= r0) goto L_0x022d
            java.util.Collections.shuffle(r8)
            java.util.List r8 = r8.subList(r4, r0)
        L_0x022d:
            java.util.Iterator r8 = r8.iterator()
        L_0x0231:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x026f
            java.lang.Object r6 = r8.next()
            X.147 r6 = (X.AnonymousClass147) r6
            X.17b r0 = r7.A06
            int r0 = r0.A01(r6)
            boolean r5 = X.AnonymousClass000.A1P(r0)
            X.0yC r1 = r7.A05
            r0 = 7053(0x1b8d, float:9.883E-42)
            boolean r0 = r1.A0E(r0)
            r4 = 3
            if (r0 == 0) goto L_0x0267
            if (r5 != 0) goto L_0x0267
            X.0xg r3 = r7.A07
            java.lang.String r2 = "ack_group_mismatch"
            X.17X r0 = r7.A04
            java.lang.String r1 = r0.A04(r6, r5)
            X.3S5 r0 = new X.3S5
            r0.<init>(r2, r4, r1)
            r3.A09(r0, r6)
            goto L_0x0231
        L_0x0267:
            X.0xg r1 = r7.A07
            java.lang.String r0 = "ack_group_mismatch"
            r1.A0E(r6, r0, r4)
            goto L_0x0231
        L_0x026f:
            return
        L_0x0270:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0270 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144756sl.BV1():void");
    }

    public static Long A00(List list, int i) {
        return Long.valueOf((long) ((C122405un) list.get(i)).A01);
    }

    public static Long A01(List list, int i) {
        return Long.valueOf((long) ((C122405un) list.get(i)).A00);
    }

    public static Long A02(List list, int i) {
        return Long.valueOf((long) ((C122405un) list.get(i)).A02);
    }
}
