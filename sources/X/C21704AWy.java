package X;

import java.nio.ByteBuffer;

/* renamed from: X.AWy  reason: case insensitive filesystem */
public final class C21704AWy implements Runnable {
    public final /* synthetic */ C202079l0 A00;

    public C21704AWy(C202079l0 r1) {
        this.A00 = r1;
    }

    public static final void A00(ByteBuffer byteBuffer) {
        ByteBuffer duplicate;
        if (byteBuffer.position() == byteBuffer.limit()) {
            byteBuffer.limit(0);
        }
        if (byteBuffer.limit() == byteBuffer.capacity()) {
            if (byteBuffer.remaining() > byteBuffer.capacity() / 2) {
                duplicate = ByteBuffer.allocateDirect(byteBuffer.remaining());
                duplicate.put(byteBuffer);
                duplicate.flip();
            } else {
                duplicate = byteBuffer.duplicate();
            }
            byteBuffer.clear();
            byteBuffer.put(duplicate);
            byteBuffer.flip();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:63|64|65|66|67|68|69) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:13|14|15|16|17|18|70|72) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r7.limit(r7.position());
        r7.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e0, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ed, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r8 = r5.A09;
        r9 = X.AnonymousClass000.A0u();
        r9.append("buffer overflow");
        r1 = X.C165607th.A0y(r9);
        r1.append("input buffer: ");
        r1.append(r5.A0A);
        X.C36351kA.A1K(r1, r9);
        r1 = X.C165607th.A0y(r9);
        r1.append("rollover queued: ");
        r1.append(0);
        X.C36351kA.A1K(r1, r9);
        r9.append(X.AnonymousClass000.A0l(0, "rollover received: ", X.C165607th.A0y(r9)));
        r0 = X.AnonymousClass000.A0t(r9, 10);
        X.AnonymousClass00C.A08(r0);
        X.AnonymousClass6YR.A08(r8, r0);
        X.C202079l0.A02(r5, new java.io.IOException(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        X.AnonymousClass6YR.A09(r5.A09, "received", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r6.A01.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        X.C202079l0.A02(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0156, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0157, code lost:
        r4.set(false);
        X.C202079l0.A01(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015d, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x003a, B:37:0x0091] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.9l0 r5 = r10.A00
            X.9JX r6 = r5.A00
            if (r6 == 0) goto L_0x015e
            java.util.concurrent.atomic.AtomicBoolean r9 = r5.A0B
            boolean r0 = r9.get()
            if (r0 == 0) goto L_0x015e
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.A0D
            r3 = 0
            r0 = 1
            boolean r0 = r4.compareAndSet(r3, r0)
            if (r0 == 0) goto L_0x015e
            java.nio.ByteBuffer r7 = r5.A0A     // Catch:{ InterruptedIOException -> 0x014f }
            r7.mark()     // Catch:{ all -> 0x00e1 }
            X.C165597tg.A1K(r7)     // Catch:{ all -> 0x00e1 }
            int r0 = r7.capacity()     // Catch:{ all -> 0x00e1 }
            r7.limit(r0)     // Catch:{ all -> 0x00e1 }
            java.nio.channels.ReadableByteChannel r2 = r6.A01     // Catch:{ all -> 0x00e1 }
            int r1 = r2.read(r7)     // Catch:{ all -> 0x00e1 }
            int r0 = r7.position()     // Catch:{ InterruptedIOException -> 0x014f }
            r7.limit(r0)     // Catch:{ InterruptedIOException -> 0x014f }
            r7.reset()     // Catch:{ InterruptedIOException -> 0x014f }
            r0 = -1
            if (r1 != r0) goto L_0x004e
            java.lang.String r1 = r5.A09     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            java.lang.String r0 = "closed remotely"
            X.AnonymousClass6YR.A04(r1, r0)     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            r2.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            X.8xT r0 = new X.8xT     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            r0.<init>()     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            X.C202079l0.A02(r5, r0)     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            goto L_0x014f
        L_0x004e:
            X.02t r0 = r5.A04     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            if (r0 != 0) goto L_0x0059
            java.lang.String r1 = r5.A09     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            java.lang.String r0 = "received buffer is discarded! Missing receive handler"
            X.AnonymousClass6YR.A05(r1, r0)     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
        L_0x0059:
            boolean r0 = r9.get()     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            if (r0 == 0) goto L_0x006f
            boolean r0 = r7.hasRemaining()     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            if (r0 == 0) goto L_0x006f
            X.Axg r0 = r6.A00     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            if (r0 == 0) goto L_0x0073
            java.nio.ByteBuffer r8 = r0.Bw1(r7)     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            if (r8 != 0) goto L_0x0074
        L_0x006f:
            A00(r7)     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            goto L_0x00c7
        L_0x0073:
            r8 = r7
        L_0x0074:
            X.02t r2 = r5.A04     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            if (r2 == 0) goto L_0x0084
            X.9JZ r1 = r5.A05     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            X.02g r0 = r1.A01     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            r0.clear()     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            r1.A00 = r8     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            r2.invoke(r1)     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
        L_0x0084:
            A00(r7)     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            X.9JZ r0 = r5.A05     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            X.02g r1 = r0.A01     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            boolean r0 = X.C36411kG.A1a(r1)     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            if (r0 == 0) goto L_0x0059
            r7.mark()     // Catch:{ all -> 0x00d5 }
            X.C165597tg.A1K(r7)     // Catch:{ all -> 0x00d5 }
            int r0 = r7.capacity()     // Catch:{ all -> 0x00d5 }
            r7.limit(r0)     // Catch:{ all -> 0x00d5 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x00a2:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00d5 }
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch:{ all -> 0x00d5 }
            int r1 = r7.remaining()     // Catch:{ all -> 0x00d5 }
            int r0 = r2.remaining()     // Catch:{ all -> 0x00d5 }
            if (r1 < r0) goto L_0x00ce
            r7.put(r2)     // Catch:{ all -> 0x00d5 }
            goto L_0x00a2
        L_0x00bc:
            int r0 = r7.position()     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            r7.limit(r0)     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            r7.reset()     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            goto L_0x0059
        L_0x00c7:
            r4.set(r3)
            X.C202079l0.A01(r5)
            return
        L_0x00ce:
            java.lang.String r0 = "enqueued data is too large"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            int r0 = r7.position()     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            r7.limit(r0)     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            r7.reset()     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
            throw r1     // Catch:{ IOException -> 0x013f, BufferOverflowException -> 0x00ed }
        L_0x00e1:
            r1 = move-exception
            int r0 = r7.position()     // Catch:{ InterruptedIOException -> 0x014f }
            r7.limit(r0)     // Catch:{ InterruptedIOException -> 0x014f }
            r7.reset()     // Catch:{ InterruptedIOException -> 0x014f }
            throw r1     // Catch:{ InterruptedIOException -> 0x014f }
        L_0x00ed:
            r7 = move-exception
            java.lang.String r8 = r5.A09     // Catch:{ all -> 0x0156 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "buffer overflow"
            r9.append(r0)     // Catch:{ all -> 0x0156 }
            r6 = 10
            java.lang.StringBuilder r1 = X.C165607th.A0y(r9)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "input buffer: "
            r1.append(r0)     // Catch:{ all -> 0x0156 }
            java.nio.ByteBuffer r0 = r5.A0A     // Catch:{ all -> 0x0156 }
            r1.append(r0)     // Catch:{ all -> 0x0156 }
            X.C36351kA.A1K(r1, r9)     // Catch:{ all -> 0x0156 }
            java.lang.StringBuilder r1 = X.C165607th.A0y(r9)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "rollover queued: "
            r1.append(r0)     // Catch:{ all -> 0x0156 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0156 }
            r1.append(r2)     // Catch:{ all -> 0x0156 }
            X.C36351kA.A1K(r1, r9)     // Catch:{ all -> 0x0156 }
            java.lang.StringBuilder r1 = X.C165607th.A0y(r9)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "rollover received: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ all -> 0x0156 }
            r9.append(r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = X.AnonymousClass000.A0t(r9, r6)     // Catch:{ all -> 0x0156 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0156 }
            X.AnonymousClass6YR.A08(r8, r0)     // Catch:{ all -> 0x0156 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0156 }
            r0.<init>(r7)     // Catch:{ all -> 0x0156 }
            X.C202079l0.A02(r5, r0)     // Catch:{ all -> 0x0156 }
            goto L_0x014f
        L_0x013f:
            r2 = move-exception
            java.lang.String r1 = r5.A09     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "received"
            X.AnonymousClass6YR.A09(r1, r0, r2)     // Catch:{ all -> 0x0156 }
            java.nio.channels.ReadableByteChannel r0 = r6.A01     // Catch:{ all -> 0x0156 }
            r0.close()     // Catch:{ IOException -> 0x014c }
        L_0x014c:
            X.C202079l0.A02(r5, r2)     // Catch:{ all -> 0x0156 }
        L_0x014f:
            r4.set(r3)
            X.C202079l0.A01(r5)
            return
        L_0x0156:
            r0 = move-exception
            r4.set(r3)
            X.C202079l0.A01(r5)
            throw r0
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21704AWy.run():void");
    }
}
