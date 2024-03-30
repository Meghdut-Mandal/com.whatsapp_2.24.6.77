package X;

import java.nio.ByteBuffer;

/* renamed from: X.1H7  reason: invalid class name */
public final class AnonymousClass1H7 {
    public int A00 = 0;
    public ByteBuffer A01 = null;
    public boolean A02 = true;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        return java.nio.ByteBuffer.allocate(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.nio.ByteBuffer A00(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.nio.ByteBuffer r1 = r2.A01     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000f
            int r0 = r2.A00     // Catch:{ all -> 0x002c }
            if (r3 == r0) goto L_0x000f
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)     // Catch:{ all -> 0x002c }
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            return r0
        L_0x000f:
            boolean r0 = r2.A02     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0026
            if (r1 != 0) goto L_0x001d
            r2.A00 = r3     // Catch:{ all -> 0x002c }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r3)     // Catch:{ all -> 0x002c }
            r2.A01 = r1     // Catch:{ all -> 0x002c }
        L_0x001d:
            int r0 = r2.A00     // Catch:{ all -> 0x002c }
            if (r3 != r0) goto L_0x0026
            r0 = 0
            r2.A02 = r0     // Catch:{ all -> 0x002c }
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            return r1
        L_0x0026:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)
            return r0
        L_0x002c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1H7.A00(int):java.nio.ByteBuffer");
    }

    public void A01(ByteBuffer byteBuffer) {
        synchronized (this) {
            ByteBuffer byteBuffer2 = this.A01;
            if (byteBuffer == byteBuffer2) {
                byteBuffer2.position(0);
                this.A02 = true;
            }
        }
    }
}
