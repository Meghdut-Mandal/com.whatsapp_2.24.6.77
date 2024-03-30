package X;

import java.util.Set;

/* renamed from: X.6UR  reason: invalid class name */
public abstract class AnonymousClass6UR {
    public static final Set A00 = C36441kJ.A16();

    public static Object A00(C125315zi r1, C33131el r2, String str) {
        return A01(r1, r2, str, 14);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static java.lang.Object A01(X.C125315zi r15, X.C33131el r16, java.lang.String r17, int r18) {
        /*
            java.lang.String r2 = "gdrive-retry-task/execute/attempt-"
            java.util.Random r10 = new java.util.Random
            r10.<init>()
            r0 = r18
            long r11 = (long) r0
            r13 = 3600000(0x36ee80, double:1.7786363E-317)
            X.1Cm r9 = new X.1Cm
            r9.<init>(r10, r11, r13)
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00cf }
            java.util.Set r1 = A00     // Catch:{ all -> 0x00cf }
            monitor-enter(r1)     // Catch:{ all -> 0x00cf }
            r1.add(r4)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c9 }
            r1.size()     // Catch:{ all -> 0x00cf }
            r3 = 0
        L_0x0021:
            r8 = 0
            r5 = r16
            if (r16 == 0) goto L_0x0037
            boolean r0 = r5.A00()     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x0037
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "gdrive-retry-task/condition-failed/"
            X.C36321k7.A1K(r5, r0, r1)     // Catch:{ all -> 0x00cf }
            goto L_0x00c5
        L_0x0037:
            r7 = -1
            r6 = r17
            monitor-enter(r9)     // Catch:{ 4yS -> 0x0053 }
            int r0 = r9.A00     // Catch:{ all -> 0x0050 }
            monitor-exit(r9)     // Catch:{ 4yS -> 0x0053 }
            java.lang.Object r5 = r15.A01(r0)     // Catch:{ 4yS -> 0x0053 }
            if (r5 == 0) goto L_0x005d
            if (r0 <= 0) goto L_0x0099
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r0, r2)     // Catch:{ 4yS -> 0x0053 }
            java.lang.String r0 = "/success: "
            X.C36321k7.A1Q(r0, r6, r1)     // Catch:{ 4yS -> 0x0053 }
            goto L_0x0099
        L_0x0050:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ 4yS -> 0x0053 }
            throw r0     // Catch:{ 4yS -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            int r3 = r3 + 1
            java.lang.String r0 = "gdrive-retry-task/execute"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00cf }
            int r7 = r1.retryAfter     // Catch:{ all -> 0x00cf }
        L_0x005d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)     // Catch:{ all -> 0x00cf }
            monitor-enter(r9)     // Catch:{ all -> 0x00cf }
            int r0 = r9.A00     // Catch:{ all -> 0x00cc }
            monitor-exit(r9)     // Catch:{ all -> 0x00cf }
            r1.append(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "/failed: "
            X.C36321k7.A1Q(r0, r6, r1)     // Catch:{ all -> 0x00cf }
            java.lang.Long r5 = r9.A00()     // Catch:{ all -> 0x00cf }
            if (r5 == 0) goto L_0x00a4
            if (r7 <= 0) goto L_0x0080
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00cf }
            long r0 = (long) r7     // Catch:{ all -> 0x00cf }
            long r0 = r5.toMillis(r0)     // Catch:{ all -> 0x00cf }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00cf }
        L_0x0080:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ InterruptedException -> 0x009d }
            java.lang.String r0 = "gdrive/gdrive-retry-task backoff for "
            r1.append(r0)     // Catch:{ InterruptedException -> 0x009d }
            r1.append(r5)     // Catch:{ InterruptedException -> 0x009d }
            java.lang.String r0 = " milliseconds"
            X.C36321k7.A1a(r1, r0)     // Catch:{ InterruptedException -> 0x009d }
            long r0 = r5.longValue()     // Catch:{ InterruptedException -> 0x009d }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x009d }
            goto L_0x0021
        L_0x0099:
            A03(r4)
            return r5
        L_0x009d:
            r1 = move-exception
            java.lang.String r0 = "gdrive-retry-task/interrupted"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x00cf }
            goto L_0x00c5
        L_0x00a4:
            if (r3 <= 0) goto L_0x00c5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "Google Drive failures/total attempts: "
            r1.append(r0)     // Catch:{ all -> 0x00cf }
            r1.append(r3)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x00cf }
            monitor-enter(r9)     // Catch:{ all -> 0x00cf }
            int r0 = r9.A00     // Catch:{ all -> 0x00cc }
            monitor-exit(r9)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = X.C36381kD.A10(r1, r0)     // Catch:{ all -> 0x00cf }
            X.4yJ r0 = new X.4yJ     // Catch:{ all -> 0x00cf }
            r0.<init>(r1)     // Catch:{ all -> 0x00cf }
            goto L_0x00ce
        L_0x00c5:
            A03(r4)
            return r8
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c9 }
            goto L_0x00ce
        L_0x00cc:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00cf }
        L_0x00ce:
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r1 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            A03(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6UR.A01(X.5zi, X.1el, java.lang.String, int):java.lang.Object");
    }

    public static void A02() {
        Set<Thread> set = A00;
        synchronized (set) {
            for (Thread interrupt : set) {
                interrupt.interrupt();
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("gdrive-retry-task/interrupt-active-tasks/size/");
        C36321k7.A1Y(A0u, set.size());
    }

    public static void A03(Thread thread) {
        Set set = A00;
        synchronized (set) {
            set.remove(thread);
        }
        set.size();
    }
}
