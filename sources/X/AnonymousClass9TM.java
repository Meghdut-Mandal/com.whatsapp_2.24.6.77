package X;

import android.os.Looper;

/* renamed from: X.9TM  reason: invalid class name */
public abstract class AnonymousClass9TM {
    public C166097v1 A00;

    public final C195999Xe A03() {
        C166097v1 r0 = this.A00;
        if (r0 == null) {
            return null;
        }
        return r0.A0B[r0.A00].A00;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
    public java.lang.String toString() {
        /*
            r8 = this;
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            java.io.PrintWriter r4 = new java.io.PrintWriter
            r4.<init>(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sup:MediaStreamState"
            r1.append(r0)
            java.lang.String r0 = ":"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r4.println(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = " total records="
            r2.append(r0)
            X.7v1 r0 = r8.A00
            if (r0 != 0) goto L_0x0089
            r0 = 0
        L_0x002a:
            java.lang.String r0 = X.C36381kD.A10(r2, r0)
            r4.println(r0)
            r6 = 0
        L_0x0032:
            X.7v1 r0 = r8.A00
            if (r0 != 0) goto L_0x007e
            r0 = 0
        L_0x0037:
            if (r6 >= r0) goto L_0x0096
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r0 = " rec["
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = "]: "
            r7.append(r0)
            X.7v1 r0 = r8.A00
            if (r0 != 0) goto L_0x005f
            r0 = 0
        L_0x004f:
            X.C36351kA.A1K(r0, r7)
            java.lang.String r0 = r7.toString()
            r4.println(r0)
            r4.flush()
            int r6 = r6 + 1
            goto L_0x0032
        L_0x005f:
            X.9It r3 = r0.A05
            monitor-enter(r3)
            int r2 = r3.A01     // Catch:{ all -> 0x0093 }
            int r2 = r2 + r6
            r0 = 20
            if (r2 < r0) goto L_0x006a
            int r2 = r2 - r0
        L_0x006a:
            monitor-enter(r3)     // Catch:{ all -> 0x0093 }
            java.util.Vector r1 = r3.A02     // Catch:{ all -> 0x0090 }
            int r0 = r1.size()     // Catch:{ all -> 0x0090 }
            monitor-exit(r3)     // Catch:{ all -> 0x0093 }
            if (r2 < r0) goto L_0x0077
            r0 = 0
        L_0x0075:
            monitor-exit(r3)
            goto L_0x004f
        L_0x0077:
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x0093 }
            X.9SD r0 = (X.AnonymousClass9SD) r0     // Catch:{ all -> 0x0093 }
            goto L_0x0075
        L_0x007e:
            X.9It r1 = r0.A05
            monitor-enter(r1)
            java.util.Vector r0 = r1.A02     // Catch:{ all -> 0x00b9 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b9 }
            monitor-exit(r1)
            goto L_0x0037
        L_0x0089:
            X.9It r1 = r0.A05
            monitor-enter(r1)
            int r0 = r1.A00     // Catch:{ all -> 0x00b9 }
            monitor-exit(r1)
            goto L_0x002a
        L_0x0090:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0093 }
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0096:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "curState="
            r1.append(r0)
            X.9Xe r0 = r8.A03()
            java.lang.String r0 = r0.A00()
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r4.println(r0)
            r4.flush()
            r4.close()
            java.lang.String r0 = r5.toString()
            return r0
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9TM.toString():java.lang.String");
    }

    public AnonymousClass9TM(Looper looper) {
        this.A00 = new C166097v1(looper, this);
    }
}
