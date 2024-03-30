package X;

/* renamed from: X.1j8  reason: invalid class name and case insensitive filesystem */
public class C35711j8 implements Runnable {
    public Object A00;
    public final int A01;

    public C35711j8(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: type inference failed for: r5v44, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02aa, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0441, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0445, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0448, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x044c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0501, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x059b, code lost:
        if (((android.content.SharedPreferences) r9.get()).getInt("account_sync_blocklist_num_retries", 0) > 0) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0a86, code lost:
        if (r0.longValue() <= 0) goto L_0x0a88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0ccb, code lost:
        r4.A03(new X.C35711j8(r5, r1), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0cd3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x022a, code lost:
        if (r0.A03(r7) == false) goto L_0x022c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r35 = this;
            r1 = r35
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0c83;
                case 1: goto L_0x0c2c;
                case 2: goto L_0x0c12;
                case 3: goto L_0x000e;
                case 4: goto L_0x02ae;
                case 5: goto L_0x0c0a;
                case 6: goto L_0x0c02;
                case 7: goto L_0x0bee;
                case 8: goto L_0x0291;
                case 9: goto L_0x0246;
                case 10: goto L_0x01f3;
                case 11: goto L_0x0bee;
                case 12: goto L_0x01c6;
                case 13: goto L_0x01b0;
                case 14: goto L_0x000f;
                case 15: goto L_0x0bda;
                case 16: goto L_0x0bd2;
                case 17: goto L_0x0baf;
                case 18: goto L_0x0ba7;
                case 19: goto L_0x083b;
                case 20: goto L_0x05db;
                case 21: goto L_0x05cb;
                case 22: goto L_0x0129;
                case 23: goto L_0x05c3;
                case 24: goto L_0x05b6;
                case 25: goto L_0x05a8;
                case 26: goto L_0x00b6;
                case 27: goto L_0x04d3;
                case 28: goto L_0x0092;
                case 29: goto L_0x04c2;
                case 30: goto L_0x04ba;
                case 31: goto L_0x04b2;
                case 32: goto L_0x048b;
                case 33: goto L_0x0007;
                case 34: goto L_0x0007;
                case 35: goto L_0x03b5;
                case 36: goto L_0x039e;
                case 37: goto L_0x038e;
                case 38: goto L_0x0067;
                case 39: goto L_0x0386;
                case 40: goto L_0x0316;
                case 41: goto L_0x0304;
                case 42: goto L_0x02fc;
                case 43: goto L_0x02f4;
                case 44: goto L_0x003c;
                case 45: goto L_0x02e8;
                case 46: goto L_0x02e0;
                case 47: goto L_0x0020;
                case 48: goto L_0x02d1;
                case 49: goto L_0x02c2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.19B r0 = (X.AnonymousClass19B) r0
            r0.A07()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r1 = r1.A00
            X.1MN r1 = (X.AnonymousClass1MN) r1
            android.os.Handler r0 = r1.A07
            X.C18740tg.A02(r0)
            X.1cZ r1 = r1.A03
            if (r1 != 0) goto L_0x0be2
            java.lang.String r0 = "ClientPingManager/handlePingRequestTimeout: connection thread is not ready"
            goto L_0x02aa
        L_0x0020:
            java.lang.Object r1 = r1.A00
            X.1Z2 r1 = (X.AnonymousClass1Z2) r1
            X.0wQ r2 = r1.A00
            X.13w r0 = r2.A08()
            if (r0 == 0) goto L_0x000e
            X.1Z0 r1 = r1.A02
            X.13w r0 = r2.A08()
            if (r0 == 0) goto L_0x0ce3
            java.lang.String r0 = r0.getRawString()
            r1.A07(r0)
            return
        L_0x003c:
            java.lang.Object r4 = r1.A00
            X.1YM r4 = (X.AnonymousClass1YM) r4
            X.1EV r0 = r4.A01
            X.0yC r2 = r0.A02
            r1 = 1458(0x5b2, float:2.043E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x000e
            X.0wG r0 = r4.A00
            android.content.Context r1 = r0.A00
            r0 = 2131891701(0x7f1215f5, float:1.941813E38)
            java.lang.String r3 = r1.getString(r0)
            r0 = 2131891700(0x7f1215f4, float:1.9418127E38)
            java.lang.String r2 = r1.getString(r0)
            r1 = 0
            java.lang.String r0 = "ALIAS_DEREGISTER"
            X.AnonymousClass1YM.A02(r4, r3, r2, r0, r1)
            return
        L_0x0067:
            java.lang.Object r8 = r1.A00
            X.1Wp r8 = (X.C29431Wp) r8
            java.util.Map r7 = r8.A02
            int r0 = r7.size()
            if (r0 == 0) goto L_0x000e
            java.util.Collection r0 = r7.values()
            java.util.Iterator r6 = r0.iterator()
            r4 = 0
        L_0x007d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0ceb
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r0 = 1
            long r2 = r2 - r0
            long r4 = r4 + r2
            goto L_0x007d
        L_0x0092:
            java.lang.Object r1 = r1.A00
            X.1WP r1 = (X.AnonymousClass1WP) r1
            X.12P r0 = r1.A0P
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x000e
            X.1XX r3 = r1.A0A
            X.2iL r1 = r3.A00
            if (r1 == 0) goto L_0x00a6
            r0 = 1
            r1.A0D(r0)
        L_0x00a6:
            X.2iL r2 = new X.2iL
            r2.<init>(r3)
            r3.A00 = r2
            X.0wU r1 = r3.A0B
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Box(r2, r0)
            return
        L_0x00b6:
            java.lang.Object r7 = r1.A00
            X.1WP r7 = (X.AnonymousClass1WP) r7
            X.0wQ r0 = r7.A06
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.user
            java.lang.String r6 = X.C55212uG.A00(r0)
            X.0yC r2 = r7.A0T
            r1 = 693(0x2b5, float:9.71E-43)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x00fa
            X.0v0 r0 = r7.A0L
            X.005 r0 = r0.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "pref_deprecate_rc"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x000e
            X.1C4 r1 = r7.A0b
            byte[] r2 = X.C18750th.A0G()
            r0 = 0
        L_0x00f0:
            X.19A r1 = r1.A02
            android.os.Message r0 = X.C203429o0.A04(r6, r2, r0)
            r1.A0J(r0)
            return
        L_0x00fa:
            X.0wG r0 = r7.A0K
            android.content.Context r5 = r0.A00
            java.lang.Boolean r0 = X.C18750th.A03
            java.io.File r2 = r5.getFilesDir()
            java.lang.String r0 = "rc2"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0121
            long r3 = r1.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0121
            byte[] r0 = X.C18750th.A0I(r5, r6)
            if (r0 != 0) goto L_0x000e
        L_0x0121:
            X.1C4 r1 = r7.A0b
            byte[] r2 = X.C18750th.A0G()
            r0 = 1
            goto L_0x00f0
        L_0x0129:
            java.lang.Object r4 = r1.A00
            X.1OG r4 = (X.AnonymousClass1OG) r4
            boolean r0 = X.AnonymousClass1OG.A02(r4)
            if (r0 == 0) goto L_0x000e
            X.0wo r0 = r4.A02
            long r12 = X.C19970wo.A00(r0)
            X.0v0 r0 = r4.A03
            X.005 r9 = r0.A00
            java.lang.Object r2 = r9.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "adv_key_index_list_require_update"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x01a8
            X.19v r0 = r4.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0158
            X.AnonymousClass1OG.A00(r4)
            return
        L_0x0158:
            java.lang.Object r3 = r9.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "adv_key_index_list_last_failure_time"
            r0 = 0
            long r10 = r3.getLong(r2, r0)
            java.lang.Object r2 = r9.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "adv_key_index_list_update_retry_count"
            r0 = 0
            int r3 = r2.getInt(r1, r0)
            long[] r1 = X.AnonymousClass1OG.A0A
            r0 = 3
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r3 > r0) goto L_0x01ac
            if (r3 <= 0) goto L_0x01ac
            int r0 = r3 + -1
            r5 = r1[r0]
        L_0x0181:
            long r1 = r12 - r10
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x000e
            if (r3 > 0) goto L_0x01a8
            java.lang.Object r3 = r9.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "adv_key_index_list_last_update_time"
            r0 = 0
            long r0 = r3.getLong(r2, r0)
            long r12 = r12 - r0
            X.0yC r2 = r4.A05
            r1 = 477(0x1dd, float:6.68E-43)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r2, r1)
            long r1 = (long) r0
            long r1 = r1 * r7
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
        L_0x01a8:
            r4.A04()
            return
        L_0x01ac:
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x0181
        L_0x01b0:
            java.lang.Object r2 = r1.A00
            X.1JF r2 = (X.AnonymousClass1JF) r2
        L_0x01b4:
            java.lang.ref.ReferenceQueue r0 = r2.A03
            java.lang.ref.Reference r0 = r0.poll()
            X.78n r0 = (X.C1511778n) r0
            if (r0 == 0) goto L_0x000e
            java.util.concurrent.ConcurrentHashMap r1 = r2.A04
            java.lang.String r0 = r0.A01
            r1.remove(r0)
            goto L_0x01b4
        L_0x01c6:
            java.lang.Object r5 = r1.A00
            X.1JF r5 = (X.AnonymousClass1JF) r5
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x000e
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            r0 = 100
            android.os.SystemClock.sleep(r0)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.runFinalization()
        L_0x01e1:
            java.lang.ref.ReferenceQueue r0 = r5.A03
            java.lang.ref.Reference r0 = r0.poll()
            X.78n r0 = (X.C1511778n) r0
            if (r0 == 0) goto L_0x0d01
            java.util.concurrent.ConcurrentHashMap r1 = r5.A04
            java.lang.String r0 = r0.A01
            r1.remove(r0)
            goto L_0x01e1
        L_0x01f3:
            java.lang.Object r2 = r1.A00
            X.1Ye r2 = (X.C29841Ye) r2
            java.util.ArrayList r0 = r2.A0A
            monitor-enter(r0)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0d79 }
            r3.<init>(r0)     // Catch:{ all -> 0x0d79 }
            r0.clear()     // Catch:{ all -> 0x0d79 }
            monitor-exit(r0)     // Catch:{ all -> 0x0d79 }
            X.0wD r1 = r2.A02
            r0 = 0
            int r1 = r1.A03(r0)
            java.util.Iterator r4 = r3.iterator()
        L_0x020e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r3 = r4.next()
            X.39G r3 = (X.AnonymousClass39G) r3
            int r8 = r3.A00
            r0 = 1
            if (r8 == r0) goto L_0x0222
            r0 = 3
            if (r8 != r0) goto L_0x022c
        L_0x0222:
            X.1GO r0 = r2.A05
            X.2bU r7 = r3.A03
            boolean r0 = r0.A03(r7)
            if (r0 != 0) goto L_0x0239
        L_0x022c:
            r0 = 2
            if (r8 != r0) goto L_0x020e
            X.1GO r0 = r2.A05
            X.2bU r7 = r3.A03
            boolean r0 = r0.A04(r7, r1)
            if (r0 == 0) goto L_0x020e
        L_0x0239:
            X.1ST r5 = r2.A06
            X.7kT r6 = r3.A02
            long r9 = r3.A01
            boolean r11 = r3.A04
            r12 = 1
            r5.A0D(r6, r7, r8, r9, r11, r12)
            goto L_0x020e
        L_0x0246:
            java.lang.Object r5 = r1.A00
            X.1Ye r5 = (X.C29841Ye) r5
            X.0wD r1 = r5.A02
            r0 = 1
            int r0 = r1.A03(r0)
            X.1ST r4 = r5.A06
            r2 = 2
            X.3IU r3 = new X.3IU
            r3.<init>(r5, r0, r2)
            X.1TQ r0 = r4.A0H
            r0.A06(r3)
            X.1GQ r1 = r4.A0K
            r0 = 3877(0xf25, float:5.433E-42)
            boolean r0 = X.AnonymousClass1GQ.A01(r1, r0)
            if (r0 == 0) goto L_0x000e
            r0 = 3
            boolean r0 = X.AnonymousClass1GQ.A00(r1, r0)
            if (r0 != 0) goto L_0x0275
            boolean r0 = X.AnonymousClass1GQ.A00(r1, r2)
            if (r0 == 0) goto L_0x000e
        L_0x0275:
            X.1TR r0 = r4.A0I
            java.util.HashSet r0 = r0.A05()
            java.util.Iterator r2 = r0.iterator()
        L_0x027f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x027f
            r3.accept(r1)
            goto L_0x027f
        L_0x0291:
            java.lang.Object r0 = r1.A00
            X.1Ye r0 = (X.C29841Ye) r0
            boolean r2 = r0.A00
            if (r2 == 0) goto L_0x000e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "mediaautodownload/timeout getting offline complete marker "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
        L_0x02aa:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x02ae:
            java.lang.Object r1 = r1.A00
            X.1ZY r1 = (X.AnonymousClass1ZY) r1
            X.1YR r0 = r1.A00
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x000e
            X.1VD r1 = r1.A02
            X.6vJ r0 = X.C146256vJ.A00
            X.AnonymousClass1VD.A00(r0, r1)
            return
        L_0x02c2:
            java.lang.Object r1 = r1.A00
            X.1XB r1 = (X.AnonymousClass1XB) r1
            X.0wD r0 = r1.A04
            r0.unregisterObserver(r1)
            X.19J r0 = r1.A03
            r0.unregisterObserver(r1)
            return
        L_0x02d1:
            java.lang.Object r1 = r1.A00
            X.1XB r1 = (X.AnonymousClass1XB) r1
            X.0wD r0 = r1.A04
            r0.registerObserver(r1)
            X.19J r0 = r1.A03
            r0.registerObserver(r1)
            return
        L_0x02e0:
            java.lang.Object r0 = r1.A00
            X.1YK r0 = (X.AnonymousClass1YK) r0
            X.AnonymousClass1YK.A00(r0)
            return
        L_0x02e8:
            java.lang.Object r1 = r1.A00
            X.1YM r1 = (X.AnonymousClass1YM) r1
            r0 = 0
            X.AnonymousClass1YM.A01(r1, r0)
            X.AnonymousClass1YM.A00(r1)
            return
        L_0x02f4:
            java.lang.Object r0 = r1.A00
            X.1YM r0 = (X.AnonymousClass1YM) r0
            X.AnonymousClass1YM.A00(r0)
            return
        L_0x02fc:
            java.lang.Object r0 = r1.A00
            X.1Fo r0 = (X.C25251Fo) r0
            r0.A02()
            return
        L_0x0304:
            java.lang.Object r1 = r1.A00
            X.1T9 r1 = (X.AnonymousClass1T9) r1
            monitor-enter(r1)
            boolean r0 = r1.A02     // Catch:{ all -> 0x0313 }
            if (r0 != 0) goto L_0x0311
            r0 = 0
            r1.A00(r0)     // Catch:{ all -> 0x0313 }
        L_0x0311:
            monitor-exit(r1)
            return
        L_0x0313:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0316:
            java.lang.Object r2 = r1.A00
            X.1a6 r2 = (X.C30371a6) r2
            monitor-enter(r2)
            X.0v0 r4 = r2.A06     // Catch:{ all -> 0x0383 }
            X.005 r0 = r4.A00     // Catch:{ all -> 0x0383 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0383 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0383 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0383 }
            r0.<init>()     // Catch:{ all -> 0x0383 }
            java.lang.String r3 = "pending_side_list_hash"
            java.util.Set r1 = r1.getStringSet(r3, r0)     // Catch:{ all -> 0x0383 }
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x0383 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x0383 }
            r1.size()     // Catch:{ all -> 0x0383 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0383 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0381
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0383 }
            r13.<init>()     // Catch:{ all -> 0x0383 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x0383 }
        L_0x034a:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x035f
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0383 }
            X.9iW r0 = new X.9iW     // Catch:{ all -> 0x0383 }
            r0.<init>(r1)     // Catch:{ all -> 0x0383 }
            r13.add(r0)     // Catch:{ all -> 0x0383 }
            goto L_0x034a
        L_0x035f:
            X.0wN r6 = r2.A00     // Catch:{ all -> 0x0383 }
            X.0wQ r7 = r2.A01     // Catch:{ all -> 0x0383 }
            X.16D r8 = r2.A03     // Catch:{ all -> 0x0383 }
            X.1Nr r9 = r2.A04     // Catch:{ all -> 0x0383 }
            X.17i r10 = r2.A08     // Catch:{ all -> 0x0383 }
            X.1OD r11 = r2.A07     // Catch:{ all -> 0x0383 }
            X.1O5 r12 = r2.A05     // Catch:{ all -> 0x0383 }
            r14 = 0
            X.1ik r5 = new X.1ik     // Catch:{ all -> 0x0383 }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0383 }
            r5.run()     // Catch:{ all -> 0x0383 }
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r4)     // Catch:{ all -> 0x0383 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)     // Catch:{ all -> 0x0383 }
            r0.apply()     // Catch:{ all -> 0x0383 }
        L_0x0381:
            monitor-exit(r2)
            return
        L_0x0383:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0386:
            java.lang.Object r0 = r1.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            r0.invoke()
            return
        L_0x038e:
            java.lang.Object r1 = r1.A00
            X.1aA r1 = (X.C30411aA) r1
            X.0xL r0 = r1.A00
            r0.A03()
            X.0v0 r1 = r1.A02
            r0 = 0
            r1.A24(r0)
            return
        L_0x039e:
            java.lang.Object r2 = r1.A00
            X.19B r2 = (X.AnonymousClass19B) r2
            r2.A07()
            X.00T r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            X.AnonymousClass19B.A02(r2, r0)
            return
        L_0x03b5:
            java.lang.Object r4 = r1.A00
            X.19B r4 = (X.AnonymousClass19B) r4
            X.19C r6 = r4.A01
            java.lang.String r0 = "PreacksStore/loadAll"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.AnonymousClass19C.A00(r6)     // Catch:{ Exception -> 0x044d }
            if (r0 == 0) goto L_0x03ca
            X.09w r5 = X.C023409w.A00     // Catch:{ Exception -> 0x044d }
            goto L_0x045e
        L_0x03ca:
            X.005 r0 = r6.A04     // Catch:{ Exception -> 0x044d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x044d }
            X.18M r0 = (X.AnonymousClass18M) r0     // Catch:{ Exception -> 0x044d }
            X.1M0 r7 = r0.get()     // Catch:{ Exception -> 0x044d }
            X.14e r3 = r7.A02     // Catch:{ all -> 0x0446 }
            java.lang.String r2 = "\n      SELECT _id, ptn \n      FROM preacks\n      ORDER BY _id\n    "
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0446 }
            java.lang.String r0 = "PreacksStore/LOAD_ALL"
            android.database.Cursor r9 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0446 }
            X.AnonymousClass00C.A08(r9)     // Catch:{ all -> 0x0446 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x043f }
            r5.<init>()     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "_id"
            int r11 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "ptn"
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x043f }
        L_0x03f7:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x0438
            byte[] r12 = r9.getBlob(r10)     // Catch:{ all -> 0x043f }
            r8 = 0
            X.0yC r3 = r6.A02     // Catch:{ all -> 0x0416 }
            X.19D r2 = r6.A03     // Catch:{ all -> 0x0416 }
            r0 = 0
            X.1Va r1 = new X.1Va     // Catch:{ all -> 0x0416 }
            r1.<init>(r0, r3, r2, r0)     // Catch:{ all -> 0x0416 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0416 }
            r0.<init>(r12)     // Catch:{ all -> 0x0416 }
            X.9nx r1 = X.C29021Va.A01(r1, r0)     // Catch:{ all -> 0x0416 }
            goto L_0x041c
        L_0x0416:
            r0 = move-exception
            X.03N r1 = new X.03N     // Catch:{ all -> 0x043f }
            r1.<init>(r0)     // Catch:{ all -> 0x043f }
        L_0x041c:
            boolean r0 = r1 instanceof X.AnonymousClass03N     // Catch:{ all -> 0x043f }
            if (r0 != 0) goto L_0x0421
            r8 = r1
        L_0x0421:
            X.9nx r8 = (X.C203399nx) r8     // Catch:{ all -> 0x043f }
            if (r8 == 0) goto L_0x03f7
            long r0 = r9.getLong(r11)     // Catch:{ all -> 0x043f }
            r2 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x043f }
            X.9WB r0 = new X.9WB     // Catch:{ all -> 0x043f }
            r0.<init>(r8, r1, r2)     // Catch:{ all -> 0x043f }
            r5.add(r0)     // Catch:{ all -> 0x043f }
            goto L_0x03f7
        L_0x0438:
            r9.close()     // Catch:{ all -> 0x0446 }
            r7.close()     // Catch:{ Exception -> 0x044d }
            goto L_0x045e
        L_0x043f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0441 }
        L_0x0441:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ all -> 0x0446 }
            throw r0     // Catch:{ all -> 0x0446 }
        L_0x0446:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0448 }
        L_0x0448:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ Exception -> 0x044d }
            throw r0     // Catch:{ Exception -> 0x044d }
        L_0x044d:
            r3 = move-exception
            java.lang.String r0 = "PreacksStore/loadAll/failed_to_load_pre_acks"
            X.C18740tg.A08(r0, r3)
            X.0wN r2 = r6.A00
            java.lang.String r1 = "failed_to_load_pre_acks"
            java.lang.String r0 = "exception"
            r2.A0D(r1, r0, r3)
            X.09w r5 = X.C023409w.A00
        L_0x045e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PreacksQueue/loadDataFromDb loaded "
            r1.append(r0)
            int r0 = r5.size()
            r1.append(r0)
            java.lang.String r0 = " pre-acks"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r4)
            X.02g r0 = r4.A07     // Catch:{ all -> 0x0488 }
            r0.addAll(r5)     // Catch:{ all -> 0x0488 }
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r0 = r4.A02
            r0.countDown()
            return
        L_0x0488:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x048b:
            java.lang.Object r4 = r1.A00
            X.1MQ r4 = (X.AnonymousClass1MQ) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.19B r0 = r4.A01
            X.9WB r1 = r0.A04()
            if (r1 != 0) goto L_0x049f
            r4.A00()
            return
        L_0x049f:
            java.lang.String r0 = "PreacksPingManager/sendPingAndClearPreacks/sending ping to clear preacks"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1MN r3 = r4.A00
            r0 = 1
            X.BAc r2 = new X.BAc
            r2.<init>(r1, r4, r0)
            r0 = 32000(0x7d00, double:1.581E-319)
            r3.A0A(r2, r0)
            return
        L_0x04b2:
            java.lang.Object r0 = r1.A00
            X.196 r0 = (X.AnonymousClass196) r0
            r0.A0H()
            return
        L_0x04ba:
            java.lang.Object r0 = r1.A00
            X.1Mi r0 = (X.C27001Mi) r0
            r0.A01()
            return
        L_0x04c2:
            java.lang.Object r0 = r1.A00
            X.1WP r0 = (X.AnonymousClass1WP) r0
            X.0xM r1 = r0.A0O
            r0 = 0
            r1.A0b(r0, r0)
            r1.A0W()
            r1.A0X()
            return
        L_0x04d3:
            java.lang.Object r4 = r1.A00
            X.1WP r4 = (X.AnonymousClass1WP) r4
            X.12P r0 = r4.A0P
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0536
            X.0wG r0 = r4.A0K
            android.content.Context r3 = r0.A00
            java.io.File r2 = r3.getFilesDir()
            java.lang.String r1 = "key"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0503
            r1 = 0
            X.62c r0 = X.AnonymousClass6YO.A04(r3)     // Catch:{ 0tz | InvalidParameterException -> 0x04fd }
            if (r0 == 0) goto L_0x04fd
            X.63x r0 = r0.A00     // Catch:{ 0tz | InvalidParameterException -> 0x04fd }
            java.lang.String r1 = r0.A00     // Catch:{ 0tz | InvalidParameterException -> 0x04fd }
        L_0x04fd:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0536
        L_0x0503:
            X.0wQ r0 = r4.A06
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0536
            r1 = 16
            byte[] r6 = X.C18750th.A0H(r1)
            byte[] r5 = X.AnonymousClass6YO.A0G(r6)
            if (r5 == 0) goto L_0x0536
            X.0wN r3 = r4.A03
            X.AnonymousClass6YO.A0C(r3, r5)
            int r0 = r6.length
            if (r0 == r1) goto L_0x0529
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1 = 1
            java.lang.String r0 = "crypto-iq-incorrect-account-salt-size"
            r3.A0E(r0, r2, r1)
        L_0x0529:
            X.1Ca r2 = r4.A0C
            r1 = 1
            r0 = 0
            r2.A01(r0, r5, r6, r1)
            java.util.Arrays.toString(r6)
            java.util.Arrays.toString(r5)
        L_0x0536:
            X.0x1 r7 = r4.A0h
            X.9SZ r8 = new X.9SZ
            r8.<init>()
            r6 = 1
            r8.A00 = r6
            X.0v0 r0 = r4.A0L
            X.005 r9 = r0.A00
            java.lang.Object r1 = r9.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "account_sync_status_num_retries"
            r2 = 0
            int r1 = r1.getInt(r0, r2)
            r5 = 0
            r0 = 0
            if (r1 <= 0) goto L_0x0556
            r0 = 1
        L_0x0556:
            r8.A06 = r0
            java.lang.Object r1 = r9.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "account_sync_picture_num_retries"
            int r1 = r1.getInt(r0, r2)
            r0 = 0
            if (r1 <= 0) goto L_0x0568
            r0 = 1
        L_0x0568:
            r8.A04 = r0
            java.lang.Object r1 = r9.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "account_sync_privacy_num_retries"
            int r1 = r1.getInt(r0, r2)
            r0 = 0
            if (r1 <= 0) goto L_0x057a
            r0 = 1
        L_0x057a:
            r8.A05 = r0
            java.lang.Object r1 = r9.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "block_list_receive_time"
            r3 = 0
            long r1 = r1.getLong(r0, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x059d
            java.lang.Object r1 = r9.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "account_sync_blocklist_num_retries"
            int r1 = r1.getInt(r0, r5)
            r0 = 0
            if (r1 <= 0) goto L_0x059e
        L_0x059d:
            r0 = 1
        L_0x059e:
            r8.A01 = r0
            X.9Nx r0 = r8.A00()
            r7.A01(r0, r5, r6, r6)
            return
        L_0x05a8:
            java.lang.Object r0 = r1.A00
            X.1WP r0 = (X.AnonymousClass1WP) r0
            X.17Y r2 = r0.A04
            r1 = 2131890854(0x7f1212a6, float:1.9416412E38)
            r0 = 0
            r2.A05(r0, r1)
            return
        L_0x05b6:
            java.lang.Object r0 = r1.A00
            X.1WP r0 = (X.AnonymousClass1WP) r0
            X.1Ih r3 = r0.A0E
            r2 = 0
            r1 = 0
            r0 = 1
            r3.A01(r1, r2, r0)
            return
        L_0x05c3:
            java.lang.Object r0 = r1.A00
            X.189 r0 = (X.AnonymousClass189) r0
            r0.A0M()
            return
        L_0x05cb:
            java.lang.Object r0 = r1.A00
            X.1E9 r0 = (X.AnonymousClass1E9) r0
            r3 = 0
            X.0wU r2 = r0.A09
            java.lang.Runnable r1 = r0.A0A
            java.lang.String r0 = "ToSGatingRepository/requestRefresh"
            r2.BpM(r1, r0, r3)
            return
        L_0x05db:
            java.lang.Object r2 = r1.A00
            X.1WP r2 = (X.AnonymousClass1WP) r2
            X.12P r0 = r2.A0P
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0828
            X.1Ed r1 = r2.A0Q
            X.1VY r0 = r2.A0g
            X.12P r6 = r1.A03
            r6.A06()
            boolean r3 = r6.A08
            if (r3 != 0) goto L_0x063b
            X.1Dc r1 = r1.A04
            java.lang.String r0 = "processFutureTransactions: msg store not ready"
            r1.A05(r0)
        L_0x05fc:
            X.0v0 r6 = r2.A0L
            X.005 r0 = r6.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r5 = "verification_level_consolidation_notification"
            r0 = 0
            boolean r0 = r1.getBoolean(r5, r0)
            if (r0 != 0) goto L_0x0828
            X.1A6 r0 = r2.A0G
            java.util.ArrayList r0 = r0.A0A()
            java.util.Iterator r4 = r0.iterator()
        L_0x0619:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x081c
            java.lang.Object r3 = r4.next()
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.185 r0 = r2.A0F
            X.3L0 r0 = r0.A02(r3)
            if (r0 == 0) goto L_0x0619
            X.0xM r1 = r2.A0O
            X.3TT r0 = X.AnonymousClass3TT.A00(r0)
            X.3H2 r0 = r0.A02()
            r1.A0c(r3, r0)
            goto L_0x0619
        L_0x063b:
            r3 = 1
            java.lang.String[] r5 = new java.lang.String[r3]
            r3 = 5
            java.lang.String r4 = java.lang.Integer.toString(r3)
            r3 = 0
            r5[r3] = r4
            X.1M0 r11 = r6.get()
            X.14e r12 = r11.A02     // Catch:{ all -> 0x0812 }
            java.lang.String r13 = "pay_transaction"
            java.lang.String[] r14 = X.C24881Ed.A0A     // Catch:{ all -> 0x0812 }
            java.lang.String r15 = "( type=? )"
            r10 = 0
            java.lang.String r18 = "init_timestamp DESC"
            java.lang.String r20 = "processFutureTransactions/QUERY_PAY_TRANSACTION"
            r19 = r10
            r17 = r10
            r16 = r5
            android.database.Cursor r9 = r12.A0A(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0812 }
            if (r9 == 0) goto L_0x0803
            r8 = 0
        L_0x0664:
            boolean r4 = r9.moveToNext()     // Catch:{ all -> 0x0808 }
            if (r4 == 0) goto L_0x07e2
            X.9lY r12 = X.C24881Ed.A09(r9, r1)     // Catch:{ 0wR -> 0x07d8 }
            boolean r4 = r12.A0M()     // Catch:{ 0wR -> 0x07d8 }
            r29 = 0
            if (r4 == 0) goto L_0x07d4
            byte[] r6 = r12.A0R     // Catch:{ 0wR -> 0x07d8 }
            if (r6 == 0) goto L_0x07d4
            X.1Va r5 = r0.A07     // Catch:{ 19b | IOException -> 0x07bc }
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ 19b | IOException -> 0x07bc }
            r4.<init>(r6)     // Catch:{ 19b | IOException -> 0x07bc }
            X.9nx r7 = X.C29021Va.A01(r5, r4)     // Catch:{ 19b | IOException -> 0x07bc }
            if (r7 == 0) goto L_0x07d4
            java.lang.String r5 = r7.A00     // Catch:{ 0wR -> 0x07d8 }
            java.lang.String r4 = "pay"
            boolean r4 = r5.equals(r4)     // Catch:{ 0wR -> 0x07d8 }
            if (r4 == 0) goto L_0x0765
            X.11F r13 = r12.A0C     // Catch:{ 0wR -> 0x07d8 }
            boolean r5 = r12.A0Q     // Catch:{ 0wR -> 0x07d8 }
            java.lang.String r4 = r12.A0L     // Catch:{ 0wR -> 0x07d8 }
            X.3Qa r6 = new X.3Qa     // Catch:{ 0wR -> 0x07d8 }
            r6.<init>(r13, r4, r5)     // Catch:{ 0wR -> 0x07d8 }
            X.11F r4 = r6.A00     // Catch:{ 0wR -> 0x07d8 }
            if (r4 == 0) goto L_0x07d4
            java.lang.String r4 = r6.A01     // Catch:{ 0wR -> 0x07d8 }
            if (r4 == 0) goto L_0x07d4
            X.1VZ r4 = r0.A02     // Catch:{ 0wR -> 0x07d8 }
            X.1A1 r4 = r4.A00     // Catch:{ 0wR -> 0x07d8 }
            X.3T1 r4 = r4.A03(r6)     // Catch:{ 0wR -> 0x07d8 }
            if (r4 == 0) goto L_0x07d4
            java.lang.String r5 = "type"
            java.lang.String r12 = r7.A0i(r5, r10)     // Catch:{ 0wR -> 0x07d8 }
            X.11F r17 = r4.A0J()     // Catch:{ 0wR -> 0x07d8 }
            if (r12 == 0) goto L_0x0756
            java.lang.String r5 = "request"
            boolean r5 = r12.equals(r5)     // Catch:{ 0wR -> 0x07d8 }
            if (r5 == 0) goto L_0x0756
            X.9lY r13 = r4.A0M     // Catch:{ 0wR -> 0x07d8 }
            if (r13 == 0) goto L_0x07d4
            X.3Qa r5 = r4.A1J     // Catch:{ 0wR -> 0x07d8 }
            X.11F r5 = r5.A00     // Catch:{ 0wR -> 0x07d8 }
            r32 = r5
            boolean r5 = X.AnonymousClass143.A0G(r32)     // Catch:{ 0wR -> 0x07d8 }
            if (r5 == 0) goto L_0x06dc
            X.0wQ r12 = r0.A00     // Catch:{ 0wR -> 0x07d8 }
            com.whatsapp.jid.UserJid r5 = r13.A0E     // Catch:{ 0wR -> 0x07d8 }
            boolean r5 = r12.A0M(r5)     // Catch:{ 0wR -> 0x07d8 }
            if (r5 == 0) goto L_0x07d4
        L_0x06dc:
            X.9lY r5 = r4.A0M     // Catch:{ 0wR -> 0x07d8 }
            java.lang.String r13 = r5.A0G     // Catch:{ 0wR -> 0x07d8 }
            java.lang.String r12 = r5.A0I     // Catch:{ 0wR -> 0x07d8 }
            X.1EU r5 = r0.A06     // Catch:{ 0wR -> 0x07d8 }
            X.9e3 r5 = r5.A03(r13)     // Catch:{ 0wR -> 0x07d8 }
            if (r5 == 0) goto L_0x0753
            X.B66 r16 = r5.A01(r12)     // Catch:{ 0wR -> 0x07d8 }
        L_0x06ee:
            X.C18740tg.A06(r16)     // Catch:{ 0wR -> 0x07d8 }
            X.9lY r5 = r4.A0M     // Catch:{ 0wR -> 0x07d8 }
            com.whatsapp.jid.UserJid r12 = r5.A0E     // Catch:{ 0wR -> 0x07d8 }
            r20 = r12
            com.whatsapp.jid.UserJid r12 = r5.A0D     // Catch:{ 0wR -> 0x07d8 }
            r19 = r12
            java.lang.String r12 = r5.A0I     // Catch:{ 0wR -> 0x07d8 }
            r18 = r12
            X.16X r15 = r5.A08     // Catch:{ 0wR -> 0x07d8 }
            X.16U r14 = r5.A07     // Catch:{ 0wR -> 0x07d8 }
            long r12 = r4.A0I     // Catch:{ 0wR -> 0x07d8 }
            java.lang.String r5 = r5.A0G     // Catch:{ 0wR -> 0x07d8 }
            int r28 = r16.BHO()     // Catch:{ 0wR -> 0x07d8 }
            X.9nz r16 = X.C203419nz.$redex_init_class     // Catch:{ 0wR -> 0x07d8 }
            int r27 = X.AnonymousClass9ZS.A00(r5)     // Catch:{ 0wR -> 0x07d8 }
            r25 = 20
            r26 = 12
            r21 = r19
            r22 = r18
            r23 = r10
            r24 = r5
            r30 = r12
            r18 = r14
            r19 = r15
            X.9lY r12 = X.C203419nz.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 0wR -> 0x07d8 }
            X.9lY r5 = r4.A0M     // Catch:{ 0wR -> 0x07d8 }
            int r5 = r5.A02     // Catch:{ 0wR -> 0x07d8 }
            if (r5 == 0) goto L_0x072f
            r12.A02 = r5     // Catch:{ 0wR -> 0x07d8 }
        L_0x072f:
            X.13r r5 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 0wR -> 0x07d8 }
            com.whatsapp.jid.UserJid r14 = X.C222813r.A00(r32)     // Catch:{ 0wR -> 0x07d8 }
            com.whatsapp.jid.UserJid r15 = X.C222813r.A00(r17)     // Catch:{ 0wR -> 0x07d8 }
            long r4 = r4.A0I     // Catch:{ 0wR -> 0x07d8 }
            r13 = r0
            r16 = r7
            r17 = r4
            X.9lY r5 = r13.A01(r14, r15, r16, r17)     // Catch:{ 0wR -> 0x07d8 }
            java.lang.String r4 = r5.A0K     // Catch:{ 0wR -> 0x07d8 }
            r12.A0K = r4     // Catch:{ 0wR -> 0x07d8 }
            X.8av r4 = r5.A0A     // Catch:{ 0wR -> 0x07d8 }
            r12.A0A = r4     // Catch:{ 0wR -> 0x07d8 }
        L_0x074c:
            X.0xM r4 = r0.A01     // Catch:{ 0wR -> 0x07d8 }
            r4.A0Z(r12, r6)     // Catch:{ 0wR -> 0x07d8 }
            goto L_0x07d2
        L_0x0753:
            r16 = 0
            goto L_0x06ee
        L_0x0756:
            X.13r r5 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 0wR -> 0x07d8 }
            com.whatsapp.jid.UserJid r12 = X.C222813r.A00(r17)     // Catch:{ 0wR -> 0x07d8 }
            long r4 = r4.A0I     // Catch:{ 0wR -> 0x07d8 }
            X.9lY r12 = r0.A02(r12, r7, r4)     // Catch:{ 0wR -> 0x07d8 }
            if (r12 == 0) goto L_0x07d4
            goto L_0x074c
        L_0x0765:
            java.lang.String r4 = "transaction"
            boolean r4 = r5.equals(r4)     // Catch:{ 0wR -> 0x07d8 }
            if (r4 == 0) goto L_0x07d4
            X.9lY r5 = r0.A03(r10, r7)     // Catch:{ 0wR -> 0x07d8 }
            if (r5 == 0) goto L_0x07d4
            X.11F r4 = r5.A0C     // Catch:{ 0wR -> 0x07d8 }
            if (r4 != 0) goto L_0x07ac
            java.lang.String r4 = r5.A0L     // Catch:{ 0wR -> 0x07d8 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 0wR -> 0x07d8 }
            if (r4 != 0) goto L_0x07ac
            X.11F r13 = r5.A0C     // Catch:{ 0wR -> 0x07d8 }
            boolean r7 = r5.A0Q     // Catch:{ 0wR -> 0x07d8 }
            java.lang.String r4 = r5.A0L     // Catch:{ 0wR -> 0x07d8 }
            X.3Qa r6 = new X.3Qa     // Catch:{ 0wR -> 0x07d8 }
            r6.<init>(r13, r4, r7)     // Catch:{ 0wR -> 0x07d8 }
            X.1VZ r4 = r0.A02     // Catch:{ 0wR -> 0x07d8 }
            X.1A1 r4 = r4.A00     // Catch:{ 0wR -> 0x07d8 }
            X.3T1 r7 = r4.A03(r6)     // Catch:{ 0wR -> 0x07d8 }
            if (r7 == 0) goto L_0x07ac
            X.9lY r4 = r7.A0M     // Catch:{ 0wR -> 0x07d8 }
            if (r4 == 0) goto L_0x07a6
            java.lang.String r4 = r4.A0M     // Catch:{ 0wR -> 0x07d8 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 0wR -> 0x07d8 }
            if (r4 != 0) goto L_0x07a6
            X.9lY r4 = r7.A0M     // Catch:{ 0wR -> 0x07d8 }
            java.lang.String r4 = r4.A0M     // Catch:{ 0wR -> 0x07d8 }
            r5.A0M = r4     // Catch:{ 0wR -> 0x07d8 }
        L_0x07a6:
            X.0xM r4 = r0.A01     // Catch:{ 0wR -> 0x07d8 }
            r4.A0Z(r5, r6)     // Catch:{ 0wR -> 0x07d8 }
            goto L_0x07d2
        L_0x07ac:
            X.1EU r4 = r0.A06     // Catch:{ 0wR -> 0x07d8 }
            X.AnonymousClass1EU.A00(r4)     // Catch:{ 0wR -> 0x07d8 }
            X.1Ed r6 = r4.A05     // Catch:{ 0wR -> 0x07d8 }
            java.lang.String r4 = r5.A0L     // Catch:{ 0wR -> 0x07d8 }
            boolean r4 = r6.A0c(r5, r12, r4)     // Catch:{ 0wR -> 0x07d8 }
            if (r4 == 0) goto L_0x07d4
            goto L_0x07d2
        L_0x07bc:
            r6 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 0wR -> 0x07d8 }
            r5.<init>()     // Catch:{ 0wR -> 0x07d8 }
            java.lang.String r4 = "PAY: PaymentsProtoParser deserializeProtocolNode: "
            r5.append(r4)     // Catch:{ 0wR -> 0x07d8 }
            r5.append(r6)     // Catch:{ 0wR -> 0x07d8 }
            java.lang.String r4 = r5.toString()     // Catch:{ 0wR -> 0x07d8 }
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 0wR -> 0x07d8 }
            goto L_0x07d4
        L_0x07d2:
            int r3 = r3 + 1
        L_0x07d4:
            int r8 = r8 + 1
            goto L_0x0664
        L_0x07d8:
            r6 = move-exception
            X.1Dc r5 = r1.A04     // Catch:{ all -> 0x0808 }
            java.lang.String r4 = "processFutureTransactions/InvalidJidException - Skipped future transaction with invalid JID"
            r5.A0A(r4, r6)     // Catch:{ all -> 0x0808 }
            goto L_0x0664
        L_0x07e2:
            X.1Dc r4 = r1.A04     // Catch:{ all -> 0x0808 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0808 }
            r1.<init>()     // Catch:{ all -> 0x0808 }
            java.lang.String r0 = "processFutureTransactions processed: "
            r1.append(r0)     // Catch:{ all -> 0x0808 }
            r1.append(r3)     // Catch:{ all -> 0x0808 }
            java.lang.String r0 = " / "
            r1.append(r0)     // Catch:{ all -> 0x0808 }
            r1.append(r8)     // Catch:{ all -> 0x0808 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0808 }
            X.C24611Dc.A02(r4, r10, r0)     // Catch:{ all -> 0x0808 }
            r9.close()     // Catch:{ all -> 0x0812 }
        L_0x0803:
            r11.close()
            goto L_0x05fc
        L_0x0808:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x080d }
            goto L_0x0811
        L_0x080d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0812 }
        L_0x0811:
            throw r1     // Catch:{ all -> 0x0812 }
        L_0x0812:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0817 }
            throw r1
        L_0x0817:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x081c:
            r1 = 1
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r6)
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r5, r1)
            r0.apply()
        L_0x0828:
            X.0wh r0 = r2.A0M
            r2 = 0
            android.content.SharedPreferences r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "run_on_connect_tasks_for_version_change"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            return
        L_0x083b:
            java.lang.Object r8 = r1.A00
            X.1Za r8 = (X.C30051Za) r8
            X.1Zd r7 = r8.A06
            X.0yC r0 = r8.A0A
            r27 = r0
            X.0wN r0 = r8.A00
            r17 = r0
            X.0wQ r0 = r8.A01
            r18 = r0
            X.12q r0 = r8.A03
            r21 = r0
            X.0yW r0 = r8.A0B
            r28 = r0
            X.1VN r15 = r8.A0D
            X.0xM r14 = r8.A04
            X.1A1 r13 = r8.A0H
            X.1Ft r12 = r8.A09
            X.1Jd r11 = r8.A08
            X.12P r10 = r8.A07
            X.1Xd r9 = r8.A05
            X.005 r0 = r8.A0J
            java.lang.Object r5 = r0.get()
            X.1am r5 = (X.C30791am) r5
            X.1Yl r4 = r8.A02
            X.1Jn r3 = r8.A0G
            X.0xh r2 = r8.A0C
            X.1Tc r1 = r8.A0F
            X.1Zh r0 = r8.A0E
            X.9Of r6 = new X.9Of
            r16 = r6
            r19 = r4
            r20 = r5
            r22 = r14
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r29 = r2
            r30 = r15
            r31 = r0
            r32 = r1
            r33 = r3
            r34 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r5 = 0
            X.12P r0 = r7.A01     // Catch:{ SQLiteException -> 0x0b80 }
            X.1M0 r18 = r0.get()     // Catch:{ SQLiteException -> 0x0b80 }
            r0 = r18
            X.14e r3 = r0.A02     // Catch:{ all -> 0x0b76 }
            java.lang.String r2 = X.AnonymousClass2xD.A0G     // Catch:{ all -> 0x0b76 }
            r17 = 0
            java.lang.String r1 = "GET_UNPROCESSED_FUTURE_MESSAGES_SQL"
            r0 = r17
            android.database.Cursor r16 = r3.A09(r2, r1, r0)     // Catch:{ all -> 0x0b76 }
        L_0x08ad:
            boolean r0 = r16.moveToNext()     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 == 0) goto L_0x0b5b
            X.1A1 r1 = r7.A02     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r0 = r16
            X.3T1 r4 = r1.A00(r0)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            boolean r0 = r4 instanceof X.AnonymousClass2bK     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 == 0) goto L_0x08d9
            X.0wQ r0 = r6.A01     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r27 = r0
            boolean r0 = r27.A0L()     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 != 0) goto L_0x08d9
            r3 = r4
            X.2bK r3 = (X.AnonymousClass2bK) r3     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            byte[] r2 = r3.A1V()     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            int r0 = r3.A01     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r2 == 0) goto L_0x08d9
            r9 = 2
            if (r0 == 0) goto L_0x08dc
            if (r0 == r9) goto L_0x08dc
        L_0x08d9:
            int r5 = r5 + 1
            goto L_0x08ad
        L_0x08dc:
            byte[] r1 = r3.A02     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r1 == 0) goto L_0x09bd
            X.8Pj r0 = X.C172838Pj.DEFAULT_INSTANCE     // Catch:{ 0wR | 186 -> 0x09b5 }
            X.8Hz r1 = X.C170918Hz.A08(r0, r1)     // Catch:{ 0wR | 186 -> 0x09b5 }
            X.8Pj r1 = (X.C172838Pj) r1     // Catch:{ 0wR | 186 -> 0x09b5 }
            int r0 = r1.bitField0_     // Catch:{ 0wR | 186 -> 0x09b5 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x09ae
            X.8R0 r11 = r1.botInfo_     // Catch:{ 0wR | 186 -> 0x09b5 }
            if (r11 != 0) goto L_0x08f4
            X.8R0 r11 = X.AnonymousClass8R0.DEFAULT_INSTANCE     // Catch:{ 0wR | 186 -> 0x09b5 }
        L_0x08f4:
            int r0 = r11.bitField0_     // Catch:{ 0wR | 186 -> 0x09b5 }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x093b
            java.lang.String r1 = r11.targetSenderJid_     // Catch:{ 0wR | 186 -> 0x09b5 }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 0wR | 186 -> 0x09b5 }
            com.whatsapp.jid.UserJid r21 = X.C222813r.A01(r1)     // Catch:{ 0wR | 186 -> 0x09b5 }
        L_0x0902:
            int r0 = r11.bitField0_     // Catch:{ 0wR | 186 -> 0x09b5 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0938
            java.lang.String r1 = r11.targetChatJid_     // Catch:{ 0wR | 186 -> 0x09b5 }
            X.13q r0 = X.AnonymousClass11F.A00     // Catch:{ 0wR | 186 -> 0x09b5 }
            X.11F r20 = X.C222713q.A01(r1)     // Catch:{ 0wR | 186 -> 0x09b5 }
        L_0x0910:
            java.lang.String r10 = r11.targetId_     // Catch:{ 0wR | 186 -> 0x09b5 }
            java.lang.String r0 = r11.editTargetId_     // Catch:{ 0wR | 186 -> 0x09b5 }
            r25 = 0
            X.9X8 r1 = new X.9X8     // Catch:{ 0wR | 186 -> 0x09b5 }
            r19 = r1
            r22 = r10
            r23 = r0
            r24 = r17
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ 0wR | 186 -> 0x09b5 }
            X.1Zh r0 = r6.A0D     // Catch:{ 0wR | 186 -> 0x09b5 }
            r21 = r0
            X.3Qa r11 = r3.A1J     // Catch:{ 0wR | 186 -> 0x09b5 }
            X.11F r0 = r11.A00     // Catch:{ 0wR | 186 -> 0x09b5 }
            r20 = r0
            r19 = r0
            X.11F r0 = r1.A00     // Catch:{ 0wR | 186 -> 0x09b5 }
            X.11F r0 = X.AnonymousClass143.A00(r0)     // Catch:{ 0wR | 186 -> 0x09b5 }
            if (r0 == 0) goto L_0x0940
            goto L_0x093e
        L_0x0938:
            r20 = r17
            goto L_0x0910
        L_0x093b:
            r21 = r17
            goto L_0x0902
        L_0x093e:
            r19 = r0
        L_0x0940:
            java.lang.String r14 = r1.A04     // Catch:{ 0wR | 186 -> 0x09b5 }
            r10 = 1
            X.3Qa r12 = new X.3Qa     // Catch:{ 0wR | 186 -> 0x09b5 }
            r0 = r19
            r12.<init>(r0, r14, r10)     // Catch:{ 0wR | 186 -> 0x09b5 }
            java.util.Map r15 = r6.A0H     // Catch:{ 0wR | 186 -> 0x09b5 }
            java.lang.Object r10 = r15.get(r12)     // Catch:{ 0wR | 186 -> 0x09b5 }
            X.3T1 r10 = (X.AnonymousClass3T1) r10     // Catch:{ 0wR | 186 -> 0x09b5 }
            if (r10 != 0) goto L_0x096e
            X.1A1 r13 = r6.A0G     // Catch:{ 0wR | 186 -> 0x09b5 }
            X.3T1 r10 = r13.A03(r12)     // Catch:{ 0wR | 186 -> 0x09b5 }
            if (r10 != 0) goto L_0x096e
            r10 = 0
            X.3Qa r12 = new X.3Qa     // Catch:{ 0wR | 186 -> 0x09b5 }
            r12.<init>(r0, r14, r10)     // Catch:{ 0wR | 186 -> 0x09b5 }
            java.lang.Object r10 = r15.get(r12)     // Catch:{ 0wR | 186 -> 0x09b5 }
            X.3T1 r10 = (X.AnonymousClass3T1) r10     // Catch:{ 0wR | 186 -> 0x09b5 }
            if (r10 != 0) goto L_0x096e
            X.3T1 r10 = r13.A03(r12)     // Catch:{ 0wR | 186 -> 0x09b5 }
        L_0x096e:
            r0 = r21
            X.0yC r13 = r0.A00     // Catch:{ 0wR | 186 -> 0x09b5 }
            r12 = 4165(0x1045, float:5.836E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ 0wR | 186 -> 0x09b5 }
            boolean r0 = X.C20800yB.A01(r0, r13, r12)     // Catch:{ 0wR | 186 -> 0x09b5 }
            if (r0 == 0) goto L_0x08d9
            java.lang.String r12 = r1.A03     // Catch:{ 0wR | 186 -> 0x09b5 }
            boolean r0 = X.AnonymousClass14B.A0F(r12)     // Catch:{ 0wR | 186 -> 0x09b5 }
            if (r0 == 0) goto L_0x0986
            java.lang.String r12 = r11.A01     // Catch:{ 0wR | 186 -> 0x09b5 }
        L_0x0986:
            com.whatsapp.jid.UserJid r0 = r3.A0L()     // Catch:{ 0wR | 186 -> 0x09b5 }
            if (r0 == 0) goto L_0x09a3
            com.whatsapp.jid.UserJid r22 = r3.A0L()     // Catch:{ 0wR | 186 -> 0x09b5 }
        L_0x0990:
            r25 = r17
            r19 = r21
            r20 = r1
            r21 = r17
            r23 = r10
            r24 = r12
            r26 = r2
            byte[] r2 = r19.A03(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 0wR | 186 -> 0x09b5 }
            goto L_0x09aa
        L_0x09a3:
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 0wR | 186 -> 0x09b5 }
            com.whatsapp.jid.UserJid r22 = X.C222813r.A00(r20)     // Catch:{ 0wR | 186 -> 0x09b5 }
            goto L_0x0990
        L_0x09aa:
            if (r2 != 0) goto L_0x09bd
            goto L_0x08d9
        L_0x09ae:
            java.lang.String r0 = "FutureProofMessageProcessor/process/missing BotInfo"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 0wR | 186 -> 0x09b5 }
            goto L_0x08d9
        L_0x09b5:
            r1 = move-exception
            java.lang.String r0 = "FutureProofMessageProcessor/process/unexpected error while processing BotMetadata"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            goto L_0x08d9
        L_0x09bd:
            X.8SX r0 = X.AnonymousClass8SX.A0i(r2)     // Catch:{ 186 -> 0x0b3f }
            X.8SX r11 = X.C200429hO.A00(r0)     // Catch:{ 186 -> 0x0b3f }
            X.0yC r12 = r6.A0A     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.1am r10 = r6.A03     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.12q r1 = r6.A04     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.3Qa r0 = r4.A1J     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.11F r0 = r0.A00     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            boolean r0 = X.C202839mk.A04(r10, r1, r12, r0, r11)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 != 0) goto L_0x08d9
            java.util.ArrayList r10 = X.C202839mk.A01(r11)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.0wN r0 = r6.A00     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            boolean r0 = X.C202839mk.A03(r0, r12, r11, r10)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 != 0) goto L_0x09f7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r1.<init>()     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            java.lang.String r0 = "future-proof-message-handler/futureproof/invalidmessage:messageTypes="
            r1.append(r0)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r1.append(r10)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            goto L_0x08d9
        L_0x09f7:
            int r1 = r3.A00     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r0 = 79
            if (r1 != r0) goto L_0x09ff
            r3.A01 = r9     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
        L_0x09ff:
            X.11F r10 = r3.A0J()     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            X.3Qa r1 = r3.A1J     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            boolean r0 = r1.A02     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            if (r0 == 0) goto L_0x0a15
            if (r10 != 0) goto L_0x0a15
            r27.A0G()     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            r0 = r27
            com.whatsapp.jid.PhoneUserJid r10 = r0.A03     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            X.C18740tg.A06(r10)     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
        L_0x0a15:
            X.3Qa r9 = new X.3Qa     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            r9.<init>(r1)     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            long r0 = r3.A0I     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            X.9T0 r9 = X.C1899296d.A00(r11, r9, r0)     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            r9.A04 = r10     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            r1 = 1
            r9.A0F = r1     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            r0 = 65536(0x10000, float:9.18355E-41)
            boolean r0 = r4.A1T(r0)     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            r10 = 0
            if (r0 != 0) goto L_0x0a37
            r0 = 16384(0x4000, float:2.2959E-41)
            boolean r0 = r4.A1T(r0)     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            if (r0 != 0) goto L_0x0a37
            r1 = 0
        L_0x0a37:
            r9.A0G = r1     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            int r0 = r3.A01     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            r9.A01 = r0     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            X.0xh r1 = r6.A0C     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            X.9YL r0 = r9.A00()     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            X.3T1 r9 = r1.A00(r0)     // Catch:{ 8o5 -> 0x0b30, 1Ta -> 0x0b28 }
            X.3Qa r1 = r9.A1J     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.11F r0 = r1.A00     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            boolean r0 = r0 instanceof X.C28981Uw     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 == 0) goto L_0x0a59
            X.1Tc r0 = r6.A0E     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            boolean r0 = r0.A04(r9)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 != 0) goto L_0x0a59
            goto L_0x08d9
        L_0x0a59:
            boolean r0 = r9 instanceof X.AnonymousClass2bH     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 != 0) goto L_0x0a88
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r9.A1T(r0)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 == 0) goto L_0x0a93
            X.1Yl r0 = r6.A02     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r0.Bll(r9, r2)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.3Kx r2 = r9.A0P()     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r9.A1T(r0)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 == 0) goto L_0x0a93
            if (r2 == 0) goto L_0x0a93
            java.lang.Long r0 = r2.A04()     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 == 0) goto L_0x0a88
            long r13 = r0.longValue()     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0a93
        L_0x0a88:
            X.0xM r1 = r6.A05     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            java.util.List r0 = java.util.Collections.singletonList(r4)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r1.A0u(r0, r10)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            goto L_0x08d9
        L_0x0a93:
            boolean r0 = r4.A1I()     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r11 = 12
            if (r0 == 0) goto L_0x0aa0
            byte[] r0 = r4.A1b     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r9.A1b = r0     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            goto L_0x0aad
        L_0x0aa0:
            boolean r0 = X.AnonymousClass6HP.A00(r4)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 == 0) goto L_0x0aad
            X.0yW r2 = r6.A0B     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            java.lang.String r0 = "future-proof-message-handler/process"
            X.C26271Jn.A01(r2, r0, r11)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
        L_0x0aad:
            X.1Jn r0 = r6.A0F     // Catch:{ 1Tb -> 0x0abb }
            java.lang.Integer r2 = X.C26271Jn.A00(r9, r0, r11)     // Catch:{ 1Tb -> 0x0abb }
            if (r2 == 0) goto L_0x0ac1
            X.1Tb r0 = new X.1Tb     // Catch:{ 1Tb -> 0x0abb }
            r0.<init>(r2)     // Catch:{ 1Tb -> 0x0abb }
            throw r0     // Catch:{ 1Tb -> 0x0abb }
        L_0x0abb:
            r2 = move-exception
            java.lang.String r0 = "future-proof-message-handler/futureproof/invalidMessageSecret:"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
        L_0x0ac1:
            r9.A0w(r4)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            boolean r0 = r9 instanceof X.AnonymousClass2bM     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 == 0) goto L_0x0aff
            X.12P r0 = r6.A07     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.1M0 r3 = r0.A05()     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.71s r2 = r3.B1k()     // Catch:{ all -> 0x0b51 }
            r0 = 17
            r9.A0n(r0)     // Catch:{ all -> 0x0b47 }
            X.1Jd r0 = r6.A08     // Catch:{ all -> 0x0b47 }
            X.2bM r9 = (X.AnonymousClass2bM) r9     // Catch:{ all -> 0x0b47 }
            int r1 = X.C26171Jd.A00(r0, r9, r10)     // Catch:{ all -> 0x0b47 }
            boolean r0 = X.C65733Tg.A02(r1)     // Catch:{ all -> 0x0b47 }
            if (r0 != 0) goto L_0x0aeb
            r0 = 5
            if (r1 == r0) goto L_0x0aeb
            r0 = 7
            if (r1 != r0) goto L_0x0af4
        L_0x0aeb:
            X.0xM r1 = r6.A05     // Catch:{ all -> 0x0b47 }
            java.util.List r0 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x0b47 }
            r1.A0u(r0, r10)     // Catch:{ all -> 0x0b47 }
        L_0x0af4:
            r2.A00()     // Catch:{ all -> 0x0b47 }
            r2.close()     // Catch:{ all -> 0x0b51 }
            r3.close()     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            goto L_0x08d9
        L_0x0aff:
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r9.A1T(r0)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 == 0) goto L_0x0b1b
            byte[] r0 = r3.A02     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            if (r0 != 0) goto L_0x0b1b
            X.0xM r1 = r6.A05     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            java.util.List r0 = java.util.Collections.singletonList(r4)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r1.A0u(r0, r10)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.1Xd r0 = r6.A06     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r0.A03(r9)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            goto L_0x08d9
        L_0x0b1b:
            java.util.Map r0 = r6.A0H     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r0.put(r1, r9)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.0xM r1 = r6.A05     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r0 = 6
            r1.A0n(r9, r0)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            goto L_0x08d9
        L_0x0b28:
            r1 = move-exception
            java.lang.String r0 = "future-proof-message-handler/futureproof/badMessage:"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            goto L_0x08d9
        L_0x0b30:
            r2 = move-exception
            java.lang.String r0 = "future-proof-message-handler/futureproof/orphan message"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.1Ft r1 = r6.A09     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            X.9XS r0 = r2.messageOrphan     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            r1.A01(r0)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            goto L_0x08d9
        L_0x0b3f:
            r1 = move-exception
            java.lang.String r0 = "future-proof-message-handler/futureproof/invalidproto/"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
            goto L_0x08d9
        L_0x0b47:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0b4c }
            goto L_0x0b50
        L_0x0b4c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0b51 }
        L_0x0b50:
            throw r1     // Catch:{ all -> 0x0b51 }
        L_0x0b51:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0b56 }
            goto L_0x0b5a
        L_0x0b56:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
        L_0x0b5a:
            throw r1     // Catch:{ SQLiteDiskIOException -> 0x0b62 }
        L_0x0b5b:
            r16.close()     // Catch:{ all -> 0x0b76 }
            r18.close()     // Catch:{ SQLiteException -> 0x0b80 }
            goto L_0x0b86
        L_0x0b62:
            r2 = move-exception
            X.12T r1 = r7.A00     // Catch:{ all -> 0x0b6a }
            r0 = 1
            r1.A00(r0)     // Catch:{ all -> 0x0b6a }
            throw r2     // Catch:{ all -> 0x0b6a }
        L_0x0b6a:
            r1 = move-exception
            if (r16 == 0) goto L_0x0b75
            r16.close()     // Catch:{ all -> 0x0b71 }
            goto L_0x0b75
        L_0x0b71:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0b76 }
        L_0x0b75:
            throw r1     // Catch:{ all -> 0x0b76 }
        L_0x0b76:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0b7b }
            goto L_0x0b7f
        L_0x0b7b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x0b80 }
        L_0x0b7f:
            throw r1     // Catch:{ SQLiteException -> 0x0b80 }
        L_0x0b80:
            r1 = move-exception
            java.lang.String r0 = "futuremsgstore/future/db/unavailable"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0b86:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "futuremsgstore/future/size:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.005 r0 = r8.A0K
            java.lang.Object r1 = r0.get()
            X.0v0 r1 = (X.C19420v0) r1
            r0 = 0
            r1.A1s(r0)
            return
        L_0x0ba7:
            java.lang.Object r0 = r1.A00
            X.1WK r0 = (X.AnonymousClass1WK) r0
            r0.A0Q()
            return
        L_0x0baf:
            java.lang.Object r2 = r1.A00
            X.1MN r2 = (X.AnonymousClass1MN) r2
            java.lang.String r0 = "ClientPingManager/ping-response"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r0 = r2.A07
            X.C18740tg.A02(r0)
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0bc7
            java.lang.String r0 = "ClientPingManager/ping-response; ping already timed out, ping response is ignored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0bc7:
            r0 = 0
            r2.A0G = r0
            X.AnonymousClass1MN.A01(r2)
            X.AnonymousClass1MN.A05(r2)
            return
        L_0x0bd2:
            java.lang.Object r0 = r1.A00
            X.1MN r0 = (X.AnonymousClass1MN) r0
            X.AnonymousClass1MN.A02(r0)
            return
        L_0x0bda:
            java.lang.Object r0 = r1.A00
            X.1MN r0 = (X.AnonymousClass1MN) r0
            X.AnonymousClass1MN.A04(r0)
            return
        L_0x0be2:
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 8
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.sendToTarget()
            return
        L_0x0bee:
            java.lang.Object r2 = r1.A00
            X.7kT r2 = (X.C160107kT) r2
            r0 = 8
            X.6Wx r1 = new X.6Wx
            r1.<init>(r0)
            X.6Fp r0 = new X.6Fp
            r0.<init>()
            r2.BW7(r1, r0)
            return
        L_0x0c02:
            java.lang.Object r0 = r1.A00
            X.1P5 r0 = (X.AnonymousClass1P5) r0
            X.AnonymousClass1P5.A09(r0)
            return
        L_0x0c0a:
            java.lang.Object r0 = r1.A00
            X.1P5 r0 = (X.AnonymousClass1P5) r0
            r0.A0Q()
            return
        L_0x0c12:
            java.lang.Object r2 = r1.A00
            X.13U r2 = (X.AnonymousClass13U) r2
            X.12q r5 = r2.A06
            X.0wU r0 = r2.A0E
            X.005 r6 = r2.A0K
            X.005 r3 = r2.A0L
            X.13Q r4 = r2.A07
            r7 = 2
            X.1if r1 = new X.1if     // Catch:{ all -> 0x0c2a }
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0c2a }
            r0.Bp1(r1)     // Catch:{ all -> 0x0c2a }
            return
        L_0x0c2a:
            r1 = move-exception
            throw r1
        L_0x0c2c:
            java.lang.Object r5 = r1.A00
            X.0yX r5 = (X.C21020yX) r5
            X.0yC r2 = r5.A0I
            r1 = 7018(0x1b6a, float:9.834E-42)
            X.0yV r0 = X.C21000yV.A02
            int r1 = X.C20800yB.A00(r0, r2, r1)
            r0 = 600(0x258, float:8.41E-43)
            if (r1 == r0) goto L_0x0c54
            X.005 r0 = r5.A0O
            java.lang.Object r0 = r0.get()
            X.0xI r0 = (X.C20270xI) r0
            X.005 r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.19J r0 = (X.AnonymousClass19J) r0
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0c7b
        L_0x0c54:
            boolean r0 = X.C21020yX.A0D(r5)
            r2 = 0
            if (r0 == 0) goto L_0x0c68
            X.005 r0 = r5.A0A
            java.lang.Object r1 = r0.get()
            X.7jN r1 = (X.C159447jN) r1
            X.1C9 r0 = r5.A04
            r1.Bpg(r0, r2)
        L_0x0c68:
            boolean r0 = X.C21020yX.A0B(r5)
            if (r0 == 0) goto L_0x0c7b
            X.005 r0 = r5.A0A
            java.lang.Object r1 = r0.get()
            X.7jN r1 = (X.C159447jN) r1
            X.1C9 r0 = r5.A01
            r1.Bpg(r0, r2)
        L_0x0c7b:
            X.0yJ r0 = r5.A0N
            X.0wk r4 = r0.A01
            long r2 = r5.A00
            r1 = 1
            goto L_0x0ccb
        L_0x0c83:
            java.lang.Object r5 = r1.A00
            X.0yX r5 = (X.C21020yX) r5
            boolean r0 = X.C21020yX.A0C(r5)
            if (r0 == 0) goto L_0x0cb2
            r3 = 1
            int r0 = r5.A0U
            if (r0 <= 0) goto L_0x0cd4
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            int r0 = r5.A0U
            int r0 = r1.nextInt(r0)
            int r6 = r0 + 10
            if (r6 <= 0) goto L_0x0cd4
            X.0yJ r0 = r5.A0N
            X.0wk r4 = r0.A02
            long r2 = (long) r6
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r1 = 5
            X.1iJ r0 = new X.1iJ
            r0.<init>(r5, r6, r1)
            r4.A03(r0, r2)
        L_0x0cb2:
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r0 = 45
            int r0 = r1.nextInt(r0)
            int r1 = 305 - r0
            X.0yJ r0 = r5.A0N
            X.0wk r4 = r0.A02
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = (long) r1
            long r2 = r2.toMillis(r0)
            r1 = 0
        L_0x0ccb:
            X.1j8 r0 = new X.1j8
            r0.<init>(r5, r1)
            r4.A03(r0, r2)
            return
        L_0x0cd4:
            X.005 r0 = r5.A09
            java.lang.Object r2 = r0.get()
            X.7jN r2 = (X.C159447jN) r2
            X.1C9 r1 = r5.A03
            r0 = 0
            r2.Bpi(r1, r0, r0, r3)
            goto L_0x0cb2
        L_0x0ce3:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0ceb:
            X.1AB r2 = r8.A01
            X.2Nh r1 = new X.2Nh
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r1.A00 = r0
            X.0yW r0 = r2.A06
            r0.Bly(r1)
            r7.clear()
            return
        L_0x0d01:
            long r12 = android.os.SystemClock.elapsedRealtime()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.concurrent.ConcurrentHashMap r10 = r5.A04
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r11 = r0.iterator()
        L_0x0d14:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0d48
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r8 = r0.getValue()
            X.78n r8 = (X.C1511778n) r8
            java.lang.Object r7 = r8.get()
            java.lang.ref.WeakReference r0 = r8.A02
            java.lang.Object r6 = r0.get()
            long r0 = r8.A00
            long r3 = r12 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0d14
            if (r7 == 0) goto L_0x0d14
            if (r6 != 0) goto L_0x0d14
            java.lang.String r0 = r8.A01
            r9.add(r7)
            r10.remove(r0)
            goto L_0x0d14
        L_0x0d48:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0d75
            java.util.Iterator r4 = r9.iterator()
        L_0x0d52:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0d75
            java.lang.Object r1 = r4.next()
            X.0u5 r0 = r5.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0d52
            X.0wN r3 = r5.A00
            java.lang.Class r0 = r1.getClass()
            java.lang.String r2 = r0.getName()
            r1 = 0
            java.lang.String r0 = "leak-detected-v3"
            r3.A0E(r0, r2, r1)
            goto L_0x0d52
        L_0x0d75:
            r0 = 0
            r5.A06 = r0
            return
        L_0x0d79:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0d79 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35711j8.run():void");
    }
}
