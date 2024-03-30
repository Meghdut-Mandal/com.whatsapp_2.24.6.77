package X;

/* renamed from: X.10B  reason: invalid class name */
public class AnonymousClass10B {
    public static boolean A00;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(android.content.Context r9) {
        /*
            java.lang.Class<X.10B> r8 = X.AnonymousClass10B.class
            monitor-enter(r8)
            boolean r0 = A00     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "whatsappsoloader/init: already initialized"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x009d
        L_0x000e:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b2 }
            r0 = 23
            r7 = 0
            if (r1 >= r0) goto L_0x0033
            java.lang.String r1 = X.C131896Re.A02()     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "armeabi-v7a"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "x86"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0033
            X.100 r1 = X.AnonymousClass100.A00()     // Catch:{ all -> 0x00b2 }
            java.lang.String[] r0 = com.facebook.soloader.SoLoader.A09     // Catch:{ all -> 0x00b2 }
            com.facebook.soloader.SoLoader.A01(r9, r1, r0, r7)     // Catch:{ all -> 0x00b2 }
            goto L_0x0036
        L_0x0033:
            com.facebook.soloader.SoLoader.init(r9, r7)     // Catch:{ all -> 0x00b2 }
        L_0x0036:
            r3 = 1
            java.io.File r2 = r9.getFilesDir()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "decompressed/libs.spo"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00b0 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ all -> 0x00b2 }
            X.10G r5 = new X.10G     // Catch:{ all -> 0x00b2 }
            r5.<init>(r1, r0, r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = "SoLoader"
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = com.facebook.soloader.SoLoader.A08     // Catch:{ all -> 0x00b2 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r6.writeLock()     // Catch:{ all -> 0x00b2 }
            r0.lock()     // Catch:{ all -> 0x00b2 }
            boolean r0 = com.facebook.soloader.SoLoader.A03()     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x009f
            int r0 = com.facebook.soloader.SoLoader.A00()     // Catch:{ all -> 0x00a7 }
            r5.A03(r0)     // Catch:{ all -> 0x00a7 }
            X.10F[] r0 = com.facebook.soloader.SoLoader.A0C     // Catch:{ all -> 0x00a7 }
            int r0 = r0.length     // Catch:{ all -> 0x00a7 }
            int r0 = r0 + 1
            X.10F[] r2 = new X.AnonymousClass10F[r0]     // Catch:{ all -> 0x00a7 }
            r2[r7] = r5     // Catch:{ all -> 0x00a7 }
            X.10F[] r1 = com.facebook.soloader.SoLoader.A0C     // Catch:{ all -> 0x00a7 }
            X.10F[] r0 = com.facebook.soloader.SoLoader.A0C     // Catch:{ all -> 0x00a7 }
            int r0 = r0.length     // Catch:{ all -> 0x00a7 }
            java.lang.System.arraycopy(r1, r7, r2, r3, r0)     // Catch:{ all -> 0x00a7 }
            com.facebook.soloader.SoLoader.A0C = r2     // Catch:{ all -> 0x00a7 }
            java.util.concurrent.atomic.AtomicInteger r0 = com.facebook.soloader.SoLoader.A07     // Catch:{ all -> 0x00a7 }
            r0.getAndIncrement()     // Catch:{ all -> 0x00a7 }
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0094
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r1.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "Prepended to SO sources: "
            r1.append(r0)     // Catch:{ all -> 0x00a7 }
            r1.append(r5)     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a7 }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00a7 }
        L_0x0094:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r6.writeLock()     // Catch:{ all -> 0x00b2 }
            r0.unlock()     // Catch:{ all -> 0x00b2 }
            A00 = r3     // Catch:{ all -> 0x00b2 }
        L_0x009d:
            monitor-exit(r8)
            return
        L_0x009f:
            java.lang.String r1 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a7 }
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r6.writeLock()     // Catch:{ all -> 0x00b2 }
            r0.unlock()     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10B.A00(android.content.Context):void");
    }
}
