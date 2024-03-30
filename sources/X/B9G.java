package X;

public class B9G implements C22877AxY {
    public Object A00;
    public final int A01;

    public B9G(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdU(X.C195139Sq r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A01
            if (r0 == 0) goto L_0x004f
            java.lang.Object r2 = r1.A00
            X.A29 r2 = (X.A29) r2
            X.AxY r1 = r2.A05
            if (r1 != 0) goto L_0x0016
            r0 = 1
            X.B9G r1 = new X.B9G
            r1.<init>(r2, r0)
            r2.A05 = r1
        L_0x0016:
            r2.Bns(r1)
            X.9Rn r3 = r2.A0K
            X.9QO r4 = r3.A00
            java.util.concurrent.locks.ReentrantLock r2 = r4.A01
            r2.lock()
            r2.lock()     // Catch:{ all -> 0x004a }
            int r0 = r4.A00     // Catch:{ all -> 0x0045 }
            r1 = 1
            r0 = r0 & 1
            if (r0 == r1) goto L_0x002d
            r1 = 0
        L_0x002d:
            r2.unlock()     // Catch:{ all -> 0x004a }
            r2.lock()     // Catch:{ all -> 0x004a }
            boolean r0 = r4.A00()     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0041
            int r0 = r4.A00     // Catch:{ all -> 0x0045 }
            r0 = r0 | 2
            r0 = r0 & -2
            r4.A00 = r0     // Catch:{ all -> 0x0045 }
        L_0x0041:
            r2.unlock()     // Catch:{ all -> 0x004a }
            goto L_0x00bb
        L_0x0045:
            r0 = move-exception
            r2.unlock()     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            r2.unlock()
            throw r0
        L_0x004f:
            java.lang.Object r3 = r1.A00
            X.A0j r3 = (X.C20952A0j) r3
            X.7eb r1 = r3.A0A
            X.B3p r2 = r3.A0L
            if (r2 == 0) goto L_0x00ee
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x00ee
            if (r1 == 0) goto L_0x00ee
            int r13 = r2.BHL()
            int r4 = r3.A04
            r0 = -1
            if (r4 == r0) goto L_0x0079
            int r3 = r3.A00
            r0 = 1
            r2 = -90
            if (r3 != r0) goto L_0x0073
            r2 = 90
        L_0x0073:
            int r0 = r13 + 360
            int r2 = r2 * r4
            int r0 = r0 + r2
            int r13 = r0 % 360
        L_0x0079:
            r9 = 0
            r2 = r18
            X.9RI[] r8 = r2.A0B
            if (r8 == 0) goto L_0x009a
            int r7 = r8.length
            X.A0k[] r9 = new X.C20953A0k[r7]
            r6 = 0
        L_0x0084:
            if (r6 >= r7) goto L_0x009a
            r0 = r8[r6]
            if (r0 == 0) goto L_0x0097
            java.nio.ByteBuffer r5 = r0.A02
            int r4 = r0.A00
            int r3 = r0.A01
            X.A0k r0 = new X.A0k
            r0.<init>(r5, r4, r3)
            r9[r6] = r0
        L_0x0097:
            int r6 = r6 + 1
            goto L_0x0084
        L_0x009a:
            byte[] r7 = r2.A09
            float[] r8 = r2.A0A
            android.util.Pair r3 = r2.A04
            java.lang.Long r5 = r2.A07
            java.lang.Float r4 = r2.A05
            java.lang.Long r6 = r2.A06
            int r10 = r2.A01
            long r14 = r2.A03
            boolean r0 = r2.A08
            int r11 = r2.A02
            int r12 = r2.A00
            X.5yt r2 = new X.5yt
            r16 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16)
            r1.BdT(r2)
            return
        L_0x00bb:
            r2.unlock()
            if (r1 == 0) goto L_0x00ee
            X.C202389lj.A00()
            X.9PG r2 = r3.A03
            if (r2 == 0) goto L_0x00d8
            java.util.concurrent.CopyOnWriteArraySet r0 = r2.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d8
            r1 = 7
            X.72q r0 = new X.72q
            r0.<init>(r2, r1)
            X.C202399lk.A00(r0)
        L_0x00d8:
            X.9VB r1 = r3.A01
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ee
            java.util.List r2 = r1.A00
            r1 = 47
            X.75C r0 = new X.75C
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r2, (int) r1)
            X.C202399lk.A00(r0)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B9G.BdU(X.9Sq):void");
    }
}
