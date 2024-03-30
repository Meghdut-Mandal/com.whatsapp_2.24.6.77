package X;

/* renamed from: X.1Mg  reason: invalid class name and case insensitive filesystem */
public abstract class C26981Mg {
    public static int A00;
    public static final Object A01 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.Intent A00(android.content.BroadcastReceiver r2, android.content.Context r3, android.content.IntentFilter r4, android.os.Handler r5, java.lang.String r6, boolean r7) {
        /*
            r0 = 0
            r1 = r3
            X.AnonymousClass00C.A0D(r3, r0)
            r3 = r4
            r4.getAction(r0)
            boolean r0 = X.C19550w8.A0A()     // Catch:{ IllegalStateException -> 0x002b }
            r4 = r6
            if (r0 == 0) goto L_0x0019
            r6 = 4
            if (r7 == 0) goto L_0x0014
            r6 = 2
        L_0x0014:
            android.content.Intent r2 = r1.registerReceiver(r2, r3, r4, r5, r6)     // Catch:{ IllegalStateException -> 0x002b }
            goto L_0x001d
        L_0x0019:
            android.content.Intent r2 = r1.registerReceiver(r2, r3, r6, r5)     // Catch:{ IllegalStateException -> 0x002b }
        L_0x001d:
            java.lang.Object r1 = A01     // Catch:{ IllegalStateException -> 0x002b }
            monitor-enter(r1)     // Catch:{ IllegalStateException -> 0x002b }
            int r0 = A00     // Catch:{ all -> 0x0028 }
            int r0 = r0 + 1
            A00 = r0     // Catch:{ all -> 0x0028 }
            monitor-exit(r1)     // Catch:{ IllegalStateException -> 0x002b }
            return r2
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IllegalStateException -> 0x002b }
            throw r0     // Catch:{ IllegalStateException -> 0x002b }
        L_0x002b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26981Mg.A00(android.content.BroadcastReceiver, android.content.Context, android.content.IntentFilter, android.os.Handler, java.lang.String, boolean):android.content.Intent");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.Intent A01(android.content.BroadcastReceiver r1, android.content.Context r2, android.content.IntentFilter r3, boolean r4) {
        /*
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            r3.getAction(r0)
            boolean r0 = X.C19550w8.A0A()     // Catch:{ IllegalStateException -> 0x0028 }
            if (r0 == 0) goto L_0x0016
            r0 = 4
            if (r4 == 0) goto L_0x0011
            r0 = 2
        L_0x0011:
            android.content.Intent r2 = r2.registerReceiver(r1, r3, r0)     // Catch:{ IllegalStateException -> 0x0028 }
            goto L_0x001a
        L_0x0016:
            android.content.Intent r2 = r2.registerReceiver(r1, r3)     // Catch:{ IllegalStateException -> 0x0028 }
        L_0x001a:
            java.lang.Object r1 = A01     // Catch:{ IllegalStateException -> 0x0028 }
            monitor-enter(r1)     // Catch:{ IllegalStateException -> 0x0028 }
            int r0 = A00     // Catch:{ all -> 0x0025 }
            int r0 = r0 + 1
            A00 = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r1)     // Catch:{ IllegalStateException -> 0x0028 }
            return r2
        L_0x0025:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IllegalStateException -> 0x0028 }
            throw r0     // Catch:{ IllegalStateException -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26981Mg.A01(android.content.BroadcastReceiver, android.content.Context, android.content.IntentFilter, boolean):android.content.Intent");
    }
}
