package X;

/* renamed from: X.87l  reason: invalid class name */
public final class AnonymousClass87l extends AnonymousClass6NZ {
    public final AnonymousClass9CJ A00;
    public final C17530rZ A01;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.AU0 A01(android.graphics.Bitmap.Config r13, int r14, int r15) {
        /*
            r12 = this;
            if (r14 <= 0) goto L_0x0199
            if (r15 <= 0) goto L_0x018e
            int r2 = X.AnonymousClass6IA.A00(r13)
            int r6 = r14 * r15
            int r8 = r6 * r2
            if (r8 <= 0) goto L_0x016b
            X.0rZ r4 = r12.A01
            r3 = r4
            X.A12 r3 = (X.A12) r3
            monitor-enter(r3)
            boolean r0 = r3.A05()     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0021
            X.9QM r0 = r3.A02     // Catch:{ all -> 0x0168 }
            int r1 = r0.A01     // Catch:{ all -> 0x0168 }
            r0 = 0
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            X.AnonymousClass6GV.A01(r0)     // Catch:{ all -> 0x0168 }
            monitor-exit(r3)
            boolean r7 = r3 instanceof X.AnonymousClass87p
            if (r7 == 0) goto L_0x003a
            r0 = r3
            X.87p r0 = (X.AnonymousClass87p) r0
            int[] r2 = r0.A00
            int r1 = r2.length
            r0 = 0
        L_0x0031:
            if (r0 >= r1) goto L_0x003a
            r5 = r2[r0]
            if (r5 >= r8) goto L_0x003b
            int r0 = r0 + 1
            goto L_0x0031
        L_0x003a:
            r5 = r8
        L_0x003b:
            monitor-enter(r3)
            android.util.SparseArray r9 = r3.A01     // Catch:{ all -> 0x0157 }
            java.lang.Object r10 = r9.get(r5)     // Catch:{ all -> 0x0157 }
            X.9LL r10 = (X.AnonymousClass9LL) r10     // Catch:{ all -> 0x0157 }
            if (r10 == 0) goto L_0x0094
            java.lang.Object r2 = r3.A02(r10)     // Catch:{ all -> 0x0165 }
            if (r2 == 0) goto L_0x0094
            java.util.Set r0 = r3.A06     // Catch:{ all -> 0x0165 }
            boolean r0 = r0.add(r2)     // Catch:{ all -> 0x0165 }
            X.AnonymousClass6GV.A01(r0)     // Catch:{ all -> 0x0165 }
            if (r7 == 0) goto L_0x0062
            r0 = r2
            X.B2K r0 = (X.B2K) r0     // Catch:{ all -> 0x0165 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0165 }
            int r5 = r0.BHb()     // Catch:{ all -> 0x0165 }
            goto L_0x006c
        L_0x0062:
            r0 = r2
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0165 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0165 }
            int r5 = r0.getAllocationByteCount()     // Catch:{ all -> 0x0165 }
        L_0x006c:
            X.9QM r1 = r3.A03     // Catch:{ all -> 0x0165 }
            int r0 = r1.A00     // Catch:{ all -> 0x0165 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x0165 }
            int r0 = r1.A01     // Catch:{ all -> 0x0165 }
            int r0 = r0 + r5
            r1.A01 = r0     // Catch:{ all -> 0x0165 }
            X.9QM r0 = r3.A02     // Catch:{ all -> 0x0165 }
            r0.A00(r5)     // Catch:{ all -> 0x0165 }
            X.A12.A00(r3)     // Catch:{ all -> 0x0165 }
            r1 = 2
            X.7m1 r0 = X.C132886Vq.A00     // Catch:{ all -> 0x0165 }
            boolean r0 = r0.BMH(r1)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0091
            java.lang.Class r1 = r3.A05     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "get (reuse) (object, size) = (%x, %s)"
            X.C165587tf.A1G(r1, r2, r0, r5)     // Catch:{ all -> 0x0165 }
        L_0x0091:
            monitor-exit(r3)     // Catch:{ all -> 0x0165 }
            goto L_0x0125
        L_0x0094:
            X.9cW r7 = r3.A04     // Catch:{ all -> 0x0157 }
            int r8 = r7.A01     // Catch:{ all -> 0x0157 }
            X.9QM r1 = r3.A03     // Catch:{ all -> 0x0157 }
            int r2 = r1.A01     // Catch:{ all -> 0x0157 }
            int r0 = r8 - r2
            if (r5 > r0) goto L_0x0159
            int r7 = r7.A02     // Catch:{ all -> 0x0157 }
            X.9QM r11 = r3.A02     // Catch:{ all -> 0x0157 }
            int r0 = r11.A01     // Catch:{ all -> 0x0157 }
            int r2 = r2 + r0
            int r0 = r7 - r2
            if (r5 <= r0) goto L_0x00b0
            int r0 = r7 - r5
            r3.A03(r0)     // Catch:{ all -> 0x0157 }
        L_0x00b0:
            int r2 = r1.A01     // Catch:{ all -> 0x0157 }
            int r0 = r11.A01     // Catch:{ all -> 0x0157 }
            int r2 = r2 + r0
            int r0 = r8 - r2
            if (r5 > r0) goto L_0x0159
            int r0 = r1.A00     // Catch:{ all -> 0x0165 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x0165 }
            int r0 = r1.A01     // Catch:{ all -> 0x0165 }
            int r0 = r0 + r5
            r1.A01 = r0     // Catch:{ all -> 0x0165 }
            if (r10 == 0) goto L_0x00cc
            int r0 = r10.A00     // Catch:{ all -> 0x0165 }
            int r0 = r0 + 1
            r10.A00 = r0     // Catch:{ all -> 0x0165 }
        L_0x00cc:
            monitor-exit(r3)     // Catch:{ all -> 0x0165 }
            r2 = 0
            java.lang.Object r2 = r3.A01(r5)     // Catch:{ all -> 0x00d3 }
            goto L_0x00fe
        L_0x00d3:
            r8 = move-exception
            monitor-enter(r3)
            r1.A00(r5)     // Catch:{ all -> 0x0154 }
            java.lang.Object r10 = r9.get(r5)     // Catch:{ all -> 0x0152 }
            X.9LL r10 = (X.AnonymousClass9LL) r10     // Catch:{ all -> 0x0152 }
            if (r10 == 0) goto L_0x00ed
            int r9 = r10.A00     // Catch:{ all -> 0x0154 }
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1R(r9)
            X.AnonymousClass6GV.A01(r0)     // Catch:{ all -> 0x0154 }
            int r9 = r9 - r1
            r10.A00 = r9     // Catch:{ all -> 0x0154 }
        L_0x00ed:
            monitor-exit(r3)     // Catch:{ all -> 0x0154 }
            java.lang.Class<java.lang.Error> r1 = java.lang.Error.class
            boolean r0 = r1.isInstance(r8)
            if (r0 != 0) goto L_0x014b
            java.lang.Class<java.lang.RuntimeException> r1 = java.lang.RuntimeException.class
            boolean r0 = r1.isInstance(r8)
            if (r0 != 0) goto L_0x014b
        L_0x00fe:
            monitor-enter(r3)
            java.util.Set r0 = r3.A06     // Catch:{ all -> 0x0148 }
            boolean r0 = r0.add(r2)     // Catch:{ all -> 0x0148 }
            X.AnonymousClass6GV.A01(r0)     // Catch:{ all -> 0x0148 }
            boolean r0 = r3.A05()     // Catch:{ all -> 0x0146 }
            if (r0 == 0) goto L_0x0111
            r3.A03(r7)     // Catch:{ all -> 0x0146 }
        L_0x0111:
            X.A12.A00(r3)     // Catch:{ all -> 0x0148 }
            r1 = 2
            X.7m1 r0 = X.C132886Vq.A00     // Catch:{ all -> 0x0148 }
            boolean r0 = r0.BMH(r1)     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0124
            java.lang.Class r1 = r3.A05     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "get (alloc) (object, size) = (%x, %s)"
            X.C165587tf.A1G(r1, r2, r0, r5)     // Catch:{ all -> 0x0148 }
        L_0x0124:
            monitor-exit(r3)     // Catch:{ all -> 0x0148 }
        L_0x0125:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            int r1 = r2.getAllocationByteCount()
            int r0 = X.AnonymousClass6IA.A00(r13)
            int r6 = r6 * r0
            if (r1 < r6) goto L_0x013f
            r2.reconfigure(r14, r15, r13)
            X.9CJ r0 = r12.A00
            X.AxM r1 = r0.A00
            X.AU0 r0 = new X.AU0
            r0.<init>((X.C22867AxM) r1, (X.C22868AxN) r4, (java.lang.Object) r2)
            return r0
        L_0x013f:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0146:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0148 }
        L_0x0148:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0148 }
            throw r0
        L_0x014b:
            java.lang.Object r0 = r1.cast(r8)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0152:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0154 }
            throw r0
        L_0x0157:
            r2 = move-exception
            goto L_0x0164
        L_0x0159:
            int r1 = r1.A01     // Catch:{ all -> 0x0165 }
            X.9QM r0 = r3.A02     // Catch:{ all -> 0x0165 }
            int r0 = r0.A01     // Catch:{ all -> 0x0165 }
            X.Aao r2 = new X.Aao     // Catch:{ all -> 0x0165 }
            r2.<init>(r8, r1, r0, r5)     // Catch:{ all -> 0x0165 }
        L_0x0164:
            throw r2     // Catch:{ all -> 0x0165 }
        L_0x0165:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0165 }
            throw r0
        L_0x0168:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x016b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "size must be > 0: size: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", width: "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = ", height: "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ", pixelSize: "
            java.lang.IllegalStateException r0 = X.C90464aC.A0R(r0, r1, r2)
            throw r0
        L_0x018e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "height must be > 0, height is: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r15)
            throw r0
        L_0x0199:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "width must be > 0, width is: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass87l.A01(android.graphics.Bitmap$Config, int, int):X.AU0");
    }

    public AnonymousClass87l(AnonymousClass9CJ r1, C17530rZ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
