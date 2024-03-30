package X;

/* renamed from: X.6LY  reason: invalid class name */
public final class AnonymousClass6LY {
    public final C19770wU A00;
    public final C21060yb A01;
    public final C20810yC A02;
    public final C132366Tg A03;
    public final C25491Gn A04;
    public final C19890wg A05;
    public final AnonymousClass1GX A06;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static final void A00(android.net.Uri r15, X.C121725tc r16, X.AnonymousClass6LY r17) {
        /*
            r8 = r17
            X.6Tg r0 = r8.A03
            r3 = r15
            X.6QO r1 = r0.A03(r15)
            java.io.File r0 = r1.A08()
            r2 = r16
            if (r0 != 0) goto L_0x002b
            X.1GX r4 = r8.A06     // Catch:{ IOException -> 0x0022 }
            java.io.File r0 = r4.A0h(r15)     // Catch:{ IOException -> 0x0022 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0022 }
            java.util.Collection r4 = r2.A00     // Catch:{ all -> 0x001f }
            r4.add(r0)     // Catch:{ all -> 0x001f }
            monitor-exit(r2)     // Catch:{ IOException -> 0x0022 }
            goto L_0x0029
        L_0x001f:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x0022 }
            throw r4     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            monitor-enter(r2)
            java.util.Set r4 = r2.A01     // Catch:{ all -> 0x014b }
            r4.add(r15)     // Catch:{ all -> 0x014b }
            monitor-exit(r2)
        L_0x0029:
            if (r0 == 0) goto L_0x015b
        L_0x002b:
            r1.A0F(r0)
            X.1Gn r4 = r8.A04
            int r7 = X.AnonymousClass6QO.A00(r1, r4)
            r5 = 13
            r4 = 3
            r6 = 1
            if (r7 == r6) goto L_0x015b
            if (r7 == r4) goto L_0x0046
            if (r7 == r5) goto L_0x0046
            monitor-enter(r2)
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x014b }
            r0.add(r15)     // Catch:{ all -> 0x014b }
            goto L_0x0151
        L_0x0046:
            X.0yC r7 = r8.A02
            r4 = 422(0x1a6, float:5.91E-43)
            boolean r12 = r7.A0E(r4)
            java.lang.String r9 = "videotranscoder/isisomedia/"
            java.io.FileInputStream r10 = X.C90524aI.A0U(r0)     // Catch:{ IOException -> 0x0085 }
            r4 = 4
            byte[] r11 = new byte[r4]     // Catch:{ all -> 0x007b }
            r4 = 4
            r10.skip(r4)     // Catch:{ all -> 0x007b }
            r10.read(r11)     // Catch:{ all -> 0x007b }
            byte[] r4 = X.C146526vk.A0c     // Catch:{ all -> 0x007b }
            boolean r4 = java.util.Arrays.equals(r11, r4)     // Catch:{ all -> 0x007b }
            if (r4 != 0) goto L_0x0077
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x007b }
            X.C90464aC.A1A(r0, r9, r5)     // Catch:{ all -> 0x007b }
            java.lang.String r4 = " is not iso base media container"
            X.C36341k9.A1O(r5, r4)     // Catch:{ all -> 0x007b }
            r10.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x0089
        L_0x0077:
            r10.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x009f
        L_0x007b:
            r5 = move-exception
            r10.close()     // Catch:{ all -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch:{ IOException -> 0x0085 }
        L_0x0084:
            throw r5     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            r4 = move-exception
            com.whatsapp.util.Log.w(r9, r4)
        L_0x0089:
            int r4 = X.C146526vk.A02(r12)
            if (r4 == r6) goto L_0x009f
            monitor-enter(r2)
            java.util.Set r4 = r2.A01     // Catch:{ all -> 0x014b }
            r4.add(r15)     // Catch:{ all -> 0x014b }
            monitor-exit(r2)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "MediaFilesLoader/Cannot transcode or trim "
            X.C36321k7.A1J(r15, r4, r5)
        L_0x009f:
            X.0wg r9 = r8.A05
            X.0yb r8 = r8.A01
            java.lang.String r5 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "samsung"
            boolean r4 = r4.equalsIgnoreCase(r5)
            r10 = 0
            if (r4 == 0) goto L_0x00d7
            int r5 = X.AnonymousClass1K2.A02(r8, r9)
            r4 = 2016(0x7e0, float:2.825E-42)
            if (r5 >= r4) goto L_0x00d7
            android.media.MediaCodecList r4 = new android.media.MediaCodecList
            r4.<init>(r10)
            android.media.MediaCodecInfo[] r9 = r4.getCodecInfos()
            int r8 = r9.length
        L_0x00c0:
            if (r10 >= r8) goto L_0x00d7
            r4 = r9[r10]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = X.C90514aH.A0y(r4)
            java.lang.String r4 = "exynos"
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L_0x0128
            int r10 = r10 + 1
            goto L_0x00c0
        L_0x00d7:
            r4 = 5913(0x1719, float:8.286E-42)
            java.lang.String r4 = r7.A09(r4)
            boolean r4 = X.AnonymousClass6YG.A0D(r4)
            if (r4 != 0) goto L_0x0128
            r4 = 2917(0xb65, float:4.088E-42)
            java.lang.String r4 = r7.A09(r4)
            boolean r4 = X.AnonymousClass6YG.A0C(r4)
            if (r4 != 0) goto L_0x0128
            X.83D r13 = new X.83D
            r13.<init>()
            X.9lD r4 = X.C202189lD.A09     // Catch:{ IOException | IllegalArgumentException -> 0x0119 }
            android.net.Uri r8 = android.net.Uri.fromFile(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0119 }
            r9 = 0
            long r11 = r0.length()     // Catch:{ IOException | IllegalArgumentException -> 0x0119 }
            X.9lD r7 = new X.9lD     // Catch:{ IOException | IllegalArgumentException -> 0x0119 }
            r7.<init>(r8, r9, r11)     // Catch:{ IOException | IllegalArgumentException -> 0x0119 }
            long r16 = r13.Bks(r7)     // Catch:{ IOException | IllegalArgumentException -> 0x0119 }
            X.9jm r12 = new X.9jm     // Catch:{ IOException | IllegalArgumentException -> 0x0119 }
            r14 = 0
            r12.<init>(r13, r14, r16)     // Catch:{ IOException | IllegalArgumentException -> 0x0119 }
            r4 = 0
            boolean r4 = X.C196449Zr.A00(r12, r4)     // Catch:{ IOException | IllegalArgumentException -> 0x0119 }
            r13.close()     // Catch:{ IOException -> 0x012a }
            goto L_0x012a
        L_0x0119:
            r5 = move-exception
            java.lang.String r4 = "WaHeroPlayer/canExtractVideo"
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ all -> 0x0123 }
            r13.close()     // Catch:{ IOException -> 0x0128 }
            goto L_0x0128
        L_0x0123:
            r0 = move-exception
            r13.close()     // Catch:{ IOException -> 0x0127 }
        L_0x0127:
            throw r0
        L_0x0128:
            r6 = 0
            goto L_0x012c
        L_0x012a:
            if (r4 == 0) goto L_0x0128
        L_0x012c:
            monitor-enter(r1)
            r1.A0C = r6     // Catch:{ all -> 0x014e }
            monitor-exit(r1)
            X.67y r4 = new X.67y     // Catch:{ 1GL -> 0x013d }
            r4.<init>(r0)     // Catch:{ 1GL -> 0x013d }
            monitor-enter(r1)     // Catch:{ 1GL -> 0x013d }
            r1.A07 = r4     // Catch:{ all -> 0x013a }
            monitor-exit(r1)     // Catch:{ 1GL -> 0x013d }
            return
        L_0x013a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ 1GL -> 0x013d }
            throw r0     // Catch:{ 1GL -> 0x013d }
        L_0x013d:
            r1 = move-exception
            java.lang.String r0 = "MediaFilesLoader/Bad video"
            com.whatsapp.util.Log.e(r0, r1)
            monitor-enter(r2)
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x014b }
            r0.add(r3)     // Catch:{ all -> 0x014b }
            monitor-exit(r2)
            return
        L_0x014b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x014e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0151:
            monitor-exit(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaFilesLoader/Bad type "
            X.C36321k7.A1J(r15, r0, r1)
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6LY.A00(android.net.Uri, X.5tc, X.6LY):void");
    }

    public AnonymousClass6LY(C21060yb r1, C20810yC r2, C132366Tg r3, C25491Gn r4, C19890wg r5, AnonymousClass1GX r6, C19770wU r7) {
        C36321k7.A1B(r7, r2, r6, r4, r3);
        C36321k7.A10(r5, r1);
        this.A00 = r7;
        this.A02 = r2;
        this.A06 = r6;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
        this.A01 = r1;
    }
}
