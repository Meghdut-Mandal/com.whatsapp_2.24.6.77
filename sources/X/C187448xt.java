package X;

import java.io.InputStream;

/* renamed from: X.8xt  reason: invalid class name and case insensitive filesystem */
public class C187448xt extends InputStream {
    public C187468xv A00 = new C187468xv();
    public C22823AwY A01;

    public synchronized void mark(int i) {
        this.A00.mark(i);
    }

    public synchronized void reset() {
        this.A00.reset();
    }

    public int available() {
        return this.A00.available();
    }

    public void close() {
        this.A00.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0116, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0117, code lost:
        X.C21914Ack.A06(r8, r0.ex, (byte) 2, r0.description, r0.errorTransient);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0121, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0122, code lost:
        X.C21914Ack.A06(r8, new javax.net.ssl.SSLException(X.C165587tf.A0m(r0)), (byte) 2, (byte) 80, false);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r19, int r20, int r21) {
        /*
            r18 = this;
            r12 = r19
            r10 = r21
            r11 = r20
            if (r19 == 0) goto L_0x0175
            r9 = 0
            if (r21 == 0) goto L_0x0174
            int r1 = r20 + r21
            int r0 = r12.length
            if (r1 <= r0) goto L_0x0017
            java.lang.String r0 = "Not enough space in destination buffer."
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x0017:
            r1 = r18
            X.8xv r13 = r1.A00
            int r0 = r13.available()
            if (r0 <= 0) goto L_0x0037
            int r3 = java.lang.Math.min(r10, r0)
            int r2 = r13.read(r12, r11, r3)
            if (r2 > r3) goto L_0x0153
            int r11 = r11 + r3
            int r10 = r10 - r3
            int r9 = r9 + r3
        L_0x002e:
            int r0 = r13.available()
            if (r0 == 0) goto L_0x0174
            if (r9 < r10) goto L_0x0017
            return r9
        L_0x0037:
            X.AwY r8 = r1.A01
            X.Ack r8 = (X.C21914Ack) r8
            boolean r0 = r8.A0C
            r7 = 80
            r6 = 0
            r5 = 2
            r4 = 0
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r8.A0B
            if (r0 != 0) goto L_0x00fa
            X.ADg r1 = r8.A03
            boolean r0 = r1.A0a
            if (r0 == 0) goto L_0x00fa
            java.util.List r0 = r1.A0T
            if (r0 == 0) goto L_0x00fa
            java.util.List r0 = r1.A0U
            if (r0 == 0) goto L_0x00fa
            r1.A0Z = r6     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            X.9Pl r2 = r8.A06     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            java.lang.Boolean r1 = X.C36371kC.A0m()     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            X.8ey r0 = new X.8ey     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            r0.<init>(r1)     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            r2.A00(r0)     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            r8.A09()     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            X.ADg r1 = r8.A03     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            boolean r0 = r1.A0g     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            r16 = 0
            if (r0 != 0) goto L_0x00a3
            java.util.List r0 = r1.A0T     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            r2 = 0
        L_0x0079:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            if (r0 == 0) goto L_0x0094
            java.lang.Object r14 = r15.next()     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            X.9RQ r14 = (X.AnonymousClass9RQ) r14     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            int r0 = r14.A00     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            long r0 = (long) r0     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            long r2 = r2 + r0
            X.9Pl r1 = r8.A06     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            X.8es r0 = new X.8es     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            r0.<init>(r14)     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            r1.A00(r0)     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            goto L_0x0079
        L_0x0094:
            java.lang.Integer r14 = X.C023109s.A01     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            java.lang.String r0 = "Replayed early data len = "
            java.lang.String r0 = X.C36381kD.A0z(r0, r1, r2)     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            X.AnonymousClass6IT.A00(r14, r0)     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
        L_0x00a3:
            X.ADg r0 = r8.A03     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            java.util.List r0 = r0.A0U     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            r2 = 0
        L_0x00ad:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r14 = r15.next()     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            X.9RQ r14 = (X.AnonymousClass9RQ) r14     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            int r0 = r14.A00     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            long r0 = (long) r0     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            long r2 = r2 + r0
            X.9Pl r1 = r8.A06     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            X.8es r0 = new X.8es     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            r0.<init>(r14)     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            r1.A00(r0)     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            goto L_0x00ad
        L_0x00c8:
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f4
            java.lang.Integer r14 = X.C023109s.A01     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            java.lang.String r0 = "Spillover early data len = "
            java.lang.String r0 = X.C36381kD.A0z(r0, r1, r2)     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            X.AnonymousClass6IT.A00(r14, r0)     // Catch:{ IOException -> 0x016a, 0yt -> 0x00ea, Exception -> 0x00dc }
            goto L_0x00f4
        L_0x00dc:
            r0 = move-exception
            java.lang.Throwable r1 = X.C165587tf.A0m(r0)     // Catch:{ all -> 0x016c }
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x016c }
            r0.<init>(r1)     // Catch:{ all -> 0x016c }
            X.C21914Ack.A06(r8, r0, r5, r7, r6)     // Catch:{ all -> 0x016c }
            goto L_0x00f4
        L_0x00ea:
            r0 = move-exception
            byte r2 = r0.description     // Catch:{ all -> 0x016c }
            boolean r1 = r0.errorTransient     // Catch:{ all -> 0x016c }
            javax.net.ssl.SSLException r0 = r0.ex     // Catch:{ all -> 0x016c }
            X.C21914Ack.A06(r8, r0, r5, r2, r1)     // Catch:{ all -> 0x016c }
        L_0x00f4:
            X.ADg r0 = r8.A03
            r0.A0T = r4
            r0.A0U = r4
        L_0x00fa:
            X.ADg r0 = r8.A03     // Catch:{ 0yt -> 0x0116, Exception -> 0x0121 }
            X.9Xn r2 = r0.A0C     // Catch:{ 0yt -> 0x0116, Exception -> 0x0121 }
            monitor-enter(r2)     // Catch:{ 0yt -> 0x0116, Exception -> 0x0121 }
            X.9Eq r1 = r2.A01()     // Catch:{ all -> 0x0113 }
            monitor-exit(r2)     // Catch:{ 0yt -> 0x0116, Exception -> 0x0121 }
            r4 = r1
            boolean r0 = r1 instanceof X.AnonymousClass8f2     // Catch:{ 0yt -> 0x0116, Exception -> 0x0121 }
            if (r0 != 0) goto L_0x012e
            boolean r0 = r1 instanceof X.C178078eq     // Catch:{ 0yt -> 0x0116, Exception -> 0x0121 }
            if (r0 != 0) goto L_0x0144
            X.9Pl r0 = r8.A06     // Catch:{ 0yt -> 0x0116, Exception -> 0x0121 }
            r0.A00(r1)     // Catch:{ 0yt -> 0x0116, Exception -> 0x0121 }
            goto L_0x012e
        L_0x0113:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ 0yt -> 0x0116, Exception -> 0x0121 }
            throw r0     // Catch:{ 0yt -> 0x0116, Exception -> 0x0121 }
        L_0x0116:
            r0 = move-exception
            byte r2 = r0.description
            boolean r1 = r0.errorTransient
            javax.net.ssl.SSLException r0 = r0.ex
            X.C21914Ack.A06(r8, r0, r5, r2, r1)
            goto L_0x012e
        L_0x0121:
            r0 = move-exception
            java.lang.Throwable r1 = X.C165587tf.A0m(r0)
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r1)
            X.C21914Ack.A06(r8, r0, r5, r7, r6)
        L_0x012e:
            X.9Lr r0 = X.AnonymousClass9BJ.A0C
            java.lang.Class r1 = r0.getClass()
            X.9Pl r0 = r8.A06
            X.9KP r0 = r0.A00
            X.9Lr r0 = r0.A00
            boolean r0 = r1.isInstance(r0)
            if (r0 == 0) goto L_0x0144
            boolean r0 = r4 instanceof X.C178088er
            if (r0 == 0) goto L_0x00fa
        L_0x0144:
            boolean r0 = r4 instanceof X.C178078eq
            if (r0 == 0) goto L_0x002e
            X.C21914Ack.A03(r4, r8)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        L_0x0153:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Read returned more than requested bytes. "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " > "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x016a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x016c }
        L_0x016c:
            r1 = move-exception
            X.ADg r0 = r8.A03
            r0.A0T = r4
            r0.A0U = r4
            throw r1
        L_0x0174:
            return r9
        L_0x0175:
            java.lang.String r0 = "Buffer is null"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187448xt.read(byte[], int, int):int");
    }

    public long skip(long j) {
        return this.A00.skip(j);
    }

    public C187448xt(C22823AwY awY) {
        this.A01 = awY;
    }

    public boolean markSupported() {
        return true;
    }

    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        throw C90524aI.A0X("Buffer is null.");
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr);
        if (read > 1) {
            throw C90524aI.A0X("Read returned more than 1 byte");
        } else if (read == 1) {
            return (short) ((short) (bArr[0] & 255));
        } else {
            return -1;
        }
    }
}
