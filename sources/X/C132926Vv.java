package X;

/* renamed from: X.6Vv  reason: invalid class name and case insensitive filesystem */
public abstract class C132926Vv {
    public static final AnonymousClass00T A00;
    public static final AnonymousClass00T A01;

    static {
        C000800j r1 = C000800j.SYNCHRONIZED;
        A00 = C001400p.A00(r1, C153847Px.A00);
        A01 = C001400p.A00(r1, C153837Pw.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(java.util.concurrent.Future r7, int r8) {
        /*
            java.lang.String r5 = ", "
            java.lang.String r4 = "Unable to restore priority: "
            int r0 = android.os.Process.myTid()
            r6 = 1
            r3 = 0
            boolean r2 = X.C36381kD.A1U(r8, r0)
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L_0x0017
            r1 = 1
            if (r2 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = A03()
            if (r0 == 0) goto L_0x0036
            if (r1 == 0) goto L_0x0036
            int r0 = android.os.Process.myTid()
            int r1 = android.os.Process.getThreadPriority(r0)
            int r3 = android.os.Process.getThreadPriority(r8)
            r0 = r1
        L_0x002d:
            if (r1 >= r3) goto L_0x0037
            android.os.Process.setThreadPriority(r8, r0)     // Catch:{ SecurityException -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            int r0 = r0 + 1
            goto L_0x002d
        L_0x0036:
            r6 = 0
        L_0x0037:
            java.lang.Object r0 = r7.get()     // Catch:{ ExecutionException -> 0x0071, InterruptedException -> 0x0067, CancellationException -> 0x0065 }
            if (r6 == 0) goto L_0x0064
            android.os.Process.setThreadPriority(r8, r3)     // Catch:{ IllegalArgumentException -> 0x0052, SecurityException -> 0x0041 }
            goto L_0x0063
        L_0x0041:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.C90464aC.A1K(r4, r5, r0, r8, r3)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r0 = X.C90524aI.A0e(r0, r1)
            throw r0
        L_0x0052:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.C90464aC.A1K(r4, r5, r0, r8, r3)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r0 = X.C90524aI.A0e(r0, r1)
            throw r0
        L_0x0063:
            return r0
        L_0x0064:
            return r0
        L_0x0065:
            r1 = move-exception
            goto L_0x0083
        L_0x0067:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x008c }
            java.lang.RuntimeException r2 = X.C90524aI.A0e(r0, r1)     // Catch:{ all -> 0x008c }
            goto L_0x008b
        L_0x0071:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ all -> 0x008c }
            boolean r0 = r2 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x008c }
            java.lang.RuntimeException r2 = X.C90524aI.A0e(r0, r1)     // Catch:{ all -> 0x008c }
            goto L_0x008b
        L_0x0083:
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x008c }
            java.lang.RuntimeException r2 = X.C90524aI.A0e(r0, r1)     // Catch:{ all -> 0x008c }
        L_0x008b:
            throw r2     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            if (r6 == 0) goto L_0x00b5
            android.os.Process.setThreadPriority(r8, r3)     // Catch:{ IllegalArgumentException -> 0x00a4, SecurityException -> 0x0093 }
            throw r0
        L_0x0093:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.C90464aC.A1K(r4, r5, r0, r8, r3)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r0 = X.C90524aI.A0e(r0, r1)
            throw r0
        L_0x00a4:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.C90464aC.A1K(r4, r5, r0, r8, r3)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r0 = X.C90524aI.A0e(r0, r1)
            throw r0
        L_0x00b5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132926Vv.A00(java.util.concurrent.Future, int):java.lang.Object");
    }

    public static final void A02(String str) {
        if (!C112835eX.A00 && !A03()) {
            throw AnonymousClass001.A09(str);
        }
    }

    public static final void A01(Runnable runnable) {
        if (A03()) {
            runnable.run();
        } else {
            C90524aI.A0C(A00).post(runnable);
        }
    }

    public static final boolean A03() {
        return C36361kB.A1a(C90514aH.A11(), Thread.currentThread());
    }
}
