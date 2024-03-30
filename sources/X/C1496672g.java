package X;

/* renamed from: X.72g  reason: invalid class name and case insensitive filesystem */
public class C1496672g implements Runnable {
    public final int A00;

    public C1496672g(int i) {
        this.A00 = i;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r9 = this;
            int r0 = r9.A00
            if (r0 == 0) goto L_0x0009
            r0 = 1
            X.C201899kg.A00(r0)
            return
        L_0x0009:
            java.util.concurrent.BlockingQueue r0 = X.C97824qK.A03     // Catch:{ InterruptedException -> 0x0009 }
            java.lang.Object r3 = r0.take()     // Catch:{ InterruptedException -> 0x0009 }
            X.5sA r3 = (X.C120845sA) r3     // Catch:{ InterruptedException -> 0x0009 }
            r2 = 0
            java.lang.String r0 = r3.A01     // Catch:{ IOException -> 0x00e2, all -> 0x010f }
            if (r0 != 0) goto L_0x0020
            X.6TY r1 = X.AnonymousClass6TY.A09     // Catch:{ IOException -> 0x00e2, all -> 0x010f }
            monitor-enter(r1)     // Catch:{ IOException -> 0x00e2, all -> 0x010f }
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            goto L_0x00f6
        L_0x001c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            goto L_0x00e1
        L_0x0020:
            X.71y r6 = X.C97824qK.A05     // Catch:{ IOException -> 0x00e2, all -> 0x010f }
            java.lang.String r7 = r3.A01     // Catch:{ IOException -> 0x00e2, all -> 0x010f }
            monitor-enter(r6)     // Catch:{ IOException -> 0x00e2, all -> 0x010f }
            java.io.Writer r0 = r6.A03     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00d8
            X.C1495971y.A05(r7)     // Catch:{ all -> 0x00df }
            java.util.LinkedHashMap r0 = r6.A09     // Catch:{ all -> 0x00df }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x00df }
            X.67g r1 = (X.C1271767g) r1     // Catch:{ all -> 0x00df }
            if (r1 != 0) goto L_0x0062
            X.67g r1 = new X.67g     // Catch:{ all -> 0x00df }
            r1.<init>(r6, r7)     // Catch:{ all -> 0x00df }
            r0.put(r7, r1)     // Catch:{ all -> 0x00df }
        L_0x003e:
            X.63n r5 = new X.63n     // Catch:{ all -> 0x00df }
            r5.<init>(r1, r6)     // Catch:{ all -> 0x00df }
            r1.A01 = r5     // Catch:{ all -> 0x00df }
            java.io.Writer r4 = r6.A03     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "DIRTY "
            r1.append(r0)     // Catch:{ all -> 0x00df }
            r1.append(r7)     // Catch:{ all -> 0x00df }
            r0 = 10
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r0)     // Catch:{ all -> 0x00df }
            r4.write(r0)     // Catch:{ all -> 0x00df }
            java.io.Writer r0 = r6.A03     // Catch:{ all -> 0x00df }
            r0.flush()     // Catch:{ all -> 0x00df }
            goto L_0x0067
        L_0x0062:
            X.63n r0 = r1.A01     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x003e
            goto L_0x00d6
        L_0x0067:
            monitor-exit(r6)     // Catch:{ IOException -> 0x00e2, all -> 0x010f }
            r7 = 0
            X.71y r6 = r5.A04     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            int r4 = r6.A05     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            if (r7 >= r4) goto L_0x00c0
            monitor-enter(r6)     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            X.67g r8 = r5.A02     // Catch:{ all -> 0x00bd }
            X.63n r0 = r8.A01     // Catch:{ all -> 0x00bd }
            if (r0 != r5) goto L_0x00b7
            boolean r0 = r8.A02     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x007f
            boolean[] r1 = r5.A03     // Catch:{ all -> 0x00bd }
            r0 = 1
            r1[r7] = r0     // Catch:{ all -> 0x00bd }
        L_0x007f:
            java.io.File r1 = r8.A01()     // Catch:{ all -> 0x00bd }
            java.io.FileOutputStream r0 = X.C90524aI.A0W(r1)     // Catch:{ FileNotFoundException -> 0x0088 }
            goto L_0x0095
        L_0x0088:
            java.io.File r0 = r6.A06     // Catch:{ all -> 0x00bd }
            r0.mkdirs()     // Catch:{ all -> 0x00bd }
            java.io.FileOutputStream r0 = X.C90524aI.A0W(r1)     // Catch:{ FileNotFoundException -> 0x0092 }
            goto L_0x0095
        L_0x0092:
            java.io.OutputStream r4 = X.C1495971y.A0G     // Catch:{ all -> 0x00bd }
            goto L_0x009a
        L_0x0095:
            X.5Qy r4 = new X.5Qy     // Catch:{ all -> 0x00bd }
            r4.<init>(r5, r0)     // Catch:{ all -> 0x00bd }
        L_0x009a:
            monitor-exit(r6)     // Catch:{ all -> 0x00bd }
            r2 = r4
            byte[] r1 = r3.A02     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            int r0 = r3.A00     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            r4.write(r1, r7, r0)     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            boolean r0 = r5.A01     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            r1 = 1
            if (r0 == 0) goto L_0x00b3
            X.C1495971y.A00(r5, r6, r7)     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            java.lang.String r0 = r8.A03     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            r6.A07(r0)     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
        L_0x00b0:
            r5.A00 = r1     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            goto L_0x00f3
        L_0x00b3:
            X.C1495971y.A00(r5, r6, r1)     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            goto L_0x00b0
        L_0x00b7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00bd }
            r0.<init>()     // Catch:{ all -> 0x00bd }
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00bd }
            goto L_0x00d2
        L_0x00c0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            java.lang.String r0 = "Expected index "
            r1.append(r0)     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            r1.append(r7)     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
            java.lang.String r0 = " to be greater than 0 and less than the maximum value count of "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r4)     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
        L_0x00d2:
            throw r0     // Catch:{ IOException -> 0x00d3, all -> 0x00fb }
        L_0x00d3:
            r4 = r2
            r2 = r5
            goto L_0x00e3
        L_0x00d6:
            monitor-exit(r6)     // Catch:{ IOException -> 0x00e2, all -> 0x010f }
            goto L_0x00f6
        L_0x00d8:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00df:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x00e2, all -> 0x010f }
        L_0x00e1:
            throw r0     // Catch:{ IOException -> 0x00e2, all -> 0x010f }
        L_0x00e2:
            r4 = r2
        L_0x00e3:
            X.6TY r0 = X.AnonymousClass6TY.A0B     // Catch:{ all -> 0x00ff }
            r0.A03()     // Catch:{ all -> 0x00ff }
            if (r2 == 0) goto L_0x00f1
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x00f1
            r2.A00()     // Catch:{ IOException -> 0x00f1 }
        L_0x00f1:
            if (r4 == 0) goto L_0x00f6
        L_0x00f3:
            r4.close()     // Catch:{ IOException -> 0x00f6 }
        L_0x00f6:
            X.C139316ja.A01(r3)
            goto L_0x0009
        L_0x00fb:
            r1 = move-exception
            r4 = r2
            r2 = r5
            goto L_0x0102
        L_0x00ff:
            r1 = move-exception
            if (r2 == 0) goto L_0x0109
        L_0x0102:
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0109
            r2.A00()     // Catch:{ IOException -> 0x0109 }
        L_0x0109:
            if (r4 == 0) goto L_0x0110
            r4.close()     // Catch:{ IOException -> 0x0110 }
            throw r1
        L_0x010f:
            r1 = move-exception
        L_0x0110:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1496672g.run():void");
    }
}
