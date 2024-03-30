package X;

import java.util.List;

/* renamed from: X.6fM  reason: invalid class name and case insensitive filesystem */
public final class C136966fM implements C162267oJ {
    public Throwable A00;
    public List A01;
    public List A02;
    public final Object A03;
    public final AnonymousClass00S A04;

    public C136966fM(AnonymousClass00S r2) {
        this.A04 = r2;
        this.A03 = C36441kJ.A11();
        this.A01 = AnonymousClass001.A0I();
        this.A02 = AnonymousClass001.A0I();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public java.lang.Object BxV(X.C023509x r9, X.C006302t r10) {
        /*
            r8 = this;
            X.0AR r7 = X.AnonymousClass0AA.A02(r9)
            X.0fG r3 = new X.0fG
            r3.<init>()
            java.lang.Object r6 = r8.A03
            monitor-enter(r6)
            java.lang.Throwable r0 = r8.A00     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0018
            X.03N r0 = X.C90524aI.A0t(r0)     // Catch:{ all -> 0x007e }
            r7.resumeWith(r0)     // Catch:{ all -> 0x007e }
            goto L_0x0078
        L_0x0018:
            X.5nc r0 = new X.5nc     // Catch:{ all -> 0x007e }
            r0.<init>(r7, r10)     // Catch:{ all -> 0x007e }
            r3.element = r0     // Catch:{ all -> 0x007e }
            java.util.List r0 = r8.A01     // Catch:{ all -> 0x007e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007e }
            boolean r2 = X.AnonymousClass000.A1Q(r0)
            java.util.List r1 = r8.A01     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r3.element     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "awaiter"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x0036:
            X.5nc r0 = (X.C118275nc) r0     // Catch:{ all -> 0x007e }
            r1.add(r0)     // Catch:{ all -> 0x007e }
            r1 = r2 ^ 1
            monitor-exit(r6)
            X.7Ti r0 = new X.7Ti
            r0.<init>(r8, r3)
            r7.BL1(r0)
            if (r1 == 0) goto L_0x0079
            X.00S r0 = r8.A04
            if (r0 == 0) goto L_0x0079
            r0.invoke()     // Catch:{ all -> 0x0050 }
            goto L_0x0079
        L_0x0050:
            r5 = move-exception
            monitor-enter(r6)
            java.lang.Throwable r0 = r8.A00     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0078
            r8.A00 = r5     // Catch:{ all -> 0x007e }
            java.util.List r4 = r8.A01     // Catch:{ all -> 0x007e }
            r3 = 0
            int r2 = r4.size()     // Catch:{ all -> 0x007e }
        L_0x005f:
            if (r3 >= r2) goto L_0x0073
            java.lang.Object r0 = r4.get(r3)     // Catch:{ all -> 0x007e }
            X.5nc r0 = (X.C118275nc) r0     // Catch:{ all -> 0x007e }
            X.09x r1 = r0.A00     // Catch:{ all -> 0x007e }
            X.03N r0 = X.C90524aI.A0t(r5)     // Catch:{ all -> 0x007e }
            r1.resumeWith(r0)     // Catch:{ all -> 0x007e }
            int r3 = r3 + 1
            goto L_0x005f
        L_0x0073:
            java.util.List r0 = r8.A01     // Catch:{ all -> 0x007e }
            r0.clear()     // Catch:{ all -> 0x007e }
        L_0x0078:
            monitor-exit(r6)
        L_0x0079:
            java.lang.Object r0 = r7.A0G()
            return r0
        L_0x007e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136966fM.BxV(X.09x, X.02t):java.lang.Object");
    }

    public Object fold(Object obj, C009003v r3) {
        return C90504aG.A0j(obj, this, r3);
    }

    public C005202i get(C005902p r2) {
        return C008803t.A00(this, r2);
    }

    public /* synthetic */ C005902p getKey() {
        return C162267oJ.A00;
    }

    public C005102h minusKey(C005902p r2) {
        return C008803t.A01(this, r2);
    }

    public C005102h plus(C005102h r2) {
        return C008803t.A02(this, r2);
    }

    public C136966fM() {
        this((AnonymousClass00S) null);
    }
}
