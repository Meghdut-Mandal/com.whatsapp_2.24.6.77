package X;

/* renamed from: X.1ia  reason: invalid class name and case insensitive filesystem */
public class C35371ia implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C35371ia(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0496, code lost:
        com.whatsapp.util.Log.e(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0499, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x068a, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r14.A0E, 3626) == false) goto L_0x068c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0154, code lost:
        r3.A0H(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0157, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0f01, code lost:
        if (r2 > 0) goto L_0x0e97;
     */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0ea5  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x0eab  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0ed6  */
    /* JADX WARNING: Removed duplicated region for block: B:614:0x1181 A[Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x1182 A[Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:619:0x1199 A[Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r44 = this;
            r2 = r44
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x03e0;
                case 1: goto L_0x0413;
                case 2: goto L_0x042b;
                case 3: goto L_0x0466;
                case 4: goto L_0x04a4;
                case 5: goto L_0x0541;
                case 6: goto L_0x05e3;
                case 7: goto L_0x0601;
                case 8: goto L_0x0634;
                case 9: goto L_0x0f4d;
                case 10: goto L_0x0081;
                case 11: goto L_0x0f78;
                case 12: goto L_0x0fde;
                case 13: goto L_0x0007;
                case 14: goto L_0x0007;
                case 15: goto L_0x1062;
                case 16: goto L_0x1108;
                case 17: goto L_0x00b9;
                case 18: goto L_0x112a;
                case 19: goto L_0x0045;
                case 20: goto L_0x011c;
                case 21: goto L_0x0158;
                case 22: goto L_0x0180;
                case 23: goto L_0x1208;
                case 24: goto L_0x01b8;
                case 25: goto L_0x0247;
                case 26: goto L_0x1242;
                case 27: goto L_0x1269;
                case 28: goto L_0x1280;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r2.A00
            X.19g r6 = (X.C236419g) r6
            java.lang.Object r0 = r2.A01
            X.3SB r0 = (X.AnonymousClass3SB) r0
            java.lang.Object r1 = r2.A02
            X.3Iw r1 = (X.C63133Iw) r1
            java.lang.Object r5 = r2.A03
            X.34a r5 = (X.C594634a) r5
            com.whatsapp.jid.DeviceJid r0 = r0.A07
            X.3FZ r4 = r1.A01
            X.6EZ r3 = X.C133256Xm.A02(r0)
            X.189 r2 = r6.A0F
            com.whatsapp.jid.DeviceJid r1 = X.C133256Xm.A03(r3)
            X.0wQ r0 = r2.A03
            boolean r0 = r0.A0N(r1)
            X.C18740tg.A0B(r0)
            X.AnonymousClass189.A01(r4, r3, r2)
            r0 = 0
            r6.A03 = r0
            X.19g r4 = r5.A01
            X.3Iw r3 = r5.A00
            X.0wk r2 = r4.A0L
            r1 = 41
            X.1j7 r0 = new X.1j7
            r0.<init>(r4, r3, r1)
            r2.execute(r0)
        L_0x0044:
            return
        L_0x0045:
            java.lang.Object r5 = r2.A00
            X.3T1 r5 = (X.AnonymousClass3T1) r5
            java.lang.Object r0 = r2.A01
            X.6Fp r0 = (X.C129166Fp) r0
            java.lang.Object r3 = r2.A02
            X.3L1 r3 = (X.AnonymousClass3L1) r3
            java.lang.Object r4 = r2.A03
            X.1Xk r4 = (X.C29641Xk) r4
            r1 = 1
            byte[] r0 = r0.A0H()
            r5.A1C(r0)
            r3.A09 = r1
            boolean r0 = X.C203369nr.A08(r5)
            if (r0 == 0) goto L_0x007f
            X.1A1 r1 = r4.A0D
            X.3Qa r0 = r5.A1J
            X.3T1 r2 = r1.A03(r0)
            if (r2 == 0) goto L_0x007f
        L_0x006f:
            X.0xM r1 = r4.A04
            r0 = -1
            r1.A0n(r2, r0)
            X.17Y r3 = r4.A02
            r0 = 4
            X.1jB r2 = new X.1jB
            r2.<init>(r4, r5, r0)
            goto L_0x0154
        L_0x007f:
            r2 = r5
            goto L_0x006f
        L_0x0081:
            java.lang.Object r4 = r2.A00
            X.1Xd r4 = (X.C29571Xd) r4
            java.lang.Object r3 = r2.A01
            X.2bT r3 = (X.AnonymousClass2bT) r3
            java.lang.Object r1 = r2.A02
            X.2bM r1 = (X.AnonymousClass2bM) r1
            java.lang.Object r6 = r2.A03
            X.11F r6 = (X.AnonymousClass11F) r6
            X.1Ji r0 = r4.A0S
            long r9 = r0.A00(r3)
            X.1Jd r5 = r4.A0T
            r7 = 74
            r8 = 0
            r5.A0H(r6, r7, r8, r9)
            X.35M r0 = new X.35M
            r0.<init>(r3, r1)
            r5.A0I(r6, r0)
            com.whatsapp.jid.UserJid r1 = r1.A0L()
            X.3Qa r0 = r3.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0044
            if (r1 == 0) goto L_0x0044
            X.1Xq r0 = r4.A0V
            r0.A01(r3, r1)
            return
        L_0x00b9:
            java.lang.Object r4 = r2.A00
            X.0xQ r4 = (X.C20350xQ) r4
            java.lang.Object r8 = r2.A01
            X.147 r8 = (X.AnonymousClass147) r8
            java.lang.Object r3 = r2.A02
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            java.lang.Object r5 = r2.A03
            X.0wy r5 = (X.C20070wy) r5
            X.1PB r2 = r4.A0Q
            X.0wo r0 = r4.A0I
            long r6 = X.C19970wo.A00(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r0
            java.util.ArrayList r0 = r2.A00(r8, r6)
            java.util.Iterator r6 = r0.iterator()
        L_0x00dc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r2 = r6.next()
            X.2bQ r2 = (X.AnonymousClass2bQ) r2
            X.3Qa r0 = r2.A1J
            X.11F r1 = r0.A00
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r1 = X.C222813r.A00(r1)
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x010f
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r5.get(r1)
            X.C18740tg.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x00dc
        L_0x010f:
            r0 = 1
            r2.A07 = r0
            r0 = 0
            r2.A01 = r0
            X.0xM r0 = r4.A0O
            r0.A0k(r2)
            goto L_0x00dc
        L_0x011c:
            java.lang.Object r5 = r2.A00
            X.1a4 r5 = (X.C30351a4) r5
            java.lang.Object r4 = r2.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r3 = r2.A02
            com.whatsapp.jid.PhoneUserJid r3 = (com.whatsapp.jid.PhoneUserJid) r3
            java.lang.Object r2 = r2.A03
            X.11F r2 = (X.AnonymousClass11F) r2
            X.12P r0 = r5.A07
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0044
            boolean r0 = X.AnonymousClass143.A0I(r4)
            if (r0 == 0) goto L_0x0145
            if (r3 == 0) goto L_0x0145
            X.12O r1 = r5.A08
            r0 = r4
            X.13w r0 = (X.C223313w) r0
            r1.A0H(r0, r3)
        L_0x0145:
            X.17e r0 = r5.A0D
            X.11F r1 = r0.BQG(r2)
            X.17Y r3 = r5.A01
            r0 = 36
            X.1j0 r2 = new X.1j0
            r2.<init>(r5, r1, r4, r0)
        L_0x0154:
            r3.A0H(r2)
            return
        L_0x0158:
            java.lang.Object r0 = r2.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Object r4 = r2.A01
            X.2oe r4 = (X.C51952oe) r4
            java.lang.Object r3 = r2.A02
            X.1Uw r3 = (X.C28981Uw) r3
            java.lang.Object r2 = r2.A03
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0170:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r1.next()
            X.4TL r0 = (X.AnonymousClass4TL) r0
            r0.BQf(r3, r4, r2)
            goto L_0x0170
        L_0x0180:
            java.lang.Object r0 = r2.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Object r4 = r2.A02
            com.whatsapp.jid.PhoneUserJid r4 = (com.whatsapp.jid.PhoneUserJid) r4
            java.lang.Object r3 = r2.A03
            X.2pL r3 = (X.C52382pL) r3
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r2 = r0.iterator()
        L_0x0194:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r1 = r2.next()
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r1 = (com.whatsapp.newsletter.NewsletterInfoMembersListViewModel) r1
            X.0wQ r0 = r1.A06
            boolean r0 = r0.A0M(r4)
            if (r0 == 0) goto L_0x01ad
            boolean r0 = r1.A0F
            if (r0 != 0) goto L_0x01ad
            goto L_0x0194
        L_0x01ad:
            X.00s r1 = r1.A03
            X.352 r0 = new X.352
            r0.<init>(r3, r4)
            r1.A0C(r0)
            goto L_0x0194
        L_0x01b8:
            java.util.concurrent.atomic.AtomicInteger r0 = X.C21600zV.A09
            int r3 = r0.getAndIncrement()
            r4 = 0
        L_0x01bf:
            java.lang.Object r1 = r2.A00
            java.util.concurrent.ArrayBlockingQueue r1 = (java.util.concurrent.ArrayBlockingQueue) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0239
            int r9 = r4 + 1
            r0 = 15
            if (r4 >= r0) goto L_0x0239
            java.lang.Object r4 = r1.poll()
            X.0zs r4 = (X.C21830zs) r4
            if (r4 == 0) goto L_0x0044
            java.lang.Object r0 = r2.A03
            X.005 r0 = (X.AnonymousClass005) r0
            java.lang.Object r7 = r0.get()
            X.0zE r7 = (X.C21430zE) r7
            r6 = 916783105(0x36a50001, float:4.9173836E-6)
            r7.markerStart(r6, r3)
            X.0zh r8 = r4.A01
            java.lang.String r1 = r8.BDe()
            java.lang.String r0 = "listener"
            r7.markerAnnotate((int) r6, (int) r3, (java.lang.String) r0, (java.lang.String) r1)
            int r5 = r4.A00
            java.lang.String r0 = "event_type"
            r7.markerAnnotate((int) r6, (int) r3, (java.lang.String) r0, (int) r5)
            X.0zr r4 = r4.A02
            int r1 = r4.A00
            java.lang.String r0 = "marker_id"
            r7.markerAnnotate((int) r6, (int) r3, (java.lang.String) r0, (int) r1)
            r0 = 1
            if (r5 == r0) goto L_0x0206
            goto L_0x020a
        L_0x0206:
            r8.BhB(r4)     // Catch:{ Exception -> 0x0212 }
            goto L_0x020d
        L_0x020a:
            r8.BWT(r4)     // Catch:{ Exception -> 0x0212 }
        L_0x020d:
            r0 = 2
            r7.markerEnd(r6, r3, r0)     // Catch:{ Exception -> 0x0212 }
            goto L_0x0222
        L_0x0212:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x129a }
            if (r1 == 0) goto L_0x021e
            java.lang.String r0 = "fail_reason"
            r7.markerAnnotate((int) r6, (int) r3, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x129a }
        L_0x021e:
            r0 = 3
            r7.markerEnd(r6, r3, r0)     // Catch:{ all -> 0x129a }
        L_0x0222:
            int r0 = r4.A01
            java.lang.Object r1 = r2.A01
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L_0x0237
            r0.decrementAndGet()
        L_0x0237:
            r4 = r9
            goto L_0x01bf
        L_0x0239:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0044
            java.lang.Object r0 = r2.A02
            X.0zI r0 = (X.C21470zI) r0
            r0.BwI()
            return
        L_0x0247:
            java.lang.Object r12 = r2.A00
            X.101 r12 = (X.AnonymousClass101) r12
            java.lang.Object r11 = r2.A01
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r4 = r2.A02
            java.io.File r4 = (java.io.File) r4
            java.lang.Object r8 = r2.A03
            java.util.AbstractCollection r8 = (java.util.AbstractCollection) r8
            java.util.Iterator r2 = r8.iterator()
        L_0x025b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0274
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r0 = new java.io.File
            r0.<init>(r4, r1)
            java.lang.String r0 = r0.getAbsolutePath()
            com.facebook.superpack.AssetDecompressor.sync_file_to_disk(r0)
            goto L_0x025b
        L_0x0274:
            java.lang.String r7 = ".superpack_version"
            java.io.File r3 = new java.io.File
            r3.<init>(r4, r7)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0297 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0297 }
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x028d }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x028d }
            r2.write(r0)     // Catch:{ all -> 0x028d }
            r2.close()     // Catch:{ IOException -> 0x0297 }
            goto L_0x029d
        L_0x028d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0292 }
            goto L_0x0296
        L_0x0292:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0297 }
        L_0x0296:
            throw r1     // Catch:{ IOException -> 0x0297 }
        L_0x0297:
            r1 = move-exception
            java.lang.String r0 = "Could not write decompressed asset metadata"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x029d:
            java.lang.String r0 = r3.getAbsolutePath()
            com.facebook.superpack.AssetDecompressor.sync_file_to_disk(r0)
            java.io.File[] r6 = r4.listFiles()
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L_0x02ab:
            if (r3 >= r5) goto L_0x02c5
            r2 = r6[r3]
            java.lang.String r1 = r2.getName()
            boolean r0 = r8.contains(r1)
            if (r0 != 0) goto L_0x02c2
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L_0x02c2
            r2.delete()
        L_0x02c2:
            int r3 = r3 + 1
            goto L_0x02ab
        L_0x02c5:
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.A06
            r0 = 1
            boolean r0 = r1.compareAndSet(r0, r4)
            if (r0 == 0) goto L_0x0044
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.io.File r1 = r11.getFilesDir()
            java.lang.String r0 = "decompressed"
            java.io.File r6 = new java.io.File
            r6.<init>(r1, r0)
            java.io.File[] r7 = r6.listFiles()
            int r5 = r7.length
            r13 = 0
            r3 = 0
        L_0x02e5:
            if (r3 >= r5) goto L_0x031b
            r2 = r7[r3]
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x02ff
            java.lang.String r1 = r2.getName()
            boolean r0 = r12.A01(r11, r1)
            if (r0 != 0) goto L_0x02fc
            r4.add(r1)
        L_0x02fc:
            int r3 = r3 + 1
            goto L_0x02e5
        L_0x02ff:
            r2.delete()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown file in decompressed assets directory: "
            r1.append(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x02fc
        L_0x031b:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0044
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.Integer[] r16 = X.AnonymousClass101.A08
            r10 = 2
        L_0x0329:
            r0 = r16[r13]
            int r9 = r0.intValue()
            java.util.Iterator r15 = r4.iterator()
        L_0x0333:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x037c
            java.lang.Object r8 = r15.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "assets/compressed/"
            r14.append(r0)
            if (r9 == 0) goto L_0x0363
            r0 = 1
            if (r9 != r0) goto L_0x12b3
            java.lang.String r0 = "strings"
        L_0x0350:
            r14.append(r0)
            java.lang.String r0 = "/"
            r14.append(r0)
            r14.append(r8)
            java.lang.String r0 = r14.toString()
            r7.put(r0, r8)
            goto L_0x0333
        L_0x0363:
            java.lang.String r0 = r12.A00
            if (r0 != 0) goto L_0x0350
            int r5 = com.facebook.superpack.AssetDecompressor.get_architecture()
            java.lang.String r3 = "arm64-v8a"
            java.lang.String r2 = "armeabi-v7a"
            java.lang.String r1 = "x86"
            java.lang.String r0 = "x86_64"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2, r1, r0}
            r0 = r0[r5]
            r12.A00 = r0
            goto L_0x0350
        L_0x037c:
            int r13 = r13 + 1
            if (r13 < r10) goto L_0x0329
            java.lang.String r0 = r11.getPackageCodePath()     // Catch:{ IOException -> 0x03b7 }
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x03b7 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x03b7 }
            java.util.Enumeration r1 = r2.entries()     // Catch:{ all -> 0x03ad }
        L_0x038d:
            boolean r0 = r1.hasMoreElements()     // Catch:{ all -> 0x03ad }
            if (r0 == 0) goto L_0x03a9
            java.lang.Object r0 = r1.nextElement()     // Catch:{ all -> 0x03ad }
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0     // Catch:{ all -> 0x03ad }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x03ad }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x03ad }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03ad }
            if (r0 == 0) goto L_0x038d
            r4.remove(r0)     // Catch:{ all -> 0x03ad }
            goto L_0x038d
        L_0x03a9:
            r2.close()     // Catch:{ IOException -> 0x03b7 }
            goto L_0x03b7
        L_0x03ad:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x03b2 }
            goto L_0x03b6
        L_0x03b2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x03b7 }
        L_0x03b6:
            throw r1     // Catch:{ IOException -> 0x03b7 }
        L_0x03b7:
            java.util.Iterator r5 = r4.iterator()
        L_0x03bb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r4 = new java.io.File
            r4.<init>(r6, r0)
            java.io.File[] r3 = r4.listFiles()
            int r2 = r3.length
            r1 = 0
        L_0x03d2:
            if (r1 >= r2) goto L_0x03dc
            r0 = r3[r1]
            r0.delete()
            int r1 = r1 + 1
            goto L_0x03d2
        L_0x03dc:
            r4.delete()
            goto L_0x03bb
        L_0x03e0:
            java.lang.Object r4 = r2.A00
            X.1DT r4 = (X.AnonymousClass1DT) r4
            java.lang.Object r0 = r2.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r3 = r2.A02
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.Object r2 = r2.A03
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.2Pp r1 = new X.2Pp
            r1.<init>()
            r1.A00 = r0
            X.17X r0 = r4.A08
            java.util.HashSet r0 = r0.A05(r3)
            int r0 = r0.size()
            int r0 = X.AnonymousClass3UK.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            r1.A02 = r2
            X.0yW r0 = r4.A0E
            r0.Bly(r1)
            return
        L_0x0413:
            java.lang.Object r0 = r2.A00
            X.1XY r0 = (X.AnonymousClass1XY) r0
            java.lang.Object r1 = r2.A01
            X.3SC r1 = (X.AnonymousClass3SC) r1
            java.lang.Object r3 = r2.A02
            byte[] r3 = (byte[]) r3
            java.lang.Object r2 = r2.A03
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.1X4 r0 = r0.A02
            r4 = 0
            r5 = 0
            r0.A0C(r1, r2, r3, r4, r5)
            return
        L_0x042b:
            java.lang.Object r4 = r2.A00
            X.1XY r4 = (X.AnonymousClass1XY) r4
            java.lang.Object r5 = r2.A01
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r3 = r2.A02
            X.14r r3 = (X.C225014r) r3
            java.lang.Object r2 = r2.A03
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L_0x045c
            java.lang.String r1 = r5.getMessage()
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x045c
            X.17Y r1 = r4.A01
            r0 = 2131889309(0x7f120c9d, float:1.9413278E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A0D(r3, r0)
        L_0x0459:
            java.lang.String r0 = "SendMedia/sendAnimatedGifResult/e"
            goto L_0x0496
        L_0x045c:
            X.17Y r2 = r4.A01
            r1 = 2131894328(0x7f122038, float:1.9423458E38)
            r0 = 0
            r2.A06(r1, r0)
            goto L_0x0459
        L_0x0466:
            java.lang.Object r4 = r2.A00
            X.1XY r4 = (X.AnonymousClass1XY) r4
            java.lang.Object r5 = r2.A01
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r3 = r2.A02
            X.14r r3 = (X.C225014r) r3
            java.lang.Object r2 = r2.A03
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L_0x049a
            java.lang.String r1 = r5.getMessage()
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x049a
            X.17Y r1 = r4.A01
            r0 = 2131889309(0x7f120c9d, float:1.9413278E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A0D(r3, r0)
        L_0x0494:
            java.lang.String r0 = "SendMedia/sendAudioResult/e "
        L_0x0496:
            com.whatsapp.util.Log.e(r0, r5)
            return
        L_0x049a:
            X.17Y r2 = r4.A01
            r1 = 2131894328(0x7f122038, float:1.9423458E38)
            r0 = 0
            r2.A06(r1, r0)
            goto L_0x0494
        L_0x04a4:
            java.lang.Object r7 = r2.A00
            X.1X4 r7 = (X.AnonymousClass1X4) r7
            java.lang.Object r1 = r2.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            java.lang.Object r6 = r2.A02
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r8 = r2.A03
            X.33E r8 = (X.AnonymousClass33E) r8
            boolean r0 = r1 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0508
            X.2bU r1 = (X.AnonymousClass2bU) r1
            X.3Qj r0 = r1.A01
            X.C18740tg.A06(r0)
            java.lang.String r5 = r0.A0J
            X.0wo r0 = r7.A0K
            long r3 = X.C19970wo.A00(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x04ea
            android.net.Uri r0 = android.net.Uri.parse(r5)
            android.net.Uri$Builder r2 = r0.buildUpon()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "_nc_hot"
            android.net.Uri$Builder r0 = X.C148366yk.A02(r2, r0, r1)
            android.net.Uri r0 = r0.build()
            java.lang.String r5 = r0.toString()
        L_0x04ea:
            java.util.Iterator r2 = r6.iterator()
        L_0x04ee:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0508
            java.lang.Object r1 = r2.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            boolean r0 = r1 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x04ee
            X.2bU r1 = (X.AnonymousClass2bU) r1
            X.3Qj r0 = r1.A01
            X.C18740tg.A06(r0)
            r0.A0J = r5
            goto L_0x04ee
        L_0x0508:
            java.util.Iterator r5 = r6.iterator()
        L_0x050c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x053b
            java.lang.Object r4 = r5.next()
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0535
            X.005 r0 = r7.A1P
            java.lang.Object r3 = r0.get()
            X.1Yg r3 = (X.C29861Yg) r3
            X.0wU r2 = r3.A07
            r1 = 31
            X.1jB r0 = new X.1jB
            r0.<init>(r3, r4, r1)
            r2.Boy(r0)
            goto L_0x050c
        L_0x0535:
            X.0xM r0 = r7.A0X
            r0.A0h(r4)
            goto L_0x050c
        L_0x053b:
            X.3ty r0 = r8.A00
            r0.A0C(r6)
            return
        L_0x0541:
            java.lang.Object r0 = r2.A00
            X.1X4 r0 = (X.AnonymousClass1X4) r0
            java.lang.Object r1 = r2.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            java.lang.Object r3 = r2.A02
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r2.A03
            X.33E r2 = (X.AnonymousClass33E) r2
            X.2bU r1 = (X.AnonymousClass2bU) r1
            java.lang.String r6 = r1.A03
            X.C18740tg.A06(r6)
            X.685 r5 = new X.685
            r5.<init>()
            X.1GH r4 = r0.A0r
            r5.A01 = r4
            r5.A08 = r6
            X.1Gl r4 = X.AnonymousClass6Y1.A02(r1)
            java.lang.String r4 = r4.A02
            r5.A07 = r4
            r4 = 0
            r5.A0A = r4
            X.5JZ r12 = r5.A01()
            X.1BS r5 = r0.A1A
            r5.A0D()
            X.1Gl r4 = X.AnonymousClass6Y1.A02(r1)
            java.lang.String r6 = r4.A02
            r14 = 0
            r4 = 0
            r8 = r14
            r10 = 0
            r9 = 0
            r7 = r14
            X.620 r11 = X.AnonymousClass1BS.A00(r5, r6, r7, r8, r9, r10)
            X.1GD r5 = r0.A0v
            java.lang.String r13 = r1.A03
            X.1BW r6 = r5.A00
            X.1D8 r10 = r5.A04
            X.1BU r9 = r5.A03
            X.1GE r7 = r5.A01
            X.1BV r8 = r5.A02
            X.656 r5 = new X.656
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.6DJ r5 = r5.A00()
            X.5SJ r6 = r5.A02
            X.5SJ r5 = X.AnonymousClass5SJ.COMPLETE
            if (r6 != r5) goto L_0x05c7
            X.33E r6 = new X.33E
            r6.<init>()
            r12 = 4
            X.1ia r5 = new X.1ia
            r7 = r5
            r8 = r0
            r9 = r1
            r10 = r3
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            X.AnonymousClass1X4.A0A(r0, r1, r5, r3, r14)
            X.AnonymousClass00C.A0D(r2, r4)
            r0 = 21
            X.411 r1 = new X.411
            r1.<init>(r2, r0)
            X.3ty r0 = r6.A00
            r0.A0A(r1)
            return
        L_0x05c7:
            X.17Y r6 = r0.A02
            r5 = 49
            X.1j1 r3 = new X.1j1
            r3.<init>((java.lang.Object) r0, (int) r5)
            r6.A0H(r3)
            X.1C4 r0 = r0.A0y
            r0.A02(r1)
            X.09w r1 = X.C023409w.A00
            X.AnonymousClass00C.A0D(r1, r4)
            X.3ty r0 = r2.A00
            r0.A0C(r1)
            return
        L_0x05e3:
            java.lang.Object r4 = r2.A00
            X.1X4 r4 = (X.AnonymousClass1X4) r4
            java.lang.Object r0 = r2.A01
            X.1sS r0 = (X.C39471sS) r0
            java.lang.Object r3 = r2.A02
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r1 = r2.A03
            X.4UX r1 = (X.AnonymousClass4UX) r1
            X.3L1 r0 = r0.A04
            if (r0 == 0) goto L_0x05fa
            r3.A12(r0)
        L_0x05fa:
            r1.Bb0(r3)
            r4.A0U(r3)
            return
        L_0x0601:
            java.lang.Object r6 = r2.A00
            X.3B0 r6 = (X.AnonymousClass3B0) r6
            java.lang.Object r5 = r2.A01
            X.1NG r5 = (X.AnonymousClass1NG) r5
            java.lang.Object r4 = r2.A02
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r3 = r2.A03
            X.4PI r3 = (X.AnonymousClass4PI) r3
            r2 = 1
            r0 = 300(0x12c, double:1.48E-321)
            android.os.SystemClock.sleep(r0)
            java.util.List r0 = r6.A01
            if (r0 != 0) goto L_0x0630
            boolean r1 = r6.A0A
            X.141 r0 = r6.A03
            boolean r0 = r5.A0N(r0, r1)
            if (r0 == 0) goto L_0x0630
            com.whatsapp.jid.UserJid r0 = r6.A04
            X.AnonymousClass00C.A08(r0)
            java.util.ArrayList r0 = r5.A07(r0)
            r6.A01 = r0
        L_0x0630:
            X.AnonymousClass1NG.A04(r4, r3, r5, r6, r2)
            return
        L_0x0634:
            java.lang.Object r14 = r2.A00
            X.1C3 r14 = (X.AnonymousClass1C3) r14
            java.lang.Object r3 = r2.A01
            X.3SB r3 = (X.AnonymousClass3SB) r3
            java.lang.Object r0 = r2.A02
            r16 = r0
            r0 = r16
            X.3I3 r0 = (X.AnonymousClass3I3) r0
            r16 = r0
            java.lang.Object r6 = r2.A03
            java.util.List r6 = (java.util.List) r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "history-sync-manager/startMessageHistorySync for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.DeviceJid r0 = r3.A07
            r43 = r0
            boolean r0 = r3.A0A
            r21 = r0
            r17 = 2
            if (r0 == 0) goto L_0x066c
            r17 = 3
        L_0x066c:
            X.1AB r2 = r14.A03
            if (r16 == 0) goto L_0x0676
            r1 = 2
            r0 = r16
            X.AnonymousClass1AB.A05(r0, r2, r1)
        L_0x0676:
            X.9eT r13 = r3.A06
            if (r13 == 0) goto L_0x068c
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x068c
            X.0yC r2 = r14.A0E
            r1 = 3626(0xe2a, float:5.081E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r42 = 1
            if (r0 != 0) goto L_0x068e
        L_0x068c:
            r42 = 0
        L_0x068e:
            X.1Cz r0 = r14.A0H
            X.4uP r1 = X.C100064uP.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0d08 }
            X.8NN r10 = r1.A0p()     // Catch:{ Exception -> 0x0d08 }
            X.4tx r10 = (X.C99784tx) r10     // Catch:{ Exception -> 0x0d08 }
            X.5UH r1 = X.AnonymousClass5UH.INITIAL_BOOTSTRAP     // Catch:{ Exception -> 0x0d08 }
            r10.A0Y(r1)     // Catch:{ Exception -> 0x0d08 }
            X.1DM r1 = r0.A08     // Catch:{ Exception -> 0x0d08 }
            java.util.HashMap r20 = r1.A09()     // Catch:{ Exception -> 0x0d08 }
            java.util.HashMap r19 = r1.A0A()     // Catch:{ Exception -> 0x0d08 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x0d08 }
            r2.<init>()     // Catch:{ Exception -> 0x0d08 }
            java.util.Iterator r3 = r6.iterator()     // Catch:{ Exception -> 0x0d08 }
        L_0x06b0:
            boolean r1 = r3.hasNext()     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x06c4
            java.lang.Object r1 = r3.next()     // Catch:{ Exception -> 0x0d08 }
            X.36J r1 = (X.AnonymousClass36J) r1     // Catch:{ Exception -> 0x0d08 }
            X.8mb r1 = r1.A00     // Catch:{ Exception -> 0x0d08 }
            X.11F r1 = r1.A06     // Catch:{ Exception -> 0x0d08 }
            r2.add(r1)     // Catch:{ Exception -> 0x0d08 }
            goto L_0x06b0
        L_0x06c4:
            java.util.HashMap r18 = new java.util.HashMap     // Catch:{ Exception -> 0x0d08 }
            r18.<init>()     // Catch:{ Exception -> 0x0d08 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x0d08 }
            r5.<init>()     // Catch:{ Exception -> 0x0d08 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ Exception -> 0x0d08 }
        L_0x06d2:
            boolean r1 = r7.hasNext()     // Catch:{ Exception -> 0x0d08 }
            r4 = 0
            if (r1 == 0) goto L_0x0701
            java.lang.Object r3 = r7.next()     // Catch:{ Exception -> 0x0d08 }
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3     // Catch:{ Exception -> 0x0d08 }
            X.13r r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ Exception -> 0x0d08 }
            com.whatsapp.jid.UserJid r2 = X.C222813r.A00(r3)     // Catch:{ Exception -> 0x0d08 }
            if (r2 == 0) goto L_0x06fb
            X.0wQ r1 = r0.A02     // Catch:{ Exception -> 0x0d08 }
            boolean r1 = r1.A0M(r2)     // Catch:{ Exception -> 0x0d08 }
            if (r1 != 0) goto L_0x06fb
            com.whatsapp.jid.DeviceJid r1 = r2.getPrimaryDevice()     // Catch:{ Exception -> 0x0d08 }
            X.6EZ r1 = X.C133256Xm.A02(r1)     // Catch:{ Exception -> 0x0d08 }
            r5.put(r1, r3)     // Catch:{ Exception -> 0x0d08 }
            goto L_0x06d2
        L_0x06fb:
            r1 = r18
            r1.put(r3, r4)     // Catch:{ Exception -> 0x0d08 }
            goto L_0x06d2
        L_0x0701:
            X.189 r2 = r0.A0A     // Catch:{ Exception -> 0x0d08 }
            java.util.Set r1 = r5.keySet()     // Catch:{ Exception -> 0x0d08 }
            java.util.HashMap r1 = r2.A0J(r1)     // Catch:{ Exception -> 0x0d08 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ Exception -> 0x0d08 }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ Exception -> 0x0d08 }
        L_0x0713:
            boolean r1 = r7.hasNext()     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x073e
            java.lang.Object r1 = r7.next()     // Catch:{ Exception -> 0x0d08 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x0d08 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ Exception -> 0x0d08 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0d08 }
            X.3FZ r1 = (X.AnonymousClass3FZ) r1     // Catch:{ Exception -> 0x0d08 }
            java.lang.Object r2 = r5.get(r2)     // Catch:{ Exception -> 0x0d08 }
            X.C18740tg.A06(r2)     // Catch:{ Exception -> 0x0d08 }
            if (r1 != 0) goto L_0x0734
            r1 = r4
            goto L_0x0738
        L_0x0734:
            X.3IG r1 = r1.A00     // Catch:{ Exception -> 0x0d08 }
            byte[] r1 = r1.A01     // Catch:{ Exception -> 0x0d08 }
        L_0x0738:
            r3 = r18
            r3.put(r2, r1)     // Catch:{ Exception -> 0x0d08 }
            goto L_0x0713
        L_0x073e:
            java.util.Iterator r22 = r6.iterator()     // Catch:{ Exception -> 0x0d08 }
            r3 = 0
            r36 = 0
        L_0x0746:
            boolean r1 = r22.hasNext()     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0c22
            java.lang.Object r23 = r22.next()     // Catch:{ Exception -> 0x0d08 }
            r1 = r23
            X.36J r1 = (X.AnonymousClass36J) r1     // Catch:{ Exception -> 0x0d08 }
            r23 = r1
            X.8mb r9 = r1.A00     // Catch:{ Exception -> 0x0d08 }
            X.11F r8 = r9.A06     // Catch:{ Exception -> 0x0d08 }
            int r1 = r9.A00     // Catch:{ Exception -> 0x0d08 }
            if (r1 <= 0) goto L_0x0765
            X.0yC r2 = r0.A0Q     // Catch:{ Exception -> 0x0d08 }
            r1 = 624(0x270, float:8.74E-43)
            r2.A0E(r1)     // Catch:{ Exception -> 0x0d08 }
        L_0x0765:
            X.4uT r1 = X.C100104uT.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0d08 }
            X.8NN r6 = r1.A0p()     // Catch:{ Exception -> 0x0d08 }
            X.4tv r6 = (X.C99764tv) r6     // Catch:{ Exception -> 0x0d08 }
            X.C18740tg.A06(r8)     // Catch:{ Exception -> 0x0d08 }
            java.lang.String r5 = r8.getRawString()     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            r5.getClass()     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 1
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.id_ = r5     // Catch:{ Exception -> 0x0d08 }
            long r1 = r9.A04     // Catch:{ Exception -> 0x0d08 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r11
            long r1 = java.lang.Math.max(r1, r3)     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r7 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r7 = (X.C100104uT) r7     // Catch:{ Exception -> 0x0d08 }
            int r5 = r7.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r7.bitField0_ = r5     // Catch:{ Exception -> 0x0d08 }
            r7.conversationTimestamp_ = r1     // Catch:{ Exception -> 0x0d08 }
            int r1 = r9.A00     // Catch:{ Exception -> 0x0d08 }
            r7 = 0
            int r5 = java.lang.Math.max(r1, r7)     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 16
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.unreadCount_ = r5     // Catch:{ Exception -> 0x0d08 }
            boolean r5 = r9.A0E     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 32
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.readOnly_ = r5     // Catch:{ Exception -> 0x0d08 }
            boolean r5 = r9.A0D     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.notSpam_ = r5     // Catch:{ Exception -> 0x0d08 }
            int r5 = r9.A00     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r11 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r11
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.unreadMentionCount_ = r5     // Catch:{ Exception -> 0x0d08 }
            r1 = r18
            java.lang.Object r2 = r1.get(r8)     // Catch:{ Exception -> 0x0d08 }
            byte[] r2 = (byte[]) r2     // Catch:{ Exception -> 0x0d08 }
            if (r2 == 0) goto L_0x0809
            X.AyA r1 = X.C21674AUx.A01     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.length     // Catch:{ Exception -> 0x0d08 }
            X.8I5 r5 = X.C21674AUx.A01(r2, r7, r1)     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r11 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r11
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.contactPrimaryIdentityKey_ = r5     // Catch:{ Exception -> 0x0d08 }
        L_0x0809:
            int r5 = r9.A01     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 128(0x80, float:1.794E-43)
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.ephemeralExpiration_ = r5     // Catch:{ Exception -> 0x0d08 }
            boolean r5 = r9.A0C     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.archived_ = r5     // Catch:{ Exception -> 0x0d08 }
            X.12q r15 = r0.A0B     // Catch:{ Exception -> 0x0d08 }
            X.3Qp r5 = r15.A09(r8, r7)     // Catch:{ Exception -> 0x0d08 }
            X.0yC r1 = r0.A0Q     // Catch:{ Exception -> 0x0d08 }
            r25 = r1
            r11 = 7279(0x1c6f, float:1.02E-41)
            X.0yV r24 = X.C21000yV.A02     // Catch:{ Exception -> 0x0d08 }
            r2 = r24
            boolean r1 = X.C20800yB.A01(r2, r1, r11)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0854
            if (r5 == 0) goto L_0x0854
            boolean r11 = r5.A0j     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.locked_ = r11     // Catch:{ Exception -> 0x0d08 }
        L_0x0854:
            long r1 = r9.A02     // Catch:{ Exception -> 0x0d08 }
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x0869
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r4 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r4 = (X.C100104uT) r4     // Catch:{ Exception -> 0x0d08 }
            int r3 = r4.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r3 = r3 | 256(0x100, float:3.59E-43)
            r4.bitField0_ = r3     // Catch:{ Exception -> 0x0d08 }
            r4.ephemeralSettingTimestamp_ = r1     // Catch:{ Exception -> 0x0d08 }
        L_0x0869:
            com.whatsapp.jid.UserJid r1 = r9.A07     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0883
            java.lang.String r3 = r1.getRawString()     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            r3.getClass()     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 2
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.newJid_ = r3     // Catch:{ Exception -> 0x0d08 }
        L_0x0883:
            com.whatsapp.jid.UserJid r1 = r9.A08     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x089d
            java.lang.String r3 = r1.getRawString()     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            r3.getClass()     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 4
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.oldJid_ = r3     // Catch:{ Exception -> 0x0d08 }
        L_0x089d:
            boolean r1 = X.AnonymousClass143.A0G(r8)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x09b7
            java.lang.String r1 = r9.A0A     // Catch:{ Exception -> 0x0d08 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0d08 }
            if (r1 != 0) goto L_0x08b0
            java.lang.String r1 = r9.A0A     // Catch:{ Exception -> 0x0d08 }
            r6.A0V(r1)     // Catch:{ Exception -> 0x0d08 }
        L_0x08b0:
            X.6SZ r1 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ Exception -> 0x0d08 }
            com.whatsapp.jid.GroupJid r3 = X.AnonymousClass6SZ.A00(r8)     // Catch:{ Exception -> 0x0d08 }
            if (r3 == 0) goto L_0x09b7
            boolean r1 = r9.A0E     // Catch:{ Exception -> 0x0d08 }
            if (r1 != 0) goto L_0x08c5
            X.17X r1 = r0.A0D     // Catch:{ Exception -> 0x0d08 }
            java.lang.String r1 = r1.A04(r3, r7)     // Catch:{ Exception -> 0x0d08 }
            r6.A0W(r1)     // Catch:{ Exception -> 0x0d08 }
        L_0x08c5:
            X.16D r11 = r0.A07     // Catch:{ Exception -> 0x0d08 }
            X.141 r4 = r11.A0D(r3)     // Catch:{ Exception -> 0x0d08 }
            boolean r9 = r4.A0r     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r12 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r12
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.suspended_ = r9     // Catch:{ Exception -> 0x0d08 }
            boolean r9 = r15.A0O(r3)     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 4
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.isDefaultSubgroup_ = r9     // Catch:{ Exception -> 0x0d08 }
            X.17X r1 = r0.A0D     // Catch:{ Exception -> 0x0d08 }
            boolean r1 = r1.A0C(r3)     // Catch:{ Exception -> 0x0d08 }
            if (r1 != 0) goto L_0x09b7
            X.3QL r1 = r4.A0K     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0919
            java.lang.String r2 = r1.A03     // Catch:{ Exception -> 0x0d08 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0d08 }
            if (r2 != 0) goto L_0x0919
            java.lang.String r9 = r1.A03     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            r9.getClass()     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r12 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r12
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.description_ = r9     // Catch:{ Exception -> 0x0d08 }
        L_0x0919:
            com.whatsapp.jid.UserJid r1 = r11.A0G(r3)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0936
            java.lang.String r9 = r1.getRawString()     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            r9.getClass()     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 | r11
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.createdBy_ = r9     // Catch:{ Exception -> 0x0d08 }
        L_0x0936:
            java.lang.String r1 = r4.A0V     // Catch:{ Exception -> 0x0d08 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0d08 }
            if (r1 != 0) goto L_0x0956
            java.lang.String r9 = r4.A0V     // Catch:{ Exception -> 0x0d08 }
            r1 = -9223372036854775808
            long r1 = X.AnonymousClass6R8.A01(r9, r1)     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r11 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r11 = (X.C100104uT) r11     // Catch:{ Exception -> 0x0d08 }
            int r9 = r11.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            r9 = r9 | r12
            r11.bitField0_ = r9     // Catch:{ Exception -> 0x0d08 }
            r11.createdAt_ = r1     // Catch:{ Exception -> 0x0d08 }
        L_0x0956:
            int r1 = r15.A05(r3)     // Catch:{ Exception -> 0x0d08 }
            r12 = 0
            r11 = 1
            r9 = 0
            if (r1 != r11) goto L_0x0960
            r9 = 1
        L_0x0960:
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 1
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.isParentGroup_ = r9     // Catch:{ Exception -> 0x0d08 }
            X.1HI r1 = r0.A0V     // Catch:{ Exception -> 0x0d08 }
            r1.A03(r3, r6)     // Catch:{ Exception -> 0x0d08 }
            android.os.Parcelable$Creator r1 = X.AnonymousClass147.CREATOR     // Catch:{ Exception -> 0x0d08 }
            X.147 r2 = X.C65533Sl.A03(r3)     // Catch:{ Exception -> 0x0d08 }
            if (r2 == 0) goto L_0x099a
            X.17c r1 = r0.A0I     // Catch:{ Exception -> 0x0d08 }
            X.147 r1 = r1.A02(r2)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x099a
            java.lang.String r3 = r1.getRawString()     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            r3.getClass()     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 2
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.parentGroupId_ = r3     // Catch:{ Exception -> 0x0d08 }
        L_0x099a:
            X.1EL r1 = r0.A0U     // Catch:{ Exception -> 0x0d08 }
            boolean r1 = r1.A00(r4)     // Catch:{ Exception -> 0x0d08 }
            if (r1 != 0) goto L_0x09a6
            int r1 = r4.A03     // Catch:{ Exception -> 0x0d08 }
            if (r1 != r11) goto L_0x09a7
        L_0x09a6:
            r12 = 1
        L_0x09a7:
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 | r3
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.terminated_ = r12     // Catch:{ Exception -> 0x0d08 }
        L_0x09b7:
            boolean r1 = r8 instanceof com.whatsapp.jid.UserJid     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0b37
            boolean r1 = r8 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x09e2
            r2 = r8
            com.whatsapp.jid.PhoneUserJid r2 = (com.whatsapp.jid.PhoneUserJid) r2     // Catch:{ Exception -> 0x0d08 }
            X.12O r1 = r0.A0K     // Catch:{ Exception -> 0x0d08 }
            X.13w r1 = r1.A09(r2)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0a81
            java.lang.String r3 = r1.getRawString()     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            r3.getClass()     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 128(0x80, float:1.794E-43)
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.lidJid_ = r3     // Catch:{ Exception -> 0x0d08 }
            goto L_0x0a81
        L_0x09e2:
            boolean r1 = X.AnonymousClass143.A0I(r8)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0a81
            r9 = r8
            X.13w r9 = (X.C223313w) r9     // Catch:{ Exception -> 0x0d08 }
            X.16y r4 = r0.A0J     // Catch:{ Exception -> 0x0d08 }
            java.lang.String r3 = r4.A00(r9)     // Catch:{ Exception -> 0x0d08 }
            if (r3 == 0) goto L_0x0a02
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 8
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.displayName_ = r3     // Catch:{ Exception -> 0x0d08 }
        L_0x0a02:
            java.lang.String r3 = r4.A01(r9)     // Catch:{ Exception -> 0x0d08 }
            if (r3 == 0) goto L_0x0a17
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 256(0x100, float:3.59E-43)
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.username_ = r3     // Catch:{ Exception -> 0x0d08 }
        L_0x0a17:
            X.12O r1 = r0.A0K     // Catch:{ Exception -> 0x0d08 }
            com.whatsapp.jid.PhoneUserJid r1 = r1.A0A(r9)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0a35
            java.lang.String r3 = r1.getRawString()     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            r3.getClass()     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 16
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.pnJid_ = r3     // Catch:{ Exception -> 0x0d08 }
        L_0x0a35:
            X.1FV r4 = r0.A0L     // Catch:{ Exception -> 0x0d08 }
            java.lang.Boolean r1 = r4.A06(r9)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0a50
            boolean r3 = r1.booleanValue()     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 32
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.shareOwnPn_ = r3     // Catch:{ Exception -> 0x0d08 }
        L_0x0a50:
            boolean r3 = r4.A0A(r9)     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 64
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.pnhDuplicateLidThread_ = r3     // Catch:{ Exception -> 0x0d08 }
            X.3Qp r1 = r15.A09(r9, r7)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0a81
            X.2oy r1 = r1.A0Z     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0a81
            java.lang.String r3 = r1.origin     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            r3.getClass()     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField1_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 512(0x200, float:7.175E-43)
            r2.bitField1_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.lidOriginType_ = r3     // Catch:{ Exception -> 0x0d08 }
        L_0x0a81:
            if (r5 == 0) goto L_0x0b37
            r1 = r20
            java.lang.Object r4 = r1.get(r8)     // Catch:{ Exception -> 0x0d08 }
            X.9Ha r4 = (X.C192449Ha) r4     // Catch:{ Exception -> 0x0d08 }
            if (r4 == 0) goto L_0x0aba
            byte[] r2 = r4.A01     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.length     // Catch:{ Exception -> 0x0d08 }
            X.8I5 r3 = X.C21674AUx.A01(r2, r7, r1)     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r9 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r9
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.tcToken_ = r3     // Catch:{ Exception -> 0x0d08 }
            java.lang.Long r1 = r4.A00     // Catch:{ Exception -> 0x0d08 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r4 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r4 = (X.C100104uT) r4     // Catch:{ Exception -> 0x0d08 }
            int r3 = r4.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r9 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r9
            r4.bitField0_ = r3     // Catch:{ Exception -> 0x0d08 }
            r4.tcTokenTimestamp_ = r1     // Catch:{ Exception -> 0x0d08 }
        L_0x0aba:
            r1 = r19
            java.lang.Object r1 = r1.get(r8)     // Catch:{ Exception -> 0x0d08 }
            X.5pv r1 = (X.C119505pv) r1     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0adc
            java.lang.Long r1 = r1.A01     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0adc
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r4 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r4 = (X.C100104uT) r4     // Catch:{ Exception -> 0x0d08 }
            int r3 = r4.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r8 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r8
            r4.bitField0_ = r3     // Catch:{ Exception -> 0x0d08 }
            r4.tcTokenSenderTimestamp_ = r1     // Catch:{ Exception -> 0x0d08 }
        L_0x0adc:
            X.8SK r1 = X.AnonymousClass8SK.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0d08 }
            X.8NN r3 = r1.A0p()     // Catch:{ Exception -> 0x0d08 }
            X.8NB r3 = (X.AnonymousClass8NB) r3     // Catch:{ Exception -> 0x0d08 }
            X.3un r1 = r5.A0b     // Catch:{ Exception -> 0x0d08 }
            int r2 = r1.disappearingMessagesInitiator     // Catch:{ Exception -> 0x0d08 }
            r1 = 1
            if (r2 == r1) goto L_0x0af1
            r1 = 2
            if (r2 == r1) goto L_0x0af4
            X.90o r1 = X.C1887490o.CHANGED_IN_CHAT     // Catch:{ Exception -> 0x0d08 }
            goto L_0x0af6
        L_0x0af1:
            X.90o r1 = X.C1887490o.INITIATED_BY_ME     // Catch:{ Exception -> 0x0d08 }
            goto L_0x0af6
        L_0x0af4:
            X.90o r1 = X.C1887490o.INITIATED_BY_OTHER     // Catch:{ Exception -> 0x0d08 }
        L_0x0af6:
            r3.A0U(r1)     // Catch:{ Exception -> 0x0d08 }
            X.3Id r4 = r5.A0a     // Catch:{ Exception -> 0x0d08 }
            if (r4 == 0) goto L_0x0b1d
            r5 = 5309(0x14bd, float:7.44E-42)
            r2 = r24
            r1 = r25
            boolean r1 = X.C20800yB.A01(r2, r1, r5)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0b1d
            int r1 = r4.A00     // Catch:{ Exception -> 0x0d08 }
            X.919 r1 = X.AnonymousClass9Zc.A01(r1)     // Catch:{ Exception -> 0x0d08 }
            r3.A0V(r1)     // Catch:{ Exception -> 0x0d08 }
            java.lang.Boolean r1 = r4.A01     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0b1d
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0d08 }
            r3.A0W(r1)     // Catch:{ Exception -> 0x0d08 }
        L_0x0b1d:
            X.8Hz r1 = r3.A0R()     // Catch:{ Exception -> 0x0d08 }
            X.8SK r1 = (X.AnonymousClass8SK) r1     // Catch:{ Exception -> 0x0d08 }
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r2 = (X.C100104uT) r2     // Catch:{ Exception -> 0x0d08 }
            r1.getClass()     // Catch:{ Exception -> 0x0d08 }
            r2.disappearingMode_ = r1     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r3 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r3
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
        L_0x0b37:
            r6.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r3 = r6.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uT r3 = (X.C100104uT) r3     // Catch:{ Exception -> 0x0d08 }
            r2 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r3.bitField1_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r3.bitField1_ = r1     // Catch:{ Exception -> 0x0d08 }
            r3.commentsCount_ = r2     // Catch:{ Exception -> 0x0d08 }
            r1 = r23
            java.util.List r5 = r1.A02     // Catch:{ Exception -> 0x0d08 }
            int r1 = r5.size()     // Catch:{ Exception -> 0x0d08 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x0d08 }
            long r36 = r36 + r1
            boolean r1 = r5.isEmpty()     // Catch:{ Exception -> 0x0d08 }
            if (r1 != 0) goto L_0x0ba9
            X.19g r2 = r0.A0M     // Catch:{ Exception -> 0x0d08 }
            int r1 = r43.getDevice()     // Catch:{ Exception -> 0x0d08 }
            X.3SB r1 = r2.A08(r1)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0b6f
            X.9eT r1 = r1.A06     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0b6f
            boolean r1 = r1.A06     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0b6f
            r7 = 1
        L_0x0b6f:
            X.5SH r1 = X.AnonymousClass5SH.FOR_COMPANION_SYNC     // Catch:{ Exception -> 0x0d08 }
            X.63Y r1 = X.C110955bV.A00(r1)     // Catch:{ Exception -> 0x0d08 }
            r1.A03 = r7     // Catch:{ Exception -> 0x0d08 }
            X.6CO r4 = r1.A00()     // Catch:{ Exception -> 0x0d08 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ Exception -> 0x0d08 }
            r3.<init>()     // Catch:{ Exception -> 0x0d08 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0d08 }
        L_0x0b84:
            boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0ba0
            java.lang.Object r2 = r5.next()     // Catch:{ Exception -> 0x0d08 }
            X.3T1 r2 = (X.AnonymousClass3T1) r2     // Catch:{ Exception -> 0x0d08 }
            X.1HI r1 = r0.A0V     // Catch:{ Exception -> 0x0b99 }
            r1.A04(r2, r3)     // Catch:{ Exception -> 0x0b99 }
            r1.A05(r4, r6, r2)     // Catch:{ Exception -> 0x0b99 }
            goto L_0x0b84
        L_0x0b99:
            r2 = move-exception
            java.lang.String r1 = "history-sync-send-methods/send-initial-bootstrap addMessage exception"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x0d08 }
            goto L_0x0b84
        L_0x0ba0:
            X.1HI r1 = r0.A0V     // Catch:{ Exception -> 0x0d08 }
            java.util.ArrayList r1 = r1.A01(r3)     // Catch:{ Exception -> 0x0d08 }
            r10.A0Z(r1)     // Catch:{ Exception -> 0x0d08 }
        L_0x0ba9:
            r1 = r23
            java.lang.Long r4 = r1.A01     // Catch:{ Exception -> 0x0d08 }
            java.lang.String r1 = "history-sync-send-methods/setEndOfHistoryStatusForInitialSync"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0d08 }
            if (r4 != 0) goto L_0x0bb7
            X.5UB r1 = X.AnonymousClass5UB.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY     // Catch:{ Exception -> 0x0d08 }
            goto L_0x0bd8
        L_0x0bb7:
            X.1Cy r3 = r0.A05     // Catch:{ Exception -> 0x0d08 }
            r2 = 2
            if (r21 == 0) goto L_0x0bbd
            r2 = 3
        L_0x0bbd:
            r1 = r21
            long r11 = r3.A00(r13, r2, r1)     // Catch:{ Exception -> 0x0d08 }
            long r7 = r4.longValue()     // Catch:{ Exception -> 0x0d08 }
            X.0wo r1 = r0.A09     // Catch:{ Exception -> 0x0d08 }
            long r3 = X.C19970wo.A00(r1)     // Catch:{ Exception -> 0x0d08 }
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r11 * r1
            long r3 = r3 - r11
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0bdb
            X.5UB r1 = X.AnonymousClass5UB.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY     // Catch:{ Exception -> 0x0d08 }
        L_0x0bd8:
            r6.A0U(r1)     // Catch:{ Exception -> 0x0d08 }
        L_0x0bdb:
            X.8Hz r1 = r6.A0R()     // Catch:{ Exception -> 0x0d08 }
            X.4uT r1 = (X.C100104uT) r1     // Catch:{ Exception -> 0x0d08 }
            r10.A0X(r1)     // Catch:{ Exception -> 0x0d08 }
            X.17V r5 = r0.A0S     // Catch:{ Exception -> 0x0d08 }
            java.util.Random r4 = r0.A0Z     // Catch:{ Exception -> 0x0d08 }
            long r1 = r5.A02(r4)     // Catch:{ Exception -> 0x0d08 }
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r1 % r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r6
            int r3 = (int) r1     // Catch:{ Exception -> 0x0d08 }
            r10.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r10.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uP r2 = (X.C100064uP) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 32
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.threadDsTimeframeOffset_ = r3     // Catch:{ Exception -> 0x0d08 }
            byte[] r3 = r5.A05(r4)     // Catch:{ Exception -> 0x0d08 }
            X.AyA r1 = X.C21674AUx.A01     // Catch:{ Exception -> 0x0d08 }
            int r2 = r3.length     // Catch:{ Exception -> 0x0d08 }
            r1 = 0
            X.8I5 r3 = X.C21674AUx.A01(r3, r1, r2)     // Catch:{ Exception -> 0x0d08 }
            r10.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r10.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uP r2 = (X.C100064uP) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 16
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r2.threadIdUserSecret_ = r3     // Catch:{ Exception -> 0x0d08 }
            r3 = 0
            goto L_0x0746
        L_0x0c22:
            X.0v5 r1 = r0.A00     // Catch:{ Exception -> 0x0d08 }
            java.lang.Object r5 = r1.A03()     // Catch:{ Exception -> 0x0d08 }
            X.1HX r5 = (X.AnonymousClass1HX) r5     // Catch:{ Exception -> 0x0d08 }
            if (r5 == 0) goto L_0x0c72
            X.1Hg r4 = r5.A00     // Catch:{ Exception -> 0x0d08 }
            X.0yC r3 = r4.A01     // Catch:{ Exception -> 0x0d08 }
            r2 = 5459(0x1553, float:7.65E-42)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ Exception -> 0x0d08 }
            boolean r1 = X.C20800yB.A01(r1, r3, r2)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0c72
            boolean r1 = r4.A01()     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0c72
            X.1He r1 = r5.A03     // Catch:{ Exception -> 0x0d08 }
            X.2p6 r1 = r1.A01()     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0c72
            int r3 = r1.ordinal()     // Catch:{ Exception -> 0x0d08 }
            r2 = 0
            r1 = 0
            if (r3 == r2) goto L_0x0c61
            r1 = 1
            if (r3 == r1) goto L_0x0c5f
            r1 = 2
            if (r3 != r1) goto L_0x0c59
            X.2q1 r1 = X.C52692q1.AI_AVAILABLE     // Catch:{ Exception -> 0x0d08 }
            goto L_0x0c61
        L_0x0c59:
            X.0jS r1 = new X.0jS     // Catch:{ Exception -> 0x0d08 }
            r1.<init>()     // Catch:{ Exception -> 0x0d08 }
            throw r1     // Catch:{ Exception -> 0x0d08 }
        L_0x0c5f:
            X.2q1 r1 = X.C52692q1.IN_WAITLIST     // Catch:{ Exception -> 0x0d08 }
        L_0x0c61:
            r10.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r10.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uP r2 = (X.C100064uP) r2     // Catch:{ Exception -> 0x0d08 }
            int r1 = r1.value     // Catch:{ Exception -> 0x0d08 }
            r2.aiWaitListState_ = r1     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 64
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
        L_0x0c72:
            X.4uR r1 = X.C100084uR.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0d08 }
            X.8NN r4 = r1.A0p()     // Catch:{ Exception -> 0x0d08 }
            X.4tt r4 = (X.C99744tt) r4     // Catch:{ Exception -> 0x0d08 }
            X.0yC r3 = r0.A0Q     // Catch:{ Exception -> 0x0d08 }
            r2 = 7279(0x1c6f, float:1.02E-41)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ Exception -> 0x0d08 }
            boolean r1 = X.C20800yB.A01(r1, r3, r2)     // Catch:{ Exception -> 0x0d08 }
            if (r1 == 0) goto L_0x0cbb
            X.1Hn r1 = r0.A04     // Catch:{ Exception -> 0x0d08 }
            X.8Qp r3 = r1.A00()     // Catch:{ Exception -> 0x0d08 }
            if (r3 == 0) goto L_0x0cf7
            X.4u2 r1 = X.C99834u2.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0d08 }
            X.8NN r2 = r1.A0p()     // Catch:{ Exception -> 0x0d08 }
            X.4tu r2 = (X.C99754tu) r2     // Catch:{ Exception -> 0x0d08 }
            X.1Hl r1 = r0.A03     // Catch:{ Exception -> 0x0d08 }
            boolean r1 = r1.A03()     // Catch:{ Exception -> 0x0d08 }
            r2.A0V(r1)     // Catch:{ Exception -> 0x0d08 }
            r2.A0U(r3)     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r1 = r2.A0R()     // Catch:{ Exception -> 0x0d08 }
            X.4u2 r1 = (X.C99834u2) r1     // Catch:{ Exception -> 0x0d08 }
            r4.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r3 = r4.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uR r3 = (X.C100084uR) r3     // Catch:{ Exception -> 0x0d08 }
            r1.getClass()     // Catch:{ Exception -> 0x0d08 }
            r3.chatLockSettings_ = r1     // Catch:{ Exception -> 0x0d08 }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r1
        L_0x0cb9:
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x0d08 }
        L_0x0cbb:
            X.8Hz r1 = r4.A0R()     // Catch:{ Exception -> 0x0d08 }
            X.4uR r1 = (X.C100084uR) r1     // Catch:{ Exception -> 0x0d08 }
            r10.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r2 = r10.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uP r2 = (X.C100064uP) r2     // Catch:{ Exception -> 0x0d08 }
            r1.getClass()     // Catch:{ Exception -> 0x0d08 }
            r2.globalSettings_ = r1     // Catch:{ Exception -> 0x0d08 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = r1 | 8
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x0d08 }
            r22 = 0
            r24 = 0
            r26 = 100
            r30 = -1
            r25 = 0
            r27 = 0
            r28 = 0
            r32 = -1
            r34 = -1
            r38 = 0
            r40 = -1
            r18 = r16
            r19 = r43
            r20 = r0
            r21 = r10
            r23 = r22
            X.C24581Cz.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r42)     // Catch:{ Exception -> 0x0d08 }
            goto L_0x0d16
        L_0x0cf7:
            r4.A0S()     // Catch:{ Exception -> 0x0d08 }
            X.8Hz r3 = r4.A00     // Catch:{ Exception -> 0x0d08 }
            X.4uR r3 = (X.C100084uR) r3     // Catch:{ Exception -> 0x0d08 }
            r1 = 0
            r3.chatLockSettings_ = r1     // Catch:{ Exception -> 0x0d08 }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x0d08 }
            r1 = -262145(0xfffffffffffbffff, float:NaN)
            r2 = r2 & r1
            goto L_0x0cb9
        L_0x0d08:
            r4 = move-exception
            X.0wN r3 = r0.A01
            r2 = 0
            java.lang.String r1 = "history-sync-send-methods/send-initial-bootstrap/exception"
            r3.A0D(r1, r2, r4)
            java.lang.String r1 = "history-sync-send-methods/send-initial-bootstrap: recent msgs error"
            com.whatsapp.util.Log.e(r1, r4)
        L_0x0d16:
            boolean r1 = X.AnonymousClass9ZV.A00(r43)
            if (r1 != 0) goto L_0x0e02
            X.1HT r2 = r0.A0G     // Catch:{ Exception -> 0x0dfc }
            r1 = 0
            java.util.ArrayList r6 = r2.A03(r1)     // Catch:{ Exception -> 0x0dfc }
            java.util.Collections.reverse(r6)     // Catch:{ Exception -> 0x0dfc }
            X.4uP r1 = X.C100064uP.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0dfc }
            X.8NN r1 = r1.A0p()     // Catch:{ Exception -> 0x0dfc }
            X.4tx r1 = (X.C99784tx) r1     // Catch:{ Exception -> 0x0dfc }
            X.5UH r2 = X.AnonymousClass5UH.INITIAL_STATUS_V3     // Catch:{ Exception -> 0x0dfc }
            r1.A0Y(r2)     // Catch:{ Exception -> 0x0dfc }
            X.0yC r4 = r0.A0Q     // Catch:{ Exception -> 0x0dfc }
            r3 = 1182(0x49e, float:1.656E-42)
            X.0yV r2 = X.C21000yV.A02     // Catch:{ Exception -> 0x0dfc }
            int r7 = X.C20800yB.A00(r2, r4, r3)     // Catch:{ Exception -> 0x0dfc }
            r5 = 0
            java.util.Iterator r9 = r6.iterator()     // Catch:{ Exception -> 0x0dfc }
        L_0x0d42:
            boolean r2 = r9.hasNext()     // Catch:{ Exception -> 0x0dfc }
            if (r2 == 0) goto L_0x0dcb
            java.lang.Object r3 = r9.next()     // Catch:{ Exception -> 0x0dfc }
            X.3T1 r3 = (X.AnonymousClass3T1) r3     // Catch:{ Exception -> 0x0dfc }
            X.5SH r2 = X.AnonymousClass5SH.FOR_COMPANION_SYNC     // Catch:{ 1Fu -> 0x0db0 }
            X.63Y r2 = X.C110955bV.A00(r2)     // Catch:{ 1Fu -> 0x0db0 }
            X.6CO r4 = r2.A00()     // Catch:{ 1Fu -> 0x0db0 }
            X.005 r2 = r0.A0Y     // Catch:{ 1Fu -> 0x0db0 }
            java.lang.Object r2 = r2.get()     // Catch:{ 1Fu -> 0x0db0 }
            X.1aZ r2 = (X.C30661aZ) r2     // Catch:{ 1Fu -> 0x0db0 }
            X.8NK r8 = r2.A01(r4, r3)     // Catch:{ 1Fu -> 0x0db0 }
            X.3Qa r2 = r3.A1J     // Catch:{ Exception -> 0x0dfc }
            boolean r2 = r2.A02     // Catch:{ Exception -> 0x0dfc }
            if (r2 != 0) goto L_0x0d87
            X.16E r2 = r0.A0H     // Catch:{ Exception -> 0x0dfc }
            boolean r2 = r2.A0J(r3)     // Catch:{ Exception -> 0x0dfc }
            if (r2 != 0) goto L_0x0d87
            r8.A0S()     // Catch:{ Exception -> 0x0dfc }
            X.8Hz r4 = r8.A00     // Catch:{ Exception -> 0x0dfc }
            X.8SU r4 = (X.AnonymousClass8SU) r4     // Catch:{ Exception -> 0x0dfc }
            X.8SU r2 = X.AnonymousClass8SU.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0dfc }
            r3 = 1
            int r2 = r4.bitField0_     // Catch:{ Exception -> 0x0dfc }
            r2 = r2 | 64
            r4.bitField0_ = r2     // Catch:{ Exception -> 0x0dfc }
            r4.ignore_ = r3     // Catch:{ Exception -> 0x0dfc }
            r8.A0R()     // Catch:{ Exception -> 0x0dfc }
        L_0x0d87:
            int r5 = r5 + 1
            r1.A0S()     // Catch:{ Exception -> 0x0dfc }
            X.8Hz r6 = r1.A00     // Catch:{ Exception -> 0x0dfc }
            X.4uP r6 = (X.C100064uP) r6     // Catch:{ Exception -> 0x0dfc }
            X.8Hz r4 = r8.A0R()     // Catch:{ Exception -> 0x0dfc }
            X.8SU r4 = (X.AnonymousClass8SU) r4     // Catch:{ Exception -> 0x0dfc }
            r4.getClass()     // Catch:{ Exception -> 0x0dfc }
            X.B6c r3 = r6.statusV3Messages_     // Catch:{ Exception -> 0x0dfc }
            r2 = r3
            X.AcE r2 = (X.C21886AcE) r2     // Catch:{ Exception -> 0x0dfc }
            boolean r2 = r2.A00     // Catch:{ Exception -> 0x0dfc }
            if (r2 != 0) goto L_0x0da8
            X.B6c r3 = X.C170918Hz.A0A(r3)     // Catch:{ Exception -> 0x0dfc }
            r6.statusV3Messages_ = r3     // Catch:{ Exception -> 0x0dfc }
        L_0x0da8:
            r3.add(r4)     // Catch:{ Exception -> 0x0dfc }
            if (r7 <= 0) goto L_0x0d42
            if (r5 < r7) goto L_0x0d42
            goto L_0x0db7
        L_0x0db0:
            r3 = move-exception
            java.lang.String r2 = "HistorySyncSendMethods/sendStatusV3Messages/invalid message"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ Exception -> 0x0dfc }
            goto L_0x0d42
        L_0x0db7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0dfc }
            r3.<init>()     // Catch:{ Exception -> 0x0dfc }
            java.lang.String r2 = "history-sync-send-methods/sendStatusV3Messages reach max status msg, count="
            r3.append(r2)     // Catch:{ Exception -> 0x0dfc }
            r3.append(r5)     // Catch:{ Exception -> 0x0dfc }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0dfc }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x0dfc }
        L_0x0dcb:
            r22 = 0
            r28 = 0
            r24 = 0
            r25 = 1
            r26 = 100
            r30 = -1
            X.8Hz r2 = r1.A00     // Catch:{ Exception -> 0x0dfc }
            X.4uP r2 = (X.C100064uP) r2     // Catch:{ Exception -> 0x0dfc }
            X.B6c r2 = r2.statusV3Messages_     // Catch:{ Exception -> 0x0dfc }
            int r2 = r2.size()     // Catch:{ Exception -> 0x0dfc }
            long r2 = (long) r2     // Catch:{ Exception -> 0x0dfc }
            r27 = 0
            r32 = -1
            r34 = -1
            r38 = 0
            r40 = -1
            r18 = r16
            r19 = r43
            r20 = r0
            r21 = r1
            r23 = r22
            r36 = r2
            X.C24581Cz.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r42)     // Catch:{ Exception -> 0x0dfc }
            goto L_0x0e02
        L_0x0dfc:
            r2 = move-exception
            java.lang.String r1 = "history-sync-send-methods/send-status-v3: error"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x0e02:
            r22 = 0
            r24 = 0
            r4 = 0
            r1 = r16
            r2 = r43
            r3 = r22
            r5 = r42
            r0.A09(r1, r2, r3, r4, r5)
            X.39H r5 = new X.39H
            r5.<init>(r2)
            r1 = r16
            r5.A00 = r1
            r1 = 1
            r5.A03 = r1
            X.17y r1 = r14.A09
            X.0yC r3 = r1.A02
            r1 = 1613(0x64d, float:2.26E-42)
            X.0yV r2 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r2, r3, r1)
            if (r1 == 0) goto L_0x0e37
            r1 = 1598(0x63e, float:2.239E-42)
            boolean r1 = X.C20800yB.A01(r2, r3, r1)
            if (r1 == 0) goto L_0x0e37
            r1 = 1
            r5.A02 = r1
        L_0x0e37:
            if (r13 == 0) goto L_0x0e54
            boolean r1 = r13.A07
            if (r1 == 0) goto L_0x0e54
            X.0yC r4 = r14.A0E
            r1 = 5417(0x1529, float:7.591E-42)
            int r3 = X.C20800yB.A00(r2, r4, r1)
            r1 = 2
            if (r3 >= r1) goto L_0x0e51
            r1 = 6646(0x19f6, float:9.313E-42)
            int r3 = X.C20800yB.A00(r2, r4, r1)
            r1 = 2
            if (r3 < r1) goto L_0x0e54
        L_0x0e51:
            r1 = 1
            r5.A01 = r1
        L_0x0e54:
            com.whatsapp.jid.DeviceJid r4 = r5.A04
            X.3I3 r3 = r5.A00
            boolean r8 = r5.A03
            boolean r7 = r5.A02
            boolean r6 = r5.A01
            X.0wQ r1 = r0.A02
            boolean r1 = r1.A0L()
            if (r1 != 0) goto L_0x0e6c
            if (r8 != 0) goto L_0x0f04
            if (r7 != 0) goto L_0x0f04
            if (r6 != 0) goto L_0x0f04
        L_0x0e6c:
            r43.toString()
            r9 = 0
            r6 = 3
            r5 = 1
            r1 = 0
            r0 = r17
            if (r0 != r6) goto L_0x0e78
            r1 = 1
        L_0x0e78:
            long r26 = r14.A00(r13, r0, r1)
            X.1Cy r4 = r14.A01
            if (r0 != r6) goto L_0x0e81
            r9 = 1
        L_0x0e81:
            r7 = 2
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r0 = -1
            r3 = r17
            if (r3 == r7) goto L_0x0ee2
            if (r13 == 0) goto L_0x0ed9
            java.lang.Integer r0 = r13.A01
            if (r0 == 0) goto L_0x0ed9
            int r2 = r0.intValue()
            if (r2 <= 0) goto L_0x0ed9
        L_0x0e97:
            long r0 = (long) r2
            long r0 = r0 * r10
        L_0x0e99:
            X.17T r2 = r14.A0A
            long r22 = r2.A01()
            r7 = 1
            int r2 = (r22 > r7 ? 1 : (r22 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0ea7
            long r22 = r22 + r7
        L_0x0ea7:
            r2 = r17
            if (r2 != r6) goto L_0x0ed6
            r2 = 2
            long r24 = r14.A00(r13, r2, r5)
            X.0yC r3 = r4.A01
            r2 = 2645(0xa55, float:3.706E-42)
            r3.A07(r2)
            r28 = -1
            r21 = 2
            r18 = r14
            r19 = r16
            r20 = r43
            r18.A01(r19, r20, r21, r22, r24, r26, r28)
        L_0x0ec4:
            r10 = r26
            r2 = r14
            r3 = r16
            r4 = r43
            r5 = r17
            r6 = r24
            r8 = r26
            r12 = r0
            r2.A01(r3, r4, r5, r6, r8, r10, r12)
            return
        L_0x0ed6:
            r24 = r22
            goto L_0x0ec4
        L_0x0ed9:
            X.0yf r1 = r4.A00
            X.0yh r0 = X.C21100yf.A1P
            int r2 = r1.A04(r0)
            goto L_0x0e97
        L_0x0ee2:
            X.0yC r7 = r4.A01
            r3 = 2645(0xa55, float:3.706E-42)
            int r8 = X.C20800yB.A00(r2, r7, r3)
            if (r9 != 0) goto L_0x0e99
            if (r13 == 0) goto L_0x0e99
            java.lang.Integer r9 = r13.A03
            if (r9 == 0) goto L_0x0e99
            r3 = -1
            if (r8 == r3) goto L_0x0e99
            int r3 = r9.intValue()
            if (r3 <= r8) goto L_0x0e99
            r3 = 2706(0xa92, float:3.792E-42)
            int r2 = X.C20800yB.A00(r2, r7, r3)
            if (r2 <= 0) goto L_0x0e99
            goto L_0x0e97
        L_0x0f04:
            X.4uP r1 = X.C100064uP.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0f45 }
            X.8NN r1 = r1.A0p()     // Catch:{ Exception -> 0x0f45 }
            X.4tx r1 = (X.C99784tx) r1     // Catch:{ Exception -> 0x0f45 }
            X.5UH r5 = X.AnonymousClass5UH.NON_BLOCKING_DATA     // Catch:{ Exception -> 0x0f45 }
            r1.A0Y(r5)     // Catch:{ Exception -> 0x0f45 }
            if (r8 == 0) goto L_0x0f16
            X.C24581Cz.A08(r0, r1)     // Catch:{ Exception -> 0x0f45 }
        L_0x0f16:
            if (r7 == 0) goto L_0x0f1b
            X.C24581Cz.A06(r0, r1)     // Catch:{ Exception -> 0x0f45 }
        L_0x0f1b:
            if (r6 == 0) goto L_0x0f20
            X.C24581Cz.A07(r0, r1)     // Catch:{ Exception -> 0x0f45 }
        L_0x0f20:
            r28 = 0
            r25 = 5
            r26 = 100
            r30 = -1
            r27 = 0
            r32 = -1
            r34 = -1
            r36 = 0
            r38 = 0
            r40 = -1
            r42 = 0
            r19 = r4
            r20 = r0
            r21 = r1
            r23 = r22
            r18 = r3
            X.C24581Cz.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r42)     // Catch:{ Exception -> 0x0f45 }
            goto L_0x0e6c
        L_0x0f45:
            r1 = move-exception
            java.lang.String r0 = "history-sync-send-methods/sendNonBlockingDataMessages: error"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0e6c
        L_0x0f4d:
            java.lang.Object r7 = r2.A00
            X.1fH r7 = (X.C33411fH) r7
            java.lang.Object r6 = r2.A01
            X.11F r6 = (X.AnonymousClass11F) r6
            java.lang.Object r5 = r2.A02
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r4 = r2.A03
            java.lang.Long r4 = (java.lang.Long) r4
            X.1fF r3 = r7.A03
            android.content.Context r1 = r7.A00
            r0 = 2131888428(0x7f12092c, float:1.9411491E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131895190(0x7f122396, float:1.9425206E38)
            java.lang.String r1 = r1.getString(r0)
            X.3YQ r0 = new X.3YQ
            r0.<init>(r7, r6, r5, r4)
            r3.B03(r2, r1, r0)
            return
        L_0x0f78:
            java.lang.Object r8 = r2.A00
            X.1PB r8 = (X.AnonymousClass1PB) r8
            java.lang.Object r0 = r2.A01
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r7 = r2.A02
            X.147 r7 = (X.AnonymousClass147) r7
            java.lang.Object r6 = r2.A03
            X.9uj r6 = (X.C207209uj) r6
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r11 = r0.iterator()
        L_0x0f90:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0fd8
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r0.getValue()
            X.C18740tg.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            X.1F8 r0 = r8.A01
            long r1 = r0.A02(r7, r1)
            r9 = -1
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0f90
            X.1A1 r0 = r8.A03
            X.175 r0 = r0.A01
            X.3T1 r3 = r0.A01(r1)
            X.2bQ r3 = (X.AnonymousClass2bQ) r3
            if (r3 == 0) goto L_0x0f90
            long r1 = r3.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0f90
            r0 = 1
            r3.A07 = r0
            r3.A01 = r4
            X.0xM r0 = r8.A00
            r0.A0k(r3)
            goto L_0x0f90
        L_0x0fd8:
            X.1C4 r0 = r8.A02
            r0.A01(r6)
            return
        L_0x0fde:
            java.lang.Object r5 = r2.A00
            X.17r r5 = (X.C232317r) r5
            java.lang.Object r4 = r2.A01
            X.144 r4 = (X.AnonymousClass144) r4
            java.lang.Object r7 = r2.A02
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r2.A03
            java.util.List r6 = (java.util.List) r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "participant-user-store/updateGroupParticipants/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " participants:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " removeParticipants:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12P r0 = r5.A06
            X.1M0 r3 = r0.A05()
            X.71s r2 = r3.B1k()     // Catch:{ all -> 0x1058 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x104e }
        L_0x1020:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x104e }
            if (r0 == 0) goto L_0x1030
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x104e }
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0     // Catch:{ all -> 0x104e }
            r5.A0N(r4, r0)     // Catch:{ all -> 0x104e }
            goto L_0x1020
        L_0x1030:
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x104e }
        L_0x1034:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x104e }
            if (r0 == 0) goto L_0x1044
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x104e }
            X.6PM r0 = (X.AnonymousClass6PM) r0     // Catch:{ all -> 0x104e }
            r5.A0H(r0, r4)     // Catch:{ all -> 0x104e }
            goto L_0x1034
        L_0x1044:
            r2.A00()     // Catch:{ all -> 0x104e }
            r2.close()     // Catch:{ all -> 0x1058 }
            r3.close()
            return
        L_0x104e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x1053 }
            goto L_0x1057
        L_0x1053:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1058 }
        L_0x1057:
            throw r1     // Catch:{ all -> 0x1058 }
        L_0x1058:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x105d }
            throw r1
        L_0x105d:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x1062:
            java.lang.Object r3 = r2.A00
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            java.lang.Object r6 = r2.A01
            X.1Kb r6 = (X.C26411Kb) r6
            java.lang.Object r4 = r2.A02
            java.lang.Object r5 = r2.A03
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            r0 = 1
            X.AnonymousClass00C.A0D(r6, r0)
            r0 = 2
            X.AnonymousClass00C.A0D(r4, r0)
            r1 = 30
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x10aa }
            r3.get(r1, r0)     // Catch:{ Exception -> 0x10aa }
            java.util.Map r2 = r6.A03
            monitor-enter(r2)
            X.18c r0 = r6.A00     // Catch:{ all -> 0x1105 }
            r0.unregisterObserver(r4)     // Catch:{ all -> 0x1105 }
            X.1Kc r0 = r6.A01     // Catch:{ all -> 0x1105 }
            r0.unregisterObserver(r4)     // Catch:{ all -> 0x1105 }
            java.lang.Object r0 = r2.remove(r5)     // Catch:{ all -> 0x1105 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x1105 }
            if (r0 == 0) goto L_0x10d9
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x1105 }
        L_0x109a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x1105 }
            if (r0 == 0) goto L_0x10d9
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x1105 }
            X.7gW r0 = (X.AnonymousClass7gW) r0     // Catch:{ all -> 0x1105 }
            r0.BXr()     // Catch:{ all -> 0x1105 }
            goto L_0x109a
        L_0x10aa:
            r1 = move-exception
            java.lang.String r0 = "Cannot fetch the identity for business!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x10db }
            java.util.Map r2 = r6.A03
            monitor-enter(r2)
            X.18c r0 = r6.A00     // Catch:{ all -> 0x1105 }
            r0.unregisterObserver(r4)     // Catch:{ all -> 0x1105 }
            X.1Kc r0 = r6.A01     // Catch:{ all -> 0x1105 }
            r0.unregisterObserver(r4)     // Catch:{ all -> 0x1105 }
            java.lang.Object r0 = r2.remove(r5)     // Catch:{ all -> 0x1105 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x1105 }
            if (r0 == 0) goto L_0x10d9
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x1105 }
        L_0x10c9:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x1105 }
            if (r0 == 0) goto L_0x10d9
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x1105 }
            X.7gW r0 = (X.AnonymousClass7gW) r0     // Catch:{ all -> 0x1105 }
            r0.BXr()     // Catch:{ all -> 0x1105 }
            goto L_0x10c9
        L_0x10d9:
            monitor-exit(r2)
            return
        L_0x10db:
            r3 = move-exception
            java.util.Map r2 = r6.A03
            monitor-enter(r2)
            X.18c r0 = r6.A00     // Catch:{ all -> 0x1105 }
            r0.unregisterObserver(r4)     // Catch:{ all -> 0x1105 }
            X.1Kc r0 = r6.A01     // Catch:{ all -> 0x1105 }
            r0.unregisterObserver(r4)     // Catch:{ all -> 0x1105 }
            java.lang.Object r0 = r2.remove(r5)     // Catch:{ all -> 0x1105 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x1105 }
            if (r0 == 0) goto L_0x12b1
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x1105 }
        L_0x10f5:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x1105 }
            if (r0 == 0) goto L_0x12b1
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x1105 }
            X.7gW r0 = (X.AnonymousClass7gW) r0     // Catch:{ all -> 0x1105 }
            r0.BXr()     // Catch:{ all -> 0x1105 }
            goto L_0x10f5
        L_0x1105:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x1108:
            java.lang.Object r5 = r2.A00
            X.1Fb r5 = (X.C25121Fb) r5
            java.lang.Object r4 = r2.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.Object r3 = r2.A02
            X.3IP r3 = (X.AnonymousClass3IP) r3
            java.lang.Object r1 = r2.A03
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 2
            X.AnonymousClass00C.A0D(r3, r0)
            r5.A00(r3, r4)
            X.1F4 r0 = r5.A00
            r0.A01(r4)
            X.0wI r0 = r5.A01
            r0.A00(r1)
            return
        L_0x112a:
            java.lang.Object r6 = r2.A00
            X.1ST r6 = (X.AnonymousClass1ST) r6
            java.lang.Object r7 = r2.A01
            X.4xN r7 = (X.C101334xN) r7
            java.lang.Object r5 = r2.A02
            X.2bU r5 = (X.AnonymousClass2bU) r5
            java.lang.Object r4 = r2.A03
            X.4xN r4 = (X.C101334xN) r4
            java.lang.String r8 = "mediadownloadmanager/queueDownload dependency express path download "
            boolean r0 = r7.A11     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            if (r0 == 0) goto L_0x1179
            X.6Fk r3 = r7.A0j     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            boolean r0 = r3 instanceof X.C104875Bu     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            if (r0 == 0) goto L_0x1179
            X.5Bu r3 = (X.C104875Bu) r3     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            boolean r0 = r3.A02     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            if (r0 == 0) goto L_0x1169
            java.lang.String r0 = "ExpressPathMediaDownloadStat/onPairedDownloadSubscribe get called more than once"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
        L_0x1151:
            r3.A0D()     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            long r0 = r3.A00     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            r9 = -1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x115f
            r3.A06()     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
        L_0x115f:
            long r2 = r5.A00     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            X.1D4 r1 = r6.A0C     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            r0 = 1
            java.lang.Float r0 = r1.A01(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            goto L_0x117f
        L_0x1169:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            r3.A01 = r0     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            long r0 = r3.A06()     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            r3.A00 = r0     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            r0 = 1
            r3.A02 = r0     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            goto L_0x1151
        L_0x1179:
            java.lang.String r0 = "MediaDownload/onPairedRegularMediaDownloadSubscribe This should only be called in express path download"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            goto L_0x115f
        L_0x117f:
            if (r0 == 0) goto L_0x1182
            goto L_0x1186
        L_0x1182:
            r0 = 300(0x12c, double:1.48E-321)
            long r2 = r2 / r0
            goto L_0x118d
        L_0x1186:
            float r1 = (float) r2     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            float r0 = r0.floatValue()     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            float r1 = r1 / r0
            long r2 = (long) r1     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
        L_0x118d:
            X.0yC r9 = r6.A0A     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            r0 = 6502(0x1966, float:9.111E-42)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            boolean r0 = X.C20800yB.A01(r1, r9, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            if (r0 == 0) goto L_0x11af
            r0 = 6575(0x19af, float:9.214E-42)
            int r1 = X.C20800yB.A00(r1, r9, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            r0 = 0
            int r1 = java.lang.Math.max(r1, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            r0 = 10000(0x2710, float:1.4013E-41)
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            long r0 = (long) r0     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
        L_0x11af:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            java.util.concurrent.FutureTask r0 = r7.A02     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            r0.get(r2, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x11eb, TimeoutException -> 0x11cf, CancellationException -> 0x11b7 }
            goto L_0x1202
        L_0x11b7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r7)
            java.lang.String r0 = " got cancellation exception, probably user manually cancel download"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x11cf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r7)
            java.lang.String r0 = " got timeout exception, skip it and start regular download"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 1
            r7.B2X(r0)
            goto L_0x1202
        L_0x11eb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r7)
            java.lang.String r0 = " got execution/interrupt exception, skip it and start regular download"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x1202:
            X.1TQ r0 = r6.A0H
            r0.A04(r4, r5)
            return
        L_0x1208:
            java.lang.Object r6 = r2.A00
            java.lang.Object r5 = r2.A01
            X.14u r5 = (X.C225314u) r5
            java.lang.Object r8 = r2.A02
            java.lang.Object r7 = r2.A03
            r5.Bnv()     // Catch:{ all -> 0x1216 }
            goto L_0x121c
        L_0x1216:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
        L_0x121c:
            X.1qm r3 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131891607(0x7f121597, float:1.9417939E38)
            r3.A0c(r0)
            r0 = 2131895087(0x7f12232f, float:1.9424997E38)
            r9 = 3
            X.3UQ r4 = new X.3UQ
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A0m(r5, r4, r0)
            r2 = 2131896389(0x7f122845, float:1.9427638E38)
            r1 = 4
            X.3Ug r0 = new X.3Ug
            r0.<init>(r8, r1)
            r3.A0l(r5, r0, r2)
            r3.A0b()
            return
        L_0x1242:
            java.lang.Object r0 = r2.A00
            X.1hq r0 = (X.C34911hq) r0
            java.lang.Object r5 = r2.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r2.A02
            X.2bV r4 = (X.AnonymousClass2bV) r4
            java.lang.Object r3 = r2.A03
            java.util.List r3 = (java.util.List) r3
            X.1hw r2 = r0.A04
            java.lang.String r1 = "CrosspostRequestSessionManager/handleNewAutoShareRecordCreationForTextStatus start text status burning"
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.005 r0 = r2.A06
            java.lang.Object r0 = r0.get()
            X.67T r0 = (X.AnonymousClass67T) r0
            r0.A00(r5, r4)
            r2.A02(r4, r3)
            return
        L_0x1269:
            java.lang.Object r3 = r2.A00
            X.1hw r3 = (X.C34971hw) r3
            java.lang.Object r4 = r2.A01
            java.lang.Object r5 = r2.A02
            java.lang.Object r6 = r2.A03
            X.0wU r0 = r3.A01
            r7 = 28
            X.1ia r2 = new X.1ia
            r2.<init>(r3, r4, r5, r6, r7)
            r0.Boy(r2)
            return
        L_0x1280:
            java.lang.Object r5 = r2.A00
            X.1hw r5 = (X.C34971hw) r5
            java.lang.Object r4 = r2.A01
            X.6DN r4 = (X.AnonymousClass6DN) r4
            java.lang.Object r3 = r2.A02
            X.6Dk r3 = (X.C128736Dk) r3
            java.lang.Object r2 = r2.A03
            X.692 r2 = (X.AnonymousClass692) r2
            java.lang.String r1 = "CrosspostRequestSessionManager/CrosspostRunnable executed"
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.C34971hw.A00(r2, r5, r4, r3)
            return
        L_0x129a:
            r3 = move-exception
            int r0 = r4.A01
            java.lang.Object r1 = r2.A01
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L_0x12b2
            r0.decrementAndGet()
            throw r3
        L_0x12b1:
            monitor-exit(r2)
        L_0x12b2:
            throw r3
        L_0x12b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Compressed folder not explicitly specified for assetType: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35371ia.run():void");
    }
}
