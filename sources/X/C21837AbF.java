package X;

/* renamed from: X.AbF  reason: case insensitive filesystem */
public class C21837AbF extends Thread {
    public final /* synthetic */ C209039zM A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21837AbF(C209039zM r2) {
        super("ExoPlayer:SimpleDecoder");
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (X.AnonymousClass000.A1S(r5.A00 & 4, 4) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        r6.A00 = 4 | r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (X.AnonymousClass000.A1S(r5.A00 & Integer.MIN_VALUE, Integer.MIN_VALUE) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        r6.A00 = Integer.MIN_VALUE | r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        if (X.AnonymousClass000.A1S(r5.A00 & 134217728, 134217728) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        r6.A00 = 134217728 | r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r2 = r4.A01(r5, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        if (r2 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0073, code lost:
        if (r4.A04 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        if (X.AnonymousClass000.A1S(r6.A00 & Integer.MIN_VALUE, Integer.MIN_VALUE) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0080, code lost:
        r4.A02++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        r6.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        r5.clear();
        r2 = r4.A0A;
        r1 = r4.A00;
        r4.A00 = r1 + 1;
        r2[r1] = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0096, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0099, code lost:
        r6.A00 = r4.A02;
        r4.A02 = 0;
        r4.A09.addLast(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ac, code lost:
        if ((r4 instanceof X.C1688382f) != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ae, code lost:
        r2 = new X.C1688082a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b5, code lost:
        r2 = new X.AnonymousClass82P("Unexpected decode error", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            X.9zM r4 = r8.A00
        L_0x0002:
            java.lang.Object r3 = r4.A07     // Catch:{ InterruptedException -> 0x00c7 }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x00c7 }
        L_0x0005:
            boolean r0 = r4.A05     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x0015
            java.util.ArrayDeque r0 = r4.A08     // Catch:{ all -> 0x00c4 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x001d
            int r0 = r4.A01     // Catch:{ all -> 0x00c4 }
            if (r0 <= 0) goto L_0x001d
        L_0x0015:
            boolean r0 = r4.A05     // Catch:{ all -> 0x00c4 }
            r7 = 0
            if (r0 == 0) goto L_0x0021
            monitor-exit(r3)     // Catch:{ all -> 0x00c4 }
            goto L_0x00a5
        L_0x001d:
            r3.wait()     // Catch:{ all -> 0x00c4 }
            goto L_0x0005
        L_0x0021:
            java.util.ArrayDeque r0 = r4.A08     // Catch:{ all -> 0x00c4 }
            java.lang.Object r5 = r0.removeFirst()     // Catch:{ all -> 0x00c4 }
            X.82Z r5 = (X.AnonymousClass82Z) r5     // Catch:{ all -> 0x00c4 }
            X.82X[] r2 = r4.A0B     // Catch:{ all -> 0x00c4 }
            int r1 = r4.A01     // Catch:{ all -> 0x00c4 }
            r0 = 1
            int r1 = r1 - r0
            r4.A01 = r1     // Catch:{ all -> 0x00c4 }
            r6 = r2[r1]     // Catch:{ all -> 0x00c4 }
            boolean r2 = r4.A04     // Catch:{ all -> 0x00c4 }
            r4.A04 = r7     // Catch:{ all -> 0x00c4 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c4 }
            r1 = 4
            int r0 = r5.A00     // Catch:{ InterruptedException -> 0x00c7 }
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)     // Catch:{ InterruptedException -> 0x00c7 }
            if (r0 == 0) goto L_0x004a
            int r0 = r6.A00     // Catch:{ InterruptedException -> 0x00c7 }
            r1 = r1 | r0
            r6.A00 = r1     // Catch:{ InterruptedException -> 0x00c7 }
        L_0x0048:
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x00c7 }
            goto L_0x0071
        L_0x004a:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r5.A00     // Catch:{ InterruptedException -> 0x00c7 }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)     // Catch:{ InterruptedException -> 0x00c7 }
            if (r0 == 0) goto L_0x005a
            int r0 = r6.A00     // Catch:{ InterruptedException -> 0x00c7 }
            r1 = r1 | r0
            r6.A00 = r1     // Catch:{ InterruptedException -> 0x00c7 }
        L_0x005a:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            int r0 = r5.A00     // Catch:{ InterruptedException -> 0x00c7 }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)     // Catch:{ InterruptedException -> 0x00c7 }
            if (r0 == 0) goto L_0x006a
            int r0 = r6.A00     // Catch:{ InterruptedException -> 0x00c7 }
            r1 = r1 | r0
            r6.A00 = r1     // Catch:{ InterruptedException -> 0x00c7 }
        L_0x006a:
            X.91w r2 = r4.A01(r5, r6, r2)     // Catch:{ OutOfMemoryError | RuntimeException -> 0x00a9 }
            if (r2 == 0) goto L_0x0048
            goto L_0x00b3
        L_0x0071:
            boolean r0 = r4.A04     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x0086
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r6.A00     // Catch:{ all -> 0x00a6 }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0099
            int r0 = r4.A02     // Catch:{ all -> 0x00a6 }
            int r0 = r0 + 1
            r4.A02 = r0     // Catch:{ all -> 0x00a6 }
        L_0x0086:
            r6.release()     // Catch:{ all -> 0x00a6 }
        L_0x0089:
            r5.clear()     // Catch:{ all -> 0x00a6 }
            X.82Z[] r2 = r4.A0A     // Catch:{ all -> 0x00a6 }
            int r1 = r4.A00     // Catch:{ all -> 0x00a6 }
            int r0 = r1 + 1
            r4.A00 = r0     // Catch:{ all -> 0x00a6 }
            r2[r1] = r5     // Catch:{ all -> 0x00a6 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            goto L_0x0002
        L_0x0099:
            int r0 = r4.A02     // Catch:{ all -> 0x00a6 }
            r6.A00 = r0     // Catch:{ all -> 0x00a6 }
            r4.A02 = r7     // Catch:{ all -> 0x00a6 }
            java.util.ArrayDeque r0 = r4.A09     // Catch:{ all -> 0x00a6 }
            r0.addLast(r6)     // Catch:{ all -> 0x00a6 }
            goto L_0x0089
        L_0x00a5:
            return
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            goto L_0x00c6
        L_0x00a9:
            r1 = move-exception
            boolean r0 = r4 instanceof X.C1688382f     // Catch:{ InterruptedException -> 0x00c7 }
            if (r0 == 0) goto L_0x00b5
            X.82a r2 = new X.82a     // Catch:{ InterruptedException -> 0x00c7 }
            r2.<init>(r1)     // Catch:{ InterruptedException -> 0x00c7 }
        L_0x00b3:
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x00c7 }
            goto L_0x00bd
        L_0x00b5:
            java.lang.String r0 = "Unexpected decode error"
            X.82P r2 = new X.82P     // Catch:{ InterruptedException -> 0x00c7 }
            r2.<init>(r0, r1)     // Catch:{ InterruptedException -> 0x00c7 }
            goto L_0x00b3
        L_0x00bd:
            r4.A03 = r2     // Catch:{ all -> 0x00c1 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c1 }
            return
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c1 }
            goto L_0x00c6
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c4 }
        L_0x00c6:
            throw r0     // Catch:{ InterruptedException -> 0x00c7 }
        L_0x00c7:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21837AbF.run():void");
    }
}
