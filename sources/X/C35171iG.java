package X;

import java.util.Map;

/* renamed from: X.1iG  reason: invalid class name and case insensitive filesystem */
public class C35171iG extends C19940wl {
    public Object A00;
    public Object A01;
    public final int A02;

    public C35171iG(C19930wk r1, Runnable runnable, int i) {
        this.A02 = i;
        this.A00 = r1;
        this.A01 = runnable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x027b, code lost:
        if ((r2 instanceof X.C177618e5) != false) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x029f, code lost:
        if (r34 > 0) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02b2, code lost:
        if (r3.size() >= r1) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0378, code lost:
        if (r1 == -2) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03ab, code lost:
        if (r9 < r33) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03da, code lost:
        if (r26 == false) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0422, code lost:
        if (X.AnonymousClass143.A0G(r14) != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0545, code lost:
        if (r14 == false) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0549, code lost:
        if (r3 != null) goto L_0x054b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x054d, code lost:
        if ((r3 instanceof X.AnonymousClass4TX) == false) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0551, code lost:
        if ((r3 instanceof X.AnonymousClass2bU) == false) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0553, code lost:
        ((X.AnonymousClass2bU) r3).A07 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x055e, code lost:
        if (X.AnonymousClass9ZV.A00(r38) == false) goto L_0x0598;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0564, code lost:
        if (r3.A1G() != false) goto L_0x056e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x056c, code lost:
        if (X.C66013Ui.A0L(r3.A1I) == false) goto L_0x0598;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x059a, code lost:
        if ((r3 instanceof X.C106265Iz) != false) goto L_0x056e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x059e, code lost:
        if ((r3 instanceof X.AnonymousClass2c3) != false) goto L_0x056e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05a0, code lost:
        r10.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0108, code lost:
        if (r0 == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021c, code lost:
        r6 = r7.A0E;
        r5 = X.C21000yV.A02;
     */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0979 A[Catch:{ 197 -> 0x0dc7 }, LOOP:18: B:399:0x0973->B:401:0x0979, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x09c7 A[Catch:{ 197 -> 0x0dc7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0da9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r41 = this;
            r9 = r41
            int r0 = r9.A02
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x0121;
                case 2: goto L_0x074a;
                case 3: goto L_0x075c;
                case 4: goto L_0x001d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r9.A00
            X.0wk r2 = (X.C19930wk) r2
            monitor-enter(r2)
            java.util.HashMap r1 = r2.A02     // Catch:{ all -> 0x001a }
            java.lang.Object r0 = r9.A01     // Catch:{ all -> 0x001a }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x001a }
            r1.remove(r0)     // Catch:{ all -> 0x001a }
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            r2.execute(r0)
            return
        L_0x001a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            throw r0
        L_0x001d:
            java.lang.Object r2 = r9.A00     // Catch:{ all -> 0x0041 }
            X.0wk r2 = (X.C19930wk) r2     // Catch:{ all -> 0x0041 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0041 }
            long r0 = r0.getId()     // Catch:{ all -> 0x0041 }
            r2.A06 = r0     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r2.A01     // Catch:{ all -> 0x0041 }
            monitor-enter(r1)     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r9.A01     // Catch:{ all -> 0x003e }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x003e }
            r0.run()     // Catch:{ all -> 0x003e }
            monitor-exit(r1)     // Catch:{ all -> 0x003e }
            r0 = -1
            r2.A06 = r0
            X.C19930wk.A00(r2)
            return
        L_0x003e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r3 = move-exception
            java.lang.Object r2 = r9.A00
            X.0wk r2 = (X.C19930wk) r2
            r0 = -1
            r2.A06 = r0
            X.C19930wk.A00(r2)
            throw r3
        L_0x004e:
            java.lang.Object r5 = r9.A00
            X.196 r5 = (X.AnonymousClass196) r5
            X.1C3 r4 = r5.A0B
            java.lang.Object r0 = r9.A01
            X.0y6 r0 = (X.C20750y6) r0
            X.14x r3 = r0.iterator()
        L_0x005c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "history-sync-manager/stopMessageHistorySync for "
            r1.append(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Hi r1 = r4.A0C
            r0 = 2
            r1.A04(r2, r0)
            r0 = 3
            r1.A04(r2, r0)
            goto L_0x005c
        L_0x008b:
            X.0yf r1 = r5.A07
            X.0yh r0 = X.C21100yf.A1U
            int r1 = r1.A04(r0)
            X.19g r0 = r5.A0P
            java.util.ArrayList r0 = r0.A0A()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r1 != 0) goto L_0x0108
            if (r0 != 0) goto L_0x00d7
            r0 = 3
            r5.A0I(r0)
        L_0x00a7:
            X.1AB r4 = r5.A0E
            X.0wo r0 = r4.A02
            long r2 = X.C19970wo.A00(r0)
            X.19n r10 = r4.A01
            android.content.SharedPreferences r0 = X.C237119n.A00(r10)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "syncd_last_companion_dereg_logging_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
            android.content.SharedPreferences r0 = X.C237119n.A00(r10)
            java.lang.String r1 = "syncd_first_companion_reg_logging_time"
            r8 = 0
            long r6 = r0.getLong(r1, r8)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00e7
            java.lang.String r0 = "syncStatsManager/onLastCompanionDeregistration, first registerTs is 0L"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00d7:
            X.1A9 r1 = r5.A0I
            java.lang.String r0 = "SyncdKeyManager/unblockAllCollections"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1AJ r0 = r1.A0A
            X.18P r0 = r0.A00
            X.1M0 r4 = r0.A04()
            goto L_0x010b
        L_0x00e7:
            android.content.SharedPreferences r0 = X.C237119n.A00(r10)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
            X.2Nf r1 = new X.2Nf
            r1.<init>()
            long r2 = r2 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00 = r0
            X.0yW r0 = r4.A06
            r0.Bly(r1)
            goto L_0x00d7
        L_0x0108:
            if (r0 != 0) goto L_0x00d7
            goto L_0x00a7
        L_0x010b:
            X.14e r3 = r4.A02     // Catch:{ all -> 0x011c }
            java.lang.String r2 = "missing_keys"
            java.lang.String r1 = "SyncdMissingKeysTable.deleteAllRows"
            r0 = 0
            r3.A03(r2, r0, r1, r0)     // Catch:{ all -> 0x011c }
            r4.close()
            r5.A0G()
            return
        L_0x011c:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0742 }
            throw r1
        L_0x0121:
            java.lang.Object r0 = r9.A00
            r27 = r0
            r0 = r27
            X.196 r0 = (X.AnonymousClass196) r0
            r27 = r0
            X.1IZ r8 = r0.A0F
            java.lang.Object r3 = r9.A01
            X.3Iw r3 = (X.C63133Iw) r3
            X.1AB r0 = r8.A03
            r40 = r0
            X.39o r0 = r3.A00
            java.lang.String r2 = r0.A03
            X.3FZ r1 = r3.A01
            r0 = r40
            X.3I3 r29 = r0.A06(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SyncdBootstrapManager/prepareCriticalDataUpload bootstrapId: "
            r1.append(r0)
            r0 = r29
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ia r4 = r8.A02
            X.3SB r0 = r3.A02
            r39 = r0
            com.whatsapp.jid.DeviceJid r0 = r0.A07
            r38 = r0
            X.0wU r3 = r4.A06
            r2 = 28
            X.1j2 r1 = new X.1j2
            r1.<init>(r4, r0, r2)
            r3.Bp1(r1)
            X.1C3 r7 = r8.A01
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap r36 = new java.util.LinkedHashMap
            r36.<init>()
            X.1A6 r2 = r7.A05
            X.1CR r1 = r7.A0I
            X.12q r0 = r2.A02
            X.C220412q.A00(r0)
            X.1A7 r2 = r2.A01
            java.util.ArrayList r0 = r2.A01
            int r0 = r0.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Set r5 = r1.A0X()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            monitor-enter(r2)
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0747 }
        L_0x019d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0747 }
            if (r0 == 0) goto L_0x01af
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0747 }
            X.3I6 r0 = (X.AnonymousClass3I6) r0     // Catch:{ all -> 0x0747 }
            X.11F r0 = r0.A01     // Catch:{ all -> 0x0747 }
            r6.add(r0)     // Catch:{ all -> 0x0747 }
            goto L_0x019d
        L_0x01af:
            monitor-exit(r2)     // Catch:{ all -> 0x0747 }
            java.util.Iterator r2 = r6.iterator()
        L_0x01b4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto L_0x01b4
            r4.add(r1)
            goto L_0x01b4
        L_0x01c8:
            r5.retainAll(r6)
            r0 = 0
            r4.addAll(r0, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "history-sync-manager/create-initial-bootstrap-data start: conversation list size is "
            r1.append(r0)
            int r0 = r4.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19n r0 = r7.A04
            android.content.SharedPreferences r5 = X.C237119n.A00(r0)
            java.lang.String r2 = "syncd_bootstrap_fail_time"
            r0 = 0
            long r5 = r5.getLong(r2, r0)
            r35 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0219
            X.0yC r2 = r7.A0E
            r1 = 1324(0x52c, float:1.855E-42)
            X.0yV r0 = X.C21000yV.A02
            int r1 = X.C20800yB.A00(r0, r2, r1)
            if (r1 <= 0) goto L_0x0219
            X.0wo r0 = r7.A06
            long r9 = X.C19970wo.A00(r0)
            long r9 = r9 - r5
            long r0 = (long) r1
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r5
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0219
            r35 = 1
        L_0x0219:
            r9 = 0
            if (r35 == 0) goto L_0x0293
            X.0yC r6 = r7.A0E
            r0 = 1317(0x525, float:1.846E-42)
            X.0yV r5 = X.C21000yV.A02
            int r34 = X.C20800yB.A00(r5, r6, r0)
            if (r34 <= 0) goto L_0x0293
        L_0x0228:
            r33 = r34
        L_0x022a:
            r0 = 1420(0x58c, float:1.99E-42)
            int r11 = X.C20800yB.A00(r5, r6, r0)
            if (r11 > 0) goto L_0x0235
            r11 = 2147483647(0x7fffffff, float:NaN)
        L_0x0235:
            java.util.Iterator r14 = r4.iterator()
            r10 = 0
            r4 = 0
        L_0x023b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x02a2
            java.lang.Object r2 = r14.next()
            X.11F r2 = (X.AnonymousClass11F) r2
            if (r10 >= r11) goto L_0x02a2
            boolean r1 = X.AnonymousClass9ZV.A00(r38)
            boolean r0 = r2 instanceof X.AnonymousClass146
            if (r0 != 0) goto L_0x023b
            if (r1 == 0) goto L_0x025c
            boolean r0 = r2 instanceof X.AnonymousClass147
            if (r0 != 0) goto L_0x023b
            boolean r0 = r2 instanceof X.C177618e5
            if (r0 == 0) goto L_0x025c
            goto L_0x023b
        L_0x025c:
            r0 = r39
            X.9eT r0 = r0.A06
            if (r0 == 0) goto L_0x0266
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x026d
        L_0x0266:
            boolean r0 = X.C197029b1.A00(r2)
            if (r0 == 0) goto L_0x026d
            goto L_0x023b
        L_0x026d:
            X.1Cv r0 = r7.A07
            X.3T1 r12 = r0.A06(r2, r9)
            r1 = 0
            r0 = r33
            if (r4 < r0) goto L_0x027d
            boolean r13 = r2 instanceof X.C177618e5
            r0 = r1
            if (r13 == 0) goto L_0x0280
        L_0x027d:
            int r4 = r4 + 1
            r0 = r12
        L_0x0280:
            r3.put(r2, r0)
            if (r12 == 0) goto L_0x028b
            long r0 = r12.A0I
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x028b:
            r0 = r36
            r0.put(r2, r1)
            int r10 = r10 + 1
            goto L_0x023b
        L_0x0293:
            X.0yC r6 = r7.A0E
            r0 = 1170(0x492, float:1.64E-42)
            X.0yV r5 = X.C21000yV.A02
            int r34 = X.C20800yB.A00(r5, r6, r0)
            r33 = 1000(0x3e8, float:1.401E-42)
            if (r34 <= 0) goto L_0x022a
            goto L_0x0228
        L_0x02a2:
            if (r35 == 0) goto L_0x02bc
            r0 = 1318(0x526, float:1.847E-42)
            int r1 = X.C20800yB.A00(r5, r6, r0)
            if (r1 <= 0) goto L_0x02bc
        L_0x02ac:
            int r0 = r3.size()
            r32 = 1
            if (r0 >= r1) goto L_0x02b6
        L_0x02b4:
            r32 = 0
        L_0x02b6:
            java.util.ArrayList r28 = new java.util.ArrayList
            r28.<init>()
            goto L_0x02c5
        L_0x02bc:
            r0 = 1119(0x45f, float:1.568E-42)
            int r1 = X.C20800yB.A00(r5, r6, r0)
            if (r1 <= 0) goto L_0x02b4
            goto L_0x02ac
        L_0x02c5:
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x05d0 }
            java.util.Set r0 = r3.entrySet()     // Catch:{ Exception -> 0x05d0 }
            java.util.Iterator r31 = r0.iterator()     // Catch:{ Exception -> 0x05d0 }
            r30 = 0
        L_0x02d3:
            boolean r0 = r31.hasNext()     // Catch:{ Exception -> 0x05d0 }
            if (r0 == 0) goto L_0x05db
            java.lang.Object r0 = r31.next()     // Catch:{ Exception -> 0x05d0 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x05d0 }
            java.lang.Object r4 = r0.getKey()     // Catch:{ Exception -> 0x05d0 }
            X.11F r4 = (X.AnonymousClass11F) r4     // Catch:{ Exception -> 0x05d0 }
            java.lang.Object r3 = r0.getValue()     // Catch:{ Exception -> 0x05d0 }
            X.3T1 r3 = (X.AnonymousClass3T1) r3     // Catch:{ Exception -> 0x05d0 }
            X.1CO r11 = r7.A0G     // Catch:{ Exception -> 0x05d0 }
            X.0wN r0 = r11.A00     // Catch:{ Exception -> 0x05d0 }
            X.8mb r2 = new X.8mb     // Catch:{ Exception -> 0x05d0 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x05d0 }
            X.12q r10 = r11.A02     // Catch:{ Exception -> 0x05d0 }
            long r0 = r10.A08(r4)     // Catch:{ Exception -> 0x05d0 }
            r2.A04 = r0     // Catch:{ Exception -> 0x05d0 }
            r2.A06 = r4     // Catch:{ Exception -> 0x05d0 }
            X.1CR r1 = r11.A05     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r0 = r4.getRawString()     // Catch:{ Exception -> 0x05d0 }
            X.3LI r0 = X.AnonymousClass1CR.A02(r1, r0)     // Catch:{ Exception -> 0x05d0 }
            r0.A00()     // Catch:{ Exception -> 0x05d0 }
            int r0 = r10.A02(r4)     // Catch:{ Exception -> 0x05d0 }
            r2.A00 = r0     // Catch:{ Exception -> 0x05d0 }
            boolean r0 = r10.A0N(r4)     // Catch:{ Exception -> 0x05d0 }
            r2.A0C = r0     // Catch:{ Exception -> 0x05d0 }
            X.1A5 r0 = r11.A03     // Catch:{ Exception -> 0x05d0 }
            X.141 r13 = r0.A01(r4)     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r0 = r13.A0J()     // Catch:{ Exception -> 0x05d0 }
            boolean r12 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x05d0 }
            r0 = 0
            if (r12 != 0) goto L_0x032c
            java.lang.String r0 = r13.A0J()     // Catch:{ Exception -> 0x05d0 }
        L_0x032c:
            r2.A0A = r0     // Catch:{ Exception -> 0x05d0 }
            boolean r0 = r13.A0G()     // Catch:{ Exception -> 0x05d0 }
            if (r0 == 0) goto L_0x0341
            X.17X r12 = r11.A04     // Catch:{ Exception -> 0x05d0 }
            r0 = r4
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ Exception -> 0x05d0 }
            boolean r0 = r12.A0C(r0)     // Catch:{ Exception -> 0x05d0 }
            r0 = r0 ^ 1
            r2.A0E = r0     // Catch:{ Exception -> 0x05d0 }
        L_0x0341:
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ Exception -> 0x05d0 }
            com.whatsapp.jid.UserJid r12 = X.C222813r.A00(r4)     // Catch:{ Exception -> 0x05d0 }
            if (r12 == 0) goto L_0x035d
            X.1Cu r0 = r11.A01     // Catch:{ Exception -> 0x05d0 }
            X.8nA r14 = r0.A00(r12)     // Catch:{ Exception -> 0x05d0 }
            if (r14 == 0) goto L_0x035d
            com.whatsapp.jid.UserJid r0 = r14.A00     // Catch:{ Exception -> 0x05d0 }
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x05d0 }
            if (r0 == 0) goto L_0x05ac
            com.whatsapp.jid.UserJid r0 = r14.A01     // Catch:{ Exception -> 0x05d0 }
            r2.A08 = r0     // Catch:{ Exception -> 0x05d0 }
        L_0x035d:
            java.lang.String r0 = r4.getRawString()     // Catch:{ Exception -> 0x05d0 }
            X.3LI r1 = X.AnonymousClass1CR.A02(r1, r0)     // Catch:{ Exception -> 0x05d0 }
            boolean r0 = r1.A0I     // Catch:{ Exception -> 0x05d0 }
            if (r0 == 0) goto L_0x05a8
            long r0 = r1.A06     // Catch:{ Exception -> 0x05d0 }
        L_0x036b:
            r2.A03 = r0     // Catch:{ Exception -> 0x05d0 }
            X.1C6 r0 = r11.A06     // Catch:{ Exception -> 0x05d0 }
            int r1 = X.AnonymousClass1C6.A00(r4, r0)     // Catch:{ Exception -> 0x05d0 }
            r0 = -1
            if (r1 == r0) goto L_0x037a
            r0 = -2
            r11 = 0
            if (r1 != r0) goto L_0x037b
        L_0x037a:
            r11 = 1
        L_0x037b:
            r0 = r11 ^ 1
            r2.A0D = r0     // Catch:{ Exception -> 0x05d0 }
            if (r12 == 0) goto L_0x0382
            goto L_0x0387
        L_0x0382:
            int r0 = r13.A02     // Catch:{ Exception -> 0x05d0 }
            r2.A01 = r0     // Catch:{ Exception -> 0x05d0 }
            goto L_0x0398
        L_0x0387:
            X.3un r1 = r10.A0B(r12)     // Catch:{ Exception -> 0x05d0 }
            if (r1 == 0) goto L_0x0398
            int r0 = r1.expiration     // Catch:{ Exception -> 0x05d0 }
            r2.A01 = r0     // Catch:{ Exception -> 0x05d0 }
            long r0 = r1.ephemeralSettingTimestamp     // Catch:{ Exception -> 0x05d0 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r11
            r2.A02 = r0     // Catch:{ Exception -> 0x05d0 }
        L_0x0398:
            int r0 = r10.A01(r4)     // Catch:{ Exception -> 0x05d0 }
            r2.A00 = r0     // Catch:{ Exception -> 0x05d0 }
            r20 = 1
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x05d0 }
            r10.<init>()     // Catch:{ Exception -> 0x05d0 }
            if (r34 <= 0) goto L_0x03ad
            r26 = 1
            r0 = r33
            if (r9 >= r0) goto L_0x03af
        L_0x03ad:
            r26 = 0
        L_0x03af:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r12 = r16 - r0
            long r0 = r2.A04     // Catch:{ Exception -> 0x05d0 }
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x03c2
            long r0 = r2.A03     // Catch:{ Exception -> 0x05d0 }
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0547
        L_0x03c2:
            if (r3 == 0) goto L_0x0547
            if (r26 != 0) goto L_0x03d9
            r0 = 1375(0x55f, float:1.927E-42)
            int r1 = X.C20800yB.A00(r5, r6, r0)     // Catch:{ Exception -> 0x05d0 }
            r0 = r30
            if (r0 >= r1) goto L_0x03d9
            r0 = 1376(0x560, float:1.928E-42)
            int r11 = X.C20800yB.A00(r5, r6, r0)     // Catch:{ Exception -> 0x05d0 }
            r0 = 1
            int r11 = r11 - r0
            goto L_0x03dc
        L_0x03d9:
            r11 = 0
            if (r26 != 0) goto L_0x03ec
        L_0x03dc:
            if (r32 != 0) goto L_0x03ec
            int r1 = r2.A00     // Catch:{ Exception -> 0x05d0 }
            r0 = 50
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ Exception -> 0x05d0 }
            r0 = 30
            int r11 = java.lang.Math.max(r1, r0)     // Catch:{ Exception -> 0x05d0 }
        L_0x03ec:
            X.1CN r13 = r7.A0B     // Catch:{ Exception -> 0x05d0 }
            X.3Qa r12 = r3.A1J     // Catch:{ Exception -> 0x05d0 }
            int r25 = r11 + 1
            boolean r24 = X.AnonymousClass9ZV.A00(r38)     // Catch:{ Exception -> 0x05d0 }
            X.1A1 r0 = r13.A02     // Catch:{ Exception -> 0x05d0 }
            r37 = r0
            X.3T1 r14 = r0.A03(r12)     // Catch:{ Exception -> 0x05d0 }
            if (r14 == 0) goto L_0x0530
            long r0 = r14.A1N     // Catch:{ Exception -> 0x05d0 }
            r18 = 0
            int r15 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r15 == 0) goto L_0x0530
            long r0 = r14.A1N     // Catch:{ Exception -> 0x05d0 }
            r22 = r0
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0530
            X.C18740tg.A06(r12)     // Catch:{ Exception -> 0x05d0 }
            X.11F r14 = r12.A00     // Catch:{ Exception -> 0x05d0 }
            boolean r0 = r14 instanceof X.C177618e5     // Catch:{ Exception -> 0x05d0 }
            r21 = 1
            r12 = 0
            if (r0 != 0) goto L_0x0424
            boolean r0 = X.AnonymousClass143.A0G(r14)     // Catch:{ Exception -> 0x05d0 }
            r18 = 1
            if (r0 == 0) goto L_0x0426
        L_0x0424:
            r18 = 0
        L_0x0426:
            X.12P r0 = r13.A01     // Catch:{ Exception -> 0x05d0 }
            X.1M0 r20 = r0.get()     // Catch:{ Exception -> 0x05d0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05c6 }
            r1.<init>()     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = X.AnonymousClass2xD.A0J     // Catch:{ all -> 0x05c6 }
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x05c6 }
            r15.<init>()     // Catch:{ all -> 0x05c6 }
            if (r18 == 0) goto L_0x0446
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05c6 }
            r15.add(r0)     // Catch:{ all -> 0x05c6 }
        L_0x0446:
            X.AnonymousClass17W.A01(r1, r15)     // Catch:{ all -> 0x05c6 }
            if (r24 == 0) goto L_0x0486
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x05c6 }
            r15.<init>()     // Catch:{ all -> 0x05c6 }
            r0 = 42
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05c6 }
            r15.add(r0)     // Catch:{ all -> 0x05c6 }
            r0 = 43
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05c6 }
            r15.add(r0)     // Catch:{ all -> 0x05c6 }
            r0 = 78
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05c6 }
            r15.add(r0)     // Catch:{ all -> 0x05c6 }
            r0 = 82
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05c6 }
            r15.add(r0)     // Catch:{ all -> 0x05c6 }
            X.AnonymousClass17W.A01(r1, r15)     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = " AND ( "
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = "expire_timestamp IS NULL"
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = ") "
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
        L_0x0486:
            java.lang.String r0 = " AND (view_mode IS NULL OR view_mode = 0) "
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = " AND _id < ? "
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = " ORDER BY _id DESC"
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = " LIMIT "
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
            r0 = r25
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
            java.lang.String r15 = r1.toString()     // Catch:{ all -> 0x05c6 }
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x05c6 }
            X.163 r0 = r13.A00     // Catch:{ all -> 0x05c6 }
            X.C18740tg.A06(r14)     // Catch:{ all -> 0x05c6 }
            long r18 = r0.A08(r14)     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x05c6 }
            r1[r12] = r0     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = java.lang.String.valueOf(r22)     // Catch:{ all -> 0x05c6 }
            r1[r21] = r0     // Catch:{ all -> 0x05c6 }
            r0 = r20
            X.14e r13 = r0.A02     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = "GET_PREVIOUS_MESSAGES_AT_FOR_TYPE"
            android.database.Cursor r18 = r13.A09(r15, r0, r1)     // Catch:{ all -> 0x05c6 }
            java.util.LinkedList r13 = new java.util.LinkedList     // Catch:{ all -> 0x05ba }
            r13.<init>()     // Catch:{ all -> 0x05ba }
        L_0x04cf:
            boolean r0 = r18.moveToNext()     // Catch:{ all -> 0x05ba }
            if (r0 == 0) goto L_0x04f3
            r1 = r37
            r0 = r18
            X.3T1 r15 = r1.A01(r0, r14)     // Catch:{ all -> 0x05ba }
            if (r15 == 0) goto L_0x04cf
            boolean r0 = r15 instanceof X.AnonymousClass4TX     // Catch:{ all -> 0x05ba }
            if (r0 == 0) goto L_0x04ef
            boolean r0 = r15 instanceof X.AnonymousClass2bU     // Catch:{ all -> 0x05ba }
            if (r0 == 0) goto L_0x04ef
            r0 = r15
            X.2bU r0 = (X.AnonymousClass2bU) r0     // Catch:{ all -> 0x05ba }
            r1 = r0
            java.lang.String r0 = ""
            r1.A07 = r0     // Catch:{ all -> 0x05ba }
        L_0x04ef:
            r13.addFirst(r15)     // Catch:{ all -> 0x05ba }
            goto L_0x04cf
        L_0x04f3:
            r18.close()     // Catch:{ all -> 0x05c6 }
            r20.close()     // Catch:{ Exception -> 0x05d0 }
            int r0 = r13.size()     // Catch:{ Exception -> 0x05d0 }
            if (r0 <= r11) goto L_0x0505
            r13.get(r12)     // Catch:{ Exception -> 0x05d0 }
            r13.remove(r12)     // Catch:{ Exception -> 0x05d0 }
        L_0x0505:
            boolean r0 = r13.isEmpty()     // Catch:{ Exception -> 0x05d0 }
            r14 = 0
            if (r0 != 0) goto L_0x050d
            r14 = 1
        L_0x050d:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x05d0 }
            r11.<init>()     // Catch:{ Exception -> 0x05d0 }
            java.util.Iterator r12 = r13.iterator()     // Catch:{ Exception -> 0x05d0 }
        L_0x0516:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x05d0 }
            if (r0 == 0) goto L_0x052c
            java.lang.Object r1 = r12.next()     // Catch:{ Exception -> 0x05d0 }
            boolean r0 = r1 instanceof X.C106265Iz     // Catch:{ Exception -> 0x05d0 }
            if (r0 != 0) goto L_0x0516
            boolean r0 = r1 instanceof X.AnonymousClass2c3     // Catch:{ Exception -> 0x05d0 }
            if (r0 != 0) goto L_0x0516
            r11.add(r1)     // Catch:{ Exception -> 0x05d0 }
            goto L_0x0516
        L_0x052c:
            r10.addAll(r11)     // Catch:{ Exception -> 0x05d0 }
            goto L_0x0545
        L_0x0530:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05d0 }
            r1.<init>()     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r0 = "msgstore/get/previous no id for "
            r1.append(r0)     // Catch:{ Exception -> 0x05d0 }
            r1.append(r12)     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x05d0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x05d0 }
            goto L_0x0547
        L_0x0545:
            if (r14 != 0) goto L_0x054b
        L_0x0547:
            if (r26 != 0) goto L_0x056e
            if (r3 == 0) goto L_0x056e
        L_0x054b:
            boolean r0 = r3 instanceof X.AnonymousClass4TX     // Catch:{ Exception -> 0x05d0 }
            if (r0 == 0) goto L_0x055a
            boolean r0 = r3 instanceof X.AnonymousClass2bU     // Catch:{ Exception -> 0x05d0 }
            if (r0 == 0) goto L_0x055a
            r1 = r3
            X.2bU r1 = (X.AnonymousClass2bU) r1     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r0 = ""
            r1.A07 = r0     // Catch:{ Exception -> 0x05d0 }
        L_0x055a:
            boolean r0 = X.AnonymousClass9ZV.A00(r38)     // Catch:{ Exception -> 0x05d0 }
            if (r0 == 0) goto L_0x0598
            boolean r0 = r3.A1G()     // Catch:{ Exception -> 0x05d0 }
            if (r0 != 0) goto L_0x056e
            int r0 = r3.A1I     // Catch:{ Exception -> 0x05d0 }
            boolean r0 = X.C66013Ui.A0L(r0)     // Catch:{ Exception -> 0x05d0 }
            if (r0 == 0) goto L_0x0598
        L_0x056e:
            int r0 = r10.size()     // Catch:{ Exception -> 0x05d0 }
            int r9 = r9 + r0
            java.util.Collections.reverse(r10)     // Catch:{ Exception -> 0x05d0 }
            r0 = 6049(0x17a1, float:8.476E-42)
            int r1 = X.C20800yB.A00(r5, r6, r0)     // Catch:{ Exception -> 0x05d0 }
            X.1Cx r0 = r7.A08     // Catch:{ Exception -> 0x05d0 }
            java.util.ArrayList r0 = r0.A01(r10, r1)     // Catch:{ Exception -> 0x05d0 }
            r10.addAll(r0)     // Catch:{ Exception -> 0x05d0 }
            r0 = r36
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x05d0 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x05d0 }
            X.36J r1 = new X.36J     // Catch:{ Exception -> 0x05d0 }
            r1.<init>(r2, r0, r10)     // Catch:{ Exception -> 0x05d0 }
            r0 = r28
            r0.add(r1)     // Catch:{ Exception -> 0x05d0 }
            goto L_0x05a4
        L_0x0598:
            boolean r0 = r3 instanceof X.C106265Iz     // Catch:{ Exception -> 0x05d0 }
            if (r0 != 0) goto L_0x056e
            boolean r0 = r3 instanceof X.AnonymousClass2c3     // Catch:{ Exception -> 0x05d0 }
            if (r0 != 0) goto L_0x056e
            r10.add(r3)     // Catch:{ Exception -> 0x05d0 }
            goto L_0x056e
        L_0x05a4:
            int r30 = r30 + 1
            goto L_0x02d3
        L_0x05a8:
            r0 = 0
            goto L_0x036b
        L_0x05ac:
            com.whatsapp.jid.UserJid r0 = r14.A01     // Catch:{ Exception -> 0x05d0 }
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x05d0 }
            if (r0 == 0) goto L_0x035d
            com.whatsapp.jid.UserJid r0 = r14.A00     // Catch:{ Exception -> 0x05d0 }
            r2.A07 = r0     // Catch:{ Exception -> 0x05d0 }
            goto L_0x035d
        L_0x05ba:
            r1 = move-exception
            if (r18 == 0) goto L_0x05c5
            r18.close()     // Catch:{ all -> 0x05c1 }
            goto L_0x05c5
        L_0x05c1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05c6 }
        L_0x05c5:
            throw r1     // Catch:{ all -> 0x05c6 }
        L_0x05c6:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x05cb }
            goto L_0x05cf
        L_0x05cb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x05d0 }
        L_0x05cf:
            throw r1     // Catch:{ Exception -> 0x05d0 }
        L_0x05d0:
            r1 = move-exception
            java.lang.String r0 = "history-sync-manager/create-initial-bootstrap-data: aborting data creation"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.List r28 = java.util.Collections.emptyList()
            goto L_0x0605
        L_0x05db:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "history-sync-manager/create-initial-bootstrap-data end, msgCount="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "; chatCount="
            r1.append(r0)
            int r0 = r28.size()
            r1.append(r0)
            java.lang.String r0 = "; optimizationEnabled="
            r1.append(r0)
            r0 = r35
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0605:
            X.0wU r1 = r7.A0J
            r14 = 8
            X.1ia r0 = new X.1ia
            r9 = r0
            r10 = r7
            r11 = r39
            r12 = r29
            r13 = r28
            r9.<init>(r10, r11, r12, r13, r14)
            r1.Bp1(r0)
            X.1A9 r4 = r8.A05
            java.lang.String r0 = "SyncdKeyManager/shareAllKeys"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1AA r0 = r4.A09
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            X.18P r0 = r0.A00
            X.1M0 r5 = r0.get()
            X.14e r3 = r5.A02     // Catch:{ all -> 0x073d }
            java.lang.String r2 = "SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info"
            r1 = 0
            java.lang.String r0 = "SyncdCryptoInfoTable.SELECT_KEYS"
            android.database.Cursor r2 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x073d }
        L_0x0638:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0731 }
            if (r0 == 0) goto L_0x0646
            X.9Va r0 = X.AnonymousClass1AA.A00(r2)     // Catch:{ all -> 0x0731 }
            r6.add(r0)     // Catch:{ all -> 0x0731 }
            goto L_0x0638
        L_0x0646:
            r2.close()     // Catch:{ all -> 0x073d }
            r5.close()
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x068a
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r2 = r6.iterator()
        L_0x065b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x066d
            java.lang.Object r1 = r2.next()
            X.9Va r1 = (X.C195589Va) r1
            X.9jo r0 = r1.A01
            r3.put(r0, r1)
            goto L_0x065b
        L_0x066d:
            r1 = 0
            r0 = r38
            r4.A09(r0, r3, r1)
            X.1AB r4 = r4.A03
            int r0 = r3.size()
            long r2 = (long) r0
            X.2Nd r1 = new X.2Nd
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00 = r0
            X.0yW r0 = r4.A06
            r0.Bly(r1)
        L_0x068a:
            X.19n r2 = r8.A04
            android.content.SharedPreferences r3 = X.C237119n.A00(r2)
            java.lang.String r1 = "syncd_bootstrap_state"
            r0 = 0
            int r0 = r3.getInt(r1, r0)
            if (r0 != 0) goto L_0x071a
            if (r29 == 0) goto L_0x06a9
            X.3De r1 = new X.3De
            r1.<init>(r12)
            r8.A02(r1)
            r3 = 1
            r1 = r40
            X.AnonymousClass1AB.A05(r12, r1, r3)
        L_0x06a9:
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncCriticalBootstrap triggered for release"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.1AE r6 = r8.A08
            java.util.Set r0 = r6.A02()
            java.util.Iterator r9 = r0.iterator()
        L_0x06c2:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0721
            java.lang.Object r3 = r9.next()
            java.lang.String r3 = (java.lang.String) r3
            X.1LZ r7 = r6.A00(r3)
            if (r7 != 0) goto L_0x06da
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncCriticalBootstrap handler not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x06c2
        L_0x06da:
            java.util.Set r1 = X.C201669k5.A09
            java.lang.String r0 = r7.A0B()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x06c2
            boolean r0 = r7 instanceof X.AnonymousClass2FS
            if (r0 == 0) goto L_0x0714
            r1 = r7
            X.2FS r1 = (X.AnonymousClass2FS) r1
            java.util.List r0 = r1.A0J(r13)
        L_0x06f1:
            r4.addAll(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncCriticalBootstrap adding mutations for "
            r1.append(r0)
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.add(r3)
            goto L_0x06c2
        L_0x0714:
            r0 = 0
            java.util.List r0 = r7.A0D(r0)
            goto L_0x06f1
        L_0x071a:
            X.19o r1 = r8.A07
            r0 = 1
            r1.A02(r0)
            goto L_0x072d
        L_0x0721:
            X.1AK r0 = r8.A06
            r0.A05(r4)
            r2.A07(r5)
            r0 = 1
            r2.A04(r0)
        L_0x072d:
            r27.A0H()
            return
        L_0x0731:
            r1 = move-exception
            if (r2 == 0) goto L_0x073c
            r2.close()     // Catch:{ all -> 0x0738 }
            goto L_0x073c
        L_0x0738:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x073d }
        L_0x073c:
            throw r1     // Catch:{ all -> 0x073d }
        L_0x073d:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0742 }
            throw r1
        L_0x0742:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0747:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0747 }
            throw r0
        L_0x074a:
            java.lang.String r0 = "sync-manager/doPreCompanionLogoutTask timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r9.A01
            X.3ty r1 = (X.C79593ty) r1
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0C(r0)
            return
        L_0x075c:
            java.lang.Object r8 = r9.A00
            X.196 r8 = (X.AnonymousClass196) r8
            monitor-enter(r8)
            X.3pg r3 = r8.A00     // Catch:{ all -> 0x0dfa }
            if (r3 != 0) goto L_0x0789
            X.0wQ r7 = r8.A06     // Catch:{ all -> 0x0dfa }
            X.0wU r6 = r8.A0W     // Catch:{ all -> 0x0dfa }
            X.19A r5 = r8.A0U     // Catch:{ all -> 0x0dfa }
            X.1AB r4 = r8.A0E     // Catch:{ all -> 0x0dfa }
            X.1IZ r2 = r8.A0F     // Catch:{ all -> 0x0dfa }
            X.1IT r1 = r8.A0Q     // Catch:{ all -> 0x0dfa }
            X.1Il r0 = r8.A0D     // Catch:{ all -> 0x0dfa }
            X.9nj r12 = X.AnonymousClass196.A01(r8)     // Catch:{ all -> 0x0dfa }
            X.3pg r3 = new X.3pg     // Catch:{ all -> 0x0dfa }
            r10 = r3
            r11 = r7
            r13 = r0
            r14 = r4
            r15 = r2
            r16 = r1
            r17 = r5
            r18 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0dfa }
            r8.A00 = r3     // Catch:{ all -> 0x0dfa }
        L_0x0789:
            monitor-exit(r8)
            java.lang.Object r2 = r9.A01
            java.util.Map r2 = (java.util.Map) r2
            boolean r0 = r2.isEmpty()
            r1 = r0 ^ 1
            java.lang.String r0 = "sync-request-handler/sendRequest: mutation map is empty"
            X.C18740tg.A0E(r1, r0)
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x07a6:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0ddd
            java.lang.Object r1 = r16.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            X.1Il r0 = r3.A03
            r36 = r0
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r7 = r1.getValue()
            java.util.List r7 = (java.util.List) r7
            X.3ty r18 = new X.3ty
            r18.<init>()
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x07e8
            java.util.List r4 = java.util.Collections.emptyList()
            r1 = 0
            X.9Sw r0 = new X.9Sw
            r0.<init>(r2, r4, r1)
            X.37t r1 = r0.A00()
            r0 = r18
            r0.A0C(r1)
        L_0x07e0:
            r1 = r17
            r0 = r18
            r1.add(r0)
            goto L_0x07a6
        L_0x07e8:
            r0 = r36
            X.1IS r1 = r0.A02     // Catch:{ 197 -> 0x0dc7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ 197 -> 0x0dc7 }
            r4.<init>()     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r0 = "SyncEncryptionHelper/encryptMutations for collectionName: "
            r4.append(r0)     // Catch:{ 197 -> 0x0dc7 }
            r4.append(r2)     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r0 = "; size="
            r4.append(r0)     // Catch:{ 197 -> 0x0dc7 }
            int r0 = r7.size()     // Catch:{ 197 -> 0x0dc7 }
            r4.append(r0)     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r0 = r4.toString()     // Catch:{ 197 -> 0x0dc7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 197 -> 0x0dc7 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ 197 -> 0x0dc7 }
            r5.<init>()     // Catch:{ 197 -> 0x0dc7 }
            X.1A9 r0 = r1.A05     // Catch:{ 197 -> 0x0dc7 }
            r25 = r0
            X.9Va r28 = r25.A05()     // Catch:{ 197 -> 0x0dc7 }
            if (r28 != 0) goto L_0x081f
            X.9Va r28 = r25.A04()     // Catch:{ 197 -> 0x0dc7 }
        L_0x081f:
            r0 = 0
            if (r28 == 0) goto L_0x0db1
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ 197 -> 0x0dc7 }
            r6.<init>()     // Catch:{ 197 -> 0x0dc7 }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ 197 -> 0x0dc7 }
            r8.<init>()     // Catch:{ 197 -> 0x0dc7 }
            r4 = r28
            X.9jo r4 = r4.A01     // Catch:{ 197 -> 0x0dc7 }
            r35 = r4
            r6.add(r4)     // Catch:{ 197 -> 0x0dc7 }
            java.util.Iterator r12 = r7.iterator()     // Catch:{ 197 -> 0x0dc7 }
        L_0x0839:
            boolean r4 = r12.hasNext()     // Catch:{ 197 -> 0x0dc7 }
            if (r4 == 0) goto L_0x08bd
            java.lang.Object r10 = r12.next()     // Catch:{ 197 -> 0x0dc7 }
            X.9k5 r10 = (X.C201669k5) r10     // Catch:{ 197 -> 0x0dc7 }
            X.9jo r4 = r10.A00     // Catch:{ 197 -> 0x0dc7 }
            if (r4 != 0) goto L_0x084d
            r4 = r35
            r10.A00 = r4     // Catch:{ 197 -> 0x0dc7 }
        L_0x084d:
            X.1AC r7 = r1.A09     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r4 = r10.A06()     // Catch:{ 197 -> 0x0dc7 }
            X.9k5 r4 = r7.A0B(r4)     // Catch:{ 197 -> 0x0dc7 }
            if (r4 == 0) goto L_0x089e
            X.9jo r9 = r4.A00     // Catch:{ 197 -> 0x0dc7 }
            X.C18740tg.A06(r9)     // Catch:{ 197 -> 0x0dc7 }
            X.9jo r7 = r10.A00     // Catch:{ 197 -> 0x0dc7 }
            boolean r7 = r9.equals(r7)     // Catch:{ 197 -> 0x0dc7 }
            if (r7 != 0) goto L_0x089e
            X.9fw r9 = r10.A05     // Catch:{ 197 -> 0x0dc7 }
            X.9fw r7 = X.C199769fw.A03     // Catch:{ 197 -> 0x0dc7 }
            if (r9 != r7) goto L_0x08b1
            java.lang.String[] r23 = r4.A0A()     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r21 = r4.A06()     // Catch:{ 197 -> 0x0dc7 }
            int r11 = r4.A03     // Catch:{ 197 -> 0x0dc7 }
            X.9jo r9 = r4.A00     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r7 = r4.A06     // Catch:{ 197 -> 0x0dc7 }
            X.2Lj r4 = new X.2Lj     // Catch:{ 197 -> 0x0dc7 }
            r19 = r4
            r20 = r9
            r22 = r7
            r24 = r11
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r7 = r4.A00     // Catch:{ 197 -> 0x0dc7 }
            r8.add(r7)     // Catch:{ 197 -> 0x0dc7 }
            X.9mH r9 = new X.9mH     // Catch:{ 197 -> 0x0dc7 }
            r9.<init>(r4)     // Catch:{ 197 -> 0x0dc7 }
            X.00I r7 = new X.00I     // Catch:{ 197 -> 0x0dc7 }
            r7.<init>(r4, r9)     // Catch:{ 197 -> 0x0dc7 }
            r5.add(r7)     // Catch:{ 197 -> 0x0dc7 }
            X.9jo r4 = r4.A00     // Catch:{ 197 -> 0x0dc7 }
            r6.add(r4)     // Catch:{ 197 -> 0x0dc7 }
        L_0x089e:
            X.9mH r7 = new X.9mH     // Catch:{ 197 -> 0x0dc7 }
            r7.<init>(r10)     // Catch:{ 197 -> 0x0dc7 }
            X.00I r4 = new X.00I     // Catch:{ 197 -> 0x0dc7 }
            r4.<init>(r10, r7)     // Catch:{ 197 -> 0x0dc7 }
            r5.add(r4)     // Catch:{ 197 -> 0x0dc7 }
            X.9jo r4 = r7.A02     // Catch:{ 197 -> 0x0dc7 }
            r6.add(r4)     // Catch:{ 197 -> 0x0dc7 }
            goto L_0x0839
        L_0x08b1:
            java.lang.String r7 = r10.A06()     // Catch:{ 197 -> 0x0dc7 }
            r8.add(r7)     // Catch:{ 197 -> 0x0dc7 }
            X.9jo r4 = r4.A00     // Catch:{ 197 -> 0x0dc7 }
            r10.A00 = r4     // Catch:{ 197 -> 0x0dc7 }
            goto L_0x089e
        L_0x08bd:
            X.0yC r4 = r1.A0A     // Catch:{ 197 -> 0x0dc7 }
            r29 = r4
            r9 = 2777(0xad9, float:3.891E-42)
            X.0yV r27 = X.C21000yV.A02     // Catch:{ 197 -> 0x0dc7 }
            r7 = r27
            int r12 = X.C20800yB.A00(r7, r4, r9)     // Catch:{ 197 -> 0x0dc7 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ 197 -> 0x0dc7 }
            r11.<init>()     // Catch:{ 197 -> 0x0dc7 }
            r19 = 0
        L_0x08d2:
            int r4 = r11.size()     // Catch:{ 197 -> 0x0dc7 }
            if (r4 >= r12) goto L_0x096f
            X.1AC r13 = r1.A09     // Catch:{ 197 -> 0x0dc7 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ 197 -> 0x0dc7 }
            r10.<init>()     // Catch:{ 197 -> 0x0dc7 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ 197 -> 0x0dc7 }
            r7.<init>()     // Catch:{ 197 -> 0x0dc7 }
            r7.add(r2)     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r4 = java.lang.String.valueOf(r19)     // Catch:{ 197 -> 0x0dc7 }
            r7.add(r4)     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r4 = java.lang.String.valueOf(r12)     // Catch:{ 197 -> 0x0dc7 }
            r7.add(r4)     // Catch:{ 197 -> 0x0dc7 }
            X.18P r4 = r13.A00     // Catch:{ 197 -> 0x0dc7 }
            X.1M0 r9 = r4.get()     // Catch:{ 197 -> 0x0dc7 }
            X.14e r15 = r9.A02     // Catch:{ all -> 0x0963 }
            java.lang.String r14 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE collection_name = ?  ORDER BY epoch ASC, device_id DESC  LIMIT ?, ? "
            java.lang.String[] r4 = X.C19430v1.A0N     // Catch:{ all -> 0x0963 }
            java.lang.Object[] r7 = r7.toArray(r4)     // Catch:{ all -> 0x0963 }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x0963 }
            java.lang.String r4 = "SyncdMutationsStore.SELECT_MUTATIONS_WITH_OLDEST_KEY"
            android.database.Cursor r7 = r15.A09(r14, r4, r7)     // Catch:{ all -> 0x0963 }
            int r4 = r7.getCount()     // Catch:{ all -> 0x0957 }
            if (r4 != 0) goto L_0x0915
            r10 = 0
            goto L_0x0925
        L_0x0915:
            boolean r4 = r7.moveToNext()     // Catch:{ all -> 0x0957 }
            if (r4 == 0) goto L_0x0925
            X.9k5 r4 = X.AnonymousClass1AC.A01(r7, r13)     // Catch:{ all -> 0x0957 }
            if (r4 == 0) goto L_0x0915
            r10.add(r4)     // Catch:{ all -> 0x0957 }
            goto L_0x0915
        L_0x0925:
            r7.close()     // Catch:{ all -> 0x0963 }
            r9.close()     // Catch:{ 197 -> 0x0dc7 }
            if (r10 == 0) goto L_0x096f
            int r19 = r19 + r12
            java.util.Iterator r10 = r10.iterator()     // Catch:{ 197 -> 0x0dc7 }
        L_0x0933:
            boolean r4 = r10.hasNext()     // Catch:{ 197 -> 0x0dc7 }
            if (r4 == 0) goto L_0x08d2
            java.lang.Object r7 = r10.next()     // Catch:{ 197 -> 0x0dc7 }
            X.9k5 r7 = (X.C201669k5) r7     // Catch:{ 197 -> 0x0dc7 }
            X.9jo r9 = r7.A00     // Catch:{ 197 -> 0x0dc7 }
            r4 = r35
            boolean r4 = r4.equals(r9)     // Catch:{ 197 -> 0x0dc7 }
            if (r4 != 0) goto L_0x096f
            java.lang.String r4 = r7.A06()     // Catch:{ 197 -> 0x0dc7 }
            boolean r4 = r8.contains(r4)     // Catch:{ 197 -> 0x0dc7 }
            if (r4 != 0) goto L_0x0933
            r11.add(r7)     // Catch:{ 197 -> 0x0dc7 }
            goto L_0x0933
        L_0x0957:
            r1 = move-exception
            if (r7 == 0) goto L_0x0962
            r7.close()     // Catch:{ all -> 0x095e }
            goto L_0x0962
        L_0x095e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0963 }
        L_0x0962:
            throw r1     // Catch:{ all -> 0x0963 }
        L_0x0963:
            r4 = move-exception
            r9.close()     // Catch:{ all -> 0x0969 }
            goto L_0x0dc6
        L_0x0969:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ 197 -> 0x0dc7 }
            goto L_0x0dc6
        L_0x096f:
            java.util.Iterator r9 = r11.iterator()     // Catch:{ 197 -> 0x0dc7 }
        L_0x0973:
            boolean r4 = r9.hasNext()     // Catch:{ 197 -> 0x0dc7 }
            if (r4 == 0) goto L_0x09b6
            java.lang.Object r7 = r9.next()     // Catch:{ 197 -> 0x0dc7 }
            X.9k5 r7 = (X.C201669k5) r7     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String[] r14 = r7.A0A()     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r12 = r7.A06()     // Catch:{ 197 -> 0x0dc7 }
            int r15 = r7.A03     // Catch:{ 197 -> 0x0dc7 }
            X.9jo r11 = r7.A00     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r13 = r7.A06     // Catch:{ 197 -> 0x0dc7 }
            X.2Lj r10 = new X.2Lj     // Catch:{ 197 -> 0x0dc7 }
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ 197 -> 0x0dc7 }
            X.9mH r8 = new X.9mH     // Catch:{ 197 -> 0x0dc7 }
            r8.<init>(r10)     // Catch:{ 197 -> 0x0dc7 }
            X.00I r4 = new X.00I     // Catch:{ 197 -> 0x0dc7 }
            r4.<init>(r10, r8)     // Catch:{ 197 -> 0x0dc7 }
            r5.add(r4)     // Catch:{ 197 -> 0x0dc7 }
            X.9jo r4 = r8.A02     // Catch:{ 197 -> 0x0dc7 }
            r6.add(r4)     // Catch:{ 197 -> 0x0dc7 }
            r4 = r35
            r7.A00 = r4     // Catch:{ 197 -> 0x0dc7 }
            X.9mH r8 = new X.9mH     // Catch:{ 197 -> 0x0dc7 }
            r8.<init>(r7)     // Catch:{ 197 -> 0x0dc7 }
            X.00I r4 = new X.00I     // Catch:{ 197 -> 0x0dc7 }
            r4.<init>(r7, r8)     // Catch:{ 197 -> 0x0dc7 }
            r5.add(r4)     // Catch:{ 197 -> 0x0dc7 }
            goto L_0x0973
        L_0x09b6:
            r6.size()     // Catch:{ 197 -> 0x0dc7 }
            r4 = r25
            java.util.HashMap r26 = r4.A06(r2, r6)     // Catch:{ 197 -> 0x0dc7 }
            r4 = r26
            boolean r4 = r4.containsValue(r0)     // Catch:{ 197 -> 0x0dc7 }
            if (r4 != 0) goto L_0x0da9
            java.util.ArrayList r25 = new java.util.ArrayList     // Catch:{ 197 -> 0x0dc7 }
            r25.<init>()     // Catch:{ 197 -> 0x0dc7 }
            java.util.ArrayList r24 = new java.util.ArrayList     // Catch:{ 197 -> 0x0dc7 }
            r24.<init>()     // Catch:{ 197 -> 0x0dc7 }
            java.util.ArrayList r23 = new java.util.ArrayList     // Catch:{ 197 -> 0x0dc7 }
            r23.<init>()     // Catch:{ 197 -> 0x0dc7 }
            java.util.ArrayList r22 = new java.util.ArrayList     // Catch:{ 197 -> 0x0dc7 }
            r22.<init>()     // Catch:{ 197 -> 0x0dc7 }
            java.util.HashMap r21 = new java.util.HashMap     // Catch:{ 197 -> 0x0dc7 }
            r21.<init>()     // Catch:{ 197 -> 0x0dc7 }
            r12 = 0
        L_0x09e1:
            int r4 = r5.size()     // Catch:{ 197 -> 0x0dc7 }
            if (r12 >= r4) goto L_0x0be3
            java.lang.Object r4 = r5.get(r12)     // Catch:{ 197 -> 0x0dc7 }
            X.00I r4 = (X.AnonymousClass00I) r4     // Catch:{ 197 -> 0x0dc7 }
            java.lang.Object r11 = r4.A00     // Catch:{ 197 -> 0x0dc7 }
            X.C18740tg.A06(r11)     // Catch:{ 197 -> 0x0dc7 }
            X.9k5 r11 = (X.C201669k5) r11     // Catch:{ 197 -> 0x0dc7 }
            r4 = r24
            r4.add(r11)     // Catch:{ 197 -> 0x0dc7 }
            java.lang.Object r4 = r5.get(r12)     // Catch:{ 197 -> 0x0dc7 }
            X.00I r4 = (X.AnonymousClass00I) r4     // Catch:{ 197 -> 0x0dc7 }
            java.lang.Object r13 = r4.A01     // Catch:{ 197 -> 0x0dc7 }
            X.C18740tg.A06(r13)     // Catch:{ 197 -> 0x0dc7 }
            X.9mH r13 = (X.C202599mH) r13     // Catch:{ 197 -> 0x0dc7 }
            X.9jo r6 = r13.A02     // Catch:{ 197 -> 0x0dc7 }
            r4 = r26
            java.lang.Object r14 = r4.get(r6)     // Catch:{ 197 -> 0x0dc7 }
            X.C18740tg.A06(r14)     // Catch:{ 197 -> 0x0dc7 }
            X.9Va r14 = (X.C195589Va) r14     // Catch:{ 197 -> 0x0dc7 }
            X.1IU r4 = r1.A07     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.1IV r6 = r4.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.9W7 r4 = r14.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.9cp r10 = r6.A00(r4)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            java.lang.String r6 = r13.A04     // Catch:{ 8bd | 8bg -> 0x0db9 }
            java.nio.charset.Charset r4 = X.C19430v1.A0D     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r20 = r6.getBytes(r4)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8SS r15 = r13.A03     // Catch:{ 8bd | 8bg -> 0x0db9 }
            if (r15 == 0) goto L_0x0a8b
            byte[] r7 = r15.A0o()     // Catch:{ 8bd | 8bg -> 0x0db9 }
        L_0x0a2d:
            r4 = 16
            byte[] r19 = X.C18750th.A0H(r4)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = r20
            int r4 = r4.length     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r8 = r7.length     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r7 = 0
            int r4 = -r4
            int r4 = r4 - r8
            int r4 = java.lang.Math.max(r7, r4)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r9 = X.C18750th.A0H(r4)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8R3 r4 = X.AnonymousClass8R3.DEFAULT_INSTANCE     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8NN r8 = r4.A0p()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.AyA r4 = X.C21674AUx.A01     // Catch:{ 8bd | 8bg -> 0x0db9 }
            java.nio.charset.Charset r4 = X.AnonymousClass9BD.A04     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r4 = r6.getBytes(r4)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8I5 r7 = new X.8I5     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r7.<init>(r4)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r8.A0S()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r6 = r8.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8R3 r6 = (X.AnonymousClass8R3) r6     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r4 = r6.bitField0_     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = r4 | 1
            r6.bitField0_ = r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r6.index_ = r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r6 = r9.length     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = 0
            X.8I5 r7 = X.C21674AUx.A01(r9, r4, r6)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r8.A0S()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r6 = r8.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8R3 r6 = (X.AnonymousClass8R3) r6     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r4 = r6.bitField0_     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = r4 | 4
            r6.bitField0_ = r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r6.padding_ = r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r7 = r13.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r8.A0S()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r6 = r8.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8R3 r6 = (X.AnonymousClass8R3) r6     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r4 = r6.bitField0_     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = r4 | 8
            r6.bitField0_ = r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r6.version_ = r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            goto L_0x0a8e
        L_0x0a8b:
            byte[] r7 = X.AnonymousClass1IU.A01     // Catch:{ 8bd | 8bg -> 0x0db9 }
            goto L_0x0a2d
        L_0x0a8e:
            if (r15 == 0) goto L_0x0a9f
            r8.A0S()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r4 = r8.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8R3 r4 = (X.AnonymousClass8R3) r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4.value_ = r15     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r6 = r4.bitField0_     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r6 = r6 | 2
            r4.bitField0_ = r6     // Catch:{ 8bd | 8bg -> 0x0db9 }
        L_0x0a9f:
            X.8Hz r4 = r8.A0R()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r8 = r4.A0o()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r7 = r10.A03     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r6 = 1
            r4 = r19
            byte[] r8 = X.AnonymousClass1IU.A02(r4, r8, r7, r6)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = 2
            byte[][] r4 = new byte[r4][]     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r7 = 0
            r4[r7] = r19     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4[r6] = r8     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r9 = X.C203239na.A05(r4)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.9jo r14 = r14.A01     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.9fw r8 = r13.A01     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r15 = r8.A01     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r4 = r10.A04     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r15 = X.AnonymousClass1IU.A00(r14, r15, r4, r9)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = 2
            byte[][] r4 = new byte[r4][]     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4[r7] = r9     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4[r6] = r15     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r6 = X.C203239na.A05(r4)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r10 = r10.A02     // Catch:{ 8bd | 8bg -> 0x0db9 }
            java.lang.String r9 = "HmacSHA256"
            r4 = r20
            byte[] r4 = X.AnonymousClass1IU.A01(r9, r4, r10)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.9MW r9 = new X.9MW     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r9.<init>(r8, r14, r4, r6)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8O1 r4 = X.AnonymousClass8O1.DEFAULT_INSTANCE     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8NN r4 = r4.A0p()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r6 = r9.A03     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r8 = r6.length     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8I5 r14 = X.C21674AUx.A01(r6, r7, r8)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4.A0S()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r10 = r4.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8O1 r10 = (X.AnonymousClass8O1) r10     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r8 = r10.bitField0_     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r8 = r8 | 1
            r10.bitField0_ = r8     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r10.blob_ = r14     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8O2 r8 = X.AnonymousClass8O2.DEFAULT_INSTANCE     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8NN r14 = r8.A0p()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r10 = r9.A02     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r8 = r10.length     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8I5 r15 = X.C21674AUx.A01(r10, r7, r8)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r14.A0S()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r10 = r14.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8O2 r10 = (X.AnonymousClass8O2) r10     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r8 = r10.bitField0_     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r8 = r8 | 1
            r10.bitField0_ = r8     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r10.blob_ = r15     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8O0 r8 = X.AnonymousClass8O0.DEFAULT_INSTANCE     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8NN r8 = r8.A0p()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.9jo r10 = r9.A01     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r15 = r10.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r10 = r15.length     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8I5 r15 = X.C21674AUx.A01(r15, r7, r10)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r8.A0S()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r10 = r8.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8O0 r10 = (X.AnonymousClass8O0) r10     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r7 = r10.bitField0_     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r7 = r7 | 1
            r10.bitField0_ = r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r10.id_ = r15     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8QF r7 = X.AnonymousClass8QF.DEFAULT_INSTANCE     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8NN r10 = r7.A0p()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r10.A0S()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r7 = r10.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8QF r7 = (X.AnonymousClass8QF) r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r4 = r4.A0R()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8O1 r4 = (X.AnonymousClass8O1) r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4.getClass()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r7.index_ = r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r4 = r7.bitField0_     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = r4 | 1
            r7.bitField0_ = r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r10.A0S()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r7 = r10.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8QF r7 = (X.AnonymousClass8QF) r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r4 = r14.A0R()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8O2 r4 = (X.AnonymousClass8O2) r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4.getClass()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r7.value_ = r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r4 = r7.bitField0_     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = r4 | 2
            r7.bitField0_ = r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r10.A0S()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r4 = r10.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8QF r4 = (X.AnonymousClass8QF) r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r7 = r8.A0R()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8O0 r7 = (X.AnonymousClass8O0) r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r7.getClass()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4.keyId_ = r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r7 = r4.bitField0_     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r7 = r7 | 4
            r4.bitField0_ = r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8PL r4 = X.AnonymousClass8PL.DEFAULT_INSTANCE     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8NN r8 = r4.A0p()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.9fw r4 = r9.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.90T r4 = r4.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r8.A0S()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r7 = r8.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8PL r7 = (X.AnonymousClass8PL) r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r4 = r4.value     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r7.operation_ = r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r4 = r7.bitField0_     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = r4 | 1
            r7.bitField0_ = r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r8.A0S()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r4 = r8.A00     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8PL r4 = (X.AnonymousClass8PL) r4     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r7 = r10.A0R()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8QF r7 = (X.AnonymousClass8QF) r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r7.getClass()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4.record_ = r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r7 = r4.bitField0_     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r7 = r7 | 2
            r4.bitField0_ = r7     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.8Hz r7 = r8.A0R()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = r25
            r4.add(r7)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            byte[] r8 = r9.A04     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r11.A01 = r8     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.9fw r7 = r13.A01     // Catch:{ 8bd | 8bg -> 0x0db9 }
            X.9fw r4 = X.C199769fw.A03     // Catch:{ 8bd | 8bg -> 0x0db9 }
            if (r7 != r4) goto L_0x0bd6
            r4 = r23
            r4.add(r8)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = r22
            r4.add(r6)     // Catch:{ 8bd | 8bg -> 0x0db9 }
        L_0x0bd6:
            java.lang.String r7 = r11.A06()     // Catch:{ 8bd | 8bg -> 0x0db9 }
            r4 = r21
            r4.put(r7, r6)     // Catch:{ 8bd | 8bg -> 0x0db9 }
            int r12 = r12 + 1
            goto L_0x09e1
        L_0x0be3:
            X.1IT r7 = r1.A08     // Catch:{ 197 -> 0x0dc7 }
            byte[] r12 = r7.A07(r2)     // Catch:{ 197 -> 0x0dc7 }
            r6 = 6614(0x19d6, float:9.268E-42)
            r5 = r27
            r4 = r29
            boolean r4 = X.C20800yB.A01(r5, r4, r6)     // Catch:{ 197 -> 0x0dc7 }
            if (r4 == 0) goto L_0x0bfa
            X.39q r0 = new X.39q     // Catch:{ 197 -> 0x0dc7 }
            r0.<init>(r1)     // Catch:{ 197 -> 0x0dc7 }
        L_0x0bfa:
            java.lang.String[] r13 = X.C201839kV.A02(r24)     // Catch:{ 197 -> 0x0dc7 }
            r8 = r0
            r9 = r1
            r10 = r2
            r11 = r23
            byte[] r8 = X.AnonymousClass1IS.A02(r8, r9, r10, r11, r12, r13)     // Catch:{ 197 -> 0x0dc7 }
            boolean r4 = r25.isEmpty()     // Catch:{ 197 -> 0x0dc7 }
            if (r4 == 0) goto L_0x0c26
            X.0wN r9 = r1.A00     // Catch:{ 197 -> 0x0dc7 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 197 -> 0x0dc7 }
            r5.<init>()     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r4 = "name="
            r5.append(r4)     // Catch:{ 197 -> 0x0dc7 }
            r5.append(r2)     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r6 = r5.toString()     // Catch:{ 197 -> 0x0dc7 }
            java.lang.String r5 = "syncd_empty_patch"
            r4 = 0
            r9.A0E(r5, r6, r4)     // Catch:{ 197 -> 0x0dc7 }
        L_0x0c26:
            java.lang.Long r4 = r7.A01(r2)     // Catch:{ 197 -> 0x0dc7 }
            r14 = 1
            if (r4 == 0) goto L_0x0c33
            long r4 = r4.longValue()     // Catch:{ 197 -> 0x0dc7 }
            long r14 = r14 + r4
        L_0x0c33:
            X.1IU r6 = r1.A07     // Catch:{ 197 -> 0x0dc7 }
            r29 = r6
            r30 = r28
            r31 = r2
            r32 = r8
            r33 = r14
            byte[] r7 = r29.A03(r30, r31, r32, r33)     // Catch:{ 197 -> 0x0dc7 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ 197 -> 0x0dc7 }
            r5.<init>()     // Catch:{ 197 -> 0x0dc7 }
            java.util.Iterator r9 = r24.iterator()     // Catch:{ 197 -> 0x0dc7 }
        L_0x0c4c:
            boolean r4 = r9.hasNext()     // Catch:{ 197 -> 0x0dc7 }
            if (r4 == 0) goto L_0x0c5e
            java.lang.Object r4 = r9.next()     // Catch:{ 197 -> 0x0dc7 }
            X.9k5 r4 = (X.C201669k5) r4     // Catch:{ 197 -> 0x0dc7 }
            byte[] r4 = r4.A01     // Catch:{ 197 -> 0x0dc7 }
            r5.add(r4)     // Catch:{ 197 -> 0x0dc7 }
            goto L_0x0c4c
        L_0x0c5e:
            byte[] r12 = X.C203239na.A04(r5)     // Catch:{ 197 -> 0x0dc7 }
            r9 = r6
            r10 = r28
            r11 = r2
            r13 = r7
            byte[] r6 = r9.A04(r10, r11, r12, r13, r14)     // Catch:{ 197 -> 0x0dc7 }
            X.9Sw r5 = new X.9Sw     // Catch:{ 197 -> 0x0dc7 }
            r4 = r24
            r5.<init>(r2, r4, r8)     // Catch:{ 197 -> 0x0dc7 }
            r2 = r25
            r5.A07 = r2     // Catch:{ 197 -> 0x0dc7 }
            r2 = 0
            r5.A04 = r2     // Catch:{ 197 -> 0x0dc7 }
            r5.A0C = r7     // Catch:{ 197 -> 0x0dc7 }
            r5.A0B = r6     // Catch:{ 197 -> 0x0dc7 }
            r2 = r35
            r5.A03 = r2     // Catch:{ 197 -> 0x0dc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ 197 -> 0x0dc7 }
            r5.A06 = r2     // Catch:{ 197 -> 0x0dc7 }
            X.0yf r4 = r1.A02     // Catch:{ 197 -> 0x0dc7 }
            X.0yi r2 = X.C21100yf.A0Y     // Catch:{ 197 -> 0x0dc7 }
            boolean r2 = r4.A09(r2)     // Catch:{ 197 -> 0x0dc7 }
            if (r2 == 0) goto L_0x0ca8
            X.0wQ r2 = r1.A01     // Catch:{ 197 -> 0x0dc7 }
            int r2 = r2.A04()     // Catch:{ 197 -> 0x0dc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ 197 -> 0x0dc7 }
        L_0x0c9b:
            r5.A05 = r2     // Catch:{ 197 -> 0x0dc7 }
            X.0wQ r1 = r1.A01     // Catch:{ 197 -> 0x0dc7 }
            boolean r1 = r1.A0L()     // Catch:{ 197 -> 0x0dc7 }
            r1 = r1 ^ 1
            r5.A08 = r1     // Catch:{ 197 -> 0x0dc7 }
            goto L_0x0caa
        L_0x0ca8:
            r2 = 0
            goto L_0x0c9b
        L_0x0caa:
            if (r0 == 0) goto L_0x0cc0
            byte[] r1 = r0.A03     // Catch:{ 197 -> 0x0dc7 }
            r5.A09 = r1     // Catch:{ 197 -> 0x0dc7 }
            byte[] r1 = r0.A04     // Catch:{ 197 -> 0x0dc7 }
            r5.A0A = r1     // Catch:{ 197 -> 0x0dc7 }
            int r1 = r0.A00     // Catch:{ 197 -> 0x0dc7 }
            r5.A00 = r1     // Catch:{ 197 -> 0x0dc7 }
            int r1 = r0.A02     // Catch:{ 197 -> 0x0dc7 }
            r5.A02 = r1     // Catch:{ 197 -> 0x0dc7 }
            int r0 = r0.A01     // Catch:{ 197 -> 0x0dc7 }
            r5.A01 = r0     // Catch:{ 197 -> 0x0dc7 }
        L_0x0cc0:
            X.37t r9 = r5.A00()
            r0 = r36
            X.0yf r2 = r0.A00
            X.0yh r0 = X.C21100yf.A1T
            int r1 = r2.A04(r0)
            X.0yh r0 = X.C21100yf.A1Y
            int r0 = r2.A04(r0)
            long r6 = (long) r0
            r10 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r10
            X.8Ro r8 = r9.A00
            X.C18740tg.A06(r8)
            r0 = 0
            int r4 = r8.A0k(r0)
            java.util.List r0 = r9.A02
            int r0 = r0.size()
            if (r0 > r1) goto L_0x0cf6
            long r0 = (long) r4
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0cf6
        L_0x0cef:
            r0 = r18
            r0.A0C(r9)
            goto L_0x07e0
        L_0x0cf6:
            long r1 = (long) r4
            r0 = r36
            X.0yC r6 = r0.A03
            r4 = 5097(0x13e9, float:7.142E-42)
            r0 = r27
            int r0 = X.C20800yB.A00(r0, r6, r4)
            long r6 = (long) r0
            long r6 = r6 * r10
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0cef
            X.8NY r0 = X.AnonymousClass8NY.DEFAULT_INSTANCE
            X.8NN r6 = r0.A0p()
            X.B6c r4 = r8.mutations_
            r6.A0S()
            X.8Hz r2 = r6.A00
            X.8NY r2 = (X.AnonymousClass8NY) r2
            X.B6c r1 = r2.mutations_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0d27
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.mutations_ = r1
        L_0x0d27:
            X.C21071A7i.A0O(r4, r1)
            X.5tH r4 = new X.5tH
            r1 = r18
            r0 = r36
            r4.<init>(r1, r0, r5)
            X.1Im r7 = r0.A01
            X.8Hz r5 = r6.A0R()
            X.8NY r5 = (X.AnonymousClass8NY) r5
            r2 = 0
            X.0yF r0 = r7.A01     // Catch:{ IOException -> 0x0dc9 }
            X.0yG r1 = r0.A00     // Catch:{ IOException -> 0x0dc9 }
            java.lang.String r0 = ""
            java.io.File r6 = r1.A01(r0)     // Catch:{ IOException -> 0x0dc9 }
            byte[] r0 = r5.A0o()     // Catch:{ IOException -> 0x0dc9 }
            X.AnonymousClass6YY.A0I(r6, r0)     // Catch:{ IOException -> 0x0dc9 }
            r6.getAbsolutePath()     // Catch:{ IOException -> 0x0dc9 }
            X.B6c r0 = r5.mutations_     // Catch:{ IOException -> 0x0dc9 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x0dc9 }
            r8 = 0
            if (r0 != 0) goto L_0x0d65
            java.lang.String r0 = "external-mutations-uploader: empty external patch"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0dc9 }
            X.0wN r1 = r7.A00     // Catch:{ IOException -> 0x0dc9 }
            java.lang.String r0 = "syncd_empty_external_patch"
            r1.A0E(r0, r2, r8)     // Catch:{ IOException -> 0x0dc9 }
        L_0x0d65:
            r1 = 1
            X.3Ot r0 = new X.3Ot     // Catch:{ IOException -> 0x0dc9 }
            r0.<init>(r8, r8, r1)     // Catch:{ IOException -> 0x0dc9 }
            X.1Gl r23 = X.C25471Gl.A0M     // Catch:{ IOException -> 0x0dc9 }
            android.net.Uri r19 = android.net.Uri.fromFile(r6)     // Catch:{ IOException -> 0x0dc9 }
            r24 = r2
            r25 = r2
            r27 = 0
            r28 = 0
            r20 = r2
            r26 = 0
            r29 = 1
            r21 = r2
            r22 = r0
            X.3Rg r0 = X.C65233Rg.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ IOException -> 0x0dc9 }
            X.1D0 r5 = r7.A02     // Catch:{ IOException -> 0x0dc9 }
            X.6vi r1 = r5.A07(r0, r8)     // Catch:{ IOException -> 0x0dc9 }
            java.lang.String r0 = "mms"
            r1.A0X = r0     // Catch:{ IOException -> 0x0dc9 }
            X.7sj r0 = new X.7sj     // Catch:{ IOException -> 0x0dc9 }
            r13 = 0
            r8 = r0
            r9 = r7
            r10 = r4
            r11 = r1
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0dc9 }
            r1.A06(r0, r2)     // Catch:{ IOException -> 0x0dc9 }
            r5.A0E(r1, r2)     // Catch:{ IOException -> 0x0dc9 }
            java.lang.String r0 = "external-mutations-uploader start media upload"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0dc9 }
            goto L_0x07e0
        L_0x0da9:
            java.lang.String r1 = "Missing keys exception"
            X.54o r4 = new X.54o     // Catch:{ 197 -> 0x0dc7 }
            r4.<init>(r1, r0)     // Catch:{ 197 -> 0x0dc7 }
            goto L_0x0dc6
        L_0x0db1:
            java.lang.String r1 = "Missing active key exception"
            X.54o r4 = new X.54o     // Catch:{ 197 -> 0x0dc7 }
            r4.<init>(r1, r0)     // Catch:{ 197 -> 0x0dc7 }
            goto L_0x0dc6
        L_0x0db9:
            r1 = move-exception
            java.lang.String r0 = "SyncEncryptionHelper/encryptMutations: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 197 -> 0x0dc7 }
            r0 = 10
            X.198 r4 = new X.198     // Catch:{ 197 -> 0x0dc7 }
            r4.<init>(r0, r2)     // Catch:{ 197 -> 0x0dc7 }
        L_0x0dc6:
            throw r4     // Catch:{ 197 -> 0x0dc7 }
        L_0x0dc7:
            r1 = move-exception
            goto L_0x0dd6
        L_0x0dc9:
            r1 = move-exception
            java.lang.String r0 = "external-mutations-uploader"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "prepare-syncd-mutations-helper/startPrepareJob/onError: IOException"
            X.54o r1 = new X.54o
            r1.<init>(r0, r2)
        L_0x0dd6:
            r0 = r18
            r0.A0D(r1)
            goto L_0x07e0
        L_0x0ddd:
            X.8UW r4 = new X.8UW
            r0 = r17
            r4.<init>(r0)
            r1 = 7
            X.411 r0 = new X.411
            r0.<init>(r3, r1)
            r4.A0A(r0)
            r0 = 6
            X.411 r2 = new X.411
            r2.<init>(r3, r0)
            X.1Hk r1 = r4.A00
            r0 = 0
            r1.A03(r2, r0)
            return
        L_0x0dfa:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35171iG.run():void");
    }

    public C35171iG(C20760y7 r2, AnonymousClass196 r3) {
        this.A02 = 0;
        this.A00 = r3;
        this.A01 = r2;
    }

    public C35171iG(C63133Iw r2, AnonymousClass196 r3) {
        this.A02 = 1;
        this.A00 = r3;
        this.A01 = r2;
    }

    public C35171iG(C79593ty r2, AnonymousClass196 r3) {
        this.A02 = 2;
        this.A00 = r3;
        this.A01 = r2;
    }

    public C35171iG(AnonymousClass196 r2, Map map) {
        this.A02 = 3;
        this.A00 = r2;
        this.A01 = map;
    }
}
