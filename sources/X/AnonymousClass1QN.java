package X;

/* renamed from: X.1QN  reason: invalid class name */
public class AnonymousClass1QN {
    public final AnonymousClass163 A00;
    public final C220412q A01;
    public final C232617u A02;
    public final C219712j A03;
    public final AnonymousClass12P A04;
    public final AnonymousClass1QO A05;
    public final C24941Ej A06;
    public final AnonymousClass16E A07;
    public final AnonymousClass12O A08;
    public final AnonymousClass1FV A09;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A00() {
        /*
            r4 = this;
            X.12j r1 = r4.A03
            java.util.Map r0 = r1.A03
            r0.clear()
            java.util.Map r0 = r1.A02
            r0.clear()
            X.1QO r3 = r4.A05
            X.00v r1 = r3.A00
            r0 = -1
            r1.A07(r0)
            X.1QP r0 = r3.A03
            X.00v r1 = r0.A00
            monitor-enter(r1)
            r2 = -1
            r1.A07(r2)     // Catch:{ all -> 0x0091 }
            monitor-exit(r1)     // Catch:{ all -> 0x0091 }
            X.1FN r1 = r3.A02
            X.1FK r0 = r1.A01
            X.00v r0 = r0.A00
            r0.A07(r2)
            X.1FM r0 = r1.A00
            X.00v r0 = r0.A00
            r0.A07(r2)
            X.17u r0 = r4.A02
            java.util.Map r0 = r0.A07
            r0.clear()
            X.1Ej r0 = r4.A06
            r0.A01()
            X.12P r1 = r4.A04
            r0 = 0
            r1.A06()
            r1.A08 = r0
            X.12q r2 = r4.A01
            monitor-enter(r2)
            boolean r0 = r2.A00     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0059
            monitor-enter(r2)     // Catch:{ all -> 0x008e }
            java.util.concurrent.ConcurrentHashMap r0 = X.C220412q.A00(r2)     // Catch:{ all -> 0x0056 }
            r0.clear()     // Catch:{ all -> 0x0056 }
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0056 }
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            goto L_0x0059
        L_0x0056:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x0059:
            monitor-exit(r2)
            X.163 r1 = r4.A00
            monitor-enter(r1)
            java.util.Map r0 = r1.A05     // Catch:{ all -> 0x008b }
            r0.clear()     // Catch:{ all -> 0x008b }
            java.util.Map r0 = r1.A06     // Catch:{ all -> 0x008b }
            r0.clear()     // Catch:{ all -> 0x008b }
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            X.16E r1 = r4.A07
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0B
            if (r0 == 0) goto L_0x0073
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0B
            r0.clear()
        L_0x0073:
            X.12O r1 = r4.A08
            java.lang.Object r2 = r1.A07
            monitor-enter(r2)
            java.util.Map r0 = r1.A08     // Catch:{ all -> 0x008e }
            r0.clear()     // Catch:{ all -> 0x008e }
            java.util.Map r0 = r1.A09     // Catch:{ all -> 0x008e }
            r0.clear()     // Catch:{ all -> 0x008e }
            monitor-exit(r2)
            X.1FV r0 = r4.A09
            java.util.Map r0 = r0.A07
            r0.clear()
            return
        L_0x008b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r0
        L_0x008e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0091:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0091 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QN.A00():void");
    }

    public AnonymousClass1QN(AnonymousClass163 r1, C220412q r2, C232617u r3, C219712j r4, AnonymousClass12P r5, AnonymousClass1QO r6, C24941Ej r7, AnonymousClass16E r8, AnonymousClass12O r9, AnonymousClass1FV r10) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A05 = r6;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r5;
        this.A02 = r3;
        this.A09 = r10;
    }
}
