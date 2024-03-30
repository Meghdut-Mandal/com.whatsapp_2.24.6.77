package X;

/* renamed from: X.8rP  reason: invalid class name and case insensitive filesystem */
public final class C183818rP extends C19950wm {
    public final AnonymousClass17Y A00;
    public final C20810yC A01;
    public final AnonymousClass1HD A02;
    public final AnonymousClass1HH A03;
    public final C191999Fh A04 = new C191999Fh();
    public volatile C191989Fg A05;
    public volatile boolean A06;

    public void A00() {
        this.A06 = true;
        AnonymousClass1HG r1 = this.A05.A00;
        r1.A00 = null;
        AnonymousClass1HH r12 = r1.A04;
        synchronized (r12) {
            r12.A00 = null;
        }
        interrupt();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r13 = this;
            r0 = 1
            android.os.Process.setThreadPriority(r0)
            r3 = 0
        L_0x0005:
            boolean r0 = r13.A06
            r6 = 276(0x114, float:3.87E-43)
            if (r0 != 0) goto L_0x01a8
            X.1HH r5 = r13.A03     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            monitor-enter(r5)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            java.util.PriorityQueue r2 = r5.A01     // Catch:{ all -> 0x019a }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x001b
            r0 = 5000(0x1388, double:2.4703E-320)
            r5.wait(r0)     // Catch:{ all -> 0x019a }
        L_0x001b:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x019a }
            if (r0 != 0) goto L_0x0028
            java.lang.Object r4 = r2.remove()     // Catch:{ all -> 0x019a }
            X.AUd r4 = (X.C21661AUd) r4     // Catch:{ all -> 0x019a }
            goto L_0x0030
        L_0x0028:
            X.8rP r0 = r5.A00     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x002f
            r0.A00()     // Catch:{ all -> 0x019a }
        L_0x002f:
            r4 = 0
        L_0x0030:
            monitor-exit(r5)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            X.0yC r0 = r13.A01     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            boolean r0 = r0.A0E(r6)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            if (r0 == 0) goto L_0x0061
            if (r4 == 0) goto L_0x0071
            X.9Fh r7 = r13.A04     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            X.9eb r0 = r4.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            int r5 = r0.A06     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            monitor-enter(r7)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            java.util.HashMap r2 = r7.A00     // Catch:{ all -> 0x019d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x019d }
            boolean r0 = r2.containsKey(r1)     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x019d }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x019d }
            goto L_0x005e
        L_0x0055:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x019d }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r5, r0)     // Catch:{ all -> 0x019d }
            r2.put(r1, r0)     // Catch:{ all -> 0x019d }
        L_0x005e:
            monitor-exit(r7)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            r3 = r0
            goto L_0x0071
        L_0x0061:
            if (r3 != 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            X.9eb r0 = r4.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            int r2 = r0.A06     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            int r1 = r0.A05     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
        L_0x0071:
            boolean r0 = r13.A06     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            if (r0 != 0) goto L_0x01a8
            if (r4 == 0) goto L_0x0005
            X.9eb r5 = r4.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            X.1HD r7 = r13.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            monitor-enter(r5)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            android.graphics.Bitmap r0 = r5.A01     // Catch:{ all -> 0x0198 }
            if (r0 != 0) goto L_0x009a
            int r2 = r5.A06     // Catch:{ all -> 0x0198 }
            int r1 = r5.A05     // Catch:{ all -> 0x0198 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0198 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ all -> 0x0198 }
            r5.A01 = r0     // Catch:{ all -> 0x0198 }
            android.graphics.Canvas r6 = new android.graphics.Canvas     // Catch:{ all -> 0x0198 }
            r6.<init>(r0)     // Catch:{ all -> 0x0198 }
            r5.A03 = r6     // Catch:{ all -> 0x0198 }
            android.graphics.Bitmap r2 = r5.A08     // Catch:{ all -> 0x0198 }
            r1 = 0
            r0 = 0
            r6.drawBitmap(r2, r0, r0, r1)     // Catch:{ all -> 0x0198 }
        L_0x009a:
            android.graphics.Bitmap r0 = r5.A01     // Catch:{ all -> 0x019a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x019a }
            android.graphics.Canvas r0 = r5.A03     // Catch:{ all -> 0x019a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x019a }
            int r2 = r5.A00     // Catch:{ all -> 0x019a }
            int r1 = r2 + 1
            int r0 = r5.A07     // Catch:{ all -> 0x019a }
            int r1 = r1 % r0
            r5.A00 = r1     // Catch:{ all -> 0x019a }
            com.facebook.animated.webp.WebPImage r1 = r5.A09     // Catch:{ all -> 0x019a }
            X.9N2 r11 = r1.getFrameInfo(r2)     // Catch:{ all -> 0x019a }
            int r0 = r5.A00     // Catch:{ all -> 0x019a }
            com.facebook.animated.webp.WebPFrame r2 = r1.getFrame((int) r0)     // Catch:{ all -> 0x019a }
            int r0 = r5.A00     // Catch:{ all -> 0x019a }
            X.9N2 r10 = r1.getFrameInfo(r0)     // Catch:{ all -> 0x019a }
            int r6 = r5.A00     // Catch:{ all -> 0x019a }
            if (r6 != 0) goto L_0x00c6
            android.graphics.Bitmap r1 = r5.A08     // Catch:{ all -> 0x019a }
            goto L_0x00f0
        L_0x00c6:
            java.lang.String r0 = r5.A0A     // Catch:{ all -> 0x019a }
            java.lang.StringBuilder r1 = X.C36341k9.A0i(r0)     // Catch:{ all -> 0x019a }
            r1.append(r0)     // Catch:{ all -> 0x019a }
            java.lang.String r0 = "_frame_"
            java.lang.String r8 = X.AnonymousClass000.A0r(r0, r1, r6)     // Catch:{ all -> 0x019a }
            X.16L r0 = r7.A00     // Catch:{ all -> 0x019a }
            X.1SZ r6 = r0.A03()     // Catch:{ all -> 0x019a }
            X.AnonymousClass00C.A08(r6)     // Catch:{ all -> 0x019a }
            java.lang.Object r1 = r6.A09(r8)     // Catch:{ all -> 0x019a }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x019a }
            if (r1 == 0) goto L_0x00f0
            boolean r0 = r1.isRecycled()     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x00f0
            r6.A0C(r8)     // Catch:{ all -> 0x019a }
            r1 = 0
        L_0x00f0:
            r9 = 0
            r8 = 0
            if (r1 == 0) goto L_0x010a
            r5.A02 = r1     // Catch:{ all -> 0x019a }
            android.graphics.Bitmap r0 = r5.A01     // Catch:{ all -> 0x019a }
            r0.eraseColor(r8)     // Catch:{ all -> 0x019a }
            android.graphics.Canvas r6 = r5.A03     // Catch:{ all -> 0x019a }
            android.graphics.Bitmap r1 = r5.A02     // Catch:{ all -> 0x019a }
            r0 = 0
            r6.drawBitmap(r1, r0, r0, r9)     // Catch:{ all -> 0x019a }
            r2.dispose()     // Catch:{ all -> 0x019a }
            android.graphics.Bitmap r6 = r5.A02     // Catch:{ all -> 0x019a }
            goto L_0x0189
        L_0x010a:
            r3.eraseColor(r8)     // Catch:{ all -> 0x019a }
            int r0 = r2.getWidth()     // Catch:{ all -> 0x019a }
            float r0 = (float) r0     // Catch:{ all -> 0x019a }
            float r6 = r5.A04     // Catch:{ all -> 0x019a }
            float r0 = r0 * r6
            double r0 = (double) r0     // Catch:{ all -> 0x019a }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x019a }
            int r12 = (int) r0     // Catch:{ all -> 0x019a }
            int r0 = r2.getHeight()     // Catch:{ all -> 0x019a }
            int r0 = X.C165597tg.A03(r0, r6)     // Catch:{ all -> 0x019a }
            r2.renderFrame(r12, r0, r3)     // Catch:{ all -> 0x019a }
            X.8yX r1 = r11.A04     // Catch:{ all -> 0x019a }
            X.8yX r0 = X.C187788yX.A02     // Catch:{ all -> 0x019a }
            if (r1 != r0) goto L_0x0131
            android.graphics.Canvas r0 = r5.A03     // Catch:{ all -> 0x019a }
            X.C199039eb.A00(r0, r11, r5)     // Catch:{ all -> 0x019a }
        L_0x0131:
            java.lang.Integer r1 = r10.A05     // Catch:{ all -> 0x019a }
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x019a }
            if (r1 != r0) goto L_0x013c
            android.graphics.Canvas r0 = r5.A03     // Catch:{ all -> 0x019a }
            X.C199039eb.A00(r0, r10, r5)     // Catch:{ all -> 0x019a }
        L_0x013c:
            int r1 = r2.getXOffset()     // Catch:{ all -> 0x019a }
            int r0 = r2.getYOffset()     // Catch:{ all -> 0x019a }
            r2.dispose()     // Catch:{ all -> 0x019a }
            android.graphics.Canvas r2 = r5.A03     // Catch:{ all -> 0x019a }
            float r1 = (float) r1     // Catch:{ all -> 0x019a }
            float r1 = r1 * r6
            float r0 = (float) r0     // Catch:{ all -> 0x019a }
            float r0 = r0 * r6
            r2.drawBitmap(r3, r1, r0, r9)     // Catch:{ all -> 0x019a }
            android.graphics.Bitmap r1 = r5.A01     // Catch:{ OutOfMemoryError -> 0x017d }
            android.graphics.Bitmap$Config r0 = r1.getConfig()     // Catch:{ OutOfMemoryError -> 0x017d }
            android.graphics.Bitmap r6 = r1.copy(r0, r8)     // Catch:{ OutOfMemoryError -> 0x017d }
            r5.A02 = r6     // Catch:{ OutOfMemoryError -> 0x017d }
            java.lang.String r0 = r5.A0A     // Catch:{ OutOfMemoryError -> 0x017d }
            int r2 = r5.A00     // Catch:{ OutOfMemoryError -> 0x017d }
            X.C36321k7.A0v(r0, r8, r6)     // Catch:{ OutOfMemoryError -> 0x017d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)     // Catch:{ OutOfMemoryError -> 0x017d }
            java.lang.String r0 = "_frame_"
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r2)     // Catch:{ OutOfMemoryError -> 0x017d }
            boolean r0 = r6.isRecycled()     // Catch:{ OutOfMemoryError -> 0x017d }
            if (r0 != 0) goto L_0x0187
            X.16L r0 = r7.A00     // Catch:{ OutOfMemoryError -> 0x017d }
            X.1SZ r0 = r0.A03()     // Catch:{ OutOfMemoryError -> 0x017d }
            r0.A0D(r1, r6)     // Catch:{ OutOfMemoryError -> 0x017d }
            goto L_0x0187
        L_0x017d:
            r1 = move-exception
            android.graphics.Bitmap r0 = r5.A01     // Catch:{ all -> 0x019a }
            r5.A02 = r0     // Catch:{ all -> 0x019a }
            java.lang.String r0 = "AnimatedWebpRenderer/renderNextFrame/OutofMemoryError: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x019a }
        L_0x0187:
            android.graphics.Bitmap r6 = r5.A02     // Catch:{ all -> 0x019a }
        L_0x0189:
            monitor-exit(r5)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            X.17Y r2 = r13.A00     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            r1 = 19
            X.3wd r0 = new X.3wd     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            r0.<init>(r4, r6, r1)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            r2.A0H(r0)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            goto L_0x0005
        L_0x0198:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x019a }
        L_0x019a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
            goto L_0x019f
        L_0x019d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
        L_0x019f:
            throw r0     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a0 }
        L_0x01a0:
            r1 = move-exception
            java.lang.String r0 = "StickerFramePreloader/FrameLoaderThread failed to load frame "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0005
        L_0x01a8:
            X.0yC r0 = r13.A01
            boolean r0 = r0.A0E(r6)
            if (r0 == 0) goto L_0x01e0
            X.9Fh r4 = r13.A04
            monitor-enter(r4)
            java.util.HashMap r3 = r4.A00     // Catch:{ all -> 0x01dd }
            java.util.Collection r0 = r3.values()     // Catch:{ all -> 0x01dd }
            r0.size()     // Catch:{ all -> 0x01dd }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x01dd }
        L_0x01c0:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01dd }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x01dd }
            if (r1 == 0) goto L_0x01c0
            boolean r0 = r1.isRecycled()     // Catch:{ all -> 0x01dd }
            if (r0 != 0) goto L_0x01c0
            r1.recycle()     // Catch:{ all -> 0x01dd }
            goto L_0x01c0
        L_0x01d8:
            r3.clear()     // Catch:{ all -> 0x01dd }
            monitor-exit(r4)
            return
        L_0x01dd:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x01e0:
            if (r3 == 0) goto L_0x01e5
            r3.recycle()
        L_0x01e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183818rP.run():void");
    }

    public C183818rP(AnonymousClass17Y r2, C20810yC r3, AnonymousClass1HD r4, C191989Fg r5, AnonymousClass1HH r6) {
        super("StickerFramePreloader");
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r6;
        this.A02 = r4;
        this.A05 = r5;
    }
}
